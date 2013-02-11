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
import java.util.Iterator;
import java.util.List;

import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage.Literals;
import com.intel.llvm.ireditor.lLVM_IR.NamedInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.StartingInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.VectorType;
import com.intel.llvm.ireditor.lLVM_IR.VoidType;
import com.intel.llvm.ireditor.names.NameFixer;
import com.intel.llvm.ireditor.ui.contentassist.antlr.LLVM_IRParser;
import com.intel.llvm.ireditor.ui.contentassist.antlr.internal.InternalLLVM_IRParser;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.formatting.IIndentationInformation;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
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
		return LlvmHighlighter.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
		return LlvmSemanticHighlighter.class;
	}
	
	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return LlvmHoverProvider.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return LlvmAntlrTokenToAttributeIdMapper.class ;
	}
	
	@Override
	public Class<? extends IIndentationInformation> bindIIndentationInformation() {
		return LlvmIndentationInformation.class;
	}

	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		return LlvmLocationInFileProvider.class;
	}
	
	@Override
	public Class<? extends IRenameStrategy> bindIRenameStrategy() {
		return LlvmRenameStrategy.class;
	}
	
	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		// TODO workaround to add timeouts to content assist
		return CustomLlvmContentAssistParser.class;
	}
	
	@Override
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return LlvmDirtyStateAwareEditorCallback.class;
	}
	
	@Override
	public Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		return SimpleResourceSetProvider.class;
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
	
	public static class LlvmHoverProvider extends DefaultEObjectHoverProvider {
		DocProvider docProvider = new DocProvider();
		
		protected String getFirstLine(EObject o) {
			if (o instanceof BasicBlock) {
				// Don't bring the entire node for a basic block!
				BasicBlock block = (BasicBlock)o;
				return block.getName();
			}
			String lexeme = getLexeme(o);
			String result = NameFixer.encodeForHtml(NameFixer.restoreName(lexeme));
			if (docProvider.hasDoc(lexeme)) {
				result += " (" + docProvider.getType(lexeme) + ")";
			}
			return result;
		};
		
		protected String getDocumentation(EObject o) {
			if (o instanceof BasicBlock) {
				BasicBlock block = (BasicBlock)o;
				StringBuilder sb = new StringBuilder();
				int numInstructions = block.getInstructions().size();
				if (numInstructions <= 100) {
					for (Instruction inst : block.getInstructions()) {
						sb.append(NodeModelUtils.getTokenText(NodeModelUtils.getNode(inst)));
						sb.append("<br />");
					}
				} else {
					// Sanity - don't display huge basic blocks in hover. Instead, just show
					// first two and last two instructions.
					for (int i : new int[] {0, 1, -1, numInstructions-2, numInstructions-1}) {
						if (i == -1) {
							sb.append("... (" + (numInstructions-4) + " additional instructions)<br />");
							continue;
						}
						Instruction inst = block.getInstructions().get(i);
						sb.append(NodeModelUtils.getTokenText(NodeModelUtils.getNode(inst)));
						sb.append("<br />");
					}
				}
				return NameFixer.restoreName(sb.toString());
			}
			String lexeme = getLexeme(o);
			if (docProvider.hasDoc(lexeme)) {
				return "<b>" + NameFixer.encodeForHtml(docProvider.getDoc(lexeme)) + "</b>";
			}
			return NameFixer.restoreName(super.getDocumentation(o));
		}
		
		protected String getLexeme(EObject o) {
			// TODO this will only work properly for entire rules, but not for keywords inside rules :(
			INode node = NodeModelUtils.getNode(o);
			if (node == null) return null;
			return NodeModelUtils.getTokenText(node);
		}
		
		protected boolean hasHover(EObject o) {
			return docProvider.hasDoc(getLexeme(o)) ||
					super.hasHover(o);
		}
		
	}
	
	public static class LlvmSemanticHighlighter implements ISemanticHighlightingCalculator {
		public void provideHighlightingFor(XtextResource resource,
				IHighlightedPositionAcceptor acceptor) {
			if (resource == null || resource.getParseResult() == null)
				return;

			INode root = resource.getParseResult().getRootNode();
			for (INode node : root.getAsTreeIterable()) {
				EObject obj = NodeModelUtils.findActualSemanticObjectFor(node);
				if (obj == null) continue;
				if (isType(obj)) {
					acceptor.addPosition(node.getOffset(), node.getLength(), LlvmHighlighter.TYPE_ID);
				} else if (obj instanceof BasicBlockRef) {
					acceptor.addPosition(node.getOffset(), node.getLength(), LlvmHighlighter.BASICBLOCK_ID);
				} else if (obj instanceof BasicBlock) {
					// The node contains the entire basic block; we just want to highlight the name, if
					// it exists.
					String name = (String) obj.eGet(Literals.BASIC_BLOCK__NAME);
					if (node.getText().startsWith(name.substring(1))) {
						// It is explicitly named - so there's something to highlight
						acceptor.addPosition(node.getOffset(), name.length(), LlvmHighlighter.BASICBLOCK_ID);
					}
				}
				
			}
		}

	}
	
	private static boolean isType(EObject obj) {
		return obj instanceof Type
				|| obj instanceof VectorType
				|| obj instanceof NonVoidType
				|| obj instanceof VoidType;
	}
	
	public static class LlvmHighlighter extends DefaultHighlightingConfiguration {
		public final static String TYPE_ID = "LLVM_Type"; 
		public final static String FILECHECK_ID = "LLVM_FileCheck";
		public final static String BASICBLOCK_ID = "LLVM_BasicBlock";
		
		public void configure(IHighlightingConfigurationAcceptor acceptor) {
			super.configure(acceptor);
			acceptor.acceptDefaultHighlighting(TYPE_ID, "Type", typeTextStyle());
			acceptor.acceptDefaultHighlighting(FILECHECK_ID, "FileCheck comment", fileCheckTextStyle());
			acceptor.acceptDefaultHighlighting(BASICBLOCK_ID, "Basic block", basicBlockTextStyle());
		}

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
	
	public static class LlvmLocationInFileProvider extends DefaultLocationInFileProvider {
		protected List<INode> getLocationNodes(EObject obj) {
			if (obj instanceof BasicBlock) {
				BasicBlock block = (BasicBlock) obj;
				String name = block.getName();
				if (name == null || name.matches("%\\d+")) {
					// Unnamed basic blocks don't have any name or ID-typed field, so
					// need to manually set their location.
					Iterator<Instruction> iter = block.getInstructions().iterator();
					if (iter.hasNext()) obj = block.getInstructions().iterator().next();
				}
			} else if (obj instanceof NamedInstruction) {
				NamedInstruction inst = (NamedInstruction) obj;
				String name = inst.getName();
				if (name == null || name.matches("%\\d+")) {
					// Unnamed instructions don't have any name or ID-typed field, so
					// need to manually set their location.
					EObject actualInst = getOpcode(inst);
					if (actualInst != null) obj = actualInst;
				}
			}
			return super.getLocationNodes(obj);
		}

		private EObject getOpcode(NamedInstruction inst) {
			if (inst instanceof StartingInstruction) {
				return ((StartingInstruction) inst).getInstruction();
			} else if (inst instanceof NamedMiddleInstruction) {
				return ((NamedMiddleInstruction) inst).getInstruction();
			} else if (inst instanceof NamedTerminatorInstruction) {
				return ((NamedTerminatorInstruction) inst).getInstruction();
			}
			return null;
		}
	}
	
	public static class CustomLlvmContentAssistParser extends LLVM_IRParser {
		public static long ASSIST_TIMEOUT_MS = 3000;
		long start;
		
		@Override
		protected InternalLLVM_IRParser createParser() {
			com.intel.llvm.ireditor.ui.contentassist.antlr.internal.InternalLLVM_IRParser result = new com.intel.llvm.ireditor.ui.contentassist.antlr.internal.InternalLLVM_IRParser(null) {
				@Override
				public void before(EObject grammarElement) {
					if (System.currentTimeMillis() - start > ASSIST_TIMEOUT_MS) return;
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
