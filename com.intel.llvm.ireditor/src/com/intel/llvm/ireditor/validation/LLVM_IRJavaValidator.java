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

import com.intel.llvm.ireditor.constants.ConstantResolver;
import com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.ConstantList;
import com.intel.llvm.ireditor.lLVM_IR.Function;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_add;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_extractvalue;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fadd;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fdiv;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fmul;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_frem;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fsub;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_insertvalue;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_mul;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_phi;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_ret;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_sdiv;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_select;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_srem;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_store;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_sub;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_switch;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_udiv;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_urem;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.TypedConstant;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;
import com.intel.llvm.ireditor.lLVM_IR.ValueRef;
import com.intel.llvm.ireditor.lLVM_IR.VectorConstant;
import com.intel.llvm.ireditor.names.NumberedName;
import com.intel.llvm.ireditor.types.ResolvedFloatingType;
import com.intel.llvm.ireditor.types.ResolvedIntegerType;
import com.intel.llvm.ireditor.types.ResolvedPointerType;
import com.intel.llvm.ireditor.types.ResolvedType;
import com.intel.llvm.ireditor.types.ResolvedVectorType;
import com.intel.llvm.ireditor.types.TypeResolver;
import com.intel.llvm.ireditor.validation.AbstractLLVM_IRJavaValidator;

import static com.intel.llvm.ireditor.types.TypeResolver.*;
 

public class LLVM_IRJavaValidator extends AbstractLLVM_IRJavaValidator {
	public static final String ERROR_EXPECTED_TYPE = "expected type not matched";
	private final TypeResolver typeResolver = new TypeResolver();
	private final ConstantResolver constResolver = new ConstantResolver();
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
		checkRequired(t, val.eContainingFeature(), TYPE_ANY_INTEGER);
		
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
	
	public void checkBinary(BinaryInstruction inst) {
		ResolvedType t = resolveType(inst.getType());
		checkExpected(t, inst.getOp1());
		checkExpected(t, inst.getOp2());
	}
	
	@Check
	public void checkBitwiseBinary(BitwiseBinaryInstruction inst) {
		ResolvedType t = resolveType(inst.getType());
		checkRequired(t, inst.eContainingFeature(), TYPE_ANY_INTEGER, TYPE_INTEGER_VECTOR);
		checkExpected(t, inst.getOp1());
		checkExpected(t, inst.getOp2());
	}
	
	@Check
	public void checkExtractelement(Instruction_extractelement inst) {
		checkRequired(inst.getVector().getType(), TYPE_ANY_VECTOR);
		checkRequired(inst.getIndex().getType(), TYPE_I32);
	}
	
	@Check
	public void checkInsertelement(Instruction_insertelement inst) {
		ResolvedType vectorType = resolveType(inst.getVector().getType());
		
		checkRequired(vectorType, inst.getVector().eContainingFeature(), TYPE_ANY_VECTOR);
		checkRequired(inst.getIndex().getType(), TYPE_I32);
		
		checkExpected(vectorType, inst.getElement().getType());
	}
	
	@Check
	public void checkShuffleelement(Instruction_shufflevector inst) {
		ResolvedType vector1type = resolveType(inst.getVector1().getType());
		ResolvedType vector2type = resolveType(inst.getVector2().getType());
		checkRequired(vector1type, inst.getVector1().eContainingFeature(), TYPE_ANY_VECTOR);
		checkRequired(vector2type, inst.getVector2().eContainingFeature(), TYPE_ANY_VECTOR);
		
		checkExpected(vector1type, vector2type, inst.getVector2().eContainingFeature());
	}
	
	@Check
	public void checkGetelementpointer(Instruction_getelementptr inst) {
		ResolvedType baseType = resolveType(inst.getBase().getType());
		
		if (baseType instanceof ResolvedPointerType) {
			// Regular GEP
			for (TypedValue index : inst.getIndices()) {
				// Verify the index is numeric
				checkRequired(resolveType(index.getType()), index.eContainingFeature(), TYPE_ANY_INTEGER);
			}
			
			return;
		}
		
		if (baseType instanceof ResolvedVectorType == false) {
			error("A GEP instruction base must be either a pointer or a pointer of vectors",
					inst.getBase().eContainingFeature());
			
			return;
		}

		// Pointer GEP

		// Verify it's a pointer vector
		checkRequired(baseType, LLVM_IRPackage.Literals.INSTRUCTION_GETELEMENTPTR__INDICES,
				TYPE_ANY_POINTER);

		// Verify the index list is of size 1
		if (inst.getIndices().size() != 1) {
			error("A GEP instruction with pointer vector base can receive only one index",
					LLVM_IRPackage.Literals.INSTRUCTION_GETELEMENTPTR__INDICES);
		}

		// Verify the (single) index is a vector
		ResolvedType indexType = resolveType(inst.getIndices().get(0));
		boolean isVector = checkRequired(indexType,
				LLVM_IRPackage.Literals.INSTRUCTION_GETELEMENTPTR__INDICES,
				TYPE_ANY_VECTOR);
		
		if (isVector == false) return;

		// Verify the contained type in the (single) index is numeric
		ResolvedVectorType indexVectorType = (ResolvedVectorType) indexType;
		checkRequired(indexVectorType.getContainedType(0),
				LLVM_IRPackage.Literals.INSTRUCTION_GETELEMENTPTR__INDICES,
				TYPE_ANY_INTEGER);

		// Verify the size of the (single) index is identical to the base size
		if (((ResolvedVectorType)indexType).getSize() != ((ResolvedVectorType)baseType).getSize()) {
			error("The index of a GEP instruction with pointer vector base must be the same size as the base",
					LLVM_IRPackage.Literals.INSTRUCTION_GETELEMENTPTR__INDICES);
		}

	}
	
