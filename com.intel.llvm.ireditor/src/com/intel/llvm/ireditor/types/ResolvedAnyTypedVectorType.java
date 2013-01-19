package com.intel.llvm.ireditor.types;

public class ResolvedAnyTypedVectorType extends ResolvedAnyVectorType {

	private ResolvedType elementType;

	public ResolvedAnyTypedVectorType(ResolvedType elementType) {
		this.elementType = elementType;
	}
	
	public String toString() {
		return "<n x " + elementType.toString() + ">";
	}
	
	public boolean accepts(ResolvedType t) {
		return this.equals(t)
				|| t.getClass() == ResolvedAnyType.class
				|| t.getClass() == ResolvedAnyVectorType.class
				|| (t.getClass() == ResolvedVectorType.class
					&& elementType.equals(t.getContainedType(0)));
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((elementType == null) ? 0 : elementType.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResolvedAnyTypedVectorType other = (ResolvedAnyTypedVectorType) obj;
		if (elementType == null) {
			if (other.elementType != null)
				return false;
		} else if (!elementType.equals(other.elementType))
			return false;
		return true;
	}
	
	

}
