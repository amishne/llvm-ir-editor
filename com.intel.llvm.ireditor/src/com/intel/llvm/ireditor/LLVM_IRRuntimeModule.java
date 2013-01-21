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

import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.intel.llvm.ireditor.ReverseNamedElementIterator.Mode;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_phi;
import com.intel.llvm.ireditor.names.NameFixer;
import com.intel.llvm.ireditor.names.NameResolver;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class LLVM_IRRuntimeModule extends com.intel.llvm.ireditor.AbstractLLVM_IRRuntimeModule {
	/**
	 * Registers a value converter, to deal with bad names - either names that need a fix, or missing
	 * names for anonymous elements.
	 */
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return LlvmValueConverterService.class;
	}
	
	public static class LlvmValueConverterService extends AbstractDeclarativeValueConverterService {
		IValueConverter<String> dotFixConverter = new DotFixConverter();
		
		// ID converters are for fixing the dot in the name.
		
		@ValueConverter(rule="LOCAL_ID")
		public IValueConverter<String> convertLOCAL_ID() {
			return dotFixConverter;
		}
		
		@ValueConverter(rule="GLOBAL_ID")
		public IValueConverter<String> convertGLOBAL_ID() {
			return dotFixConverter;
		}
		
		@ValueConverter(rule="BASIC_BLOCK_ID")
		public IValueConverter<String> convertBASIC_BLOCK_ID() {
			return dotFixConverter;
		}
		
		// Name converters are for associating anonymous names (%<num>) with their elements
		
		@ValueConverter(rule="LocalName")
		public IValueConverter<String> convertLocalName() {
			return new LocalNameConverter();
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
	
	public static class DotFixConverter implements IValueConverter<String> {
		public String toValue(String string, INode node) throws ValueConverterException {
			return NameFixer.fixName(string);
		}

		public String toString(String value) throws ValueConverterException {
			return NameFixer.restoreName(value);
		}
	}

	public static abstract class LlvmNameConverter implements IValueConverter<String> {
		
		private static long NAME_RESOLVE_TIMEOUT_MS = 5000;
		private NameResolver namer = new NameResolver();
		
		public String toValue(String string, INode node) throws ValueConverterException {
			if (string == null || string.isEmpty()) {
				return nameFromIndex(findIndex(node));
			}
			return NameFixer.fixName(nameFromString(string));
		}
		
		public String toString(String value) throws ValueConverterException {
			return NameFixer.restoreName(value);
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
		@Override protected String nameFromString(String string) { return string.replaceFirst("\\s*=$", ""); }
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
	
	public static class GlobalNameConverter extends LlvmNameConverter {
		@Override protected String nameFromIndex(int index) { return "@" + index; }
		@Override protected String nameFromString(String string) { return string.replaceFirst("\\s*=$", ""); }
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
