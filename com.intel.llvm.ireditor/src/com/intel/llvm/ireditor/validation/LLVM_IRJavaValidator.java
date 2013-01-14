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

package com.intel.llvm.ireditor.validation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;

import com.intel.llvm.ireditor.NumberedName;
import com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.ConstantList;
import com.intel.llvm.ireditor.lLVM_IR.Function;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_add;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fadd;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fdiv;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fmul;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_frem;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fsub;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_mul;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_ret;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_sdiv;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_srem;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_sub;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_switch;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_udiv;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_urem;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.TypedConstant;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;
import com.intel.llvm.ireditor.lLVM_IR.VectorConstant;
import com.intel.llvm.ireditor.resolvedtypes.ResolvedFloatingType;
import com.intel.llvm.ireditor.resolvedtypes.ResolvedIntegerType;
import com.intel.llvm.ireditor.resolvedtypes.ResolvedPointerType;
import com.intel.llvm.ireditor.resolvedtypes.ResolvedType;
import com.intel.llvm.ireditor.resolvedtypes.TypeResolver;
import com.intel.llvm.ireditor.validation.AbstractLLVM_IRJavaValidator;
 

public class LLVM_IRJavaValidator extends AbstractLLVM_IRJavaValidator {
	public static final String ERROR_EXPECTED_TYPE = "expected type not matched";
	private final TypeResolver resolver = new TypeResolver();
	private final NameMapper mapper = new NameMapper();

	@Check
	public void checkConstantList(ConstantList val) {
		if (val.eContainer() instanceof VectorConstant) {
			// All types must be the same
			ResolvedType sameType = null;
			int i = 0;
			for (TypedConstant tc : val.getTypedConstants()) {
				if (sameType == null) sameType = resolveType(tc.getType());
				else checkExpected(sameType, resolveType(tc.getType()), tc.eContainingFeature(), i);
				i++;
			}
		}
	}
	
	@Check
	public void checkTypedConstant(TypedConstant val) {
		ResolvedType type = resolveType(val.getType());
		
		// Constant value must match its type.
		checkExpected(type, val.getValue());
		
		// Integer constant should be small enough to fit in its type.
		if (type instanceof ResolvedIntegerType) {
			checkConstantFitsInType(type, val.getValue());
		}
	}
	
	@Check
	public void checkTypedValue(TypedValue val) {
		// Value must match the type.
		checkExpected(val.getType(), val.getRef());
	}
	
	@Check
	public void checkRet(Instruction_ret val) {
		EObject f = val.eContainer().eContainer().eContainer().eContainer();
		checkExpected(((Function)f).getHeader().getRettype(), val.getVal().getType());
	}
	
	@Check
	public void checkSwitch(Instruction_switch val) {
		// Verify the condition is an integer type
		ResolvedType t = resolveType(val.getComparisonValue().getType());
		checkRequired(t, val.eContainingFeature(), TypeResolver.TYPE_ANY_INTEGER);
		
		// Verify all condition cases share the condition's type
		for (TypedValue v : val.getCaseConditions()) {
			checkExpected(t, v);
		}
	}
	
	@Check
	public void checkAdd(Instruction_add inst) {
		checkIntegerBinary(inst);
	}
	
	@Check
	public void checkFadd(Instruction_fadd inst) {
		checkFloatingBinary(inst);
	}
	
	@Check
	public void checkSub(Instruction_sub inst) {
		checkIntegerBinary(inst);
	}
	
	@Check
	public void checkFsub(Instruction_fsub inst) {
		checkFloatingBinary(inst);
	}
	
	@Check
	public void checkMul(Instruction_mul inst) {
		checkIntegerBinary(inst);
	}
	
	@Check
	public void checkFmul(Instruction_fmul inst) {
		checkFloatingBinary(inst);
	}
	
	@Check
	public void checkUdiv(Instruction_udiv inst) {
		checkIntegerBinary(inst);
	}
	
	@Check
	public void checkSdiv(Instruction_sdiv inst) {
		checkIntegerBinary(inst);
	}
	
