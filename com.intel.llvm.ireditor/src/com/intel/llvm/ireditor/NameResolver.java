package com.intel.llvm.ireditor;

import org.eclipse.emf.ecore.EObject;

import com.intel.llvm.ireditor.lLVM_IR.Alias;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDecl;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDef;
import com.intel.llvm.ireditor.lLVM_IR.GlobalVariable;
import com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedMetadata;
import com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Parameter;
import com.intel.llvm.ireditor.lLVM_IR.StartingInstruction;
import com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.TypeDef;
import com.intel.llvm.ireditor.lLVM_IR.util.LLVM_IRSwitch;

public class NameResolver extends LLVM_IRSwitch<String> {
	public Name getName(EObject element) {
		String nameStr = doSwitch(element);
		return new Name(nameStr);
	}
	
	public String caseAlias(Alias object) {
		return object.getName();
	}
	
	public String caseBasicBlock(BasicBlock object) {
		return object.getName();
	}
	
	public String caseGlobalVariable(GlobalVariable object) {
		return object.getName();
	}
	
	public String caseFunctionDecl(FunctionDecl object) {
		return object.getHeader().getName();
	}
	
	public String caseFunctionDef(FunctionDef object) {
		return object.getHeader().getName();
	}
	
	public String caseNamedMetadata(NamedMetadata object) {
		return object.getName();
	}
	
	public String caseStartingInstruction(StartingInstruction object) {
		return object.getName();
	}
	
	public String caseMiddleInstruction(MiddleInstruction object) {
		EObject inner = object.getInstruction();
		if (inner instanceof NamedMiddleInstruction) return ((NamedMiddleInstruction) inner).getName();
		return null;
	}
	
	public String caseTerminatorInstruction(TerminatorInstruction object) {
		EObject inner = object.getInstruction();
		if (inner instanceof NamedTerminatorInstruction) return ((NamedTerminatorInstruction) inner).getName();
		return null;
	}
	
	public String caseParameter(Parameter object) {
		return object.getName();
	}
	
	public String caseTypeDef(TypeDef object) {
		return object.getName();
	}
}
