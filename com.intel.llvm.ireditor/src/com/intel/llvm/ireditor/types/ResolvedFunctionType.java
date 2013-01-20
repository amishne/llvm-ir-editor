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

import java.util.Iterator;

public class ResolvedFunctionType extends ResolvedType {
	
	private ResolvedType retType;
	private Iterable<? extends ResolvedType> paramTypes;

	public ResolvedFunctionType(ResolvedType rettype, Iterable<? extends ResolvedType> paramTypes) {
		this.retType = rettype;
		this.paramTypes = paramTypes;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(retType.toString());
		sb.append("(");
		boolean first = true;
		for (ResolvedType t : paramTypes) {
			if (first == false) sb.append(", ");
			first = false;
			sb.append(t.toString());
		}
		sb.append(")");
		return sb.toString();
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((paramTypes == null) ? 0 : paramTypes.hashCode());
		result = prime * result + ((retType == null) ? 0 : retType.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResolvedFunctionType other = (ResolvedFunctionType) obj;
		if (paramTypes == null) {
			if (other.paramTypes != null)
				return false;
		} else if (!paramTypes.equals(other.paramTypes))
			return false;
		if (retType == null) {
			if (other.retType != null)
				return false;
		} else if (!retType.equals(other.retType))
			return false;
		return true;
	}
	
	public boolean accepts(ResolvedType t) {
		if (t instanceof ResolvedAnyType) return true;
		if (t instanceof ResolvedFunctionType == false) return false;
		ResolvedFunctionType f = (ResolvedFunctionType) t;
		
		if (retType.accepts(f.retType) == false) return false;
		Iterator<? extends ResolvedType> thisParams = paramTypes.iterator();
		Iterator<? extends ResolvedType> thatParams = f.paramTypes.iterator();
		
		while (thisParams.hasNext()) {
			ResolvedType thisParam = thisParams.next();
			if (thisParam instanceof ResolvedVarargType) return true;
			
			if (thatParams.hasNext() == false) return false;
			ResolvedType thatParam = thatParams.next();
			
			if (thisParam.accepts(thatParam) == false) return false;
		}
		
		return true;
	}

	public ResolvedType getReturnType() {
		return retType;
	}

	public Iterable<? extends ResolvedType> getParameters() {
		return paramTypes;
	}
	
}
