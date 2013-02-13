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

package com.intel.llvm.ireditor.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;

import com.intel.llvm.ireditor.LLVM_IRUtils;
import com.intel.llvm.ireditor.lLVM_IR.FunctionHeader;

public class LlvmHoverProvider extends DefaultEObjectHoverProvider {
	DocProvider docProvider = new DocProvider();
	ThreadLocal<IRegion> hover = new ThreadLocal<IRegion>();
	
	// Sanity values for hover sizes. We don't want load load an entire 100,000-line
	// function as a hover popup.
	int THRESHOLD_FIRST_LINE = 500;
	int THRESHOLD_DOCUMENTATION = 50000;
	
	@Override
	protected XtextBrowserInformationControlInput getHoverInfo(
			EObject element, IRegion hoverRegion,
			XtextBrowserInformationControlInput previous) {
		// Remember what we're actually hovering over - for providing
		// documentation for rule fragments (e.g. function attributes)
		hover.set(hoverRegion);
		return super.getHoverInfo(element, hoverRegion, previous);
	}
	
	@Override
	protected String getFirstLine(EObject o) {
		String fulltext = getFullNodeText(o);
		String parttext = getSubNodeText(o);
		String result = fulltext.trim().split("\\r?\\n", 2)[0]; // Get first non-empty line
		if (result.length() > THRESHOLD_FIRST_LINE) {
			result = result.substring(0, THRESHOLD_FIRST_LINE) + " ... [snipped]";
		}
		if (docProvider.hasDoc(parttext)) {
			result += " (" + docProvider.getType(parttext) + ")";
		}
		return LLVM_IRUtils.encodeTextForHtml(result);
	};
	
	@Override
	protected String getDocumentation(EObject o) {
		String fulltext = (o instanceof FunctionHeader ?
				getFullNodeText(o.eContainer()) :
				getFullNodeText(o)).trim();
		String parttext = getSubNodeText(o).trim();
		
		if (docProvider.hasDoc(parttext)) {
			// This element has built-in documentation, return it
			return "<b>" + LLVM_IRUtils.encodeTextForHtml(docProvider.getDoc(parttext)) + "</b>";
		}
		
		if (fulltext.contains("\n")) {
			// The full text has multiple lines, return it all as a documentation
			// (but constraint the length, in case it's some huge function)
			String result = LLVM_IRUtils.encodeCodeForHtml(
					fulltext.split("\\r?\\n", 2)[1]);
			if (result.length() > THRESHOLD_DOCUMENTATION) {
				result = result.substring(0, THRESHOLD_DOCUMENTATION) + " ... [snipped]";
			}
			return result;
		}
		
		return super.getDocumentation(o);
	}
	
	private String getSubNodeText(EObject o) {
		INode node = NodeModelUtils.getNode(o);
		if (node == null) return null;
		String fulltext = node.getRootNode().getText();
		return fulltext.substring(hover.get().getOffset(),
				hover.get().getOffset() + hover.get().getLength());
	}
	
	private String getFullNodeText(EObject o) {
		INode node = NodeModelUtils.getNode(o);
		if (node == null) return null;
		return node.getText();
	}
	
	@Override
	protected boolean hasHover(EObject o) {
		return docProvider.hasDoc(getSubNodeText(o)) || super.hasHover(o);
	}
	
}