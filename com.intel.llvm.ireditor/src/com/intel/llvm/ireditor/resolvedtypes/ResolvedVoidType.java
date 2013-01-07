package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedVoidType extends ResolvedType {

	public ResolvedType getContainedType(int index) {
		return null;
	}

	public String toString() {
		return "void";
	}

	public int getBits() {
		return 0;
	}

}
