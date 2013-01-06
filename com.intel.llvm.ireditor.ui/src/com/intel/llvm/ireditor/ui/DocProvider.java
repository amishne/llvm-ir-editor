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

import java.util.HashMap;
import java.util.Map;

public class DocProvider {
	private static class Doc {
		String elementType;
		String elementDoc;
		Doc(String elementType, String elementDoc) {
			this.elementType = elementType;
			this.elementDoc = elementDoc;
		}
	}
	
	private Map<String, Doc> keywordDoc = new HashMap<String, Doc>();
	
	public boolean hasDoc(String key) {
		if (key == null) return false;
		return keywordDoc.containsKey(key);
	}
	
	public String getDoc(String key) {
		if (key == null) return null;
		return keywordDoc.get(key).elementDoc;
	}
	
	public String getType(String key) {
		if (key == null) return null;
		return keywordDoc.get(key).elementType;
	}
	
	public DocProvider() {
		setupLinkageTypes();
		setupFunctionAttributes();
		setupCallingConventions();
		setupGlobalVariablesTLSModels();
		setupParameterAttributes();
		setupAtomicMemoryOrderingConstraints();
	}
	
	private void setupLinkageTypes() {
		String elementType = "linkage type";
		// TODO "private" is problematic, it's both a linkage type and visiblity type
		keywordDoc.put("private", new Doc(elementType, "Global values with \"private\" linkage are only directly accessible by objects in the current module. In particular, linking code into a module with an private global value may cause the private to be renamed as necessary to avoid collisions. Because the symbol is private to the module, all references can be updated. This doesn't show up in any symbol table in the object file."));
		keywordDoc.put("linker_private", new Doc(elementType, "Similar to private, but the symbol is passed through the assembler and evaluated by the linker. Unlike normal strong symbols, they are removed by the linker from the final linked image (executable or dynamic library)."));
		keywordDoc.put("linker_private_weak", new Doc(elementType, "Similar to \"linker_private\", but the symbol is weak. Note that linker_private_weak symbols are subject to coalescing by the linker. The symbols are removed by the linker from the final linked image (executable or dynamic library)."));
		keywordDoc.put("linker_private_weak_def_auto", new Doc(elementType, "Similar to \"linker_private_weak\", but it's known that the address of the object is not taken. For instance, functions that had an inline definition, but the compiler decided not to inline it. Note, unlike linker_private and linker_private_weak, linker_private_weak_def_auto may have only default visibility. The symbols are removed by the linker from the final linked image (executable or dynamic library)."));
		keywordDoc.put("internal", new Doc(elementType, "Similar to private, but the value shows as a local symbol (STB_LOCAL in the case of ELF) in the object file. This corresponds to the notion of the 'static' keyword in C."));
		keywordDoc.put("available_externally", new Doc(elementType, "Globals with \"available_externally\" linkage are never emitted into the object file corresponding to the LLVM module. They exist to allow inlining and other optimizations to take place given knowledge of the definition of the global, which is known to be somewhere outside the module. Globals with available_externally linkage are allowed to be discarded at will, and are otherwise the same as linkonce_odr. This linkage type is only allowed on definitions, not declarations."));
		keywordDoc.put("linkonce", new Doc(elementType, "Globals with \"linkonce\" linkage are merged with other globals of the same name when linkage occurs. This can be used to implement some forms of inline functions, templates, or other code which must be generated in each translation unit that uses it, but where the body may be overridden with a more definitive definition later. Unreferenced linkonce globals are allowed to be discarded. Note that linkonce linkage does not actually allow the optimizer to inline the body of this function into callers because it doesn't know if this definition of the function is the definitive definition within the program or whether it will be overridden by a stronger definition. To enable inlining and other optimizations, use \"linkonce_odr\" linkage."));
		keywordDoc.put("weak", new Doc(elementType, "\"weak\" linkage has the same merging semantics as linkonce linkage, except that unreferenced globals with weak linkage may not be discarded. This is used for globals that are declared \"weak\" in C source code."));
		keywordDoc.put("common", new Doc(elementType, "\"common\" linkage is most similar to \"weak\" linkage, but they are used for tentative definitions in C, such as \"int X;\" at global scope. Symbols with \"common\" linkage are merged in the same way as weak symbols, and they may not be deleted if unreferenced. common symbols may not have an explicit section, must have a zero initializer, and may not be marked 'constant'. Functions and aliases may not have common linkage."));
		keywordDoc.put("appending", new Doc(elementType, "\"appending\" linkage may only be applied to global variables of pointer to array type. When two global variables with appending linkage are linked together, the two global arrays are appended together. This is the LLVM, typesafe, equivalent of having the system linker append together \"sections\" with identical names when .o files are linked."));
		keywordDoc.put("extern_weak", new Doc(elementType, "The semantics of this linkage follow the ELF object file model: the symbol is weak until linked, if not linked, the symbol becomes null instead of being an undefined reference."));
		keywordDoc.put("linkonce_odr", new Doc(elementType, ""));
		keywordDoc.put("weak_odr", new Doc(elementType, "Some languages allow differing globals to be merged, such as two functions with different semantics. Other languages, such as C++, ensure that only equivalent globals are ever merged (the \"one definition rule\" — \"ODR\"). Such languages can use the linkonce_odr and weak_odr linkage types to indicate that the global will only be merged with equivalent globals. These linkage types are otherwise the same as their non-odr versions."));
		keywordDoc.put("external", new Doc(elementType, "If none of the above identifiers are used, the global is externally visible, meaning that it participates in linkage and can be used to resolve external symbol references."));
		keywordDoc.put("dllimport", new Doc(elementType, "\"dllimport\" linkage causes the compiler to reference a function or variable via a global pointer to a pointer that is set up by the DLL exporting the symbol. On Microsoft Windows targets, the pointer name is formed by combining __imp_ and the function or variable name."));
		keywordDoc.put("dllexport", new Doc(elementType, "\"dllexport\" linkage causes the compiler to provide a global pointer to a pointer in a DLL, so that it can be referenced with the dllimport attribute. On Microsoft Windows targets, the pointer name is formed by combining __imp_ and the function or variable name."));
	}

