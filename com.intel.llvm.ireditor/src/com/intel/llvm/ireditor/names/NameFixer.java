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

package com.intel.llvm.ireditor.names;

/**
 * FIXME there's a bug which prevents cross-reference to locals with period. I
 * suspect the root of the bug is in Xtext itself.
 * This workaround fixes it, though the modified form will still appear in auto-completion
 * suggestions (but will not actually be inserted).
 */
public class NameFixer {
	// Chose interpunct (·) character for no special reason, except that it's
	// similar to period but it is not legal in LLVM IR, forcing the user to replace it.
	private final static char PERIOD_REPLACEMENT = '·';
	
	public static String fixName(String s) {
		return s == null ? null : s.replace('.', PERIOD_REPLACEMENT);
	}
	
	public static String restoreName(String s) {
		return s == null ? null : s.replace(PERIOD_REPLACEMENT, '.');
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
