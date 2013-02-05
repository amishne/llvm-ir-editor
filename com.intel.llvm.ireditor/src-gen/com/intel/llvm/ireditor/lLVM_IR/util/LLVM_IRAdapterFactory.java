/**
 */
package com.intel.llvm.ireditor.lLVM_IR.util;

import com.intel.llvm.ireditor.lLVM_IR.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage
 * @generated
 */
public class LLVM_IRAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LLVM_IRPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVM_IRAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LLVM_IRPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LLVM_IRSwitch<Adapter> modelSwitch =
    new LLVM_IRSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseTopLevelElement(TopLevelElement object)
      {
        return createTopLevelElementAdapter();
      }
      @Override
      public Adapter caseNamedMetadata(NamedMetadata object)
      {
        return createNamedMetadataAdapter();
      }
      @Override
      public Adapter caseMetadataRef(MetadataRef object)
      {
        return createMetadataRefAdapter();
      }
      @Override
      public Adapter caseValueRef(ValueRef object)
      {
        return createValueRefAdapter();
      }
      @Override
      public Adapter caseGlobalValueRef(GlobalValueRef object)
      {
        return createGlobalValueRefAdapter();
      }
      @Override
      public Adapter caseFunctionRef(FunctionRef object)
      {
        return createFunctionRefAdapter();
      }
      @Override
      public Adapter caseLocalValueRef(LocalValueRef object)
      {
        return createLocalValueRefAdapter();
      }
      @Override
      public Adapter caseGlobalValue(GlobalValue object)
      {
        return createGlobalValueAdapter();
      }
      @Override
      public Adapter caseGlobalValueDef(GlobalValueDef object)
      {
        return createGlobalValueDefAdapter();
      }
      @Override
      public Adapter caseLocalValue(LocalValue object)
      {
        return createLocalValueAdapter();
      }
      @Override
      public Adapter caseNamedInstruction(NamedInstruction object)
      {
        return createNamedInstructionAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseAlias(Alias object)
      {
        return createAliasAdapter();
      }
      @Override
      public Adapter caseAliasee(Aliasee object)
      {
        return createAliaseeAdapter();
      }
      @Override
      public Adapter caseTargetInfo(TargetInfo object)
      {
        return createTargetInfoAdapter();
      }
      @Override
      public Adapter caseInlineAsm(InlineAsm object)
      {
        return createInlineAsmAdapter();
      }
      @Override
      public Adapter caseGlobalVariable(GlobalVariable object)
      {
        return createGlobalVariableAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseConstantExpression(ConstantExpression object)
      {
        return createConstantExpressionAdapter();
      }
      @Override
      public Adapter caseConstantExpression_convert(ConstantExpression_convert object)
      {
        return createConstantExpression_convertAdapter();
      }
      @Override
      public Adapter caseConstantExpression_getelementptr(ConstantExpression_getelementptr object)
      {
        return createConstantExpression_getelementptrAdapter();
      }
      @Override
      public Adapter caseConstantExpression_select(ConstantExpression_select object)
      {
        return createConstantExpression_selectAdapter();
      }
      @Override
      public Adapter caseConstantExpression_compare(ConstantExpression_compare object)
      {
        return createConstantExpression_compareAdapter();
      }
      @Override
      public Adapter caseConstantExpression_extractelement(ConstantExpression_extractelement object)
      {
        return createConstantExpression_extractelementAdapter();
      }
      @Override
      public Adapter caseConstantExpression_insertelement(ConstantExpression_insertelement object)
      {
        return createConstantExpression_insertelementAdapter();
      }
      @Override
      public Adapter caseConstantExpression_shufflevector(ConstantExpression_shufflevector object)
      {
        return createConstantExpression_shufflevectorAdapter();
      }
      @Override
      public Adapter caseConstantExpression_extractvalue(ConstantExpression_extractvalue object)
      {
        return createConstantExpression_extractvalueAdapter();
      }
      @Override
      public Adapter caseConstantExpression_insertvalue(ConstantExpression_insertvalue object)
      {
        return createConstantExpression_insertvalueAdapter();
      }
      @Override
      public Adapter caseConstantExpression_binary(ConstantExpression_binary object)
      {
        return createConstantExpression_binaryAdapter();
      }
      @Override
      public Adapter caseUndef(Undef object)
      {
        return createUndefAdapter();
      }
      @Override
      public Adapter caseBlockAddress(BlockAddress object)
      {
        return createBlockAddressAdapter();
      }
      @Override
      public Adapter caseZeroInitializer(ZeroInitializer object)
      {
        return createZeroInitializerAdapter();
      }
      @Override
      public Adapter caseStructureConstant(StructureConstant object)
      {
        return createStructureConstantAdapter();
      }
      @Override
      public Adapter caseArrayConstant(ArrayConstant object)
      {
        return createArrayConstantAdapter();
      }
      @Override
      public Adapter caseVectorConstant(VectorConstant object)
      {
        return createVectorConstantAdapter();
      }
      @Override
      public Adapter caseConstantList(ConstantList object)
      {
        return createConstantListAdapter();
      }
      @Override
      public Adapter caseTypedConstant(TypedConstant object)
      {
        return createTypedConstantAdapter();
      }
      @Override
      public Adapter caseSimpleConstant(SimpleConstant object)
      {
        return createSimpleConstantAdapter();
      }
      @Override
      public Adapter caseMetadataNode(MetadataNode object)
      {
        return createMetadataNodeAdapter();
      }
      @Override
      public Adapter caseMetadataNodeElement(MetadataNodeElement object)
      {
        return createMetadataNodeElementAdapter();
      }
      @Override
      public Adapter caseMetadataString(MetadataString object)
      {
        return createMetadataStringAdapter();
      }
      @Override
      public Adapter caseAddressSpace(AddressSpace object)
      {
        return createAddressSpaceAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseFunctionDef(FunctionDef object)
      {
        return createFunctionDefAdapter();
      }
      @Override
      public Adapter caseFunctionDecl(FunctionDecl object)
      {
        return createFunctionDeclAdapter();
      }
      @Override
      public Adapter caseFunctionHeader(FunctionHeader object)
      {
        return createFunctionHeaderAdapter();
      }
      @Override
      public Adapter caseParameters(Parameters object)
      {
        return createParametersAdapter();
      }
      @Override
      public Adapter caseFunctionAttributes(FunctionAttributes object)
      {
        return createFunctionAttributesAdapter();
      }
      @Override
      public Adapter caseBasicBlock(BasicBlock object)
      {
        return createBasicBlockAdapter();
      }
      @Override
      public Adapter caseMetadataSuffix(MetadataSuffix object)
      {
        return createMetadataSuffixAdapter();
      }
      @Override
      public Adapter caseStartingInstruction(StartingInstruction object)
      {
        return createStartingInstructionAdapter();
      }
      @Override
      public Adapter caseMiddleInstruction(MiddleInstruction object)
      {
        return createMiddleInstructionAdapter();
      }
      @Override
      public Adapter caseNamedMiddleInstruction(NamedMiddleInstruction object)
      {
        return createNamedMiddleInstructionAdapter();
      }
      @Override
      public Adapter caseTerminatorInstruction(TerminatorInstruction object)
      {
        return createTerminatorInstructionAdapter();
      }
      @Override
      public Adapter caseNamedTerminatorInstruction(NamedTerminatorInstruction object)
      {
        return createNamedTerminatorInstructionAdapter();
      }
      @Override
      public Adapter caseInstruction_ret(Instruction_ret object)
      {
        return createInstruction_retAdapter();
      }
      @Override
      public Adapter caseInstruction_br(Instruction_br object)
      {
        return createInstruction_brAdapter();
      }
      @Override
      public Adapter caseInstruction_switch(Instruction_switch object)
      {
        return createInstruction_switchAdapter();
      }
      @Override
      public Adapter caseInstruction_indirectbr(Instruction_indirectbr object)
      {
        return createInstruction_indirectbrAdapter();
      }
      @Override
      public Adapter caseInstruction_invoke_void(Instruction_invoke_void object)
      {
        return createInstruction_invoke_voidAdapter();
      }
      @Override
      public Adapter caseInstruction_invoke_nonVoid(Instruction_invoke_nonVoid object)
      {
        return createInstruction_invoke_nonVoidAdapter();
      }
      @Override
      public Adapter caseInstruction_resume(Instruction_resume object)
      {
        return createInstruction_resumeAdapter();
      }
      @Override
      public Adapter caseInstruction_unreachable(Instruction_unreachable object)
      {
        return createInstruction_unreachableAdapter();
      }
      @Override
      public Adapter caseBasicBlockRef(BasicBlockRef object)
      {
        return createBasicBlockRefAdapter();
      }
      @Override
      public Adapter caseBinaryInstruction(BinaryInstruction object)
      {
        return createBinaryInstructionAdapter();
      }
      @Override
      public Adapter caseInstruction_add(Instruction_add object)
      {
        return createInstruction_addAdapter();
      }
      @Override
      public Adapter caseInstruction_fadd(Instruction_fadd object)
      {
        return createInstruction_faddAdapter();
      }
      @Override
      public Adapter caseInstruction_sub(Instruction_sub object)
      {
        return createInstruction_subAdapter();
      }
      @Override
      public Adapter caseInstruction_fsub(Instruction_fsub object)
      {
        return createInstruction_fsubAdapter();
      }
      @Override
      public Adapter caseInstruction_mul(Instruction_mul object)
      {
        return createInstruction_mulAdapter();
      }
      @Override
      public Adapter caseInstruction_fmul(Instruction_fmul object)
      {
        return createInstruction_fmulAdapter();
      }
      @Override
      public Adapter caseInstruction_udiv(Instruction_udiv object)
      {
        return createInstruction_udivAdapter();
      }
      @Override
      public Adapter caseInstruction_sdiv(Instruction_sdiv object)
      {
        return createInstruction_sdivAdapter();
      }
      @Override
      public Adapter caseInstruction_fdiv(Instruction_fdiv object)
      {
        return createInstruction_fdivAdapter();
      }
      @Override
      public Adapter caseInstruction_urem(Instruction_urem object)
      {
        return createInstruction_uremAdapter();
      }
      @Override
      public Adapter caseInstruction_srem(Instruction_srem object)
      {
        return createInstruction_sremAdapter();
      }
      @Override
      public Adapter caseInstruction_frem(Instruction_frem object)
      {
        return createInstruction_fremAdapter();
      }
      @Override
      public Adapter caseBitwiseBinaryInstruction(BitwiseBinaryInstruction object)
      {
        return createBitwiseBinaryInstructionAdapter();
      }
      @Override
      public Adapter caseInstruction_shl(Instruction_shl object)
      {
        return createInstruction_shlAdapter();
      }
      @Override
      public Adapter caseInstruction_lshr(Instruction_lshr object)
      {
        return createInstruction_lshrAdapter();
      }
      @Override
      public Adapter caseInstruction_ashr(Instruction_ashr object)
      {
        return createInstruction_ashrAdapter();
      }
      @Override
      public Adapter caseInstruction_and(Instruction_and object)
      {
        return createInstruction_andAdapter();
      }
      @Override
      public Adapter caseInstruction_or(Instruction_or object)
      {
        return createInstruction_orAdapter();
      }
      @Override
      public Adapter caseInstruction_xor(Instruction_xor object)
      {
        return createInstruction_xorAdapter();
      }
      @Override
      public Adapter caseVectorInstructions(VectorInstructions object)
      {
        return createVectorInstructionsAdapter();
      }
      @Override
      public Adapter caseInstruction_extractelement(Instruction_extractelement object)
      {
        return createInstruction_extractelementAdapter();
      }
      @Override
      public Adapter caseInstruction_insertelement(Instruction_insertelement object)
      {
        return createInstruction_insertelementAdapter();
      }
      @Override
      public Adapter caseInstruction_shufflevector(Instruction_shufflevector object)
      {
        return createInstruction_shufflevectorAdapter();
      }
      @Override
      public Adapter caseAggregateInstruction(AggregateInstruction object)
      {
        return createAggregateInstructionAdapter();
      }
      @Override
      public Adapter caseInstruction_extractvalue(Instruction_extractvalue object)
      {
        return createInstruction_extractvalueAdapter();
      }
      @Override
      public Adapter caseInstruction_insertvalue(Instruction_insertvalue object)
      {
        return createInstruction_insertvalueAdapter();
      }
      @Override
      public Adapter caseMemoryInstruction(MemoryInstruction object)
      {
        return createMemoryInstructionAdapter();
      }
      @Override
      public Adapter caseInstruction_alloca(Instruction_alloca object)
      {
        return createInstruction_allocaAdapter();
      }
      @Override
      public Adapter caseInstruction_load(Instruction_load object)
      {
        return createInstruction_loadAdapter();
      }
      @Override
      public Adapter caseInstruction_store(Instruction_store object)
      {
        return createInstruction_storeAdapter();
      }
      @Override
      public Adapter caseInstruction_fence(Instruction_fence object)
      {
        return createInstruction_fenceAdapter();
      }
      @Override
      public Adapter caseInstruction_cmpxchg(Instruction_cmpxchg object)
      {
        return createInstruction_cmpxchgAdapter();
      }
      @Override
      public Adapter caseInstruction_atomicrmw(Instruction_atomicrmw object)
      {
        return createInstruction_atomicrmwAdapter();
      }
      @Override
      public Adapter caseInstruction_getelementptr(Instruction_getelementptr object)
      {
        return createInstruction_getelementptrAdapter();
      }
      @Override
      public Adapter caseConversionInstruction(ConversionInstruction object)
      {
        return createConversionInstructionAdapter();
      }
      @Override
      public Adapter caseOtherInstruction(OtherInstruction object)
      {
        return createOtherInstructionAdapter();
      }
      @Override
      public Adapter caseInstruction_icmp(Instruction_icmp object)
      {
        return createInstruction_icmpAdapter();
      }
      @Override
      public Adapter caseInstruction_fcmp(Instruction_fcmp object)
      {
        return createInstruction_fcmpAdapter();
      }
      @Override
      public Adapter caseInstruction_phi(Instruction_phi object)
      {
        return createInstruction_phiAdapter();
      }
      @Override
      public Adapter caseInstruction_select(Instruction_select object)
      {
        return createInstruction_selectAdapter();
      }
      @Override
      public Adapter caseInstruction_call_nonVoid(Instruction_call_nonVoid object)
      {
        return createInstruction_call_nonVoidAdapter();
      }
      @Override
      public Adapter caseInstruction_call_void(Instruction_call_void object)
      {
        return createInstruction_call_voidAdapter();
      }
      @Override
      public Adapter caseArgList(ArgList object)
      {
        return createArgListAdapter();
      }
      @Override
      public Adapter caseCallee(Callee object)
      {
        return createCalleeAdapter();
      }
      @Override
      public Adapter caseInlineAssembler(InlineAssembler object)
      {
        return createInlineAssemblerAdapter();
      }
      @Override
      public Adapter caseInstruction_va_arg(Instruction_va_arg object)
      {
        return createInstruction_va_argAdapter();
      }
      @Override
      public Adapter caseInstruction_landingpad(Instruction_landingpad object)
      {
        return createInstruction_landingpadAdapter();
      }
      @Override
      public Adapter caseLandingpadClause(LandingpadClause object)
      {
        return createLandingpadClauseAdapter();
      }
      @Override
      public Adapter caseTypedValue(TypedValue object)
      {
        return createTypedValueAdapter();
      }
      @Override
      public Adapter caseParameterType(ParameterType object)
      {
        return createParameterTypeAdapter();
      }
      @Override
      public Adapter caseParameterAttributes(ParameterAttributes object)
      {
        return createParameterAttributesAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseNonVoidType(NonVoidType object)
      {
        return createNonVoidTypeAdapter();
      }
      @Override
      public Adapter caseStar(Star object)
      {
        return createStarAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseFunctionTypeOrPointerToFunctionTypeSuffix(FunctionTypeOrPointerToFunctionTypeSuffix object)
      {
        return createFunctionTypeOrPointerToFunctionTypeSuffixAdapter();
      }
      @Override
      public Adapter caseNonLeftRecursiveType(NonLeftRecursiveType object)
      {
        return createNonLeftRecursiveTypeAdapter();
      }
      @Override
      public Adapter caseNonLeftRecursiveNonVoidType(NonLeftRecursiveNonVoidType object)
      {
        return createNonLeftRecursiveNonVoidTypeAdapter();
      }
      @Override
      public Adapter caseTypeDef(TypeDef object)
      {
        return createTypeDefAdapter();
      }
      @Override
      public Adapter caseIntType(IntType object)
      {
        return createIntTypeAdapter();
      }
      @Override
      public Adapter caseOpaqueType(OpaqueType object)
      {
        return createOpaqueTypeAdapter();
      }
      @Override
      public Adapter caseStructType(StructType object)
      {
        return createStructTypeAdapter();
      }
      @Override
      public Adapter caseVectorType(VectorType object)
      {
        return createVectorTypeAdapter();
      }
      @Override
      public Adapter caseArrayType(ArrayType object)
      {
        return createArrayTypeAdapter();
      }
      @Override
      public Adapter caseX86mmxType(X86mmxType object)
      {
        return createX86mmxTypeAdapter();
      }
      @Override
      public Adapter caseVoidType(VoidType object)
      {
        return createVoidTypeAdapter();
      }
      @Override
      public Adapter caseMetadataType(MetadataType object)
      {
        return createMetadataTypeAdapter();
      }
      @Override
      public Adapter caseFloatingType(FloatingType object)
      {
        return createFloatingTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.TopLevelElement <em>Top Level Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.TopLevelElement
   * @generated
   */
  public Adapter createTopLevelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.NamedMetadata <em>Named Metadata</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedMetadata
   * @generated
   */
  public Adapter createNamedMetadataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataRef <em>Metadata Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataRef
   * @generated
   */
  public Adapter createMetadataRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ValueRef <em>Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ValueRef
   * @generated
   */
  public Adapter createValueRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef <em>Global Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef
   * @generated
   */
  public Adapter createGlobalValueRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionRef <em>Function Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionRef
   * @generated
   */
  public Adapter createFunctionRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.LocalValueRef <em>Local Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.LocalValueRef
   * @generated
   */
  public Adapter createLocalValueRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValue <em>Global Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalValue
   * @generated
   */
  public Adapter createGlobalValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueDef <em>Global Value Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalValueDef
   * @generated
   */
  public Adapter createGlobalValueDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.LocalValue <em>Local Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.LocalValue
   * @generated
   */
  public Adapter createLocalValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.NamedInstruction <em>Named Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedInstruction
   * @generated
   */
  public Adapter createNamedInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Alias
   * @generated
   */
  public Adapter createAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Aliasee <em>Aliasee</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Aliasee
   * @generated
   */
  public Adapter createAliaseeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.TargetInfo <em>Target Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.TargetInfo
   * @generated
   */
  public Adapter createTargetInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAsm <em>Inline Asm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.InlineAsm
   * @generated
   */
  public Adapter createInlineAsmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable <em>Global Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable
   * @generated
   */
  public Adapter createGlobalVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression <em>Constant Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression
   * @generated
   */
  public Adapter createConstantExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert <em>Constant Expression convert</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert
   * @generated
   */
  public Adapter createConstantExpression_convertAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr <em>Constant Expression getelementptr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr
   * @generated
   */
  public Adapter createConstantExpression_getelementptrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select <em>Constant Expression select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select
   * @generated
   */
  public Adapter createConstantExpression_selectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare <em>Constant Expression compare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare
   * @generated
   */
  public Adapter createConstantExpression_compareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement <em>Constant Expression extractelement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement
   * @generated
   */
  public Adapter createConstantExpression_extractelementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement <em>Constant Expression insertelement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement
   * @generated
   */
  public Adapter createConstantExpression_insertelementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector <em>Constant Expression shufflevector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector
   * @generated
   */
  public Adapter createConstantExpression_shufflevectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue <em>Constant Expression extractvalue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue
   * @generated
   */
  public Adapter createConstantExpression_extractvalueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue <em>Constant Expression insertvalue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue
   * @generated
   */
  public Adapter createConstantExpression_insertvalueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary <em>Constant Expression binary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary
   * @generated
   */
  public Adapter createConstantExpression_binaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Undef <em>Undef</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Undef
   * @generated
   */
  public Adapter createUndefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.BlockAddress <em>Block Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.BlockAddress
   * @generated
   */
  public Adapter createBlockAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ZeroInitializer <em>Zero Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ZeroInitializer
   * @generated
   */
  public Adapter createZeroInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.StructureConstant <em>Structure Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.StructureConstant
   * @generated
   */
  public Adapter createStructureConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ArrayConstant <em>Array Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArrayConstant
   * @generated
   */
  public Adapter createArrayConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.VectorConstant <em>Vector Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorConstant
   * @generated
   */
  public Adapter createVectorConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantList <em>Constant List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantList
   * @generated
   */
  public Adapter createConstantListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.TypedConstant <em>Typed Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypedConstant
   * @generated
   */
  public Adapter createTypedConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.SimpleConstant <em>Simple Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.SimpleConstant
   * @generated
   */
  public Adapter createSimpleConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNode <em>Metadata Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataNode
   * @generated
   */
  public Adapter createMetadataNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement <em>Metadata Node Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement
   * @generated
   */
  public Adapter createMetadataNodeElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataString <em>Metadata String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataString
   * @generated
   */
  public Adapter createMetadataStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.AddressSpace <em>Address Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.AddressSpace
   * @generated
   */
  public Adapter createAddressSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionDef <em>Function Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionDef
   * @generated
   */
  public Adapter createFunctionDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionDecl <em>Function Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionDecl
   * @generated
   */
  public Adapter createFunctionDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader <em>Function Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader
   * @generated
   */
  public Adapter createFunctionHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Parameters
   * @generated
   */
  public Adapter createParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes <em>Function Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes
   * @generated
   */
  public Adapter createFunctionAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.BasicBlock <em>Basic Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.BasicBlock
   * @generated
   */
  public Adapter createBasicBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix <em>Metadata Suffix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix
   * @generated
   */
  public Adapter createMetadataSuffixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.StartingInstruction <em>Starting Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.StartingInstruction
   * @generated
   */
  public Adapter createStartingInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction <em>Middle Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction
   * @generated
   */
  public Adapter createMiddleInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction <em>Named Middle Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction
   * @generated
   */
  public Adapter createNamedMiddleInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction <em>Terminator Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction
   * @generated
   */
  public Adapter createTerminatorInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction <em>Named Terminator Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction
   * @generated
   */
  public Adapter createNamedTerminatorInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_ret <em>Instruction ret</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_ret
   * @generated
   */
  public Adapter createInstruction_retAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br <em>Instruction br</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_br
   * @generated
   */
  public Adapter createInstruction_brAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch <em>Instruction switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_switch
   * @generated
   */
  public Adapter createInstruction_switchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr <em>Instruction indirectbr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr
   * @generated
   */
  public Adapter createInstruction_indirectbrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void <em>Instruction invoke void</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void
   * @generated
   */
  public Adapter createInstruction_invoke_voidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid <em>Instruction invoke non Void</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid
   * @generated
   */
  public Adapter createInstruction_invoke_nonVoidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_resume <em>Instruction resume</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_resume
   * @generated
   */
  public Adapter createInstruction_resumeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_unreachable <em>Instruction unreachable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_unreachable
   * @generated
   */
  public Adapter createInstruction_unreachableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef <em>Basic Block Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef
   * @generated
   */
  public Adapter createBasicBlockRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction <em>Binary Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction
   * @generated
   */
  public Adapter createBinaryInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_add <em>Instruction add</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_add
   * @generated
   */
  public Adapter createInstruction_addAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fadd <em>Instruction fadd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fadd
   * @generated
   */
  public Adapter createInstruction_faddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_sub <em>Instruction sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_sub
   * @generated
   */
  public Adapter createInstruction_subAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fsub <em>Instruction fsub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fsub
   * @generated
   */
  public Adapter createInstruction_fsubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_mul <em>Instruction mul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_mul
   * @generated
   */
  public Adapter createInstruction_mulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fmul <em>Instruction fmul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fmul
   * @generated
   */
  public Adapter createInstruction_fmulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_udiv <em>Instruction udiv</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_udiv
   * @generated
   */
  public Adapter createInstruction_udivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_sdiv <em>Instruction sdiv</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_sdiv
   * @generated
   */
  public Adapter createInstruction_sdivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fdiv <em>Instruction fdiv</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fdiv
   * @generated
   */
  public Adapter createInstruction_fdivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_urem <em>Instruction urem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_urem
   * @generated
   */
  public Adapter createInstruction_uremAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_srem <em>Instruction srem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_srem
   * @generated
   */
  public Adapter createInstruction_sremAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_frem <em>Instruction frem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_frem
   * @generated
   */
  public Adapter createInstruction_fremAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction <em>Bitwise Binary Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction
   * @generated
   */
  public Adapter createBitwiseBinaryInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shl <em>Instruction shl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_shl
   * @generated
   */
  public Adapter createInstruction_shlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_lshr <em>Instruction lshr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_lshr
   * @generated
   */
  public Adapter createInstruction_lshrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_ashr <em>Instruction ashr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_ashr
   * @generated
   */
  public Adapter createInstruction_ashrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_and <em>Instruction and</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_and
   * @generated
   */
  public Adapter createInstruction_andAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_or <em>Instruction or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_or
   * @generated
   */
  public Adapter createInstruction_orAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_xor <em>Instruction xor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_xor
   * @generated
   */
  public Adapter createInstruction_xorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.VectorInstructions <em>Vector Instructions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorInstructions
   * @generated
   */
  public Adapter createVectorInstructionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement <em>Instruction extractelement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement
   * @generated
   */
  public Adapter createInstruction_extractelementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement <em>Instruction insertelement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement
   * @generated
   */
  public Adapter createInstruction_insertelementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector <em>Instruction shufflevector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector
   * @generated
   */
  public Adapter createInstruction_shufflevectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction <em>Aggregate Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction
   * @generated
   */
  public Adapter createAggregateInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_extractvalue <em>Instruction extractvalue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_extractvalue
   * @generated
   */
  public Adapter createInstruction_extractvalueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_insertvalue <em>Instruction insertvalue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_insertvalue
   * @generated
   */
  public Adapter createInstruction_insertvalueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.MemoryInstruction <em>Memory Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.MemoryInstruction
   * @generated
   */
  public Adapter createMemoryInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca <em>Instruction alloca</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca
   * @generated
   */
  public Adapter createInstruction_allocaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_load <em>Instruction load</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_load
   * @generated
   */
  public Adapter createInstruction_loadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_store <em>Instruction store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_store
   * @generated
   */
  public Adapter createInstruction_storeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fence <em>Instruction fence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fence
   * @generated
   */
  public Adapter createInstruction_fenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg <em>Instruction cmpxchg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg
   * @generated
   */
  public Adapter createInstruction_cmpxchgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw <em>Instruction atomicrmw</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw
   * @generated
   */
  public Adapter createInstruction_atomicrmwAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr <em>Instruction getelementptr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr
   * @generated
   */
  public Adapter createInstruction_getelementptrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction <em>Conversion Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction
   * @generated
   */
  public Adapter createConversionInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.OtherInstruction <em>Other Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.OtherInstruction
   * @generated
   */
  public Adapter createOtherInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp <em>Instruction icmp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp
   * @generated
   */
  public Adapter createInstruction_icmpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp <em>Instruction fcmp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp
   * @generated
   */
  public Adapter createInstruction_fcmpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_phi <em>Instruction phi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_phi
   * @generated
   */
  public Adapter createInstruction_phiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select <em>Instruction select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_select
   * @generated
   */
  public Adapter createInstruction_selectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid <em>Instruction call non Void</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid
   * @generated
   */
  public Adapter createInstruction_call_nonVoidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void <em>Instruction call void</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void
   * @generated
   */
  public Adapter createInstruction_call_voidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ArgList <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArgList
   * @generated
   */
  public Adapter createArgListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Callee <em>Callee</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Callee
   * @generated
   */
  public Adapter createCalleeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAssembler <em>Inline Assembler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.InlineAssembler
   * @generated
   */
  public Adapter createInlineAssemblerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_va_arg <em>Instruction va arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_va_arg
   * @generated
   */
  public Adapter createInstruction_va_argAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad <em>Instruction landingpad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad
   * @generated
   */
  public Adapter createInstruction_landingpadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause <em>Landingpad Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.LandingpadClause
   * @generated
   */
  public Adapter createLandingpadClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.TypedValue <em>Typed Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypedValue
   * @generated
   */
  public Adapter createTypedValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ParameterType
   * @generated
   */
  public Adapter createParameterTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ParameterAttributes <em>Parameter Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ParameterAttributes
   * @generated
   */
  public Adapter createParameterAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType <em>Non Void Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonVoidType
   * @generated
   */
  public Adapter createNonVoidTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Star <em>Star</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Star
   * @generated
   */
  public Adapter createStarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix <em>Function Type Or Pointer To Function Type Suffix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix
   * @generated
   */
  public Adapter createFunctionTypeOrPointerToFunctionTypeSuffixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType <em>Non Left Recursive Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType
   * @generated
   */
  public Adapter createNonLeftRecursiveTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType <em>Non Left Recursive Non Void Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType
   * @generated
   */
  public Adapter createNonLeftRecursiveNonVoidTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypeDef
   * @generated
   */
  public Adapter createTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.IntType
   * @generated
   */
  public Adapter createIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.OpaqueType <em>Opaque Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.OpaqueType
   * @generated
   */
  public Adapter createOpaqueTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.StructType <em>Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.StructType
   * @generated
   */
  public Adapter createStructTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.VectorType <em>Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorType
   * @generated
   */
  public Adapter createVectorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArrayType
   * @generated
   */
  public Adapter createArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.X86mmxType <em>X8 6mmx Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.X86mmxType
   * @generated
   */
  public Adapter createX86mmxTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.VoidType <em>Void Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.VoidType
   * @generated
   */
  public Adapter createVoidTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataType <em>Metadata Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataType
   * @generated
   */
  public Adapter createMetadataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.intel.llvm.ireditor.lLVM_IR.FloatingType <em>Floating Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.intel.llvm.ireditor.lLVM_IR.FloatingType
   * @generated
   */
  public Adapter createFloatingTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LLVM_IRAdapterFactory
