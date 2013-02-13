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

import com.intel.llvm.ireditor.LLVM_IRUtils;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.FunctionHeader;
import com.intel.llvm.ireditor.lLVM_IR.Instruction;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage.Literals;
import com.intel.llvm.ireditor.lLVM_IR.Alias;
import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.GlobalVariable;
import com.intel.llvm.ireditor.lLVM_IR.LocalValue;
import com.intel.llvm.ireditor.lLVM_IR.LocalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.NamedInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.StartingInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.VectorType;
import com.intel.llvm.ireditor.lLVM_IR.VoidType;
import com.intel.llvm.ireditor.lLVM_IR.util.LLVM_IRSwitch;
import com.intel.llvm.ireditor.ui.contentassist.antlr.LLVM_IRParser;
import com.intel.llvm.ireditor.ui.contentassist.antlr.internal.InternalLLVM_IRParser;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
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
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;
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
		ThreadLocal<IRegion> hover = new ThreadLocal<IRegion>();
		
		// Sanity values for hover sizes. We don't want load load an entire 100,000-line
		// function as a hover popup.
		int THRESHOLD_FIRST_LINE = 500;
		int THRESHOLD_DOCUMENTATION = 50000;
		
		@Override
		protected XtextBrowserInformationControlInput getHoverInfo(
				EObject element, IRegion hoverRegion,
				XtextBrowserInformationControlInput previous) {
			// Remember what we're actually hovering over - for providing
			// documentation for rule fragments (e.g. function attributes)
			hover.set(hoverRegion);
			return super.getHoverInfo(element, hoverRegion, previous);
		}
		
		@Override
		protected String getFirstLine(EObject o) {
			String fulltext = getFullNodeText(o);
			String parttext = getSubNodeText(o);
			String result = fulltext.trim().split("\\r?\\n", 2)[0]; // Get first non-empty line
			if (result.length() > THRESHOLD_FIRST_LINE) {
				result = result.substring(0, THRESHOLD_FIRST_LINE) + " ... [snipped]";
			}
			if (docProvider.hasDoc(parttext)) {
				result += " (" + docProvider.getType(parttext) + ")";
			}
			return LLVM_IRUtils.encodeTextForHtml(result);
		};
		
		@Override
		protected String getDocumentation(EObject o) {
			String fulltext = (o instanceof FunctionHeader ?
					getFullNodeText(o.eContainer()) :
					getFullNodeText(o)).trim();
			String parttext = getSubNodeText(o).trim();
			
			if (docProvider.hasDoc(parttext)) {
				// This element has built-in documentation, return it
				return "<b>" + LLVM_IRUtils.encodeTextForHtml(docProvider.getDoc(parttext)) + "</b>";
			}
			
			if (fulltext.contains("\n")) {
				// The full text has multiple lines, return it all as a documentation
				// (but constraint the length, in case it's some huge function)
				String result = LLVM_IRUtils.encodeCodeForHtml(
						fulltext.split("\\r?\\n", 2)[1]);
				if (result.length() > THRESHOLD_DOCUMENTATION) {
					result = result.substring(0, THRESHOLD_DOCUMENTATION) + " ... [snipped]";
				}
				return result;
			}
			
			return super.getDocumentation(o);
		}
		
		private String getSubNodeText(EObject o) {
			INode node = NodeModelUtils.getNode(o);
			if (node == null) return null;
			String fulltext = node.getRootNode().getText();
			return fulltext.substring(hover.get().getOffset(),
					hover.get().getOffset() + hover.get().getLength());
		}
		
		private String getFullNodeText(EObject o) {
			INode node = NodeModelUtils.getNode(o);
			if (node == null) return null;
			return node.getText();
		}
		
		@Override
		protected boolean hasHover(EObject o) {
			return docProvider.hasDoc(getSubNodeText(o)) || super.hasHover(o);
		}
		
	}
	
	private static class Position {
		public final int offset;
		public final int length;
		public final String id;
		public Position(int offset, int length, String id) {
			this.offset = offset;
			this.length = length;
			this.id = id;
		}
	}
	
	public static class LlvmSemanticHighlighter extends LLVM_IRSwitch<Position> implements ISemanticHighlightingCalculator {
		
		private INode node;
		
		private Position caseAnyType(EObject object) {
			return new Position(node.getOffset(), node.getLength(), LlvmHighlighter.TYPE_ID);
		}
		
		@Override
		public Position caseType(Type object) {
			return caseAnyType(object);
		}
		
		@Override
		public Position caseVectorType(VectorType object) {
			return caseAnyType(object);
		}

		@Override
		public Position caseNonVoidType(NonVoidType object) {
			return caseAnyType(object);
		}
		
		@Override
		public Position caseVoidType(VoidType object) {
			return caseAnyType(object);
		}
		
		@Override
		public Position caseBasicBlockRef(BasicBlockRef object) {
			return new Position(node.getOffset(), node.getLength(), LlvmHighlighter.BASICBLOCK_ID);
		}
		
		@Override
		public Position caseBasicBlock(BasicBlock object) {
			// The node contains the entire basic block; we just want to highlight the name, if
			// it exists.
			String name = (String) object.eGet(Literals.BASIC_BLOCK__NAME);
			if (node.getText().startsWith(name.substring(1))) {
				// It is explicitly named - so there's something to highlight
				return new Position(node.getOffset(), name.length(), LlvmHighlighter.BASICBLOCK_ID);
			}
			return null;
		}
		
		@Override
		public Position caseLocalValue(LocalValue object) {
			String name = (String) object.eGet(Literals.LOCAL_VALUE__NAME);
			if (node.getText().startsWith(name) == false) return null;
			return new Position(node.getOffset(), name.length(), LlvmHighlighter.LOCALVALUE_ID);
		}
		
		@Override
		public Position caseLocalValueRef(LocalValueRef object) {
			return new Position(node.getOffset(), node.getLength(), LlvmHighlighter.LOCALVALUE_ID);
		}

		@Override
		public Position caseGlobalVariable(GlobalVariable object) {
			String name = (String) object.eGet(Literals.GLOBAL_VARIABLE__NAME);
			if (node.getText().startsWith(name) == false) return null;
			return new Position(node.getOffset(), name.length(), LlvmHighlighter.GLOBALVALUE_ID);
		}
		
		@Override
		public Position caseAlias(Alias object) {
			String name = (String) object.eGet(Literals.ALIAS__NAME);
			if (node.getText().startsWith(name) == false) return null;
			return new Position(node.getOffset(), name.length(), LlvmHighlighter.GLOBALVALUE_ID);
		}
		
		@Override
		public Position caseFunctionHeader(FunctionHeader object) {
			String name = (String) object.eGet(Literals.FUNCTION_HEADER__NAME);
			if (node.getText().startsWith(name) == false) return null;
			return new Position(node.getOffset(), name.length(), LlvmHighlighter.GLOBALVALUE_ID);
		}
		
		@Override
		public Position caseConstant(Constant object) {
			if (object.getRef() != null) {
				return new Position(node.getOffset(), node.getLength(), LlvmHighlighter.GLOBALVALUE_ID);
			}
			return super.caseConstant(object);
		}
		
		public void provideHighlightingFor(XtextResource resource,
				IHighlightedPositionAcceptor acceptor) {
			if (resource == null || resource.getParseResult() == null)
				return;

			INode root = resource.getParseResult().getRootNode();
			for (INode treeNode : root.getAsTreeIterable()) {
				EObject obj = NodeModelUtils.findActualSemanticObjectFor(treeNode);
				if (obj == null) continue;
				node = treeNode;
				Position pos = doSwitch(obj);
				if (pos == null) continue;
				acceptor.addPosition(pos.offset, pos.length, pos.id);
			}
		}

	}
	
	public static class LlvmHighlighter extends DefaultHighlightingConfiguration {
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
