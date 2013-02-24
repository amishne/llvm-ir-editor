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

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.runtime.IntStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.util.TextRegionWithLineInformation;

import com.intel.llvm.ireditor.ReverseNamedElementIterator.Mode;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_phi;
import com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Parameter;
import com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction;
import com.intel.llvm.ireditor.names.NameResolver;
import com.intel.llvm.ireditor.parser.antlr.LLVM_IRParser;
import com.intel.llvm.ireditor.parser.antlr.internal.InternalLLVM_IRParser;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class LLVM_IRRuntimeModule extends com.intel.llvm.ireditor.AbstractLLVM_IRRuntimeModule {
	/**
	 * Registers a value converter, to deal missing names for anonymous elements.
	 */
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return LlvmValueConverterService.class;
	}
	
	/**
	 * Registers a name converter, because Xtext by default works with qualified names
	 * with the "." delimiter. We don't need no stinkin' qualifications and delimiters!
	 */
	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return LlvmQualifiedNameConverter.class;
	}
	
	@Override
	public Class<? extends IParser> bindIParser() {
		// To fix hanging on unclosed functions
		return LlvmParser.class;
	}
	
	@Override
	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		// In order to locate nameless elements.
		return LlvmLocationInFileProvider.class;
	}
	
	public Class<? extends ISyntaxErrorMessageProvider> bindISyntaxErrorMessageProvider() {
		return LlvmSyntaxErrorMessageProvider.class;
	}
	
	public static class LlvmSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {
		@Override
		public SyntaxErrorMessage getSyntaxErrorMessage(
				IParserErrorContext context) {
			if (context.getCurrentContext() instanceof BasicBlock) {
				// Enhance error message for unclosed basic blocks.
				return new SyntaxErrorMessage(super.getSyntaxErrorMessage(context).getMessage() +
						" (did you forget a terminator instruction for " +
						((BasicBlock)context.getCurrentContext()).getName() + "?)", null);
			}
			return super.getSyntaxErrorMessage(context);
		}
	}
	
	public static class LlvmLocationInFileProvider extends DefaultLocationInFileProvider {
		
		@Override
		protected ITextRegion doGetTextRegion(EObject obj, @NonNull RegionDescription query) {
			ITextRegion result = super.doGetTextRegion(obj, query);
			if (obj instanceof NamedInstruction) {
				// Check if this is a named object - and if it is, this is a solution to
				// remove "=" from the region
				EStructuralFeature nameFeature = obj.eClass().getEStructuralFeature("name");
				List<INode> nodes = NodeModelUtils.findNodesForFeature(obj, nameFeature);
				String text = NodeModelUtils.getTokenText(nodes.get(0));
				if (text.isEmpty()) return result;
				// It has a name! Remove the "=".
				String name = ((NamedInstruction) obj).getName();
				if (result instanceof TextRegionWithLineInformation) {
					return new TextRegionWithLineInformation(result.getOffset(),
							name.length(),
							((TextRegionWithLineInformation) result).getLineNumber(),
							((TextRegionWithLineInformation) result).getEndLineNumber());
				} else {
					return new TextRegion(result.getOffset(), name.length());
				}
			}
			return result;
		}
		
		@Override
		protected List<INode> getLocationNodes(EObject obj) {
			if (obj instanceof MiddleInstruction) {
				return getLocationNodes(((MiddleInstruction) obj).getInstruction());
			} else if (obj instanceof TerminatorInstruction) {
				return getLocationNodes(((TerminatorInstruction) obj).getInstruction());
			}
			
			EStructuralFeature nameFeature = obj.eClass().getEStructuralFeature("name");
			if (nameFeature == null) return super.getLocationNodes(obj);
			
			List<INode> result = NodeModelUtils.findNodesForFeature(obj, nameFeature);
			
			// Special cases for nameless basic blocks, instructions and parameters
			if (obj instanceof NamedInstruction) {
				String text = NodeModelUtils.getTokenText(result.get(0));
				if (text.isEmpty()) {
					return Collections.singletonList(getOpcodeNode(obj));
				}
			} else if (obj instanceof Parameter) {
				String text = NodeModelUtils.getTokenText(result.get(0));
				if (text.isEmpty()) {
					return Collections.singletonList((INode)(NodeModelUtils.getNode(((Parameter) obj).getType())));
				}
			} else if (obj instanceof BasicBlock) {
				String text = NodeModelUtils.getTokenText(result.get(0));
				if (text.isEmpty()) {
					if (((BasicBlock) obj).getInstructions().isEmpty()) return Collections.emptyList();
					EObject firstInstruction = ((BasicBlock) obj).getInstructions().get(0);
					return getLocationNodes(firstInstruction);
				}
			}
			
			
			return result;
		}
		
		private INode getOpcodeNode(EObject inst) {
			EStructuralFeature instructionFeature = inst.eClass().getEStructuralFeature("instruction");
			EObject actualInst = (EObject) inst.eGet(instructionFeature);
			EStructuralFeature opcodeFeature = actualInst.eClass().getEStructuralFeature("opcode");
			return NodeModelUtils.findNodesForFeature(actualInst, opcodeFeature).get(0);
		}
	}
	
	public static class LlvmParser extends LLVM_IRParser {
		@Override
		protected InternalLLVM_IRParser createParser(XtextTokenStream stream) {
			return new InternalLLVM_IRParser(stream, getGrammarAccess()) {
				@Override
				public void recover(IntStream input, RecognitionException re) {
					if (re.token.getType() == Token.EOF) {
						// Don't bother recovering if the input is EOF.
						state.failed = true;
					}
					super.recover(input, re);
				}
			};
		}
	}
	
	public static class LlvmQualifiedNameConverter implements IQualifiedNameConverter {

		public String toString(QualifiedName name) {
			if (name == null) return null;
			return name.getFirstSegment();
		}

		public QualifiedName toQualifiedName(String qualifiedNameAsText) {
			if (qualifiedNameAsText == null) return null;
			return QualifiedName.create(qualifiedNameAsText);
		}
		
	}

	/**
	 * Name converters are for associating anonymous names (%<num>) with their elements
	 */
	public static class LlvmValueConverterService extends AbstractDeclarativeValueConverterService {
		@ValueConverter(rule="LocalName")
		public IValueConverter<String> convertLocalName() {
			return new LocalNameConverter();
		}
		
		@ValueConverter(rule="ParamName")
		public IValueConverter<String> convertParamName() {
			return new ParamNameConverter();
		}
		
		@ValueConverter(rule="GlobalName")
		public IValueConverter<String> convertGlobalName() {
			return new GlobalNameConverter();
		}
		
		@ValueConverter(rule="BasicBlockName")
		public IValueConverter<String> convertBasicBlockName() {
			return new BasicBlockNameConverter();
		}
		
	}
	
	public static abstract class LlvmNameConverter implements IValueConverter<String> {
		
		private static long NAME_RESOLVE_TIMEOUT_MS = 5000;
		private NameResolver namer = new NameResolver();
		
		public String toValue(String string, INode node) throws ValueConverterException {
			if (string == null || string.isEmpty()) {
				return nameFromIndex(findIndex(node));
			}
			return nameFromString(string);
		}
		
		public String toString(String value) throws ValueConverterException {
			return value;
		}
		
		private int findIndex(INode node) {
			// This works by searching for the last location in which an unnamed object was
			// defined in this scope, taking its name, and incrementing it by one.
			long start = System.currentTimeMillis();
			for (EObject element : previousElements(node)) {
				if (System.currentTimeMillis() - start > NAME_RESOLVE_TIMEOUT_MS) return 0;
				String name = getObjectName(element);
				if (name == null) continue;
				if (getAnonymousPattern().matcher(name).find()) {
					return Integer.valueOf(name.substring(1)) + 1;
				}
			}
			return 0;
		}
		
		private String getObjectName(EObject obj) {
			if (obj == null) return null;
			return namer.resolveName(obj);
		}
		
		protected abstract Iterable<? extends EObject> previousElements(final INode node);
		protected abstract String nameFromIndex(int index);
		protected abstract String nameFromString(String string);
		protected abstract Pattern getAnonymousPattern();
	}
	
	public static class LocalNameConverter extends LlvmNameConverter {
		@Override protected String nameFromIndex(int index) { return "%" + index; }
		@Override protected String nameFromString(String string) { return string.replaceFirst("\\s*=\\s*$", ""); }
		@Override protected Pattern getAnonymousPattern() { return Pattern.compile("%\\d+"); }
		
		protected Iterable<? extends EObject> previousElements(final INode node) {
			return new ReverseNamedElementIterator(getEnclosingInstruction(node), Mode.INST);
		}
		
		private INode getEnclosingInstruction(INode instNode) {
			EObject object = NodeModelUtils.findActualSemanticObjectFor(instNode);
			if (object instanceof Instruction_phi) return instNode.getParent();
			return instNode.getParent().getParent();
		}
	}
	
	public static class ParamNameConverter extends LlvmNameConverter {
		@Override protected String nameFromIndex(int index) { return "%" + index; }
		@Override protected String nameFromString(String string) { return string; }
		@Override protected Pattern getAnonymousPattern() { return Pattern.compile("%\\d+"); }
		
		protected Iterable<? extends EObject> previousElements(final INode node) {
			return new ReverseNamedElementIterator(node.getParent(), Mode.PARAM);
		}
	}
	
	public static class GlobalNameConverter extends LlvmNameConverter {
		@Override protected String nameFromIndex(int index) { return "@" + index; }
		@Override protected String nameFromString(String string) { return string.replaceFirst("\\s*=\\s*$", ""); }
		@Override protected Pattern getAnonymousPattern() { return Pattern.compile("@\\d+"); }
		
		protected Iterable<? extends EObject> previousElements(final INode node) {
			return new ReverseNamedElementIterator(node, Mode.GLOBAL);
		}
	}
	
	public static class BasicBlockNameConverter extends LlvmNameConverter {
		@Override protected String nameFromIndex(int index) { return "%" + index; }
		@Override protected String nameFromString(String string) { return "%" + string.substring(0, string.length()-1); }
		@Override protected Pattern getAnonymousPattern() { return Pattern.compile("%\\d+"); }
		
		protected Iterable<? extends EObject> previousElements(final INode node) {
			return new ReverseNamedElementIterator(node.getParent(), Mode.BB);
		}
	}
	
}
