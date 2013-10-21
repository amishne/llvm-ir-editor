package com.intel.llvm.ireditor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.intel.llvm.ireditor.lLVM_IR.AddressSpace;
import com.intel.llvm.ireditor.lLVM_IR.Alias;
import com.intel.llvm.ireditor.lLVM_IR.Aliasee;
import com.intel.llvm.ireditor.lLVM_IR.AlignStack;
import com.intel.llvm.ireditor.lLVM_IR.ArgList;
import com.intel.llvm.ireditor.lLVM_IR.Argument;
import com.intel.llvm.ireditor.lLVM_IR.ArrayConstant;
import com.intel.llvm.ireditor.lLVM_IR.ArrayType;
import com.intel.llvm.ireditor.lLVM_IR.AttributeGroup;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.BlockAddress;
import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector;
import com.intel.llvm.ireditor.lLVM_IR.ConstantList;
import com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction;
import com.intel.llvm.ireditor.lLVM_IR.FastMathFlag;
import com.intel.llvm.ireditor.lLVM_IR.FloatingType;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDecl;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDef;
import com.intel.llvm.ireditor.lLVM_IR.FunctionHeader;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.GlobalVariable;
import com.intel.llvm.ireditor.lLVM_IR.InlineAsm;
import com.intel.llvm.ireditor.lLVM_IR.InlineAssembler;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_add;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_and;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_ashr;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_br;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_extractvalue;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fadd;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fdiv;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fence;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fmul;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_frem;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fsub;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_insertvalue;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_load;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_lshr;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_mul;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_or;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_phi;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_resume;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_ret;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_sdiv;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_select;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_shl;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_srem;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_store;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_sub;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_switch;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_udiv;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_unreachable;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_urem;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_va_arg;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_xor;
import com.intel.llvm.ireditor.lLVM_IR.IntType;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.LandingpadClause;
import com.intel.llvm.ireditor.lLVM_IR.LocalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.MetadataNode;
import com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement;
import com.intel.llvm.ireditor.lLVM_IR.MetadataRef;
import com.intel.llvm.ireditor.lLVM_IR.MetadataString;
import com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix;
import com.intel.llvm.ireditor.lLVM_IR.MetadataType;
import com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Model;
import com.intel.llvm.ireditor.lLVM_IR.NamedMetadata;
import com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType;
import com.intel.llvm.ireditor.lLVM_IR.NonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.OpaqueType;
import com.intel.llvm.ireditor.lLVM_IR.Parameter;
import com.intel.llvm.ireditor.lLVM_IR.ParameterAttributes;
import com.intel.llvm.ireditor.lLVM_IR.ParameterType;
import com.intel.llvm.ireditor.lLVM_IR.Parameters;
import com.intel.llvm.ireditor.lLVM_IR.SimpleConstant;
import com.intel.llvm.ireditor.lLVM_IR.Star;
import com.intel.llvm.ireditor.lLVM_IR.StartingInstruction;
import com.intel.llvm.ireditor.lLVM_IR.StructType;
import com.intel.llvm.ireditor.lLVM_IR.StructureConstant;
import com.intel.llvm.ireditor.lLVM_IR.TargetInfo;
import com.intel.llvm.ireditor.lLVM_IR.TargetSpecificAttribute;
import com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.TypeDef;
import com.intel.llvm.ireditor.lLVM_IR.TypeSuffix;
import com.intel.llvm.ireditor.lLVM_IR.TypedConstant;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;
import com.intel.llvm.ireditor.lLVM_IR.Undef;
import com.intel.llvm.ireditor.lLVM_IR.VectorConstant;
import com.intel.llvm.ireditor.lLVM_IR.VectorType;
import com.intel.llvm.ireditor.lLVM_IR.VoidType;
import com.intel.llvm.ireditor.lLVM_IR.X86mmxType;
import com.intel.llvm.ireditor.lLVM_IR.ZeroInitializer;
import com.intel.llvm.ireditor.services.LLVM_IRGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LLVM_IRSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LLVM_IRGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LLVM_IRPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LLVM_IRPackage.ADDRESS_SPACE:
				if(context == grammarAccess.getAddressSpaceRule()) {
					sequence_AddressSpace(context, (AddressSpace) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.ALIAS:
				if(context == grammarAccess.getAliasRule() ||
				   context == grammarAccess.getGlobalValueRule() ||
				   context == grammarAccess.getGlobalValueDefRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_Alias(context, (Alias) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.ALIASEE:
				if(context == grammarAccess.getAliaseeRule()) {
					sequence_Aliasee(context, (Aliasee) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.ALIGN_STACK:
				if(context == grammarAccess.getAlignStackRule()) {
					sequence_AlignStack(context, (AlignStack) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.ARG_LIST:
				if(context == grammarAccess.getArgListRule()) {
					sequence_ArgList(context, (ArgList) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.ARGUMENT:
				if(context == grammarAccess.getArgumentRule()) {
					sequence_Argument(context, (Argument) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.ARRAY_CONSTANT:
				if(context == grammarAccess.getArrayConstantRule() ||
				   context == grammarAccess.getConstantRule()) {
					sequence_ArrayConstant(context, (ArrayConstant) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.ARRAY_TYPE:
				if(context == grammarAccess.getArrayTypeRule()) {
					sequence_ArrayType(context, (ArrayType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.ATTRIBUTE_GROUP:
				if(context == grammarAccess.getAttributeGroupRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_AttributeGroup(context, (AttributeGroup) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.BASIC_BLOCK:
				if(context == grammarAccess.getBasicBlockRule()) {
					sequence_BasicBlock(context, (BasicBlock) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.BASIC_BLOCK_REF:
				if(context == grammarAccess.getBasicBlockRefRule()) {
					sequence_BasicBlockRef(context, (BasicBlockRef) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.BLOCK_ADDRESS:
				if(context == grammarAccess.getBlockAddressRule() ||
				   context == grammarAccess.getConstantRule()) {
					sequence_BlockAddress(context, (BlockAddress) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_BINARY:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_binaryRule()) {
					sequence_ConstantExpression_binary(context, (ConstantExpression_binary) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_COMPARE:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_compareRule()) {
					sequence_ConstantExpression_compare(context, (ConstantExpression_compare) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_convertRule()) {
					sequence_ConstantExpression_convert(context, (ConstantExpression_convert) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_extractelementRule()) {
					sequence_ConstantExpression_extractelement(context, (ConstantExpression_extractelement) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTVALUE:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_extractvalueRule()) {
					sequence_ConstantExpression_extractvalue(context, (ConstantExpression_extractvalue) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_getelementptrRule()) {
					sequence_ConstantExpression_getelementptr(context, (ConstantExpression_getelementptr) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_insertelementRule()) {
					sequence_ConstantExpression_insertelement(context, (ConstantExpression_insertelement) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_insertvalueRule()) {
					sequence_ConstantExpression_insertvalue(context, (ConstantExpression_insertvalue) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_SELECT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_selectRule()) {
					sequence_ConstantExpression_select(context, (ConstantExpression_select) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_EXPRESSION_SHUFFLEVECTOR:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getConstantExpression_shufflevectorRule()) {
					sequence_ConstantExpression_shufflevector(context, (ConstantExpression_shufflevector) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONSTANT_LIST:
				if(context == grammarAccess.getConstantListRule()) {
					sequence_ConstantList(context, (ConstantList) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.CONVERSION_INSTRUCTION:
				if(context == grammarAccess.getConversionInstructionRule()) {
					sequence_ConversionInstruction(context, (ConversionInstruction) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.FAST_MATH_FLAG:
				if(context == grammarAccess.getFastMathFlagRule()) {
					sequence_FastMathFlag(context, (FastMathFlag) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.FLOATING_TYPE:
				if(context == grammarAccess.getFloatingTypeRule()) {
					sequence_FloatingType(context, (FloatingType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.FUNCTION_ATTRIBUTE:
				if(context == grammarAccess.getFunctionAttributeRule()) {
					sequence_FunctionAttribute(context, (FunctionAttribute) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.FUNCTION_ATTRIBUTES:
				if(context == grammarAccess.getFunctionAttributesRule()) {
					sequence_FunctionAttributes(context, (FunctionAttributes) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.FUNCTION_DECL:
				if(context == grammarAccess.getFunctionRule() ||
				   context == grammarAccess.getFunctionDeclRule() ||
				   context == grammarAccess.getGlobalValueRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_FunctionDecl(context, (FunctionDecl) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.FUNCTION_DEF:
				if(context == grammarAccess.getFunctionRule() ||
				   context == grammarAccess.getFunctionDefRule() ||
				   context == grammarAccess.getGlobalValueRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_FunctionDef(context, (FunctionDef) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.FUNCTION_HEADER:
				if(context == grammarAccess.getFunctionHeaderRule() ||
				   context == grammarAccess.getGlobalValueDefRule()) {
					sequence_FunctionHeader(context, (FunctionHeader) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.GLOBAL_VALUE_REF:
				if(context == grammarAccess.getCalleeRule() ||
				   context == grammarAccess.getGlobalValueRefRule() ||
				   context == grammarAccess.getValueRefRule()) {
					sequence_GlobalValueRef(context, (GlobalValueRef) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.GLOBAL_VARIABLE:
				if(context == grammarAccess.getGlobalValueRule() ||
				   context == grammarAccess.getGlobalValueDefRule() ||
				   context == grammarAccess.getGlobalVariableRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_GlobalVariable(context, (GlobalVariable) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INLINE_ASM:
				if(context == grammarAccess.getInlineAsmRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_InlineAsm(context, (InlineAsm) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INLINE_ASSEMBLER:
				if(context == grammarAccess.getCalleeRule() ||
				   context == grammarAccess.getInlineAssemblerRule()) {
					sequence_InlineAssembler(context, (InlineAssembler) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_ADD:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_addRule()) {
					sequence_Instruction_add(context, (Instruction_add) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_ALLOCA:
				if(context == grammarAccess.getInstruction_allocaRule() ||
				   context == grammarAccess.getMemoryInstructionRule()) {
					sequence_Instruction_alloca(context, (Instruction_alloca) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_AND:
				if(context == grammarAccess.getBitwiseBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_andRule()) {
					sequence_Instruction_and(context, (Instruction_and) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_ASHR:
				if(context == grammarAccess.getBitwiseBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_ashrRule()) {
					sequence_Instruction_ashr(context, (Instruction_ashr) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_ATOMICRMW:
				if(context == grammarAccess.getInstruction_atomicrmwRule() ||
				   context == grammarAccess.getMemoryInstructionRule()) {
					sequence_Instruction_atomicrmw(context, (Instruction_atomicrmw) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_BR:
				if(context == grammarAccess.getInstruction_brRule()) {
					sequence_Instruction_br(context, (Instruction_br) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID:
				if(context == grammarAccess.getInstruction_call_nonVoidRule()) {
					sequence_Instruction_call_nonVoid(context, (Instruction_call_nonVoid) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_CALL_VOID:
				if(context == grammarAccess.getInstruction_call_voidRule()) {
					sequence_Instruction_call_void(context, (Instruction_call_void) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_CMPXCHG:
				if(context == grammarAccess.getInstruction_cmpxchgRule() ||
				   context == grammarAccess.getMemoryInstructionRule()) {
					sequence_Instruction_cmpxchg(context, (Instruction_cmpxchg) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_EXTRACTELEMENT:
				if(context == grammarAccess.getInstruction_extractelementRule() ||
				   context == grammarAccess.getVectorInstructionsRule()) {
					sequence_Instruction_extractelement(context, (Instruction_extractelement) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_EXTRACTVALUE:
				if(context == grammarAccess.getAggregateInstructionRule() ||
				   context == grammarAccess.getInstruction_extractvalueRule()) {
					sequence_Instruction_extractvalue(context, (Instruction_extractvalue) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_FADD:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_faddRule()) {
					sequence_Instruction_fadd(context, (Instruction_fadd) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_FCMP:
				if(context == grammarAccess.getInstruction_fcmpRule() ||
				   context == grammarAccess.getOtherInstructionRule()) {
					sequence_Instruction_fcmp(context, (Instruction_fcmp) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_FDIV:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_fdivRule()) {
					sequence_Instruction_fdiv(context, (Instruction_fdiv) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_FENCE:
				if(context == grammarAccess.getInstruction_fenceRule() ||
				   context == grammarAccess.getMemoryInstructionRule()) {
					sequence_Instruction_fence(context, (Instruction_fence) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_FMUL:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_fmulRule()) {
					sequence_Instruction_fmul(context, (Instruction_fmul) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_FREM:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_fremRule()) {
					sequence_Instruction_frem(context, (Instruction_frem) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_FSUB:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_fsubRule()) {
					sequence_Instruction_fsub(context, (Instruction_fsub) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_GETELEMENTPTR:
				if(context == grammarAccess.getInstruction_getelementptrRule() ||
				   context == grammarAccess.getMemoryInstructionRule()) {
					sequence_Instruction_getelementptr(context, (Instruction_getelementptr) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_ICMP:
				if(context == grammarAccess.getInstruction_icmpRule() ||
				   context == grammarAccess.getOtherInstructionRule()) {
					sequence_Instruction_icmp(context, (Instruction_icmp) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_INDIRECTBR:
				if(context == grammarAccess.getInstruction_indirectbrRule()) {
					sequence_Instruction_indirectbr(context, (Instruction_indirectbr) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_INSERTELEMENT:
				if(context == grammarAccess.getInstruction_insertelementRule() ||
				   context == grammarAccess.getVectorInstructionsRule()) {
					sequence_Instruction_insertelement(context, (Instruction_insertelement) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_INSERTVALUE:
				if(context == grammarAccess.getAggregateInstructionRule() ||
				   context == grammarAccess.getInstruction_insertvalueRule()) {
					sequence_Instruction_insertvalue(context, (Instruction_insertvalue) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_INVOKE_NON_VOID:
				if(context == grammarAccess.getInstruction_invoke_nonVoidRule()) {
					sequence_Instruction_invoke_nonVoid(context, (Instruction_invoke_nonVoid) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_INVOKE_VOID:
				if(context == grammarAccess.getInstruction_invoke_voidRule()) {
					sequence_Instruction_invoke_void(context, (Instruction_invoke_void) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_LANDINGPAD:
				if(context == grammarAccess.getInstruction_landingpadRule() ||
				   context == grammarAccess.getOtherInstructionRule()) {
					sequence_Instruction_landingpad(context, (Instruction_landingpad) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_LOAD:
				if(context == grammarAccess.getInstruction_loadRule() ||
				   context == grammarAccess.getMemoryInstructionRule()) {
					sequence_Instruction_load(context, (Instruction_load) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_LSHR:
				if(context == grammarAccess.getBitwiseBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_lshrRule()) {
					sequence_Instruction_lshr(context, (Instruction_lshr) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_MUL:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_mulRule()) {
					sequence_Instruction_mul(context, (Instruction_mul) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_OR:
				if(context == grammarAccess.getBitwiseBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_orRule()) {
					sequence_Instruction_or(context, (Instruction_or) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_PHI:
				if(context == grammarAccess.getInstruction_phiRule()) {
					sequence_Instruction_phi(context, (Instruction_phi) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_RESUME:
				if(context == grammarAccess.getInstruction_resumeRule()) {
					sequence_Instruction_resume(context, (Instruction_resume) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_RET:
				if(context == grammarAccess.getInstruction_retRule()) {
					sequence_Instruction_ret(context, (Instruction_ret) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_SDIV:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_sdivRule()) {
					sequence_Instruction_sdiv(context, (Instruction_sdiv) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_SELECT:
				if(context == grammarAccess.getInstruction_selectRule() ||
				   context == grammarAccess.getOtherInstructionRule()) {
					sequence_Instruction_select(context, (Instruction_select) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_SHL:
				if(context == grammarAccess.getBitwiseBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_shlRule()) {
					sequence_Instruction_shl(context, (Instruction_shl) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR:
				if(context == grammarAccess.getInstruction_shufflevectorRule() ||
				   context == grammarAccess.getVectorInstructionsRule()) {
					sequence_Instruction_shufflevector(context, (Instruction_shufflevector) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_SREM:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_sremRule()) {
					sequence_Instruction_srem(context, (Instruction_srem) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_STORE:
				if(context == grammarAccess.getInstruction_storeRule() ||
				   context == grammarAccess.getMemoryInstructionRule()) {
					sequence_Instruction_store(context, (Instruction_store) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_SUB:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_subRule()) {
					sequence_Instruction_sub(context, (Instruction_sub) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_SWITCH:
				if(context == grammarAccess.getInstruction_switchRule()) {
					sequence_Instruction_switch(context, (Instruction_switch) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_UDIV:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_udivRule()) {
					sequence_Instruction_udiv(context, (Instruction_udiv) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_UNREACHABLE:
				if(context == grammarAccess.getInstruction_unreachableRule()) {
					sequence_Instruction_unreachable(context, (Instruction_unreachable) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_UREM:
				if(context == grammarAccess.getBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_uremRule()) {
					sequence_Instruction_urem(context, (Instruction_urem) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_VA_ARG:
				if(context == grammarAccess.getInstruction_va_argRule() ||
				   context == grammarAccess.getOtherInstructionRule()) {
					sequence_Instruction_va_arg(context, (Instruction_va_arg) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INSTRUCTION_XOR:
				if(context == grammarAccess.getBitwiseBinaryInstructionRule() ||
				   context == grammarAccess.getInstruction_xorRule()) {
					sequence_Instruction_xor(context, (Instruction_xor) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.INT_TYPE:
				if(context == grammarAccess.getIntTypeRule()) {
					sequence_IntType(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.LANDINGPAD_CLAUSE:
				if(context == grammarAccess.getLandingpadClauseRule()) {
					sequence_LandingpadClause(context, (LandingpadClause) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.LOCAL_VALUE_REF:
				if(context == grammarAccess.getCalleeRule() ||
				   context == grammarAccess.getLocalValueRefRule() ||
				   context == grammarAccess.getValueRefRule()) {
					sequence_LocalValueRef(context, (LocalValueRef) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.METADATA_NODE:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getMetadataNodeRule()) {
					sequence_MetadataNode(context, (MetadataNode) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.METADATA_NODE_ELEMENT:
				if(context == grammarAccess.getMetadataNodeElementRule()) {
					sequence_MetadataNodeElement(context, (MetadataNodeElement) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.METADATA_REF:
				if(context == grammarAccess.getMetadataRefRule()) {
					sequence_MetadataRef(context, (MetadataRef) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.METADATA_STRING:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getMetadataStringRule()) {
					sequence_MetadataString(context, (MetadataString) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.METADATA_SUFFIX:
				if(context == grammarAccess.getMetadataSuffixRule()) {
					sequence_MetadataSuffix(context, (MetadataSuffix) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.METADATA_TYPE:
				if(context == grammarAccess.getMetadataTypeRule()) {
					sequence_MetadataType(context, (MetadataType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.MIDDLE_INSTRUCTION:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getMiddleInstructionRule()) {
					sequence_MiddleInstruction(context, (MiddleInstruction) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.NAMED_METADATA:
				if(context == grammarAccess.getNamedMetadataRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_NamedMetadata(context, (NamedMetadata) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.NAMED_MIDDLE_INSTRUCTION:
				if(context == grammarAccess.getLocalValueRule() ||
				   context == grammarAccess.getNamedInstructionRule() ||
				   context == grammarAccess.getNamedMiddleInstructionRule()) {
					sequence_NamedMiddleInstruction(context, (NamedMiddleInstruction) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.NAMED_TERMINATOR_INSTRUCTION:
				if(context == grammarAccess.getLocalValueRule() ||
				   context == grammarAccess.getNamedInstructionRule() ||
				   context == grammarAccess.getNamedTerminatorInstructionRule()) {
					sequence_NamedTerminatorInstruction(context, (NamedTerminatorInstruction) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE:
				if(context == grammarAccess.getNonLeftRecursiveNonVoidTypeRule()) {
					sequence_NonLeftRecursiveNonVoidType(context, (NonLeftRecursiveNonVoidType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.NON_LEFT_RECURSIVE_TYPE:
				if(context == grammarAccess.getNonLeftRecursiveTypeRule()) {
					sequence_NonLeftRecursiveType(context, (NonLeftRecursiveType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.NON_VOID_TYPE:
				if(context == grammarAccess.getNonVoidTypeRule()) {
					sequence_NonVoidType(context, (NonVoidType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.OPAQUE_TYPE:
				if(context == grammarAccess.getOpaqueTypeRule()) {
					sequence_OpaqueType(context, (OpaqueType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.PARAMETER:
				if(context == grammarAccess.getLocalValueRule() ||
				   context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.PARAMETER_ATTRIBUTES:
				if(context == grammarAccess.getParameterAttributesRule()) {
					sequence_ParameterAttributes(context, (ParameterAttributes) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.PARAMETER_TYPE:
				if(context == grammarAccess.getParameterTypeRule()) {
					sequence_ParameterType(context, (ParameterType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.PARAMETERS:
				if(context == grammarAccess.getParametersRule()) {
					sequence_Parameters(context, (Parameters) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.SIMPLE_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getSimpleConstantRule()) {
					sequence_SimpleConstant(context, (SimpleConstant) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.STAR:
				if(context == grammarAccess.getStarRule()) {
					sequence_Star(context, (Star) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.STARTING_INSTRUCTION:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLocalValueRule() ||
				   context == grammarAccess.getNamedInstructionRule() ||
				   context == grammarAccess.getStartingInstructionRule()) {
					sequence_StartingInstruction(context, (StartingInstruction) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.STRUCT_TYPE:
				if(context == grammarAccess.getStructTypeRule()) {
					sequence_StructType(context, (StructType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.STRUCTURE_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getStructureConstantRule()) {
					sequence_StructureConstant(context, (StructureConstant) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.TARGET_INFO:
				if(context == grammarAccess.getTargetInfoRule() ||
				   context == grammarAccess.getTopLevelElementRule()) {
					sequence_TargetInfo(context, (TargetInfo) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.TARGET_SPECIFIC_ATTRIBUTE:
				if(context == grammarAccess.getTargetSpecificAttributeRule()) {
					sequence_TargetSpecificAttribute(context, (TargetSpecificAttribute) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.TERMINATOR_INSTRUCTION:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getTerminatorInstructionRule()) {
					sequence_TerminatorInstruction(context, (TerminatorInstruction) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.TYPE_DEF:
				if(context == grammarAccess.getTopLevelElementRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_TypeDef(context, (TypeDef) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.TYPE_SUFFIX:
				if(context == grammarAccess.getTypeSuffixRule()) {
					sequence_TypeSuffix(context, (TypeSuffix) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.TYPED_CONSTANT:
				if(context == grammarAccess.getTypedConstantRule()) {
					sequence_TypedConstant(context, (TypedConstant) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.TYPED_VALUE:
				if(context == grammarAccess.getTypedValueRule()) {
					sequence_TypedValue(context, (TypedValue) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.UNDEF:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getUndefRule()) {
					sequence_Undef(context, (Undef) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.VECTOR_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getVectorConstantRule()) {
					sequence_VectorConstant(context, (VectorConstant) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.VECTOR_TYPE:
				if(context == grammarAccess.getVectorTypeRule()) {
					sequence_VectorType(context, (VectorType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.VOID_TYPE:
				if(context == grammarAccess.getVoidTypeRule()) {
					sequence_VoidType(context, (VoidType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.X8_6MMX_TYPE:
				if(context == grammarAccess.getX86mmxTypeRule()) {
					sequence_X86mmxType(context, (X86mmxType) semanticObject); 
					return; 
				}
				else break;
			case LLVM_IRPackage.ZERO_INITIALIZER:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getZeroInitializerRule()) {
					sequence_ZeroInitializer(context, (ZeroInitializer) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=INTEGER
	 */
	protected void sequence_AddressSpace(EObject context, AddressSpace semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.ADDRESS_SPACE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.ADDRESS_SPACE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddressSpaceAccess().getValueINTEGERTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=GlobalName linkage=Linkage? visibility=Visibility? type=Type aliasee=Aliasee)
	 */
	protected void sequence_Alias(EObject context, Alias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=[GlobalValueDef|GLOBAL_ID] | bitcast=ConstantExpression_convert)
	 */
	protected void sequence_Aliasee(EObject context, Aliasee semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {AlignStack}
	 */
	protected void sequence_AlignStack(EObject context, AlignStack semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arguments+=Argument arguments+=Argument*)?)
	 */
	protected void sequence_ArgList(EObject context, ArgList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ParameterType ref=ValueRef)
	 */
	protected void sequence_Argument(EObject context, Argument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.ARGUMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.ARGUMENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.ARGUMENT__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.ARGUMENT__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArgumentAccess().getTypeParameterTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getArgumentAccess().getRefValueRefParserRuleCall_1_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (list=ConstantList?)
	 */
	protected void sequence_ArrayConstant(EObject context, ArrayConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (size=INTEGER elemType=Type)
	 */
	protected void sequence_ArrayType(EObject context, ArrayType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.ARRAY_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.ARRAY_TYPE__SIZE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.ARRAY_TYPE__ELEM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.ARRAY_TYPE__ELEM_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrayTypeAccess().getSizeINTEGERTerminalRuleCall_1_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getArrayTypeAccess().getElemTypeTypeParserRuleCall_3_0(), semanticObject.getElemType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ATTRIBUTE_ID 
	 *         (attributes+=FunctionAttribute | (alignstack+=AlignStack alignstackValue+=INTEGER) | targetSpecificAttributes+=TargetSpecificAttribute)+
	 *     )
	 */
	protected void sequence_AttributeGroup(EObject context, AttributeGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[BasicBlock|LOCAL_ID]
	 */
	protected void sequence_BasicBlockRef(EObject context, BasicBlockRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BASIC_BLOCK_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BASIC_BLOCK_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBasicBlockRefAccess().getRefBasicBlockLOCAL_IDTerminalRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=BasicBlockName instructions+=StartingInstruction* instructions+=MiddleInstruction* instructions+=TerminatorInstruction)
	 */
	protected void sequence_BasicBlock(EObject context, BasicBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=GlobalValueRef basicBlock=BasicBlockRef)
	 */
	protected void sequence_BlockAddress(EObject context, BlockAddress semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             opcode='add' | 
	 *             opcode='sub' | 
	 *             opcode='mul' | 
	 *             opcode='shl' | 
	 *             opcode='sdiv' | 
	 *             opcode='udiv' | 
	 *             opcode='lshr' | 
	 *             opcode='ashr' | 
	 *             opcode='fadd' | 
	 *             opcode='fsub' | 
	 *             opcode='fmul' | 
	 *             opcode='fdiv' | 
	 *             opcode='urem' | 
	 *             opcode='srem' | 
	 *             opcode='frem' | 
	 *             opcode='and' | 
	 *             opcode='or' | 
	 *             opcode='xor'
	 *         ) 
	 *         op1=TypedValue 
	 *         op2=TypedValue
	 *     )
	 */
	protected void sequence_ConstantExpression_binary(EObject context, ConstantExpression_binary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((opcode='icmp' condition=IcmpCondition) | (opcode='fcmp' condition=FcmpCondition)) op1=TypedValue op2=TypedValue)
	 */
	protected void sequence_ConstantExpression_compare(EObject context, ConstantExpression_compare semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode=ConvertionOpcode fromType=Type constant=GlobalValueRef targetType=Type)
	 */
	protected void sequence_ConstantExpression_convert(EObject context, ConstantExpression_convert semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='extractelement' vector=TypedValue index=TypedValue)
	 */
	protected void sequence_ConstantExpression_extractelement(EObject context, ConstantExpression_extractelement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='extractvalue' value=TypedValue indices+=INTEGER+)
	 */
	protected void sequence_ConstantExpression_extractvalue(EObject context, ConstantExpression_extractvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='getelementptr' constantType=Type constant=GlobalValueRef (indexTypes+=Type indices+=Constant)*)
	 */
	protected void sequence_ConstantExpression_getelementptr(EObject context, ConstantExpression_getelementptr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='insertelement' vectorType=VectorType vector=ValueRef element=TypedValue index=TypedValue)
	 */
	protected void sequence_ConstantExpression_insertelement(EObject context, ConstantExpression_insertelement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='insertvalue' value=TypedValue element=TypedValue indices+=INTEGER+)
	 */
	protected void sequence_ConstantExpression_insertvalue(EObject context, ConstantExpression_insertvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='select' condition=TypedValue op1=TypedValue op2=TypedValue)
	 */
	protected void sequence_ConstantExpression_select(EObject context, ConstantExpression_select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='shufflevector' vector1=TypedValue vector2=TypedValue mask=TypedValue)
	 */
	protected void sequence_ConstantExpression_shufflevector(EObject context, ConstantExpression_shufflevector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typedConstants+=TypedConstant typedConstants+=TypedConstant*)
	 */
	protected void sequence_ConstantList(EObject context, ConstantList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[GlobalValueDef|GLOBAL_ID]
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.CONSTANT__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.CONSTANT__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getRefGlobalValueDefGLOBAL_IDTerminalRuleCall_10_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode=ConvertionOpcode fromType=Type value=ValueRef targetType=Type)
	 */
	protected void sequence_ConversionInstruction(EObject context, ConversionInstruction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.CONVERSION_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.CONVERSION_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.CONVERSION_INSTRUCTION__FROM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.CONVERSION_INSTRUCTION__FROM_TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.CONVERSION_INSTRUCTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.CONVERSION_INSTRUCTION__VALUE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.CONVERSION_INSTRUCTION__TARGET_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.CONVERSION_INSTRUCTION__TARGET_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConversionInstructionAccess().getOpcodeConvertionOpcodeParserRuleCall_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getConversionInstructionAccess().getFromTypeTypeParserRuleCall_1_0(), semanticObject.getFromType());
		feeder.accept(grammarAccess.getConversionInstructionAccess().getValueValueRefParserRuleCall_2_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getConversionInstructionAccess().getTargetTypeTypeParserRuleCall_4_0(), semanticObject.getTargetType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (kind='nnan' | kind='ninf' | kind='nsz' | kind='arcp' | kind='fast')
	 */
	protected void sequence_FastMathFlag(EObject context, FastMathFlag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FloatingType}
	 */
	protected void sequence_FloatingType(EObject context, FloatingType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         attribute='address_safety' | 
	 *         attribute='alwaysinline' | 
	 *         attribute='builtin' | 
	 *         attribute='inlinehint' | 
	 *         attribute='naked' | 
	 *         attribute='nobuiltin' | 
	 *         attribute='noduplicate' | 
	 *         attribute='noimplicitfloat' | 
	 *         attribute='noinline' | 
	 *         attribute='nonlazybind' | 
	 *         attribute='noredzone' | 
	 *         attribute='noreturn' | 
	 *         attribute='nounwind' | 
	 *         attribute='optsize' | 
	 *         attribute='readnone' | 
	 *         attribute='readonly' | 
	 *         attribute='returns_twice' | 
	 *         attribute='ssp' | 
	 *         attribute='sspreq' | 
	 *         attribute='sspstrong' | 
	 *         attribute='uwtable'
	 *     )
	 */
	protected void sequence_FunctionAttribute(EObject context, FunctionAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         functionAttributes+=FunctionAttribute | 
	 *         (alignstack+=AlignStack alignstackValue+=INTEGER) | 
	 *         functionAttributeGroupRefs+=[AttributeGroup|ATTRIBUTE_ID]
	 *     )+
	 */
	protected void sequence_FunctionAttributes(EObject context, FunctionAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     header=FunctionHeader
	 */
	protected void sequence_FunctionDecl(EObject context, FunctionDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.FUNCTION__HEADER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.FUNCTION__HEADER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionDeclAccess().getHeaderFunctionHeaderParserRuleCall_1_0(), semanticObject.getHeader());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (header=FunctionHeader basicBlocks+=BasicBlock+)
	 */
	protected void sequence_FunctionDef(EObject context, FunctionDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         linkage=Linkage? 
	 *         visibility=Visibility? 
	 *         cconv=CConv? 
	 *         rettypeAttrs=ParameterAttributes? 
	 *         rettype=Type 
	 *         name=GLOBAL_ID 
	 *         parameters=Parameters 
	 *         attrs=FunctionAttributes? 
	 *         section=Section? 
	 *         align=Align? 
	 *         gc=Gc?
	 *     )
	 */
	protected void sequence_FunctionHeader(EObject context, FunctionHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constant=Constant | metadata=MetadataRef)
	 */
	protected void sequence_GlobalValueRef(EObject context, GlobalValueRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=GlobalName 
	 *         linkage=Linkage? 
	 *         addrspace=AddressSpace? 
	 *         tlsModel=TLSmodel? 
	 *         type=Type 
	 *         initialValue=Constant? 
	 *         section=Section? 
	 *         align=Align?
	 *     )
	 */
	protected void sequence_GlobalVariable(EObject context, GlobalVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     asmLine=STRING
	 */
	protected void sequence_InlineAsm(EObject context, InlineAsm semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INLINE_ASM__ASM_LINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INLINE_ASM__ASM_LINE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInlineAsmAccess().getAsmLineSTRINGTerminalRuleCall_2_0(), semanticObject.getAsmLine());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (assembler=STRING flags=STRING)
	 */
	protected void sequence_InlineAssembler(EObject context, InlineAssembler semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INLINE_ASSEMBLER__ASSEMBLER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INLINE_ASSEMBLER__ASSEMBLER));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INLINE_ASSEMBLER__FLAGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INLINE_ASSEMBLER__FLAGS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInlineAssemblerAccess().getAssemblerSTRINGTerminalRuleCall_4_0(), semanticObject.getAssembler());
		feeder.accept(grammarAccess.getInlineAssemblerAccess().getFlagsSTRINGTerminalRuleCall_6_0(), semanticObject.getFlags());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='add' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_add(EObject context, Instruction_add semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_addAccess().getOpcodeAddKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_addAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_addAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_addAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='alloca' type=Type numElements=TypedValue? alignment=Align?)
	 */
	protected void sequence_Instruction_alloca(EObject context, Instruction_alloca semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='and' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_and(EObject context, Instruction_and semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_andAccess().getOpcodeAndKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_andAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_andAccess().getOp1ValueRefParserRuleCall_2_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_andAccess().getOp2ValueRefParserRuleCall_4_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='ashr' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_ashr(EObject context, Instruction_ashr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_ashrAccess().getOpcodeAshrKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_ashrAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_ashrAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_ashrAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='atomicrmw' operation=Atomicrmw_operation pointer=TypedValue argument=TypedValue ordering=Ordering)
	 */
	protected void sequence_Instruction_atomicrmw(EObject context, Instruction_atomicrmw semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.MEMORY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.MEMORY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ATOMICRMW__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ATOMICRMW__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ATOMICRMW__POINTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ATOMICRMW__POINTER));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ATOMICRMW__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ATOMICRMW__ARGUMENT));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ATOMICRMW__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ATOMICRMW__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_atomicrmwAccess().getOpcodeAtomicrmwKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_atomicrmwAccess().getOperationAtomicrmw_operationParserRuleCall_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getInstruction_atomicrmwAccess().getPointerTypedValueParserRuleCall_3_0(), semanticObject.getPointer());
		feeder.accept(grammarAccess.getInstruction_atomicrmwAccess().getArgumentTypedValueParserRuleCall_5_0(), semanticObject.getArgument());
		feeder.accept(grammarAccess.getInstruction_atomicrmwAccess().getOrderingOrderingParserRuleCall_7_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='br' ((condition=TypedValue true=BasicBlockRef false=BasicBlockRef) | unconditional=BasicBlockRef))
	 */
	protected void sequence_Instruction_br(EObject context, Instruction_br semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isTail?='tail'? 
	 *         opcode='call' 
	 *         cconv=CConv? 
	 *         returnAttributes=ParameterAttributes? 
	 *         type=NonVoidType 
	 *         callee=Callee 
	 *         args=ArgList 
	 *         functionAttributes=FunctionAttributes?
	 *     )
	 */
	protected void sequence_Instruction_call_nonVoid(EObject context, Instruction_call_nonVoid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isTail?='tail'? 
	 *         opcode='call' 
	 *         cconv=CConv? 
	 *         returnAttributes=ParameterAttributes? 
	 *         type=VoidType 
	 *         callee=Callee 
	 *         args=ArgList 
	 *         functionAttributes=FunctionAttributes?
	 *     )
	 */
	protected void sequence_Instruction_call_void(EObject context, Instruction_call_void semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='cmpxchg' pointer=TypedValue comparedWith=TypedValue newValue=TypedValue ordering=Ordering)
	 */
	protected void sequence_Instruction_cmpxchg(EObject context, Instruction_cmpxchg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.MEMORY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.MEMORY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_CMPXCHG__POINTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_CMPXCHG__POINTER));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_CMPXCHG__COMPARED_WITH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_CMPXCHG__COMPARED_WITH));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_CMPXCHG__NEW_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_CMPXCHG__NEW_VALUE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_CMPXCHG__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_CMPXCHG__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_cmpxchgAccess().getOpcodeCmpxchgKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_cmpxchgAccess().getPointerTypedValueParserRuleCall_2_0(), semanticObject.getPointer());
		feeder.accept(grammarAccess.getInstruction_cmpxchgAccess().getComparedWithTypedValueParserRuleCall_4_0(), semanticObject.getComparedWith());
		feeder.accept(grammarAccess.getInstruction_cmpxchgAccess().getNewValueTypedValueParserRuleCall_6_0(), semanticObject.getNewValue());
		feeder.accept(grammarAccess.getInstruction_cmpxchgAccess().getOrderingOrderingParserRuleCall_8_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='extractelement' vector=TypedValue index=TypedValue)
	 */
	protected void sequence_Instruction_extractelement(EObject context, Instruction_extractelement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.VECTOR_INSTRUCTIONS__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.VECTOR_INSTRUCTIONS__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_EXTRACTELEMENT__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_EXTRACTELEMENT__VECTOR));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_EXTRACTELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_EXTRACTELEMENT__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_extractelementAccess().getOpcodeExtractelementKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_extractelementAccess().getVectorTypedValueParserRuleCall_1_0(), semanticObject.getVector());
		feeder.accept(grammarAccess.getInstruction_extractelementAccess().getIndexTypedValueParserRuleCall_3_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='extractvalue' aggregate=TypedValue indices+=Constant+)
	 */
	protected void sequence_Instruction_extractvalue(EObject context, Instruction_extractvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='fadd' fastMathFlags+=FastMathFlag* type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_fadd(EObject context, Instruction_fadd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='fcmp' condition=FcmpCondition type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_fcmp(EObject context, Instruction_fcmp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.OTHER_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.OTHER_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FCMP__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FCMP__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FCMP__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FCMP__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FCMP__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FCMP__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FCMP__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FCMP__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_fcmpAccess().getOpcodeFcmpKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_fcmpAccess().getConditionFcmpConditionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getInstruction_fcmpAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_fcmpAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_fcmpAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='fdiv' fastMathFlags+=FastMathFlag* type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_fdiv(EObject context, Instruction_fdiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='fence' ordering=Ordering)
	 */
	protected void sequence_Instruction_fence(EObject context, Instruction_fence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.MEMORY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.MEMORY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FENCE__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_FENCE__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_fenceAccess().getOpcodeFenceKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_fenceAccess().getOrderingOrderingParserRuleCall_2_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='fmul' fastMathFlags+=FastMathFlag* type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_fmul(EObject context, Instruction_fmul semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='frem' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_frem(EObject context, Instruction_frem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_fremAccess().getOpcodeFremKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_fremAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_fremAccess().getOp1ValueRefParserRuleCall_2_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_fremAccess().getOp2ValueRefParserRuleCall_4_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='fsub' fastMathFlags+=FastMathFlag* type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_fsub(EObject context, Instruction_fsub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='getelementptr' base=TypedValue indices+=TypedValue*)
	 */
	protected void sequence_Instruction_getelementptr(EObject context, Instruction_getelementptr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='icmp' condition=IcmpCondition type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_icmp(EObject context, Instruction_icmp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.OTHER_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.OTHER_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ICMP__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ICMP__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ICMP__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ICMP__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ICMP__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ICMP__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ICMP__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_ICMP__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_icmpAccess().getOpcodeIcmpKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_icmpAccess().getConditionIcmpConditionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getInstruction_icmpAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_icmpAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_icmpAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='indirectbr' address=TypedValue (destinations+=BasicBlockRef destinations+=BasicBlockRef*)?)
	 */
	protected void sequence_Instruction_indirectbr(EObject context, Instruction_indirectbr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='insertelement' vector=TypedValue element=TypedValue index=TypedValue)
	 */
	protected void sequence_Instruction_insertelement(EObject context, Instruction_insertelement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.VECTOR_INSTRUCTIONS__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.VECTOR_INSTRUCTIONS__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_INSERTELEMENT__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_INSERTELEMENT__VECTOR));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_INSERTELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_INSERTELEMENT__ELEMENT));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_INSERTELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_INSERTELEMENT__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_insertelementAccess().getOpcodeInsertelementKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_insertelementAccess().getVectorTypedValueParserRuleCall_1_0(), semanticObject.getVector());
		feeder.accept(grammarAccess.getInstruction_insertelementAccess().getElementTypedValueParserRuleCall_3_0(), semanticObject.getElement());
		feeder.accept(grammarAccess.getInstruction_insertelementAccess().getIndexTypedValueParserRuleCall_5_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='insertvalue' aggregate=TypedValue element=TypedValue indices+=Constant+)
	 */
	protected void sequence_Instruction_insertvalue(EObject context, Instruction_insertvalue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         opcode='invoke' 
	 *         cconv=CConv? 
	 *         type=NonVoidType 
	 *         callee=Callee 
	 *         args=ArgList 
	 *         attributes=FunctionAttributes? 
	 *         toLabel=BasicBlockRef 
	 *         exceptionLabel=BasicBlockRef
	 *     )
	 */
	protected void sequence_Instruction_invoke_nonVoid(EObject context, Instruction_invoke_nonVoid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         opcode='invoke' 
	 *         cconv=CConv? 
	 *         type=VoidType 
	 *         callee=Callee 
	 *         args=ArgList 
	 *         attributes=FunctionAttributes? 
	 *         toLabel=BasicBlockRef 
	 *         exceptionLabel=BasicBlockRef
	 *     )
	 */
	protected void sequence_Instruction_invoke_void(EObject context, Instruction_invoke_void semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='landingpad' resultType=Type personality=TypedValue clauses+=LandingpadClause? clauses+=LandingpadClause*)
	 */
	protected void sequence_Instruction_landingpad(EObject context, Instruction_landingpad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         opcode='load' 
	 *         (
	 *             (pointer=TypedValue alignment=Align? nontemporalIndex=MetadataRef? invariantLoadIndex=MetadataRef?) | 
	 *             (pointer=TypedValue ordering=Ordering alignment=Align)
	 *         )
	 *     )
	 */
	protected void sequence_Instruction_load(EObject context, Instruction_load semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='lshr' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_lshr(EObject context, Instruction_lshr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_lshrAccess().getOpcodeLshrKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_lshrAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_lshrAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_lshrAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='mul' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_mul(EObject context, Instruction_mul semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_mulAccess().getOpcodeMulKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_mulAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_mulAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_mulAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='or' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_or(EObject context, Instruction_or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_orAccess().getOpcodeOrKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_orAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_orAccess().getOp1ValueRefParserRuleCall_2_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_orAccess().getOp2ValueRefParserRuleCall_4_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='phi' type=Type values+=ValueRef labels+=BasicBlockRef (values+=ValueRef labels+=BasicBlockRef)*)
	 */
	protected void sequence_Instruction_phi(EObject context, Instruction_phi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='resume' value=TypedValue)
	 */
	protected void sequence_Instruction_resume(EObject context, Instruction_resume semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_RESUME__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_RESUME__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_RESUME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_RESUME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_resumeAccess().getOpcodeResumeKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_resumeAccess().getValueTypedValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='ret' val=TypedValue?)
	 */
	protected void sequence_Instruction_ret(EObject context, Instruction_ret semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='sdiv' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_sdiv(EObject context, Instruction_sdiv semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_sdivAccess().getOpcodeSdivKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_sdivAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_sdivAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_sdivAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='select' condition=TypedValue value1=TypedValue value2=TypedValue)
	 */
	protected void sequence_Instruction_select(EObject context, Instruction_select semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.OTHER_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.OTHER_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SELECT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SELECT__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SELECT__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SELECT__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SELECT__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SELECT__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_selectAccess().getOpcodeSelectKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_selectAccess().getConditionTypedValueParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getInstruction_selectAccess().getValue1TypedValueParserRuleCall_3_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getInstruction_selectAccess().getValue2TypedValueParserRuleCall_5_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='shl' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_shl(EObject context, Instruction_shl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_shlAccess().getOpcodeShlKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_shlAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_shlAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_shlAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='shufflevector' vector1=TypedValue vector2=TypedValue mask=TypedValue)
	 */
	protected void sequence_Instruction_shufflevector(EObject context, Instruction_shufflevector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.VECTOR_INSTRUCTIONS__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.VECTOR_INSTRUCTIONS__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SHUFFLEVECTOR__VECTOR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SHUFFLEVECTOR__VECTOR1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SHUFFLEVECTOR__VECTOR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SHUFFLEVECTOR__VECTOR2));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SHUFFLEVECTOR__MASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_SHUFFLEVECTOR__MASK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_shufflevectorAccess().getOpcodeShufflevectorKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_shufflevectorAccess().getVector1TypedValueParserRuleCall_1_0(), semanticObject.getVector1());
		feeder.accept(grammarAccess.getInstruction_shufflevectorAccess().getVector2TypedValueParserRuleCall_3_0(), semanticObject.getVector2());
		feeder.accept(grammarAccess.getInstruction_shufflevectorAccess().getMaskTypedValueParserRuleCall_5_0(), semanticObject.getMask());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='srem' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_srem(EObject context, Instruction_srem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_sremAccess().getOpcodeSremKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_sremAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_sremAccess().getOp1ValueRefParserRuleCall_2_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_sremAccess().getOp2ValueRefParserRuleCall_4_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         opcode='store' 
	 *         (
	 *             (value=TypedValue pointer=TypedValue alignment=Align? nontemporalIndex=MetadataRef?) | 
	 *             (value=TypedValue pointer=TypedValue ordering=Ordering alignment=Align)
	 *         )
	 *     )
	 */
	protected void sequence_Instruction_store(EObject context, Instruction_store semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='sub' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_sub(EObject context, Instruction_sub semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_subAccess().getOpcodeSubKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_subAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_subAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_subAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='switch' comparisonValue=TypedValue defaultDest=BasicBlockRef (caseConditions+=TypedValue destinations+=BasicBlockRef)*)
	 */
	protected void sequence_Instruction_switch(EObject context, Instruction_switch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='udiv' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_udiv(EObject context, Instruction_udiv semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_udivAccess().getOpcodeUdivKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_udivAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_udivAccess().getOp1ValueRefParserRuleCall_3_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_udivAccess().getOp2ValueRefParserRuleCall_5_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     opcode='unreachable'
	 */
	protected void sequence_Instruction_unreachable(EObject context, Instruction_unreachable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_UNREACHABLE__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_UNREACHABLE__OPCODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_unreachableAccess().getOpcodeUnreachableKeyword_0(), semanticObject.getOpcode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='urem' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_urem(EObject context, Instruction_urem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_uremAccess().getOpcodeUremKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_uremAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_uremAccess().getOp1ValueRefParserRuleCall_2_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_uremAccess().getOp2ValueRefParserRuleCall_4_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='va_arg' arglist=TypedValue type=Type)
	 */
	protected void sequence_Instruction_va_arg(EObject context, Instruction_va_arg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.OTHER_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.OTHER_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_VA_ARG__ARGLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_VA_ARG__ARGLIST));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_VA_ARG__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.INSTRUCTION_VA_ARG__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_va_argAccess().getOpcodeVa_argKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_va_argAccess().getArglistTypedValueParserRuleCall_1_0(), semanticObject.getArglist());
		feeder.accept(grammarAccess.getInstruction_va_argAccess().getTypeTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (opcode='xor' type=Type op1=ValueRef op2=ValueRef)
	 */
	protected void sequence_Instruction_xor(EObject context, Instruction_xor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OPCODE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP1));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.BITWISE_BINARY_INSTRUCTION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstruction_xorAccess().getOpcodeXorKeyword_0_0(), semanticObject.getOpcode());
		feeder.accept(grammarAccess.getInstruction_xorAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstruction_xorAccess().getOp1ValueRefParserRuleCall_2_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getInstruction_xorAccess().getOp2ValueRefParserRuleCall_4_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_IntType(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((landingPadType='catch' catchType=TypedValue) | (landingPadType='filter' arrayType=ArrayType arrayConstant=ArrayConstant))
	 */
	protected void sequence_LandingpadClause(EObject context, LandingpadClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[LocalValue|LOCAL_ID]
	 */
	protected void sequence_LocalValueRef(EObject context, LocalValueRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.LOCAL_VALUE_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.LOCAL_VALUE_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalValueRefAccess().getRefLocalValueLOCAL_IDTerminalRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=TypedValue | metadataRef=MetadataRef | null=NULL)
	 */
	protected void sequence_MetadataNodeElement(EObject context, MetadataNodeElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=MetadataNodeElement elements+=MetadataNodeElement*)?)
	 */
	protected void sequence_MetadataNode(EObject context, MetadataNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[NamedMetadata|MetadataIdentifier]
	 */
	protected void sequence_MetadataRef(EObject context, MetadataRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.METADATA_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.METADATA_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetadataRefAccess().getRefNamedMetadataMetadataIdentifierParserRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=METADATA_STRING
	 */
	protected void sequence_MetadataString(EObject context, MetadataString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=META_NAME value=MetadataRef)
	 */
	protected void sequence_MetadataSuffix(EObject context, MetadataSuffix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.METADATA_SUFFIX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.METADATA_SUFFIX__NAME));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.METADATA_SUFFIX__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.METADATA_SUFFIX__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetadataSuffixAccess().getNameMETA_NAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMetadataSuffixAccess().getValueMetadataRefParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {MetadataType}
	 */
	protected void sequence_MetadataType(EObject context, MetadataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (instruction=NamedMiddleInstruction | instruction=Instruction_store | instruction=Instruction_fence | instruction=Instruction_call_void) 
	 *         metadata+=MetadataSuffix*
	 *     )
	 */
	protected void sequence_MiddleInstruction(EObject context, MiddleInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=TopLevelElement*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=META_INT node=MetadataNode) | (name=META_NAME node=MetadataNode))
	 */
	protected void sequence_NamedMetadata(EObject context, NamedMetadata semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=LocalName 
	 *         (
	 *             instruction=BinaryInstruction | 
	 *             instruction=BitwiseBinaryInstruction | 
	 *             instruction=VectorInstructions | 
	 *             instruction=AggregateInstruction | 
	 *             instruction=Instruction_alloca | 
	 *             instruction=Instruction_load | 
	 *             instruction=Instruction_getelementptr | 
	 *             instruction=Instruction_cmpxchg | 
	 *             instruction=Instruction_atomicrmw | 
	 *             instruction=ConversionInstruction | 
	 *             instruction=OtherInstruction | 
	 *             instruction=Instruction_call_nonVoid
	 *         )
	 *     )
	 */
	protected void sequence_NamedMiddleInstruction(EObject context, NamedMiddleInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=LocalName instruction=Instruction_invoke_nonVoid)
	 */
	protected void sequence_NamedTerminatorInstruction(EObject context, NamedTerminatorInstruction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.LOCAL_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.LOCAL_VALUE__NAME));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.NAMED_TERMINATOR_INSTRUCTION__INSTRUCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.NAMED_TERMINATOR_INSTRUCTION__INSTRUCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamedTerminatorInstructionAccess().getNameLocalNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedTerminatorInstructionAccess().getInstructionInstruction_invoke_nonVoidParserRuleCall_1_0(), semanticObject.getInstruction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=IntType | 
	 *         type=FloatingType | 
	 *         type=VectorType | 
	 *         type=ArrayType | 
	 *         type=X86mmxType | 
	 *         type=MetadataType | 
	 *         type=StructType | 
	 *         type=OpaqueType | 
	 *         typedef=[TypeDef|LOCAL_ID]
	 *     )
	 */
	protected void sequence_NonLeftRecursiveNonVoidType(EObject context, NonLeftRecursiveNonVoidType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=IntType | 
	 *         type=FloatingType | 
	 *         type=VectorType | 
	 *         type=ArrayType | 
	 *         type=X86mmxType | 
	 *         type=VoidType | 
	 *         type=MetadataType | 
	 *         type=StructType | 
	 *         type=OpaqueType | 
	 *         typedef=[TypeDef|LOCAL_ID]
	 *     )
	 */
	protected void sequence_NonLeftRecursiveType(EObject context, NonLeftRecursiveType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((baseType=VoidType suffixes+=TypeSuffix+) | (baseType=NonLeftRecursiveNonVoidType stars+=Star* suffixes+=TypeSuffix*))
	 */
	protected void sequence_NonVoidType(EObject context, NonVoidType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OpaqueType}
	 */
	protected void sequence_OpaqueType(EObject context, OpaqueType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attributes+=ParameterAttribute+
	 */
	protected void sequence_ParameterAttributes(EObject context, ParameterAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type attrs=ParameterAttributes?)
	 */
	protected void sequence_ParameterType(EObject context, ParameterType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ParameterType name=ParamName)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.LOCAL_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.LOCAL_VALUE__NAME));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameParamNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((parameters+=Parameter parameters+=Parameter* vararg='...'?)? | vararg='...')
	 */
	protected void sequence_Parameters(EObject context, Parameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=INTEGER | 
	 *         value=SIGNED_INT | 
	 *         value=FLOAT | 
	 *         value=BOOLEAN | 
	 *         value=NULL | 
	 *         value=CSTRING
	 *     )
	 */
	protected void sequence_SimpleConstant(EObject context, SimpleConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (addressSpace=AddressSpace?)
	 */
	protected void sequence_Star(EObject context, Star semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=LocalName instruction=Instruction_phi metadata+=MetadataSuffix*)
	 */
	protected void sequence_StartingInstruction(EObject context, StartingInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((types+=Type types+=Type*)? | (packed='<' (types+=Type types+=Type*)?))
	 */
	protected void sequence_StructType(EObject context, StructType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=ConstantList? | (packed='<' list=ConstantList?))
	 */
	protected void sequence_StructureConstant(EObject context, StructureConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((infoType='datalayout' | infoType='triple') layout=STRING)
	 */
	protected void sequence_TargetInfo(EObject context, TargetInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING value=STRING?)
	 */
	protected void sequence_TargetSpecificAttribute(EObject context, TargetSpecificAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             instruction=NamedTerminatorInstruction | 
	 *             instruction=Instruction_ret | 
	 *             instruction=Instruction_br | 
	 *             instruction=Instruction_switch | 
	 *             instruction=Instruction_indirectbr | 
	 *             instruction=Instruction_resume | 
	 *             instruction=Instruction_unreachable | 
	 *             instruction=Instruction_invoke_void
	 *         ) 
	 *         metadata+=MetadataSuffix*
	 *     )
	 */
	protected void sequence_TerminatorInstruction(EObject context, TerminatorInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=LocalName type=NonVoidType)
	 */
	protected void sequence_TypeDef(EObject context, TypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.TYPE_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.TYPE_DEF__NAME));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.TYPE_DEF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.TYPE_DEF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDefAccess().getNameLocalNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeDefAccess().getTypeNonVoidTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (((containedTypes+=ParameterType containedTypes+=ParameterType* vararg='...'?)? | vararg='...') stars+=Star*)
	 */
	protected void sequence_TypeSuffix(EObject context, TypeSuffix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (baseType=NonLeftRecursiveType stars+=Star* suffixes+=TypeSuffix*)
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type value=Constant)
	 */
	protected void sequence_TypedConstant(EObject context, TypedConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.TYPED_CONSTANT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.TYPED_CONSTANT__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.TYPED_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.TYPED_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedConstantAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getTypedConstantAccess().getValueConstantParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type ref=ValueRef)
	 */
	protected void sequence_TypedValue(EObject context, TypedValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.TYPED_VALUE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.TYPED_VALUE__TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.TYPED_VALUE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.TYPED_VALUE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypedValueAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getTypedValueAccess().getRefValueRefParserRuleCall_1_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Undef}
	 */
	protected void sequence_Undef(EObject context, Undef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=ConstantList?)
	 */
	protected void sequence_VectorConstant(EObject context, VectorConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (size=INTEGER elemType=Type)
	 */
	protected void sequence_VectorType(EObject context, VectorType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.VECTOR_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.VECTOR_TYPE__SIZE));
			if(transientValues.isValueTransient(semanticObject, LLVM_IRPackage.Literals.VECTOR_TYPE__ELEM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVM_IRPackage.Literals.VECTOR_TYPE__ELEM_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVectorTypeAccess().getSizeINTEGERTerminalRuleCall_1_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getVectorTypeAccess().getElemTypeTypeParserRuleCall_3_0(), semanticObject.getElemType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {VoidType}
	 */
	protected void sequence_VoidType(EObject context, VoidType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {X86mmxType}
	 */
	protected void sequence_X86mmxType(EObject context, X86mmxType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ZeroInitializer}
	 */
	protected void sequence_ZeroInitializer(EObject context, ZeroInitializer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
