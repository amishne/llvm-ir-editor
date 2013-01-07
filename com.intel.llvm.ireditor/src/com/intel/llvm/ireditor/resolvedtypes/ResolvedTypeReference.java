package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedTypeReference extends ResolvedType {

	private String name;
	
	public ResolvedTypeReference(String name) {
		this.name = name;
	}

	public ResolvedType getContainedType(int index) {
		return null;
	}

	public String toString() {
		return name;
	}

	public int getBits() {
		return -1;
	}

}