	private void setupFunctionAttributes() {
		String elementType = "function attribute";
		keywordDoc.put("address_safety", new Doc(elementType, "This attribute indicates that the address safety analysis is enabled for this function."));
		keywordDoc.put("alignstack(<n>)", new Doc(elementType, "This attribute indicates that, when emitting the prologue and epilogue, the backend should forcibly align the stack pointer. Specify the desired alignment, which must be a power of two, in parentheses."));
		keywordDoc.put("alwaysinline", new Doc(elementType, "This attribute indicates that the inliner should attempt to inline this function into callers whenever possible, ignoring any active inlining size threshold for this caller."));
		keywordDoc.put("nonlazybind", new Doc(elementType, "This attribute suppresses lazy symbol binding for the function. This may make calls to the function faster, at the cost of extra program startup time if the function is not called during program startup."));
		keywordDoc.put("ia_nsdialect", new Doc(elementType, "This attribute indicates the associated inline assembly call is using a non-standard assembly dialect. The standard dialect is ATT, which is assumed when this attribute is not present. When present, the dialect is assumed to be Intel. Currently, ATT and Intel are the only supported dialects."));
		keywordDoc.put("inlinehint", new Doc(elementType, "This attribute indicates that the source code contained a hint that inlining this function is desirable (such as the \"inline\" keyword in C/C++). It is just a hint; it imposes no requirements on the inliner."));
		keywordDoc.put("naked", new Doc(elementType, "This attribute disables prologue / epilogue emission for the function. This can have very system-specific consequences."));
		keywordDoc.put("noimplicitfloat", new Doc(elementType, "This attributes disables implicit floating point instructions."));
		keywordDoc.put("noinline", new Doc(elementType, "This attribute indicates that the inliner should never inline this function in any situation. This attribute may not be used together with the alwaysinline attribute."));
		keywordDoc.put("noredzone", new Doc(elementType, "This attribute indicates that the code generator should not use a red zone, even if the target-specific ABI normally permits it."));
		keywordDoc.put("noreturn", new Doc(elementType, "This function attribute indicates that the function never returns normally. This produces undefined behavior at runtime if the function ever does dynamically return."));
		keywordDoc.put("nounwind", new Doc(elementType, "This function attribute indicates that the function never returns with an unwind or exceptional control flow. If the function does unwind, its runtime behavior is undefined."));
		keywordDoc.put("optsize", new Doc(elementType, "This attribute suggests that optimization passes and code generator passes make choices that keep the code size of this function low, and otherwise do optimizations specifically to reduce code size."));
		keywordDoc.put("readnone", new Doc(elementType, "This attribute indicates that the function computes its result (or decides to unwind an exception) based strictly on its arguments, without dereferencing any pointer arguments or otherwise accessing any mutable state (e.g. memory, control registers, etc) visible to caller functions. It does not write through any pointer arguments (including byval arguments) and never changes any state visible to callers. This means that it cannot unwind exceptions by calling the C++ exception throwing methods."));
		keywordDoc.put("readonly", new Doc(elementType, "This attribute indicates that the function does not write through any pointer arguments (including byval arguments) or otherwise modify any state (e.g. memory, control registers, etc) visible to caller functions. It may dereference pointer arguments and read state that may be set in the caller. A readonly function always returns the same value (or unwinds an exception identically) when called with the same set of arguments and global state. It cannot unwind an exception by calling the C++ exception throwing methods."));
		keywordDoc.put("returns_twice", new Doc(elementType, "This attribute indicates that this function can return twice. The C setjmp is an example of such a function. The compiler disables some optimizations (like tail calls) in the caller of these functions."));
		keywordDoc.put("ssp", new Doc(elementType, "This attribute indicates that the function should emit a stack smashing protector. It is in the form of a \"canary\"—a random value placed on the stack before the local variables that's checked upon return from the function to see if it has been overwritten. A heuristic is used to determine if a function needs stack protectors or not.\n"+
				"If a function that has an ssp attribute is inlined into a function that doesn't have an ssp attribute, then the resulting function will have an ssp attribute."));
		keywordDoc.put("sspreq", new Doc(elementType, "This attribute indicates that the function should always emit a stack smashing protector. This overrides the ssp function attribute.\n"+
				"If a function that has an sspreq attribute is inlined into a function that doesn't have an sspreq attribute or which has an ssp attribute, then the resulting function will have an sspreq attribute."));
		keywordDoc.put("uwtable", new Doc(elementType, "This attribute indicates that the ABI being targeted requires that an unwind table entry be produce for this function even if we can show that no exceptions passes by it. This is normally the case for the ELF x86-64 abi, but it can be disabled for some compilation units."));
	}
	
