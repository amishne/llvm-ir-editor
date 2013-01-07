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
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void;

import com.intel.llvm.ireditor.resolvedtypes.ResolvedType;
import com.intel.llvm.ireditor.validation.TypeResolver;

public class LLVM_IRQuickfixProvider extends DefaultQuickfixProvider {

//	@Fix(MyJavaValidator.INVALID_NAME)
//	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
//			public void apply(IModificationContext context) throws BadLocationException {
//				IXtextDocument xtextDocument = context.getXtextDocument();
//				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
//				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
//			}
//		});
//	}
	
	@Override
	public List<IssueResolution> getResolutionsForLinkingIssue(Issue issue) {
		List<IssueResolution> result = super.getResolutionsForLinkingIssue(issue);
		
		IModificationContext context = getModificationContextFactory().createModificationContext(issue);
		IXtextDocument doc = context.getXtextDocument();
		EObject object = findObject(doc, issue);
		if (isCallToMissing(object)) {
			result.add(createFunctionDeclaration((GlobalValueRef) object, issue));
		}
		
		String name = issue.getCode();
		ResolvedType type = new TypeResolver().resolve(object);
		final String sig = type.toString().replaceFirst("\\(", name + "(");
		
		result.add(new IssueResolution("Create function declaration", "mydescription", "upcase.png", context, new IModification() {

			@Override
			public void apply(IModificationContext context) throws Exception {
				IXtextDocument doc = context.getXtextDocument();
				doc.replace(doc.getLength(), 0, "\ndeclare " + sig + "\n");
			}
			
		}));
		return result;
	}

	private IssueResolution createFunctionDeclaration(GlobalValueRef object, Issue issue) {
		String name = Pattern.compile(".*'([^'])'.*").matcher(issue.getMessage()).group(1);
		EObject container = object.eContainer();
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isCallToMissing(EObject object) {
		return object instanceof GlobalValueRef &&
				(object.eContainer() instanceof Instruction_call_nonVoid
				|| object.eContainer() instanceof Instruction_call_void
				|| object.eContainer() instanceof Instruction_invoke_nonVoid
				|| object.eContainer() instanceof Instruction_invoke_void);
	}

	private EObject findObject(final IXtextDocument doc, final Issue issue) {
		return doc.readOnly(new IUnitOfWork<EObject, XtextResource>() {
			@Override
			public EObject exec(XtextResource state) throws Exception {
				return state.getEObject(issue.getUriToProblem().fragment());
			}
		});
	}
	
}
