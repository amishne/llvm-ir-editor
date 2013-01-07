package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedAnyType extends ResolvedType {

	public int getBits() {
		return -1;
	}
	
	public String toString() {
		return "any";
	}
	
	public ResolvedType getContainedType(int index) {
		return this;
	}
	
	public boolean accepts(ResolvedType t) {
		return true;
	}

}
