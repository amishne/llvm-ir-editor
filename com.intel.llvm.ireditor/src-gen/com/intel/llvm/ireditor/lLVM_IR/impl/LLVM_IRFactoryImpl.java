/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LLVM_IRFactoryImpl extends EFactoryImpl implements LLVM_IRFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LLVM_IRFactory init()
  {
    try
    {
      LLVM_IRFactory theLLVM_IRFactory = (LLVM_IRFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.intel.com/llvm/ireditor"); 
      if (theLLVM_IRFactory != null)
      {
        return theLLVM_IRFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LLVM_IRFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVM_IRFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LLVM_IRPackage.MODEL: return createModel();
      case LLVM_IRPackage.TOP_LEVEL_ELEMENT: return createTopLevelElement();
      case LLVM_IRPackage.ATTRIBUTE_GROUP: return createAttributeGroup();
      case LLVM_IRPackage.NAMED_METADATA: return createNamedMetadata();
      case LLVM_IRPackage.METADATA_REF: return createMetadataRef();
      case LLVM_IRPackage.VALUE_REF: return createValueRef();
      case LLVM_IRPackage.GLOBAL_VALUE_REF: return createGlobalValueRef();
      case LLVM_IRPackage.LOCAL_VALUE_REF: return createLocalValueRef();
      case LLVM_IRPackage.GLOBAL_VALUE: return createGlobalValue();
      case LLVM_IRPackage.GLOBAL_VALUE_DEF: return createGlobalValueDef();
      case LLVM_IRPackage.LOCAL_VALUE: return createLocalValue();
      case LLVM_IRPackage.NAMED_INSTRUCTION: return createNamedInstruction();
      case LLVM_IRPackage.INSTRUCTION: return createInstruction();
      case LLVM_IRPackage.ALIAS: return createAlias();
      case LLVM_IRPackage.ALIASEE: return createAliasee();
      case LLVM_IRPackage.TARGET_INFO: return createTargetInfo();
      case LLVM_IRPackage.INLINE_ASM: return createInlineAsm();
      case LLVM_IRPackage.GLOBAL_VARIABLE: return createGlobalVariable();
      case LLVM_IRPackage.CONSTANT: return createConstant();
      case LLVM_IRPackage.CONSTANT_EXPRESSION: return createConstantExpression();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT: return createConstantExpression_convert();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR: return createConstantExpression_getelementptr();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_SELECT: return createConstantExpression_select();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_COMPARE: return createConstantExpression_compare();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT: return createConstantExpression_extractelement();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT: return createConstantExpression_insertelement();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_SHUFFLEVECTOR: return createConstantExpression_shufflevector();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTVALUE: return createConstantExpression_extractvalue();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE: return createConstantExpression_insertvalue();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_BINARY: return createConstantExpression_binary();
      case LLVM_IRPackage.UNDEF: return createUndef();
      case LLVM_IRPackage.BLOCK_ADDRESS: return createBlockAddress();
      case LLVM_IRPackage.ZERO_INITIALIZER: return createZeroInitializer();
      case LLVM_IRPackage.STRUCTURE_CONSTANT: return createStructureConstant();
      case LLVM_IRPackage.ARRAY_CONSTANT: return createArrayConstant();
      case LLVM_IRPackage.VECTOR_CONSTANT: return createVectorConstant();
      case LLVM_IRPackage.CONSTANT_LIST: return createConstantList();
      case LLVM_IRPackage.TYPED_CONSTANT: return createTypedConstant();
      case LLVM_IRPackage.SIMPLE_CONSTANT: return createSimpleConstant();
      case LLVM_IRPackage.METADATA_NODE: return createMetadataNode();
      case LLVM_IRPackage.METADATA_NODE_ELEMENT: return createMetadataNodeElement();
      case LLVM_IRPackage.METADATA_STRING: return createMetadataString();
      case LLVM_IRPackage.ADDRESS_SPACE: return createAddressSpace();
      case LLVM_IRPackage.FUNCTION: return createFunction();
      case LLVM_IRPackage.FUNCTION_DEF: return createFunctionDef();
      case LLVM_IRPackage.FUNCTION_DECL: return createFunctionDecl();
      case LLVM_IRPackage.FUNCTION_HEADER: return createFunctionHeader();
      case LLVM_IRPackage.PARAMETERS: return createParameters();
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES: return createFunctionAttributes();
      case LLVM_IRPackage.ALIGN_STACK: return createAlignStack();
      case LLVM_IRPackage.FUNCTION_ATTRIBUTE: return createFunctionAttribute();
      case LLVM_IRPackage.BASIC_BLOCK: return createBasicBlock();
      case LLVM_IRPackage.METADATA_SUFFIX: return createMetadataSuffix();
      case LLVM_IRPackage.STARTING_INSTRUCTION: return createStartingInstruction();
      case LLVM_IRPackage.MIDDLE_INSTRUCTION: return createMiddleInstruction();
      case LLVM_IRPackage.NAMED_MIDDLE_INSTRUCTION: return createNamedMiddleInstruction();
      case LLVM_IRPackage.TERMINATOR_INSTRUCTION: return createTerminatorInstruction();
      case LLVM_IRPackage.NAMED_TERMINATOR_INSTRUCTION: return createNamedTerminatorInstruction();
      case LLVM_IRPackage.INSTRUCTION_RET: return createInstruction_ret();
      case LLVM_IRPackage.INSTRUCTION_BR: return createInstruction_br();
      case LLVM_IRPackage.INSTRUCTION_SWITCH: return createInstruction_switch();
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR: return createInstruction_indirectbr();
      case LLVM_IRPackage.INSTRUCTION_INVOKE_VOID: return createInstruction_invoke_void();
      case LLVM_IRPackage.INSTRUCTION_INVOKE_NON_VOID: return createInstruction_invoke_nonVoid();
      case LLVM_IRPackage.INSTRUCTION_RESUME: return createInstruction_resume();
      case LLVM_IRPackage.INSTRUCTION_UNREACHABLE: return createInstruction_unreachable();
      case LLVM_IRPackage.BASIC_BLOCK_REF: return createBasicBlockRef();
      case LLVM_IRPackage.BINARY_INSTRUCTION: return createBinaryInstruction();
      case LLVM_IRPackage.INSTRUCTION_ADD: return createInstruction_add();
      case LLVM_IRPackage.INSTRUCTION_FADD: return createInstruction_fadd();
      case LLVM_IRPackage.INSTRUCTION_SUB: return createInstruction_sub();
      case LLVM_IRPackage.INSTRUCTION_FSUB: return createInstruction_fsub();
      case LLVM_IRPackage.INSTRUCTION_MUL: return createInstruction_mul();
      case LLVM_IRPackage.INSTRUCTION_FMUL: return createInstruction_fmul();
      case LLVM_IRPackage.INSTRUCTION_UDIV: return createInstruction_udiv();
      case LLVM_IRPackage.INSTRUCTION_SDIV: return createInstruction_sdiv();
      case LLVM_IRPackage.INSTRUCTION_FDIV: return createInstruction_fdiv();
      case LLVM_IRPackage.INSTRUCTION_UREM: return createInstruction_urem();
      case LLVM_IRPackage.INSTRUCTION_SREM: return createInstruction_srem();
      case LLVM_IRPackage.INSTRUCTION_FREM: return createInstruction_frem();
      case LLVM_IRPackage.BITWISE_BINARY_INSTRUCTION: return createBitwiseBinaryInstruction();
      case LLVM_IRPackage.INSTRUCTION_SHL: return createInstruction_shl();
      case LLVM_IRPackage.INSTRUCTION_LSHR: return createInstruction_lshr();
      case LLVM_IRPackage.INSTRUCTION_ASHR: return createInstruction_ashr();
      case LLVM_IRPackage.INSTRUCTION_AND: return createInstruction_and();
      case LLVM_IRPackage.INSTRUCTION_OR: return createInstruction_or();
      case LLVM_IRPackage.INSTRUCTION_XOR: return createInstruction_xor();
      case LLVM_IRPackage.VECTOR_INSTRUCTIONS: return createVectorInstructions();
      case LLVM_IRPackage.INSTRUCTION_EXTRACTELEMENT: return createInstruction_extractelement();
      case LLVM_IRPackage.INSTRUCTION_INSERTELEMENT: return createInstruction_insertelement();
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR: return createInstruction_shufflevector();
      case LLVM_IRPackage.AGGREGATE_INSTRUCTION: return createAggregateInstruction();
      case LLVM_IRPackage.INSTRUCTION_EXTRACTVALUE: return createInstruction_extractvalue();
      case LLVM_IRPackage.INSTRUCTION_INSERTVALUE: return createInstruction_insertvalue();
      case LLVM_IRPackage.MEMORY_INSTRUCTION: return createMemoryInstruction();
      case LLVM_IRPackage.INSTRUCTION_ALLOCA: return createInstruction_alloca();
      case LLVM_IRPackage.INSTRUCTION_LOAD: return createInstruction_load();
      case LLVM_IRPackage.INSTRUCTION_STORE: return createInstruction_store();
      case LLVM_IRPackage.INSTRUCTION_FENCE: return createInstruction_fence();
      case LLVM_IRPackage.INSTRUCTION_CMPXCHG: return createInstruction_cmpxchg();
      case LLVM_IRPackage.INSTRUCTION_ATOMICRMW: return createInstruction_atomicrmw();
      case LLVM_IRPackage.INSTRUCTION_GETELEMENTPTR: return createInstruction_getelementptr();
      case LLVM_IRPackage.CONVERSION_INSTRUCTION: return createConversionInstruction();
      case LLVM_IRPackage.OTHER_INSTRUCTION: return createOtherInstruction();
      case LLVM_IRPackage.INSTRUCTION_ICMP: return createInstruction_icmp();
      case LLVM_IRPackage.INSTRUCTION_FCMP: return createInstruction_fcmp();
      case LLVM_IRPackage.INSTRUCTION_PHI: return createInstruction_phi();
      case LLVM_IRPackage.INSTRUCTION_SELECT: return createInstruction_select();
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID: return createInstruction_call_nonVoid();
      case LLVM_IRPackage.INSTRUCTION_CALL_VOID: return createInstruction_call_void();
      case LLVM_IRPackage.ARG_LIST: return createArgList();
      case LLVM_IRPackage.CALLEE: return createCallee();
      case LLVM_IRPackage.INLINE_ASSEMBLER: return createInlineAssembler();
      case LLVM_IRPackage.INSTRUCTION_VA_ARG: return createInstruction_va_arg();
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD: return createInstruction_landingpad();
      case LLVM_IRPackage.LANDINGPAD_CLAUSE: return createLandingpadClause();
      case LLVM_IRPackage.TYPED_VALUE: return createTypedValue();
      case LLVM_IRPackage.PARAMETER_TYPE: return createParameterType();
      case LLVM_IRPackage.PARAMETER_ATTRIBUTES: return createParameterAttributes();
      case LLVM_IRPackage.ARGUMENT: return createArgument();
      case LLVM_IRPackage.PARAMETER: return createParameter();
      case LLVM_IRPackage.NON_VOID_TYPE: return createNonVoidType();
      case LLVM_IRPackage.STAR: return createStar();
      case LLVM_IRPackage.TYPE: return createType();
      case LLVM_IRPackage.TYPE_SUFFIX: return createTypeSuffix();
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_TYPE: return createNonLeftRecursiveType();
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE: return createNonLeftRecursiveNonVoidType();
      case LLVM_IRPackage.TYPE_DEF: return createTypeDef();
      case LLVM_IRPackage.INT_TYPE: return createIntType();
      case LLVM_IRPackage.OPAQUE_TYPE: return createOpaqueType();
      case LLVM_IRPackage.STRUCT_TYPE: return createStructType();
      case LLVM_IRPackage.VECTOR_TYPE: return createVectorType();
      case LLVM_IRPackage.ARRAY_TYPE: return createArrayType();
      case LLVM_IRPackage.X8_6MMX_TYPE: return createX86mmxType();
      case LLVM_IRPackage.VOID_TYPE: return createVoidType();
      case LLVM_IRPackage.METADATA_TYPE: return createMetadataType();
      case LLVM_IRPackage.FLOATING_TYPE: return createFloatingType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelElement createTopLevelElement()
  {
    TopLevelElementImpl topLevelElement = new TopLevelElementImpl();
    return topLevelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeGroup createAttributeGroup()
  {
    AttributeGroupImpl attributeGroup = new AttributeGroupImpl();
    return attributeGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedMetadata createNamedMetadata()
  {
    NamedMetadataImpl namedMetadata = new NamedMetadataImpl();
    return namedMetadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataRef createMetadataRef()
  {
    MetadataRefImpl metadataRef = new MetadataRefImpl();
    return metadataRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueRef createValueRef()
  {
    ValueRefImpl valueRef = new ValueRefImpl();
    return valueRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalValueRef createGlobalValueRef()
  {
    GlobalValueRefImpl globalValueRef = new GlobalValueRefImpl();
    return globalValueRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalValueRef createLocalValueRef()
  {
    LocalValueRefImpl localValueRef = new LocalValueRefImpl();
    return localValueRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalValue createGlobalValue()
  {
    GlobalValueImpl globalValue = new GlobalValueImpl();
    return globalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalValueDef createGlobalValueDef()
  {
    GlobalValueDefImpl globalValueDef = new GlobalValueDefImpl();
    return globalValueDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalValue createLocalValue()
  {
    LocalValueImpl localValue = new LocalValueImpl();
    return localValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedInstruction createNamedInstruction()
  {
    NamedInstructionImpl namedInstruction = new NamedInstructionImpl();
    return namedInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alias createAlias()
  {
    AliasImpl alias = new AliasImpl();
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aliasee createAliasee()
  {
    AliaseeImpl aliasee = new AliaseeImpl();
    return aliasee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetInfo createTargetInfo()
  {
    TargetInfoImpl targetInfo = new TargetInfoImpl();
    return targetInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InlineAsm createInlineAsm()
  {
    InlineAsmImpl inlineAsm = new InlineAsmImpl();
    return inlineAsm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalVariable createGlobalVariable()
  {
    GlobalVariableImpl globalVariable = new GlobalVariableImpl();
    return globalVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression createConstantExpression()
  {
    ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
    return constantExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_convert createConstantExpression_convert()
  {
    ConstantExpression_convertImpl constantExpression_convert = new ConstantExpression_convertImpl();
    return constantExpression_convert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_getelementptr createConstantExpression_getelementptr()
  {
    ConstantExpression_getelementptrImpl constantExpression_getelementptr = new ConstantExpression_getelementptrImpl();
    return constantExpression_getelementptr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_select createConstantExpression_select()
  {
    ConstantExpression_selectImpl constantExpression_select = new ConstantExpression_selectImpl();
    return constantExpression_select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_compare createConstantExpression_compare()
  {
    ConstantExpression_compareImpl constantExpression_compare = new ConstantExpression_compareImpl();
    return constantExpression_compare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_extractelement createConstantExpression_extractelement()
  {
    ConstantExpression_extractelementImpl constantExpression_extractelement = new ConstantExpression_extractelementImpl();
    return constantExpression_extractelement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_insertelement createConstantExpression_insertelement()
  {
    ConstantExpression_insertelementImpl constantExpression_insertelement = new ConstantExpression_insertelementImpl();
    return constantExpression_insertelement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_shufflevector createConstantExpression_shufflevector()
  {
    ConstantExpression_shufflevectorImpl constantExpression_shufflevector = new ConstantExpression_shufflevectorImpl();
    return constantExpression_shufflevector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_extractvalue createConstantExpression_extractvalue()
  {
    ConstantExpression_extractvalueImpl constantExpression_extractvalue = new ConstantExpression_extractvalueImpl();
    return constantExpression_extractvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_insertvalue createConstantExpression_insertvalue()
  {
    ConstantExpression_insertvalueImpl constantExpression_insertvalue = new ConstantExpression_insertvalueImpl();
    return constantExpression_insertvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_binary createConstantExpression_binary()
  {
    ConstantExpression_binaryImpl constantExpression_binary = new ConstantExpression_binaryImpl();
    return constantExpression_binary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Undef createUndef()
  {
    UndefImpl undef = new UndefImpl();
    return undef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockAddress createBlockAddress()
  {
    BlockAddressImpl blockAddress = new BlockAddressImpl();
    return blockAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ZeroInitializer createZeroInitializer()
  {
    ZeroInitializerImpl zeroInitializer = new ZeroInitializerImpl();
    return zeroInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureConstant createStructureConstant()
  {
    StructureConstantImpl structureConstant = new StructureConstantImpl();
    return structureConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayConstant createArrayConstant()
  {
    ArrayConstantImpl arrayConstant = new ArrayConstantImpl();
    return arrayConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VectorConstant createVectorConstant()
  {
    VectorConstantImpl vectorConstant = new VectorConstantImpl();
    return vectorConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantList createConstantList()
  {
    ConstantListImpl constantList = new ConstantListImpl();
    return constantList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedConstant createTypedConstant()
  {
    TypedConstantImpl typedConstant = new TypedConstantImpl();
    return typedConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleConstant createSimpleConstant()
  {
    SimpleConstantImpl simpleConstant = new SimpleConstantImpl();
    return simpleConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataNode createMetadataNode()
  {
    MetadataNodeImpl metadataNode = new MetadataNodeImpl();
    return metadataNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataNodeElement createMetadataNodeElement()
  {
    MetadataNodeElementImpl metadataNodeElement = new MetadataNodeElementImpl();
    return metadataNodeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataString createMetadataString()
  {
    MetadataStringImpl metadataString = new MetadataStringImpl();
    return metadataString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressSpace createAddressSpace()
  {
    AddressSpaceImpl addressSpace = new AddressSpaceImpl();
    return addressSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDef createFunctionDef()
  {
    FunctionDefImpl functionDef = new FunctionDefImpl();
    return functionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDecl createFunctionDecl()
  {
    FunctionDeclImpl functionDecl = new FunctionDeclImpl();
    return functionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionHeader createFunctionHeader()
  {
    FunctionHeaderImpl functionHeader = new FunctionHeaderImpl();
    return functionHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters createParameters()
  {
    ParametersImpl parameters = new ParametersImpl();
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionAttributes createFunctionAttributes()
  {
    FunctionAttributesImpl functionAttributes = new FunctionAttributesImpl();
    return functionAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignStack createAlignStack()
  {
    AlignStackImpl alignStack = new AlignStackImpl();
    return alignStack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionAttribute createFunctionAttribute()
  {
    FunctionAttributeImpl functionAttribute = new FunctionAttributeImpl();
    return functionAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicBlock createBasicBlock()
  {
    BasicBlockImpl basicBlock = new BasicBlockImpl();
    return basicBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataSuffix createMetadataSuffix()
  {
    MetadataSuffixImpl metadataSuffix = new MetadataSuffixImpl();
    return metadataSuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartingInstruction createStartingInstruction()
  {
    StartingInstructionImpl startingInstruction = new StartingInstructionImpl();
    return startingInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiddleInstruction createMiddleInstruction()
  {
    MiddleInstructionImpl middleInstruction = new MiddleInstructionImpl();
    return middleInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedMiddleInstruction createNamedMiddleInstruction()
  {
    NamedMiddleInstructionImpl namedMiddleInstruction = new NamedMiddleInstructionImpl();
    return namedMiddleInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminatorInstruction createTerminatorInstruction()
  {
    TerminatorInstructionImpl terminatorInstruction = new TerminatorInstructionImpl();
    return terminatorInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedTerminatorInstruction createNamedTerminatorInstruction()
  {
    NamedTerminatorInstructionImpl namedTerminatorInstruction = new NamedTerminatorInstructionImpl();
    return namedTerminatorInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_ret createInstruction_ret()
  {
    Instruction_retImpl instruction_ret = new Instruction_retImpl();
    return instruction_ret;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_br createInstruction_br()
  {
    Instruction_brImpl instruction_br = new Instruction_brImpl();
    return instruction_br;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_switch createInstruction_switch()
  {
    Instruction_switchImpl instruction_switch = new Instruction_switchImpl();
    return instruction_switch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_indirectbr createInstruction_indirectbr()
  {
    Instruction_indirectbrImpl instruction_indirectbr = new Instruction_indirectbrImpl();
    return instruction_indirectbr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_invoke_void createInstruction_invoke_void()
  {
    Instruction_invoke_voidImpl instruction_invoke_void = new Instruction_invoke_voidImpl();
    return instruction_invoke_void;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_invoke_nonVoid createInstruction_invoke_nonVoid()
  {
    Instruction_invoke_nonVoidImpl instruction_invoke_nonVoid = new Instruction_invoke_nonVoidImpl();
    return instruction_invoke_nonVoid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_resume createInstruction_resume()
  {
    Instruction_resumeImpl instruction_resume = new Instruction_resumeImpl();
    return instruction_resume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_unreachable createInstruction_unreachable()
  {
    Instruction_unreachableImpl instruction_unreachable = new Instruction_unreachableImpl();
    return instruction_unreachable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicBlockRef createBasicBlockRef()
  {
    BasicBlockRefImpl basicBlockRef = new BasicBlockRefImpl();
    return basicBlockRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryInstruction createBinaryInstruction()
  {
    BinaryInstructionImpl binaryInstruction = new BinaryInstructionImpl();
    return binaryInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_add createInstruction_add()
  {
    Instruction_addImpl instruction_add = new Instruction_addImpl();
    return instruction_add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_fadd createInstruction_fadd()
  {
    Instruction_faddImpl instruction_fadd = new Instruction_faddImpl();
    return instruction_fadd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_sub createInstruction_sub()
  {
    Instruction_subImpl instruction_sub = new Instruction_subImpl();
    return instruction_sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_fsub createInstruction_fsub()
  {
    Instruction_fsubImpl instruction_fsub = new Instruction_fsubImpl();
    return instruction_fsub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_mul createInstruction_mul()
  {
    Instruction_mulImpl instruction_mul = new Instruction_mulImpl();
    return instruction_mul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_fmul createInstruction_fmul()
  {
    Instruction_fmulImpl instruction_fmul = new Instruction_fmulImpl();
    return instruction_fmul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_udiv createInstruction_udiv()
  {
    Instruction_udivImpl instruction_udiv = new Instruction_udivImpl();
    return instruction_udiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_sdiv createInstruction_sdiv()
  {
    Instruction_sdivImpl instruction_sdiv = new Instruction_sdivImpl();
    return instruction_sdiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_fdiv createInstruction_fdiv()
  {
    Instruction_fdivImpl instruction_fdiv = new Instruction_fdivImpl();
    return instruction_fdiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_urem createInstruction_urem()
  {
    Instruction_uremImpl instruction_urem = new Instruction_uremImpl();
    return instruction_urem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_srem createInstruction_srem()
  {
    Instruction_sremImpl instruction_srem = new Instruction_sremImpl();
    return instruction_srem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_frem createInstruction_frem()
  {
    Instruction_fremImpl instruction_frem = new Instruction_fremImpl();
    return instruction_frem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitwiseBinaryInstruction createBitwiseBinaryInstruction()
  {
    BitwiseBinaryInstructionImpl bitwiseBinaryInstruction = new BitwiseBinaryInstructionImpl();
    return bitwiseBinaryInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_shl createInstruction_shl()
  {
    Instruction_shlImpl instruction_shl = new Instruction_shlImpl();
    return instruction_shl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_lshr createInstruction_lshr()
  {
    Instruction_lshrImpl instruction_lshr = new Instruction_lshrImpl();
    return instruction_lshr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_ashr createInstruction_ashr()
  {
    Instruction_ashrImpl instruction_ashr = new Instruction_ashrImpl();
    return instruction_ashr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_and createInstruction_and()
  {
    Instruction_andImpl instruction_and = new Instruction_andImpl();
    return instruction_and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_or createInstruction_or()
  {
    Instruction_orImpl instruction_or = new Instruction_orImpl();
    return instruction_or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_xor createInstruction_xor()
  {
    Instruction_xorImpl instruction_xor = new Instruction_xorImpl();
    return instruction_xor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VectorInstructions createVectorInstructions()
  {
    VectorInstructionsImpl vectorInstructions = new VectorInstructionsImpl();
    return vectorInstructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_extractelement createInstruction_extractelement()
  {
    Instruction_extractelementImpl instruction_extractelement = new Instruction_extractelementImpl();
    return instruction_extractelement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_insertelement createInstruction_insertelement()
  {
    Instruction_insertelementImpl instruction_insertelement = new Instruction_insertelementImpl();
    return instruction_insertelement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_shufflevector createInstruction_shufflevector()
  {
    Instruction_shufflevectorImpl instruction_shufflevector = new Instruction_shufflevectorImpl();
    return instruction_shufflevector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregateInstruction createAggregateInstruction()
  {
    AggregateInstructionImpl aggregateInstruction = new AggregateInstructionImpl();
    return aggregateInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_extractvalue createInstruction_extractvalue()
  {
    Instruction_extractvalueImpl instruction_extractvalue = new Instruction_extractvalueImpl();
    return instruction_extractvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_insertvalue createInstruction_insertvalue()
  {
    Instruction_insertvalueImpl instruction_insertvalue = new Instruction_insertvalueImpl();
    return instruction_insertvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemoryInstruction createMemoryInstruction()
  {
    MemoryInstructionImpl memoryInstruction = new MemoryInstructionImpl();
    return memoryInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_alloca createInstruction_alloca()
  {
    Instruction_allocaImpl instruction_alloca = new Instruction_allocaImpl();
    return instruction_alloca;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_load createInstruction_load()
  {
    Instruction_loadImpl instruction_load = new Instruction_loadImpl();
    return instruction_load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_store createInstruction_store()
  {
    Instruction_storeImpl instruction_store = new Instruction_storeImpl();
    return instruction_store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_fence createInstruction_fence()
  {
    Instruction_fenceImpl instruction_fence = new Instruction_fenceImpl();
    return instruction_fence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_cmpxchg createInstruction_cmpxchg()
  {
    Instruction_cmpxchgImpl instruction_cmpxchg = new Instruction_cmpxchgImpl();
    return instruction_cmpxchg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_atomicrmw createInstruction_atomicrmw()
  {
    Instruction_atomicrmwImpl instruction_atomicrmw = new Instruction_atomicrmwImpl();
    return instruction_atomicrmw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_getelementptr createInstruction_getelementptr()
  {
    Instruction_getelementptrImpl instruction_getelementptr = new Instruction_getelementptrImpl();
    return instruction_getelementptr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConversionInstruction createConversionInstruction()
  {
    ConversionInstructionImpl conversionInstruction = new ConversionInstructionImpl();
    return conversionInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherInstruction createOtherInstruction()
  {
    OtherInstructionImpl otherInstruction = new OtherInstructionImpl();
    return otherInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_icmp createInstruction_icmp()
  {
    Instruction_icmpImpl instruction_icmp = new Instruction_icmpImpl();
    return instruction_icmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_fcmp createInstruction_fcmp()
  {
    Instruction_fcmpImpl instruction_fcmp = new Instruction_fcmpImpl();
    return instruction_fcmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_phi createInstruction_phi()
  {
    Instruction_phiImpl instruction_phi = new Instruction_phiImpl();
    return instruction_phi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_select createInstruction_select()
  {
    Instruction_selectImpl instruction_select = new Instruction_selectImpl();
    return instruction_select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_call_nonVoid createInstruction_call_nonVoid()
  {
    Instruction_call_nonVoidImpl instruction_call_nonVoid = new Instruction_call_nonVoidImpl();
    return instruction_call_nonVoid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_call_void createInstruction_call_void()
  {
    Instruction_call_voidImpl instruction_call_void = new Instruction_call_voidImpl();
    return instruction_call_void;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgList createArgList()
  {
    ArgListImpl argList = new ArgListImpl();
    return argList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Callee createCallee()
  {
    CalleeImpl callee = new CalleeImpl();
    return callee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InlineAssembler createInlineAssembler()
  {
    InlineAssemblerImpl inlineAssembler = new InlineAssemblerImpl();
    return inlineAssembler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_va_arg createInstruction_va_arg()
  {
    Instruction_va_argImpl instruction_va_arg = new Instruction_va_argImpl();
    return instruction_va_arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction_landingpad createInstruction_landingpad()
  {
    Instruction_landingpadImpl instruction_landingpad = new Instruction_landingpadImpl();
    return instruction_landingpad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LandingpadClause createLandingpadClause()
  {
    LandingpadClauseImpl landingpadClause = new LandingpadClauseImpl();
    return landingpadClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue createTypedValue()
  {
    TypedValueImpl typedValue = new TypedValueImpl();
    return typedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType createParameterType()
  {
    ParameterTypeImpl parameterType = new ParameterTypeImpl();
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterAttributes createParameterAttributes()
  {
    ParameterAttributesImpl parameterAttributes = new ParameterAttributesImpl();
    return parameterAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonVoidType createNonVoidType()
  {
    NonVoidTypeImpl nonVoidType = new NonVoidTypeImpl();
    return nonVoidType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Star createStar()
  {
    StarImpl star = new StarImpl();
    return star;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSuffix createTypeSuffix()
  {
    TypeSuffixImpl typeSuffix = new TypeSuffixImpl();
    return typeSuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonLeftRecursiveType createNonLeftRecursiveType()
  {
    NonLeftRecursiveTypeImpl nonLeftRecursiveType = new NonLeftRecursiveTypeImpl();
    return nonLeftRecursiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonLeftRecursiveNonVoidType createNonLeftRecursiveNonVoidType()
  {
    NonLeftRecursiveNonVoidTypeImpl nonLeftRecursiveNonVoidType = new NonLeftRecursiveNonVoidTypeImpl();
    return nonLeftRecursiveNonVoidType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpaqueType createOpaqueType()
  {
    OpaqueTypeImpl opaqueType = new OpaqueTypeImpl();
    return opaqueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructType createStructType()
  {
    StructTypeImpl structType = new StructTypeImpl();
    return structType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VectorType createVectorType()
  {
    VectorTypeImpl vectorType = new VectorTypeImpl();
    return vectorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public X86mmxType createX86mmxType()
  {
    X86mmxTypeImpl x86mmxType = new X86mmxTypeImpl();
    return x86mmxType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidType createVoidType()
  {
    VoidTypeImpl voidType = new VoidTypeImpl();
    return voidType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataType createMetadataType()
  {
    MetadataTypeImpl metadataType = new MetadataTypeImpl();
    return metadataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatingType createFloatingType()
  {
    FloatingTypeImpl floatingType = new FloatingTypeImpl();
    return floatingType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVM_IRPackage getLLVM_IRPackage()
  {
    return (LLVM_IRPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LLVM_IRPackage getPackage()
  {
    return LLVM_IRPackage.eINSTANCE;
  }

} //LLVM_IRFactoryImpl
