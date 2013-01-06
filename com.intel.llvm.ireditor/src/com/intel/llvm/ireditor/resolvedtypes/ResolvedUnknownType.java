package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedUnknownType extends ResolvedType {

	public String toString() {
		return "unknown";
	}
	
	public ResolvedType getContainedType(int index) {
		return null;
	}

}
