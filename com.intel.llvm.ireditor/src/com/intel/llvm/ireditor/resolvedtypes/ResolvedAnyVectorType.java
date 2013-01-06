package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedAnyVectorType extends ResolvedType {

	public String toString() {
		return "vector";
	}
	
	public ResolvedType getContainedType(int index) {
		return new ResolvedAnyType();
	}
	
	public boolean accepts(ResolvedType t) {
		return super.accepts(t) || t instanceof ResolvedVectorType;
	}

}