	@Check
	public void checkExtractvalue(Instruction_extractvalue inst) {
		checkRequired(inst.getAggregate(), TYPE_ANY_ARRAY, TYPE_ANY_STRUCT);
		
		for (Constant c : inst.getIndices()) {
			checkRequired(c, TYPE_ANY_INTEGER);
		}
	}
	
	@Check
	public void checkInsertvalue(Instruction_insertvalue inst) {
		ResolvedType type = resolveType(inst.getAggregate().getType());
		checkRequired(type, inst.getAggregate().eContainingFeature(),
				TYPE_ANY_ARRAY, TYPE_ANY_STRUCT);
		
		for (Constant c : inst.getIndices()) {
			// Verify the constant is an integer
			checkRequired(c, TYPE_ANY_INTEGER);
			
			// Calculate the element type, if possible
			Integer index = constResolver.getInteger(c);
			type = index == null ? TYPE_ANY : type.getContainedType(index);
		}
		
		checkExpected(type, inst.getElement());
	}
	
	@Check
	public void checkStore(Instruction_store inst) {
		checkExpected(resolveType(inst.getPointer()).getContainedType(0), inst.getValue());
	}
	
	@Check
	public void checkCmpxchg(Instruction_cmpxchg inst) {
		ResolvedType pointer = resolveType(inst.getPointer().getType());
		checkRequired(pointer, inst.getPointer().eContainingFeature(), TYPE_ANY_POINTER);
		checkRequired(pointer.getContainedType(0), inst.eContainingFeature(), TYPE_ANY_INTEGER);
		checkExpected(pointer.getContainedType(0), inst.getComparedWith());
		checkExpected(pointer.getContainedType(0), inst.getNewValue());
		
		// There are some special requirements on the type here
		int width = pointer.getContainedType(0).getBits();
		if (width < 8) error("cmpxchg type must have at least 8 bits", inst.eContainingFeature());
		if ((width & (width-1)) != 0) error("cmpxchg type size must be a power of 2", inst.eContainingFeature());
	}
	
	@Check
	public void checkAtomicrmw(Instruction_atomicrmw inst) {
		ResolvedType pointer = resolveType(inst.getPointer().getType());
		checkRequired(pointer, inst.getPointer().eContainingFeature(), TYPE_ANY_POINTER);
		checkRequired(pointer.getContainedType(0), inst.eContainingFeature(), TYPE_ANY_INTEGER);
		checkExpected(pointer.getContainedType(0), inst.getArgument());
		
		// There are some special requirements on the type here
		int width = pointer.getContainedType(0).getBits();
		if (width < 8) error("cmpxchg type must have at least 8 bits", inst.eContainingFeature());
		if ((width & (width-1)) != 0) error("cmpxchg type size must be a power of 2", inst.eContainingFeature());
	}
	
	@Check
	public void checkIcmp(Instruction_icmp inst) {
		ResolvedType type = resolveType(inst.getType());
		checkRequired(type, inst.getType().eContainingFeature(),
				TYPE_ANY_INTEGER, TYPE_ANY_POINTER, TYPE_INTEGER_VECTOR, TYPE_POINTER_VECTOR);
		
		checkExpected(type, inst.getOp1());
		checkExpected(type, inst.getOp2());
	}
	
	@Check
	public void checkFcmp(Instruction_fcmp inst) {
		ResolvedType type = resolveType(inst.getType());
		checkRequired(type, inst.getType().eContainingFeature(), TYPE_FLOATING, TYPE_FLOATING_VECTOR);
		
		checkExpected(type, inst.getOp1());
		checkExpected(type, inst.getOp2());
	}
	
	@Check
	public void checkPhi(Instruction_phi inst) {
		ResolvedType type = resolveType(inst.getType());
		
		for (ValueRef val : inst.getValues()) {
			checkExpected(type, val);
		}
	}
	
	@Check
	public void checkSelect(Instruction_select inst) {
		// Verify types are identical
		ResolvedType type = resolveType(inst.getValue1().getType());
		checkExpected(type, inst.getValue2());
		
		// Verify condition type
		ResolvedType condType = resolveType(inst.getCondition().getType());
		if (condType instanceof ResolvedVectorType) {
			checkRequired(type, inst.eContainingFeature(), TYPE_BOOLEAN_VECTOR);
			// This is a vector select
			if (((ResolvedVectorType) condType).getSize() != ((ResolvedVectorType) type).getSize()) {
				error("select condition must be the same size as select values", inst.eContainingFeature());
			}
		} else {
			checkRequired(condType, inst.getCondition().eContainingFeature(), TYPE_BOOLEAN);
		}
	}
	
	@Check
	public void checkNumberSequence(NamedMiddleInstruction val) {
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
		checkRequired(inst.getType(), TYPE_ANY_INTEGER, TYPE_INTEGER_VECTOR);
		// General binary verification.
		checkBinary(inst);
	}
	
	private void checkFloatingBinary(BinaryInstruction inst) {
		// Add is only permitted on integers and integer vectors.
		checkRequired(inst.getType(), TYPE_FLOATING, TYPE_FLOATING_VECTOR);
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
	
	private boolean checkRequired(ResolvedType instType, EStructuralFeature feature, ResolvedType... types) {
		for (ResolvedType t : types) {
			if (instType.accepts(t)) return true;
		}
		error("Encountered " + instType + ", only allowed types are " + Arrays.toString(types), feature);
		return false;
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
		return obj == null? null : typeResolver.resolve(obj);
	}

}
