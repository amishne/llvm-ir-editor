/*
Copyright (c) 2013, Intel Corporation

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
      this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
      this list of conditions and the following disclaimer in the documentation
      and/or other materials provided with the distribution.
    * Neither the name of Intel Corporation nor the names of its contributors
      may be used to endorse or promote products derived from this software
      without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.intel.llvm.ireditor.types;

import java.util.List;

public class ResolvedStructType extends ResolvedAnyStructType {
	private List<ResolvedType> fieldTypes;
	private boolean packed;
	
	public ResolvedStructType(List<ResolvedType> fieldTypes, boolean packed) {
		this.fieldTypes = fieldTypes;
		this.packed = packed;
	}
	
	public int getBits() {
		int result = 0;
		for (ResolvedType t : fieldTypes) result += t.getBits();
		return result;
	}
	
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
		if (index >= fieldTypes.size()) return null;
		return fieldTypes.get(index);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fieldTypes == null) ? 0 : fieldTypes.hashCode());
		result = prime * result + (packed ? 1231 : 1237);
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResolvedStructType other = (ResolvedStructType) obj;
		if (fieldTypes == null) {
			if (other.fieldTypes != null)
				return false;
		} else if (!fieldTypes.equals(other.fieldTypes))
			return false;
		if (packed != other.packed)
			return false;
		return true;
	}
	
	

}
