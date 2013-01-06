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

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import com.intel.llvm.ireditor.lLVM_IR.Alias;
import com.intel.llvm.ireditor.lLVM_IR.ArrayConstant;
import com.intel.llvm.ireditor.lLVM_IR.ArrayType;
import com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction;
import com.intel.llvm.ireditor.lLVM_IR.FloatingType;
import com.intel.llvm.ireditor.lLVM_IR.FunctionHeader;
import com.intel.llvm.ireditor.lLVM_IR.FunctionRef;
import com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_load;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_phi;
import com.intel.llvm.ireditor.lLVM_IR.IntType;
import com.intel.llvm.ireditor.lLVM_IR.LocalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.MetadataType;
import com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType;
import com.intel.llvm.ireditor.lLVM_IR.NonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.OpaqueType;
import com.intel.llvm.ireditor.lLVM_IR.Parameter;
import com.intel.llvm.ireditor.lLVM_IR.ParameterType;
import com.intel.llvm.ireditor.lLVM_IR.SimpleConstant;
import com.intel.llvm.ireditor.lLVM_IR.Star;
import com.intel.llvm.ireditor.lLVM_IR.StructType;
import com.intel.llvm.ireditor.lLVM_IR.StructureConstant;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.TypeDef;
import com.intel.llvm.ireditor.lLVM_IR.TypedConstant;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;
import com.intel.llvm.ireditor.lLVM_IR.VectorConstant;
import com.intel.llvm.ireditor.lLVM_IR.VectorType;
import com.intel.llvm.ireditor.lLVM_IR.VoidType;
import com.intel.llvm.ireditor.lLVM_IR.X86mmxType;
import com.intel.llvm.ireditor.lLVM_IR.util.LLVM_IRSwitch;

import static com.intel.llvm.ireditor.validation.LLVM_IRJavaValidator.*;

/**
 * Converts an EObject to a String representing its type.
 */
public class TypeStringSwitch extends LLVM_IRSwitch<String> {
	private LinkedList<TypeDef> enclosing = new LinkedList<TypeDef>();

	@Override
	public String defaultCase(EObject object) {
		// TODO change to TYPE_UNKNOWN once everything is covered?
		return TYPE_ANY;
	}
	
	@Override
	public String caseType(Type object) {
		StringBuilder sb = new StringBuilder();
		sb.append(doSwitch(object.getBaseType()));
		addStars(object.getStars(), sb);
		FunctionTypeOrPointerToFunctionTypeSuffix suffix = object.getFunctionSuffix();
		if (suffix != null) sb.append(doSwitch(suffix));
		return sb.toString();
	}
	
	@Override
	public String caseNonVoidType(NonVoidType object) {
		StringBuilder sb = new StringBuilder();
		sb.append(doSwitch(object.getBaseType()));
		addStars(object.getStars(), sb);
		FunctionTypeOrPointerToFunctionTypeSuffix suffix = object.getFunctionSuffix();
		if (suffix != null) sb.append(doSwitch(suffix));
		return sb.toString();
	}
	
	@Override
	public String caseNonLeftRecursiveType(NonLeftRecursiveType object) {
		TypeDef typeDef = object.getTypedef();
		if (typeDef != null) {
			if (enclosing.contains(typeDef)) {
				return typeDef.getName();
			}
			enclosing.push(typeDef);
			String result = doSwitch(typeDef.getType());
			enclosing.pop();
			return result;
		}
		return doSwitch(object.getType());
	}
	
	@Override
	public String caseNonLeftRecursiveNonVoidType(
			NonLeftRecursiveNonVoidType object) {
		return doSwitch((object).getType());
	}
	
	@Override
	public String caseIntType(IntType object) {
		return textOf(object);
	}
	
	@Override
	public String caseFloatingType(FloatingType object) {
		return textOf(object);
	}
	
	@Override
	public String caseX86mmxType(X86mmxType object) {
		return textOf(object);
	}
	
	@Override
	public String caseVoidType(VoidType object) {
		return "void";
	}
	
	@Override
	public String caseMetadataType(MetadataType object) {
		return textOf(object);
	}
	
	@Override
	public String caseOpaqueType(OpaqueType object) {
		return textOf(object);
	}
	
	@Override
	public String caseFunctionTypeOrPointerToFunctionTypeSuffix(
			FunctionTypeOrPointerToFunctionTypeSuffix object) {
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		if (object.getContainedTypes().isEmpty() && object.getVararg() != null) {
			sb.append("...");
		} else {
			boolean first = true;
			for (ParameterType p : object.getContainedTypes()) {
				if (first == false) sb.append(", ");
				first = false;
				sb.append(doSwitch(p.getType()));
			}
			if (object.getVararg() != null) sb.append(", ...");
		}
		sb.append(")");
		addStars(object.getStars(), sb);
		return sb.toString();
	}
	
	@Override
	public String caseVectorType(VectorType object) {
		return "<" + object.getSize() + " x " + doSwitch(object.getElemType()) + ">";
	}
	
	@Override
	public String caseArrayType(ArrayType object) {
		return "[" + object.getSize() + " x " + doSwitch(object.getElemType()) + "]";
	}
	
