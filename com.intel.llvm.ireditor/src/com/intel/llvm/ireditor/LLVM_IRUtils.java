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

package com.intel.llvm.ireditor;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.OnChangeEvictingCache;

import com.google.inject.Provider;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.LocalValue;
import com.intel.llvm.ireditor.lLVM_IR.LocalValueRef;

public class LLVM_IRUtils {
	private enum Refs {
		LOCAL_VALUES,
		BASIC_BLOCKS,
		GLOBAL_VALUES
	}

	public static class Position {
		public final int offset;
		public final int length;
		public final String id;
		public Position(int offset, int length, String id) {
			this.offset = offset;
			this.length = length;
			this.id = id;
		}
	}
	
	private static OnChangeEvictingCache xrefCache = new OnChangeEvictingCache();
	
	public static List<EObject> xrefs(EObject object) {
		List<EObject> result = new LinkedList<>();
		final EObject root = EcoreUtil2.getRootContainer(object);
		
		if (object instanceof LocalValue) {
			List<LocalValueRef> list = xrefCache.get(Refs.LOCAL_VALUES, object.eResource(), new Provider<List<LocalValueRef>>() {
				@Override
				public List<LocalValueRef> get() {
					return EcoreUtil2.getAllContentsOfType(root, LocalValueRef.class);
				}
			});
			for (LocalValueRef ref : list) {
				if (object == ref.getRef()) result.add(ref);
			}
		} else if (object instanceof BasicBlock) {
			List<BasicBlockRef> list = xrefCache.get(Refs.BASIC_BLOCKS, object.eResource(), new Provider<List<BasicBlockRef>>() {
				@Override
				public List<BasicBlockRef> get() {
					return EcoreUtil2.getAllContentsOfType(root, BasicBlockRef.class);
				}
			});
			for (BasicBlockRef ref : list) {
				if (object == ref.getRef()) result.add(ref);
			}
		} else {
			List<GlobalValueRef> list = xrefCache.get(Refs.GLOBAL_VALUES, object.eResource(), new Provider<List<GlobalValueRef>>() {
				@Override
				public List<GlobalValueRef> get() {
					return EcoreUtil2.getAllContentsOfType(root, GlobalValueRef.class);
				}
			});
			for (GlobalValueRef ref : list) {
				if (ref.getConstant() != null && object == ref.getConstant().getRef()) result.add(ref);
			}
		}
		
		return result;
	}
	
	public static String encodeTextForHtml(String s) {
		return s
				.replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;")
				.replaceAll("\\r?\\n", "<br />");
	}
	
	public static String encodeCodeForHtml(String s) {
		return "<pre>" + s
				.replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;")
				+ "</ pre>";
	}

}