	@Check
	public void checkFdiv(Instruction_fdiv inst) {
		checkFloatingBinary(inst);
	}
	
	@Check
	public void checkUrem(Instruction_urem inst) {
		checkIntegerBinary(inst);
	}
	
	@Check
	public void checkSrem(Instruction_srem inst) {
		checkIntegerBinary(inst);
	}
	
	@Check
	public void checkFrem(Instruction_frem inst) {
		checkFloatingBinary(inst);
	}
	
	@Check
	private void checkBinary(BinaryInstruction inst) {
		ResolvedType t = resolveType(inst.getType());
		checkExpected(t, inst.getOp1());
		checkExpected(t, inst.getOp2());
	}
	
	@Check
	private void checkBitwiseBinary(BitwiseBinaryInstruction inst) {
		ResolvedType t = resolveType(inst.getType());
		checkRequired(t, inst.eContainingFeature(), TypeResolver.TYPE_ANY_INTEGER, TypeResolver.TYPE_INTEGER_VECTOR);
		checkExpected(t, inst.getOp1());
		checkExpected(t, inst.getOp2());
	}
	
	@Check
	private void checkExtractelement(Instruction_extractelement inst) {
		checkRequired(inst.getVector().getType(), TypeResolver.TYPE_ANY_VECTOR);
		checkRequired(inst.getIndex().getType(), TypeResolver.TYPE_I32);
	}
	
	@Check
	private void checkInsertelement(Instruction_insertelement inst) {
		ResolvedType vectorType = resolveType(inst.getVector().getType());
		
		checkRequired(vectorType, inst.getVector().eContainingFeature(), TypeResolver.TYPE_ANY_VECTOR);
		checkRequired(inst.getIndex().getType(), TypeResolver.TYPE_I32);
		
		checkExpected(vectorType, inst.getElement().getType());
	}
	
	@Check
	private void checkShuffleelement(Instruction_shufflevector inst) {
		ResolvedType vector1type = resolveType(inst.getVector1().getType());
		ResolvedType vector2type = resolveType(inst.getVector2().getType());
		checkRequired(vector1type, inst.getVector1().eContainingFeature(), TypeResolver.TYPE_ANY_VECTOR);
		checkRequired(vector2type, inst.getVector2().eContainingFeature(), TypeResolver.TYPE_ANY_VECTOR);
		
		checkExpected(vector1type, vector2type, inst.getVector2().eContainingFeature());
	}
	
	@Check
	private void checkNumberSequence(NamedMiddleInstruction val) {
		// A numbered instruction must appear in proper sequence.
		String name = val.getName();
		if (name.matches("[%@]\\d+") == false) return;
		
		int num = Integer.parseInt(name.substring(1));
		
		NumberedName prevNumbered = mapper.getPrecedingNumberedObjectName(val.eContainer());
		int expected = prevNumbered != null ? prevNumbered.getNumber() + 1 : 0;
		if (num != expected) {
			error(String.format("Incorrect number in sequence: expected %s, got %s",
					"%" + expected, name), LLVM_IRPackage.Literals.NAMED_MIDDLE_INSTRUCTION.getEStructuralFeature("name"));
		}
	}
	
//	@Check
//	private void checkNumberSequence(NamedInstruction val) {
//		// A numbered instruction must appear in proper sequence.
//		String name = val.getName();
//		if (name.matches("[%@]\\d+") == false) return;
//		
//		int num = Integer.parseInt(name.substring(1));
//		
//		NumberedName prevNumbered = mapper.getPrecedingNumberedObjectName(val);
//		int expected = prevNumbered != null ? prevNumbered.getNumber() + 1 : 0;
//		if (num != expected) {
//			error(String.format("Incorrect number in sequence: expected %s, got %s",
//					"%" + expected, name), val.eContainingFeature());
//		}
//	}
	
	private void checkIntegerBinary(BinaryInstruction inst) {
		// Instruction is only permitted on integers and integer vectors.
		checkRequired(inst.getType(), TypeResolver.TYPE_ANY_INTEGER, TypeResolver.TYPE_INTEGER_VECTOR);
		// General binary verification.
		checkBinary(inst);
	}
	
