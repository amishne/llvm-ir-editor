package com.intel.llvm.ireditor.resolvedtypes;

import java.util.List;

public class ResolvedFunctionType extends ResolvedType {
	
	private ResolvedType rettype;
	private List<ResolvedType> paramTypes;

	public ResolvedFunctionType(ResolvedType rettype, List<ResolvedType> paramTypes) {
		this.rettype = rettype;
		this.paramTypes = paramTypes;
	}

	public int getBits() {
		return -1;
	}
	
	public ResolvedType getContainedType(int index) {
		return null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(rettype.toString());
		sb.append("(");
		for (ResolvedType t : paramTypes) {
			if (t != paramTypes.get(0)) sb.append(", ");
			sb.append(t.toString());
		}
		sb.append(")");
		return sb.toString();
	}

}
