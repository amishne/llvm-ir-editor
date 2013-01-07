package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedAnyFloatingType extends ResolvedType {

	public int getBits() {
		return -1;
	}
	
	public String toString() {
		return "floating-point";
	}
	
	public ResolvedType getContainedType(int index) {
		return null;
	}

}
