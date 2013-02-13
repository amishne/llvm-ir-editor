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
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.intel.llvm.ireditor.LLVM_IRUtils;
import com.intel.llvm.ireditor.lLVM_IR.Alias;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.FunctionHeader;
import com.intel.llvm.ireditor.lLVM_IR.GlobalVariable;
import com.intel.llvm.ireditor.lLVM_IR.LocalValue;
import com.intel.llvm.ireditor.lLVM_IR.LocalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.NonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.VectorType;
import com.intel.llvm.ireditor.lLVM_IR.VoidType;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage.Literals;
import com.intel.llvm.ireditor.lLVM_IR.util.LLVM_IRSwitch;

public class LlvmSemanticHighlighter extends LLVM_IRSwitch<LLVM_IRUtils.Position> implements ISemanticHighlightingCalculator {
	
	private INode node;
	
	private LLVM_IRUtils.Position caseAnyType(EObject object) {
		return new LLVM_IRUtils.Position(node.getOffset(), node.getLength(), LlvmHighlighter.TYPE_ID);
	}
	
	@Override
	public LLVM_IRUtils.Position caseType(Type object) {
		return caseAnyType(object);
	}
	
	@Override
	public LLVM_IRUtils.Position caseVectorType(VectorType object) {
		return caseAnyType(object);
	}

	@Override
	public LLVM_IRUtils.Position caseNonVoidType(NonVoidType object) {
		return caseAnyType(object);
	}
	
	@Override
	public LLVM_IRUtils.Position caseVoidType(VoidType object) {
		return caseAnyType(object);
	}
	
	@Override
	public LLVM_IRUtils.Position caseBasicBlockRef(BasicBlockRef object) {
		return new LLVM_IRUtils.Position(node.getOffset(), node.getLength(), LlvmHighlighter.BASICBLOCK_ID);
	}
	
	@Override
	public LLVM_IRUtils.Position caseBasicBlock(BasicBlock object) {
		// The node contains the entire basic block; we just want to highlight the name, if
		// it exists.
		String name = (String) object.eGet(Literals.BASIC_BLOCK__NAME);
		if (node.getText().startsWith(name.substring(1))) {
			// It is explicitly named - so there's something to highlight
			return new LLVM_IRUtils.Position(node.getOffset(), name.length(), LlvmHighlighter.BASICBLOCK_ID);
		}
		return null;
	}
	
	@Override
	public LLVM_IRUtils.Position caseLocalValue(LocalValue object) {
		String name = (String) object.eGet(Literals.LOCAL_VALUE__NAME);
		if (node.getText().startsWith(name) == false) return null;
		return new LLVM_IRUtils.Position(node.getOffset(), name.length(), LlvmHighlighter.LOCALVALUE_ID);
	}
	
	@Override
	public LLVM_IRUtils.Position caseLocalValueRef(LocalValueRef object) {
		return new LLVM_IRUtils.Position(node.getOffset(), node.getLength(), LlvmHighlighter.LOCALVALUE_ID);
	}

	@Override
	public LLVM_IRUtils.Position caseGlobalVariable(GlobalVariable object) {
		String name = (String) object.eGet(Literals.GLOBAL_VARIABLE__NAME);
		if (node.getText().startsWith(name) == false) return null;
		return new LLVM_IRUtils.Position(node.getOffset(), name.length(), LlvmHighlighter.GLOBALVALUE_ID);
	}
	
	@Override
	public LLVM_IRUtils.Position caseAlias(Alias object) {
		String name = (String) object.eGet(Literals.ALIAS__NAME);
		if (node.getText().startsWith(name) == false) return null;
		return new LLVM_IRUtils.Position(node.getOffset(), name.length(), LlvmHighlighter.GLOBALVALUE_ID);
	}
	
	@Override
	public LLVM_IRUtils.Position caseFunctionHeader(FunctionHeader object) {
		String name = (String) object.eGet(Literals.FUNCTION_HEADER__NAME);
		if (node.getText().startsWith(name) == false) return null;
		return new LLVM_IRUtils.Position(node.getOffset(), name.length(), LlvmHighlighter.GLOBALVALUE_ID);
	}
	
	@Override
	public LLVM_IRUtils.Position caseConstant(Constant object) {
		if (object.getRef() != null) {
			return new LLVM_IRUtils.Position(node.getOffset(), node.getLength(), LlvmHighlighter.GLOBALVALUE_ID);
		}
		return super.caseConstant(object);
	}
	
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;

		INode root = resource.getParseResult().getRootNode();
		for (INode treeNode : root.getAsTreeIterable()) {
			EObject obj = NodeModelUtils.findActualSemanticObjectFor(treeNode);
			if (obj == null) continue;
			node = treeNode;
			LLVM_IRUtils.Position pos = doSwitch(obj);
			if (pos == null) continue;
			acceptor.addPosition(pos.offset, pos.length, pos.id);
		}
	}

}