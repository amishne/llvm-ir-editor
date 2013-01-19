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

public class ResolvedPointerType extends ResolvedType {
	private ResolvedType pointedType;
	private int addrSpace;
	
	public ResolvedPointerType(ResolvedType pointedType, int addrSpace) {
		this.pointedType = pointedType;
		this.addrSpace = addrSpace;
	}

	public String toString() {
		return pointedType.toString() + (addrSpace > 0 ? " addrspace(" + addrSpace + ")" : "") + "*";
	}
	
	public ResolvedType getContainedType(int index) {
		assert(index == 0);
		return pointedType;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addrSpace;
		result = prime * result
				+ ((pointedType == null) ? 0 : pointedType.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResolvedPointerType other = (ResolvedPointerType) obj;
		if (addrSpace != other.addrSpace)
			return false;
		if (pointedType == null) {
			if (other.pointedType != null)
				return false;
		} else if (!pointedType.equals(other.pointedType))
			return false;
		return true;
	}
}
