package com.intel.llvm.ireditor.resolvedtypes;

import java.util.List;

public class ResolvedFunctionType extends ResolvedType {
	
	private ResolvedType retType;
	private List<ResolvedType> argTypes;

	public ResolvedType getContainedType(int index) {
		return null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(retType.toString());
		sb.append("(");
		for (ResolvedType t : argTypes) {
			if (t != argTypes.get(0)) sb.append(", ");
			sb.append(t.toString());
		}
		sb.append(")");
		return sb.toString();
	}

}
