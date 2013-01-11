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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;

import com.intel.llvm.ireditor.lLVM_IR.ArgList;
import com.intel.llvm.ireditor.lLVM_IR.Argument;
import com.intel.llvm.ireditor.lLVM_IR.Callee;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void;
import com.intel.llvm.ireditor.lLVM_IR.Type;

import com.intel.llvm.ireditor.resolvedtypes.TypeResolver;
import com.intel.llvm.ireditor.validation.LLVM_IRJavaValidator;

public class LLVM_IRQuickfixProvider extends DefaultQuickfixProvider {

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
			
			acceptor.accept(issue, "Insert " + data[i] + " conversion for " + name, newInst, "upcase.png", new IModification() {
				public void apply(IModificationContext context) throws BadLocationException {
					// Changing the name in the current instruction to refer to the new instruction:
					doc.replace(issue.getOffset(), issue.getLength(), newInstName);
					// New instruction (must come after the previous fix, because of offset change):
					doc.replace(instOffset, 0, newInst);
				}
			});
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
		
		result.add(new IssueResolution("Create function declaration", "mydescription", "upcase.png", context, new IModification() {

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

	private EObject findObject(final IXtextDocument doc, final Issue issue) {
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