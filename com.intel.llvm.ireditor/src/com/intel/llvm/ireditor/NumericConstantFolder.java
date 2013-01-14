package com.intel.llvm.ireditor;

import org.eclipse.emf.ecore.EObject;

import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.SimpleConstant;
import com.intel.llvm.ireditor.lLVM_IR.TypedConstant;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;
import com.intel.llvm.ireditor.lLVM_IR.ValueRef;
import com.intel.llvm.ireditor.lLVM_IR.VectorConstant;
import com.intel.llvm.ireditor.lLVM_IR.util.LLVM_IRSwitch;

public class NumericConstantFolder extends LLVM_IRSwitch<Integer> {
	public Integer getInteger(EObject object) {
		return doSwitch(object);
	}
	
//	@Override
//	public Integer caseValueRef(ValueRef object) {
//		if (object instanceof GlobalValueRef == false) return null;
//		Constant c = ((GlobalValueRef)object).getConstant();
//		if (c == null) return null;
//		return doSwitch(c);
//	}
	
	@Override
	public Integer caseGlobalValueRef(GlobalValueRef object) {
		Constant c = object.getConstant();
		if (c == null) return null;
		return doSwitch(c);
	}
	
	@Override
	public Integer caseTypedValue(TypedValue object) {
		return doSwitch(object.getRef());
	}
	
	@Override
	public Integer caseTypedConstant(TypedConstant object) {
		return doSwitch(object.getValue());
	}

	@Override
	public Integer caseSimpleConstant(SimpleConstant object) {
		try {
			return Integer.parseInt(object.getValue());
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	@Override
	public Integer caseConstantExpression_binary(ConstantExpression_binary object) {
		Integer op1 = doSwitch(object.getOp1());
		Integer op2 = doSwitch(object.getOp2());
		if (op1 == null || op2 == null) return null;
		
		switch (object.getOpcode()) {
		case "add": return op1 + op2;
		case "sub": return op1 - op2;
		case "mul": return op1 * op2;
		case "udiv": return (int)((op1 & 0xFFFFFFFFL) / (op2 & 0xFFFFFFFFL));
		case "sdiv": return op1 / op2;
		case "shl": return op1 << op2;
		case "lshr": return op1 >>> op2;
		case "ashr": return op1 >> op2;
		case "and": return op1 & op2;
		case "or": return op1 | op2;
		case "xor": return op1 ^ op2;
		default: return null;
		}
	}
	
	@Override
	public Integer caseConstantExpression_compare(ConstantExpression_compare object) {
		Integer op1 = doSwitch(object.getOp1());
		Integer op2 = doSwitch(object.getOp2());
		if (op1 == null || op2 == null) return null;
		
		switch (object.getOpcode()) {
		case "icmp": return op1.equals(op2) ? 1 : 0;
		default: return null;
		}
	}
	
	@Override
	public Integer caseConstantExpression_convert(ConstantExpression_convert object) {
		// This could be partially implemented, but:
		// 1. There's an inherent problem here that global addresses are considered constants
		//    but are unknowable here.
		// 2. Supporting things like fptosi here means this analysis should track other kinds
		//    of constants, not just integers.
		// So there's a TODO to implement it, but it will be partial anyway.
		return null;
	}
	
	@Override
	public Integer caseConstantExpression_extractelement(ConstantExpression_extractelement object) {
		Integer index = doSwitch(object.getIndex());
		if (index == null) return null;
		
		ValueRef ref = object.getVector().getRef();
		if (ref instanceof GlobalValueRef == false) return null;
		GlobalValueRef gref = (GlobalValueRef) ref;
		Constant c = gref.getConstant();
		if (c instanceof VectorConstant == false) return null;
		VectorConstant vector = (VectorConstant) c;
		
		return doSwitch(vector.getList().getTypedConstants().get(index));
	}
	
	@Override
	public Integer caseConstantExpression_select(ConstantExpression_select object) {
		Integer cond = doSwitch(object.getCondition());
		if (cond == null) return null;
		return doSwitch(cond == 1 ? object.getOp1() : object.getOp2());
	}
	
	// TODO implement the other constant expression types
	
}
