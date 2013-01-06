package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedPointerType extends ResolvedType {
	private ResolvedType pointedType;
	private int addrSpace;
	
	public ResolvedPointerType(ResolvedType pointedType, int addrSpace) {
		this.pointedType = pointedType;
		this.addrSpace = addrSpace;
	}

	public String toString() {
		return pointedType.toString() + (addrSpace != -1 ? " addrspace(" + addrSpace + ")" : "") + "*";
	}
	
	public ResolvedType getContainedType(int index) {
		assert(index == 0);
		return pointedType;
	}
}
