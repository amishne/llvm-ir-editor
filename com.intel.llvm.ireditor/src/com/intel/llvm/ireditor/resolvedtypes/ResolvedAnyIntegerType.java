package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedAnyIntegerType extends ResolvedType {

	public int getBits() {
		return -1;
	}
	
	public String toString() {
		return "any integer";
	}
	
	public ResolvedType getContainedType(int index) {
		return null;
	}
	
	public boolean accepts(ResolvedType t) {
		return super.accepts(t) || t instanceof ResolvedIntegerType;
	}

}
