/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.AddressSpace;
import com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Alias;
import com.intel.llvm.ireditor.lLVM_IR.ArgList;
import com.intel.llvm.ireditor.lLVM_IR.Argument;
import com.intel.llvm.ireditor.lLVM_IR.ArrayConstant;
import com.intel.llvm.ireditor.lLVM_IR.ArrayType;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.BlockAddress;
import com.intel.llvm.ireditor.lLVM_IR.Callee;
import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression;
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
import com.intel.llvm.ireditor.lLVM_IR.FloatingType;
import com.intel.llvm.ireditor.lLVM_IR.Function;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDecl;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDef;
import com.intel.llvm.ireditor.lLVM_IR.FunctionHeader;
import com.intel.llvm.ireditor.lLVM_IR.FunctionRef;
import com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValue;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueDef;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.GlobalVariable;
import com.intel.llvm.ireditor.lLVM_IR.InlineAsm;
import com.intel.llvm.ireditor.lLVM_IR.InlineAssembler;
import com.intel.llvm.ireditor.lLVM_IR.Instruction;
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
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRFactory;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.LandingpadClause;
import com.intel.llvm.ireditor.lLVM_IR.LocalValue;
import com.intel.llvm.ireditor.lLVM_IR.LocalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.MemoryInstruction;
import com.intel.llvm.ireditor.lLVM_IR.MetadataNode;
import com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement;
import com.intel.llvm.ireditor.lLVM_IR.MetadataRef;
import com.intel.llvm.ireditor.lLVM_IR.MetadataString;
import com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix;
import com.intel.llvm.ireditor.lLVM_IR.MetadataType;
import com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.Model;
import com.intel.llvm.ireditor.lLVM_IR.NamedInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedMetadata;
import com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType;
import com.intel.llvm.ireditor.lLVM_IR.NonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.OpaqueType;
import com.intel.llvm.ireditor.lLVM_IR.OtherInstruction;
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
import com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.TopLevelElement;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.TypeDef;
import com.intel.llvm.ireditor.lLVM_IR.TypedConstant;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;
import com.intel.llvm.ireditor.lLVM_IR.Undef;
import com.intel.llvm.ireditor.lLVM_IR.ValueRef;
import com.intel.llvm.ireditor.lLVM_IR.VectorConstant;
import com.intel.llvm.ireditor.lLVM_IR.VectorInstructions;
import com.intel.llvm.ireditor.lLVM_IR.VectorType;
import com.intel.llvm.ireditor.lLVM_IR.VoidType;
import com.intel.llvm.ireditor.lLVM_IR.X86mmxType;
import com.intel.llvm.ireditor.lLVM_IR.ZeroInitializer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LLVM_IRPackageImpl extends EPackageImpl implements LLVM_IRPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedMetadataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadataRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalValueRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localValueRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalValueDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetInfoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inlineAsmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_convertEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_getelementptrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_selectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_compareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_extractelementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_insertelementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_shufflevectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_extractvalueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_insertvalueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpression_binaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass undefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockAddressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass zeroInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vectorConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadataNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadataNodeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadataStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addressSpaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadataSuffixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startingInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass middleInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedMiddleInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminatorInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedTerminatorInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_retEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_brEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_switchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_indirectbrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_invoke_voidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_invoke_nonVoidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_resumeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_unreachableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicBlockRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_addEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_faddEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_subEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_fsubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_mulEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_fmulEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_udivEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_sdivEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_fdivEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_uremEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_sremEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_fremEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitwiseBinaryInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_shlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_lshrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_ashrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_andEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_orEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_xorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vectorInstructionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_extractelementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_insertelementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_shufflevectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aggregateInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_extractvalueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_insertvalueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memoryInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_allocaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_loadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_storeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_fenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_cmpxchgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_atomicrmwEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_getelementptrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conversionInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_icmpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_fcmpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_phiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_selectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_call_nonVoidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_call_voidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass calleeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inlineAssemblerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_va_argEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instruction_landingpadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass landingpadClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonVoidTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass starEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionTypeOrPointerToFunctionTypeSuffixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonLeftRecursiveTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonLeftRecursiveNonVoidTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass opaqueTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vectorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass x86mmxTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass voidTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatingTypeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LLVM_IRPackageImpl()
  {
    super(eNS_URI, LLVM_IRFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LLVM_IRPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LLVM_IRPackage init()
  {
    if (isInited) return (LLVM_IRPackage)EPackage.Registry.INSTANCE.getEPackage(LLVM_IRPackage.eNS_URI);

    // Obtain or create and register package
    LLVM_IRPackageImpl theLLVM_IRPackage = (LLVM_IRPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LLVM_IRPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LLVM_IRPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLLVM_IRPackage.createPackageContents();

    // Initialize created meta-data
    theLLVM_IRPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLLVM_IRPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LLVM_IRPackage.eNS_URI, theLLVM_IRPackage);
    return theLLVM_IRPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelElement()
  {
    return topLevelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedMetadata()
  {
    return namedMetadataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedMetadata_Name()
  {
    return (EAttribute)namedMetadataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedMetadata_Node()
  {
    return (EReference)namedMetadataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadataRef()
  {
    return metadataRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetadataRef_Ref()
  {
    return (EReference)metadataRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueRef()
  {
    return valueRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalValueRef()
  {
    return globalValueRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalValueRef_Ref()
  {
    return (EReference)globalValueRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalValueRef_Constant()
  {
    return (EReference)globalValueRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalValueRef_Metadata()
  {
    return (EReference)globalValueRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionRef()
  {
    return functionRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionRef_Ref()
  {
    return (EReference)functionRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalValueRef()
  {
    return localValueRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalValueRef_Ref()
  {
    return (EReference)localValueRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalValue()
  {
    return globalValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalValueDef()
  {
    return globalValueDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalValue()
  {
    return localValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalValue_Name()
  {
    return (EAttribute)localValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedInstruction()
  {
    return namedInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_Metadata()
  {
    return (EReference)instructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlias()
  {
    return aliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlias_Name()
  {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlias_Linkage()
  {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlias_Visibility()
  {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlias_Type()
  {
    return (EReference)aliasEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlias_Ref()
  {
    return (EReference)aliasEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargetInfo()
  {
    return targetInfoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetInfo_InfoType()
  {
    return (EAttribute)targetInfoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetInfo_Layout()
  {
    return (EAttribute)targetInfoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInlineAsm()
  {
    return inlineAsmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInlineAsm_AsmLine()
  {
    return (EAttribute)inlineAsmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalVariable()
  {
    return globalVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalVariable_Name()
  {
    return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalVariable_Linkage()
  {
    return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalVariable_Addrspace()
  {
    return (EReference)globalVariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalVariable_TlsModel()
  {
    return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalVariable_Type()
  {
    return (EReference)globalVariableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalVariable_InitialValue()
  {
    return (EReference)globalVariableEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalVariable_Section()
  {
    return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalVariable_Align()
  {
    return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression()
  {
    return constantExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantExpression_Opcode()
  {
    return (EAttribute)constantExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_convert()
  {
    return constantExpression_convertEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_convert_FromType()
  {
    return (EReference)constantExpression_convertEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_convert_Constant()
  {
    return (EReference)constantExpression_convertEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_convert_TargetType()
  {
    return (EReference)constantExpression_convertEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_getelementptr()
  {
    return constantExpression_getelementptrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_getelementptr_ConstantType()
  {
    return (EReference)constantExpression_getelementptrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_getelementptr_Constant()
  {
    return (EReference)constantExpression_getelementptrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_getelementptr_IndexTypes()
  {
    return (EReference)constantExpression_getelementptrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_getelementptr_Indices()
  {
    return (EReference)constantExpression_getelementptrEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_select()
  {
    return constantExpression_selectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_select_Condition()
  {
    return (EReference)constantExpression_selectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_select_Op1()
  {
    return (EReference)constantExpression_selectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_select_Op2()
  {
    return (EReference)constantExpression_selectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_compare()
  {
    return constantExpression_compareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantExpression_compare_Condition()
  {
    return (EAttribute)constantExpression_compareEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_compare_Op1()
  {
    return (EReference)constantExpression_compareEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_compare_Op2()
  {
    return (EReference)constantExpression_compareEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_extractelement()
  {
    return constantExpression_extractelementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_extractelement_Vector()
  {
    return (EReference)constantExpression_extractelementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_extractelement_Index()
  {
    return (EReference)constantExpression_extractelementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_insertelement()
  {
    return constantExpression_insertelementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_insertelement_VectorType()
  {
    return (EReference)constantExpression_insertelementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_insertelement_Vector()
  {
    return (EReference)constantExpression_insertelementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_insertelement_Element()
  {
    return (EReference)constantExpression_insertelementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_insertelement_Index()
  {
    return (EReference)constantExpression_insertelementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_shufflevector()
  {
    return constantExpression_shufflevectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_shufflevector_Vector1()
  {
    return (EReference)constantExpression_shufflevectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_shufflevector_Vector2()
  {
    return (EReference)constantExpression_shufflevectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_shufflevector_Mask()
  {
    return (EReference)constantExpression_shufflevectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_extractvalue()
  {
    return constantExpression_extractvalueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_extractvalue_Value()
  {
    return (EReference)constantExpression_extractvalueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantExpression_extractvalue_Indices()
  {
    return (EAttribute)constantExpression_extractvalueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_insertvalue()
  {
    return constantExpression_insertvalueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_insertvalue_Value()
  {
    return (EReference)constantExpression_insertvalueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_insertvalue_Element()
  {
    return (EReference)constantExpression_insertvalueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantExpression_insertvalue_Indices()
  {
    return (EAttribute)constantExpression_insertvalueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression_binary()
  {
    return constantExpression_binaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_binary_Op1()
  {
    return (EReference)constantExpression_binaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_binary_Op2()
  {
    return (EReference)constantExpression_binaryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUndef()
  {
    return undefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockAddress()
  {
    return blockAddressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockAddress_Function()
  {
    return (EReference)blockAddressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockAddress_BasicBlock()
  {
    return (EReference)blockAddressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getZeroInitializer()
  {
    return zeroInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructureConstant()
  {
    return structureConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureConstant_List()
  {
    return (EReference)structureConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayConstant()
  {
    return arrayConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayConstant_List()
  {
    return (EReference)arrayConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVectorConstant()
  {
    return vectorConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVectorConstant_List()
  {
    return (EReference)vectorConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantList()
  {
    return constantListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantList_TypedConstants()
  {
    return (EReference)constantListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedConstant()
  {
    return typedConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedConstant_Type()
  {
    return (EReference)typedConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedConstant_Value()
  {
    return (EReference)typedConstantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleConstant()
  {
    return simpleConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleConstant_Value()
  {
    return (EAttribute)simpleConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadataNode()
  {
    return metadataNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetadataNode_Elements()
  {
    return (EReference)metadataNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadataNodeElement()
  {
    return metadataNodeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetadataNodeElement_Value()
  {
    return (EReference)metadataNodeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetadataNodeElement_MetadataRef()
  {
    return (EReference)metadataNodeElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadataNodeElement_Null()
  {
    return (EAttribute)metadataNodeElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadataString()
  {
    return metadataStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadataString_Name()
  {
    return (EAttribute)metadataStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddressSpace()
  {
    return addressSpaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddressSpace_Value()
  {
    return (EAttribute)addressSpaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Header()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDef()
  {
    return functionDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDef_BasicBlocks()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDecl()
  {
    return functionDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionHeader()
  {
    return functionHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionHeader_Linkage()
  {
    return (EAttribute)functionHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionHeader_Visibility()
  {
    return (EAttribute)functionHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionHeader_Cconv()
  {
    return (EAttribute)functionHeaderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionHeader_Rettype()
  {
    return (EReference)functionHeaderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionHeader_Name()
  {
    return (EAttribute)functionHeaderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionHeader_Parameters()
  {
    return (EReference)functionHeaderEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionHeader_Attrs()
  {
    return (EReference)functionHeaderEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameters()
  {
    return parametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameters_Parameters()
  {
    return (EReference)parametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameters_Vararg()
  {
    return (EAttribute)parametersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionAttributes()
  {
    return functionAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionAttributes_Attributes()
  {
    return (EAttribute)functionAttributesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicBlock()
  {
    return basicBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicBlock_Name()
  {
    return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicBlock_Instructions()
  {
    return (EReference)basicBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadataSuffix()
  {
    return metadataSuffixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadataSuffix_Name()
  {
    return (EAttribute)metadataSuffixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetadataSuffix_Value()
  {
    return (EReference)metadataSuffixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartingInstruction()
  {
    return startingInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartingInstruction_Instruction()
  {
    return (EReference)startingInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMiddleInstruction()
  {
    return middleInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMiddleInstruction_Instruction()
  {
    return (EReference)middleInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedMiddleInstruction()
  {
    return namedMiddleInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedMiddleInstruction_Instruction()
  {
    return (EReference)namedMiddleInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminatorInstruction()
  {
    return terminatorInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminatorInstruction_Instruction()
  {
    return (EReference)terminatorInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedTerminatorInstruction()
  {
    return namedTerminatorInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedTerminatorInstruction_Instruction()
  {
    return (EReference)namedTerminatorInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_ret()
  {
    return instruction_retEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_ret_Opcode()
  {
    return (EAttribute)instruction_retEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_ret_Val()
  {
    return (EReference)instruction_retEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_br()
  {
    return instruction_brEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_br_Opcode()
  {
    return (EAttribute)instruction_brEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_br_Condition()
  {
    return (EReference)instruction_brEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_br_True()
  {
    return (EReference)instruction_brEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_br_False()
  {
    return (EReference)instruction_brEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_br_Unconditional()
  {
    return (EReference)instruction_brEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_switch()
  {
    return instruction_switchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_switch_Opcode()
  {
    return (EAttribute)instruction_switchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_switch_ComparisonValue()
  {
    return (EReference)instruction_switchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_switch_DefaultDest()
  {
    return (EReference)instruction_switchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_switch_CaseConditions()
  {
    return (EReference)instruction_switchEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_switch_Destinations()
  {
    return (EReference)instruction_switchEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_indirectbr()
  {
    return instruction_indirectbrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_indirectbr_Opcode()
  {
    return (EAttribute)instruction_indirectbrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_indirectbr_Address()
  {
    return (EReference)instruction_indirectbrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_indirectbr_Destinations()
  {
    return (EReference)instruction_indirectbrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_invoke_void()
  {
    return instruction_invoke_voidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_invoke_void_Opcode()
  {
    return (EAttribute)instruction_invoke_voidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_invoke_void_Cconv()
  {
    return (EAttribute)instruction_invoke_voidEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_void_Rettype()
  {
    return (EReference)instruction_invoke_voidEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_void_Callee()
  {
    return (EReference)instruction_invoke_voidEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_void_Args()
  {
    return (EReference)instruction_invoke_voidEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_void_Attributes()
  {
    return (EReference)instruction_invoke_voidEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_void_ToLabel()
  {
    return (EReference)instruction_invoke_voidEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_void_ExceptionLabel()
  {
    return (EReference)instruction_invoke_voidEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_invoke_nonVoid()
  {
    return instruction_invoke_nonVoidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_invoke_nonVoid_Opcode()
  {
    return (EAttribute)instruction_invoke_nonVoidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_invoke_nonVoid_Cconv()
  {
    return (EAttribute)instruction_invoke_nonVoidEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_nonVoid_Rettype()
  {
    return (EReference)instruction_invoke_nonVoidEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_nonVoid_Callee()
  {
    return (EReference)instruction_invoke_nonVoidEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_nonVoid_Args()
  {
    return (EReference)instruction_invoke_nonVoidEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_nonVoid_Attributes()
  {
    return (EReference)instruction_invoke_nonVoidEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_nonVoid_ToLabel()
  {
    return (EReference)instruction_invoke_nonVoidEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_invoke_nonVoid_ExceptionLabel()
  {
    return (EReference)instruction_invoke_nonVoidEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_resume()
  {
    return instruction_resumeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_resume_Opcode()
  {
    return (EAttribute)instruction_resumeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_resume_Value()
  {
    return (EReference)instruction_resumeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_unreachable()
  {
    return instruction_unreachableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_unreachable_Opcode()
  {
    return (EAttribute)instruction_unreachableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicBlockRef()
  {
    return basicBlockRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicBlockRef_Ref()
  {
    return (EReference)basicBlockRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryInstruction()
  {
    return binaryInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryInstruction_Opcode()
  {
    return (EAttribute)binaryInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryInstruction_Type()
  {
    return (EReference)binaryInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryInstruction_Op1()
  {
    return (EReference)binaryInstructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryInstruction_Op2()
  {
    return (EReference)binaryInstructionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_add()
  {
    return instruction_addEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_fadd()
  {
    return instruction_faddEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_sub()
  {
    return instruction_subEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_fsub()
  {
    return instruction_fsubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_mul()
  {
    return instruction_mulEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_fmul()
  {
    return instruction_fmulEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_udiv()
  {
    return instruction_udivEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_sdiv()
  {
    return instruction_sdivEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_fdiv()
  {
    return instruction_fdivEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_urem()
  {
    return instruction_uremEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_srem()
  {
    return instruction_sremEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_frem()
  {
    return instruction_fremEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitwiseBinaryInstruction()
  {
    return bitwiseBinaryInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitwiseBinaryInstruction_Opcode()
  {
    return (EAttribute)bitwiseBinaryInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitwiseBinaryInstruction_Type()
  {
    return (EReference)bitwiseBinaryInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitwiseBinaryInstruction_Op1()
  {
    return (EReference)bitwiseBinaryInstructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitwiseBinaryInstruction_Op2()
  {
    return (EReference)bitwiseBinaryInstructionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_shl()
  {
    return instruction_shlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_lshr()
  {
    return instruction_lshrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_ashr()
  {
    return instruction_ashrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_and()
  {
    return instruction_andEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_or()
  {
    return instruction_orEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_xor()
  {
    return instruction_xorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVectorInstructions()
  {
    return vectorInstructionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVectorInstructions_Opcode()
  {
    return (EAttribute)vectorInstructionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_extractelement()
  {
    return instruction_extractelementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_extractelement_Vector()
  {
    return (EReference)instruction_extractelementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_extractelement_Index()
  {
    return (EReference)instruction_extractelementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_insertelement()
  {
    return instruction_insertelementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_insertelement_Vector()
  {
    return (EReference)instruction_insertelementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_insertelement_Element()
  {
    return (EReference)instruction_insertelementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_insertelement_Index()
  {
    return (EReference)instruction_insertelementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_shufflevector()
  {
    return instruction_shufflevectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_shufflevector_Vector1()
  {
    return (EReference)instruction_shufflevectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_shufflevector_Vector2()
  {
    return (EReference)instruction_shufflevectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_shufflevector_Mask()
  {
    return (EReference)instruction_shufflevectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAggregateInstruction()
  {
    return aggregateInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAggregateInstruction_Opcode()
  {
    return (EAttribute)aggregateInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAggregateInstruction_Aggregate()
  {
    return (EReference)aggregateInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAggregateInstruction_Indices()
  {
    return (EReference)aggregateInstructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_extractvalue()
  {
    return instruction_extractvalueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_insertvalue()
  {
    return instruction_insertvalueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_insertvalue_Element()
  {
    return (EReference)instruction_insertvalueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMemoryInstruction()
  {
    return memoryInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMemoryInstruction_Opcode()
  {
    return (EAttribute)memoryInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_alloca()
  {
    return instruction_allocaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_alloca_Type()
  {
    return (EReference)instruction_allocaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_alloca_NumElements()
  {
    return (EReference)instruction_allocaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_alloca_Alignment()
  {
    return (EAttribute)instruction_allocaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_load()
  {
    return instruction_loadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_load_Pointer()
  {
    return (EReference)instruction_loadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_load_Alignment()
  {
    return (EAttribute)instruction_loadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_load_NontemporalIndex()
  {
    return (EReference)instruction_loadEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_load_InvariantLoadIndex()
  {
    return (EReference)instruction_loadEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_load_Ordering()
  {
    return (EAttribute)instruction_loadEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_store()
  {
    return instruction_storeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_store_Value()
  {
    return (EReference)instruction_storeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_store_Pointer()
  {
    return (EReference)instruction_storeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_store_Alignment()
  {
    return (EAttribute)instruction_storeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_store_NontemporalIndex()
  {
    return (EReference)instruction_storeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_store_Ordering()
  {
    return (EAttribute)instruction_storeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_fence()
  {
    return instruction_fenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_fence_Ordering()
  {
    return (EAttribute)instruction_fenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_cmpxchg()
  {
    return instruction_cmpxchgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_cmpxchg_Pointer()
  {
    return (EReference)instruction_cmpxchgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_cmpxchg_ComparedWith()
  {
    return (EReference)instruction_cmpxchgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_cmpxchg_NewValue()
  {
    return (EReference)instruction_cmpxchgEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_cmpxchg_Ordering()
  {
    return (EAttribute)instruction_cmpxchgEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_atomicrmw()
  {
    return instruction_atomicrmwEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_atomicrmw_Operation()
  {
    return (EAttribute)instruction_atomicrmwEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_atomicrmw_Pointer()
  {
    return (EReference)instruction_atomicrmwEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_atomicrmw_Argument()
  {
    return (EReference)instruction_atomicrmwEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_atomicrmw_Ordering()
  {
    return (EAttribute)instruction_atomicrmwEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_getelementptr()
  {
    return instruction_getelementptrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_getelementptr_Base()
  {
    return (EReference)instruction_getelementptrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_getelementptr_Indices()
  {
    return (EReference)instruction_getelementptrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConversionInstruction()
  {
    return conversionInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConversionInstruction_Opcode()
  {
    return (EAttribute)conversionInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConversionInstruction_FromType()
  {
    return (EReference)conversionInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConversionInstruction_Value()
  {
    return (EReference)conversionInstructionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConversionInstruction_TargetType()
  {
    return (EReference)conversionInstructionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherInstruction()
  {
    return otherInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOtherInstruction_Opcode()
  {
    return (EAttribute)otherInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_icmp()
  {
    return instruction_icmpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_icmp_Condition()
  {
    return (EAttribute)instruction_icmpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_icmp_Type()
  {
    return (EReference)instruction_icmpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_icmp_Op1()
  {
    return (EReference)instruction_icmpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_icmp_Op2()
  {
    return (EReference)instruction_icmpEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_fcmp()
  {
    return instruction_fcmpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_fcmp_Condition()
  {
    return (EAttribute)instruction_fcmpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_fcmp_Type()
  {
    return (EReference)instruction_fcmpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_fcmp_Op1()
  {
    return (EReference)instruction_fcmpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_fcmp_Op2()
  {
    return (EReference)instruction_fcmpEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_phi()
  {
    return instruction_phiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_phi_Opcode()
  {
    return (EAttribute)instruction_phiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_phi_Type()
  {
    return (EReference)instruction_phiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_phi_Values()
  {
    return (EReference)instruction_phiEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_phi_Labels()
  {
    return (EReference)instruction_phiEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_select()
  {
    return instruction_selectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_select_Condition()
  {
    return (EReference)instruction_selectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_select_Value1()
  {
    return (EReference)instruction_selectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_select_Value2()
  {
    return (EReference)instruction_selectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_call_nonVoid()
  {
    return instruction_call_nonVoidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_call_nonVoid_IsTail()
  {
    return (EAttribute)instruction_call_nonVoidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_call_nonVoid_Opcode()
  {
    return (EAttribute)instruction_call_nonVoidEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_call_nonVoid_Cconv()
  {
    return (EAttribute)instruction_call_nonVoidEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_nonVoid_ReturnAttributes()
  {
    return (EReference)instruction_call_nonVoidEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_nonVoid_ReturnType()
  {
    return (EReference)instruction_call_nonVoidEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_nonVoid_FunctionPointerType()
  {
    return (EReference)instruction_call_nonVoidEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_nonVoid_Callee()
  {
    return (EReference)instruction_call_nonVoidEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_nonVoid_Args()
  {
    return (EReference)instruction_call_nonVoidEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_nonVoid_FunctionAttributes()
  {
    return (EReference)instruction_call_nonVoidEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_call_void()
  {
    return instruction_call_voidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_call_void_IsTail()
  {
    return (EAttribute)instruction_call_voidEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_call_void_Opcode()
  {
    return (EAttribute)instruction_call_voidEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstruction_call_void_Cconv()
  {
    return (EAttribute)instruction_call_voidEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_void_ReturnAttributes()
  {
    return (EReference)instruction_call_voidEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_void_ReturnType()
  {
    return (EReference)instruction_call_voidEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_void_FunctionPointerType()
  {
    return (EReference)instruction_call_voidEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_void_Callee()
  {
    return (EReference)instruction_call_voidEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_void_Args()
  {
    return (EReference)instruction_call_voidEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_call_void_FunctionAttributes()
  {
    return (EReference)instruction_call_voidEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgList()
  {
    return argListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgList_Arguments()
  {
    return (EReference)argListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallee()
  {
    return calleeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInlineAssembler()
  {
    return inlineAssemblerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInlineAssembler_Assembler()
  {
    return (EAttribute)inlineAssemblerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInlineAssembler_Flags()
  {
    return (EAttribute)inlineAssemblerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_va_arg()
  {
    return instruction_va_argEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_va_arg_Arglist()
  {
    return (EReference)instruction_va_argEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_va_arg_Type()
  {
    return (EReference)instruction_va_argEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction_landingpad()
  {
    return instruction_landingpadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_landingpad_ResultType()
  {
    return (EReference)instruction_landingpadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_landingpad_PersonalityType()
  {
    return (EReference)instruction_landingpadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_landingpad_PersonalityFunction()
  {
    return (EReference)instruction_landingpadEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstruction_landingpad_Clauses()
  {
    return (EReference)instruction_landingpadEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLandingpadClause()
  {
    return landingpadClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLandingpadClause_LandingPadType()
  {
    return (EAttribute)landingpadClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLandingpadClause_CatchType()
  {
    return (EReference)landingpadClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLandingpadClause_ArrayType()
  {
    return (EReference)landingpadClauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLandingpadClause_ArrayConstant()
  {
    return (EReference)landingpadClauseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedValue()
  {
    return typedValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedValue_Type()
  {
    return (EReference)typedValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedValue_Ref()
  {
    return (EReference)typedValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterType()
  {
    return parameterTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterType_Type()
  {
    return (EReference)parameterTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterType_Attrs()
  {
    return (EReference)parameterTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterAttributes()
  {
    return parameterAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterAttributes_Attributes()
  {
    return (EAttribute)parameterAttributesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_Type()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_Ref()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonVoidType()
  {
    return nonVoidTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNonVoidType_BaseType()
  {
    return (EReference)nonVoidTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNonVoidType_FunctionSuffix()
  {
    return (EReference)nonVoidTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNonVoidType_Stars()
  {
    return (EReference)nonVoidTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStar()
  {
    return starEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStar_AddressSpace()
  {
    return (EReference)starEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_BaseType()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Stars()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_FunctionSuffix()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionTypeOrPointerToFunctionTypeSuffix()
  {
    return functionTypeOrPointerToFunctionTypeSuffixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionTypeOrPointerToFunctionTypeSuffix_ContainedTypes()
  {
    return (EReference)functionTypeOrPointerToFunctionTypeSuffixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionTypeOrPointerToFunctionTypeSuffix_Vararg()
  {
    return (EAttribute)functionTypeOrPointerToFunctionTypeSuffixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionTypeOrPointerToFunctionTypeSuffix_Stars()
  {
    return (EReference)functionTypeOrPointerToFunctionTypeSuffixEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonLeftRecursiveType()
  {
    return nonLeftRecursiveTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNonLeftRecursiveType_Type()
  {
    return (EReference)nonLeftRecursiveTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNonLeftRecursiveType_Typedef()
  {
    return (EReference)nonLeftRecursiveTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonLeftRecursiveNonVoidType()
  {
    return nonLeftRecursiveNonVoidTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNonLeftRecursiveNonVoidType_Type()
  {
    return (EReference)nonLeftRecursiveNonVoidTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDef()
  {
    return typeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDef_Name()
  {
    return (EAttribute)typeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDef_Type()
  {
    return (EReference)typeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntType()
  {
    return intTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpaqueType()
  {
    return opaqueTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructType()
  {
    return structTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructType_Types()
  {
    return (EReference)structTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructType_Packed()
  {
    return (EAttribute)structTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVectorType()
  {
    return vectorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVectorType_Size()
  {
    return (EAttribute)vectorTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVectorType_ElemType()
  {
    return (EReference)vectorTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayType()
  {
    return arrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayType_Size()
  {
    return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayType_ElemType()
  {
    return (EReference)arrayTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getX86mmxType()
  {
    return x86mmxTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVoidType()
  {
    return voidTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadataType()
  {
    return metadataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatingType()
  {
    return floatingTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVM_IRFactory getLLVM_IRFactory()
  {
    return (LLVM_IRFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    topLevelElementEClass = createEClass(TOP_LEVEL_ELEMENT);

    namedMetadataEClass = createEClass(NAMED_METADATA);
    createEAttribute(namedMetadataEClass, NAMED_METADATA__NAME);
    createEReference(namedMetadataEClass, NAMED_METADATA__NODE);

    metadataRefEClass = createEClass(METADATA_REF);
    createEReference(metadataRefEClass, METADATA_REF__REF);

    valueRefEClass = createEClass(VALUE_REF);

    globalValueRefEClass = createEClass(GLOBAL_VALUE_REF);
    createEReference(globalValueRefEClass, GLOBAL_VALUE_REF__REF);
    createEReference(globalValueRefEClass, GLOBAL_VALUE_REF__CONSTANT);
    createEReference(globalValueRefEClass, GLOBAL_VALUE_REF__METADATA);

    functionRefEClass = createEClass(FUNCTION_REF);
    createEReference(functionRefEClass, FUNCTION_REF__REF);

    localValueRefEClass = createEClass(LOCAL_VALUE_REF);
    createEReference(localValueRefEClass, LOCAL_VALUE_REF__REF);

    globalValueEClass = createEClass(GLOBAL_VALUE);

    globalValueDefEClass = createEClass(GLOBAL_VALUE_DEF);

    localValueEClass = createEClass(LOCAL_VALUE);
    createEAttribute(localValueEClass, LOCAL_VALUE__NAME);

    namedInstructionEClass = createEClass(NAMED_INSTRUCTION);

    instructionEClass = createEClass(INSTRUCTION);
    createEReference(instructionEClass, INSTRUCTION__METADATA);

    aliasEClass = createEClass(ALIAS);
    createEAttribute(aliasEClass, ALIAS__NAME);
    createEAttribute(aliasEClass, ALIAS__LINKAGE);
    createEAttribute(aliasEClass, ALIAS__VISIBILITY);
    createEReference(aliasEClass, ALIAS__TYPE);
    createEReference(aliasEClass, ALIAS__REF);

    targetInfoEClass = createEClass(TARGET_INFO);
    createEAttribute(targetInfoEClass, TARGET_INFO__INFO_TYPE);
    createEAttribute(targetInfoEClass, TARGET_INFO__LAYOUT);

    inlineAsmEClass = createEClass(INLINE_ASM);
    createEAttribute(inlineAsmEClass, INLINE_ASM__ASM_LINE);

    globalVariableEClass = createEClass(GLOBAL_VARIABLE);
    createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__NAME);
    createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__LINKAGE);
    createEReference(globalVariableEClass, GLOBAL_VARIABLE__ADDRSPACE);
    createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__TLS_MODEL);
    createEReference(globalVariableEClass, GLOBAL_VARIABLE__TYPE);
    createEReference(globalVariableEClass, GLOBAL_VARIABLE__INITIAL_VALUE);
    createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__SECTION);
    createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__ALIGN);

    constantEClass = createEClass(CONSTANT);

    constantExpressionEClass = createEClass(CONSTANT_EXPRESSION);
    createEAttribute(constantExpressionEClass, CONSTANT_EXPRESSION__OPCODE);

    constantExpression_convertEClass = createEClass(CONSTANT_EXPRESSION_CONVERT);
    createEReference(constantExpression_convertEClass, CONSTANT_EXPRESSION_CONVERT__FROM_TYPE);
    createEReference(constantExpression_convertEClass, CONSTANT_EXPRESSION_CONVERT__CONSTANT);
    createEReference(constantExpression_convertEClass, CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE);

    constantExpression_getelementptrEClass = createEClass(CONSTANT_EXPRESSION_GETELEMENTPTR);
    createEReference(constantExpression_getelementptrEClass, CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE);
    createEReference(constantExpression_getelementptrEClass, CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT);
    createEReference(constantExpression_getelementptrEClass, CONSTANT_EXPRESSION_GETELEMENTPTR__INDEX_TYPES);
    createEReference(constantExpression_getelementptrEClass, CONSTANT_EXPRESSION_GETELEMENTPTR__INDICES);

    constantExpression_selectEClass = createEClass(CONSTANT_EXPRESSION_SELECT);
    createEReference(constantExpression_selectEClass, CONSTANT_EXPRESSION_SELECT__CONDITION);
    createEReference(constantExpression_selectEClass, CONSTANT_EXPRESSION_SELECT__OP1);
    createEReference(constantExpression_selectEClass, CONSTANT_EXPRESSION_SELECT__OP2);

    constantExpression_compareEClass = createEClass(CONSTANT_EXPRESSION_COMPARE);
    createEAttribute(constantExpression_compareEClass, CONSTANT_EXPRESSION_COMPARE__CONDITION);
    createEReference(constantExpression_compareEClass, CONSTANT_EXPRESSION_COMPARE__OP1);
    createEReference(constantExpression_compareEClass, CONSTANT_EXPRESSION_COMPARE__OP2);

    constantExpression_extractelementEClass = createEClass(CONSTANT_EXPRESSION_EXTRACTELEMENT);
    createEReference(constantExpression_extractelementEClass, CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR);
    createEReference(constantExpression_extractelementEClass, CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX);

    constantExpression_insertelementEClass = createEClass(CONSTANT_EXPRESSION_INSERTELEMENT);
    createEReference(constantExpression_insertelementEClass, CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE);
    createEReference(constantExpression_insertelementEClass, CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR);
    createEReference(constantExpression_insertelementEClass, CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT);
    createEReference(constantExpression_insertelementEClass, CONSTANT_EXPRESSION_INSERTELEMENT__INDEX);

    constantExpression_shufflevectorEClass = createEClass(CONSTANT_EXPRESSION_SHUFFLEVECTOR);
    createEReference(constantExpression_shufflevectorEClass, CONSTANT_EXPRESSION_SHUFFLEVECTOR__VECTOR1);
    createEReference(constantExpression_shufflevectorEClass, CONSTANT_EXPRESSION_SHUFFLEVECTOR__VECTOR2);
    createEReference(constantExpression_shufflevectorEClass, CONSTANT_EXPRESSION_SHUFFLEVECTOR__MASK);

    constantExpression_extractvalueEClass = createEClass(CONSTANT_EXPRESSION_EXTRACTVALUE);
    createEReference(constantExpression_extractvalueEClass, CONSTANT_EXPRESSION_EXTRACTVALUE__VALUE);
    createEAttribute(constantExpression_extractvalueEClass, CONSTANT_EXPRESSION_EXTRACTVALUE__INDICES);

    constantExpression_insertvalueEClass = createEClass(CONSTANT_EXPRESSION_INSERTVALUE);
    createEReference(constantExpression_insertvalueEClass, CONSTANT_EXPRESSION_INSERTVALUE__VALUE);
    createEReference(constantExpression_insertvalueEClass, CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT);
    createEAttribute(constantExpression_insertvalueEClass, CONSTANT_EXPRESSION_INSERTVALUE__INDICES);

    constantExpression_binaryEClass = createEClass(CONSTANT_EXPRESSION_BINARY);
    createEReference(constantExpression_binaryEClass, CONSTANT_EXPRESSION_BINARY__OP1);
    createEReference(constantExpression_binaryEClass, CONSTANT_EXPRESSION_BINARY__OP2);

    undefEClass = createEClass(UNDEF);

    blockAddressEClass = createEClass(BLOCK_ADDRESS);
    createEReference(blockAddressEClass, BLOCK_ADDRESS__FUNCTION);
    createEReference(blockAddressEClass, BLOCK_ADDRESS__BASIC_BLOCK);

    zeroInitializerEClass = createEClass(ZERO_INITIALIZER);

    structureConstantEClass = createEClass(STRUCTURE_CONSTANT);
    createEReference(structureConstantEClass, STRUCTURE_CONSTANT__LIST);

    arrayConstantEClass = createEClass(ARRAY_CONSTANT);
    createEReference(arrayConstantEClass, ARRAY_CONSTANT__LIST);

    vectorConstantEClass = createEClass(VECTOR_CONSTANT);
    createEReference(vectorConstantEClass, VECTOR_CONSTANT__LIST);

    constantListEClass = createEClass(CONSTANT_LIST);
    createEReference(constantListEClass, CONSTANT_LIST__TYPED_CONSTANTS);

    typedConstantEClass = createEClass(TYPED_CONSTANT);
    createEReference(typedConstantEClass, TYPED_CONSTANT__TYPE);
    createEReference(typedConstantEClass, TYPED_CONSTANT__VALUE);

    simpleConstantEClass = createEClass(SIMPLE_CONSTANT);
    createEAttribute(simpleConstantEClass, SIMPLE_CONSTANT__VALUE);

    metadataNodeEClass = createEClass(METADATA_NODE);
    createEReference(metadataNodeEClass, METADATA_NODE__ELEMENTS);

    metadataNodeElementEClass = createEClass(METADATA_NODE_ELEMENT);
    createEReference(metadataNodeElementEClass, METADATA_NODE_ELEMENT__VALUE);
    createEReference(metadataNodeElementEClass, METADATA_NODE_ELEMENT__METADATA_REF);
    createEAttribute(metadataNodeElementEClass, METADATA_NODE_ELEMENT__NULL);

    metadataStringEClass = createEClass(METADATA_STRING);
    createEAttribute(metadataStringEClass, METADATA_STRING__NAME);

    addressSpaceEClass = createEClass(ADDRESS_SPACE);
    createEAttribute(addressSpaceEClass, ADDRESS_SPACE__VALUE);

    functionEClass = createEClass(FUNCTION);
    createEReference(functionEClass, FUNCTION__HEADER);

    functionDefEClass = createEClass(FUNCTION_DEF);
    createEReference(functionDefEClass, FUNCTION_DEF__BASIC_BLOCKS);

    functionDeclEClass = createEClass(FUNCTION_DECL);

    functionHeaderEClass = createEClass(FUNCTION_HEADER);
    createEAttribute(functionHeaderEClass, FUNCTION_HEADER__LINKAGE);
    createEAttribute(functionHeaderEClass, FUNCTION_HEADER__VISIBILITY);
    createEAttribute(functionHeaderEClass, FUNCTION_HEADER__CCONV);
    createEReference(functionHeaderEClass, FUNCTION_HEADER__RETTYPE);
    createEAttribute(functionHeaderEClass, FUNCTION_HEADER__NAME);
    createEReference(functionHeaderEClass, FUNCTION_HEADER__PARAMETERS);
    createEReference(functionHeaderEClass, FUNCTION_HEADER__ATTRS);

    parametersEClass = createEClass(PARAMETERS);
    createEReference(parametersEClass, PARAMETERS__PARAMETERS);
    createEAttribute(parametersEClass, PARAMETERS__VARARG);

    functionAttributesEClass = createEClass(FUNCTION_ATTRIBUTES);
    createEAttribute(functionAttributesEClass, FUNCTION_ATTRIBUTES__ATTRIBUTES);

    basicBlockEClass = createEClass(BASIC_BLOCK);
    createEAttribute(basicBlockEClass, BASIC_BLOCK__NAME);
    createEReference(basicBlockEClass, BASIC_BLOCK__INSTRUCTIONS);

    metadataSuffixEClass = createEClass(METADATA_SUFFIX);
    createEAttribute(metadataSuffixEClass, METADATA_SUFFIX__NAME);
    createEReference(metadataSuffixEClass, METADATA_SUFFIX__VALUE);

    startingInstructionEClass = createEClass(STARTING_INSTRUCTION);
    createEReference(startingInstructionEClass, STARTING_INSTRUCTION__INSTRUCTION);

    middleInstructionEClass = createEClass(MIDDLE_INSTRUCTION);
    createEReference(middleInstructionEClass, MIDDLE_INSTRUCTION__INSTRUCTION);

    namedMiddleInstructionEClass = createEClass(NAMED_MIDDLE_INSTRUCTION);
    createEReference(namedMiddleInstructionEClass, NAMED_MIDDLE_INSTRUCTION__INSTRUCTION);

    terminatorInstructionEClass = createEClass(TERMINATOR_INSTRUCTION);
    createEReference(terminatorInstructionEClass, TERMINATOR_INSTRUCTION__INSTRUCTION);

    namedTerminatorInstructionEClass = createEClass(NAMED_TERMINATOR_INSTRUCTION);
    createEReference(namedTerminatorInstructionEClass, NAMED_TERMINATOR_INSTRUCTION__INSTRUCTION);

    instruction_retEClass = createEClass(INSTRUCTION_RET);
    createEAttribute(instruction_retEClass, INSTRUCTION_RET__OPCODE);
    createEReference(instruction_retEClass, INSTRUCTION_RET__VAL);

    instruction_brEClass = createEClass(INSTRUCTION_BR);
    createEAttribute(instruction_brEClass, INSTRUCTION_BR__OPCODE);
    createEReference(instruction_brEClass, INSTRUCTION_BR__CONDITION);
    createEReference(instruction_brEClass, INSTRUCTION_BR__TRUE);
    createEReference(instruction_brEClass, INSTRUCTION_BR__FALSE);
    createEReference(instruction_brEClass, INSTRUCTION_BR__UNCONDITIONAL);

    instruction_switchEClass = createEClass(INSTRUCTION_SWITCH);
    createEAttribute(instruction_switchEClass, INSTRUCTION_SWITCH__OPCODE);
    createEReference(instruction_switchEClass, INSTRUCTION_SWITCH__COMPARISON_VALUE);
    createEReference(instruction_switchEClass, INSTRUCTION_SWITCH__DEFAULT_DEST);
    createEReference(instruction_switchEClass, INSTRUCTION_SWITCH__CASE_CONDITIONS);
    createEReference(instruction_switchEClass, INSTRUCTION_SWITCH__DESTINATIONS);

    instruction_indirectbrEClass = createEClass(INSTRUCTION_INDIRECTBR);
    createEAttribute(instruction_indirectbrEClass, INSTRUCTION_INDIRECTBR__OPCODE);
    createEReference(instruction_indirectbrEClass, INSTRUCTION_INDIRECTBR__ADDRESS);
    createEReference(instruction_indirectbrEClass, INSTRUCTION_INDIRECTBR__DESTINATIONS);

    instruction_invoke_voidEClass = createEClass(INSTRUCTION_INVOKE_VOID);
    createEAttribute(instruction_invoke_voidEClass, INSTRUCTION_INVOKE_VOID__OPCODE);
    createEAttribute(instruction_invoke_voidEClass, INSTRUCTION_INVOKE_VOID__CCONV);
    createEReference(instruction_invoke_voidEClass, INSTRUCTION_INVOKE_VOID__RETTYPE);
    createEReference(instruction_invoke_voidEClass, INSTRUCTION_INVOKE_VOID__CALLEE);
    createEReference(instruction_invoke_voidEClass, INSTRUCTION_INVOKE_VOID__ARGS);
    createEReference(instruction_invoke_voidEClass, INSTRUCTION_INVOKE_VOID__ATTRIBUTES);
    createEReference(instruction_invoke_voidEClass, INSTRUCTION_INVOKE_VOID__TO_LABEL);
    createEReference(instruction_invoke_voidEClass, INSTRUCTION_INVOKE_VOID__EXCEPTION_LABEL);

    instruction_invoke_nonVoidEClass = createEClass(INSTRUCTION_INVOKE_NON_VOID);
    createEAttribute(instruction_invoke_nonVoidEClass, INSTRUCTION_INVOKE_NON_VOID__OPCODE);
    createEAttribute(instruction_invoke_nonVoidEClass, INSTRUCTION_INVOKE_NON_VOID__CCONV);
    createEReference(instruction_invoke_nonVoidEClass, INSTRUCTION_INVOKE_NON_VOID__RETTYPE);
    createEReference(instruction_invoke_nonVoidEClass, INSTRUCTION_INVOKE_NON_VOID__CALLEE);
    createEReference(instruction_invoke_nonVoidEClass, INSTRUCTION_INVOKE_NON_VOID__ARGS);
    createEReference(instruction_invoke_nonVoidEClass, INSTRUCTION_INVOKE_NON_VOID__ATTRIBUTES);
    createEReference(instruction_invoke_nonVoidEClass, INSTRUCTION_INVOKE_NON_VOID__TO_LABEL);
    createEReference(instruction_invoke_nonVoidEClass, INSTRUCTION_INVOKE_NON_VOID__EXCEPTION_LABEL);

    instruction_resumeEClass = createEClass(INSTRUCTION_RESUME);
    createEAttribute(instruction_resumeEClass, INSTRUCTION_RESUME__OPCODE);
    createEReference(instruction_resumeEClass, INSTRUCTION_RESUME__VALUE);

    instruction_unreachableEClass = createEClass(INSTRUCTION_UNREACHABLE);
    createEAttribute(instruction_unreachableEClass, INSTRUCTION_UNREACHABLE__OPCODE);

    basicBlockRefEClass = createEClass(BASIC_BLOCK_REF);
    createEReference(basicBlockRefEClass, BASIC_BLOCK_REF__REF);

    binaryInstructionEClass = createEClass(BINARY_INSTRUCTION);
    createEAttribute(binaryInstructionEClass, BINARY_INSTRUCTION__OPCODE);
    createEReference(binaryInstructionEClass, BINARY_INSTRUCTION__TYPE);
    createEReference(binaryInstructionEClass, BINARY_INSTRUCTION__OP1);
    createEReference(binaryInstructionEClass, BINARY_INSTRUCTION__OP2);

    instruction_addEClass = createEClass(INSTRUCTION_ADD);

    instruction_faddEClass = createEClass(INSTRUCTION_FADD);

    instruction_subEClass = createEClass(INSTRUCTION_SUB);

    instruction_fsubEClass = createEClass(INSTRUCTION_FSUB);

    instruction_mulEClass = createEClass(INSTRUCTION_MUL);

    instruction_fmulEClass = createEClass(INSTRUCTION_FMUL);

    instruction_udivEClass = createEClass(INSTRUCTION_UDIV);

    instruction_sdivEClass = createEClass(INSTRUCTION_SDIV);

    instruction_fdivEClass = createEClass(INSTRUCTION_FDIV);

    instruction_uremEClass = createEClass(INSTRUCTION_UREM);

    instruction_sremEClass = createEClass(INSTRUCTION_SREM);

    instruction_fremEClass = createEClass(INSTRUCTION_FREM);

    bitwiseBinaryInstructionEClass = createEClass(BITWISE_BINARY_INSTRUCTION);
    createEAttribute(bitwiseBinaryInstructionEClass, BITWISE_BINARY_INSTRUCTION__OPCODE);
    createEReference(bitwiseBinaryInstructionEClass, BITWISE_BINARY_INSTRUCTION__TYPE);
    createEReference(bitwiseBinaryInstructionEClass, BITWISE_BINARY_INSTRUCTION__OP1);
    createEReference(bitwiseBinaryInstructionEClass, BITWISE_BINARY_INSTRUCTION__OP2);

    instruction_shlEClass = createEClass(INSTRUCTION_SHL);

    instruction_lshrEClass = createEClass(INSTRUCTION_LSHR);

    instruction_ashrEClass = createEClass(INSTRUCTION_ASHR);

    instruction_andEClass = createEClass(INSTRUCTION_AND);

    instruction_orEClass = createEClass(INSTRUCTION_OR);

    instruction_xorEClass = createEClass(INSTRUCTION_XOR);

    vectorInstructionsEClass = createEClass(VECTOR_INSTRUCTIONS);
    createEAttribute(vectorInstructionsEClass, VECTOR_INSTRUCTIONS__OPCODE);

    instruction_extractelementEClass = createEClass(INSTRUCTION_EXTRACTELEMENT);
    createEReference(instruction_extractelementEClass, INSTRUCTION_EXTRACTELEMENT__VECTOR);
    createEReference(instruction_extractelementEClass, INSTRUCTION_EXTRACTELEMENT__INDEX);

    instruction_insertelementEClass = createEClass(INSTRUCTION_INSERTELEMENT);
    createEReference(instruction_insertelementEClass, INSTRUCTION_INSERTELEMENT__VECTOR);
    createEReference(instruction_insertelementEClass, INSTRUCTION_INSERTELEMENT__ELEMENT);
    createEReference(instruction_insertelementEClass, INSTRUCTION_INSERTELEMENT__INDEX);

    instruction_shufflevectorEClass = createEClass(INSTRUCTION_SHUFFLEVECTOR);
    createEReference(instruction_shufflevectorEClass, INSTRUCTION_SHUFFLEVECTOR__VECTOR1);
    createEReference(instruction_shufflevectorEClass, INSTRUCTION_SHUFFLEVECTOR__VECTOR2);
    createEReference(instruction_shufflevectorEClass, INSTRUCTION_SHUFFLEVECTOR__MASK);

    aggregateInstructionEClass = createEClass(AGGREGATE_INSTRUCTION);
    createEAttribute(aggregateInstructionEClass, AGGREGATE_INSTRUCTION__OPCODE);
    createEReference(aggregateInstructionEClass, AGGREGATE_INSTRUCTION__AGGREGATE);
    createEReference(aggregateInstructionEClass, AGGREGATE_INSTRUCTION__INDICES);

    instruction_extractvalueEClass = createEClass(INSTRUCTION_EXTRACTVALUE);

    instruction_insertvalueEClass = createEClass(INSTRUCTION_INSERTVALUE);
    createEReference(instruction_insertvalueEClass, INSTRUCTION_INSERTVALUE__ELEMENT);

    memoryInstructionEClass = createEClass(MEMORY_INSTRUCTION);
    createEAttribute(memoryInstructionEClass, MEMORY_INSTRUCTION__OPCODE);

    instruction_allocaEClass = createEClass(INSTRUCTION_ALLOCA);
    createEReference(instruction_allocaEClass, INSTRUCTION_ALLOCA__TYPE);
    createEReference(instruction_allocaEClass, INSTRUCTION_ALLOCA__NUM_ELEMENTS);
    createEAttribute(instruction_allocaEClass, INSTRUCTION_ALLOCA__ALIGNMENT);

    instruction_loadEClass = createEClass(INSTRUCTION_LOAD);
    createEReference(instruction_loadEClass, INSTRUCTION_LOAD__POINTER);
    createEAttribute(instruction_loadEClass, INSTRUCTION_LOAD__ALIGNMENT);
    createEReference(instruction_loadEClass, INSTRUCTION_LOAD__NONTEMPORAL_INDEX);
    createEReference(instruction_loadEClass, INSTRUCTION_LOAD__INVARIANT_LOAD_INDEX);
    createEAttribute(instruction_loadEClass, INSTRUCTION_LOAD__ORDERING);

    instruction_storeEClass = createEClass(INSTRUCTION_STORE);
    createEReference(instruction_storeEClass, INSTRUCTION_STORE__VALUE);
    createEReference(instruction_storeEClass, INSTRUCTION_STORE__POINTER);
    createEAttribute(instruction_storeEClass, INSTRUCTION_STORE__ALIGNMENT);
    createEReference(instruction_storeEClass, INSTRUCTION_STORE__NONTEMPORAL_INDEX);
    createEAttribute(instruction_storeEClass, INSTRUCTION_STORE__ORDERING);

    instruction_fenceEClass = createEClass(INSTRUCTION_FENCE);
    createEAttribute(instruction_fenceEClass, INSTRUCTION_FENCE__ORDERING);

    instruction_cmpxchgEClass = createEClass(INSTRUCTION_CMPXCHG);
    createEReference(instruction_cmpxchgEClass, INSTRUCTION_CMPXCHG__POINTER);
    createEReference(instruction_cmpxchgEClass, INSTRUCTION_CMPXCHG__COMPARED_WITH);
    createEReference(instruction_cmpxchgEClass, INSTRUCTION_CMPXCHG__NEW_VALUE);
    createEAttribute(instruction_cmpxchgEClass, INSTRUCTION_CMPXCHG__ORDERING);

    instruction_atomicrmwEClass = createEClass(INSTRUCTION_ATOMICRMW);
    createEAttribute(instruction_atomicrmwEClass, INSTRUCTION_ATOMICRMW__OPERATION);
    createEReference(instruction_atomicrmwEClass, INSTRUCTION_ATOMICRMW__POINTER);
    createEReference(instruction_atomicrmwEClass, INSTRUCTION_ATOMICRMW__ARGUMENT);
    createEAttribute(instruction_atomicrmwEClass, INSTRUCTION_ATOMICRMW__ORDERING);

    instruction_getelementptrEClass = createEClass(INSTRUCTION_GETELEMENTPTR);
    createEReference(instruction_getelementptrEClass, INSTRUCTION_GETELEMENTPTR__BASE);
    createEReference(instruction_getelementptrEClass, INSTRUCTION_GETELEMENTPTR__INDICES);

    conversionInstructionEClass = createEClass(CONVERSION_INSTRUCTION);
    createEAttribute(conversionInstructionEClass, CONVERSION_INSTRUCTION__OPCODE);
    createEReference(conversionInstructionEClass, CONVERSION_INSTRUCTION__FROM_TYPE);
    createEReference(conversionInstructionEClass, CONVERSION_INSTRUCTION__VALUE);
    createEReference(conversionInstructionEClass, CONVERSION_INSTRUCTION__TARGET_TYPE);

    otherInstructionEClass = createEClass(OTHER_INSTRUCTION);
    createEAttribute(otherInstructionEClass, OTHER_INSTRUCTION__OPCODE);

    instruction_icmpEClass = createEClass(INSTRUCTION_ICMP);
    createEAttribute(instruction_icmpEClass, INSTRUCTION_ICMP__CONDITION);
    createEReference(instruction_icmpEClass, INSTRUCTION_ICMP__TYPE);
    createEReference(instruction_icmpEClass, INSTRUCTION_ICMP__OP1);
    createEReference(instruction_icmpEClass, INSTRUCTION_ICMP__OP2);

    instruction_fcmpEClass = createEClass(INSTRUCTION_FCMP);
    createEAttribute(instruction_fcmpEClass, INSTRUCTION_FCMP__CONDITION);
    createEReference(instruction_fcmpEClass, INSTRUCTION_FCMP__TYPE);
    createEReference(instruction_fcmpEClass, INSTRUCTION_FCMP__OP1);
    createEReference(instruction_fcmpEClass, INSTRUCTION_FCMP__OP2);

    instruction_phiEClass = createEClass(INSTRUCTION_PHI);
    createEAttribute(instruction_phiEClass, INSTRUCTION_PHI__OPCODE);
    createEReference(instruction_phiEClass, INSTRUCTION_PHI__TYPE);
    createEReference(instruction_phiEClass, INSTRUCTION_PHI__VALUES);
    createEReference(instruction_phiEClass, INSTRUCTION_PHI__LABELS);

    instruction_selectEClass = createEClass(INSTRUCTION_SELECT);
    createEReference(instruction_selectEClass, INSTRUCTION_SELECT__CONDITION);
    createEReference(instruction_selectEClass, INSTRUCTION_SELECT__VALUE1);
    createEReference(instruction_selectEClass, INSTRUCTION_SELECT__VALUE2);

    instruction_call_nonVoidEClass = createEClass(INSTRUCTION_CALL_NON_VOID);
    createEAttribute(instruction_call_nonVoidEClass, INSTRUCTION_CALL_NON_VOID__IS_TAIL);
    createEAttribute(instruction_call_nonVoidEClass, INSTRUCTION_CALL_NON_VOID__OPCODE);
    createEAttribute(instruction_call_nonVoidEClass, INSTRUCTION_CALL_NON_VOID__CCONV);
    createEReference(instruction_call_nonVoidEClass, INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES);
    createEReference(instruction_call_nonVoidEClass, INSTRUCTION_CALL_NON_VOID__RETURN_TYPE);
    createEReference(instruction_call_nonVoidEClass, INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE);
    createEReference(instruction_call_nonVoidEClass, INSTRUCTION_CALL_NON_VOID__CALLEE);
    createEReference(instruction_call_nonVoidEClass, INSTRUCTION_CALL_NON_VOID__ARGS);
    createEReference(instruction_call_nonVoidEClass, INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES);

    instruction_call_voidEClass = createEClass(INSTRUCTION_CALL_VOID);
    createEAttribute(instruction_call_voidEClass, INSTRUCTION_CALL_VOID__IS_TAIL);
    createEAttribute(instruction_call_voidEClass, INSTRUCTION_CALL_VOID__OPCODE);
    createEAttribute(instruction_call_voidEClass, INSTRUCTION_CALL_VOID__CCONV);
    createEReference(instruction_call_voidEClass, INSTRUCTION_CALL_VOID__RETURN_ATTRIBUTES);
    createEReference(instruction_call_voidEClass, INSTRUCTION_CALL_VOID__RETURN_TYPE);
    createEReference(instruction_call_voidEClass, INSTRUCTION_CALL_VOID__FUNCTION_POINTER_TYPE);
    createEReference(instruction_call_voidEClass, INSTRUCTION_CALL_VOID__CALLEE);
    createEReference(instruction_call_voidEClass, INSTRUCTION_CALL_VOID__ARGS);
    createEReference(instruction_call_voidEClass, INSTRUCTION_CALL_VOID__FUNCTION_ATTRIBUTES);

    argListEClass = createEClass(ARG_LIST);
    createEReference(argListEClass, ARG_LIST__ARGUMENTS);

    calleeEClass = createEClass(CALLEE);

    inlineAssemblerEClass = createEClass(INLINE_ASSEMBLER);
    createEAttribute(inlineAssemblerEClass, INLINE_ASSEMBLER__ASSEMBLER);
    createEAttribute(inlineAssemblerEClass, INLINE_ASSEMBLER__FLAGS);

    instruction_va_argEClass = createEClass(INSTRUCTION_VA_ARG);
    createEReference(instruction_va_argEClass, INSTRUCTION_VA_ARG__ARGLIST);
    createEReference(instruction_va_argEClass, INSTRUCTION_VA_ARG__TYPE);

    instruction_landingpadEClass = createEClass(INSTRUCTION_LANDINGPAD);
    createEReference(instruction_landingpadEClass, INSTRUCTION_LANDINGPAD__RESULT_TYPE);
    createEReference(instruction_landingpadEClass, INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE);
    createEReference(instruction_landingpadEClass, INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION);
    createEReference(instruction_landingpadEClass, INSTRUCTION_LANDINGPAD__CLAUSES);

    landingpadClauseEClass = createEClass(LANDINGPAD_CLAUSE);
    createEAttribute(landingpadClauseEClass, LANDINGPAD_CLAUSE__LANDING_PAD_TYPE);
    createEReference(landingpadClauseEClass, LANDINGPAD_CLAUSE__CATCH_TYPE);
    createEReference(landingpadClauseEClass, LANDINGPAD_CLAUSE__ARRAY_TYPE);
    createEReference(landingpadClauseEClass, LANDINGPAD_CLAUSE__ARRAY_CONSTANT);

    typedValueEClass = createEClass(TYPED_VALUE);
    createEReference(typedValueEClass, TYPED_VALUE__TYPE);
    createEReference(typedValueEClass, TYPED_VALUE__REF);

    parameterTypeEClass = createEClass(PARAMETER_TYPE);
    createEReference(parameterTypeEClass, PARAMETER_TYPE__TYPE);
    createEReference(parameterTypeEClass, PARAMETER_TYPE__ATTRS);

    parameterAttributesEClass = createEClass(PARAMETER_ATTRIBUTES);
    createEAttribute(parameterAttributesEClass, PARAMETER_ATTRIBUTES__ATTRIBUTES);

    argumentEClass = createEClass(ARGUMENT);
    createEReference(argumentEClass, ARGUMENT__TYPE);
    createEReference(argumentEClass, ARGUMENT__REF);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);

    nonVoidTypeEClass = createEClass(NON_VOID_TYPE);
    createEReference(nonVoidTypeEClass, NON_VOID_TYPE__BASE_TYPE);
    createEReference(nonVoidTypeEClass, NON_VOID_TYPE__FUNCTION_SUFFIX);
    createEReference(nonVoidTypeEClass, NON_VOID_TYPE__STARS);

    starEClass = createEClass(STAR);
    createEReference(starEClass, STAR__ADDRESS_SPACE);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__BASE_TYPE);
    createEReference(typeEClass, TYPE__STARS);
    createEReference(typeEClass, TYPE__FUNCTION_SUFFIX);

    functionTypeOrPointerToFunctionTypeSuffixEClass = createEClass(FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX);
    createEReference(functionTypeOrPointerToFunctionTypeSuffixEClass, FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__CONTAINED_TYPES);
    createEAttribute(functionTypeOrPointerToFunctionTypeSuffixEClass, FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__VARARG);
    createEReference(functionTypeOrPointerToFunctionTypeSuffixEClass, FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__STARS);

    nonLeftRecursiveTypeEClass = createEClass(NON_LEFT_RECURSIVE_TYPE);
    createEReference(nonLeftRecursiveTypeEClass, NON_LEFT_RECURSIVE_TYPE__TYPE);
    createEReference(nonLeftRecursiveTypeEClass, NON_LEFT_RECURSIVE_TYPE__TYPEDEF);

    nonLeftRecursiveNonVoidTypeEClass = createEClass(NON_LEFT_RECURSIVE_NON_VOID_TYPE);
    createEReference(nonLeftRecursiveNonVoidTypeEClass, NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE);

    typeDefEClass = createEClass(TYPE_DEF);
    createEAttribute(typeDefEClass, TYPE_DEF__NAME);
    createEReference(typeDefEClass, TYPE_DEF__TYPE);

    intTypeEClass = createEClass(INT_TYPE);

    opaqueTypeEClass = createEClass(OPAQUE_TYPE);

    structTypeEClass = createEClass(STRUCT_TYPE);
    createEReference(structTypeEClass, STRUCT_TYPE__TYPES);
    createEAttribute(structTypeEClass, STRUCT_TYPE__PACKED);

    vectorTypeEClass = createEClass(VECTOR_TYPE);
    createEAttribute(vectorTypeEClass, VECTOR_TYPE__SIZE);
    createEReference(vectorTypeEClass, VECTOR_TYPE__ELEM_TYPE);

    arrayTypeEClass = createEClass(ARRAY_TYPE);
    createEAttribute(arrayTypeEClass, ARRAY_TYPE__SIZE);
    createEReference(arrayTypeEClass, ARRAY_TYPE__ELEM_TYPE);

    x86mmxTypeEClass = createEClass(X8_6MMX_TYPE);

    voidTypeEClass = createEClass(VOID_TYPE);

    metadataTypeEClass = createEClass(METADATA_TYPE);

    floatingTypeEClass = createEClass(FLOATING_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    namedMetadataEClass.getESuperTypes().add(this.getTopLevelElement());
    valueRefEClass.getESuperTypes().add(this.getCallee());
    globalValueRefEClass.getESuperTypes().add(this.getValueRef());
    localValueRefEClass.getESuperTypes().add(this.getValueRef());
    globalValueEClass.getESuperTypes().add(this.getTopLevelElement());
    namedInstructionEClass.getESuperTypes().add(this.getLocalValue());
    aliasEClass.getESuperTypes().add(this.getGlobalValue());
    aliasEClass.getESuperTypes().add(this.getGlobalValueDef());
    targetInfoEClass.getESuperTypes().add(this.getTopLevelElement());
    inlineAsmEClass.getESuperTypes().add(this.getTopLevelElement());
    globalVariableEClass.getESuperTypes().add(this.getGlobalValue());
    globalVariableEClass.getESuperTypes().add(this.getGlobalValueDef());
    constantExpressionEClass.getESuperTypes().add(this.getConstant());
    constantExpression_convertEClass.getESuperTypes().add(this.getConstantExpression());
    constantExpression_getelementptrEClass.getESuperTypes().add(this.getConstantExpression());
    constantExpression_selectEClass.getESuperTypes().add(this.getConstantExpression());
    constantExpression_compareEClass.getESuperTypes().add(this.getConstantExpression());
    constantExpression_extractelementEClass.getESuperTypes().add(this.getConstantExpression());
    constantExpression_insertelementEClass.getESuperTypes().add(this.getConstantExpression());
    constantExpression_shufflevectorEClass.getESuperTypes().add(this.getConstantExpression());
    constantExpression_extractvalueEClass.getESuperTypes().add(this.getConstantExpression());
    constantExpression_insertvalueEClass.getESuperTypes().add(this.getConstantExpression());
    constantExpression_binaryEClass.getESuperTypes().add(this.getConstantExpression());
    undefEClass.getESuperTypes().add(this.getConstant());
    blockAddressEClass.getESuperTypes().add(this.getConstant());
    zeroInitializerEClass.getESuperTypes().add(this.getConstant());
    structureConstantEClass.getESuperTypes().add(this.getConstant());
    arrayConstantEClass.getESuperTypes().add(this.getConstant());
    vectorConstantEClass.getESuperTypes().add(this.getConstant());
    simpleConstantEClass.getESuperTypes().add(this.getConstant());
    metadataNodeEClass.getESuperTypes().add(this.getConstant());
    metadataStringEClass.getESuperTypes().add(this.getConstant());
    functionEClass.getESuperTypes().add(this.getGlobalValue());
    functionDefEClass.getESuperTypes().add(this.getFunction());
    functionDeclEClass.getESuperTypes().add(this.getFunction());
    functionHeaderEClass.getESuperTypes().add(this.getGlobalValueDef());
    startingInstructionEClass.getESuperTypes().add(this.getNamedInstruction());
    startingInstructionEClass.getESuperTypes().add(this.getInstruction());
    middleInstructionEClass.getESuperTypes().add(this.getInstruction());
    namedMiddleInstructionEClass.getESuperTypes().add(this.getNamedInstruction());
    terminatorInstructionEClass.getESuperTypes().add(this.getInstruction());
    namedTerminatorInstructionEClass.getESuperTypes().add(this.getNamedInstruction());
    instruction_addEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_faddEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_subEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_fsubEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_mulEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_fmulEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_udivEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_sdivEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_fdivEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_uremEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_sremEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_fremEClass.getESuperTypes().add(this.getBinaryInstruction());
    instruction_shlEClass.getESuperTypes().add(this.getBitwiseBinaryInstruction());
    instruction_lshrEClass.getESuperTypes().add(this.getBitwiseBinaryInstruction());
    instruction_ashrEClass.getESuperTypes().add(this.getBitwiseBinaryInstruction());
    instruction_andEClass.getESuperTypes().add(this.getBitwiseBinaryInstruction());
    instruction_orEClass.getESuperTypes().add(this.getBitwiseBinaryInstruction());
    instruction_xorEClass.getESuperTypes().add(this.getBitwiseBinaryInstruction());
    instruction_extractelementEClass.getESuperTypes().add(this.getVectorInstructions());
    instruction_insertelementEClass.getESuperTypes().add(this.getVectorInstructions());
    instruction_shufflevectorEClass.getESuperTypes().add(this.getVectorInstructions());
    instruction_extractvalueEClass.getESuperTypes().add(this.getAggregateInstruction());
    instruction_insertvalueEClass.getESuperTypes().add(this.getAggregateInstruction());
    instruction_allocaEClass.getESuperTypes().add(this.getMemoryInstruction());
    instruction_loadEClass.getESuperTypes().add(this.getMemoryInstruction());
    instruction_storeEClass.getESuperTypes().add(this.getMemoryInstruction());
    instruction_fenceEClass.getESuperTypes().add(this.getMemoryInstruction());
    instruction_cmpxchgEClass.getESuperTypes().add(this.getMemoryInstruction());
    instruction_atomicrmwEClass.getESuperTypes().add(this.getMemoryInstruction());
    instruction_getelementptrEClass.getESuperTypes().add(this.getMemoryInstruction());
    instruction_icmpEClass.getESuperTypes().add(this.getOtherInstruction());
    instruction_fcmpEClass.getESuperTypes().add(this.getOtherInstruction());
    instruction_selectEClass.getESuperTypes().add(this.getOtherInstruction());
    inlineAssemblerEClass.getESuperTypes().add(this.getCallee());
    instruction_va_argEClass.getESuperTypes().add(this.getOtherInstruction());
    instruction_landingpadEClass.getESuperTypes().add(this.getOtherInstruction());
    parameterEClass.getESuperTypes().add(this.getLocalValue());
    typeDefEClass.getESuperTypes().add(this.getTopLevelElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getTopLevelElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelElementEClass, TopLevelElement.class, "TopLevelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedMetadataEClass, NamedMetadata.class, "NamedMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedMetadata_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamedMetadata_Node(), this.getMetadataNode(), null, "node", null, 0, 1, NamedMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metadataRefEClass, MetadataRef.class, "MetadataRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetadataRef_Ref(), this.getNamedMetadata(), null, "ref", null, 0, 1, MetadataRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueRefEClass, ValueRef.class, "ValueRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(globalValueRefEClass, GlobalValueRef.class, "GlobalValueRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGlobalValueRef_Ref(), this.getGlobalValueDef(), null, "ref", null, 0, 1, GlobalValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalValueRef_Constant(), this.getConstant(), null, "constant", null, 0, 1, GlobalValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalValueRef_Metadata(), this.getMetadataRef(), null, "metadata", null, 0, 1, GlobalValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionRefEClass, FunctionRef.class, "FunctionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionRef_Ref(), this.getFunctionHeader(), null, "ref", null, 0, 1, FunctionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localValueRefEClass, LocalValueRef.class, "LocalValueRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalValueRef_Ref(), this.getLocalValue(), null, "ref", null, 0, 1, LocalValueRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globalValueEClass, GlobalValue.class, "GlobalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(globalValueDefEClass, GlobalValueDef.class, "GlobalValueDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localValueEClass, LocalValue.class, "LocalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, LocalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedInstructionEClass, NamedInstruction.class, "NamedInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_Metadata(), this.getMetadataSuffix(), null, "metadata", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aliasEClass, Alias.class, "Alias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlias_Name(), ecorePackage.getEString(), "name", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlias_Linkage(), ecorePackage.getEString(), "linkage", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlias_Visibility(), ecorePackage.getEString(), "visibility", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlias_Type(), this.getType(), null, "type", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlias_Ref(), this.getGlobalValueRef(), null, "ref", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetInfoEClass, TargetInfo.class, "TargetInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTargetInfo_InfoType(), ecorePackage.getEString(), "infoType", null, 0, 1, TargetInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTargetInfo_Layout(), ecorePackage.getEString(), "layout", null, 0, 1, TargetInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inlineAsmEClass, InlineAsm.class, "InlineAsm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInlineAsm_AsmLine(), ecorePackage.getEString(), "asmLine", null, 0, 1, InlineAsm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobalVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlobalVariable_Linkage(), ecorePackage.getEString(), "linkage", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalVariable_Addrspace(), this.getAddressSpace(), null, "addrspace", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlobalVariable_TlsModel(), ecorePackage.getEString(), "tlsModel", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalVariable_Type(), this.getType(), null, "type", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalVariable_InitialValue(), this.getConstant(), null, "initialValue", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlobalVariable_Section(), ecorePackage.getEString(), "section", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlobalVariable_Align(), ecorePackage.getEString(), "align", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constantExpressionEClass, ConstantExpression.class, "ConstantExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantExpression_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, ConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_convertEClass, ConstantExpression_convert.class, "ConstantExpression_convert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_convert_FromType(), this.getType(), null, "fromType", null, 0, 1, ConstantExpression_convert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_convert_Constant(), this.getGlobalValueRef(), null, "constant", null, 0, 1, ConstantExpression_convert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_convert_TargetType(), this.getType(), null, "targetType", null, 0, 1, ConstantExpression_convert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_getelementptrEClass, ConstantExpression_getelementptr.class, "ConstantExpression_getelementptr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_getelementptr_ConstantType(), this.getType(), null, "constantType", null, 0, 1, ConstantExpression_getelementptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_getelementptr_Constant(), this.getGlobalValueRef(), null, "constant", null, 0, 1, ConstantExpression_getelementptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_getelementptr_IndexTypes(), this.getType(), null, "indexTypes", null, 0, -1, ConstantExpression_getelementptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_getelementptr_Indices(), this.getConstant(), null, "indices", null, 0, -1, ConstantExpression_getelementptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_selectEClass, ConstantExpression_select.class, "ConstantExpression_select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_select_Condition(), this.getTypedValue(), null, "condition", null, 0, 1, ConstantExpression_select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_select_Op1(), this.getTypedValue(), null, "op1", null, 0, 1, ConstantExpression_select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_select_Op2(), this.getTypedValue(), null, "op2", null, 0, 1, ConstantExpression_select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_compareEClass, ConstantExpression_compare.class, "ConstantExpression_compare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantExpression_compare_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, ConstantExpression_compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_compare_Op1(), this.getTypedValue(), null, "op1", null, 0, 1, ConstantExpression_compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_compare_Op2(), this.getTypedValue(), null, "op2", null, 0, 1, ConstantExpression_compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_extractelementEClass, ConstantExpression_extractelement.class, "ConstantExpression_extractelement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_extractelement_Vector(), this.getTypedValue(), null, "vector", null, 0, 1, ConstantExpression_extractelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_extractelement_Index(), this.getTypedValue(), null, "index", null, 0, 1, ConstantExpression_extractelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_insertelementEClass, ConstantExpression_insertelement.class, "ConstantExpression_insertelement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_insertelement_VectorType(), this.getVectorType(), null, "vectorType", null, 0, 1, ConstantExpression_insertelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_insertelement_Vector(), this.getValueRef(), null, "vector", null, 0, 1, ConstantExpression_insertelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_insertelement_Element(), this.getTypedValue(), null, "element", null, 0, 1, ConstantExpression_insertelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_insertelement_Index(), this.getTypedValue(), null, "index", null, 0, 1, ConstantExpression_insertelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_shufflevectorEClass, ConstantExpression_shufflevector.class, "ConstantExpression_shufflevector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_shufflevector_Vector1(), this.getTypedValue(), null, "vector1", null, 0, 1, ConstantExpression_shufflevector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_shufflevector_Vector2(), this.getTypedValue(), null, "vector2", null, 0, 1, ConstantExpression_shufflevector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_shufflevector_Mask(), this.getTypedValue(), null, "mask", null, 0, 1, ConstantExpression_shufflevector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_extractvalueEClass, ConstantExpression_extractvalue.class, "ConstantExpression_extractvalue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_extractvalue_Value(), this.getTypedValue(), null, "value", null, 0, 1, ConstantExpression_extractvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstantExpression_extractvalue_Indices(), ecorePackage.getEString(), "indices", null, 0, -1, ConstantExpression_extractvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_insertvalueEClass, ConstantExpression_insertvalue.class, "ConstantExpression_insertvalue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_insertvalue_Value(), this.getTypedValue(), null, "value", null, 0, 1, ConstantExpression_insertvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_insertvalue_Element(), this.getTypedValue(), null, "element", null, 0, 1, ConstantExpression_insertvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstantExpression_insertvalue_Indices(), ecorePackage.getEString(), "indices", null, 0, -1, ConstantExpression_insertvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpression_binaryEClass, ConstantExpression_binary.class, "ConstantExpression_binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_binary_Op1(), this.getTypedValue(), null, "op1", null, 0, 1, ConstantExpression_binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantExpression_binary_Op2(), this.getTypedValue(), null, "op2", null, 0, 1, ConstantExpression_binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(undefEClass, Undef.class, "Undef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockAddressEClass, BlockAddress.class, "BlockAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlockAddress_Function(), this.getFunctionRef(), null, "function", null, 0, 1, BlockAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlockAddress_BasicBlock(), this.getBasicBlockRef(), null, "basicBlock", null, 0, 1, BlockAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(zeroInitializerEClass, ZeroInitializer.class, "ZeroInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structureConstantEClass, StructureConstant.class, "StructureConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructureConstant_List(), this.getConstantList(), null, "list", null, 0, 1, StructureConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayConstantEClass, ArrayConstant.class, "ArrayConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayConstant_List(), this.getConstantList(), null, "list", null, 0, 1, ArrayConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vectorConstantEClass, VectorConstant.class, "VectorConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVectorConstant_List(), this.getConstantList(), null, "list", null, 0, 1, VectorConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantListEClass, ConstantList.class, "ConstantList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantList_TypedConstants(), this.getTypedConstant(), null, "typedConstants", null, 0, -1, ConstantList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedConstantEClass, TypedConstant.class, "TypedConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypedConstant_Type(), this.getType(), null, "type", null, 0, 1, TypedConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypedConstant_Value(), this.getConstant(), null, "value", null, 0, 1, TypedConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleConstantEClass, SimpleConstant.class, "SimpleConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, SimpleConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metadataNodeEClass, MetadataNode.class, "MetadataNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetadataNode_Elements(), this.getMetadataNodeElement(), null, "elements", null, 0, -1, MetadataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metadataNodeElementEClass, MetadataNodeElement.class, "MetadataNodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetadataNodeElement_Value(), this.getTypedValue(), null, "value", null, 0, 1, MetadataNodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetadataNodeElement_MetadataRef(), this.getMetadataRef(), null, "metadataRef", null, 0, 1, MetadataNodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadataNodeElement_Null(), ecorePackage.getEString(), "null", null, 0, 1, MetadataNodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metadataStringEClass, MetadataString.class, "MetadataString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetadataString_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetadataString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addressSpaceEClass, AddressSpace.class, "AddressSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddressSpace_Value(), ecorePackage.getEString(), "value", null, 0, 1, AddressSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunction_Header(), this.getFunctionHeader(), null, "header", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDefEClass, FunctionDef.class, "FunctionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDef_BasicBlocks(), this.getBasicBlock(), null, "basicBlocks", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDeclEClass, FunctionDecl.class, "FunctionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionHeaderEClass, FunctionHeader.class, "FunctionHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionHeader_Linkage(), ecorePackage.getEString(), "linkage", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionHeader_Visibility(), ecorePackage.getEString(), "visibility", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionHeader_Cconv(), ecorePackage.getEString(), "cconv", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionHeader_Rettype(), this.getParameterType(), null, "rettype", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionHeader_Parameters(), this.getParameters(), null, "parameters", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionHeader_Attrs(), this.getFunctionAttributes(), null, "attrs", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parametersEClass, Parameters.class, "Parameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameters_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameters_Vararg(), ecorePackage.getEString(), "vararg", null, 0, 1, Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionAttributesEClass, FunctionAttributes.class, "FunctionAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionAttributes_Attributes(), ecorePackage.getEString(), "attributes", null, 0, -1, FunctionAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicBlockEClass, BasicBlock.class, "BasicBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicBlock_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metadataSuffixEClass, MetadataSuffix.class, "MetadataSuffix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetadataSuffix_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetadataSuffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetadataSuffix_Value(), this.getMetadataRef(), null, "value", null, 0, 1, MetadataSuffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(startingInstructionEClass, StartingInstruction.class, "StartingInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStartingInstruction_Instruction(), this.getInstruction_phi(), null, "instruction", null, 0, 1, StartingInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(middleInstructionEClass, MiddleInstruction.class, "MiddleInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMiddleInstruction_Instruction(), ecorePackage.getEObject(), null, "instruction", null, 0, 1, MiddleInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedMiddleInstructionEClass, NamedMiddleInstruction.class, "NamedMiddleInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedMiddleInstruction_Instruction(), ecorePackage.getEObject(), null, "instruction", null, 0, 1, NamedMiddleInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(terminatorInstructionEClass, TerminatorInstruction.class, "TerminatorInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTerminatorInstruction_Instruction(), ecorePackage.getEObject(), null, "instruction", null, 0, 1, TerminatorInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedTerminatorInstructionEClass, NamedTerminatorInstruction.class, "NamedTerminatorInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedTerminatorInstruction_Instruction(), this.getInstruction_invoke_nonVoid(), null, "instruction", null, 0, 1, NamedTerminatorInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_retEClass, Instruction_ret.class, "Instruction_ret", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_ret_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_ret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_ret_Val(), this.getTypedValue(), null, "val", null, 0, 1, Instruction_ret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_brEClass, Instruction_br.class, "Instruction_br", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_br_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_br.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_br_Condition(), this.getTypedValue(), null, "condition", null, 0, 1, Instruction_br.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_br_True(), this.getBasicBlockRef(), null, "true", null, 0, 1, Instruction_br.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_br_False(), this.getBasicBlockRef(), null, "false", null, 0, 1, Instruction_br.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_br_Unconditional(), this.getBasicBlockRef(), null, "unconditional", null, 0, 1, Instruction_br.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_switchEClass, Instruction_switch.class, "Instruction_switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_switch_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_switch_ComparisonValue(), this.getTypedValue(), null, "comparisonValue", null, 0, 1, Instruction_switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_switch_DefaultDest(), this.getBasicBlockRef(), null, "defaultDest", null, 0, 1, Instruction_switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_switch_CaseConditions(), this.getTypedValue(), null, "caseConditions", null, 0, -1, Instruction_switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_switch_Destinations(), this.getBasicBlockRef(), null, "destinations", null, 0, -1, Instruction_switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_indirectbrEClass, Instruction_indirectbr.class, "Instruction_indirectbr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_indirectbr_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_indirectbr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_indirectbr_Address(), this.getTypedValue(), null, "address", null, 0, 1, Instruction_indirectbr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_indirectbr_Destinations(), this.getBasicBlockRef(), null, "destinations", null, 0, -1, Instruction_indirectbr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_invoke_voidEClass, Instruction_invoke_void.class, "Instruction_invoke_void", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_invoke_void_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_invoke_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_invoke_void_Cconv(), ecorePackage.getEString(), "cconv", null, 0, 1, Instruction_invoke_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_void_Rettype(), this.getVoidType(), null, "rettype", null, 0, 1, Instruction_invoke_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_void_Callee(), this.getCallee(), null, "callee", null, 0, 1, Instruction_invoke_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_void_Args(), this.getArgList(), null, "args", null, 0, 1, Instruction_invoke_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_void_Attributes(), this.getFunctionAttributes(), null, "attributes", null, 0, 1, Instruction_invoke_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_void_ToLabel(), this.getBasicBlockRef(), null, "toLabel", null, 0, 1, Instruction_invoke_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_void_ExceptionLabel(), this.getBasicBlockRef(), null, "exceptionLabel", null, 0, 1, Instruction_invoke_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_invoke_nonVoidEClass, Instruction_invoke_nonVoid.class, "Instruction_invoke_nonVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_invoke_nonVoid_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_invoke_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_invoke_nonVoid_Cconv(), ecorePackage.getEString(), "cconv", null, 0, 1, Instruction_invoke_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_nonVoid_Rettype(), this.getNonVoidType(), null, "rettype", null, 0, 1, Instruction_invoke_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_nonVoid_Callee(), this.getCallee(), null, "callee", null, 0, 1, Instruction_invoke_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_nonVoid_Args(), this.getArgList(), null, "args", null, 0, 1, Instruction_invoke_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_nonVoid_Attributes(), this.getFunctionAttributes(), null, "attributes", null, 0, 1, Instruction_invoke_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_nonVoid_ToLabel(), this.getBasicBlockRef(), null, "toLabel", null, 0, 1, Instruction_invoke_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_invoke_nonVoid_ExceptionLabel(), this.getBasicBlockRef(), null, "exceptionLabel", null, 0, 1, Instruction_invoke_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_resumeEClass, Instruction_resume.class, "Instruction_resume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_resume_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_resume_Value(), this.getTypedValue(), null, "value", null, 0, 1, Instruction_resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_unreachableEClass, Instruction_unreachable.class, "Instruction_unreachable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_unreachable_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_unreachable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicBlockRefEClass, BasicBlockRef.class, "BasicBlockRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBasicBlockRef_Ref(), this.getBasicBlock(), null, "ref", null, 0, 1, BasicBlockRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryInstructionEClass, BinaryInstruction.class, "BinaryInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinaryInstruction_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, BinaryInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryInstruction_Type(), this.getType(), null, "type", null, 0, 1, BinaryInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryInstruction_Op1(), this.getValueRef(), null, "op1", null, 0, 1, BinaryInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryInstruction_Op2(), this.getValueRef(), null, "op2", null, 0, 1, BinaryInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_addEClass, Instruction_add.class, "Instruction_add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_faddEClass, Instruction_fadd.class, "Instruction_fadd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_subEClass, Instruction_sub.class, "Instruction_sub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_fsubEClass, Instruction_fsub.class, "Instruction_fsub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_mulEClass, Instruction_mul.class, "Instruction_mul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_fmulEClass, Instruction_fmul.class, "Instruction_fmul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_udivEClass, Instruction_udiv.class, "Instruction_udiv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_sdivEClass, Instruction_sdiv.class, "Instruction_sdiv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_fdivEClass, Instruction_fdiv.class, "Instruction_fdiv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_uremEClass, Instruction_urem.class, "Instruction_urem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_sremEClass, Instruction_srem.class, "Instruction_srem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_fremEClass, Instruction_frem.class, "Instruction_frem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bitwiseBinaryInstructionEClass, BitwiseBinaryInstruction.class, "BitwiseBinaryInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBitwiseBinaryInstruction_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, BitwiseBinaryInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBitwiseBinaryInstruction_Type(), this.getType(), null, "type", null, 0, 1, BitwiseBinaryInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBitwiseBinaryInstruction_Op1(), this.getValueRef(), null, "op1", null, 0, 1, BitwiseBinaryInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBitwiseBinaryInstruction_Op2(), this.getValueRef(), null, "op2", null, 0, 1, BitwiseBinaryInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_shlEClass, Instruction_shl.class, "Instruction_shl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_lshrEClass, Instruction_lshr.class, "Instruction_lshr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_ashrEClass, Instruction_ashr.class, "Instruction_ashr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_andEClass, Instruction_and.class, "Instruction_and", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_orEClass, Instruction_or.class, "Instruction_or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_xorEClass, Instruction_xor.class, "Instruction_xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(vectorInstructionsEClass, VectorInstructions.class, "VectorInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVectorInstructions_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, VectorInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_extractelementEClass, Instruction_extractelement.class, "Instruction_extractelement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_extractelement_Vector(), this.getTypedValue(), null, "vector", null, 0, 1, Instruction_extractelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_extractelement_Index(), this.getTypedValue(), null, "index", null, 0, 1, Instruction_extractelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_insertelementEClass, Instruction_insertelement.class, "Instruction_insertelement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_insertelement_Vector(), this.getTypedValue(), null, "vector", null, 0, 1, Instruction_insertelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_insertelement_Element(), this.getTypedValue(), null, "element", null, 0, 1, Instruction_insertelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_insertelement_Index(), this.getTypedValue(), null, "index", null, 0, 1, Instruction_insertelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_shufflevectorEClass, Instruction_shufflevector.class, "Instruction_shufflevector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_shufflevector_Vector1(), this.getTypedValue(), null, "vector1", null, 0, 1, Instruction_shufflevector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_shufflevector_Vector2(), this.getTypedValue(), null, "vector2", null, 0, 1, Instruction_shufflevector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_shufflevector_Mask(), this.getTypedValue(), null, "mask", null, 0, 1, Instruction_shufflevector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aggregateInstructionEClass, AggregateInstruction.class, "AggregateInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAggregateInstruction_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, AggregateInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAggregateInstruction_Aggregate(), this.getTypedValue(), null, "aggregate", null, 0, 1, AggregateInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAggregateInstruction_Indices(), this.getConstant(), null, "indices", null, 0, -1, AggregateInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_extractvalueEClass, Instruction_extractvalue.class, "Instruction_extractvalue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instruction_insertvalueEClass, Instruction_insertvalue.class, "Instruction_insertvalue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_insertvalue_Element(), this.getTypedValue(), null, "element", null, 0, 1, Instruction_insertvalue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memoryInstructionEClass, MemoryInstruction.class, "MemoryInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMemoryInstruction_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, MemoryInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_allocaEClass, Instruction_alloca.class, "Instruction_alloca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_alloca_Type(), this.getType(), null, "type", null, 0, 1, Instruction_alloca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_alloca_NumElements(), this.getTypedValue(), null, "numElements", null, 0, 1, Instruction_alloca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_alloca_Alignment(), ecorePackage.getEString(), "alignment", null, 0, 1, Instruction_alloca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_loadEClass, Instruction_load.class, "Instruction_load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_load_Pointer(), this.getTypedValue(), null, "pointer", null, 0, 1, Instruction_load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_load_Alignment(), ecorePackage.getEString(), "alignment", null, 0, 1, Instruction_load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_load_NontemporalIndex(), this.getMetadataRef(), null, "nontemporalIndex", null, 0, 1, Instruction_load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_load_InvariantLoadIndex(), this.getMetadataRef(), null, "invariantLoadIndex", null, 0, 1, Instruction_load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_load_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Instruction_load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_storeEClass, Instruction_store.class, "Instruction_store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_store_Value(), this.getTypedValue(), null, "value", null, 0, 1, Instruction_store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_store_Pointer(), this.getTypedValue(), null, "pointer", null, 0, 1, Instruction_store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_store_Alignment(), ecorePackage.getEString(), "alignment", null, 0, 1, Instruction_store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_store_NontemporalIndex(), this.getMetadataRef(), null, "nontemporalIndex", null, 0, 1, Instruction_store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_store_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Instruction_store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_fenceEClass, Instruction_fence.class, "Instruction_fence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_fence_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Instruction_fence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_cmpxchgEClass, Instruction_cmpxchg.class, "Instruction_cmpxchg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_cmpxchg_Pointer(), this.getTypedValue(), null, "pointer", null, 0, 1, Instruction_cmpxchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_cmpxchg_ComparedWith(), this.getTypedValue(), null, "comparedWith", null, 0, 1, Instruction_cmpxchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_cmpxchg_NewValue(), this.getTypedValue(), null, "newValue", null, 0, 1, Instruction_cmpxchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_cmpxchg_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Instruction_cmpxchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_atomicrmwEClass, Instruction_atomicrmw.class, "Instruction_atomicrmw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_atomicrmw_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, Instruction_atomicrmw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_atomicrmw_Pointer(), this.getTypedValue(), null, "pointer", null, 0, 1, Instruction_atomicrmw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_atomicrmw_Argument(), this.getTypedValue(), null, "argument", null, 0, 1, Instruction_atomicrmw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_atomicrmw_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Instruction_atomicrmw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_getelementptrEClass, Instruction_getelementptr.class, "Instruction_getelementptr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_getelementptr_Base(), this.getTypedValue(), null, "base", null, 0, 1, Instruction_getelementptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_getelementptr_Indices(), this.getTypedValue(), null, "indices", null, 0, -1, Instruction_getelementptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conversionInstructionEClass, ConversionInstruction.class, "ConversionInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConversionInstruction_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, ConversionInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConversionInstruction_FromType(), this.getType(), null, "fromType", null, 0, 1, ConversionInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConversionInstruction_Value(), this.getValueRef(), null, "value", null, 0, 1, ConversionInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConversionInstruction_TargetType(), this.getType(), null, "targetType", null, 0, 1, ConversionInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(otherInstructionEClass, OtherInstruction.class, "OtherInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOtherInstruction_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, OtherInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_icmpEClass, Instruction_icmp.class, "Instruction_icmp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_icmp_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Instruction_icmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_icmp_Type(), this.getType(), null, "type", null, 0, 1, Instruction_icmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_icmp_Op1(), this.getValueRef(), null, "op1", null, 0, 1, Instruction_icmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_icmp_Op2(), this.getValueRef(), null, "op2", null, 0, 1, Instruction_icmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_fcmpEClass, Instruction_fcmp.class, "Instruction_fcmp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_fcmp_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Instruction_fcmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_fcmp_Type(), this.getType(), null, "type", null, 0, 1, Instruction_fcmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_fcmp_Op1(), this.getValueRef(), null, "op1", null, 0, 1, Instruction_fcmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_fcmp_Op2(), this.getValueRef(), null, "op2", null, 0, 1, Instruction_fcmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_phiEClass, Instruction_phi.class, "Instruction_phi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_phi_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_phi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_phi_Type(), this.getType(), null, "type", null, 0, 1, Instruction_phi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_phi_Values(), this.getValueRef(), null, "values", null, 0, -1, Instruction_phi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_phi_Labels(), this.getBasicBlockRef(), null, "labels", null, 0, -1, Instruction_phi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_selectEClass, Instruction_select.class, "Instruction_select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_select_Condition(), this.getTypedValue(), null, "condition", null, 0, 1, Instruction_select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_select_Value1(), this.getTypedValue(), null, "value1", null, 0, 1, Instruction_select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_select_Value2(), this.getTypedValue(), null, "value2", null, 0, 1, Instruction_select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_call_nonVoidEClass, Instruction_call_nonVoid.class, "Instruction_call_nonVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_call_nonVoid_IsTail(), ecorePackage.getEBoolean(), "isTail", null, 0, 1, Instruction_call_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_call_nonVoid_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_call_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_call_nonVoid_Cconv(), ecorePackage.getEString(), "cconv", null, 0, 1, Instruction_call_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_nonVoid_ReturnAttributes(), this.getParameterAttributes(), null, "returnAttributes", null, 0, 1, Instruction_call_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_nonVoid_ReturnType(), this.getNonVoidType(), null, "returnType", null, 0, 1, Instruction_call_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_nonVoid_FunctionPointerType(), this.getType(), null, "functionPointerType", null, 0, 1, Instruction_call_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_nonVoid_Callee(), this.getCallee(), null, "callee", null, 0, 1, Instruction_call_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_nonVoid_Args(), this.getArgList(), null, "args", null, 0, 1, Instruction_call_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_nonVoid_FunctionAttributes(), this.getFunctionAttributes(), null, "functionAttributes", null, 0, 1, Instruction_call_nonVoid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_call_voidEClass, Instruction_call_void.class, "Instruction_call_void", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstruction_call_void_IsTail(), ecorePackage.getEBoolean(), "isTail", null, 0, 1, Instruction_call_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_call_void_Opcode(), ecorePackage.getEString(), "opcode", null, 0, 1, Instruction_call_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstruction_call_void_Cconv(), ecorePackage.getEString(), "cconv", null, 0, 1, Instruction_call_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_void_ReturnAttributes(), this.getParameterAttributes(), null, "returnAttributes", null, 0, 1, Instruction_call_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_void_ReturnType(), this.getVoidType(), null, "returnType", null, 0, 1, Instruction_call_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_void_FunctionPointerType(), this.getType(), null, "functionPointerType", null, 0, 1, Instruction_call_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_void_Callee(), this.getCallee(), null, "callee", null, 0, 1, Instruction_call_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_void_Args(), this.getArgList(), null, "args", null, 0, 1, Instruction_call_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_call_void_FunctionAttributes(), this.getFunctionAttributes(), null, "functionAttributes", null, 0, 1, Instruction_call_void.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argListEClass, ArgList.class, "ArgList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgList_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, ArgList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(calleeEClass, Callee.class, "Callee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inlineAssemblerEClass, InlineAssembler.class, "InlineAssembler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInlineAssembler_Assembler(), ecorePackage.getEString(), "assembler", null, 0, 1, InlineAssembler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInlineAssembler_Flags(), ecorePackage.getEString(), "flags", null, 0, 1, InlineAssembler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_va_argEClass, Instruction_va_arg.class, "Instruction_va_arg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_va_arg_Arglist(), this.getTypedValue(), null, "arglist", null, 0, 1, Instruction_va_arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_va_arg_Type(), this.getType(), null, "type", null, 0, 1, Instruction_va_arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instruction_landingpadEClass, Instruction_landingpad.class, "Instruction_landingpad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstruction_landingpad_ResultType(), this.getType(), null, "resultType", null, 0, 1, Instruction_landingpad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_landingpad_PersonalityType(), this.getType(), null, "personalityType", null, 0, 1, Instruction_landingpad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_landingpad_PersonalityFunction(), this.getFunctionRef(), null, "personalityFunction", null, 0, 1, Instruction_landingpad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstruction_landingpad_Clauses(), this.getLandingpadClause(), null, "clauses", null, 0, -1, Instruction_landingpad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(landingpadClauseEClass, LandingpadClause.class, "LandingpadClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLandingpadClause_LandingPadType(), ecorePackage.getEString(), "landingPadType", null, 0, 1, LandingpadClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLandingpadClause_CatchType(), this.getTypedValue(), null, "catchType", null, 0, 1, LandingpadClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLandingpadClause_ArrayType(), this.getArrayType(), null, "arrayType", null, 0, 1, LandingpadClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLandingpadClause_ArrayConstant(), this.getArrayConstant(), null, "arrayConstant", null, 0, 1, LandingpadClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedValueEClass, TypedValue.class, "TypedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypedValue_Type(), this.getType(), null, "type", null, 0, 1, TypedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypedValue_Ref(), this.getValueRef(), null, "ref", null, 0, 1, TypedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterType_Type(), this.getType(), null, "type", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterType_Attrs(), this.getParameterAttributes(), null, "attrs", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterAttributesEClass, ParameterAttributes.class, "ParameterAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterAttributes_Attributes(), ecorePackage.getEString(), "attributes", null, 0, -1, ParameterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgument_Type(), this.getParameterType(), null, "type", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgument_Ref(), this.getValueRef(), null, "ref", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), this.getParameterType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nonVoidTypeEClass, NonVoidType.class, "NonVoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNonVoidType_BaseType(), ecorePackage.getEObject(), null, "baseType", null, 0, 1, NonVoidType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNonVoidType_FunctionSuffix(), this.getFunctionTypeOrPointerToFunctionTypeSuffix(), null, "functionSuffix", null, 0, 1, NonVoidType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNonVoidType_Stars(), this.getStar(), null, "stars", null, 0, -1, NonVoidType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(starEClass, Star.class, "Star", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStar_AddressSpace(), this.getAddressSpace(), null, "addressSpace", null, 0, 1, Star.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_BaseType(), this.getNonLeftRecursiveType(), null, "baseType", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Stars(), this.getStar(), null, "stars", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_FunctionSuffix(), this.getFunctionTypeOrPointerToFunctionTypeSuffix(), null, "functionSuffix", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionTypeOrPointerToFunctionTypeSuffixEClass, FunctionTypeOrPointerToFunctionTypeSuffix.class, "FunctionTypeOrPointerToFunctionTypeSuffix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionTypeOrPointerToFunctionTypeSuffix_ContainedTypes(), this.getParameterType(), null, "containedTypes", null, 0, -1, FunctionTypeOrPointerToFunctionTypeSuffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionTypeOrPointerToFunctionTypeSuffix_Vararg(), ecorePackage.getEString(), "vararg", null, 0, 1, FunctionTypeOrPointerToFunctionTypeSuffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionTypeOrPointerToFunctionTypeSuffix_Stars(), this.getStar(), null, "stars", null, 0, -1, FunctionTypeOrPointerToFunctionTypeSuffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nonLeftRecursiveTypeEClass, NonLeftRecursiveType.class, "NonLeftRecursiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNonLeftRecursiveType_Type(), ecorePackage.getEObject(), null, "type", null, 0, 1, NonLeftRecursiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNonLeftRecursiveType_Typedef(), this.getTypeDef(), null, "typedef", null, 0, 1, NonLeftRecursiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nonLeftRecursiveNonVoidTypeEClass, NonLeftRecursiveNonVoidType.class, "NonLeftRecursiveNonVoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNonLeftRecursiveNonVoidType_Type(), ecorePackage.getEObject(), null, "type", null, 0, 1, NonLeftRecursiveNonVoidType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDef_Type(), this.getNonVoidType(), null, "type", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(opaqueTypeEClass, OpaqueType.class, "OpaqueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structTypeEClass, StructType.class, "StructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructType_Types(), this.getType(), null, "types", null, 0, -1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructType_Packed(), ecorePackage.getEString(), "packed", null, 0, 1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vectorTypeEClass, VectorType.class, "VectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVectorType_Size(), ecorePackage.getEString(), "size", null, 0, 1, VectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVectorType_ElemType(), this.getType(), null, "elemType", null, 0, 1, VectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArrayType_Size(), ecorePackage.getEString(), "size", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayType_ElemType(), this.getType(), null, "elemType", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(x86mmxTypeEClass, X86mmxType.class, "X86mmxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(metadataTypeEClass, MetadataType.class, "MetadataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatingTypeEClass, FloatingType.class, "FloatingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //LLVM_IRPackageImpl