	private void setupCallingConventions() {
		String elementType = "calling convention";
		keywordDoc.put("ccc", new Doc(elementType, "The C calling convention:\nThis calling convention (the default if no other calling convention is specified) matches the target C calling conventions. This calling convention supports varargs function calls and tolerates some mismatch in the declared prototype and implemented declaration of the function (as does normal C)."));
		keywordDoc.put("fastcc", new Doc(elementType, "The fast calling convention:\nThis calling convention attempts to make calls as fast as possible (e.g. by passing things in registers). This calling convention allows the target to use whatever tricks it wants to produce fast code for the target, without having to conform to an externally specified ABI (Application Binary Interface). Tail calls can only be optimized when this or the GHC convention is used. This calling convention does not support varargs and requires the prototype of all callees to exactly match the prototype of the function definition."));
		keywordDoc.put("coldcc", new Doc(elementType, "The cold calling convention:\nThis calling convention attempts to make code in the caller as efficient as possible under the assumption that the call is not commonly executed. As such, these calls often preserve all registers so that the call does not break any live ranges in the caller side. This calling convention does not support varargs and requires the prototype of all callees to exactly match the prototype of the function definition."));
		keywordDoc.put("cc 10", new Doc(elementType, "GHC convention:\nThis calling convention has been implemented specifically for use by the Glasgow Haskell Compiler (GHC). It passes everything in registers, going to extremes to achieve this by disabling callee save registers. This calling convention should not be used lightly but only for specific situations such as an alternative to the register pinning performance technique often used when implementing functional programming languages.At the moment only X86 supports this convention and it has the following limitations:\n" +
				"* On X86-32 only supports up to 4 bit type parameters. No floating point types are supported.\n" +
				"* On X86-64 only supports up to 10 bit type parameters and 6 floating point parameters.\n" +
				"This calling convention supports tail call optimization but requires both the caller and callee are using it."));
		keywordDoc.put("cc <n>", new Doc(elementType, "Numbered convention:\nAny calling convention may be specified by number, allowing target-specific calling conventions to be used. Target specific calling conventions start at 64."));
	}
	
	private void setupGlobalVariablesTLSModels() {
		String elementType = "TLS model";
		keywordDoc.put("localdynamic", new Doc(elementType, "For variables that are only used within the current shared library."));
		keywordDoc.put("initialexec", new Doc(elementType, "For variables in modules that will not be loaded dynamically."));
		keywordDoc.put("localexec", new Doc(elementType, "For variables defined in the executable and only used within it."));
	}
	
