/*
Copyright (c) 2013, Intel Corporation

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
      this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
      this list of conditions and the following disclaimer in the docProvider
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
import org.eclipse.xtext.util.OnChangeEvictingCache;

import com.intel.llvm.ireditor.LLVM_IRUtils;
import com.intel.llvm.ireditor.lLVM_IR.AlignStack;
import com.intel.llvm.ireditor.lLVM_IR.AttributeGroup;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.FastMathFlag;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDecl;
import com.intel.llvm.ireditor.lLVM_IR.FunctionHeader;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValue;
import com.intel.llvm.ireditor.lLVM_IR.Instruction;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp;
import com.intel.llvm.ireditor.lLVM_IR.LocalValue;
import com.intel.llvm.ireditor.lLVM_IR.Parameter;
import com.intel.llvm.ireditor.lLVM_IR.TypeDef;
import com.intel.llvm.ireditor.lLVM_IR.util.LLVM_IRSwitch;

public class LlvmHoverProvider extends DefaultEObjectHoverProvider {
	ExtraInfoProvider extraInfoProvider = new ExtraInfoProvider();
	ThreadLocal<IRegion> hover = new ThreadLocal<IRegion>();
	OnChangeEvictingCache cache = new OnChangeEvictingCache();
	HoverDocumentationProvider docProvider = new HoverDocumentationProvider();
	HoverFirstLineProvider firstLineProvider = new HoverFirstLineProvider();
	
	private class HoverFirstLineProvider extends LLVM_IRSwitch<String> {
		@Override
		public String caseInstruction(Instruction object) {
			return textOf(object);
		}
		
		@Override
		public String caseLocalValue(LocalValue object) {
			return textOf(object);
		}
		
		@Override
		public String caseGlobalValue(GlobalValue object) {
			return textOf(object);
		}
		
		@Override
		public String caseParameter(Parameter object) {
			return textOf(object) + "<code>  </code><b>(parameter)</b>";
		}
		
		@Override
		public String caseAttributeGroup(AttributeGroup object) {
			return textOf(object);
		}
		
		@Override
		public String caseInstruction_icmp(Instruction_icmp object) {
			return "Integer comparison: <b>" +
					extraInfoProvider.getExtraInfo(object.getCondition()) + "</b>";
		}
		
		@Override
		public String caseInstruction_fcmp(Instruction_fcmp object) {
			return "Floating-point comparison: <b>" +
					extraInfoProvider.getExtraInfo(object.getCondition()) + "</b>";
		}
		
		@Override
		public String caseFunctionHeader(FunctionHeader object) {
			return (object.eContainer() instanceof FunctionDecl ? "declare " : "define ") +
					textOf(object);
		}
		
		@Override
		public String caseBasicBlock(BasicBlock object) {
			return object.getName();
		}
		
		@Override
		public String caseTypeDef(TypeDef object) {
			return textOf(object);
		}
		
		@Override
		public String caseFunctionAttribute(FunctionAttribute object) {
			String s = object.getAttribute();
			return "<b>" + s + "</b> (" + extraInfoProvider.getExtraInfoType(s) + ")";
		}
		
		@Override
		public String caseAlignStack(AlignStack object) {
			String s = "alignstack";
			return "<b>" + s + "</b> (" + extraInfoProvider.getExtraInfoType(s) + ")";
		}
		
		@Override
		public String caseFastMathFlag(FastMathFlag object) {
			String s = object.getKind();
			return "<b>" + s + "</b> (" + extraInfoProvider.getExtraInfoType(s) + ")";
		}
	}
	
	private class HoverDocumentationProvider extends LLVM_IRSwitch<String> {
		@Override
		public String caseFunctionAttribute(FunctionAttribute object) {
			return LLVM_IRUtils.encodeTextForHtml(extraInfoProvider.getExtraInfo(object.getAttribute()));
		}
		
		@Override
		public String caseAlignStack(AlignStack object) {
			return LLVM_IRUtils.encodeTextForHtml(extraInfoProvider.getExtraInfo("alignstack"));
		}
		
		@Override
		public String caseFunctionHeader(FunctionHeader object) {
			if (object.eContainer() instanceof FunctionDecl) return null;
			
			// It's a definition!
			int headerLength = firstLineProvider.caseFunctionHeader(object).length();
			String bodyText = textOf(object.eContainer()).substring(headerLength).trim();
			return "<pre>" + limit(bodyText, 50000) + "</pre>";
		}
		
		@Override
		public String caseBasicBlock(BasicBlock object) {
			return "<pre>" + limit(textOf(object).trim(), 50000) + "</pre>";
		}
		
		@Override
		public String caseFastMathFlag(FastMathFlag object) {
			return LLVM_IRUtils.encodeTextForHtml(extraInfoProvider.getExtraInfo(object.getKind()));
		}
		
	}
	
	@Override
	protected String getFirstLine(EObject o) {
		String result = firstLineProvider.doSwitch(o);
		return result != null ? result : super.getFirstLine(o);
	}
	
	@Override
	protected String getDocumentation(EObject o) {
		String result = docProvider.doSwitch(o);
		return result != null ? result : super.getDocumentation(o);
	}
	
	@Override
	protected boolean hasHover(EObject o) {
		return firstLineProvider.doSwitch(o) != null;
	}
	
	private String getFullNodeText(EObject o) {
		INode node = NodeModelUtils.getNode(o);
		if (node == null) return null;
		return node.getText();
	}
	
	private String textOf(EObject object) {
		String result = getFullNodeText(object).trim();
		if (result == null) return result;
		return LLVM_IRUtils.encodeTextForHtml(result);
	}
	
	private String limit(String s, int limit) {
		if (s.length() <= limit) return s;
		return s.substring(0, limit) + " ... [snipped]";
	}
	
}