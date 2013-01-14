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

package com.intel.llvm.ireditor.resolvedtypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import com.intel.llvm.ireditor.lLVM_IR.Alias;
import com.intel.llvm.ireditor.lLVM_IR.ArrayConstant;
import com.intel.llvm.ireditor.lLVM_IR.ArrayType;
import com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction;
import com.intel.llvm.ireditor.lLVM_IR.FloatingType;
import com.intel.llvm.ireditor.lLVM_IR.FunctionHeader;
import com.intel.llvm.ireditor.lLVM_IR.FunctionRef;
import com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_load;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_phi;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector;
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
import com.intel.llvm.ireditor.lLVM_IR.ValueRef;
import com.intel.llvm.ireditor.lLVM_IR.VectorConstant;
import com.intel.llvm.ireditor.lLVM_IR.VectorType;
import com.intel.llvm.ireditor.lLVM_IR.VoidType;
import com.intel.llvm.ireditor.lLVM_IR.X86mmxType;
import com.intel.llvm.ireditor.lLVM_IR.util.LLVM_IRSwitch;

/**
 * Converts an EObject to a String representing its type.
 */
public class TypeResolver extends LLVM_IRSwitch<ResolvedType> {
	private final LinkedList<TypeDef> enclosing = new LinkedList<TypeDef>();
	
	private static final Map<String, ResolvedType> SIMPLE_TYPES = new HashMap<String, ResolvedType>();
	private static final ResolvedUnknownType TYPE_UNKNOWN = new ResolvedUnknownType();
	private static final ResolvedVarargType TYPE_VARARG = new ResolvedVarargType();
	private static final ResolvedAnyType TYPE_ANY = new ResolvedAnyType();
	private static final ResolvedStringType TYPE_CSTRING = new ResolvedStringType();
	public static final ResolvedAnyFloatingType TYPE_FLOATING = new ResolvedAnyFloatingType();
	private static final ResolvedIntegerType TYPE_BOOLEAN = new ResolvedIntegerType(1);
	private static final ResolvedMetadataType TYPE_METADATA = new ResolvedMetadataType();
	private static final ResolvedOpaqueType TYPE_OPAQUE = new ResolvedOpaqueType();
	public static final ResolvedAnyIntegerType TYPE_ANY_INTEGER = new ResolvedAnyIntegerType();
	public static final ResolvedAnyVectorType TYPE_ANY_VECTOR = new ResolvedAnyVectorType();
	public static final ResolvedAnyTypedVectorType TYPE_INTEGER_VECTOR = new ResolvedAnyTypedVectorType(TYPE_ANY_INTEGER);
	public static final ResolvedAnyTypedVectorType TYPE_FLOATING_VECTOR = new ResolvedAnyTypedVectorType(TYPE_FLOATING);
	public static final ResolvedIntegerType TYPE_I32 = new ResolvedIntegerType(32);

	static {
		SIMPLE_TYPES.put("void", new ResolvedVoidType());
		SIMPLE_TYPES.put("half", new ResolvedFloatingType("half", 16));
		SIMPLE_TYPES.put("float", new ResolvedFloatingType("float", 32));
		SIMPLE_TYPES.put("double", new ResolvedFloatingType("double", 64));
		SIMPLE_TYPES.put("fp128", new ResolvedFloatingType("fp128", 128));
		SIMPLE_TYPES.put("x86_fp80", new ResolvedFloatingType("half", 80));
		SIMPLE_TYPES.put("ppc_fp128", new ResolvedFloatingType("half", 128));
	}
	
	public ResolvedType resolve(EObject object) {
		return doSwitch(object);
	}
	
	
	public ResolvedType defaultCase(EObject object) {
		// TODO change to TYPE_UNKNOWN once everything is covered?
		return TYPE_ANY;
	}
	
	@Override
	public ResolvedType caseType(Type object) {
		ResolvedType result = resolve(object.getBaseType());
		buildPointersTo(result, object.getStars());
		FunctionTypeOrPointerToFunctionTypeSuffix suffix = object.getFunctionSuffix();
		return suffix == null? result : buildTypeFromSuffix(result, suffix);
	}
	
	@Override
	public ResolvedType caseNonVoidType(NonVoidType object) {
		ResolvedType result = resolve(object.getBaseType());
		buildPointersTo(result, object.getStars());
		FunctionTypeOrPointerToFunctionTypeSuffix suffix = object.getFunctionSuffix();
		return suffix == null? result : buildTypeFromSuffix(result, suffix);
	}
	
	@Override
	public ResolvedType caseNonLeftRecursiveType(NonLeftRecursiveType object) {
		TypeDef typeDef = object.getTypedef();
		if (typeDef != null) {
			if (enclosing.contains(typeDef)) {
				return new ResolvedTypeReference(typeDef.getName());
			}
			enclosing.push(typeDef);
			ResolvedType result = resolve(typeDef.getType());
			enclosing.pop();
			return result;
		}
		return resolve(object.getType());
	}
	
