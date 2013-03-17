/*
Copyright (c) 2013, Intel Corporation

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
      this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
      this list of conditions and the following disclaimer in the docProvider
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

package com.intel.llvm.ireditor.tests;

import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidatorTester;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.intel.llvm.ireditor.LLVM_IRInjectorProvider;
import com.intel.llvm.ireditor.LLVM_IRStandaloneSetup;
import com.intel.llvm.ireditor.lLVM_IR.Model;
import com.intel.llvm.ireditor.validation.LLVM_IRJavaValidator;

import static com.intel.llvm.ireditor.validation.LLVM_IRJavaValidator.*;

@RunWith(XtextRunner.class)
@InjectWith(LLVM_IRInjectorProvider.class)
public class TypeValidation extends AbstractXtextTests {

	@SuppressWarnings("unchecked")
	@Override
	public void setUp() {
		try {
			super.setUp();
			with(LLVM_IRStandaloneSetup.class);
			LLVM_IRJavaValidator validator = get(LLVM_IRJavaValidator.class);
			tester = new ValidatorTester<LLVM_IRJavaValidator>(validator, getInjector());
			parser = get(ParseHelper.class);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	private ValidatorTester<LLVM_IRJavaValidator> tester;
	private ParseHelper<Model> parser;
	
	@Test
	public void testTrunc() throws Exception {
		tester.validate(parser.parse(buildCode("trunc #0 $0 to #1", "i16", "i32", "i16"))).assertOK();
		tester.validate(parser.parse(buildCode("trunc #0 $0 to #1", "i15", "i32", "i16"))).assertError(ERROR_EXPECTED_TYPE);
		tester.validate(parser.parse(buildCode("trunc #0 $0 to #1", "i16", "i32", "i15"))).assertError(ERROR_EXPECTED_TYPE);
	}
	
	@Test
	public void testGep1() throws Exception {
		tester.validate(parser.parse(buildCode("getelementptr #0 $0, i32 0, i32 1", "i16*", "{i8, i16}*"))).assertOK();
		tester.validate(parser.parse(buildCode("getelementptr #0 $0, i32 0, i32 0", "i16*", "{i8, i16}*"))).assertError(ERROR_EXPECTED_TYPE);
	}

	private String buildCode(String base, String expectedType, String... types) {
		StringBuilder sb = new StringBuilder();
		sb.append("define " + expectedType + " @test(");
		int i = 0;
		for (String type : types) {
			if (i > 0) sb.append(", ");
			String paramName = "%param" + i;
			sb.append(type);
			sb.append(" " + paramName);
			base = base.replaceAll("#" + i, type);
			base = base.replaceAll("\\$" + i, paramName);
			
			i++;
		}
		
		sb.append(") {\n  ");
		if (expectedType != null) {
			sb.append("%result = ");
		}
		sb.append(base);
		sb.append("\n  ret ");
		sb.append(expectedType == null ? "void" : expectedType + " %result");
		sb.append("\n}");
		System.out.println(sb.toString());
		return sb.toString();
	}
}
