package com.intel.llvm.ireditor.resolvedtypes;

import java.util.List;

public class ResolvedStructType extends ResolvedType {
	private List<ResolvedType> fieldTypes;
	private boolean packed;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (packed) sb.append("<");
		sb.append("{");
		for (ResolvedType t : fieldTypes) {
			if (t != fieldTypes.get(0)) sb.append(", ");
			sb.append(t.toString());
		}
		sb.append("}");
		if (packed) sb.append(">");
		return sb.toString();
	}

	public ResolvedType getContainedType(int index) {
		return fieldTypes.get(index);
	}

}