	@Override
	public ResolvedType caseNonLeftRecursiveNonVoidType(NonLeftRecursiveNonVoidType object) {
		return resolve(object.getType());
	}
	
	@Override
	public ResolvedType caseParameterType(ParameterType object) {
		return resolve(object.getType());
	}
	
	@Override
	public ResolvedIntegerType caseIntType(IntType object) {
		int bits = atoi(textOf(object).substring(1));
		return new ResolvedIntegerType(bits);
	}
	
	@Override
	public ResolvedFloatingType caseFloatingType(FloatingType object) {
		return (ResolvedFloatingType) getSimpleType(textOf(object));
	}
	
	@Override
	public ResolvedFloatingType caseX86mmxType(X86mmxType object) {
		return (ResolvedFloatingType) getSimpleType(textOf(object));
	}
	
	@Override
	public ResolvedVoidType caseVoidType(VoidType object) {
		return (ResolvedVoidType) getSimpleType(textOf(object));
	}
	
	@Override
	public ResolvedMetadataType caseMetadataType(MetadataType object) {
		return TYPE_METADATA;
	}
	
	@Override
	public ResolvedOpaqueType caseOpaqueType(OpaqueType object) {
		return TYPE_OPAQUE;
	}
	
	@Override
	public ResolvedVectorType caseVectorType(VectorType object) {
		return new ResolvedVectorType(atoi(object.getSize()), resolve(object.getElemType()));
	}
	
	@Override
	public ResolvedArrayType caseArrayType(ArrayType object) {
		return new ResolvedArrayType(atoi(object.getSize()), resolve(object.getElemType()));
	}
	
	@Override
	public ResolvedStructType caseStructType(StructType object) {
		EList<Type> types = object.getTypes();
		List<ResolvedType> resolvedTypes = new ArrayList<ResolvedType>(types.size());
		for (Type t : types) {
			resolvedTypes.add(resolve(t));
		}
		return new ResolvedStructType(resolvedTypes, object.getPacked() != null);
	}
	
	@Override
	public ResolvedType caseTypedValue(TypedValue object) {
		return resolve(object.getType());
	}
	
	@Override
	public ResolvedType caseLocalValueRef(LocalValueRef object) {
		return resolve(object.getRef());
	}
	
	@Override
	public ResolvedType caseGlobalValueRef(GlobalValueRef object) {
		if (object.getConstant() != null) return resolve(object.getConstant());
		if (object.getMetadata() != null) return resolve(object.getMetadata());
		if (object.getRef() != null) return resolve(object.getRef());
		return TYPE_UNKNOWN;
	}
	
	@Override
	public ResolvedType caseParameter(Parameter object) {
		return resolve(object.getType().getType());
	}
	
	@Override
	public ResolvedType caseNamedMiddleInstruction(NamedMiddleInstruction object) {
		return resolve(object.getInstruction());
	}
	
	@Override
	public ResolvedType caseNamedTerminatorInstruction(NamedTerminatorInstruction object) {
		return resolve(object.getInstruction());
	}
	
	@Override
	public ResolvedType caseAlias(Alias object) {
		return resolve(object.getType());
	}
	
	@Override
	public ResolvedFunctionType caseFunctionHeader(FunctionHeader object) {
		ResolvedType rettype = resolve(object.getRettype());
		List<ResolvedType> paramTypes = new LinkedList<ResolvedType>();
		for (Parameter p : object.getParameters().getParameters()) {
			paramTypes.add(resolve(p.getType()));
		}
		if (object.getParameters().getVararg() != null) paramTypes.add(TYPE_VARARG);
		return new ResolvedFunctionType(rettype, paramTypes);
	}
	
	@Override
	public ResolvedPointerType caseFunctionRef(FunctionRef object) {
		return new ResolvedPointerType(resolve(object.getRef()), 0);
	}
	
	@Override
	public ResolvedType caseTypedConstant(TypedConstant object) {
		return resolve(object.getType());
	}
	
	@Override
	public ResolvedType caseSimpleConstant(SimpleConstant object) {
		String content = textOf(object);
		if (content.startsWith("c\"")) {
			return TYPE_CSTRING;
		} else if (content.matches("-?\\d+\\.\\d+(e-?\\d+)?") ||
				content.matches("0x[klmhKLMH]?[0-9a-fA-F]+")) {
			return TYPE_FLOATING;
		} else if (content.matches("-?\\d+")) {
			return TYPE_ANY_INTEGER;
		} else if (content.equals("true") || content.equals("false")) {
			return TYPE_BOOLEAN;
		}
		return TYPE_UNKNOWN;
	}
	
