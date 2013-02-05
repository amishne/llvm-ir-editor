/**
 */
package com.intel.llvm.ireditor.lLVM_IR.util;

import com.intel.llvm.ireditor.lLVM_IR.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage
 * @generated
 */
public class LLVM_IRSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LLVM_IRPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVM_IRSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LLVM_IRPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LLVM_IRPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.TOP_LEVEL_ELEMENT:
      {
        TopLevelElement topLevelElement = (TopLevelElement)theEObject;
        T result = caseTopLevelElement(topLevelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.NAMED_METADATA:
      {
        NamedMetadata namedMetadata = (NamedMetadata)theEObject;
        T result = caseNamedMetadata(namedMetadata);
        if (result == null) result = caseTopLevelElement(namedMetadata);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.METADATA_REF:
      {
        MetadataRef metadataRef = (MetadataRef)theEObject;
        T result = caseMetadataRef(metadataRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.VALUE_REF:
      {
        ValueRef valueRef = (ValueRef)theEObject;
        T result = caseValueRef(valueRef);
        if (result == null) result = caseCallee(valueRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.GLOBAL_VALUE_REF:
      {
        GlobalValueRef globalValueRef = (GlobalValueRef)theEObject;
        T result = caseGlobalValueRef(globalValueRef);
        if (result == null) result = caseValueRef(globalValueRef);
        if (result == null) result = caseCallee(globalValueRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.FUNCTION_REF:
      {
        FunctionRef functionRef = (FunctionRef)theEObject;
        T result = caseFunctionRef(functionRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.LOCAL_VALUE_REF:
      {
        LocalValueRef localValueRef = (LocalValueRef)theEObject;
        T result = caseLocalValueRef(localValueRef);
        if (result == null) result = caseValueRef(localValueRef);
        if (result == null) result = caseCallee(localValueRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.GLOBAL_VALUE:
      {
        GlobalValue globalValue = (GlobalValue)theEObject;
        T result = caseGlobalValue(globalValue);
        if (result == null) result = caseTopLevelElement(globalValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.GLOBAL_VALUE_DEF:
      {
        GlobalValueDef globalValueDef = (GlobalValueDef)theEObject;
        T result = caseGlobalValueDef(globalValueDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.LOCAL_VALUE:
      {
        LocalValue localValue = (LocalValue)theEObject;
        T result = caseLocalValue(localValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.NAMED_INSTRUCTION:
      {
        NamedInstruction namedInstruction = (NamedInstruction)theEObject;
        T result = caseNamedInstruction(namedInstruction);
        if (result == null) result = caseLocalValue(namedInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.ALIAS:
      {
        Alias alias = (Alias)theEObject;
        T result = caseAlias(alias);
        if (result == null) result = caseGlobalValue(alias);
        if (result == null) result = caseGlobalValueDef(alias);
        if (result == null) result = caseTopLevelElement(alias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.TARGET_INFO:
      {
        TargetInfo targetInfo = (TargetInfo)theEObject;
        T result = caseTargetInfo(targetInfo);
        if (result == null) result = caseTopLevelElement(targetInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INLINE_ASM:
      {
        InlineAsm inlineAsm = (InlineAsm)theEObject;
        T result = caseInlineAsm(inlineAsm);
        if (result == null) result = caseTopLevelElement(inlineAsm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.GLOBAL_VARIABLE:
      {
        GlobalVariable globalVariable = (GlobalVariable)theEObject;
        T result = caseGlobalVariable(globalVariable);
        if (result == null) result = caseGlobalValue(globalVariable);
        if (result == null) result = caseGlobalValueDef(globalVariable);
        if (result == null) result = caseTopLevelElement(globalVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION:
      {
        ConstantExpression constantExpression = (ConstantExpression)theEObject;
        T result = caseConstantExpression(constantExpression);
        if (result == null) result = caseConstant(constantExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT:
      {
        ConstantExpression_convert constantExpression_convert = (ConstantExpression_convert)theEObject;
        T result = caseConstantExpression_convert(constantExpression_convert);
        if (result == null) result = caseConstantExpression(constantExpression_convert);
        if (result == null) result = caseConstant(constantExpression_convert);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR:
      {
        ConstantExpression_getelementptr constantExpression_getelementptr = (ConstantExpression_getelementptr)theEObject;
        T result = caseConstantExpression_getelementptr(constantExpression_getelementptr);
        if (result == null) result = caseConstantExpression(constantExpression_getelementptr);
        if (result == null) result = caseConstant(constantExpression_getelementptr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_SELECT:
      {
        ConstantExpression_select constantExpression_select = (ConstantExpression_select)theEObject;
        T result = caseConstantExpression_select(constantExpression_select);
        if (result == null) result = caseConstantExpression(constantExpression_select);
        if (result == null) result = caseConstant(constantExpression_select);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_COMPARE:
      {
        ConstantExpression_compare constantExpression_compare = (ConstantExpression_compare)theEObject;
        T result = caseConstantExpression_compare(constantExpression_compare);
        if (result == null) result = caseConstantExpression(constantExpression_compare);
        if (result == null) result = caseConstant(constantExpression_compare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT:
      {
        ConstantExpression_extractelement constantExpression_extractelement = (ConstantExpression_extractelement)theEObject;
        T result = caseConstantExpression_extractelement(constantExpression_extractelement);
        if (result == null) result = caseConstantExpression(constantExpression_extractelement);
        if (result == null) result = caseConstant(constantExpression_extractelement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT:
      {
        ConstantExpression_insertelement constantExpression_insertelement = (ConstantExpression_insertelement)theEObject;
        T result = caseConstantExpression_insertelement(constantExpression_insertelement);
        if (result == null) result = caseConstantExpression(constantExpression_insertelement);
        if (result == null) result = caseConstant(constantExpression_insertelement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_SHUFFLEVECTOR:
      {
        ConstantExpression_shufflevector constantExpression_shufflevector = (ConstantExpression_shufflevector)theEObject;
        T result = caseConstantExpression_shufflevector(constantExpression_shufflevector);
        if (result == null) result = caseConstantExpression(constantExpression_shufflevector);
        if (result == null) result = caseConstant(constantExpression_shufflevector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTVALUE:
      {
        ConstantExpression_extractvalue constantExpression_extractvalue = (ConstantExpression_extractvalue)theEObject;
        T result = caseConstantExpression_extractvalue(constantExpression_extractvalue);
        if (result == null) result = caseConstantExpression(constantExpression_extractvalue);
        if (result == null) result = caseConstant(constantExpression_extractvalue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE:
      {
        ConstantExpression_insertvalue constantExpression_insertvalue = (ConstantExpression_insertvalue)theEObject;
        T result = caseConstantExpression_insertvalue(constantExpression_insertvalue);
        if (result == null) result = caseConstantExpression(constantExpression_insertvalue);
        if (result == null) result = caseConstant(constantExpression_insertvalue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_EXPRESSION_BINARY:
      {
        ConstantExpression_binary constantExpression_binary = (ConstantExpression_binary)theEObject;
        T result = caseConstantExpression_binary(constantExpression_binary);
        if (result == null) result = caseConstantExpression(constantExpression_binary);
        if (result == null) result = caseConstant(constantExpression_binary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.UNDEF:
      {
        Undef undef = (Undef)theEObject;
        T result = caseUndef(undef);
        if (result == null) result = caseConstant(undef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.BLOCK_ADDRESS:
      {
        BlockAddress blockAddress = (BlockAddress)theEObject;
        T result = caseBlockAddress(blockAddress);
        if (result == null) result = caseConstant(blockAddress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.ZERO_INITIALIZER:
      {
        ZeroInitializer zeroInitializer = (ZeroInitializer)theEObject;
        T result = caseZeroInitializer(zeroInitializer);
        if (result == null) result = caseConstant(zeroInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.STRUCTURE_CONSTANT:
      {
        StructureConstant structureConstant = (StructureConstant)theEObject;
        T result = caseStructureConstant(structureConstant);
        if (result == null) result = caseConstant(structureConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.ARRAY_CONSTANT:
      {
        ArrayConstant arrayConstant = (ArrayConstant)theEObject;
        T result = caseArrayConstant(arrayConstant);
        if (result == null) result = caseConstant(arrayConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.VECTOR_CONSTANT:
      {
        VectorConstant vectorConstant = (VectorConstant)theEObject;
        T result = caseVectorConstant(vectorConstant);
        if (result == null) result = caseConstant(vectorConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONSTANT_LIST:
      {
        ConstantList constantList = (ConstantList)theEObject;
        T result = caseConstantList(constantList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.TYPED_CONSTANT:
      {
        TypedConstant typedConstant = (TypedConstant)theEObject;
        T result = caseTypedConstant(typedConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.SIMPLE_CONSTANT:
      {
        SimpleConstant simpleConstant = (SimpleConstant)theEObject;
        T result = caseSimpleConstant(simpleConstant);
        if (result == null) result = caseConstant(simpleConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.METADATA_NODE:
      {
        MetadataNode metadataNode = (MetadataNode)theEObject;
        T result = caseMetadataNode(metadataNode);
        if (result == null) result = caseConstant(metadataNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.METADATA_NODE_ELEMENT:
      {
        MetadataNodeElement metadataNodeElement = (MetadataNodeElement)theEObject;
        T result = caseMetadataNodeElement(metadataNodeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.METADATA_STRING:
      {
        MetadataString metadataString = (MetadataString)theEObject;
        T result = caseMetadataString(metadataString);
        if (result == null) result = caseConstant(metadataString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.ADDRESS_SPACE:
      {
        AddressSpace addressSpace = (AddressSpace)theEObject;
        T result = caseAddressSpace(addressSpace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseGlobalValue(function);
        if (result == null) result = caseTopLevelElement(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.FUNCTION_DEF:
      {
        FunctionDef functionDef = (FunctionDef)theEObject;
        T result = caseFunctionDef(functionDef);
        if (result == null) result = caseFunction(functionDef);
        if (result == null) result = caseGlobalValue(functionDef);
        if (result == null) result = caseTopLevelElement(functionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.FUNCTION_DECL:
      {
        FunctionDecl functionDecl = (FunctionDecl)theEObject;
        T result = caseFunctionDecl(functionDecl);
        if (result == null) result = caseFunction(functionDecl);
        if (result == null) result = caseGlobalValue(functionDecl);
        if (result == null) result = caseTopLevelElement(functionDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.FUNCTION_HEADER:
      {
        FunctionHeader functionHeader = (FunctionHeader)theEObject;
        T result = caseFunctionHeader(functionHeader);
        if (result == null) result = caseGlobalValueDef(functionHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.PARAMETERS:
      {
        Parameters parameters = (Parameters)theEObject;
        T result = caseParameters(parameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES:
      {
        FunctionAttributes functionAttributes = (FunctionAttributes)theEObject;
        T result = caseFunctionAttributes(functionAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.BASIC_BLOCK:
      {
        BasicBlock basicBlock = (BasicBlock)theEObject;
        T result = caseBasicBlock(basicBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.METADATA_SUFFIX:
      {
        MetadataSuffix metadataSuffix = (MetadataSuffix)theEObject;
        T result = caseMetadataSuffix(metadataSuffix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.STARTING_INSTRUCTION:
      {
        StartingInstruction startingInstruction = (StartingInstruction)theEObject;
        T result = caseStartingInstruction(startingInstruction);
        if (result == null) result = caseNamedInstruction(startingInstruction);
        if (result == null) result = caseInstruction(startingInstruction);
        if (result == null) result = caseLocalValue(startingInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.MIDDLE_INSTRUCTION:
      {
        MiddleInstruction middleInstruction = (MiddleInstruction)theEObject;
        T result = caseMiddleInstruction(middleInstruction);
        if (result == null) result = caseInstruction(middleInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.NAMED_MIDDLE_INSTRUCTION:
      {
        NamedMiddleInstruction namedMiddleInstruction = (NamedMiddleInstruction)theEObject;
        T result = caseNamedMiddleInstruction(namedMiddleInstruction);
        if (result == null) result = caseNamedInstruction(namedMiddleInstruction);
        if (result == null) result = caseLocalValue(namedMiddleInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.TERMINATOR_INSTRUCTION:
      {
        TerminatorInstruction terminatorInstruction = (TerminatorInstruction)theEObject;
        T result = caseTerminatorInstruction(terminatorInstruction);
        if (result == null) result = caseInstruction(terminatorInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.NAMED_TERMINATOR_INSTRUCTION:
      {
        NamedTerminatorInstruction namedTerminatorInstruction = (NamedTerminatorInstruction)theEObject;
        T result = caseNamedTerminatorInstruction(namedTerminatorInstruction);
        if (result == null) result = caseNamedInstruction(namedTerminatorInstruction);
        if (result == null) result = caseLocalValue(namedTerminatorInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_RET:
      {
        Instruction_ret instruction_ret = (Instruction_ret)theEObject;
        T result = caseInstruction_ret(instruction_ret);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_BR:
      {
        Instruction_br instruction_br = (Instruction_br)theEObject;
        T result = caseInstruction_br(instruction_br);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_SWITCH:
      {
        Instruction_switch instruction_switch = (Instruction_switch)theEObject;
        T result = caseInstruction_switch(instruction_switch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR:
      {
        Instruction_indirectbr instruction_indirectbr = (Instruction_indirectbr)theEObject;
        T result = caseInstruction_indirectbr(instruction_indirectbr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_INVOKE_VOID:
      {
        Instruction_invoke_void instruction_invoke_void = (Instruction_invoke_void)theEObject;
        T result = caseInstruction_invoke_void(instruction_invoke_void);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_INVOKE_NON_VOID:
      {
        Instruction_invoke_nonVoid instruction_invoke_nonVoid = (Instruction_invoke_nonVoid)theEObject;
        T result = caseInstruction_invoke_nonVoid(instruction_invoke_nonVoid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_RESUME:
      {
        Instruction_resume instruction_resume = (Instruction_resume)theEObject;
        T result = caseInstruction_resume(instruction_resume);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_UNREACHABLE:
      {
        Instruction_unreachable instruction_unreachable = (Instruction_unreachable)theEObject;
        T result = caseInstruction_unreachable(instruction_unreachable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.BASIC_BLOCK_REF:
      {
        BasicBlockRef basicBlockRef = (BasicBlockRef)theEObject;
        T result = caseBasicBlockRef(basicBlockRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.BINARY_INSTRUCTION:
      {
        BinaryInstruction binaryInstruction = (BinaryInstruction)theEObject;
        T result = caseBinaryInstruction(binaryInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_ADD:
      {
        Instruction_add instruction_add = (Instruction_add)theEObject;
        T result = caseInstruction_add(instruction_add);
        if (result == null) result = caseBinaryInstruction(instruction_add);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_FADD:
      {
        Instruction_fadd instruction_fadd = (Instruction_fadd)theEObject;
        T result = caseInstruction_fadd(instruction_fadd);
        if (result == null) result = caseBinaryInstruction(instruction_fadd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_SUB:
      {
        Instruction_sub instruction_sub = (Instruction_sub)theEObject;
        T result = caseInstruction_sub(instruction_sub);
        if (result == null) result = caseBinaryInstruction(instruction_sub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_FSUB:
      {
        Instruction_fsub instruction_fsub = (Instruction_fsub)theEObject;
        T result = caseInstruction_fsub(instruction_fsub);
        if (result == null) result = caseBinaryInstruction(instruction_fsub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_MUL:
      {
        Instruction_mul instruction_mul = (Instruction_mul)theEObject;
        T result = caseInstruction_mul(instruction_mul);
        if (result == null) result = caseBinaryInstruction(instruction_mul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_FMUL:
      {
        Instruction_fmul instruction_fmul = (Instruction_fmul)theEObject;
        T result = caseInstruction_fmul(instruction_fmul);
        if (result == null) result = caseBinaryInstruction(instruction_fmul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_UDIV:
      {
        Instruction_udiv instruction_udiv = (Instruction_udiv)theEObject;
        T result = caseInstruction_udiv(instruction_udiv);
        if (result == null) result = caseBinaryInstruction(instruction_udiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_SDIV:
      {
        Instruction_sdiv instruction_sdiv = (Instruction_sdiv)theEObject;
        T result = caseInstruction_sdiv(instruction_sdiv);
        if (result == null) result = caseBinaryInstruction(instruction_sdiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_FDIV:
      {
        Instruction_fdiv instruction_fdiv = (Instruction_fdiv)theEObject;
        T result = caseInstruction_fdiv(instruction_fdiv);
        if (result == null) result = caseBinaryInstruction(instruction_fdiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_UREM:
      {
        Instruction_urem instruction_urem = (Instruction_urem)theEObject;
        T result = caseInstruction_urem(instruction_urem);
        if (result == null) result = caseBinaryInstruction(instruction_urem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_SREM:
      {
        Instruction_srem instruction_srem = (Instruction_srem)theEObject;
        T result = caseInstruction_srem(instruction_srem);
        if (result == null) result = caseBinaryInstruction(instruction_srem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_FREM:
      {
        Instruction_frem instruction_frem = (Instruction_frem)theEObject;
        T result = caseInstruction_frem(instruction_frem);
        if (result == null) result = caseBinaryInstruction(instruction_frem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.BITWISE_BINARY_INSTRUCTION:
      {
        BitwiseBinaryInstruction bitwiseBinaryInstruction = (BitwiseBinaryInstruction)theEObject;
        T result = caseBitwiseBinaryInstruction(bitwiseBinaryInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_SHL:
      {
        Instruction_shl instruction_shl = (Instruction_shl)theEObject;
        T result = caseInstruction_shl(instruction_shl);
        if (result == null) result = caseBitwiseBinaryInstruction(instruction_shl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_LSHR:
      {
        Instruction_lshr instruction_lshr = (Instruction_lshr)theEObject;
        T result = caseInstruction_lshr(instruction_lshr);
        if (result == null) result = caseBitwiseBinaryInstruction(instruction_lshr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_ASHR:
      {
        Instruction_ashr instruction_ashr = (Instruction_ashr)theEObject;
        T result = caseInstruction_ashr(instruction_ashr);
        if (result == null) result = caseBitwiseBinaryInstruction(instruction_ashr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_AND:
      {
        Instruction_and instruction_and = (Instruction_and)theEObject;
        T result = caseInstruction_and(instruction_and);
        if (result == null) result = caseBitwiseBinaryInstruction(instruction_and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_OR:
      {
        Instruction_or instruction_or = (Instruction_or)theEObject;
        T result = caseInstruction_or(instruction_or);
        if (result == null) result = caseBitwiseBinaryInstruction(instruction_or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_XOR:
      {
        Instruction_xor instruction_xor = (Instruction_xor)theEObject;
        T result = caseInstruction_xor(instruction_xor);
        if (result == null) result = caseBitwiseBinaryInstruction(instruction_xor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.VECTOR_INSTRUCTIONS:
      {
        VectorInstructions vectorInstructions = (VectorInstructions)theEObject;
        T result = caseVectorInstructions(vectorInstructions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_EXTRACTELEMENT:
      {
        Instruction_extractelement instruction_extractelement = (Instruction_extractelement)theEObject;
        T result = caseInstruction_extractelement(instruction_extractelement);
        if (result == null) result = caseVectorInstructions(instruction_extractelement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_INSERTELEMENT:
      {
        Instruction_insertelement instruction_insertelement = (Instruction_insertelement)theEObject;
        T result = caseInstruction_insertelement(instruction_insertelement);
        if (result == null) result = caseVectorInstructions(instruction_insertelement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR:
      {
        Instruction_shufflevector instruction_shufflevector = (Instruction_shufflevector)theEObject;
        T result = caseInstruction_shufflevector(instruction_shufflevector);
        if (result == null) result = caseVectorInstructions(instruction_shufflevector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.AGGREGATE_INSTRUCTION:
      {
        AggregateInstruction aggregateInstruction = (AggregateInstruction)theEObject;
        T result = caseAggregateInstruction(aggregateInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_EXTRACTVALUE:
      {
        Instruction_extractvalue instruction_extractvalue = (Instruction_extractvalue)theEObject;
        T result = caseInstruction_extractvalue(instruction_extractvalue);
        if (result == null) result = caseAggregateInstruction(instruction_extractvalue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_INSERTVALUE:
      {
        Instruction_insertvalue instruction_insertvalue = (Instruction_insertvalue)theEObject;
        T result = caseInstruction_insertvalue(instruction_insertvalue);
        if (result == null) result = caseAggregateInstruction(instruction_insertvalue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.MEMORY_INSTRUCTION:
      {
        MemoryInstruction memoryInstruction = (MemoryInstruction)theEObject;
        T result = caseMemoryInstruction(memoryInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_ALLOCA:
      {
        Instruction_alloca instruction_alloca = (Instruction_alloca)theEObject;
        T result = caseInstruction_alloca(instruction_alloca);
        if (result == null) result = caseMemoryInstruction(instruction_alloca);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_LOAD:
      {
        Instruction_load instruction_load = (Instruction_load)theEObject;
        T result = caseInstruction_load(instruction_load);
        if (result == null) result = caseMemoryInstruction(instruction_load);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_STORE:
      {
        Instruction_store instruction_store = (Instruction_store)theEObject;
        T result = caseInstruction_store(instruction_store);
        if (result == null) result = caseMemoryInstruction(instruction_store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_FENCE:
      {
        Instruction_fence instruction_fence = (Instruction_fence)theEObject;
        T result = caseInstruction_fence(instruction_fence);
        if (result == null) result = caseMemoryInstruction(instruction_fence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_CMPXCHG:
      {
        Instruction_cmpxchg instruction_cmpxchg = (Instruction_cmpxchg)theEObject;
        T result = caseInstruction_cmpxchg(instruction_cmpxchg);
        if (result == null) result = caseMemoryInstruction(instruction_cmpxchg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_ATOMICRMW:
      {
        Instruction_atomicrmw instruction_atomicrmw = (Instruction_atomicrmw)theEObject;
        T result = caseInstruction_atomicrmw(instruction_atomicrmw);
        if (result == null) result = caseMemoryInstruction(instruction_atomicrmw);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_GETELEMENTPTR:
      {
        Instruction_getelementptr instruction_getelementptr = (Instruction_getelementptr)theEObject;
        T result = caseInstruction_getelementptr(instruction_getelementptr);
        if (result == null) result = caseMemoryInstruction(instruction_getelementptr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CONVERSION_INSTRUCTION:
      {
        ConversionInstruction conversionInstruction = (ConversionInstruction)theEObject;
        T result = caseConversionInstruction(conversionInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.OTHER_INSTRUCTION:
      {
        OtherInstruction otherInstruction = (OtherInstruction)theEObject;
        T result = caseOtherInstruction(otherInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_ICMP:
      {
        Instruction_icmp instruction_icmp = (Instruction_icmp)theEObject;
        T result = caseInstruction_icmp(instruction_icmp);
        if (result == null) result = caseOtherInstruction(instruction_icmp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_FCMP:
      {
        Instruction_fcmp instruction_fcmp = (Instruction_fcmp)theEObject;
        T result = caseInstruction_fcmp(instruction_fcmp);
        if (result == null) result = caseOtherInstruction(instruction_fcmp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_PHI:
      {
        Instruction_phi instruction_phi = (Instruction_phi)theEObject;
        T result = caseInstruction_phi(instruction_phi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_SELECT:
      {
        Instruction_select instruction_select = (Instruction_select)theEObject;
        T result = caseInstruction_select(instruction_select);
        if (result == null) result = caseOtherInstruction(instruction_select);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID:
      {
        Instruction_call_nonVoid instruction_call_nonVoid = (Instruction_call_nonVoid)theEObject;
        T result = caseInstruction_call_nonVoid(instruction_call_nonVoid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_CALL_VOID:
      {
        Instruction_call_void instruction_call_void = (Instruction_call_void)theEObject;
        T result = caseInstruction_call_void(instruction_call_void);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.ARG_LIST:
      {
        ArgList argList = (ArgList)theEObject;
        T result = caseArgList(argList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.CALLEE:
      {
        Callee callee = (Callee)theEObject;
        T result = caseCallee(callee);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INLINE_ASSEMBLER:
      {
        InlineAssembler inlineAssembler = (InlineAssembler)theEObject;
        T result = caseInlineAssembler(inlineAssembler);
        if (result == null) result = caseCallee(inlineAssembler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_VA_ARG:
      {
        Instruction_va_arg instruction_va_arg = (Instruction_va_arg)theEObject;
        T result = caseInstruction_va_arg(instruction_va_arg);
        if (result == null) result = caseOtherInstruction(instruction_va_arg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD:
      {
        Instruction_landingpad instruction_landingpad = (Instruction_landingpad)theEObject;
        T result = caseInstruction_landingpad(instruction_landingpad);
        if (result == null) result = caseOtherInstruction(instruction_landingpad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.LANDINGPAD_CLAUSE:
      {
        LandingpadClause landingpadClause = (LandingpadClause)theEObject;
        T result = caseLandingpadClause(landingpadClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.TYPED_VALUE:
      {
        TypedValue typedValue = (TypedValue)theEObject;
        T result = caseTypedValue(typedValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.PARAMETER_TYPE:
      {
        ParameterType parameterType = (ParameterType)theEObject;
        T result = caseParameterType(parameterType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.PARAMETER_ATTRIBUTES:
      {
        ParameterAttributes parameterAttributes = (ParameterAttributes)theEObject;
        T result = caseParameterAttributes(parameterAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseLocalValue(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.NON_VOID_TYPE:
      {
        NonVoidType nonVoidType = (NonVoidType)theEObject;
        T result = caseNonVoidType(nonVoidType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.STAR:
      {
        Star star = (Star)theEObject;
        T result = caseStar(star);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX:
      {
        FunctionTypeOrPointerToFunctionTypeSuffix functionTypeOrPointerToFunctionTypeSuffix = (FunctionTypeOrPointerToFunctionTypeSuffix)theEObject;
        T result = caseFunctionTypeOrPointerToFunctionTypeSuffix(functionTypeOrPointerToFunctionTypeSuffix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_TYPE:
      {
        NonLeftRecursiveType nonLeftRecursiveType = (NonLeftRecursiveType)theEObject;
        T result = caseNonLeftRecursiveType(nonLeftRecursiveType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE:
      {
        NonLeftRecursiveNonVoidType nonLeftRecursiveNonVoidType = (NonLeftRecursiveNonVoidType)theEObject;
        T result = caseNonLeftRecursiveNonVoidType(nonLeftRecursiveNonVoidType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.TYPE_DEF:
      {
        TypeDef typeDef = (TypeDef)theEObject;
        T result = caseTypeDef(typeDef);
        if (result == null) result = caseTopLevelElement(typeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.INT_TYPE:
      {
        IntType intType = (IntType)theEObject;
        T result = caseIntType(intType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.OPAQUE_TYPE:
      {
        OpaqueType opaqueType = (OpaqueType)theEObject;
        T result = caseOpaqueType(opaqueType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.STRUCT_TYPE:
      {
        StructType structType = (StructType)theEObject;
        T result = caseStructType(structType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.VECTOR_TYPE:
      {
        VectorType vectorType = (VectorType)theEObject;
        T result = caseVectorType(vectorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.ARRAY_TYPE:
      {
        ArrayType arrayType = (ArrayType)theEObject;
        T result = caseArrayType(arrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.X8_6MMX_TYPE:
      {
        X86mmxType x86mmxType = (X86mmxType)theEObject;
        T result = caseX86mmxType(x86mmxType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.VOID_TYPE:
      {
        VoidType voidType = (VoidType)theEObject;
        T result = caseVoidType(voidType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.METADATA_TYPE:
      {
        MetadataType metadataType = (MetadataType)theEObject;
        T result = caseMetadataType(metadataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LLVM_IRPackage.FLOATING_TYPE:
      {
        FloatingType floatingType = (FloatingType)theEObject;
        T result = caseFloatingType(floatingType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelElement(TopLevelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Metadata</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Metadata</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedMetadata(NamedMetadata object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadataRef(MetadataRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueRef(ValueRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Value Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Value Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalValueRef(GlobalValueRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionRef(FunctionRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Value Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Value Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalValueRef(LocalValueRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalValue(GlobalValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Value Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Value Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalValueDef(GlobalValueDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalValue(LocalValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedInstruction(NamedInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlias(Alias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetInfo(TargetInfo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inline Asm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inline Asm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInlineAsm(InlineAsm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalVariable(GlobalVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression(ConstantExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression convert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression convert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_convert(ConstantExpression_convert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression getelementptr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression getelementptr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_getelementptr(ConstantExpression_getelementptr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_select(ConstantExpression_select object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression compare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression compare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_compare(ConstantExpression_compare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression extractelement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression extractelement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_extractelement(ConstantExpression_extractelement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression insertelement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression insertelement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_insertelement(ConstantExpression_insertelement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression shufflevector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression shufflevector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_shufflevector(ConstantExpression_shufflevector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression extractvalue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression extractvalue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_extractvalue(ConstantExpression_extractvalue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression insertvalue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression insertvalue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_insertvalue(ConstantExpression_insertvalue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Expression binary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Expression binary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantExpression_binary(ConstantExpression_binary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Undef</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Undef</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUndef(Undef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockAddress(BlockAddress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Zero Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zero Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZeroInitializer(ZeroInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureConstant(StructureConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayConstant(ArrayConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVectorConstant(VectorConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantList(ConstantList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedConstant(TypedConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleConstant(SimpleConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadataNode(MetadataNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata Node Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata Node Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadataNodeElement(MetadataNodeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadataString(MetadataString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address Space</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address Space</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddressSpace(AddressSpace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDef(FunctionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDecl(FunctionDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionHeader(FunctionHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameters(Parameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionAttributes(FunctionAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicBlock(BasicBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata Suffix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata Suffix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadataSuffix(MetadataSuffix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Starting Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Starting Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartingInstruction(StartingInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Middle Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Middle Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMiddleInstruction(MiddleInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Middle Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Middle Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedMiddleInstruction(NamedMiddleInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminator Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminator Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminatorInstruction(TerminatorInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Terminator Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Terminator Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedTerminatorInstruction(NamedTerminatorInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction ret</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction ret</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_ret(Instruction_ret object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction br</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction br</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_br(Instruction_br object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_switch(Instruction_switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction indirectbr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction indirectbr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_indirectbr(Instruction_indirectbr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction invoke void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction invoke void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_invoke_void(Instruction_invoke_void object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction invoke non Void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction invoke non Void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_invoke_nonVoid(Instruction_invoke_nonVoid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction resume</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction resume</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_resume(Instruction_resume object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction unreachable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction unreachable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_unreachable(Instruction_unreachable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Block Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Block Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicBlockRef(BasicBlockRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryInstruction(BinaryInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction add</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction add</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_add(Instruction_add object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction fadd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction fadd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_fadd(Instruction_fadd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_sub(Instruction_sub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction fsub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction fsub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_fsub(Instruction_fsub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_mul(Instruction_mul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction fmul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction fmul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_fmul(Instruction_fmul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction udiv</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction udiv</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_udiv(Instruction_udiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction sdiv</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction sdiv</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_sdiv(Instruction_sdiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction fdiv</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction fdiv</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_fdiv(Instruction_fdiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction urem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction urem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_urem(Instruction_urem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction srem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction srem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_srem(Instruction_srem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction frem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction frem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_frem(Instruction_frem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitwise Binary Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitwise Binary Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitwiseBinaryInstruction(BitwiseBinaryInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction shl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction shl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_shl(Instruction_shl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction lshr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction lshr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_lshr(Instruction_lshr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction ashr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction ashr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_ashr(Instruction_ashr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction and</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction and</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_and(Instruction_and object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_or(Instruction_or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction xor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction xor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_xor(Instruction_xor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector Instructions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector Instructions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVectorInstructions(VectorInstructions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction extractelement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction extractelement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_extractelement(Instruction_extractelement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction insertelement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction insertelement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_insertelement(Instruction_insertelement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction shufflevector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction shufflevector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_shufflevector(Instruction_shufflevector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aggregate Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregate Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAggregateInstruction(AggregateInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction extractvalue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction extractvalue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_extractvalue(Instruction_extractvalue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction insertvalue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction insertvalue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_insertvalue(Instruction_insertvalue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Memory Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Memory Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemoryInstruction(MemoryInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction alloca</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction alloca</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_alloca(Instruction_alloca object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction load</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction load</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_load(Instruction_load object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_store(Instruction_store object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction fence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction fence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_fence(Instruction_fence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction cmpxchg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction cmpxchg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_cmpxchg(Instruction_cmpxchg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction atomicrmw</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction atomicrmw</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_atomicrmw(Instruction_atomicrmw object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction getelementptr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction getelementptr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_getelementptr(Instruction_getelementptr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conversion Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conversion Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConversionInstruction(ConversionInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Other Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOtherInstruction(OtherInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction icmp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction icmp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_icmp(Instruction_icmp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction fcmp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction fcmp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_fcmp(Instruction_fcmp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction phi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction phi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_phi(Instruction_phi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_select(Instruction_select object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction call non Void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction call non Void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_call_nonVoid(Instruction_call_nonVoid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction call void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction call void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_call_void(Instruction_call_void object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgList(ArgList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callee</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callee</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallee(Callee object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inline Assembler</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inline Assembler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInlineAssembler(InlineAssembler object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction va arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction va arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_va_arg(Instruction_va_arg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction landingpad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction landingpad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction_landingpad(Instruction_landingpad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Landingpad Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Landingpad Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLandingpadClause(LandingpadClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedValue(TypedValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterType(ParameterType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterAttributes(ParameterAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Void Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Void Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonVoidType(NonVoidType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Star</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Star</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStar(Star object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Type Or Pointer To Function Type Suffix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Type Or Pointer To Function Type Suffix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionTypeOrPointerToFunctionTypeSuffix(FunctionTypeOrPointerToFunctionTypeSuffix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Left Recursive Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Left Recursive Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonLeftRecursiveType(NonLeftRecursiveType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Left Recursive Non Void Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Left Recursive Non Void Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonLeftRecursiveNonVoidType(NonLeftRecursiveNonVoidType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDef(TypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntType(IntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Opaque Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Opaque Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpaqueType(OpaqueType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructType(StructType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVectorType(VectorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayType(ArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>X8 6mmx Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>X8 6mmx Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseX86mmxType(X86mmxType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVoidType(VoidType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetadataType(MetadataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Floating Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Floating Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatingType(FloatingType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LLVM_IRSwitch
