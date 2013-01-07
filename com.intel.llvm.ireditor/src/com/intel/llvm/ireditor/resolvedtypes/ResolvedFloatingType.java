package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedFloatingType extends ResolvedType {

	private String typeStr;
	private int bits;

	public ResolvedFloatingType(String typeStr, int bits) {
		this.typeStr = typeStr;
		this.bits = bits;
	}

	public ResolvedType getContainedType(int index) {
		return null;
	}

	public String toString() {
		return typeStr;
	}

	public int getBits() {
		return bits;
	}

}
