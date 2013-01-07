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
package com.intel.llvm.ireditor.resolvedtypes;

public class ResolvedFloatingType extends ResolvedAnyFloatingType {

	private String typeStr;
	private int bits;

	public ResolvedFloatingType(String typeStr, int bits) {
		this.typeStr = typeStr;
		this.bits = bits;
	}

	public String toString() {
		return typeStr;
	}

	public int getBits() {
		return bits;
	}
	
	public boolean accepts(ResolvedType t) {
		return this.equals(t)
				|| t.getClass() == ResolvedAnyFloatingType.class
				|| t.getClass() == ResolvedAnyType.class;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bits;
		result = prime * result + ((typeStr == null) ? 0 : typeStr.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResolvedFloatingType other = (ResolvedFloatingType) obj;
		if (bits != other.bits)
			return false;
		if (typeStr == null) {
			if (other.typeStr != null)
				return false;
		} else if (!typeStr.equals(other.typeStr))
			return false;
		return true;
	}
	
}
