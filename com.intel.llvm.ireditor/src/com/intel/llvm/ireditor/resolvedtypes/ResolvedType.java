package com.intel.llvm.ireditor.resolvedtypes;

public abstract class ResolvedType {
	public abstract ResolvedType getContainedType(int index);
	public abstract String toString();
	public abstract int getBits();
	public boolean accepts(ResolvedType t) {
		return this.getClass() == t.getClass();
	}
}
