/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage
 * @generated
 */
public interface LLVM_IRFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LLVM_IRFactory eINSTANCE = com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Top Level Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Element</em>'.
   * @generated
   */
  TopLevelElement createTopLevelElement();

  /**
   * Returns a new object of class '<em>Named Metadata</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Metadata</em>'.
   * @generated
   */
  NamedMetadata createNamedMetadata();

  /**
   * Returns a new object of class '<em>Metadata Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadata Ref</em>'.
   * @generated
   */
  MetadataRef createMetadataRef();

  /**
   * Returns a new object of class '<em>Value Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Ref</em>'.
   * @generated
   */
  ValueRef createValueRef();

  /**
   * Returns a new object of class '<em>Global Value Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Value Ref</em>'.
   * @generated
   */
  GlobalValueRef createGlobalValueRef();

  /**
   * Returns a new object of class '<em>Function Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Ref</em>'.
   * @generated
   */
  FunctionRef createFunctionRef();

  /**
   * Returns a new object of class '<em>Local Value Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Value Ref</em>'.
   * @generated
   */
  LocalValueRef createLocalValueRef();

  /**
   * Returns a new object of class '<em>Global Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Value</em>'.
   * @generated
   */
  GlobalValue createGlobalValue();

  /**
   * Returns a new object of class '<em>Global Value Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Value Def</em>'.
   * @generated
   */
  GlobalValueDef createGlobalValueDef();

  /**
   * Returns a new object of class '<em>Local Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Value</em>'.
   * @generated
   */
  LocalValue createLocalValue();

  /**
   * Returns a new object of class '<em>Named Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Instruction</em>'.
   * @generated
   */
  NamedInstruction createNamedInstruction();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alias</em>'.
   * @generated
   */
  Alias createAlias();

  /**
   * Returns a new object of class '<em>Target Info</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target Info</em>'.
   * @generated
   */
  TargetInfo createTargetInfo();

  /**
   * Returns a new object of class '<em>Inline Asm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inline Asm</em>'.
   * @generated
   */
  InlineAsm createInlineAsm();

  /**
   * Returns a new object of class '<em>Global Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Variable</em>'.
   * @generated
   */
  GlobalVariable createGlobalVariable();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Constant Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression</em>'.
   * @generated
   */
  ConstantExpression createConstantExpression();

  /**
   * Returns a new object of class '<em>Constant Expression convert</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression convert</em>'.
   * @generated
   */
  ConstantExpression_convert createConstantExpression_convert();

  /**
   * Returns a new object of class '<em>Constant Expression getelementptr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression getelementptr</em>'.
   * @generated
   */
  ConstantExpression_getelementptr createConstantExpression_getelementptr();

  /**
   * Returns a new object of class '<em>Constant Expression select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression select</em>'.
   * @generated
   */
  ConstantExpression_select createConstantExpression_select();

  /**
   * Returns a new object of class '<em>Constant Expression compare</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression compare</em>'.
   * @generated
   */
  ConstantExpression_compare createConstantExpression_compare();

  /**
   * Returns a new object of class '<em>Constant Expression extractelement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression extractelement</em>'.
   * @generated
   */
  ConstantExpression_extractelement createConstantExpression_extractelement();

  /**
   * Returns a new object of class '<em>Constant Expression insertelement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression insertelement</em>'.
   * @generated
   */
  ConstantExpression_insertelement createConstantExpression_insertelement();

  /**
   * Returns a new object of class '<em>Constant Expression shufflevector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression shufflevector</em>'.
   * @generated
   */
  ConstantExpression_shufflevector createConstantExpression_shufflevector();

  /**
   * Returns a new object of class '<em>Constant Expression extractvalue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression extractvalue</em>'.
   * @generated
   */
  ConstantExpression_extractvalue createConstantExpression_extractvalue();

  /**
   * Returns a new object of class '<em>Constant Expression insertvalue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression insertvalue</em>'.
   * @generated
   */
  ConstantExpression_insertvalue createConstantExpression_insertvalue();

  /**
   * Returns a new object of class '<em>Constant Expression binary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression binary</em>'.
   * @generated
   */
  ConstantExpression_binary createConstantExpression_binary();

  /**
   * Returns a new object of class '<em>Undef</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Undef</em>'.
   * @generated
   */
  Undef createUndef();

  /**
   * Returns a new object of class '<em>Block Address</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Address</em>'.
   * @generated
   */
  BlockAddress createBlockAddress();

  /**
   * Returns a new object of class '<em>Zero Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Zero Initializer</em>'.
   * @generated
   */
  ZeroInitializer createZeroInitializer();

  /**
   * Returns a new object of class '<em>Structure Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Constant</em>'.
   * @generated
   */
  StructureConstant createStructureConstant();

  /**
   * Returns a new object of class '<em>Array Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Constant</em>'.
   * @generated
   */
  ArrayConstant createArrayConstant();

  /**
   * Returns a new object of class '<em>Vector Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vector Constant</em>'.
   * @generated
   */
  VectorConstant createVectorConstant();

  /**
   * Returns a new object of class '<em>Constant List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant List</em>'.
   * @generated
   */
  ConstantList createConstantList();

  /**
   * Returns a new object of class '<em>Typed Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Constant</em>'.
   * @generated
   */
  TypedConstant createTypedConstant();

  /**
   * Returns a new object of class '<em>Simple Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Constant</em>'.
   * @generated
   */
  SimpleConstant createSimpleConstant();

  /**
   * Returns a new object of class '<em>Metadata Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadata Node</em>'.
   * @generated
   */
  MetadataNode createMetadataNode();

  /**
   * Returns a new object of class '<em>Metadata Node Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadata Node Element</em>'.
   * @generated
   */
  MetadataNodeElement createMetadataNodeElement();

  /**
   * Returns a new object of class '<em>Metadata String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadata String</em>'.
   * @generated
   */
  MetadataString createMetadataString();

  /**
   * Returns a new object of class '<em>Address Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Address Space</em>'.
   * @generated
   */
  AddressSpace createAddressSpace();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Function Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Def</em>'.
   * @generated
   */
  FunctionDef createFunctionDef();

  /**
   * Returns a new object of class '<em>Function Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Decl</em>'.
   * @generated
   */
  FunctionDecl createFunctionDecl();

  /**
   * Returns a new object of class '<em>Function Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Header</em>'.
   * @generated
   */
  FunctionHeader createFunctionHeader();

  /**
   * Returns a new object of class '<em>Function Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Body</em>'.
   * @generated
   */
  FunctionBody createFunctionBody();

  /**
   * Returns a new object of class '<em>Function Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Attributes</em>'.
   * @generated
   */
  FunctionAttributes createFunctionAttributes();

  /**
   * Returns a new object of class '<em>Basic Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Block</em>'.
   * @generated
   */
  BasicBlock createBasicBlock();

  /**
   * Returns a new object of class '<em>Metadata Suffix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadata Suffix</em>'.
   * @generated
   */
  MetadataSuffix createMetadataSuffix();

  /**
   * Returns a new object of class '<em>Starting Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Starting Instruction</em>'.
   * @generated
   */
  StartingInstruction createStartingInstruction();

  /**
   * Returns a new object of class '<em>Middle Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Middle Instruction</em>'.
   * @generated
   */
  MiddleInstruction createMiddleInstruction();

  /**
   * Returns a new object of class '<em>Named Middle Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Middle Instruction</em>'.
   * @generated
   */
  NamedMiddleInstruction createNamedMiddleInstruction();

  /**
   * Returns a new object of class '<em>Terminator Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terminator Instruction</em>'.
   * @generated
   */
  TerminatorInstruction createTerminatorInstruction();

  /**
   * Returns a new object of class '<em>Named Terminator Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Terminator Instruction</em>'.
   * @generated
   */
  NamedTerminatorInstruction createNamedTerminatorInstruction();

  /**
   * Returns a new object of class '<em>Instruction ret</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction ret</em>'.
   * @generated
   */
  Instruction_ret createInstruction_ret();

  /**
   * Returns a new object of class '<em>Instruction br</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction br</em>'.
   * @generated
   */
  Instruction_br createInstruction_br();

  /**
   * Returns a new object of class '<em>Instruction switch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction switch</em>'.
   * @generated
   */
  Instruction_switch createInstruction_switch();

  /**
   * Returns a new object of class '<em>Instruction indirectbr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction indirectbr</em>'.
   * @generated
   */
  Instruction_indirectbr createInstruction_indirectbr();

  /**
   * Returns a new object of class '<em>Instruction invoke void</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction invoke void</em>'.
   * @generated
   */
  Instruction_invoke_void createInstruction_invoke_void();

  /**
   * Returns a new object of class '<em>Instruction invoke non Void</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction invoke non Void</em>'.
   * @generated
   */
  Instruction_invoke_nonVoid createInstruction_invoke_nonVoid();

  /**
   * Returns a new object of class '<em>Instruction resume</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction resume</em>'.
   * @generated
   */
  Instruction_resume createInstruction_resume();

  /**
   * Returns a new object of class '<em>Instruction unreachable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction unreachable</em>'.
   * @generated
   */
  Instruction_unreachable createInstruction_unreachable();

  /**
   * Returns a new object of class '<em>Basic Block Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Block Ref</em>'.
   * @generated
   */
  BasicBlockRef createBasicBlockRef();

  /**
   * Returns a new object of class '<em>Binary Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Instruction</em>'.
   * @generated
   */
  BinaryInstruction createBinaryInstruction();

  /**
   * Returns a new object of class '<em>Instruction add</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction add</em>'.
   * @generated
   */
  Instruction_add createInstruction_add();

  /**
   * Returns a new object of class '<em>Instruction fadd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction fadd</em>'.
   * @generated
   */
  Instruction_fadd createInstruction_fadd();

  /**
   * Returns a new object of class '<em>Instruction sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction sub</em>'.
   * @generated
   */
  Instruction_sub createInstruction_sub();

  /**
   * Returns a new object of class '<em>Instruction fsub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction fsub</em>'.
   * @generated
   */
  Instruction_fsub createInstruction_fsub();

  /**
   * Returns a new object of class '<em>Instruction mul</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction mul</em>'.
   * @generated
   */
  Instruction_mul createInstruction_mul();

  /**
   * Returns a new object of class '<em>Instruction fmul</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction fmul</em>'.
   * @generated
   */
  Instruction_fmul createInstruction_fmul();

  /**
   * Returns a new object of class '<em>Instruction udiv</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction udiv</em>'.
   * @generated
   */
  Instruction_udiv createInstruction_udiv();

  /**
   * Returns a new object of class '<em>Instruction sdiv</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction sdiv</em>'.
   * @generated
   */
  Instruction_sdiv createInstruction_sdiv();

  /**
   * Returns a new object of class '<em>Instruction fdiv</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction fdiv</em>'.
   * @generated
   */
  Instruction_fdiv createInstruction_fdiv();

  /**
   * Returns a new object of class '<em>Instruction urem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction urem</em>'.
   * @generated
   */
  Instruction_urem createInstruction_urem();

  /**
   * Returns a new object of class '<em>Instruction srem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction srem</em>'.
   * @generated
   */
  Instruction_srem createInstruction_srem();

  /**
   * Returns a new object of class '<em>Instruction frem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction frem</em>'.
   * @generated
   */
  Instruction_frem createInstruction_frem();

  /**
   * Returns a new object of class '<em>Bitwise Binary Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bitwise Binary Instruction</em>'.
   * @generated
   */
  BitwiseBinaryInstruction createBitwiseBinaryInstruction();

  /**
   * Returns a new object of class '<em>Instruction shl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction shl</em>'.
   * @generated
   */
  Instruction_shl createInstruction_shl();

  /**
   * Returns a new object of class '<em>Instruction lshr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction lshr</em>'.
   * @generated
   */
  Instruction_lshr createInstruction_lshr();

  /**
   * Returns a new object of class '<em>Instruction ashr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction ashr</em>'.
   * @generated
   */
  Instruction_ashr createInstruction_ashr();

  /**
   * Returns a new object of class '<em>Instruction and</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction and</em>'.
   * @generated
   */
  Instruction_and createInstruction_and();

  /**
   * Returns a new object of class '<em>Instruction or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction or</em>'.
   * @generated
   */
  Instruction_or createInstruction_or();

  /**
   * Returns a new object of class '<em>Instruction xor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction xor</em>'.
   * @generated
   */
  Instruction_xor createInstruction_xor();

  /**
   * Returns a new object of class '<em>Vector Instructions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vector Instructions</em>'.
   * @generated
   */
  VectorInstructions createVectorInstructions();

  /**
   * Returns a new object of class '<em>Instruction extractelement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction extractelement</em>'.
   * @generated
   */
  Instruction_extractelement createInstruction_extractelement();

  /**
   * Returns a new object of class '<em>Instruction insertelement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction insertelement</em>'.
   * @generated
   */
  Instruction_insertelement createInstruction_insertelement();

  /**
   * Returns a new object of class '<em>Instruction shufflevector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction shufflevector</em>'.
   * @generated
   */
  Instruction_shufflevector createInstruction_shufflevector();

  /**
   * Returns a new object of class '<em>Aggregate Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aggregate Instruction</em>'.
   * @generated
   */
  AggregateInstruction createAggregateInstruction();

  /**
   * Returns a new object of class '<em>Instruction extractvalue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction extractvalue</em>'.
   * @generated
   */
  Instruction_extractvalue createInstruction_extractvalue();

  /**
   * Returns a new object of class '<em>Instruction insertvalue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction insertvalue</em>'.
   * @generated
   */
  Instruction_insertvalue createInstruction_insertvalue();

  /**
   * Returns a new object of class '<em>Memory Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Memory Instruction</em>'.
   * @generated
   */
  MemoryInstruction createMemoryInstruction();

  /**
   * Returns a new object of class '<em>Instruction alloca</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction alloca</em>'.
   * @generated
   */
  Instruction_alloca createInstruction_alloca();

  /**
   * Returns a new object of class '<em>Instruction load</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction load</em>'.
   * @generated
   */
  Instruction_load createInstruction_load();

  /**
   * Returns a new object of class '<em>Instruction store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction store</em>'.
   * @generated
   */
  Instruction_store createInstruction_store();

  /**
   * Returns a new object of class '<em>Instruction fence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction fence</em>'.
   * @generated
   */
  Instruction_fence createInstruction_fence();

  /**
   * Returns a new object of class '<em>Instruction cmpxchg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction cmpxchg</em>'.
   * @generated
   */
  Instruction_cmpxchg createInstruction_cmpxchg();

  /**
   * Returns a new object of class '<em>Instruction atomicrmw</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction atomicrmw</em>'.
   * @generated
   */
  Instruction_atomicrmw createInstruction_atomicrmw();

  /**
   * Returns a new object of class '<em>Instruction getelementptr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction getelementptr</em>'.
   * @generated
   */
  Instruction_getelementptr createInstruction_getelementptr();

  /**
   * Returns a new object of class '<em>Conversion Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conversion Instruction</em>'.
   * @generated
   */
  ConversionInstruction createConversionInstruction();

  /**
   * Returns a new object of class '<em>Other Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Instruction</em>'.
   * @generated
   */
  OtherInstruction createOtherInstruction();

  /**
   * Returns a new object of class '<em>Instruction icmp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction icmp</em>'.
   * @generated
   */
  Instruction_icmp createInstruction_icmp();

  /**
   * Returns a new object of class '<em>Instruction fcmp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction fcmp</em>'.
   * @generated
   */
  Instruction_fcmp createInstruction_fcmp();

  /**
   * Returns a new object of class '<em>Instruction phi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction phi</em>'.
   * @generated
   */
  Instruction_phi createInstruction_phi();

  /**
   * Returns a new object of class '<em>Instruction select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction select</em>'.
   * @generated
   */
  Instruction_select createInstruction_select();

  /**
   * Returns a new object of class '<em>Instruction call non Void</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction call non Void</em>'.
   * @generated
   */
  Instruction_call_nonVoid createInstruction_call_nonVoid();

  /**
   * Returns a new object of class '<em>Instruction call void</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction call void</em>'.
   * @generated
   */
  Instruction_call_void createInstruction_call_void();

  /**
   * Returns a new object of class '<em>Arg List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arg List</em>'.
   * @generated
   */
  ArgList createArgList();

  /**
   * Returns a new object of class '<em>Callee</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callee</em>'.
   * @generated
   */
  Callee createCallee();

  /**
   * Returns a new object of class '<em>Inline Assembler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inline Assembler</em>'.
   * @generated
   */
  InlineAssembler createInlineAssembler();

  /**
   * Returns a new object of class '<em>Instruction va arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction va arg</em>'.
   * @generated
   */
  Instruction_va_arg createInstruction_va_arg();

  /**
   * Returns a new object of class '<em>Instruction landingpad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction landingpad</em>'.
   * @generated
   */
  Instruction_landingpad createInstruction_landingpad();

  /**
   * Returns a new object of class '<em>Landingpad Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Landingpad Clause</em>'.
   * @generated
   */
  LandingpadClause createLandingpadClause();

  /**
   * Returns a new object of class '<em>Typed Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Value</em>'.
   * @generated
   */
  TypedValue createTypedValue();

  /**
   * Returns a new object of class '<em>Parameter Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Type</em>'.
   * @generated
   */
  ParameterType createParameterType();

  /**
   * Returns a new object of class '<em>Parameter Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Attributes</em>'.
   * @generated
   */
  ParameterAttributes createParameterAttributes();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Non Void Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Void Type</em>'.
   * @generated
   */
  NonVoidType createNonVoidType();

  /**
   * Returns a new object of class '<em>Star</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Star</em>'.
   * @generated
   */
  Star createStar();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Function Type Or Pointer To Function Type Suffix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Type Or Pointer To Function Type Suffix</em>'.
   * @generated
   */
  FunctionTypeOrPointerToFunctionTypeSuffix createFunctionTypeOrPointerToFunctionTypeSuffix();

  /**
   * Returns a new object of class '<em>Non Left Recursive Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Left Recursive Type</em>'.
   * @generated
   */
  NonLeftRecursiveType createNonLeftRecursiveType();

  /**
   * Returns a new object of class '<em>Non Left Recursive Non Void Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Left Recursive Non Void Type</em>'.
   * @generated
   */
  NonLeftRecursiveNonVoidType createNonLeftRecursiveNonVoidType();

  /**
   * Returns a new object of class '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Def</em>'.
   * @generated
   */
  TypeDef createTypeDef();

  /**
   * Returns a new object of class '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Type</em>'.
   * @generated
   */
  IntType createIntType();

  /**
   * Returns a new object of class '<em>Opaque Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Opaque Type</em>'.
   * @generated
   */
  OpaqueType createOpaqueType();

  /**
   * Returns a new object of class '<em>Struct Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Type</em>'.
   * @generated
   */
  StructType createStructType();

  /**
   * Returns a new object of class '<em>Vector Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vector Type</em>'.
   * @generated
   */
  VectorType createVectorType();

  /**
   * Returns a new object of class '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type</em>'.
   * @generated
   */
  ArrayType createArrayType();

  /**
   * Returns a new object of class '<em>X8 6mmx Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>X8 6mmx Type</em>'.
   * @generated
   */
  X86mmxType createX86mmxType();

  /**
   * Returns a new object of class '<em>Void Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Void Type</em>'.
   * @generated
   */
  VoidType createVoidType();

  /**
   * Returns a new object of class '<em>Metadata Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metadata Type</em>'.
   * @generated
   */
  MetadataType createMetadataType();

  /**
   * Returns a new object of class '<em>Floating Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Floating Type</em>'.
   * @generated
   */
  FloatingType createFloatingType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LLVM_IRPackage getLLVM_IRPackage();

} //LLVM_IRFactory
