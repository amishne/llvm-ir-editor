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

package com.intel.llvm.ireditor.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class LlvmHighlighter extends DefaultHighlightingConfiguration {
	public final static String TYPE_ID = "LLVM_Type"; 
	public final static String FILECHECK_ID = "LLVM_FileCheck";
	public final static String BASICBLOCK_ID = "LLVM_BasicBlock";
	public final static String LOCALVALUE_ID = "LLVM_LocalValue";
	public final static String GLOBALVALUE_ID = "LLVM_GlobalValue";
	
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(TYPE_ID, "Type", typeTextStyle());
		acceptor.acceptDefaultHighlighting(FILECHECK_ID, "FileCheck Comment", fileCheckTextStyle());
		acceptor.acceptDefaultHighlighting(BASICBLOCK_ID, "Basic Block", basicBlockTextStyle());
		acceptor.acceptDefaultHighlighting(LOCALVALUE_ID, "Local Value", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(GLOBALVALUE_ID, "Global Value", defaultTextStyle());
	}
	
	// Default values below. These are all customizable by the user.
	
	public TextStyle basicBlockTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(148, 71, 41));
		return textStyle;
	}
	
	public TextStyle typeTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(255, 0, 255));
		return textStyle;
	}
	
	public TextStyle fileCheckTextStyle() {
		TextStyle textStyle = commentTextStyle();
		textStyle.setColor(new RGB(255, 128, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	@Override
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 255));
		return textStyle;
	}
	
	@Override
	public TextStyle stringTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(128, 64, 0));
		return textStyle;
	}
	
	@Override
	public TextStyle punctuationTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(128, 128, 128));
		return textStyle;
	}
	
	@Override
	public TextStyle numberTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}
}