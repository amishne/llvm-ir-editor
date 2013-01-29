/*
Copyright (c) 2013, Intel Corporation

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
      this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
      this list of conditions and the following disclaimer in the documentation
      and/or other materials provided with the distribution.
    * Neither the name of Intel Corporation nor the names of its contributors
      may be used to endorse or promote products derived from this software
      without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package com.intel.llvm.ireditor.ui.quickfix;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.ui.refactoring.ui.IRenameSupport;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.intel.llvm.ireditor.ReverseNamedElementIterator;
import com.intel.llvm.ireditor.lLVM_IR.ArgList;
import com.intel.llvm.ireditor.lLVM_IR.Argument;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.Callee;
import com.intel.llvm.ireditor.lLVM_IR.FunctionBody;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void;
import com.intel.llvm.ireditor.lLVM_IR.LocalValue;
import com.intel.llvm.ireditor.lLVM_IR.LocalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Model;
import com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.TopLevelElement;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.ValueRef;
import com.intel.llvm.ireditor.names.NameResolver;
import com.intel.llvm.ireditor.names.NumberedName;

import com.intel.llvm.ireditor.types.TypeResolver;
import com.intel.llvm.ireditor.validation.LLVM_IRJavaValidator;

@SuppressWarnings("restriction")
public class LLVM_IRQuickfixProvider extends DefaultQuickfixProvider {
	
	@Inject
	private IRenameSupport.Factory renameSupportFactory;

	TypeResolver resolver = new TypeResolver();
	
	@Fix(LLVM_IRJavaValidator.ERROR_EXPECTED_TYPE)
	public void suggestConversion(final Issue issue, IssueResolutionAcceptor acceptor) throws BadLocationException {
		String[] data = issue.getData();
		if (data.length <= 2) return;
		
		IModificationContext context = getModificationContextFactory().createModificationContext(issue);
		final IXtextDocument doc = context.getXtextDocument();
		String name = doc.get(issue.getOffset(), issue.getLength());
		if (name.matches("^[%@].*") == false) return; // not a convertible variable

		final String newInstName = name.charAt(0) + "converted." + name.substring(1);

		EObject inst = findObject(doc, issue).eContainer();
		
		final int instOffset = offsetOf(inst);
		
		// Calculate preceding indentation, to preserve it for the new instruction:
		int lineOffset = doc.getLineOffset(doc.getLineOfOffset(instOffset));
		String indentation = doc.get(lineOffset, instOffset - lineOffset);
		
		for (int i = 2; i < data.length; i++) {
			final String newInst = String.format("%s = %s %s %s to %s\n%s",
					newInstName, data[i], data[1], name, data[0], indentation);
			String description = "This will insert\n" + newInst + "\nimmediately before this instruction, " +
					"and rename " + name + " to " + newInstName + " in this instruction";
			
			acceptor.accept(issue, "Insert " + data[i] + " conversion for " + name, description, "upcase.png", new IModification() {
				public void apply(IModificationContext context) throws BadLocationException {
					// Changing the name in the current instruction to refer to the new instruction:
					doc.replace(issue.getOffset(), issue.getLength(), newInstName);
					// New instruction (must come after the previous fix, because of offset change):
					doc.replace(instOffset, 0, newInst);
				}
			});
		}
	}
	
	@Fix(LLVM_IRJavaValidator.ERROR_MISSING_FUNCTION_PTR_TYPE)
	public void addMissingFunctionPtr(final Issue issue, IssueResolutionAcceptor acceptor) throws BadLocationException {
		String[] data = issue.getData();
		final String fType = data[0];
		String description = "This will add the function pointer type\n" + fType + "\nto this call.";
		acceptor.accept(issue, "Add function type", description, "upcase.png", new IModification() {
			public void apply(IModificationContext context) throws BadLocationException {
				final IXtextDocument doc = context.getXtextDocument();
				EObject object = findObject(doc, issue).eContainer();
				int offset = issue.getOffset();
				if (object instanceof Instruction_call_nonVoid) {
					offset = NodeModelUtils.findActualNodeFor(((Instruction_call_nonVoid) object).getCallee()).getOffset();
				} else if (object instanceof Instruction_call_void) {
					offset = NodeModelUtils.findActualNodeFor(((Instruction_call_void) object).getCallee()).getOffset();
				} else if (object instanceof Instruction_invoke_nonVoid) {
					offset = NodeModelUtils.findActualNodeFor(((Instruction_invoke_nonVoid) object).getCallee()).getOffset();
				} else if (object instanceof Instruction_invoke_void) {
					offset = NodeModelUtils.findActualNodeFor(((Instruction_invoke_void) object).getCallee()).getOffset();
				}
				doc.replace(offset, 0, fType + " ");
			}
		});
	}
	
	@Fix(LLVM_IRJavaValidator.ERROR_WRONG_NUMBER)
	public void suggestFixingNumbers(final Issue issue, IssueResolutionAcceptor acceptor) throws BadLocationException {
		String[] data = issue.getData();
		final String name = data[0];
		final String newName = data[1];
		
		String label = "";
		String description = "";
		
		// Suggestion 1: local rename
//		label = "Locally replace " + name + " with " + newName;
//		description = name + " will be replaced by " + newName + " in this location only.";
//		acceptor.accept(issue, label, description, "upcase.png", new IModification() {
//			public void apply(IModificationContext context) throws BadLocationException {
//				IXtextDocument doc = context.getXtextDocument();
//				doc.replace(issue.getOffset(), name.length(), newName);
//			}
//		});
		
		// Suggestion 2: rename-refactor
		label = "Rename " + name + " to " + newName;
		description = name + " will be replaced by " + newName + " here and everywhere it is used in this context.";
		acceptor.accept(issue, label, description, "upcase.png", new IModification() {
			public void apply(IModificationContext context) throws BadLocationException, InterruptedException {
				IXtextDocument doc = context.getXtextDocument();
				EObject namedInst = findObject(doc, issue);
				performSmartRenameRefactoring(doc, namedInst, name, newName);
			}
		});
		
		// Suggestion 3: rename-refactor the entire sequence
		label = "Update all names in the current sequence";
		description = label;
		acceptor.accept(issue, label, description, "upcase.png", new IModification() {
			public void apply(IModificationContext context) throws BadLocationException, InterruptedException {
				IXtextDocument doc = context.getXtextDocument();
				EObject namedInst = findObject(doc, issue);
				fixSequence(doc, namedInst);
			}
		});
	}
	
	private void fixSequence(IXtextDocument doc, EObject object) throws InterruptedException, BadLocationException {
		EObject lastInContext = getLastObjectInContext(object);
		if (lastInContext == null) return;
		Deque<EObject> toRename = new LinkedList<EObject>();
		toRename.push(lastInContext);
		ReverseNamedElementIterator iter = new ReverseNamedElementIterator(lastInContext);
		for (EObject namedElement : iter) {
			toRename.push(namedElement);
		}
		
		NameResolver namer = new NameResolver();
		int num = -1;
		
		Deque<SequenceFix> toFix = new LinkedList<SequenceFix>();
		while (toRename.isEmpty() == false) {
			EObject element = toRename.pop();
			NumberedName name = namer.resolveNumberedName(element);
			if (name == null) continue;
			
			// This is an unnamed element
			num++;
			if (name.getNumber() == num) continue;
			
			// Hack to get the directly-named element, for the rename refactoring target. 
			if (element instanceof MiddleInstruction) {
				element = ((MiddleInstruction) element).getInstruction();
			} else if (element instanceof TerminatorInstruction) {
				element = ((TerminatorInstruction) element).getInstruction();
			}
			
			String oldName = name.getPrefix() + name.getNumber();
			String newName = name.getPrefix() + num;
			toFix.addFirst(new SequenceFix(element, oldName, newName));
		}
		
		// Done in opposite insertion order, because we want to insert things from the end first,
		// to avoid messing up other offsets.
		for (SequenceFix fix : toFix) {
			performSmartRenameRefactoring(doc, fix.element, fix.oldName, fix.newName);
		}
	}
	
	private static class SequenceFix {
		public final EObject element;
		public final String oldName;
		public final String newName;
		public SequenceFix(EObject element, String oldName, String newName) {
			this.element = element;
			this.oldName = oldName;
			this.newName = newName;
		}
	}

	private EObject getLastObjectInContext(EObject object) {
		do {
			if (object instanceof Model) {
				EList<TopLevelElement> elements = ((Model) object).getElements();
				return elements.get(elements.size()-1);
			}
			if (object instanceof FunctionBody) {
				// Topmost element for a local
				EList<BasicBlock> basicBlocks = ((FunctionBody) object).getBasicBlocks();
				EList<Instruction> instructions = basicBlocks.get(basicBlocks.size()-1).getInstructions();
				return instructions.get(instructions.size()-1);
			}
			object = object.eContainer();
		} while (object != null);
		return null;
	}

	@Inject
	ResourceDescriptionsProvider resourceDescriptionsProvider;
	
	@Inject
	IContainer.Manager containerManager;

	
	public List<ValueRef> xrefs(EObject object) {
		List<ValueRef> result = new LinkedList<>();
		EObject root = EcoreUtil2.getRootContainer(object);
		
		if (object instanceof LocalValue) {
			for (LocalValueRef ref : EcoreUtil2.getAllContentsOfType(root, LocalValueRef.class)) {
				if (object == ref.getRef()) result.add(ref);
			}
		} else {
			for (GlobalValueRef ref : EcoreUtil2.getAllContentsOfType(root, GlobalValueRef.class)) {
				if (object == ref.getRef()) result.add(ref);
			}
		}
		
		return result;
	}
	
	private void performSmartRenameRefactoring(IXtextDocument doc, EObject object,
			String oldName, String newName) throws BadLocationException {
		// Rename object, if it has an explicit name already:
		INode objNode = NodeModelUtils.findActualNodeFor(object);
		if (NodeModelUtils.getTokenText(objNode).startsWith(oldName)) {
			doc.replace(objNode.getOffset(), oldName.length(), newName);
		}
		// Rename references:
		for (ValueRef ref : xrefs(object)) {
			INode refNode = NodeModelUtils.findActualNodeFor(ref);
			doc.replace(refNode.getOffset(), refNode.getLength(), newName);
		}
	}
	
	@Override
	public List<IssueResolution> getResolutionsForLinkingIssue(Issue issue) {
		List<IssueResolution> result = super.getResolutionsForLinkingIssue(issue);
		
		IModificationContext context = getModificationContextFactory().createModificationContext(issue);
		IXtextDocument doc = context.getXtextDocument();
		EObject object = findObject(doc, issue);
		if (isCallToMissing(object) == false) {
			return result;
		}
		final String declaration = buildDeclarationFromCall(object.eContainer());
		
		result.add(new IssueResolution("Create function declaration",
				"The signature\n" + declaration + "\nwill be appended to the end of the file.",
				"upcase.png", context, new IModification() {

			public void apply(IModificationContext context) throws Exception {
				IXtextDocument doc = context.getXtextDocument();
				doc.replace(doc.getLength(), 0, declaration);
			}
			
		}));
		return result;
	}

	private boolean isCallToMissing(EObject object) {
		return object instanceof GlobalValueRef &&
				(object.eContainer() instanceof Instruction_call_nonVoid
				|| object.eContainer() instanceof Instruction_call_void
				|| object.eContainer() instanceof Instruction_invoke_nonVoid
				|| object.eContainer() instanceof Instruction_invoke_void);
	}
	
	private String buildDeclarationFromCall(Callee callee, Type functionPointerType, EObject rettype, ArgList args) {
		String name = textOf(callee);
		String sig = null;
		if (functionPointerType != null) {
			// We got the whole type! :)
			sig = resolver.resolve(functionPointerType).toString().replaceFirst("\\(", name + "(");
		} else {
			// Otherwise, build it from the arguments and return type.
			StringBuilder sb = new StringBuilder();
			sb.append(resolver.resolve(rettype));
			sb.append(" ");
			sb.append(name);
			sb.append("(");
			boolean first = true;
			for (Argument a : args.getArguments()) {
				if (first == false) {
					sb.append(", ");
				}
				first = false;
				sb.append(resolver.resolve(a.getType()).toString());
			}
			sb.append(")");
			sig = sb.toString();
		}
		return "\ndeclare " + sig + "\n";
	}
	
	private String buildDeclarationFromCall(EObject inst) {
		Callee callee = null;
		Type functionPointerType = null;
		EObject rettype = null;
		ArgList args = null;
		if (inst instanceof Instruction_call_nonVoid) {
			Instruction_call_nonVoid actual = (Instruction_call_nonVoid) inst;
			callee = actual.getCallee();
			functionPointerType = actual.getFunctionPointerType();
			rettype = actual.getReturnType();
			args = actual.getArgs();
		} else if (inst instanceof Instruction_call_void) {
			Instruction_call_void actual = (Instruction_call_void) inst;
			callee = actual.getCallee();
			functionPointerType = actual.getFunctionPointerType();
			rettype = actual.getReturnType();
			args = actual.getArgs();
		} else if (inst instanceof Instruction_invoke_nonVoid) {
			Instruction_invoke_nonVoid actual = (Instruction_invoke_nonVoid) inst;
			callee = actual.getCallee();
			rettype = actual.getRettype();
			args = actual.getArgs();
		} else if (inst instanceof Instruction_invoke_void) {
			Instruction_invoke_void actual = (Instruction_invoke_void) inst;
			callee = actual.getCallee();
			rettype = actual.getRettype();
			args = actual.getArgs();
		} else {
			return null;
		}
		
		return buildDeclarationFromCall(callee, functionPointerType, rettype, args);
	}

	private EObject findObject(IXtextDocument doc, final Issue issue) {
		return doc.readOnly(new IUnitOfWork<EObject, XtextResource>() {
			public EObject exec(XtextResource state) throws Exception {
				return state.getEObject(issue.getUriToProblem().fragment());
			}
		});
	}
	
	private String textOf(EObject object) {
		return NodeModelUtils.getTokenText(NodeModelUtils.getNode(object));
	}
	
	private int offsetOf(EObject object) {
		return NodeModelUtils.getNode(object).getOffset();
	}
	
}