	@Override
	public ResolvedVectorType caseVectorConstant(VectorConstant object) {
		EList<TypedConstant> values = object.getList().getTypedConstants();
		return new ResolvedVectorType(values.size(), resolve(values.get(0).getType()));
	}
	
	@Override
	public ResolvedArrayType caseArrayConstant(ArrayConstant object) {
		EList<TypedConstant> values = object.getList().getTypedConstants();
		return new ResolvedArrayType(values.size(), resolve(values.get(0).getType()));
	}
	
	@Override
	public ResolvedStructType caseStructureConstant(StructureConstant object) {
		EList<TypedConstant> values = object.getList().getTypedConstants();
		List<ResolvedType> resolvedTypes = new ArrayList<ResolvedType>(values.size());
		for (TypedConstant tc : values) {
			resolvedTypes.add(resolve(tc.getType()));
		}
		return new ResolvedStructType(resolvedTypes, false);
	}
	
	@Override
	public ResolvedType caseBinaryInstruction(BinaryInstruction object) {
		return resolve(object.getType());
	}
	
	@Override
	public ResolvedType caseBitwiseBinaryInstruction(BitwiseBinaryInstruction object) {
		return resolve(object.getType());
	}
	
	@Override
	public ResolvedType caseConversionInstruction(ConversionInstruction object) {
		return resolve(object.getTargetType());
	}
	
	@Override
	public ResolvedPointerType caseInstruction_alloca(Instruction_alloca object) {
		return new ResolvedPointerType(resolve(object.getType()), 0);
	}
	
	@Override
	public ResolvedType caseInstruction_atomicrmw(Instruction_atomicrmw object) {
		return resolve(object.getArgument().getType());
	}
	
	@Override
	public ResolvedType caseInstruction_phi(Instruction_phi object) {
		return resolve(object.getType());
	}
	
	@Override
	public ResolvedType caseInstruction_load(Instruction_load object) {
		return resolve(object.getPointer().getType());
	}
	
	@Override
	public ResolvedType caseInstruction_extractelement(Instruction_extractelement object) {
		return resolve(object.getVector().getType()).getContainedType(0);
	}
	
	@Override
	public ResolvedVectorType caseInstruction_insertelement(Instruction_insertelement object) {
		return (ResolvedVectorType) resolve(object.getVector().getType());
	}
	
	@Override
	public ResolvedType caseInstruction_shufflevector(Instruction_shufflevector object) {
		ResolvedVectorType mask = (ResolvedVectorType) resolve(object.getMask().getType());
		ResolvedType element = resolve(object.getVector1().getType()).getContainedType(0);
		return new ResolvedVectorType(mask.getSize(), element);
	}
	
	@Override
	public ResolvedType caseInstruction_getelementptr(Instruction_getelementptr object) {
		ResolvedType result = resolve(object.getPointer().getType());
		for (TypedValue index : object.getIndices()) {
			Integer indexValue = getNumericConstant(index.getRef());
			result = result.getContainedType(indexValue == null ? 0 : indexValue);
		}
		return result;
	}
	

	private Integer getNumericConstant(ValueRef ref) {
		if (ref instanceof GlobalValueRef == false) return null;
		Constant c = ((GlobalValueRef)ref).getConstant();
		if (c instanceof SimpleConstant == false) return null;
		
		String value = ((SimpleConstant) c).getValue();
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return null;
		}
	}


	private String textOf(EObject object) {
		return NodeModelUtils.getTokenText(NodeModelUtils.getNode(object));
	}
	
	private int atoi(String s) {
		return Integer.parseInt(s);
	}
	
	private ResolvedType buildTypeFromSuffix(ResolvedType rettype,
			FunctionTypeOrPointerToFunctionTypeSuffix suffix) {
		List<ResolvedType> paramTypes = new LinkedList<ResolvedType>();
		for (ParameterType t : suffix.getContainedTypes()) {
			paramTypes.add(resolve(t));
		}
		if (suffix.getVararg() != null) paramTypes.add(TYPE_VARARG);
		ResolvedType result = new ResolvedFunctionType(rettype, paramTypes);
		return buildPointersTo(result, suffix.getStars());
	}
	
	private ResolvedType buildPointersTo(ResolvedType base, Iterable<Star> stars) {
		ResolvedType result = base;
		for (Star star : stars) {
			String addrSpaceStr = star.getAddressSpace().getValue();
			int addrSpace = addrSpaceStr == null ? -1 : atoi(addrSpaceStr);
			result = new ResolvedPointerType(result, addrSpace);
		}
		return result;
	}
	
	private ResolvedType getSimpleType(String text) {
		ResolvedType result = SIMPLE_TYPES.get(text);
		return result != null? result : TYPE_UNKNOWN;
	}

}
