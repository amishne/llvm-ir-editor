package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedIntegerType extends ResolvedType {

	private int bits;
	
	public ResolvedIntegerType(int bits) {
		this.bits = bits;
	}
	
	public int getBits() {
		return bits;
	}

	public String toString() {
		return "i" + bits;
	}
	
	public ResolvedType getContainedType(int index) {
		return null;
	}

}