	private void checkFloatingBinary(BinaryInstruction inst) {
		// Add is only permitted on integers and integer vectors.
		checkRequired(inst.getType(), TypeResolver.TYPE_FLOATING, TypeResolver.TYPE_FLOATING_VECTOR);
		// General binary verification.
		checkBinary(inst);
	}
	
	private void checkConstantFitsInType(ResolvedType type, Constant val) {
		int size = type.getBits();
		try {
			String constText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(val));
			long number = Long.parseLong(constText);
			long actual = number >= 0 ? number : 1 - number;
			if (size - 1 < 64 - Long.numberOfLeadingZeros(actual)) {
				warning("The value " + number + " won't fit inside the type " + type.toString(),
						val.eContainingFeature());
			}
		} catch (NumberFormatException e) {
			// Discard.
		}
	}
	
	private void checkRequired(EObject obj, ResolvedType... types) {
		checkRequired(resolveType(obj), obj.eContainingFeature(), types);
	}
	
	private void checkRequired(ResolvedType instType, EStructuralFeature feature, ResolvedType... types) {
		for (ResolvedType t : types) {
			if (instType.accepts(t)) return;
		}
		error("Encountered " + instType + ", only allowed types are " + Arrays.toString(types), feature);
	}
	
	private void checkExpected(EObject expected, EObject actual) {
		checkExpected(resolveType(expected), resolveType(actual), actual.eContainingFeature(), 0);
	}
	
	private void checkExpected(ResolvedType expectedType, EObject actual) {
		checkExpected(expectedType, resolveType(actual), actual.eContainingFeature(), 0);
	}
	
	private void checkExpected(ResolvedType expectedType, ResolvedType actualType, EStructuralFeature feature) {
		checkExpected(expectedType, actualType, feature, 0);
	}
	
	private void checkExpected(ResolvedType expectedType, ResolvedType actualType, EStructuralFeature feature, int index) {
		if (expectedType.accepts(actualType)) return;

		List<String> ops = getConversionOps(actualType, expectedType);
		String[] data = new String[ops.size()+2];
		data[0] = expectedType.toString();
		data[1] = actualType.toString();
		for (int i = 0; i < ops.size(); i++) {
			data[i+2] = ops.get(i);
		}
		error("Expected " + expectedType.toString() + ", found " + actualType.toString(), feature, index, ERROR_EXPECTED_TYPE, data);
	}

	private List<String> getConversionOps(ResolvedType from, ResolvedType to) {
		List<String> result = new LinkedList<String>();
		
		if (from instanceof ResolvedIntegerType) {
			if (to instanceof ResolvedIntegerType) {
				if (from.getBits() > to.getBits()) {
					result.add("trunc");
				} else {
					result.add("zext");
					result.add("sext");
				}
			} else if (to instanceof ResolvedPointerType) {
				result.add("inttoptr");
			} else if (to instanceof ResolvedFloatingType) {
				result.add("sitofp");
				result.add("uitofp");
			}
		} else if (from instanceof ResolvedFloatingType) {
			if (to instanceof ResolvedIntegerType) {
				result.add("fptoui");
				result.add("fptosi");
			} else if (to instanceof ResolvedFloatingType) {
				if (from.getBits() > to.getBits()) {
					result.add("fptrunc");
				} else {
					result.add("fpext");
				}
			}
		} else if (from instanceof ResolvedPointerType && to instanceof ResolvedIntegerType) {
			result.add("ptrtoint");
		}
		
		// If there's no other option and the types are of the same size, add the 'bitcast' option
		if (result.isEmpty() && from.getBits() == to.getBits()) result.add("bitcast");
		
		return result;
	}

	/**
	 * Given an object, return the type associated with that object.
	 * @param obj
	 * @return
	 */
	private ResolvedType resolveType(EObject obj) {
		return obj == null? null : resolver.resolve(obj);
	}

}
