package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedVectorType extends ResolvedType {
	private ResolvedType elementType;
	private int size;
	
	public String toString() {
		return "<" + size + " x " + elementType.toString() + ">";
	}
	
	public ResolvedType getContainedType(int index) {
		assert (index == 0);
		return elementType;
	}
}