	private void setupParameterAttributes() {
		String elementType = "parameter attribute";
		keywordDoc.put("zeroext", new Doc(elementType, "This indicates to the code generator that the parameter or return value should be zero-extended to the extent required by the target's ABI (which is usually 32-bits, but is 8-bits for a i1 on x86-64) by the caller (for a parameter) or the callee (for a return value)."));
		keywordDoc.put("signext", new Doc(elementType, "This indicates to the code generator that the parameter or return value should be sign-extended to the extent required by the target's ABI (which is usually 32-bits) by the caller (for a parameter) or the callee (for a return value)."));
		keywordDoc.put("inreg", new Doc(elementType, "This indicates that this parameter or return value should be treated in a special target-dependent fashion during while emitting code for a function call or return (usually, by putting it in a register as opposed to memory, though some targets use it to distinguish between two different kinds of registers). Use of this attribute is target-specific."));
		keywordDoc.put("byval", new Doc(elementType, "This indicates that the pointer parameter should really be passed by value to the function. The attribute implies that a hidden copy of the pointee is made between the caller and the callee, so the callee is unable to modify the value in the caller. This attribute is only valid on LLVM pointer arguments. It is generally used to pass structs and arrays by value, but is also valid on pointers to scalars. The copy is considered to belong to the caller not the callee (for example, readonly functions should not write to byval parameters). This is not a valid attribute for return values.\nThe byval attribute also supports specifying an alignment with the align attribute. It indicates the alignment of the stack slot to form and the known alignment of the pointer specified to the call site. If the alignment is not specified, then the code generator makes a target-specific assumption."));
		keywordDoc.put("sret", new Doc(elementType, "This indicates that the pointer parameter specifies the address of a structure that is the return value of the function in the source program. This pointer must be guaranteed by the caller to be valid: loads and stores to the structure may be assumed by the callee to not to trap. This may only be applied to the first parameter. This is not a valid attribute for return values."));
		keywordDoc.put("noalias", new Doc(elementType, "This indicates that pointer values based on the argument or return value do not alias pointer values which are not based on it, ignoring certain \"irrelevant\" dependencies. For a call to the parent function, dependencies between memory references from before or after the call and from those during the call are \"irrelevant\" to the noalias keyword for the arguments and return value used in that call. The caller shares the responsibility with the callee for ensuring that these requirements are met. For further details, please see the discussion of the NoAlias response in alias analysis.\nNote that this definition of noalias is intentionally similar to the definition of restrict in C99 for function arguments, though it is slightly weaker.\nFor function return values, C99's restrict is not meaningful, while LLVM's noalias is."));
		keywordDoc.put("nocapture", new Doc(elementType, "This indicates that the callee does not make any copies of the pointer that outlive the callee itself. This is not a valid attribute for return values."));
		keywordDoc.put("nest", new Doc(elementType, "This indicates that the pointer parameter can be excised using the trampoline intrinsics. This is not a valid attribute for return values."));
	}
	
	private void setupAtomicMemoryOrderingConstraints() {
		String elementType = "ordering constraint";
		keywordDoc.put("unordered", new Doc(elementType, "The set of values that can be read is governed by the happens-before partial order. A value cannot be read unless some operation wrote it. This is intended to provide a guarantee strong enough to model Java's non-volatile shared variables. This ordering cannot be specified for read-modify-write operations; it is not strong enough to make them atomic in any interesting way."));
		keywordDoc.put("monotonic", new Doc(elementType, "In addition to the guarantees of unordered, there is a single total order for modifications by monotonic operations on each address. All modification orders must be compatible with the happens-before order. There is no guarantee that the modification orders can be combined to a global total order for the whole program (and this often will not be possible). The read in an atomic read-modify-write operation (cmpxchg and atomicrmw) reads the value in the modification order immediately before the value it writes. If one atomic read happens before another atomic read of the same address, the later read must see the same value or a later value in the address's modification order. This disallows reordering of monotonic (or stronger) operations on the same address. If an address is written monotonically by one thread, and other threads monotonically read that address repeatedly, the other threads must eventually see the write. This corresponds to the C++0x/C1x memory_order_relaxed."));
		keywordDoc.put("acquire", new Doc(elementType, "In addition to the guarantees of monotonic, a synchronizes-with edge may be formed with a release operation. This is intended to model C++'s memory_order_acquire."));
		keywordDoc.put("release", new Doc(elementType, "In addition to the guarantees of monotonic, if this operation writes a value which is subsequently read by an acquire operation, it synchronizes-with that operation. (This isn't a complete description; see the C++0x definition of a release sequence.) This corresponds to the C++0x/C1x memory_order_release."));
		keywordDoc.put("acq_rel", new Doc(elementType, "(acquire+release)\nActs as both an acquire and release operation on its address. This corresponds to the C++0x/C1x memory_order_acq_rel."));
		keywordDoc.put("seq_cst", new Doc(elementType, "(sequentially consistent)\nIn addition to the guarantees of acq_rel (acquire for an operation which only reads, release for an operation which only writes), there is a global total order on all sequentially-consistent operations on all addresses, which is consistent with the happens-before partial order and with the modification orders of all the affected addresses. Each sequentially-consistent read sees the last preceding write to the same address in this global order. This corresponds to the C++0x/C1x memory_order_seq_cst and Java volatile."));
	}

}
