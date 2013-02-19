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

import java.util.Collection;
import com.intel.llvm.ireditor.ui.contentassist.antlr.LLVM_IRParser;
import com.intel.llvm.ireditor.ui.contentassist.antlr.internal.InternalLLVM_IRParser;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.formatting.IIndentationInformation;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.InfiniteRecursion;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;


/**
 * Use this class to register components to be used within the IDE.
 */
@SuppressWarnings("restriction")
public class LLVM_IRUiModule extends com.intel.llvm.ireditor.ui.AbstractLLVM_IRUiModule {
	
	public LLVM_IRUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		// Custom language highlighting
		return LlvmHighlighter.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
		// To match elements with their intended highlighting.
		return LlvmSemanticHighlighter.class;
	}
	
	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		// Custom hover provider.
		return LlvmHoverProvider.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return LlvmAntlrTokenToAttributeIdMapper.class ;
	}
	
	@Override
	public Class<? extends IIndentationInformation> bindIIndentationInformation() {
		// Use "  " indentation instead of the default.
		return LlvmIndentationInformation.class;
	}

	@Override
	public Class<? extends IRenameStrategy> bindIRenameStrategy() {
		// To handle renaming elements such as "%name =". 
		return LlvmRenameStrategy.class;
	}
	
	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		// Replace the default content assist parser with a "safer" one which doesn't hang as often :)
		return CustomLlvmContentAssistParser.class;
	}
	
	@Override
	public Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		// For performance: we don't need to look up any jar files.
		return SimpleResourceSetProvider.class;
	}
	
	@Override
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		// To prevent the plugin from offering to turn on xtext validation to the project.
		// TODO remove this if this is ever stable enough to re-enable the feature.
		return LlvmDirtyStateAwareEditorCallback.class;
	}
	public static class LlvmDirtyStateAwareEditorCallback extends AbstractDirtyStateAwareEditorCallback {}
	
	public static class LlvmRenameStrategy extends DefaultRenameStrategy {
		@Override
		protected ITextRegion getOriginalNameRegion(
				EObject targetElement, EAttribute nameAttribute) {
			// Use the actual name string for length calculation, not the entire name element.
			int offset = NodeModelUtils.findActualNodeFor(targetElement).getOffset();
			String text = getOriginalName();
			return new TextRegion(offset, text.length());
		}
	}
	
	public static class LlvmAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
		protected String calculateId(String tokenName, int tokenType) {
			if("RULE_FILECHECK_COMMENT".equals(tokenName)) {
				return LlvmHighlighter.FILECHECK_ID;
			}
			return super.calculateId(tokenName, tokenType);
		}
	}
	
	public static class LlvmIndentationInformation implements IIndentationInformation {
		public String getIndentString() {
			return "  ";
		}
	}
	
	public static class CustomLlvmContentAssistParser extends LLVM_IRParser {
		public static long ASSIST_TIMEOUT_MS = 2000;
		long start;
		
		@Override
		protected InternalLLVM_IRParser createParser() {
			com.intel.llvm.ireditor.ui.contentassist.antlr.internal.InternalLLVM_IRParser result = new com.intel.llvm.ireditor.ui.contentassist.antlr.internal.InternalLLVM_IRParser(null) {
				@Override
				public void before(EObject grammarElement) {
					if (System.currentTimeMillis() - start > ASSIST_TIMEOUT_MS) {
						throw new InfiniteRecursion();
					}
					
					super.before(grammarElement);
				}
				
			};
			result.setGrammarAccess(getGrammarAccess());
			return result;
		}
		
		@Override
		protected Collection<FollowElement> getFollowElements(
				AbstractInternalContentAssistParser parser) {
			start = System.currentTimeMillis();
			return super.getFollowElements(parser);
		}
	}
	
}
