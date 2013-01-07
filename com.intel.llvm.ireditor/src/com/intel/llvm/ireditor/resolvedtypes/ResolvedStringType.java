package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedStringType extends ResolvedType {
	
	public int getBits() {
		return -1;
	}
	
	public String toString() {
		return "[n x i8]";
	}

	public ResolvedType getContainedType(int index) {
		return new ResolvedIntegerType(8);
	}

}
