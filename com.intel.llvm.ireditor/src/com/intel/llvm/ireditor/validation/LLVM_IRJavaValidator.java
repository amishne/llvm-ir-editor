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
import com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.ConstantList;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_add;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.TypedConstant;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;
import com.intel.llvm.ireditor.lLVM_IR.VectorConstant;
import com.intel.llvm.ireditor.resolvedtypes.ResolvedFloatingType;
import com.intel.llvm.ireditor.resolvedtypes.ResolvedIntegerType;
import com.intel.llvm.ireditor.resolvedtypes.ResolvedPointerType;
import com.intel.llvm.ireditor.resolvedtypes.ResolvedType;
import com.intel.llvm.ireditor.validation.AbstractLLVM_IRJavaValidator;
 

public class LLVM_IRJavaValidator extends AbstractLLVM_IRJavaValidator {
	public static final String ERROR_EXPECTED_TYPE = "expected type not matched";
	private final TypeResolver resolver = new TypeResolver();

	@Check
	public void checkConstantList(ConstantList val) {
		if (val.eContainer() instanceof VectorConstant) {
			// All types must be the same
			Type sameType = null;
			int i = 0;
			for (TypedConstant tc : val.getTypedConstants()) {
				if (sameType == null) sameType = tc.getType();
				else checkExpected(sameType, tc.getType(), tc.eContainingFeature(), i);
				i++;
			}
		}
	}
	
	@Check
	public void checkTypedConstant(TypedConstant val) {
		checkExpected(val.getType(), val.getValue());
		ResolvedType type = resolveType(val.getType());
		if (type instanceof ResolvedIntegerType) {
			checkConstantFitsInType(type, val.getValue());
		}
	}
	
	@Check
	public void checkTypedValue(TypedValue val) {
		checkExpected(val.getType(), val.getRef());
	}
	
	@Check
	public void checkAdd(Instruction_add inst) {
		checkRequired(inst.getType(), TypeResolver.TYPE_INTEGER, TypeResolver.TYPE_VECTOR);
		checkBinary(inst);
	}
	
	
	private void checkConstantFitsInType(ResolvedType type, Constant val) {
		try {
			int size = type.getBits();
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

	@Check
	private void checkBinary(BinaryInstruction val) {
		checkExpected(val.getType(), val.getOp1());
		checkExpected(val.getType(), val.getOp2());
	}
	
	private void checkRequired(EObject obj, ResolvedType... types) {
		ResolvedType instType = resolveType(obj);
		for (ResolvedType t : types) {
			if (instType.accepts(t)) return;
		}
		error("Encountered " + instType + ", only allowed types are " + Arrays.toString(types), obj.eContainingFeature());
	}
	
	private void checkExpected(EObject expected, EObject actual) {
		checkExpected(expected, actual, actual.eContainingFeature(), 0);
	}
	
	private void checkExpected(EObject expected, EObject actual, EStructuralFeature feature, int index) {
		ResolvedType expectedType = resolveType(expected);
		ResolvedType actualType = resolveType(actual);
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