	@Override
	public String caseStructType(StructType object) {
		EList<Type> types = object.getTypes();
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		boolean first = true;
		for (Type t : types) {
			if (first == false) sb.append(", ");
			first = false;
			sb.append(doSwitch(t));
		}
		sb.append("}");
		return sb.toString();
	}
	
	@Override
	public String caseTypedValue(TypedValue object) {
		return doSwitch(object.getType());
	}
	
	@Override
	public String caseLocalValueRef(LocalValueRef object) {
		return doSwitch(object.getRef());
	}
	
	@Override
	public String caseGlobalValueRef(GlobalValueRef object) {
		if (object.getConstant() != null) return doSwitch(object.getConstant());
		if (object.getIntrinsic() != null) return TYPE_ANY;
		if (object.getMetadata() != null) return doSwitch(object.getMetadata());
		if (object.getRef() != null) return doSwitch(object.getRef());
		return TYPE_UNKNOWN;
	}
	
	@Override
	public String caseParameter(Parameter object) {
		return doSwitch(object.getType().getType());
	}
	
	@Override
	public String caseNamedMiddleInstruction(NamedMiddleInstruction object) {
		return doSwitch(object.getInstruction());
	}
	
	@Override
	public String caseNamedTerminatorInstruction(
			NamedTerminatorInstruction object) {
		return doSwitch(object.getInstruction());
	}
	
	@Override
	public String caseAlias(Alias object) {
		return doSwitch(object.getType());
	}
	
	@Override
	public String caseFunctionHeader(FunctionHeader object) {
		StringBuilder sb = new StringBuilder();
		sb.append(doSwitch(object.getRettype()));
		sb.append(" (");
		boolean first = true;
		for (Parameter p : object.getParameters()) {
			if (first == false) sb.append(", ");
			first = false;
			sb.append(doSwitch(p.getType()));
		}
		sb.append(")");
		return sb.toString();
	}
	
	@Override
	public String caseFunctionRef(FunctionRef object) {
		if (object.getIntrinsic() != null) return TYPE_ANY;
		return doSwitch(object.getRef()) + "*";
	}
	
	@Override
	public String caseTypedConstant(TypedConstant object) {
		return doSwitch(object.getType());
	}
	
	@Override
	public String caseSimpleConstant(SimpleConstant object) {
		String content = textOf(object);
		if (content.startsWith("c\"")) {
			return TYPE_CSTRING;
		} else if (content.matches("-?\\d+\\.\\d+(e-?\\d+)?") ||
				content.matches("0x[klmhKLMH]?[0-9a-fA-F]+")) {
			return TYPE_FLOATING;
		} else if (content.matches("-?\\d+")) {
			return TYPE_INTEGER;
		} else if (content.equals("true") || content.equals("false")) {
			return "i1";
		}
		return TYPE_UNKNOWN;
	}
	
	@Override
	public String caseVectorConstant(VectorConstant object) {
		EList<TypedConstant> values = object.getList().getTypedConstants();
		return "<" + values.size() + " x " + doSwitch(values.get(0).getType()) + ">";
	}
	
	@Override
	public String caseArrayConstant(ArrayConstant object) {
		EList<TypedConstant> values = object.getList().getTypedConstants();
		return "[" + values.size() + " x " + doSwitch(values.get(0).getType()) + "]";
	}
	
	@Override
	public String caseStructureConstant(StructureConstant object) {
		EList<TypedConstant> values = object.getList().getTypedConstants();
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		boolean first = true;
		for (TypedConstant tc : values) {
			if (first == false) sb.append(", ");
			first = false;
			sb.append(doSwitch(tc.getType()));
		}
		sb.append("}");
		return sb.toString();
	}
	
	
	@Override
	public String caseBinaryInstruction(BinaryInstruction object) {
		return doSwitch(object.getType());
	}
	
	@Override
	public String caseBitwiseBinaryInstruction(BitwiseBinaryInstruction object) {
		return doSwitch(object.getType());
	}
	
	@Override
	public String caseConversionInstruction(ConversionInstruction object) {
		return doSwitch(object.getTargetType());
	}
	
	@Override
	public String caseInstruction_alloca(Instruction_alloca object) {
		return doSwitch(object.getType()) + "*";
	}
	
	@Override
	public String caseInstruction_atomicrmw(Instruction_atomicrmw object) {
		return doSwitch(object.getArgument().getType());
	}
	
	@Override
	public String caseInstruction_phi(Instruction_phi object) {
		return doSwitch(object.getType());
	}
	
	@Override
	public String caseInstruction_load(Instruction_load object) {
		return doSwitch(object.getPointer().getType());
	}
	
	
	
//	private String extract(String t, EObject index) {
//		if (t.endsWith("*")) {
//			// Pointer
//			return t.substring(0, t.length()-1);
//		}
//		if (t.matches("<\\d+")) {
//			// Vector
//			return Pattern.compile("<\\d+ x (.*)>").matcher(t).group(1);
//		}
//	}

	private String textOf(EObject object) {
		return NodeModelUtils.getTokenText(NodeModelUtils.getNode(object));
	}
	
	private void addStars(Iterable<Star> coll, StringBuilder sb) {
		for (Star star : coll) {
			if (star.getAddressSpace() != null) sb.append(star.getAddressSpace());
			sb.append("*");
		}
	}
	
	
	
}
