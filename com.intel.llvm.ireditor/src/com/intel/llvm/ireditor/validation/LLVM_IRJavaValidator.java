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
import com.intel.llvm.ireditor.validation.AbstractLLVM_IRJavaValidator;
 

public class LLVM_IRJavaValidator extends AbstractLLVM_IRJavaValidator {
	public static final String TYPE_UNKNOWN = "unknown";
	public static final String TYPE_INTEGER = "integer";
	public static final String TYPE_FLOATING = "floating-point";
	public static final String TYPE_VECTOR = "vector";
	public static final String TYPE_CSTRING = "[n x i8]";
	public static final String TYPE_ANY = "any";
	public static final String ERROR_EXPECTED_TYPE = "expected type";
	
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

		String typeStr = getTypeStr(val.getType());
		if (typeStr.matches("i\\d+")) {
			checkConstantFitsInType(typeStr, val.getValue());
		}
	}
	
	@Check
	public void checkTypedValue(TypedValue val) {
		checkExpected(val.getType(), val.getRef());
	}
	
	@Check
	public void checkAdd(Instruction_add inst) {
		checkRequired(inst.getType(), TYPE_INTEGER, TYPE_VECTOR);
		checkBinary(inst);
	}
	
	
	private void checkConstantFitsInType(String typeStr, Constant val) {
		try {
			int size = Integer.parseInt(typeStr.substring(1));
			String constText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(val));
			long number = Long.parseLong(constText);
			long actual = number >= 0 ? number : 1 - number;
			if (size - 1 < 64 - Long.numberOfLeadingZeros(actual)) {
				warning("The value " + number + " won't fit inside the type " + typeStr,
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
	
	private void checkRequired(EObject obj, String... typeStrs) {
		String instType = getTypeStr(obj);
		for (String typeStr : typeStrs) {
			if (typesMatch(instType, typeStr)) return;
		}
		error("Encountered " + instType + ", only allowed types are " + Arrays.toString(typeStrs), obj.eContainingFeature());
	}
	
	private void checkExpected(EObject expected, EObject actual) {
		checkExpected(expected, actual, actual.eContainingFeature(), 0);
	}
	
	private void checkExpected(EObject expected, EObject actual, EStructuralFeature feature, int index) {
		String expectedStr = getTypeStr(expected);
		String actualStr = getTypeStr(actual);
		if (typesMatch(expectedStr, actualStr) == false) {
			error("Expected " + expectedStr + ", found " + actualStr, feature, index, ERROR_EXPECTED_TYPE, expectedStr, actual.eGet(feature).toString());
		}
	}

	private boolean typesMatch(String expectedStr, String actualStr) {
		if (expectedStr == null || actualStr == null) return false;
		
		// Basic check is same type string:
		if (expectedStr.equals(actualStr)) return true;
		
		// Cases that we don't support are mapped to TYPE_ANY and always allowed to conform to anything:
		if (actualStr.equals(TYPE_ANY) || expectedStr.equals(TYPE_ANY)) return true;
		
		// Some literals conform to more than one type, so they are converted to a special type and so
		// we need to check that the expected type is something that matches that special type:
		if (actualStr.equals(TYPE_INTEGER)) return expectedStr.matches("i\\d+");
		if (actualStr.equals(TYPE_FLOATING)) return expectedStr.matches("half|float|double|fp128|x86_fp80|ppc_fp128");
		if (actualStr.equals(TYPE_CSTRING)) return expectedStr.matches("\\[\\d+ x i8\\]");
		if (actualStr.equals(TYPE_VECTOR)) return expectedStr.matches("<\\s*\\d+.*>");
		
		return false;
	}

	/**
	 * Given an object, return the name of the type associated with that object.
	 * @param obj
	 * @return
	 */
	private String getTypeStr(EObject obj) {
		return obj == null? null : new TypeStringSwitch().doSwitch(obj);
	}

}
