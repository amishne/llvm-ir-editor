/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRFactory
 * @model kind="package"
 * @generated
 */
public interface LLVM_IRPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lLVM_IR";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.intel.com/llvm/ireditor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lLVM_IR";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LLVM_IRPackage eINSTANCE = com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl.init();

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ModelImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.TopLevelElementImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTopLevelElement()
   * @generated
   */
  int TOP_LEVEL_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Top Level Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.AttributeGroupImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAttributeGroup()
   * @generated
   */
  int ATTRIBUTE_GROUP = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_GROUP__NAME = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_GROUP__ATTRIBUTES = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alignstack</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_GROUP__ALIGNSTACK = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Alignstack Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_GROUP__ALIGNSTACK_VALUE = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Target Specific Attributes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_GROUP__TARGET_SPECIFIC_ATTRIBUTES = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Attribute Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_GROUP_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedMetadataImpl <em>Named Metadata</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.NamedMetadataImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNamedMetadata()
   * @generated
   */
  int NAMED_METADATA = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_METADATA__NAME = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_METADATA__NODE = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Named Metadata</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_METADATA_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataRefImpl <em>Metadata Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataRefImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataRef()
   * @generated
   */
  int METADATA_REF = 4;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_REF__REF = 0;

  /**
   * The number of structural features of the '<em>Metadata Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.CalleeImpl <em>Callee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.CalleeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getCallee()
   * @generated
   */
  int CALLEE = 111;

  /**
   * The number of structural features of the '<em>Callee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLEE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ValueRefImpl <em>Value Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ValueRefImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getValueRef()
   * @generated
   */
  int VALUE_REF = 5;

  /**
   * The number of structural features of the '<em>Value Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_REF_FEATURE_COUNT = CALLEE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueRefImpl <em>Global Value Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueRefImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getGlobalValueRef()
   * @generated
   */
  int GLOBAL_VALUE_REF = 6;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VALUE_REF__CONSTANT = VALUE_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VALUE_REF__METADATA = VALUE_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Global Value Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VALUE_REF_FEATURE_COUNT = VALUE_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.LocalValueRefImpl <em>Local Value Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LocalValueRefImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getLocalValueRef()
   * @generated
   */
  int LOCAL_VALUE_REF = 7;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE_REF__REF = VALUE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Value Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE_REF_FEATURE_COUNT = VALUE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueImpl <em>Global Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getGlobalValue()
   * @generated
   */
  int GLOBAL_VALUE = 8;

  /**
   * The number of structural features of the '<em>Global Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VALUE_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueDefImpl <em>Global Value Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueDefImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getGlobalValueDef()
   * @generated
   */
  int GLOBAL_VALUE_DEF = 9;

  /**
   * The number of structural features of the '<em>Global Value Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VALUE_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.LocalValueImpl <em>Local Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LocalValueImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getLocalValue()
   * @generated
   */
  int LOCAL_VALUE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Local Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedInstructionImpl <em>Named Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.NamedInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNamedInstruction()
   * @generated
   */
  int NAMED_INSTRUCTION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INSTRUCTION__NAME = LOCAL_VALUE__NAME;

  /**
   * The number of structural features of the '<em>Named Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INSTRUCTION_FEATURE_COUNT = LOCAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.InstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 12;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__METADATA = 0;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliasImpl <em>Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.AliasImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAlias()
   * @generated
   */
  int ALIAS = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__NAME = GLOBAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Linkage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__LINKAGE = GLOBAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__VISIBILITY = GLOBAL_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__TYPE = GLOBAL_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Aliasee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__ALIASEE = GLOBAL_VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_FEATURE_COUNT = GLOBAL_VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliaseeImpl <em>Aliasee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.AliaseeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAliasee()
   * @generated
   */
  int ALIASEE = 14;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASEE__REF = 0;

  /**
   * The feature id for the '<em><b>Bitcast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASEE__BITCAST = 1;

  /**
   * The number of structural features of the '<em>Aliasee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASEE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TargetInfoImpl <em>Target Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.TargetInfoImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTargetInfo()
   * @generated
   */
  int TARGET_INFO = 15;

  /**
   * The feature id for the '<em><b>Info Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_INFO__INFO_TYPE = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_INFO__LAYOUT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Target Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_INFO_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.InlineAsmImpl <em>Inline Asm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.InlineAsmImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInlineAsm()
   * @generated
   */
  int INLINE_ASM = 16;

  /**
   * The feature id for the '<em><b>Asm Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_ASM__ASM_LINE = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inline Asm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_ASM_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getGlobalVariable()
   * @generated
   */
  int GLOBAL_VARIABLE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE__NAME = GLOBAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Linkage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE__LINKAGE = GLOBAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Addrspace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE__ADDRSPACE = GLOBAL_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tls Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE__TLS_MODEL = GLOBAL_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE__TYPE = GLOBAL_VALUE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE__INITIAL_VALUE = GLOBAL_VALUE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Section</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE__SECTION = GLOBAL_VALUE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE__ALIGN = GLOBAL_VALUE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Global Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE_FEATURE_COUNT = GLOBAL_VALUE_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 18;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__REF = 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpressionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression()
   * @generated
   */
  int CONSTANT_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION__REF = CONSTANT__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION__OPCODE = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_convertImpl <em>Constant Expression convert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_convertImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_convert()
   * @generated
   */
  int CONSTANT_EXPRESSION_CONVERT = 20;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_CONVERT__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_CONVERT__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>From Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_CONVERT__FROM_TYPE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_CONVERT__CONSTANT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constant Expression convert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_CONVERT_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_getelementptrImpl <em>Constant Expression getelementptr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_getelementptrImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_getelementptr()
   * @generated
   */
  int CONSTANT_EXPRESSION_GETELEMENTPTR = 21;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_GETELEMENTPTR__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_GETELEMENTPTR__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>Constant Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Index Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_GETELEMENTPTR__INDEX_TYPES = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_GETELEMENTPTR__INDICES = CONSTANT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Constant Expression getelementptr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_GETELEMENTPTR_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_selectImpl <em>Constant Expression select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_selectImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_select()
   * @generated
   */
  int CONSTANT_EXPRESSION_SELECT = 22;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SELECT__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SELECT__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SELECT__CONDITION = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SELECT__OP1 = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SELECT__OP2 = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constant Expression select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SELECT_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_compareImpl <em>Constant Expression compare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_compareImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_compare()
   * @generated
   */
  int CONSTANT_EXPRESSION_COMPARE = 23;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_COMPARE__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_COMPARE__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_COMPARE__CONDITION = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_COMPARE__OP1 = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_COMPARE__OP2 = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constant Expression compare</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_COMPARE_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractelementImpl <em>Constant Expression extractelement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractelementImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_extractelement()
   * @generated
   */
  int CONSTANT_EXPRESSION_EXTRACTELEMENT = 24;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTELEMENT__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTELEMENT__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Expression extractelement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTELEMENT_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertelementImpl <em>Constant Expression insertelement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertelementImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_insertelement()
   * @generated
   */
  int CONSTANT_EXPRESSION_INSERTELEMENT = 25;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTELEMENT__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTELEMENT__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>Vector Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTELEMENT__INDEX = CONSTANT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Constant Expression insertelement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTELEMENT_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_shufflevectorImpl <em>Constant Expression shufflevector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_shufflevectorImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_shufflevector()
   * @generated
   */
  int CONSTANT_EXPRESSION_SHUFFLEVECTOR = 26;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SHUFFLEVECTOR__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SHUFFLEVECTOR__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>Vector1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SHUFFLEVECTOR__VECTOR1 = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vector2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SHUFFLEVECTOR__VECTOR2 = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SHUFFLEVECTOR__MASK = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constant Expression shufflevector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_SHUFFLEVECTOR_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractvalueImpl <em>Constant Expression extractvalue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractvalueImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_extractvalue()
   * @generated
   */
  int CONSTANT_EXPRESSION_EXTRACTVALUE = 27;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTVALUE__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTVALUE__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTVALUE__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Indices</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTVALUE__INDICES = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Expression extractvalue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_EXTRACTVALUE_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertvalueImpl <em>Constant Expression insertvalue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertvalueImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_insertvalue()
   * @generated
   */
  int CONSTANT_EXPRESSION_INSERTVALUE = 28;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTVALUE__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTVALUE__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTVALUE__VALUE = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Indices</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTVALUE__INDICES = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constant Expression insertvalue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_INSERTVALUE_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_binaryImpl <em>Constant Expression binary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_binaryImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_binary()
   * @generated
   */
  int CONSTANT_EXPRESSION_BINARY = 29;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_BINARY__REF = CONSTANT_EXPRESSION__REF;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_BINARY__OPCODE = CONSTANT_EXPRESSION__OPCODE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_BINARY__OP1 = CONSTANT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_BINARY__OP2 = CONSTANT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Expression binary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_EXPRESSION_BINARY_FEATURE_COUNT = CONSTANT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.UndefImpl <em>Undef</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.UndefImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getUndef()
   * @generated
   */
  int UNDEF = 30;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEF__REF = CONSTANT__REF;

  /**
   * The number of structural features of the '<em>Undef</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDEF_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BlockAddressImpl <em>Block Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.BlockAddressImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBlockAddress()
   * @generated
   */
  int BLOCK_ADDRESS = 31;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ADDRESS__REF = CONSTANT__REF;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ADDRESS__FUNCTION = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Basic Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ADDRESS__BASIC_BLOCK = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Block Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ADDRESS_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ZeroInitializerImpl <em>Zero Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ZeroInitializerImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getZeroInitializer()
   * @generated
   */
  int ZERO_INITIALIZER = 32;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZERO_INITIALIZER__REF = CONSTANT__REF;

  /**
   * The number of structural features of the '<em>Zero Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZERO_INITIALIZER_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.StructureConstantImpl <em>Structure Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.StructureConstantImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getStructureConstant()
   * @generated
   */
  int STRUCTURE_CONSTANT = 33;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_CONSTANT__REF = CONSTANT__REF;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_CONSTANT__LIST = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Packed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_CONSTANT__PACKED = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Structure Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ArrayConstantImpl <em>Array Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ArrayConstantImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getArrayConstant()
   * @generated
   */
  int ARRAY_CONSTANT = 34;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONSTANT__REF = CONSTANT__REF;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONSTANT__LIST = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.VectorConstantImpl <em>Vector Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.VectorConstantImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getVectorConstant()
   * @generated
   */
  int VECTOR_CONSTANT = 35;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_CONSTANT__REF = CONSTANT__REF;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_CONSTANT__LIST = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Vector Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantListImpl <em>Constant List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantListImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantList()
   * @generated
   */
  int CONSTANT_LIST = 36;

  /**
   * The feature id for the '<em><b>Typed Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_LIST__TYPED_CONSTANTS = 0;

  /**
   * The number of structural features of the '<em>Constant List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypedConstantImpl <em>Typed Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypedConstantImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTypedConstant()
   * @generated
   */
  int TYPED_CONSTANT = 37;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_CONSTANT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_CONSTANT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Typed Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_CONSTANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.SimpleConstantImpl <em>Simple Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.SimpleConstantImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getSimpleConstant()
   * @generated
   */
  int SIMPLE_CONSTANT = 38;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CONSTANT__REF = CONSTANT__REF;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeImpl <em>Metadata Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataNode()
   * @generated
   */
  int METADATA_NODE = 39;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_NODE__REF = CONSTANT__REF;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_NODE__ELEMENTS = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Metadata Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_NODE_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeElementImpl <em>Metadata Node Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeElementImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataNodeElement()
   * @generated
   */
  int METADATA_NODE_ELEMENT = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_NODE_ELEMENT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Metadata Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_NODE_ELEMENT__METADATA_REF = 1;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_NODE_ELEMENT__NULL = 2;

  /**
   * The number of structural features of the '<em>Metadata Node Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_NODE_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataStringImpl <em>Metadata String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataStringImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataString()
   * @generated
   */
  int METADATA_STRING = 41;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_STRING__REF = CONSTANT__REF;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_STRING__NAME = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Metadata String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_STRING_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AddressSpaceImpl <em>Address Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.AddressSpaceImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAddressSpace()
   * @generated
   */
  int ADDRESS_SPACE = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_SPACE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Address Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_SPACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 43;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__HEADER = GLOBAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = GLOBAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionDefImpl <em>Function Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionDefImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionDef()
   * @generated
   */
  int FUNCTION_DEF = 44;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__HEADER = FUNCTION__HEADER;

  /**
   * The feature id for the '<em><b>Basic Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__BASIC_BLOCKS = FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionDeclImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionDecl()
   * @generated
   */
  int FUNCTION_DECL = 45;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__HEADER = FUNCTION__HEADER;

  /**
   * The number of structural features of the '<em>Function Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl <em>Function Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionHeader()
   * @generated
   */
  int FUNCTION_HEADER = 46;

  /**
   * The feature id for the '<em><b>Linkage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__LINKAGE = GLOBAL_VALUE_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__VISIBILITY = GLOBAL_VALUE_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cconv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__CCONV = GLOBAL_VALUE_DEF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rettype Attrs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__RETTYPE_ATTRS = GLOBAL_VALUE_DEF_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rettype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__RETTYPE = GLOBAL_VALUE_DEF_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__NAME = GLOBAL_VALUE_DEF_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__PARAMETERS = GLOBAL_VALUE_DEF_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__ATTRS = GLOBAL_VALUE_DEF_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Section</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__SECTION = GLOBAL_VALUE_DEF_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__ALIGN = GLOBAL_VALUE_DEF_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Gc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__GC = GLOBAL_VALUE_DEF_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Function Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER_FEATURE_COUNT = GLOBAL_VALUE_DEF_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ParametersImpl <em>Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ParametersImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getParameters()
   * @generated
   */
  int PARAMETERS = 47;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Vararg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__VARARG = 1;

  /**
   * The number of structural features of the '<em>Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributesImpl <em>Function Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributesImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionAttributes()
   * @generated
   */
  int FUNCTION_ATTRIBUTES = 48;

  /**
   * The feature id for the '<em><b>Function Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTES = 0;

  /**
   * The feature id for the '<em><b>Alignstack</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ATTRIBUTES__ALIGNSTACK = 1;

  /**
   * The feature id for the '<em><b>Alignstack Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ATTRIBUTES__ALIGNSTACK_VALUE = 2;

  /**
   * The feature id for the '<em><b>Function Attribute Group Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTE_GROUP_REFS = 3;

  /**
   * The number of structural features of the '<em>Function Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ATTRIBUTES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AlignStackImpl <em>Align Stack</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.AlignStackImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAlignStack()
   * @generated
   */
  int ALIGN_STACK = 49;

  /**
   * The number of structural features of the '<em>Align Stack</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIGN_STACK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributeImpl <em>Function Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionAttribute()
   * @generated
   */
  int FUNCTION_ATTRIBUTE = 50;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ATTRIBUTE__ATTRIBUTE = 0;

  /**
   * The number of structural features of the '<em>Function Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BasicBlockImpl <em>Basic Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.BasicBlockImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBasicBlock()
   * @generated
   */
  int BASIC_BLOCK = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_BLOCK__INSTRUCTIONS = 1;

  /**
   * The number of structural features of the '<em>Basic Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataSuffixImpl <em>Metadata Suffix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataSuffixImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataSuffix()
   * @generated
   */
  int METADATA_SUFFIX = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_SUFFIX__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_SUFFIX__VALUE = 1;

  /**
   * The number of structural features of the '<em>Metadata Suffix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_SUFFIX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.StartingInstructionImpl <em>Starting Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.StartingInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getStartingInstruction()
   * @generated
   */
  int STARTING_INSTRUCTION = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STARTING_INSTRUCTION__NAME = NAMED_INSTRUCTION__NAME;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STARTING_INSTRUCTION__METADATA = NAMED_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STARTING_INSTRUCTION__INSTRUCTION = NAMED_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Starting Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STARTING_INSTRUCTION_FEATURE_COUNT = NAMED_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MiddleInstructionImpl <em>Middle Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.MiddleInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMiddleInstruction()
   * @generated
   */
  int MIDDLE_INSTRUCTION = 54;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDDLE_INSTRUCTION__METADATA = INSTRUCTION__METADATA;

  /**
   * The feature id for the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDDLE_INSTRUCTION__INSTRUCTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Middle Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDDLE_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedMiddleInstructionImpl <em>Named Middle Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.NamedMiddleInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNamedMiddleInstruction()
   * @generated
   */
  int NAMED_MIDDLE_INSTRUCTION = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_MIDDLE_INSTRUCTION__NAME = NAMED_INSTRUCTION__NAME;

  /**
   * The feature id for the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_MIDDLE_INSTRUCTION__INSTRUCTION = NAMED_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Middle Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_MIDDLE_INSTRUCTION_FEATURE_COUNT = NAMED_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TerminatorInstructionImpl <em>Terminator Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.TerminatorInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTerminatorInstruction()
   * @generated
   */
  int TERMINATOR_INSTRUCTION = 56;

  /**
   * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINATOR_INSTRUCTION__METADATA = INSTRUCTION__METADATA;

  /**
   * The feature id for the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINATOR_INSTRUCTION__INSTRUCTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Terminator Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINATOR_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedTerminatorInstructionImpl <em>Named Terminator Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.NamedTerminatorInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNamedTerminatorInstruction()
   * @generated
   */
  int NAMED_TERMINATOR_INSTRUCTION = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TERMINATOR_INSTRUCTION__NAME = NAMED_INSTRUCTION__NAME;

  /**
   * The feature id for the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TERMINATOR_INSTRUCTION__INSTRUCTION = NAMED_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Terminator Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TERMINATOR_INSTRUCTION_FEATURE_COUNT = NAMED_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_retImpl <em>Instruction ret</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_retImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_ret()
   * @generated
   */
  int INSTRUCTION_RET = 58;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_RET__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_RET__VAL = 1;

  /**
   * The number of structural features of the '<em>Instruction ret</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_RET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_brImpl <em>Instruction br</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_brImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_br()
   * @generated
   */
  int INSTRUCTION_BR = 59;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_BR__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_BR__CONDITION = 1;

  /**
   * The feature id for the '<em><b>True</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_BR__TRUE = 2;

  /**
   * The feature id for the '<em><b>False</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_BR__FALSE = 3;

  /**
   * The feature id for the '<em><b>Unconditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_BR__UNCONDITIONAL = 4;

  /**
   * The number of structural features of the '<em>Instruction br</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_BR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_switchImpl <em>Instruction switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_switchImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_switch()
   * @generated
   */
  int INSTRUCTION_SWITCH = 60;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SWITCH__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Comparison Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SWITCH__COMPARISON_VALUE = 1;

  /**
   * The feature id for the '<em><b>Default Dest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SWITCH__DEFAULT_DEST = 2;

  /**
   * The feature id for the '<em><b>Case Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SWITCH__CASE_CONDITIONS = 3;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SWITCH__DESTINATIONS = 4;

  /**
   * The number of structural features of the '<em>Instruction switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SWITCH_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_indirectbrImpl <em>Instruction indirectbr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_indirectbrImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_indirectbr()
   * @generated
   */
  int INSTRUCTION_INDIRECTBR = 61;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INDIRECTBR__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INDIRECTBR__ADDRESS = 1;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INDIRECTBR__DESTINATIONS = 2;

  /**
   * The number of structural features of the '<em>Instruction indirectbr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INDIRECTBR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invoke_voidImpl <em>Instruction invoke void</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invoke_voidImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_invoke_void()
   * @generated
   */
  int INSTRUCTION_INVOKE_VOID = 62;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_VOID__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Cconv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_VOID__CCONV = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_VOID__TYPE = 2;

  /**
   * The feature id for the '<em><b>Callee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_VOID__CALLEE = 3;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_VOID__ARGS = 4;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_VOID__ATTRIBUTES = 5;

  /**
   * The feature id for the '<em><b>To Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_VOID__TO_LABEL = 6;

  /**
   * The feature id for the '<em><b>Exception Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_VOID__EXCEPTION_LABEL = 7;

  /**
   * The number of structural features of the '<em>Instruction invoke void</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_VOID_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invoke_nonVoidImpl <em>Instruction invoke non Void</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invoke_nonVoidImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_invoke_nonVoid()
   * @generated
   */
  int INSTRUCTION_INVOKE_NON_VOID = 63;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_NON_VOID__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Cconv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_NON_VOID__CCONV = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_NON_VOID__TYPE = 2;

  /**
   * The feature id for the '<em><b>Callee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_NON_VOID__CALLEE = 3;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_NON_VOID__ARGS = 4;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_NON_VOID__ATTRIBUTES = 5;

  /**
   * The feature id for the '<em><b>To Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_NON_VOID__TO_LABEL = 6;

  /**
   * The feature id for the '<em><b>Exception Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_NON_VOID__EXCEPTION_LABEL = 7;

  /**
   * The number of structural features of the '<em>Instruction invoke non Void</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INVOKE_NON_VOID_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_resumeImpl <em>Instruction resume</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_resumeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_resume()
   * @generated
   */
  int INSTRUCTION_RESUME = 64;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_RESUME__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_RESUME__VALUE = 1;

  /**
   * The number of structural features of the '<em>Instruction resume</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_RESUME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_unreachableImpl <em>Instruction unreachable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_unreachableImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_unreachable()
   * @generated
   */
  int INSTRUCTION_UNREACHABLE = 65;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UNREACHABLE__OPCODE = 0;

  /**
   * The number of structural features of the '<em>Instruction unreachable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UNREACHABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BasicBlockRefImpl <em>Basic Block Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.BasicBlockRefImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBasicBlockRef()
   * @generated
   */
  int BASIC_BLOCK_REF = 66;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_BLOCK_REF__REF = 0;

  /**
   * The number of structural features of the '<em>Basic Block Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_BLOCK_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BinaryInstructionImpl <em>Binary Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.BinaryInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBinaryInstruction()
   * @generated
   */
  int BINARY_INSTRUCTION = 67;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_INSTRUCTION__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_INSTRUCTION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_INSTRUCTION__OP1 = 2;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_INSTRUCTION__OP2 = 3;

  /**
   * The number of structural features of the '<em>Binary Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_INSTRUCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_addImpl <em>Instruction add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_addImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_add()
   * @generated
   */
  int INSTRUCTION_ADD = 68;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ADD__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ADD__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ADD__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ADD__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ADD_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_faddImpl <em>Instruction fadd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_faddImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fadd()
   * @generated
   */
  int INSTRUCTION_FADD = 69;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FADD__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FADD__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FADD__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FADD__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction fadd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FADD_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_subImpl <em>Instruction sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_subImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_sub()
   * @generated
   */
  int INSTRUCTION_SUB = 70;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SUB__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SUB__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SUB__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SUB__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SUB_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fsubImpl <em>Instruction fsub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fsubImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fsub()
   * @generated
   */
  int INSTRUCTION_FSUB = 71;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FSUB__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FSUB__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FSUB__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FSUB__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction fsub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FSUB_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_mulImpl <em>Instruction mul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_mulImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_mul()
   * @generated
   */
  int INSTRUCTION_MUL = 72;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_MUL__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_MUL__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_MUL__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_MUL__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction mul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_MUL_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fmulImpl <em>Instruction fmul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fmulImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fmul()
   * @generated
   */
  int INSTRUCTION_FMUL = 73;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FMUL__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FMUL__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FMUL__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FMUL__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction fmul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FMUL_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_udivImpl <em>Instruction udiv</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_udivImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_udiv()
   * @generated
   */
  int INSTRUCTION_UDIV = 74;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UDIV__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UDIV__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UDIV__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UDIV__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction udiv</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UDIV_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_sdivImpl <em>Instruction sdiv</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_sdivImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_sdiv()
   * @generated
   */
  int INSTRUCTION_SDIV = 75;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SDIV__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SDIV__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SDIV__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SDIV__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction sdiv</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SDIV_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fdivImpl <em>Instruction fdiv</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fdivImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fdiv()
   * @generated
   */
  int INSTRUCTION_FDIV = 76;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FDIV__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FDIV__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FDIV__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FDIV__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction fdiv</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FDIV_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_uremImpl <em>Instruction urem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_uremImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_urem()
   * @generated
   */
  int INSTRUCTION_UREM = 77;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UREM__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UREM__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UREM__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UREM__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction urem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_UREM_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_sremImpl <em>Instruction srem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_sremImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_srem()
   * @generated
   */
  int INSTRUCTION_SREM = 78;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SREM__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SREM__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SREM__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SREM__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction srem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SREM_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fremImpl <em>Instruction frem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fremImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_frem()
   * @generated
   */
  int INSTRUCTION_FREM = 79;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FREM__OPCODE = BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FREM__TYPE = BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FREM__OP1 = BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FREM__OP2 = BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction frem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FREM_FEATURE_COUNT = BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BitwiseBinaryInstructionImpl <em>Bitwise Binary Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.BitwiseBinaryInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBitwiseBinaryInstruction()
   * @generated
   */
  int BITWISE_BINARY_INSTRUCTION = 80;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_BINARY_INSTRUCTION__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_BINARY_INSTRUCTION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_BINARY_INSTRUCTION__OP1 = 2;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_BINARY_INSTRUCTION__OP2 = 3;

  /**
   * The number of structural features of the '<em>Bitwise Binary Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_BINARY_INSTRUCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shlImpl <em>Instruction shl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shlImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_shl()
   * @generated
   */
  int INSTRUCTION_SHL = 81;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHL__OPCODE = BITWISE_BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHL__TYPE = BITWISE_BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHL__OP1 = BITWISE_BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHL__OP2 = BITWISE_BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction shl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHL_FEATURE_COUNT = BITWISE_BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_lshrImpl <em>Instruction lshr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_lshrImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_lshr()
   * @generated
   */
  int INSTRUCTION_LSHR = 82;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LSHR__OPCODE = BITWISE_BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LSHR__TYPE = BITWISE_BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LSHR__OP1 = BITWISE_BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LSHR__OP2 = BITWISE_BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction lshr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LSHR_FEATURE_COUNT = BITWISE_BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_ashrImpl <em>Instruction ashr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_ashrImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_ashr()
   * @generated
   */
  int INSTRUCTION_ASHR = 83;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ASHR__OPCODE = BITWISE_BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ASHR__TYPE = BITWISE_BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ASHR__OP1 = BITWISE_BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ASHR__OP2 = BITWISE_BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction ashr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ASHR_FEATURE_COUNT = BITWISE_BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_andImpl <em>Instruction and</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_andImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_and()
   * @generated
   */
  int INSTRUCTION_AND = 84;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_AND__OPCODE = BITWISE_BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_AND__TYPE = BITWISE_BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_AND__OP1 = BITWISE_BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_AND__OP2 = BITWISE_BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction and</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_AND_FEATURE_COUNT = BITWISE_BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_orImpl <em>Instruction or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_orImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_or()
   * @generated
   */
  int INSTRUCTION_OR = 85;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_OR__OPCODE = BITWISE_BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_OR__TYPE = BITWISE_BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_OR__OP1 = BITWISE_BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_OR__OP2 = BITWISE_BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_OR_FEATURE_COUNT = BITWISE_BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_xorImpl <em>Instruction xor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_xorImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_xor()
   * @generated
   */
  int INSTRUCTION_XOR = 86;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_XOR__OPCODE = BITWISE_BINARY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_XOR__TYPE = BITWISE_BINARY_INSTRUCTION__TYPE;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_XOR__OP1 = BITWISE_BINARY_INSTRUCTION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_XOR__OP2 = BITWISE_BINARY_INSTRUCTION__OP2;

  /**
   * The number of structural features of the '<em>Instruction xor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_XOR_FEATURE_COUNT = BITWISE_BINARY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.VectorInstructionsImpl <em>Vector Instructions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.VectorInstructionsImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getVectorInstructions()
   * @generated
   */
  int VECTOR_INSTRUCTIONS = 87;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_INSTRUCTIONS__OPCODE = 0;

  /**
   * The number of structural features of the '<em>Vector Instructions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_INSTRUCTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_extractelementImpl <em>Instruction extractelement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_extractelementImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_extractelement()
   * @generated
   */
  int INSTRUCTION_EXTRACTELEMENT = 88;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_EXTRACTELEMENT__OPCODE = VECTOR_INSTRUCTIONS__OPCODE;

  /**
   * The feature id for the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_EXTRACTELEMENT__VECTOR = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_EXTRACTELEMENT__INDEX = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instruction extractelement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_EXTRACTELEMENT_FEATURE_COUNT = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_insertelementImpl <em>Instruction insertelement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_insertelementImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_insertelement()
   * @generated
   */
  int INSTRUCTION_INSERTELEMENT = 89;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTELEMENT__OPCODE = VECTOR_INSTRUCTIONS__OPCODE;

  /**
   * The feature id for the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTELEMENT__VECTOR = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTELEMENT__ELEMENT = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTELEMENT__INDEX = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Instruction insertelement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTELEMENT_FEATURE_COUNT = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shufflevectorImpl <em>Instruction shufflevector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shufflevectorImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_shufflevector()
   * @generated
   */
  int INSTRUCTION_SHUFFLEVECTOR = 90;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHUFFLEVECTOR__OPCODE = VECTOR_INSTRUCTIONS__OPCODE;

  /**
   * The feature id for the '<em><b>Vector1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHUFFLEVECTOR__VECTOR1 = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vector2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHUFFLEVECTOR__VECTOR2 = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHUFFLEVECTOR__MASK = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Instruction shufflevector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SHUFFLEVECTOR_FEATURE_COUNT = VECTOR_INSTRUCTIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AggregateInstructionImpl <em>Aggregate Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.AggregateInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAggregateInstruction()
   * @generated
   */
  int AGGREGATE_INSTRUCTION = 91;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_INSTRUCTION__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_INSTRUCTION__AGGREGATE = 1;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_INSTRUCTION__INDICES = 2;

  /**
   * The number of structural features of the '<em>Aggregate Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_INSTRUCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_extractvalueImpl <em>Instruction extractvalue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_extractvalueImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_extractvalue()
   * @generated
   */
  int INSTRUCTION_EXTRACTVALUE = 92;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_EXTRACTVALUE__OPCODE = AGGREGATE_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_EXTRACTVALUE__AGGREGATE = AGGREGATE_INSTRUCTION__AGGREGATE;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_EXTRACTVALUE__INDICES = AGGREGATE_INSTRUCTION__INDICES;

  /**
   * The number of structural features of the '<em>Instruction extractvalue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_EXTRACTVALUE_FEATURE_COUNT = AGGREGATE_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_insertvalueImpl <em>Instruction insertvalue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_insertvalueImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_insertvalue()
   * @generated
   */
  int INSTRUCTION_INSERTVALUE = 93;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTVALUE__OPCODE = AGGREGATE_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTVALUE__AGGREGATE = AGGREGATE_INSTRUCTION__AGGREGATE;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTVALUE__INDICES = AGGREGATE_INSTRUCTION__INDICES;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTVALUE__ELEMENT = AGGREGATE_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instruction insertvalue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_INSERTVALUE_FEATURE_COUNT = AGGREGATE_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MemoryInstructionImpl <em>Memory Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.MemoryInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMemoryInstruction()
   * @generated
   */
  int MEMORY_INSTRUCTION = 94;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY_INSTRUCTION__OPCODE = 0;

  /**
   * The number of structural features of the '<em>Memory Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY_INSTRUCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_allocaImpl <em>Instruction alloca</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_allocaImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_alloca()
   * @generated
   */
  int INSTRUCTION_ALLOCA = 95;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ALLOCA__OPCODE = MEMORY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ALLOCA__TYPE = MEMORY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Num Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ALLOCA__NUM_ELEMENTS = MEMORY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ALLOCA__ALIGNMENT = MEMORY_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Instruction alloca</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ALLOCA_FEATURE_COUNT = MEMORY_INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_loadImpl <em>Instruction load</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_loadImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_load()
   * @generated
   */
  int INSTRUCTION_LOAD = 96;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LOAD__OPCODE = MEMORY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LOAD__POINTER = MEMORY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LOAD__ALIGNMENT = MEMORY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nontemporal Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LOAD__NONTEMPORAL_INDEX = MEMORY_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Invariant Load Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LOAD__INVARIANT_LOAD_INDEX = MEMORY_INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LOAD__ORDERING = MEMORY_INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Instruction load</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LOAD_FEATURE_COUNT = MEMORY_INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_storeImpl <em>Instruction store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_storeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_store()
   * @generated
   */
  int INSTRUCTION_STORE = 97;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_STORE__OPCODE = MEMORY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_STORE__VALUE = MEMORY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_STORE__POINTER = MEMORY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_STORE__ALIGNMENT = MEMORY_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Nontemporal Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_STORE__NONTEMPORAL_INDEX = MEMORY_INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_STORE__ORDERING = MEMORY_INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Instruction store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_STORE_FEATURE_COUNT = MEMORY_INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fenceImpl <em>Instruction fence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fenceImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fence()
   * @generated
   */
  int INSTRUCTION_FENCE = 98;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FENCE__OPCODE = MEMORY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FENCE__ORDERING = MEMORY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instruction fence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FENCE_FEATURE_COUNT = MEMORY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_cmpxchgImpl <em>Instruction cmpxchg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_cmpxchgImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_cmpxchg()
   * @generated
   */
  int INSTRUCTION_CMPXCHG = 99;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CMPXCHG__OPCODE = MEMORY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CMPXCHG__POINTER = MEMORY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Compared With</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CMPXCHG__COMPARED_WITH = MEMORY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>New Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CMPXCHG__NEW_VALUE = MEMORY_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CMPXCHG__ORDERING = MEMORY_INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Instruction cmpxchg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CMPXCHG_FEATURE_COUNT = MEMORY_INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_atomicrmwImpl <em>Instruction atomicrmw</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_atomicrmwImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_atomicrmw()
   * @generated
   */
  int INSTRUCTION_ATOMICRMW = 100;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ATOMICRMW__OPCODE = MEMORY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ATOMICRMW__OPERATION = MEMORY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ATOMICRMW__POINTER = MEMORY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ATOMICRMW__ARGUMENT = MEMORY_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ATOMICRMW__ORDERING = MEMORY_INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Instruction atomicrmw</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ATOMICRMW_FEATURE_COUNT = MEMORY_INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_getelementptrImpl <em>Instruction getelementptr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_getelementptrImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_getelementptr()
   * @generated
   */
  int INSTRUCTION_GETELEMENTPTR = 101;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_GETELEMENTPTR__OPCODE = MEMORY_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_GETELEMENTPTR__BASE = MEMORY_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_GETELEMENTPTR__INDICES = MEMORY_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instruction getelementptr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_GETELEMENTPTR_FEATURE_COUNT = MEMORY_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConversionInstructionImpl <em>Conversion Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConversionInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConversionInstruction()
   * @generated
   */
  int CONVERSION_INSTRUCTION = 102;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_INSTRUCTION__OPCODE = 0;

  /**
   * The feature id for the '<em><b>From Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_INSTRUCTION__FROM_TYPE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_INSTRUCTION__VALUE = 2;

  /**
   * The feature id for the '<em><b>Target Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_INSTRUCTION__TARGET_TYPE = 3;

  /**
   * The number of structural features of the '<em>Conversion Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_INSTRUCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.OtherInstructionImpl <em>Other Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.OtherInstructionImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getOtherInstruction()
   * @generated
   */
  int OTHER_INSTRUCTION = 103;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_INSTRUCTION__OPCODE = 0;

  /**
   * The number of structural features of the '<em>Other Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_INSTRUCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_icmpImpl <em>Instruction icmp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_icmpImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_icmp()
   * @generated
   */
  int INSTRUCTION_ICMP = 104;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ICMP__OPCODE = OTHER_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ICMP__CONDITION = OTHER_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ICMP__TYPE = OTHER_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ICMP__OP1 = OTHER_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ICMP__OP2 = OTHER_INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Instruction icmp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_ICMP_FEATURE_COUNT = OTHER_INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fcmpImpl <em>Instruction fcmp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fcmpImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fcmp()
   * @generated
   */
  int INSTRUCTION_FCMP = 105;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FCMP__OPCODE = OTHER_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FCMP__CONDITION = OTHER_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FCMP__TYPE = OTHER_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FCMP__OP1 = OTHER_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FCMP__OP2 = OTHER_INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Instruction fcmp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FCMP_FEATURE_COUNT = OTHER_INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_phiImpl <em>Instruction phi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_phiImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_phi()
   * @generated
   */
  int INSTRUCTION_PHI = 106;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_PHI__OPCODE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_PHI__TYPE = 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_PHI__VALUES = 2;

  /**
   * The feature id for the '<em><b>Labels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_PHI__LABELS = 3;

  /**
   * The number of structural features of the '<em>Instruction phi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_PHI_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_selectImpl <em>Instruction select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_selectImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_select()
   * @generated
   */
  int INSTRUCTION_SELECT = 107;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SELECT__OPCODE = OTHER_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SELECT__CONDITION = OTHER_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SELECT__VALUE1 = OTHER_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SELECT__VALUE2 = OTHER_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Instruction select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SELECT_FEATURE_COUNT = OTHER_INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl <em>Instruction call non Void</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_call_nonVoid()
   * @generated
   */
  int INSTRUCTION_CALL_NON_VOID = 108;

  /**
   * The feature id for the '<em><b>Is Tail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_NON_VOID__IS_TAIL = 0;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_NON_VOID__OPCODE = 1;

  /**
   * The feature id for the '<em><b>Cconv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_NON_VOID__CCONV = 2;

  /**
   * The feature id for the '<em><b>Return Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_NON_VOID__TYPE = 4;

  /**
   * The feature id for the '<em><b>Callee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_NON_VOID__CALLEE = 5;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_NON_VOID__ARGS = 6;

  /**
   * The feature id for the '<em><b>Function Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES = 7;

  /**
   * The number of structural features of the '<em>Instruction call non Void</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_NON_VOID_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_voidImpl <em>Instruction call void</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_voidImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_call_void()
   * @generated
   */
  int INSTRUCTION_CALL_VOID = 109;

  /**
   * The feature id for the '<em><b>Is Tail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_VOID__IS_TAIL = 0;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_VOID__OPCODE = 1;

  /**
   * The feature id for the '<em><b>Cconv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_VOID__CCONV = 2;

  /**
   * The feature id for the '<em><b>Return Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_VOID__RETURN_ATTRIBUTES = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_VOID__TYPE = 4;

  /**
   * The feature id for the '<em><b>Callee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_VOID__CALLEE = 5;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_VOID__ARGS = 6;

  /**
   * The feature id for the '<em><b>Function Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_VOID__FUNCTION_ATTRIBUTES = 7;

  /**
   * The number of structural features of the '<em>Instruction call void</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_CALL_VOID_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ArgListImpl <em>Arg List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ArgListImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getArgList()
   * @generated
   */
  int ARG_LIST = 110;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST__ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>Arg List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.InlineAssemblerImpl <em>Inline Assembler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.InlineAssemblerImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInlineAssembler()
   * @generated
   */
  int INLINE_ASSEMBLER = 112;

  /**
   * The feature id for the '<em><b>Assembler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_ASSEMBLER__ASSEMBLER = CALLEE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_ASSEMBLER__FLAGS = CALLEE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inline Assembler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_ASSEMBLER_FEATURE_COUNT = CALLEE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_va_argImpl <em>Instruction va arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_va_argImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_va_arg()
   * @generated
   */
  int INSTRUCTION_VA_ARG = 113;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_VA_ARG__OPCODE = OTHER_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Arglist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_VA_ARG__ARGLIST = OTHER_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_VA_ARG__TYPE = OTHER_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instruction va arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_VA_ARG_FEATURE_COUNT = OTHER_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_landingpadImpl <em>Instruction landingpad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_landingpadImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_landingpad()
   * @generated
   */
  int INSTRUCTION_LANDINGPAD = 114;

  /**
   * The feature id for the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LANDINGPAD__OPCODE = OTHER_INSTRUCTION__OPCODE;

  /**
   * The feature id for the '<em><b>Result Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LANDINGPAD__RESULT_TYPE = OTHER_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Personality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LANDINGPAD__PERSONALITY = OTHER_INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LANDINGPAD__CLAUSES = OTHER_INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Instruction landingpad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_LANDINGPAD_FEATURE_COUNT = OTHER_INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.LandingpadClauseImpl <em>Landingpad Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LandingpadClauseImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getLandingpadClause()
   * @generated
   */
  int LANDINGPAD_CLAUSE = 115;

  /**
   * The feature id for the '<em><b>Landing Pad Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDINGPAD_CLAUSE__LANDING_PAD_TYPE = 0;

  /**
   * The feature id for the '<em><b>Catch Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDINGPAD_CLAUSE__CATCH_TYPE = 1;

  /**
   * The feature id for the '<em><b>Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDINGPAD_CLAUSE__ARRAY_TYPE = 2;

  /**
   * The feature id for the '<em><b>Array Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDINGPAD_CLAUSE__ARRAY_CONSTANT = 3;

  /**
   * The number of structural features of the '<em>Landingpad Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDINGPAD_CLAUSE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypedValueImpl <em>Typed Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypedValueImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTypedValue()
   * @generated
   */
  int TYPED_VALUE = 116;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_VALUE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_VALUE__REF = 1;

  /**
   * The number of structural features of the '<em>Typed Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ParameterTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getParameterType()
   * @generated
   */
  int PARAMETER_TYPE = 117;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE__ATTRS = 1;

  /**
   * The number of structural features of the '<em>Parameter Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ParameterAttributesImpl <em>Parameter Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ParameterAttributesImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getParameterAttributes()
   * @generated
   */
  int PARAMETER_ATTRIBUTES = 118;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ATTRIBUTES__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Parameter Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ATTRIBUTES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ArgumentImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 119;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__REF = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ParameterImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 120;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = LOCAL_VALUE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = LOCAL_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = LOCAL_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NonVoidTypeImpl <em>Non Void Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.NonVoidTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNonVoidType()
   * @generated
   */
  int NON_VOID_TYPE = 121;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_VOID_TYPE__BASE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Suffixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_VOID_TYPE__SUFFIXES = 1;

  /**
   * The feature id for the '<em><b>Stars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_VOID_TYPE__STARS = 2;

  /**
   * The number of structural features of the '<em>Non Void Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_VOID_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.StarImpl <em>Star</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.StarImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getStar()
   * @generated
   */
  int STAR = 122;

  /**
   * The feature id for the '<em><b>Address Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR__ADDRESS_SPACE = 0;

  /**
   * The number of structural features of the '<em>Star</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getType()
   * @generated
   */
  int TYPE = 123;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__BASE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Stars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__STARS = 1;

  /**
   * The feature id for the '<em><b>Suffixes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__SUFFIXES = 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypeSuffixImpl <em>Type Suffix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypeSuffixImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTypeSuffix()
   * @generated
   */
  int TYPE_SUFFIX = 124;

  /**
   * The feature id for the '<em><b>Contained Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SUFFIX__CONTAINED_TYPES = 0;

  /**
   * The feature id for the '<em><b>Vararg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SUFFIX__VARARG = 1;

  /**
   * The feature id for the '<em><b>Stars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SUFFIX__STARS = 2;

  /**
   * The number of structural features of the '<em>Type Suffix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SUFFIX_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveTypeImpl <em>Non Left Recursive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNonLeftRecursiveType()
   * @generated
   */
  int NON_LEFT_RECURSIVE_TYPE = 125;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_LEFT_RECURSIVE_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Typedef</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_LEFT_RECURSIVE_TYPE__TYPEDEF = 1;

  /**
   * The number of structural features of the '<em>Non Left Recursive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_LEFT_RECURSIVE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveNonVoidTypeImpl <em>Non Left Recursive Non Void Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveNonVoidTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNonLeftRecursiveNonVoidType()
   * @generated
   */
  int NON_LEFT_RECURSIVE_NON_VOID_TYPE = 126;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Typedef</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPEDEF = 1;

  /**
   * The number of structural features of the '<em>Non Left Recursive Non Void Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_LEFT_RECURSIVE_NON_VOID_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypeDefImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 127;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__NAME = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__TYPE = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = TOP_LEVEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.IntTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 128;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.OpaqueTypeImpl <em>Opaque Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.OpaqueTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getOpaqueType()
   * @generated
   */
  int OPAQUE_TYPE = 129;

  /**
   * The number of structural features of the '<em>Opaque Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPAQUE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.StructTypeImpl <em>Struct Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.StructTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getStructType()
   * @generated
   */
  int STRUCT_TYPE = 130;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__TYPES = 0;

  /**
   * The feature id for the '<em><b>Packed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__PACKED = 1;

  /**
   * The number of structural features of the '<em>Struct Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.VectorTypeImpl <em>Vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.VectorTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getVectorType()
   * @generated
   */
  int VECTOR_TYPE = 131;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_TYPE__SIZE = 0;

  /**
   * The feature id for the '<em><b>Elem Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_TYPE__ELEM_TYPE = 1;

  /**
   * The number of structural features of the '<em>Vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.ArrayTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 132;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__SIZE = 0;

  /**
   * The feature id for the '<em><b>Elem Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__ELEM_TYPE = 1;

  /**
   * The number of structural features of the '<em>Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.X86mmxTypeImpl <em>X8 6mmx Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.X86mmxTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getX86mmxType()
   * @generated
   */
  int X8_6MMX_TYPE = 133;

  /**
   * The number of structural features of the '<em>X8 6mmx Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int X8_6MMX_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.VoidTypeImpl <em>Void Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.VoidTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getVoidType()
   * @generated
   */
  int VOID_TYPE = 134;

  /**
   * The number of structural features of the '<em>Void Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataType()
   * @generated
   */
  int METADATA_TYPE = 135;

  /**
   * The number of structural features of the '<em>Metadata Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FloatingTypeImpl <em>Floating Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.FloatingTypeImpl
   * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFloatingType()
   * @generated
   */
  int FLOATING_TYPE = 136;

  /**
   * The number of structural features of the '<em>Floating Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOATING_TYPE_FEATURE_COUNT = 0;


  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.TopLevelElement <em>Top Level Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Element</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TopLevelElement
   * @generated
   */
  EClass getTopLevelElement();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup <em>Attribute Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Group</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AttributeGroup
   * @generated
   */
  EClass getAttributeGroup();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getName()
   * @see #getAttributeGroup()
   * @generated
   */
  EAttribute getAttributeGroup_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getAttributes()
   * @see #getAttributeGroup()
   * @generated
   */
  EReference getAttributeGroup_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getAlignstack <em>Alignstack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alignstack</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getAlignstack()
   * @see #getAttributeGroup()
   * @generated
   */
  EReference getAttributeGroup_Alignstack();

  /**
   * Returns the meta object for the attribute list '{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getAlignstackValue <em>Alignstack Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Alignstack Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getAlignstackValue()
   * @see #getAttributeGroup()
   * @generated
   */
  EAttribute getAttributeGroup_AlignstackValue();

  /**
   * Returns the meta object for the attribute list '{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getTargetSpecificAttributes <em>Target Specific Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Target Specific Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getTargetSpecificAttributes()
   * @see #getAttributeGroup()
   * @generated
   */
  EAttribute getAttributeGroup_TargetSpecificAttributes();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.NamedMetadata <em>Named Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Metadata</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedMetadata
   * @generated
   */
  EClass getNamedMetadata();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.NamedMetadata#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedMetadata#getName()
   * @see #getNamedMetadata()
   * @generated
   */
  EAttribute getNamedMetadata_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.NamedMetadata#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedMetadata#getNode()
   * @see #getNamedMetadata()
   * @generated
   */
  EReference getNamedMetadata_Node();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataRef <em>Metadata Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataRef
   * @generated
   */
  EClass getMetadataRef();

  /**
   * Returns the meta object for the reference '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataRef#getRef()
   * @see #getMetadataRef()
   * @generated
   */
  EReference getMetadataRef_Ref();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ValueRef <em>Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ValueRef
   * @generated
   */
  EClass getValueRef();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef <em>Global Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Value Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef
   * @generated
   */
  EClass getGlobalValueRef();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getConstant()
   * @see #getGlobalValueRef()
   * @generated
   */
  EReference getGlobalValueRef_Constant();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getMetadata()
   * @see #getGlobalValueRef()
   * @generated
   */
  EReference getGlobalValueRef_Metadata();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.LocalValueRef <em>Local Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Value Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.LocalValueRef
   * @generated
   */
  EClass getLocalValueRef();

  /**
   * Returns the meta object for the reference '{@link com.intel.llvm.ireditor.lLVM_IR.LocalValueRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.LocalValueRef#getRef()
   * @see #getLocalValueRef()
   * @generated
   */
  EReference getLocalValueRef_Ref();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValue <em>Global Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalValue
   * @generated
   */
  EClass getGlobalValue();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueDef <em>Global Value Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Value Def</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalValueDef
   * @generated
   */
  EClass getGlobalValueDef();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.LocalValue <em>Local Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.LocalValue
   * @generated
   */
  EClass getLocalValue();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.LocalValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.LocalValue#getName()
   * @see #getLocalValue()
   * @generated
   */
  EAttribute getLocalValue_Name();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.NamedInstruction <em>Named Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedInstruction
   * @generated
   */
  EClass getNamedInstruction();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction#getMetadata <em>Metadata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metadata</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction#getMetadata()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Metadata();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alias</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Alias
   * @generated
   */
  EClass getAlias();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Alias#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Alias#getName()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Name();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Alias#getLinkage <em>Linkage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Linkage</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Alias#getLinkage()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Linkage();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Alias#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Alias#getVisibility()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Visibility();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Alias#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Alias#getType()
   * @see #getAlias()
   * @generated
   */
  EReference getAlias_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Alias#getAliasee <em>Aliasee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aliasee</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Alias#getAliasee()
   * @see #getAlias()
   * @generated
   */
  EReference getAlias_Aliasee();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Aliasee <em>Aliasee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aliasee</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Aliasee
   * @generated
   */
  EClass getAliasee();

  /**
   * Returns the meta object for the reference '{@link com.intel.llvm.ireditor.lLVM_IR.Aliasee#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Aliasee#getRef()
   * @see #getAliasee()
   * @generated
   */
  EReference getAliasee_Ref();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Aliasee#getBitcast <em>Bitcast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bitcast</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Aliasee#getBitcast()
   * @see #getAliasee()
   * @generated
   */
  EReference getAliasee_Bitcast();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.TargetInfo <em>Target Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Info</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TargetInfo
   * @generated
   */
  EClass getTargetInfo();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.TargetInfo#getInfoType <em>Info Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Info Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TargetInfo#getInfoType()
   * @see #getTargetInfo()
   * @generated
   */
  EAttribute getTargetInfo_InfoType();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.TargetInfo#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TargetInfo#getLayout()
   * @see #getTargetInfo()
   * @generated
   */
  EAttribute getTargetInfo_Layout();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAsm <em>Inline Asm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Asm</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.InlineAsm
   * @generated
   */
  EClass getInlineAsm();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAsm#getAsmLine <em>Asm Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asm Line</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.InlineAsm#getAsmLine()
   * @see #getInlineAsm()
   * @generated
   */
  EAttribute getInlineAsm_AsmLine();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable <em>Global Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Variable</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable
   * @generated
   */
  EClass getGlobalVariable();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getName()
   * @see #getGlobalVariable()
   * @generated
   */
  EAttribute getGlobalVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getLinkage <em>Linkage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Linkage</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getLinkage()
   * @see #getGlobalVariable()
   * @generated
   */
  EAttribute getGlobalVariable_Linkage();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getAddrspace <em>Addrspace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Addrspace</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getAddrspace()
   * @see #getGlobalVariable()
   * @generated
   */
  EReference getGlobalVariable_Addrspace();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getTlsModel <em>Tls Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tls Model</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getTlsModel()
   * @see #getGlobalVariable()
   * @generated
   */
  EAttribute getGlobalVariable_TlsModel();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getType()
   * @see #getGlobalVariable()
   * @generated
   */
  EReference getGlobalVariable_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getInitialValue()
   * @see #getGlobalVariable()
   * @generated
   */
  EReference getGlobalVariable_InitialValue();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Section</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getSection()
   * @see #getGlobalVariable()
   * @generated
   */
  EAttribute getGlobalVariable_Section();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getAlign <em>Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Align</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getAlign()
   * @see #getGlobalVariable()
   * @generated
   */
  EAttribute getGlobalVariable_Align();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the reference '{@link com.intel.llvm.ireditor.lLVM_IR.Constant#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Constant#getRef()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Ref();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression <em>Constant Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression
   * @generated
   */
  EClass getConstantExpression();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression#getOpcode()
   * @see #getConstantExpression()
   * @generated
   */
  EAttribute getConstantExpression_Opcode();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert <em>Constant Expression convert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression convert</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert
   * @generated
   */
  EClass getConstantExpression_convert();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert#getFromType <em>From Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert#getFromType()
   * @see #getConstantExpression_convert()
   * @generated
   */
  EReference getConstantExpression_convert_FromType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert#getConstant()
   * @see #getConstantExpression_convert()
   * @generated
   */
  EReference getConstantExpression_convert_Constant();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert#getTargetType <em>Target Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert#getTargetType()
   * @see #getConstantExpression_convert()
   * @generated
   */
  EReference getConstantExpression_convert_TargetType();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr <em>Constant Expression getelementptr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression getelementptr</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr
   * @generated
   */
  EClass getConstantExpression_getelementptr();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr#getConstantType <em>Constant Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr#getConstantType()
   * @see #getConstantExpression_getelementptr()
   * @generated
   */
  EReference getConstantExpression_getelementptr_ConstantType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr#getConstant()
   * @see #getConstantExpression_getelementptr()
   * @generated
   */
  EReference getConstantExpression_getelementptr_Constant();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr#getIndexTypes <em>Index Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Index Types</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr#getIndexTypes()
   * @see #getConstantExpression_getelementptr()
   * @generated
   */
  EReference getConstantExpression_getelementptr_IndexTypes();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr#getIndices()
   * @see #getConstantExpression_getelementptr()
   * @generated
   */
  EReference getConstantExpression_getelementptr_Indices();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select <em>Constant Expression select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression select</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select
   * @generated
   */
  EClass getConstantExpression_select();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getCondition()
   * @see #getConstantExpression_select()
   * @generated
   */
  EReference getConstantExpression_select_Condition();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getOp1()
   * @see #getConstantExpression_select()
   * @generated
   */
  EReference getConstantExpression_select_Op1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getOp2()
   * @see #getConstantExpression_select()
   * @generated
   */
  EReference getConstantExpression_select_Op2();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare <em>Constant Expression compare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression compare</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare
   * @generated
   */
  EClass getConstantExpression_compare();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare#getCondition()
   * @see #getConstantExpression_compare()
   * @generated
   */
  EAttribute getConstantExpression_compare_Condition();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare#getOp1()
   * @see #getConstantExpression_compare()
   * @generated
   */
  EReference getConstantExpression_compare_Op1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_compare#getOp2()
   * @see #getConstantExpression_compare()
   * @generated
   */
  EReference getConstantExpression_compare_Op2();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement <em>Constant Expression extractelement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression extractelement</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement
   * @generated
   */
  EClass getConstantExpression_extractelement();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement#getVector()
   * @see #getConstantExpression_extractelement()
   * @generated
   */
  EReference getConstantExpression_extractelement_Vector();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement#getIndex()
   * @see #getConstantExpression_extractelement()
   * @generated
   */
  EReference getConstantExpression_extractelement_Index();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement <em>Constant Expression insertelement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression insertelement</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement
   * @generated
   */
  EClass getConstantExpression_insertelement();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement#getVectorType <em>Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement#getVectorType()
   * @see #getConstantExpression_insertelement()
   * @generated
   */
  EReference getConstantExpression_insertelement_VectorType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement#getVector()
   * @see #getConstantExpression_insertelement()
   * @generated
   */
  EReference getConstantExpression_insertelement_Vector();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement#getElement()
   * @see #getConstantExpression_insertelement()
   * @generated
   */
  EReference getConstantExpression_insertelement_Element();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement#getIndex()
   * @see #getConstantExpression_insertelement()
   * @generated
   */
  EReference getConstantExpression_insertelement_Index();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector <em>Constant Expression shufflevector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression shufflevector</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector
   * @generated
   */
  EClass getConstantExpression_shufflevector();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector#getVector1 <em>Vector1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector#getVector1()
   * @see #getConstantExpression_shufflevector()
   * @generated
   */
  EReference getConstantExpression_shufflevector_Vector1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector#getVector2 <em>Vector2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector#getVector2()
   * @see #getConstantExpression_shufflevector()
   * @generated
   */
  EReference getConstantExpression_shufflevector_Vector2();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector#getMask <em>Mask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mask</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_shufflevector#getMask()
   * @see #getConstantExpression_shufflevector()
   * @generated
   */
  EReference getConstantExpression_shufflevector_Mask();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue <em>Constant Expression extractvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression extractvalue</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue
   * @generated
   */
  EClass getConstantExpression_extractvalue();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue#getValue()
   * @see #getConstantExpression_extractvalue()
   * @generated
   */
  EReference getConstantExpression_extractvalue_Value();

  /**
   * Returns the meta object for the attribute list '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Indices</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue#getIndices()
   * @see #getConstantExpression_extractvalue()
   * @generated
   */
  EAttribute getConstantExpression_extractvalue_Indices();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue <em>Constant Expression insertvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression insertvalue</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue
   * @generated
   */
  EClass getConstantExpression_insertvalue();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue#getValue()
   * @see #getConstantExpression_insertvalue()
   * @generated
   */
  EReference getConstantExpression_insertvalue_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue#getElement()
   * @see #getConstantExpression_insertvalue()
   * @generated
   */
  EReference getConstantExpression_insertvalue_Element();

  /**
   * Returns the meta object for the attribute list '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Indices</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue#getIndices()
   * @see #getConstantExpression_insertvalue()
   * @generated
   */
  EAttribute getConstantExpression_insertvalue_Indices();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary <em>Constant Expression binary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Expression binary</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary
   * @generated
   */
  EClass getConstantExpression_binary();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary#getOp1()
   * @see #getConstantExpression_binary()
   * @generated
   */
  EReference getConstantExpression_binary_Op1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_binary#getOp2()
   * @see #getConstantExpression_binary()
   * @generated
   */
  EReference getConstantExpression_binary_Op2();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Undef <em>Undef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Undef</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Undef
   * @generated
   */
  EClass getUndef();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.BlockAddress <em>Block Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Address</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BlockAddress
   * @generated
   */
  EClass getBlockAddress();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.BlockAddress#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BlockAddress#getFunction()
   * @see #getBlockAddress()
   * @generated
   */
  EReference getBlockAddress_Function();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.BlockAddress#getBasicBlock <em>Basic Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Basic Block</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BlockAddress#getBasicBlock()
   * @see #getBlockAddress()
   * @generated
   */
  EReference getBlockAddress_BasicBlock();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ZeroInitializer <em>Zero Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Zero Initializer</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ZeroInitializer
   * @generated
   */
  EClass getZeroInitializer();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.StructureConstant <em>Structure Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.StructureConstant
   * @generated
   */
  EClass getStructureConstant();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.StructureConstant#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.StructureConstant#getList()
   * @see #getStructureConstant()
   * @generated
   */
  EReference getStructureConstant_List();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.StructureConstant#getPacked <em>Packed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Packed</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.StructureConstant#getPacked()
   * @see #getStructureConstant()
   * @generated
   */
  EAttribute getStructureConstant_Packed();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ArrayConstant <em>Array Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArrayConstant
   * @generated
   */
  EClass getArrayConstant();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ArrayConstant#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArrayConstant#getList()
   * @see #getArrayConstant()
   * @generated
   */
  EReference getArrayConstant_List();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.VectorConstant <em>Vector Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorConstant
   * @generated
   */
  EClass getVectorConstant();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.VectorConstant#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorConstant#getList()
   * @see #getVectorConstant()
   * @generated
   */
  EReference getVectorConstant_List();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantList <em>Constant List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant List</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantList
   * @generated
   */
  EClass getConstantList();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantList#getTypedConstants <em>Typed Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typed Constants</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConstantList#getTypedConstants()
   * @see #getConstantList()
   * @generated
   */
  EReference getConstantList_TypedConstants();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.TypedConstant <em>Typed Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypedConstant
   * @generated
   */
  EClass getTypedConstant();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.TypedConstant#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypedConstant#getType()
   * @see #getTypedConstant()
   * @generated
   */
  EReference getTypedConstant_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.TypedConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypedConstant#getValue()
   * @see #getTypedConstant()
   * @generated
   */
  EReference getTypedConstant_Value();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.SimpleConstant <em>Simple Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.SimpleConstant
   * @generated
   */
  EClass getSimpleConstant();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.SimpleConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.SimpleConstant#getValue()
   * @see #getSimpleConstant()
   * @generated
   */
  EAttribute getSimpleConstant_Value();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNode <em>Metadata Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata Node</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataNode
   * @generated
   */
  EClass getMetadataNode();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNode#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataNode#getElements()
   * @see #getMetadataNode()
   * @generated
   */
  EReference getMetadataNode_Elements();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement <em>Metadata Node Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata Node Element</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement
   * @generated
   */
  EClass getMetadataNodeElement();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getValue()
   * @see #getMetadataNodeElement()
   * @generated
   */
  EReference getMetadataNodeElement_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getMetadataRef <em>Metadata Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metadata Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getMetadataRef()
   * @see #getMetadataNodeElement()
   * @generated
   */
  EReference getMetadataNodeElement_MetadataRef();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getNull()
   * @see #getMetadataNodeElement()
   * @generated
   */
  EAttribute getMetadataNodeElement_Null();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataString <em>Metadata String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata String</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataString
   * @generated
   */
  EClass getMetadataString();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataString#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataString#getName()
   * @see #getMetadataString()
   * @generated
   */
  EAttribute getMetadataString_Name();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.AddressSpace <em>Address Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address Space</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AddressSpace
   * @generated
   */
  EClass getAddressSpace();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.AddressSpace#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AddressSpace#getValue()
   * @see #getAddressSpace()
   * @generated
   */
  EAttribute getAddressSpace_Value();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Function#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Function#getHeader()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Header();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionDef <em>Function Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Def</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionDef
   * @generated
   */
  EClass getFunctionDef();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionDef#getBasicBlocks <em>Basic Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Basic Blocks</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionDef#getBasicBlocks()
   * @see #getFunctionDef()
   * @generated
   */
  EReference getFunctionDef_BasicBlocks();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionDecl <em>Function Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Decl</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionDecl
   * @generated
   */
  EClass getFunctionDecl();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader <em>Function Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Header</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader
   * @generated
   */
  EClass getFunctionHeader();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getLinkage <em>Linkage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Linkage</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getLinkage()
   * @see #getFunctionHeader()
   * @generated
   */
  EAttribute getFunctionHeader_Linkage();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getVisibility()
   * @see #getFunctionHeader()
   * @generated
   */
  EAttribute getFunctionHeader_Visibility();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getCconv <em>Cconv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cconv</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getCconv()
   * @see #getFunctionHeader()
   * @generated
   */
  EAttribute getFunctionHeader_Cconv();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettypeAttrs <em>Rettype Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rettype Attrs</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettypeAttrs()
   * @see #getFunctionHeader()
   * @generated
   */
  EReference getFunctionHeader_RettypeAttrs();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettype <em>Rettype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rettype</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettype()
   * @see #getFunctionHeader()
   * @generated
   */
  EReference getFunctionHeader_Rettype();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getName()
   * @see #getFunctionHeader()
   * @generated
   */
  EAttribute getFunctionHeader_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getParameters()
   * @see #getFunctionHeader()
   * @generated
   */
  EReference getFunctionHeader_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attrs</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getAttrs()
   * @see #getFunctionHeader()
   * @generated
   */
  EReference getFunctionHeader_Attrs();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getSection <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Section</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getSection()
   * @see #getFunctionHeader()
   * @generated
   */
  EAttribute getFunctionHeader_Section();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getAlign <em>Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Align</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getAlign()
   * @see #getFunctionHeader()
   * @generated
   */
  EAttribute getFunctionHeader_Align();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getGc <em>Gc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gc</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getGc()
   * @see #getFunctionHeader()
   * @generated
   */
  EAttribute getFunctionHeader_Gc();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Parameters
   * @generated
   */
  EClass getParameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Parameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Parameters#getParameters()
   * @see #getParameters()
   * @generated
   */
  EReference getParameters_Parameters();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Parameters#getVararg <em>Vararg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vararg</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Parameters#getVararg()
   * @see #getParameters()
   * @generated
   */
  EAttribute getParameters_Vararg();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes <em>Function Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes
   * @generated
   */
  EClass getFunctionAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getFunctionAttributes <em>Function Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getFunctionAttributes()
   * @see #getFunctionAttributes()
   * @generated
   */
  EReference getFunctionAttributes_FunctionAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getAlignstack <em>Alignstack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alignstack</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getAlignstack()
   * @see #getFunctionAttributes()
   * @generated
   */
  EReference getFunctionAttributes_Alignstack();

  /**
   * Returns the meta object for the attribute list '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getAlignstackValue <em>Alignstack Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Alignstack Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getAlignstackValue()
   * @see #getFunctionAttributes()
   * @generated
   */
  EAttribute getFunctionAttributes_AlignstackValue();

  /**
   * Returns the meta object for the reference list '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getFunctionAttributeGroupRefs <em>Function Attribute Group Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Function Attribute Group Refs</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getFunctionAttributeGroupRefs()
   * @see #getFunctionAttributes()
   * @generated
   */
  EReference getFunctionAttributes_FunctionAttributeGroupRefs();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.AlignStack <em>Align Stack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Align Stack</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AlignStack
   * @generated
   */
  EClass getAlignStack();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute <em>Function Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Attribute</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute
   * @generated
   */
  EClass getFunctionAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute#getAttribute()
   * @see #getFunctionAttribute()
   * @generated
   */
  EAttribute getFunctionAttribute_Attribute();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.BasicBlock <em>Basic Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Block</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BasicBlock
   * @generated
   */
  EClass getBasicBlock();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.BasicBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BasicBlock#getName()
   * @see #getBasicBlock()
   * @generated
   */
  EAttribute getBasicBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.BasicBlock#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BasicBlock#getInstructions()
   * @see #getBasicBlock()
   * @generated
   */
  EReference getBasicBlock_Instructions();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix <em>Metadata Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata Suffix</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix
   * @generated
   */
  EClass getMetadataSuffix();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix#getName()
   * @see #getMetadataSuffix()
   * @generated
   */
  EAttribute getMetadataSuffix_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataSuffix#getValue()
   * @see #getMetadataSuffix()
   * @generated
   */
  EReference getMetadataSuffix_Value();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.StartingInstruction <em>Starting Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Starting Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.StartingInstruction
   * @generated
   */
  EClass getStartingInstruction();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.StartingInstruction#getInstruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.StartingInstruction#getInstruction()
   * @see #getStartingInstruction()
   * @generated
   */
  EReference getStartingInstruction_Instruction();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction <em>Middle Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Middle Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction
   * @generated
   */
  EClass getMiddleInstruction();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction#getInstruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MiddleInstruction#getInstruction()
   * @see #getMiddleInstruction()
   * @generated
   */
  EReference getMiddleInstruction_Instruction();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction <em>Named Middle Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Middle Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction
   * @generated
   */
  EClass getNamedMiddleInstruction();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction#getInstruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction#getInstruction()
   * @see #getNamedMiddleInstruction()
   * @generated
   */
  EReference getNamedMiddleInstruction_Instruction();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction <em>Terminator Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminator Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction
   * @generated
   */
  EClass getTerminatorInstruction();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction#getInstruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction#getInstruction()
   * @see #getTerminatorInstruction()
   * @generated
   */
  EReference getTerminatorInstruction_Instruction();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction <em>Named Terminator Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Terminator Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction
   * @generated
   */
  EClass getNamedTerminatorInstruction();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction#getInstruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction#getInstruction()
   * @see #getNamedTerminatorInstruction()
   * @generated
   */
  EReference getNamedTerminatorInstruction_Instruction();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_ret <em>Instruction ret</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction ret</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_ret
   * @generated
   */
  EClass getInstruction_ret();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_ret#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_ret#getOpcode()
   * @see #getInstruction_ret()
   * @generated
   */
  EAttribute getInstruction_ret_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_ret#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_ret#getVal()
   * @see #getInstruction_ret()
   * @generated
   */
  EReference getInstruction_ret_Val();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br <em>Instruction br</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction br</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_br
   * @generated
   */
  EClass getInstruction_br();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getOpcode()
   * @see #getInstruction_br()
   * @generated
   */
  EAttribute getInstruction_br_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getCondition()
   * @see #getInstruction_br()
   * @generated
   */
  EReference getInstruction_br_Condition();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getTrue <em>True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>True</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getTrue()
   * @see #getInstruction_br()
   * @generated
   */
  EReference getInstruction_br_True();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getFalse <em>False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>False</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getFalse()
   * @see #getInstruction_br()
   * @generated
   */
  EReference getInstruction_br_False();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getUnconditional <em>Unconditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unconditional</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getUnconditional()
   * @see #getInstruction_br()
   * @generated
   */
  EReference getInstruction_br_Unconditional();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch <em>Instruction switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction switch</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_switch
   * @generated
   */
  EClass getInstruction_switch();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getOpcode()
   * @see #getInstruction_switch()
   * @generated
   */
  EAttribute getInstruction_switch_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getComparisonValue <em>Comparison Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comparison Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getComparisonValue()
   * @see #getInstruction_switch()
   * @generated
   */
  EReference getInstruction_switch_ComparisonValue();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getDefaultDest <em>Default Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Dest</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getDefaultDest()
   * @see #getInstruction_switch()
   * @generated
   */
  EReference getInstruction_switch_DefaultDest();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getCaseConditions <em>Case Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Conditions</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getCaseConditions()
   * @see #getInstruction_switch()
   * @generated
   */
  EReference getInstruction_switch_CaseConditions();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getDestinations <em>Destinations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Destinations</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getDestinations()
   * @see #getInstruction_switch()
   * @generated
   */
  EReference getInstruction_switch_Destinations();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr <em>Instruction indirectbr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction indirectbr</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr
   * @generated
   */
  EClass getInstruction_indirectbr();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getOpcode()
   * @see #getInstruction_indirectbr()
   * @generated
   */
  EAttribute getInstruction_indirectbr_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getAddress()
   * @see #getInstruction_indirectbr()
   * @generated
   */
  EReference getInstruction_indirectbr_Address();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getDestinations <em>Destinations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Destinations</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getDestinations()
   * @see #getInstruction_indirectbr()
   * @generated
   */
  EReference getInstruction_indirectbr_Destinations();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void <em>Instruction invoke void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction invoke void</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void
   * @generated
   */
  EClass getInstruction_invoke_void();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getOpcode()
   * @see #getInstruction_invoke_void()
   * @generated
   */
  EAttribute getInstruction_invoke_void_Opcode();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getCconv <em>Cconv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cconv</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getCconv()
   * @see #getInstruction_invoke_void()
   * @generated
   */
  EAttribute getInstruction_invoke_void_Cconv();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getType()
   * @see #getInstruction_invoke_void()
   * @generated
   */
  EReference getInstruction_invoke_void_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getCallee <em>Callee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Callee</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getCallee()
   * @see #getInstruction_invoke_void()
   * @generated
   */
  EReference getInstruction_invoke_void_Callee();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getArgs()
   * @see #getInstruction_invoke_void()
   * @generated
   */
  EReference getInstruction_invoke_void_Args();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getAttributes()
   * @see #getInstruction_invoke_void()
   * @generated
   */
  EReference getInstruction_invoke_void_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getToLabel <em>To Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Label</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getToLabel()
   * @see #getInstruction_invoke_void()
   * @generated
   */
  EReference getInstruction_invoke_void_ToLabel();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getExceptionLabel <em>Exception Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception Label</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void#getExceptionLabel()
   * @see #getInstruction_invoke_void()
   * @generated
   */
  EReference getInstruction_invoke_void_ExceptionLabel();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid <em>Instruction invoke non Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction invoke non Void</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid
   * @generated
   */
  EClass getInstruction_invoke_nonVoid();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getOpcode()
   * @see #getInstruction_invoke_nonVoid()
   * @generated
   */
  EAttribute getInstruction_invoke_nonVoid_Opcode();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getCconv <em>Cconv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cconv</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getCconv()
   * @see #getInstruction_invoke_nonVoid()
   * @generated
   */
  EAttribute getInstruction_invoke_nonVoid_Cconv();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getType()
   * @see #getInstruction_invoke_nonVoid()
   * @generated
   */
  EReference getInstruction_invoke_nonVoid_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getCallee <em>Callee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Callee</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getCallee()
   * @see #getInstruction_invoke_nonVoid()
   * @generated
   */
  EReference getInstruction_invoke_nonVoid_Callee();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getArgs()
   * @see #getInstruction_invoke_nonVoid()
   * @generated
   */
  EReference getInstruction_invoke_nonVoid_Args();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getAttributes()
   * @see #getInstruction_invoke_nonVoid()
   * @generated
   */
  EReference getInstruction_invoke_nonVoid_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getToLabel <em>To Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Label</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getToLabel()
   * @see #getInstruction_invoke_nonVoid()
   * @generated
   */
  EReference getInstruction_invoke_nonVoid_ToLabel();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getExceptionLabel <em>Exception Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception Label</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid#getExceptionLabel()
   * @see #getInstruction_invoke_nonVoid()
   * @generated
   */
  EReference getInstruction_invoke_nonVoid_ExceptionLabel();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_resume <em>Instruction resume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction resume</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_resume
   * @generated
   */
  EClass getInstruction_resume();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_resume#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_resume#getOpcode()
   * @see #getInstruction_resume()
   * @generated
   */
  EAttribute getInstruction_resume_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_resume#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_resume#getValue()
   * @see #getInstruction_resume()
   * @generated
   */
  EReference getInstruction_resume_Value();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_unreachable <em>Instruction unreachable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction unreachable</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_unreachable
   * @generated
   */
  EClass getInstruction_unreachable();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_unreachable#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_unreachable#getOpcode()
   * @see #getInstruction_unreachable()
   * @generated
   */
  EAttribute getInstruction_unreachable_Opcode();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef <em>Basic Block Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Block Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef
   * @generated
   */
  EClass getBasicBlockRef();

  /**
   * Returns the meta object for the reference '{@link com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef#getRef()
   * @see #getBasicBlockRef()
   * @generated
   */
  EReference getBasicBlockRef_Ref();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction <em>Binary Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction
   * @generated
   */
  EClass getBinaryInstruction();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction#getOpcode()
   * @see #getBinaryInstruction()
   * @generated
   */
  EAttribute getBinaryInstruction_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction#getType()
   * @see #getBinaryInstruction()
   * @generated
   */
  EReference getBinaryInstruction_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction#getOp1()
   * @see #getBinaryInstruction()
   * @generated
   */
  EReference getBinaryInstruction_Op1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BinaryInstruction#getOp2()
   * @see #getBinaryInstruction()
   * @generated
   */
  EReference getBinaryInstruction_Op2();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_add <em>Instruction add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction add</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_add
   * @generated
   */
  EClass getInstruction_add();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fadd <em>Instruction fadd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction fadd</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fadd
   * @generated
   */
  EClass getInstruction_fadd();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_sub <em>Instruction sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction sub</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_sub
   * @generated
   */
  EClass getInstruction_sub();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fsub <em>Instruction fsub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction fsub</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fsub
   * @generated
   */
  EClass getInstruction_fsub();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_mul <em>Instruction mul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction mul</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_mul
   * @generated
   */
  EClass getInstruction_mul();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fmul <em>Instruction fmul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction fmul</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fmul
   * @generated
   */
  EClass getInstruction_fmul();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_udiv <em>Instruction udiv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction udiv</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_udiv
   * @generated
   */
  EClass getInstruction_udiv();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_sdiv <em>Instruction sdiv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction sdiv</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_sdiv
   * @generated
   */
  EClass getInstruction_sdiv();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fdiv <em>Instruction fdiv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction fdiv</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fdiv
   * @generated
   */
  EClass getInstruction_fdiv();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_urem <em>Instruction urem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction urem</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_urem
   * @generated
   */
  EClass getInstruction_urem();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_srem <em>Instruction srem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction srem</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_srem
   * @generated
   */
  EClass getInstruction_srem();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_frem <em>Instruction frem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction frem</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_frem
   * @generated
   */
  EClass getInstruction_frem();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction <em>Bitwise Binary Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise Binary Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction
   * @generated
   */
  EClass getBitwiseBinaryInstruction();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction#getOpcode()
   * @see #getBitwiseBinaryInstruction()
   * @generated
   */
  EAttribute getBitwiseBinaryInstruction_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction#getType()
   * @see #getBitwiseBinaryInstruction()
   * @generated
   */
  EReference getBitwiseBinaryInstruction_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction#getOp1()
   * @see #getBitwiseBinaryInstruction()
   * @generated
   */
  EReference getBitwiseBinaryInstruction_Op1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.BitwiseBinaryInstruction#getOp2()
   * @see #getBitwiseBinaryInstruction()
   * @generated
   */
  EReference getBitwiseBinaryInstruction_Op2();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shl <em>Instruction shl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction shl</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_shl
   * @generated
   */
  EClass getInstruction_shl();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_lshr <em>Instruction lshr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction lshr</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_lshr
   * @generated
   */
  EClass getInstruction_lshr();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_ashr <em>Instruction ashr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction ashr</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_ashr
   * @generated
   */
  EClass getInstruction_ashr();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_and <em>Instruction and</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction and</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_and
   * @generated
   */
  EClass getInstruction_and();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_or <em>Instruction or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction or</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_or
   * @generated
   */
  EClass getInstruction_or();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_xor <em>Instruction xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction xor</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_xor
   * @generated
   */
  EClass getInstruction_xor();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.VectorInstructions <em>Vector Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Instructions</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorInstructions
   * @generated
   */
  EClass getVectorInstructions();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.VectorInstructions#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorInstructions#getOpcode()
   * @see #getVectorInstructions()
   * @generated
   */
  EAttribute getVectorInstructions_Opcode();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement <em>Instruction extractelement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction extractelement</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement
   * @generated
   */
  EClass getInstruction_extractelement();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement#getVector()
   * @see #getInstruction_extractelement()
   * @generated
   */
  EReference getInstruction_extractelement_Vector();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_extractelement#getIndex()
   * @see #getInstruction_extractelement()
   * @generated
   */
  EReference getInstruction_extractelement_Index();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement <em>Instruction insertelement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction insertelement</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement
   * @generated
   */
  EClass getInstruction_insertelement();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement#getVector()
   * @see #getInstruction_insertelement()
   * @generated
   */
  EReference getInstruction_insertelement_Vector();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement#getElement()
   * @see #getInstruction_insertelement()
   * @generated
   */
  EReference getInstruction_insertelement_Element();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_insertelement#getIndex()
   * @see #getInstruction_insertelement()
   * @generated
   */
  EReference getInstruction_insertelement_Index();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector <em>Instruction shufflevector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction shufflevector</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector
   * @generated
   */
  EClass getInstruction_shufflevector();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getVector1 <em>Vector1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getVector1()
   * @see #getInstruction_shufflevector()
   * @generated
   */
  EReference getInstruction_shufflevector_Vector1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getVector2 <em>Vector2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getVector2()
   * @see #getInstruction_shufflevector()
   * @generated
   */
  EReference getInstruction_shufflevector_Vector2();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getMask <em>Mask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mask</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getMask()
   * @see #getInstruction_shufflevector()
   * @generated
   */
  EReference getInstruction_shufflevector_Mask();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction <em>Aggregate Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregate Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction
   * @generated
   */
  EClass getAggregateInstruction();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction#getOpcode()
   * @see #getAggregateInstruction()
   * @generated
   */
  EAttribute getAggregateInstruction_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction#getAggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aggregate</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction#getAggregate()
   * @see #getAggregateInstruction()
   * @generated
   */
  EReference getAggregateInstruction_Aggregate();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.AggregateInstruction#getIndices()
   * @see #getAggregateInstruction()
   * @generated
   */
  EReference getAggregateInstruction_Indices();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_extractvalue <em>Instruction extractvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction extractvalue</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_extractvalue
   * @generated
   */
  EClass getInstruction_extractvalue();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_insertvalue <em>Instruction insertvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction insertvalue</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_insertvalue
   * @generated
   */
  EClass getInstruction_insertvalue();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_insertvalue#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_insertvalue#getElement()
   * @see #getInstruction_insertvalue()
   * @generated
   */
  EReference getInstruction_insertvalue_Element();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.MemoryInstruction <em>Memory Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Memory Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MemoryInstruction
   * @generated
   */
  EClass getMemoryInstruction();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.MemoryInstruction#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MemoryInstruction#getOpcode()
   * @see #getMemoryInstruction()
   * @generated
   */
  EAttribute getMemoryInstruction_Opcode();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca <em>Instruction alloca</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction alloca</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca
   * @generated
   */
  EClass getInstruction_alloca();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca#getType()
   * @see #getInstruction_alloca()
   * @generated
   */
  EReference getInstruction_alloca_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca#getNumElements <em>Num Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Elements</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca#getNumElements()
   * @see #getInstruction_alloca()
   * @generated
   */
  EReference getInstruction_alloca_NumElements();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca#getAlignment <em>Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alignment</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_alloca#getAlignment()
   * @see #getInstruction_alloca()
   * @generated
   */
  EAttribute getInstruction_alloca_Alignment();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_load <em>Instruction load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction load</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_load
   * @generated
   */
  EClass getInstruction_load();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointer</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getPointer()
   * @see #getInstruction_load()
   * @generated
   */
  EReference getInstruction_load_Pointer();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getAlignment <em>Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alignment</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getAlignment()
   * @see #getInstruction_load()
   * @generated
   */
  EAttribute getInstruction_load_Alignment();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getNontemporalIndex <em>Nontemporal Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nontemporal Index</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getNontemporalIndex()
   * @see #getInstruction_load()
   * @generated
   */
  EReference getInstruction_load_NontemporalIndex();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getInvariantLoadIndex <em>Invariant Load Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invariant Load Index</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getInvariantLoadIndex()
   * @see #getInstruction_load()
   * @generated
   */
  EReference getInstruction_load_InvariantLoadIndex();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_load#getOrdering()
   * @see #getInstruction_load()
   * @generated
   */
  EAttribute getInstruction_load_Ordering();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_store <em>Instruction store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction store</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_store
   * @generated
   */
  EClass getInstruction_store();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getValue()
   * @see #getInstruction_store()
   * @generated
   */
  EReference getInstruction_store_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointer</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getPointer()
   * @see #getInstruction_store()
   * @generated
   */
  EReference getInstruction_store_Pointer();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getAlignment <em>Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alignment</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getAlignment()
   * @see #getInstruction_store()
   * @generated
   */
  EAttribute getInstruction_store_Alignment();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getNontemporalIndex <em>Nontemporal Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nontemporal Index</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getNontemporalIndex()
   * @see #getInstruction_store()
   * @generated
   */
  EReference getInstruction_store_NontemporalIndex();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_store#getOrdering()
   * @see #getInstruction_store()
   * @generated
   */
  EAttribute getInstruction_store_Ordering();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fence <em>Instruction fence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction fence</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fence
   * @generated
   */
  EClass getInstruction_fence();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fence#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fence#getOrdering()
   * @see #getInstruction_fence()
   * @generated
   */
  EAttribute getInstruction_fence_Ordering();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg <em>Instruction cmpxchg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction cmpxchg</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg
   * @generated
   */
  EClass getInstruction_cmpxchg();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointer</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg#getPointer()
   * @see #getInstruction_cmpxchg()
   * @generated
   */
  EReference getInstruction_cmpxchg_Pointer();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg#getComparedWith <em>Compared With</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compared With</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg#getComparedWith()
   * @see #getInstruction_cmpxchg()
   * @generated
   */
  EReference getInstruction_cmpxchg_ComparedWith();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg#getNewValue <em>New Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg#getNewValue()
   * @see #getInstruction_cmpxchg()
   * @generated
   */
  EReference getInstruction_cmpxchg_NewValue();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_cmpxchg#getOrdering()
   * @see #getInstruction_cmpxchg()
   * @generated
   */
  EAttribute getInstruction_cmpxchg_Ordering();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw <em>Instruction atomicrmw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction atomicrmw</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw
   * @generated
   */
  EClass getInstruction_atomicrmw();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getOperation()
   * @see #getInstruction_atomicrmw()
   * @generated
   */
  EAttribute getInstruction_atomicrmw_Operation();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointer</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getPointer()
   * @see #getInstruction_atomicrmw()
   * @generated
   */
  EReference getInstruction_atomicrmw_Pointer();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getArgument()
   * @see #getInstruction_atomicrmw()
   * @generated
   */
  EReference getInstruction_atomicrmw_Argument();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getOrdering()
   * @see #getInstruction_atomicrmw()
   * @generated
   */
  EAttribute getInstruction_atomicrmw_Ordering();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr <em>Instruction getelementptr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction getelementptr</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr
   * @generated
   */
  EClass getInstruction_getelementptr();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr#getBase()
   * @see #getInstruction_getelementptr()
   * @generated
   */
  EReference getInstruction_getelementptr_Base();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_getelementptr#getIndices()
   * @see #getInstruction_getelementptr()
   * @generated
   */
  EReference getInstruction_getelementptr_Indices();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction <em>Conversion Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conversion Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction
   * @generated
   */
  EClass getConversionInstruction();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getOpcode()
   * @see #getConversionInstruction()
   * @generated
   */
  EAttribute getConversionInstruction_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getFromType <em>From Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getFromType()
   * @see #getConversionInstruction()
   * @generated
   */
  EReference getConversionInstruction_FromType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getValue()
   * @see #getConversionInstruction()
   * @generated
   */
  EReference getConversionInstruction_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getTargetType <em>Target Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getTargetType()
   * @see #getConversionInstruction()
   * @generated
   */
  EReference getConversionInstruction_TargetType();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.OtherInstruction <em>Other Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other Instruction</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.OtherInstruction
   * @generated
   */
  EClass getOtherInstruction();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.OtherInstruction#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.OtherInstruction#getOpcode()
   * @see #getOtherInstruction()
   * @generated
   */
  EAttribute getOtherInstruction_Opcode();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp <em>Instruction icmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction icmp</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp
   * @generated
   */
  EClass getInstruction_icmp();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp#getCondition()
   * @see #getInstruction_icmp()
   * @generated
   */
  EAttribute getInstruction_icmp_Condition();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp#getType()
   * @see #getInstruction_icmp()
   * @generated
   */
  EReference getInstruction_icmp_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp#getOp1()
   * @see #getInstruction_icmp()
   * @generated
   */
  EReference getInstruction_icmp_Op1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_icmp#getOp2()
   * @see #getInstruction_icmp()
   * @generated
   */
  EReference getInstruction_icmp_Op2();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp <em>Instruction fcmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction fcmp</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp
   * @generated
   */
  EClass getInstruction_fcmp();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp#getCondition()
   * @see #getInstruction_fcmp()
   * @generated
   */
  EAttribute getInstruction_fcmp_Condition();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp#getType()
   * @see #getInstruction_fcmp()
   * @generated
   */
  EReference getInstruction_fcmp_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp#getOp1()
   * @see #getInstruction_fcmp()
   * @generated
   */
  EReference getInstruction_fcmp_Op1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_fcmp#getOp2()
   * @see #getInstruction_fcmp()
   * @generated
   */
  EReference getInstruction_fcmp_Op2();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_phi <em>Instruction phi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction phi</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_phi
   * @generated
   */
  EClass getInstruction_phi();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_phi#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_phi#getOpcode()
   * @see #getInstruction_phi()
   * @generated
   */
  EAttribute getInstruction_phi_Opcode();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_phi#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_phi#getType()
   * @see #getInstruction_phi()
   * @generated
   */
  EReference getInstruction_phi_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_phi#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_phi#getValues()
   * @see #getInstruction_phi()
   * @generated
   */
  EReference getInstruction_phi_Values();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_phi#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Labels</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_phi#getLabels()
   * @see #getInstruction_phi()
   * @generated
   */
  EReference getInstruction_phi_Labels();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select <em>Instruction select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction select</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_select
   * @generated
   */
  EClass getInstruction_select();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getCondition()
   * @see #getInstruction_select()
   * @generated
   */
  EReference getInstruction_select_Condition();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value1</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getValue1()
   * @see #getInstruction_select()
   * @generated
   */
  EReference getInstruction_select_Value1();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value2</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getValue2()
   * @see #getInstruction_select()
   * @generated
   */
  EReference getInstruction_select_Value2();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid <em>Instruction call non Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction call non Void</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid
   * @generated
   */
  EClass getInstruction_call_nonVoid();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#isIsTail <em>Is Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Tail</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#isIsTail()
   * @see #getInstruction_call_nonVoid()
   * @generated
   */
  EAttribute getInstruction_call_nonVoid_IsTail();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getOpcode()
   * @see #getInstruction_call_nonVoid()
   * @generated
   */
  EAttribute getInstruction_call_nonVoid_Opcode();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getCconv <em>Cconv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cconv</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getCconv()
   * @see #getInstruction_call_nonVoid()
   * @generated
   */
  EAttribute getInstruction_call_nonVoid_Cconv();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getReturnAttributes <em>Return Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getReturnAttributes()
   * @see #getInstruction_call_nonVoid()
   * @generated
   */
  EReference getInstruction_call_nonVoid_ReturnAttributes();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getType()
   * @see #getInstruction_call_nonVoid()
   * @generated
   */
  EReference getInstruction_call_nonVoid_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getCallee <em>Callee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Callee</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getCallee()
   * @see #getInstruction_call_nonVoid()
   * @generated
   */
  EReference getInstruction_call_nonVoid_Callee();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getArgs()
   * @see #getInstruction_call_nonVoid()
   * @generated
   */
  EReference getInstruction_call_nonVoid_Args();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getFunctionAttributes <em>Function Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid#getFunctionAttributes()
   * @see #getInstruction_call_nonVoid()
   * @generated
   */
  EReference getInstruction_call_nonVoid_FunctionAttributes();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void <em>Instruction call void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction call void</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void
   * @generated
   */
  EClass getInstruction_call_void();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#isIsTail <em>Is Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Tail</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#isIsTail()
   * @see #getInstruction_call_void()
   * @generated
   */
  EAttribute getInstruction_call_void_IsTail();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getOpcode <em>Opcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opcode</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getOpcode()
   * @see #getInstruction_call_void()
   * @generated
   */
  EAttribute getInstruction_call_void_Opcode();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getCconv <em>Cconv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cconv</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getCconv()
   * @see #getInstruction_call_void()
   * @generated
   */
  EAttribute getInstruction_call_void_Cconv();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getReturnAttributes <em>Return Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getReturnAttributes()
   * @see #getInstruction_call_void()
   * @generated
   */
  EReference getInstruction_call_void_ReturnAttributes();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getType()
   * @see #getInstruction_call_void()
   * @generated
   */
  EReference getInstruction_call_void_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getCallee <em>Callee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Callee</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getCallee()
   * @see #getInstruction_call_void()
   * @generated
   */
  EReference getInstruction_call_void_Callee();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getArgs()
   * @see #getInstruction_call_void()
   * @generated
   */
  EReference getInstruction_call_void_Args();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getFunctionAttributes <em>Function Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_call_void#getFunctionAttributes()
   * @see #getInstruction_call_void()
   * @generated
   */
  EReference getInstruction_call_void_FunctionAttributes();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ArgList <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg List</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArgList
   * @generated
   */
  EClass getArgList();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.ArgList#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArgList#getArguments()
   * @see #getArgList()
   * @generated
   */
  EReference getArgList_Arguments();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Callee <em>Callee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callee</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Callee
   * @generated
   */
  EClass getCallee();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAssembler <em>Inline Assembler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Assembler</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.InlineAssembler
   * @generated
   */
  EClass getInlineAssembler();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAssembler#getAssembler <em>Assembler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assembler</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.InlineAssembler#getAssembler()
   * @see #getInlineAssembler()
   * @generated
   */
  EAttribute getInlineAssembler_Assembler();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAssembler#getFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flags</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.InlineAssembler#getFlags()
   * @see #getInlineAssembler()
   * @generated
   */
  EAttribute getInlineAssembler_Flags();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_va_arg <em>Instruction va arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction va arg</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_va_arg
   * @generated
   */
  EClass getInstruction_va_arg();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_va_arg#getArglist <em>Arglist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arglist</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_va_arg#getArglist()
   * @see #getInstruction_va_arg()
   * @generated
   */
  EReference getInstruction_va_arg_Arglist();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_va_arg#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_va_arg#getType()
   * @see #getInstruction_va_arg()
   * @generated
   */
  EReference getInstruction_va_arg_Type();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad <em>Instruction landingpad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction landingpad</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad
   * @generated
   */
  EClass getInstruction_landingpad();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad#getResultType <em>Result Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad#getResultType()
   * @see #getInstruction_landingpad()
   * @generated
   */
  EReference getInstruction_landingpad_ResultType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad#getPersonality <em>Personality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Personality</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad#getPersonality()
   * @see #getInstruction_landingpad()
   * @generated
   */
  EReference getInstruction_landingpad_Personality();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad#getClauses <em>Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clauses</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad#getClauses()
   * @see #getInstruction_landingpad()
   * @generated
   */
  EReference getInstruction_landingpad_Clauses();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause <em>Landingpad Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Landingpad Clause</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.LandingpadClause
   * @generated
   */
  EClass getLandingpadClause();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getLandingPadType <em>Landing Pad Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Landing Pad Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getLandingPadType()
   * @see #getLandingpadClause()
   * @generated
   */
  EAttribute getLandingpadClause_LandingPadType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getCatchType <em>Catch Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Catch Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getCatchType()
   * @see #getLandingpadClause()
   * @generated
   */
  EReference getLandingpadClause_CatchType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getArrayType()
   * @see #getLandingpadClause()
   * @generated
   */
  EReference getLandingpadClause_ArrayType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getArrayConstant <em>Array Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Constant</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getArrayConstant()
   * @see #getLandingpadClause()
   * @generated
   */
  EReference getLandingpadClause_ArrayConstant();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.TypedValue <em>Typed Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Value</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypedValue
   * @generated
   */
  EClass getTypedValue();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.TypedValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypedValue#getType()
   * @see #getTypedValue()
   * @generated
   */
  EReference getTypedValue_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.TypedValue#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypedValue#getRef()
   * @see #getTypedValue()
   * @generated
   */
  EReference getTypedValue_Ref();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ParameterType
   * @generated
   */
  EClass getParameterType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ParameterType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ParameterType#getType()
   * @see #getParameterType()
   * @generated
   */
  EReference getParameterType_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ParameterType#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attrs</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ParameterType#getAttrs()
   * @see #getParameterType()
   * @generated
   */
  EReference getParameterType_Attrs();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ParameterAttributes <em>Parameter Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ParameterAttributes
   * @generated
   */
  EClass getParameterAttributes();

  /**
   * Returns the meta object for the attribute list '{@link com.intel.llvm.ireditor.lLVM_IR.ParameterAttributes#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Attributes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ParameterAttributes#getAttributes()
   * @see #getParameterAttributes()
   * @generated
   */
  EAttribute getParameterAttributes_Attributes();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Argument#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Argument#getType()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Argument#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Argument#getRef()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Ref();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType <em>Non Void Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Void Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonVoidType
   * @generated
   */
  EClass getNonVoidType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getBaseType()
   * @see #getNonVoidType()
   * @generated
   */
  EReference getNonVoidType_BaseType();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getSuffixes <em>Suffixes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Suffixes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getSuffixes()
   * @see #getNonVoidType()
   * @generated
   */
  EReference getNonVoidType_Suffixes();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getStars <em>Stars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stars</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getStars()
   * @see #getNonVoidType()
   * @generated
   */
  EReference getNonVoidType_Stars();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Star <em>Star</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Star</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Star
   * @generated
   */
  EClass getStar();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Star#getAddressSpace <em>Address Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address Space</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Star#getAddressSpace()
   * @see #getStar()
   * @generated
   */
  EReference getStar_AddressSpace();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.Type#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Type#getBaseType()
   * @see #getType()
   * @generated
   */
  EReference getType_BaseType();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Type#getStars <em>Stars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stars</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Type#getStars()
   * @see #getType()
   * @generated
   */
  EReference getType_Stars();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.Type#getSuffixes <em>Suffixes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Suffixes</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.Type#getSuffixes()
   * @see #getType()
   * @generated
   */
  EReference getType_Suffixes();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.TypeSuffix <em>Type Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Suffix</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypeSuffix
   * @generated
   */
  EClass getTypeSuffix();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.TypeSuffix#getContainedTypes <em>Contained Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contained Types</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypeSuffix#getContainedTypes()
   * @see #getTypeSuffix()
   * @generated
   */
  EReference getTypeSuffix_ContainedTypes();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.TypeSuffix#getVararg <em>Vararg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vararg</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypeSuffix#getVararg()
   * @see #getTypeSuffix()
   * @generated
   */
  EAttribute getTypeSuffix_Vararg();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.TypeSuffix#getStars <em>Stars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stars</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypeSuffix#getStars()
   * @see #getTypeSuffix()
   * @generated
   */
  EReference getTypeSuffix_Stars();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType <em>Non Left Recursive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Left Recursive Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType
   * @generated
   */
  EClass getNonLeftRecursiveType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType#getType()
   * @see #getNonLeftRecursiveType()
   * @generated
   */
  EReference getNonLeftRecursiveType_Type();

  /**
   * Returns the meta object for the reference '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType#getTypedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typedef</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType#getTypedef()
   * @see #getNonLeftRecursiveType()
   * @generated
   */
  EReference getNonLeftRecursiveType_Typedef();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType <em>Non Left Recursive Non Void Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Left Recursive Non Void Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType
   * @generated
   */
  EClass getNonLeftRecursiveNonVoidType();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType#getType()
   * @see #getNonLeftRecursiveNonVoidType()
   * @generated
   */
  EReference getNonLeftRecursiveNonVoidType_Type();

  /**
   * Returns the meta object for the reference '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType#getTypedef <em>Typedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typedef</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType#getTypedef()
   * @see #getNonLeftRecursiveNonVoidType()
   * @generated
   */
  EReference getNonLeftRecursiveNonVoidType_Typedef();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.TypeDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypeDef#getName()
   * @see #getTypeDef()
   * @generated
   */
  EAttribute getTypeDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.TypeDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.TypeDef#getType()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_Type();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.OpaqueType <em>Opaque Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Opaque Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.OpaqueType
   * @generated
   */
  EClass getOpaqueType();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.StructType <em>Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.StructType
   * @generated
   */
  EClass getStructType();

  /**
   * Returns the meta object for the containment reference list '{@link com.intel.llvm.ireditor.lLVM_IR.StructType#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.StructType#getTypes()
   * @see #getStructType()
   * @generated
   */
  EReference getStructType_Types();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.StructType#getPacked <em>Packed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Packed</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.StructType#getPacked()
   * @see #getStructType()
   * @generated
   */
  EAttribute getStructType_Packed();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.VectorType <em>Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorType
   * @generated
   */
  EClass getVectorType();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.VectorType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorType#getSize()
   * @see #getVectorType()
   * @generated
   */
  EAttribute getVectorType_Size();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.VectorType#getElemType <em>Elem Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.VectorType#getElemType()
   * @see #getVectorType()
   * @generated
   */
  EReference getVectorType_ElemType();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for the attribute '{@link com.intel.llvm.ireditor.lLVM_IR.ArrayType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArrayType#getSize()
   * @see #getArrayType()
   * @generated
   */
  EAttribute getArrayType_Size();

  /**
   * Returns the meta object for the containment reference '{@link com.intel.llvm.ireditor.lLVM_IR.ArrayType#getElemType <em>Elem Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.ArrayType#getElemType()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_ElemType();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.X86mmxType <em>X8 6mmx Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>X8 6mmx Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.X86mmxType
   * @generated
   */
  EClass getX86mmxType();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.VoidType <em>Void Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.VoidType
   * @generated
   */
  EClass getVoidType();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataType <em>Metadata Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.MetadataType
   * @generated
   */
  EClass getMetadataType();

  /**
   * Returns the meta object for class '{@link com.intel.llvm.ireditor.lLVM_IR.FloatingType <em>Floating Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Floating Type</em>'.
   * @see com.intel.llvm.ireditor.lLVM_IR.FloatingType
   * @generated
   */
  EClass getFloatingType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LLVM_IRFactory getLLVM_IRFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ModelImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TopLevelElementImpl <em>Top Level Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.TopLevelElementImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTopLevelElement()
     * @generated
     */
    EClass TOP_LEVEL_ELEMENT = eINSTANCE.getTopLevelElement();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.AttributeGroupImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAttributeGroup()
     * @generated
     */
    EClass ATTRIBUTE_GROUP = eINSTANCE.getAttributeGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_GROUP__NAME = eINSTANCE.getAttributeGroup_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_GROUP__ATTRIBUTES = eINSTANCE.getAttributeGroup_Attributes();

    /**
     * The meta object literal for the '<em><b>Alignstack</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_GROUP__ALIGNSTACK = eINSTANCE.getAttributeGroup_Alignstack();

    /**
     * The meta object literal for the '<em><b>Alignstack Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_GROUP__ALIGNSTACK_VALUE = eINSTANCE.getAttributeGroup_AlignstackValue();

    /**
     * The meta object literal for the '<em><b>Target Specific Attributes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_GROUP__TARGET_SPECIFIC_ATTRIBUTES = eINSTANCE.getAttributeGroup_TargetSpecificAttributes();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedMetadataImpl <em>Named Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.NamedMetadataImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNamedMetadata()
     * @generated
     */
    EClass NAMED_METADATA = eINSTANCE.getNamedMetadata();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_METADATA__NAME = eINSTANCE.getNamedMetadata_Name();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_METADATA__NODE = eINSTANCE.getNamedMetadata_Node();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataRefImpl <em>Metadata Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataRefImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataRef()
     * @generated
     */
    EClass METADATA_REF = eINSTANCE.getMetadataRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METADATA_REF__REF = eINSTANCE.getMetadataRef_Ref();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ValueRefImpl <em>Value Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ValueRefImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getValueRef()
     * @generated
     */
    EClass VALUE_REF = eINSTANCE.getValueRef();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueRefImpl <em>Global Value Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueRefImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getGlobalValueRef()
     * @generated
     */
    EClass GLOBAL_VALUE_REF = eINSTANCE.getGlobalValueRef();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VALUE_REF__CONSTANT = eINSTANCE.getGlobalValueRef_Constant();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VALUE_REF__METADATA = eINSTANCE.getGlobalValueRef_Metadata();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.LocalValueRefImpl <em>Local Value Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LocalValueRefImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getLocalValueRef()
     * @generated
     */
    EClass LOCAL_VALUE_REF = eINSTANCE.getLocalValueRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VALUE_REF__REF = eINSTANCE.getLocalValueRef_Ref();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueImpl <em>Global Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getGlobalValue()
     * @generated
     */
    EClass GLOBAL_VALUE = eINSTANCE.getGlobalValue();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueDefImpl <em>Global Value Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueDefImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getGlobalValueDef()
     * @generated
     */
    EClass GLOBAL_VALUE_DEF = eINSTANCE.getGlobalValueDef();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.LocalValueImpl <em>Local Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LocalValueImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getLocalValue()
     * @generated
     */
    EClass LOCAL_VALUE = eINSTANCE.getLocalValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VALUE__NAME = eINSTANCE.getLocalValue_Name();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedInstructionImpl <em>Named Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.NamedInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNamedInstruction()
     * @generated
     */
    EClass NAMED_INSTRUCTION = eINSTANCE.getNamedInstruction();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.InstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__METADATA = eINSTANCE.getInstruction_Metadata();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliasImpl <em>Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.AliasImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAlias()
     * @generated
     */
    EClass ALIAS = eINSTANCE.getAlias();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__NAME = eINSTANCE.getAlias_Name();

    /**
     * The meta object literal for the '<em><b>Linkage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__LINKAGE = eINSTANCE.getAlias_Linkage();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__VISIBILITY = eINSTANCE.getAlias_Visibility();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS__TYPE = eINSTANCE.getAlias_Type();

    /**
     * The meta object literal for the '<em><b>Aliasee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS__ALIASEE = eINSTANCE.getAlias_Aliasee();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliaseeImpl <em>Aliasee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.AliaseeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAliasee()
     * @generated
     */
    EClass ALIASEE = eINSTANCE.getAliasee();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIASEE__REF = eINSTANCE.getAliasee_Ref();

    /**
     * The meta object literal for the '<em><b>Bitcast</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIASEE__BITCAST = eINSTANCE.getAliasee_Bitcast();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TargetInfoImpl <em>Target Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.TargetInfoImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTargetInfo()
     * @generated
     */
    EClass TARGET_INFO = eINSTANCE.getTargetInfo();

    /**
     * The meta object literal for the '<em><b>Info Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_INFO__INFO_TYPE = eINSTANCE.getTargetInfo_InfoType();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_INFO__LAYOUT = eINSTANCE.getTargetInfo_Layout();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.InlineAsmImpl <em>Inline Asm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.InlineAsmImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInlineAsm()
     * @generated
     */
    EClass INLINE_ASM = eINSTANCE.getInlineAsm();

    /**
     * The meta object literal for the '<em><b>Asm Line</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INLINE_ASM__ASM_LINE = eINSTANCE.getInlineAsm_AsmLine();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getGlobalVariable()
     * @generated
     */
    EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VARIABLE__NAME = eINSTANCE.getGlobalVariable_Name();

    /**
     * The meta object literal for the '<em><b>Linkage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VARIABLE__LINKAGE = eINSTANCE.getGlobalVariable_Linkage();

    /**
     * The meta object literal for the '<em><b>Addrspace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VARIABLE__ADDRSPACE = eINSTANCE.getGlobalVariable_Addrspace();

    /**
     * The meta object literal for the '<em><b>Tls Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VARIABLE__TLS_MODEL = eINSTANCE.getGlobalVariable_TlsModel();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VARIABLE__INITIAL_VALUE = eINSTANCE.getGlobalVariable_InitialValue();

    /**
     * The meta object literal for the '<em><b>Section</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VARIABLE__SECTION = eINSTANCE.getGlobalVariable_Section();

    /**
     * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VARIABLE__ALIGN = eINSTANCE.getGlobalVariable_Align();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__REF = eINSTANCE.getConstant_Ref();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpressionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression()
     * @generated
     */
    EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_EXPRESSION__OPCODE = eINSTANCE.getConstantExpression_Opcode();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_convertImpl <em>Constant Expression convert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_convertImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_convert()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_CONVERT = eINSTANCE.getConstantExpression_convert();

    /**
     * The meta object literal for the '<em><b>From Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_CONVERT__FROM_TYPE = eINSTANCE.getConstantExpression_convert_FromType();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_CONVERT__CONSTANT = eINSTANCE.getConstantExpression_convert_Constant();

    /**
     * The meta object literal for the '<em><b>Target Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE = eINSTANCE.getConstantExpression_convert_TargetType();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_getelementptrImpl <em>Constant Expression getelementptr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_getelementptrImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_getelementptr()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_GETELEMENTPTR = eINSTANCE.getConstantExpression_getelementptr();

    /**
     * The meta object literal for the '<em><b>Constant Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE = eINSTANCE.getConstantExpression_getelementptr_ConstantType();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT = eINSTANCE.getConstantExpression_getelementptr_Constant();

    /**
     * The meta object literal for the '<em><b>Index Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_GETELEMENTPTR__INDEX_TYPES = eINSTANCE.getConstantExpression_getelementptr_IndexTypes();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_GETELEMENTPTR__INDICES = eINSTANCE.getConstantExpression_getelementptr_Indices();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_selectImpl <em>Constant Expression select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_selectImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_select()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_SELECT = eINSTANCE.getConstantExpression_select();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_SELECT__CONDITION = eINSTANCE.getConstantExpression_select_Condition();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_SELECT__OP1 = eINSTANCE.getConstantExpression_select_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_SELECT__OP2 = eINSTANCE.getConstantExpression_select_Op2();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_compareImpl <em>Constant Expression compare</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_compareImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_compare()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_COMPARE = eINSTANCE.getConstantExpression_compare();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_EXPRESSION_COMPARE__CONDITION = eINSTANCE.getConstantExpression_compare_Condition();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_COMPARE__OP1 = eINSTANCE.getConstantExpression_compare_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_COMPARE__OP2 = eINSTANCE.getConstantExpression_compare_Op2();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractelementImpl <em>Constant Expression extractelement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractelementImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_extractelement()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_EXTRACTELEMENT = eINSTANCE.getConstantExpression_extractelement();

    /**
     * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR = eINSTANCE.getConstantExpression_extractelement_Vector();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX = eINSTANCE.getConstantExpression_extractelement_Index();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertelementImpl <em>Constant Expression insertelement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertelementImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_insertelement()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_INSERTELEMENT = eINSTANCE.getConstantExpression_insertelement();

    /**
     * The meta object literal for the '<em><b>Vector Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE = eINSTANCE.getConstantExpression_insertelement_VectorType();

    /**
     * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR = eINSTANCE.getConstantExpression_insertelement_Vector();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT = eINSTANCE.getConstantExpression_insertelement_Element();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_INSERTELEMENT__INDEX = eINSTANCE.getConstantExpression_insertelement_Index();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_shufflevectorImpl <em>Constant Expression shufflevector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_shufflevectorImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_shufflevector()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_SHUFFLEVECTOR = eINSTANCE.getConstantExpression_shufflevector();

    /**
     * The meta object literal for the '<em><b>Vector1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_SHUFFLEVECTOR__VECTOR1 = eINSTANCE.getConstantExpression_shufflevector_Vector1();

    /**
     * The meta object literal for the '<em><b>Vector2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_SHUFFLEVECTOR__VECTOR2 = eINSTANCE.getConstantExpression_shufflevector_Vector2();

    /**
     * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_SHUFFLEVECTOR__MASK = eINSTANCE.getConstantExpression_shufflevector_Mask();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractvalueImpl <em>Constant Expression extractvalue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractvalueImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_extractvalue()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_EXTRACTVALUE = eINSTANCE.getConstantExpression_extractvalue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_EXTRACTVALUE__VALUE = eINSTANCE.getConstantExpression_extractvalue_Value();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_EXPRESSION_EXTRACTVALUE__INDICES = eINSTANCE.getConstantExpression_extractvalue_Indices();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertvalueImpl <em>Constant Expression insertvalue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertvalueImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_insertvalue()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_INSERTVALUE = eINSTANCE.getConstantExpression_insertvalue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_INSERTVALUE__VALUE = eINSTANCE.getConstantExpression_insertvalue_Value();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT = eINSTANCE.getConstantExpression_insertvalue_Element();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_EXPRESSION_INSERTVALUE__INDICES = eINSTANCE.getConstantExpression_insertvalue_Indices();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_binaryImpl <em>Constant Expression binary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_binaryImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantExpression_binary()
     * @generated
     */
    EClass CONSTANT_EXPRESSION_BINARY = eINSTANCE.getConstantExpression_binary();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_BINARY__OP1 = eINSTANCE.getConstantExpression_binary_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_EXPRESSION_BINARY__OP2 = eINSTANCE.getConstantExpression_binary_Op2();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.UndefImpl <em>Undef</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.UndefImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getUndef()
     * @generated
     */
    EClass UNDEF = eINSTANCE.getUndef();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BlockAddressImpl <em>Block Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.BlockAddressImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBlockAddress()
     * @generated
     */
    EClass BLOCK_ADDRESS = eINSTANCE.getBlockAddress();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_ADDRESS__FUNCTION = eINSTANCE.getBlockAddress_Function();

    /**
     * The meta object literal for the '<em><b>Basic Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_ADDRESS__BASIC_BLOCK = eINSTANCE.getBlockAddress_BasicBlock();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ZeroInitializerImpl <em>Zero Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ZeroInitializerImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getZeroInitializer()
     * @generated
     */
    EClass ZERO_INITIALIZER = eINSTANCE.getZeroInitializer();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.StructureConstantImpl <em>Structure Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.StructureConstantImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getStructureConstant()
     * @generated
     */
    EClass STRUCTURE_CONSTANT = eINSTANCE.getStructureConstant();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_CONSTANT__LIST = eINSTANCE.getStructureConstant_List();

    /**
     * The meta object literal for the '<em><b>Packed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_CONSTANT__PACKED = eINSTANCE.getStructureConstant_Packed();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ArrayConstantImpl <em>Array Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ArrayConstantImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getArrayConstant()
     * @generated
     */
    EClass ARRAY_CONSTANT = eINSTANCE.getArrayConstant();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_CONSTANT__LIST = eINSTANCE.getArrayConstant_List();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.VectorConstantImpl <em>Vector Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.VectorConstantImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getVectorConstant()
     * @generated
     */
    EClass VECTOR_CONSTANT = eINSTANCE.getVectorConstant();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_CONSTANT__LIST = eINSTANCE.getVectorConstant_List();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantListImpl <em>Constant List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConstantListImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConstantList()
     * @generated
     */
    EClass CONSTANT_LIST = eINSTANCE.getConstantList();

    /**
     * The meta object literal for the '<em><b>Typed Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_LIST__TYPED_CONSTANTS = eINSTANCE.getConstantList_TypedConstants();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypedConstantImpl <em>Typed Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypedConstantImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTypedConstant()
     * @generated
     */
    EClass TYPED_CONSTANT = eINSTANCE.getTypedConstant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_CONSTANT__TYPE = eINSTANCE.getTypedConstant_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_CONSTANT__VALUE = eINSTANCE.getTypedConstant_Value();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.SimpleConstantImpl <em>Simple Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.SimpleConstantImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getSimpleConstant()
     * @generated
     */
    EClass SIMPLE_CONSTANT = eINSTANCE.getSimpleConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CONSTANT__VALUE = eINSTANCE.getSimpleConstant_Value();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeImpl <em>Metadata Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataNode()
     * @generated
     */
    EClass METADATA_NODE = eINSTANCE.getMetadataNode();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METADATA_NODE__ELEMENTS = eINSTANCE.getMetadataNode_Elements();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeElementImpl <em>Metadata Node Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeElementImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataNodeElement()
     * @generated
     */
    EClass METADATA_NODE_ELEMENT = eINSTANCE.getMetadataNodeElement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METADATA_NODE_ELEMENT__VALUE = eINSTANCE.getMetadataNodeElement_Value();

    /**
     * The meta object literal for the '<em><b>Metadata Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METADATA_NODE_ELEMENT__METADATA_REF = eINSTANCE.getMetadataNodeElement_MetadataRef();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATA_NODE_ELEMENT__NULL = eINSTANCE.getMetadataNodeElement_Null();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataStringImpl <em>Metadata String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataStringImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataString()
     * @generated
     */
    EClass METADATA_STRING = eINSTANCE.getMetadataString();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATA_STRING__NAME = eINSTANCE.getMetadataString_Name();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AddressSpaceImpl <em>Address Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.AddressSpaceImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAddressSpace()
     * @generated
     */
    EClass ADDRESS_SPACE = eINSTANCE.getAddressSpace();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS_SPACE__VALUE = eINSTANCE.getAddressSpace_Value();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__HEADER = eINSTANCE.getFunction_Header();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionDefImpl <em>Function Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionDefImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionDef()
     * @generated
     */
    EClass FUNCTION_DEF = eINSTANCE.getFunctionDef();

    /**
     * The meta object literal for the '<em><b>Basic Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEF__BASIC_BLOCKS = eINSTANCE.getFunctionDef_BasicBlocks();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionDeclImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionDecl()
     * @generated
     */
    EClass FUNCTION_DECL = eINSTANCE.getFunctionDecl();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl <em>Function Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionHeader()
     * @generated
     */
    EClass FUNCTION_HEADER = eINSTANCE.getFunctionHeader();

    /**
     * The meta object literal for the '<em><b>Linkage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADER__LINKAGE = eINSTANCE.getFunctionHeader_Linkage();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADER__VISIBILITY = eINSTANCE.getFunctionHeader_Visibility();

    /**
     * The meta object literal for the '<em><b>Cconv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADER__CCONV = eINSTANCE.getFunctionHeader_Cconv();

    /**
     * The meta object literal for the '<em><b>Rettype Attrs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_HEADER__RETTYPE_ATTRS = eINSTANCE.getFunctionHeader_RettypeAttrs();

    /**
     * The meta object literal for the '<em><b>Rettype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_HEADER__RETTYPE = eINSTANCE.getFunctionHeader_Rettype();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADER__NAME = eINSTANCE.getFunctionHeader_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_HEADER__PARAMETERS = eINSTANCE.getFunctionHeader_Parameters();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_HEADER__ATTRS = eINSTANCE.getFunctionHeader_Attrs();

    /**
     * The meta object literal for the '<em><b>Section</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADER__SECTION = eINSTANCE.getFunctionHeader_Section();

    /**
     * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADER__ALIGN = eINSTANCE.getFunctionHeader_Align();

    /**
     * The meta object literal for the '<em><b>Gc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_HEADER__GC = eINSTANCE.getFunctionHeader_Gc();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ParametersImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getParameters()
     * @generated
     */
    EClass PARAMETERS = eINSTANCE.getParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERS__PARAMETERS = eINSTANCE.getParameters_Parameters();

    /**
     * The meta object literal for the '<em><b>Vararg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETERS__VARARG = eINSTANCE.getParameters_Vararg();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributesImpl <em>Function Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributesImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionAttributes()
     * @generated
     */
    EClass FUNCTION_ATTRIBUTES = eINSTANCE.getFunctionAttributes();

    /**
     * The meta object literal for the '<em><b>Function Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTES = eINSTANCE.getFunctionAttributes_FunctionAttributes();

    /**
     * The meta object literal for the '<em><b>Alignstack</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ATTRIBUTES__ALIGNSTACK = eINSTANCE.getFunctionAttributes_Alignstack();

    /**
     * The meta object literal for the '<em><b>Alignstack Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_ATTRIBUTES__ALIGNSTACK_VALUE = eINSTANCE.getFunctionAttributes_AlignstackValue();

    /**
     * The meta object literal for the '<em><b>Function Attribute Group Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTE_GROUP_REFS = eINSTANCE.getFunctionAttributes_FunctionAttributeGroupRefs();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AlignStackImpl <em>Align Stack</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.AlignStackImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAlignStack()
     * @generated
     */
    EClass ALIGN_STACK = eINSTANCE.getAlignStack();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributeImpl <em>Function Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFunctionAttribute()
     * @generated
     */
    EClass FUNCTION_ATTRIBUTE = eINSTANCE.getFunctionAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getFunctionAttribute_Attribute();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BasicBlockImpl <em>Basic Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.BasicBlockImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBasicBlock()
     * @generated
     */
    EClass BASIC_BLOCK = eINSTANCE.getBasicBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_BLOCK__NAME = eINSTANCE.getBasicBlock_Name();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_BLOCK__INSTRUCTIONS = eINSTANCE.getBasicBlock_Instructions();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataSuffixImpl <em>Metadata Suffix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataSuffixImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataSuffix()
     * @generated
     */
    EClass METADATA_SUFFIX = eINSTANCE.getMetadataSuffix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATA_SUFFIX__NAME = eINSTANCE.getMetadataSuffix_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METADATA_SUFFIX__VALUE = eINSTANCE.getMetadataSuffix_Value();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.StartingInstructionImpl <em>Starting Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.StartingInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getStartingInstruction()
     * @generated
     */
    EClass STARTING_INSTRUCTION = eINSTANCE.getStartingInstruction();

    /**
     * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STARTING_INSTRUCTION__INSTRUCTION = eINSTANCE.getStartingInstruction_Instruction();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MiddleInstructionImpl <em>Middle Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.MiddleInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMiddleInstruction()
     * @generated
     */
    EClass MIDDLE_INSTRUCTION = eINSTANCE.getMiddleInstruction();

    /**
     * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIDDLE_INSTRUCTION__INSTRUCTION = eINSTANCE.getMiddleInstruction_Instruction();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedMiddleInstructionImpl <em>Named Middle Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.NamedMiddleInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNamedMiddleInstruction()
     * @generated
     */
    EClass NAMED_MIDDLE_INSTRUCTION = eINSTANCE.getNamedMiddleInstruction();

    /**
     * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_MIDDLE_INSTRUCTION__INSTRUCTION = eINSTANCE.getNamedMiddleInstruction_Instruction();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TerminatorInstructionImpl <em>Terminator Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.TerminatorInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTerminatorInstruction()
     * @generated
     */
    EClass TERMINATOR_INSTRUCTION = eINSTANCE.getTerminatorInstruction();

    /**
     * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINATOR_INSTRUCTION__INSTRUCTION = eINSTANCE.getTerminatorInstruction_Instruction();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NamedTerminatorInstructionImpl <em>Named Terminator Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.NamedTerminatorInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNamedTerminatorInstruction()
     * @generated
     */
    EClass NAMED_TERMINATOR_INSTRUCTION = eINSTANCE.getNamedTerminatorInstruction();

    /**
     * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_TERMINATOR_INSTRUCTION__INSTRUCTION = eINSTANCE.getNamedTerminatorInstruction_Instruction();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_retImpl <em>Instruction ret</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_retImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_ret()
     * @generated
     */
    EClass INSTRUCTION_RET = eINSTANCE.getInstruction_ret();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_RET__OPCODE = eINSTANCE.getInstruction_ret_Opcode();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_RET__VAL = eINSTANCE.getInstruction_ret_Val();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_brImpl <em>Instruction br</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_brImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_br()
     * @generated
     */
    EClass INSTRUCTION_BR = eINSTANCE.getInstruction_br();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_BR__OPCODE = eINSTANCE.getInstruction_br_Opcode();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_BR__CONDITION = eINSTANCE.getInstruction_br_Condition();

    /**
     * The meta object literal for the '<em><b>True</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_BR__TRUE = eINSTANCE.getInstruction_br_True();

    /**
     * The meta object literal for the '<em><b>False</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_BR__FALSE = eINSTANCE.getInstruction_br_False();

    /**
     * The meta object literal for the '<em><b>Unconditional</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_BR__UNCONDITIONAL = eINSTANCE.getInstruction_br_Unconditional();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_switchImpl <em>Instruction switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_switchImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_switch()
     * @generated
     */
    EClass INSTRUCTION_SWITCH = eINSTANCE.getInstruction_switch();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_SWITCH__OPCODE = eINSTANCE.getInstruction_switch_Opcode();

    /**
     * The meta object literal for the '<em><b>Comparison Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SWITCH__COMPARISON_VALUE = eINSTANCE.getInstruction_switch_ComparisonValue();

    /**
     * The meta object literal for the '<em><b>Default Dest</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SWITCH__DEFAULT_DEST = eINSTANCE.getInstruction_switch_DefaultDest();

    /**
     * The meta object literal for the '<em><b>Case Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SWITCH__CASE_CONDITIONS = eINSTANCE.getInstruction_switch_CaseConditions();

    /**
     * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SWITCH__DESTINATIONS = eINSTANCE.getInstruction_switch_Destinations();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_indirectbrImpl <em>Instruction indirectbr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_indirectbrImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_indirectbr()
     * @generated
     */
    EClass INSTRUCTION_INDIRECTBR = eINSTANCE.getInstruction_indirectbr();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_INDIRECTBR__OPCODE = eINSTANCE.getInstruction_indirectbr_Opcode();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INDIRECTBR__ADDRESS = eINSTANCE.getInstruction_indirectbr_Address();

    /**
     * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INDIRECTBR__DESTINATIONS = eINSTANCE.getInstruction_indirectbr_Destinations();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invoke_voidImpl <em>Instruction invoke void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invoke_voidImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_invoke_void()
     * @generated
     */
    EClass INSTRUCTION_INVOKE_VOID = eINSTANCE.getInstruction_invoke_void();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_INVOKE_VOID__OPCODE = eINSTANCE.getInstruction_invoke_void_Opcode();

    /**
     * The meta object literal for the '<em><b>Cconv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_INVOKE_VOID__CCONV = eINSTANCE.getInstruction_invoke_void_Cconv();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_VOID__TYPE = eINSTANCE.getInstruction_invoke_void_Type();

    /**
     * The meta object literal for the '<em><b>Callee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_VOID__CALLEE = eINSTANCE.getInstruction_invoke_void_Callee();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_VOID__ARGS = eINSTANCE.getInstruction_invoke_void_Args();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_VOID__ATTRIBUTES = eINSTANCE.getInstruction_invoke_void_Attributes();

    /**
     * The meta object literal for the '<em><b>To Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_VOID__TO_LABEL = eINSTANCE.getInstruction_invoke_void_ToLabel();

    /**
     * The meta object literal for the '<em><b>Exception Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_VOID__EXCEPTION_LABEL = eINSTANCE.getInstruction_invoke_void_ExceptionLabel();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invoke_nonVoidImpl <em>Instruction invoke non Void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_invoke_nonVoidImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_invoke_nonVoid()
     * @generated
     */
    EClass INSTRUCTION_INVOKE_NON_VOID = eINSTANCE.getInstruction_invoke_nonVoid();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_INVOKE_NON_VOID__OPCODE = eINSTANCE.getInstruction_invoke_nonVoid_Opcode();

    /**
     * The meta object literal for the '<em><b>Cconv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_INVOKE_NON_VOID__CCONV = eINSTANCE.getInstruction_invoke_nonVoid_Cconv();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_NON_VOID__TYPE = eINSTANCE.getInstruction_invoke_nonVoid_Type();

    /**
     * The meta object literal for the '<em><b>Callee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_NON_VOID__CALLEE = eINSTANCE.getInstruction_invoke_nonVoid_Callee();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_NON_VOID__ARGS = eINSTANCE.getInstruction_invoke_nonVoid_Args();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_NON_VOID__ATTRIBUTES = eINSTANCE.getInstruction_invoke_nonVoid_Attributes();

    /**
     * The meta object literal for the '<em><b>To Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_NON_VOID__TO_LABEL = eINSTANCE.getInstruction_invoke_nonVoid_ToLabel();

    /**
     * The meta object literal for the '<em><b>Exception Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INVOKE_NON_VOID__EXCEPTION_LABEL = eINSTANCE.getInstruction_invoke_nonVoid_ExceptionLabel();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_resumeImpl <em>Instruction resume</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_resumeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_resume()
     * @generated
     */
    EClass INSTRUCTION_RESUME = eINSTANCE.getInstruction_resume();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_RESUME__OPCODE = eINSTANCE.getInstruction_resume_Opcode();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_RESUME__VALUE = eINSTANCE.getInstruction_resume_Value();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_unreachableImpl <em>Instruction unreachable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_unreachableImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_unreachable()
     * @generated
     */
    EClass INSTRUCTION_UNREACHABLE = eINSTANCE.getInstruction_unreachable();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_UNREACHABLE__OPCODE = eINSTANCE.getInstruction_unreachable_Opcode();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BasicBlockRefImpl <em>Basic Block Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.BasicBlockRefImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBasicBlockRef()
     * @generated
     */
    EClass BASIC_BLOCK_REF = eINSTANCE.getBasicBlockRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_BLOCK_REF__REF = eINSTANCE.getBasicBlockRef_Ref();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BinaryInstructionImpl <em>Binary Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.BinaryInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBinaryInstruction()
     * @generated
     */
    EClass BINARY_INSTRUCTION = eINSTANCE.getBinaryInstruction();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_INSTRUCTION__OPCODE = eINSTANCE.getBinaryInstruction_Opcode();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_INSTRUCTION__TYPE = eINSTANCE.getBinaryInstruction_Type();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_INSTRUCTION__OP1 = eINSTANCE.getBinaryInstruction_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_INSTRUCTION__OP2 = eINSTANCE.getBinaryInstruction_Op2();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_addImpl <em>Instruction add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_addImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_add()
     * @generated
     */
    EClass INSTRUCTION_ADD = eINSTANCE.getInstruction_add();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_faddImpl <em>Instruction fadd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_faddImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fadd()
     * @generated
     */
    EClass INSTRUCTION_FADD = eINSTANCE.getInstruction_fadd();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_subImpl <em>Instruction sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_subImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_sub()
     * @generated
     */
    EClass INSTRUCTION_SUB = eINSTANCE.getInstruction_sub();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fsubImpl <em>Instruction fsub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fsubImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fsub()
     * @generated
     */
    EClass INSTRUCTION_FSUB = eINSTANCE.getInstruction_fsub();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_mulImpl <em>Instruction mul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_mulImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_mul()
     * @generated
     */
    EClass INSTRUCTION_MUL = eINSTANCE.getInstruction_mul();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fmulImpl <em>Instruction fmul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fmulImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fmul()
     * @generated
     */
    EClass INSTRUCTION_FMUL = eINSTANCE.getInstruction_fmul();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_udivImpl <em>Instruction udiv</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_udivImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_udiv()
     * @generated
     */
    EClass INSTRUCTION_UDIV = eINSTANCE.getInstruction_udiv();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_sdivImpl <em>Instruction sdiv</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_sdivImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_sdiv()
     * @generated
     */
    EClass INSTRUCTION_SDIV = eINSTANCE.getInstruction_sdiv();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fdivImpl <em>Instruction fdiv</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fdivImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fdiv()
     * @generated
     */
    EClass INSTRUCTION_FDIV = eINSTANCE.getInstruction_fdiv();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_uremImpl <em>Instruction urem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_uremImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_urem()
     * @generated
     */
    EClass INSTRUCTION_UREM = eINSTANCE.getInstruction_urem();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_sremImpl <em>Instruction srem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_sremImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_srem()
     * @generated
     */
    EClass INSTRUCTION_SREM = eINSTANCE.getInstruction_srem();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fremImpl <em>Instruction frem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fremImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_frem()
     * @generated
     */
    EClass INSTRUCTION_FREM = eINSTANCE.getInstruction_frem();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.BitwiseBinaryInstructionImpl <em>Bitwise Binary Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.BitwiseBinaryInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getBitwiseBinaryInstruction()
     * @generated
     */
    EClass BITWISE_BINARY_INSTRUCTION = eINSTANCE.getBitwiseBinaryInstruction();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BITWISE_BINARY_INSTRUCTION__OPCODE = eINSTANCE.getBitwiseBinaryInstruction_Opcode();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_BINARY_INSTRUCTION__TYPE = eINSTANCE.getBitwiseBinaryInstruction_Type();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_BINARY_INSTRUCTION__OP1 = eINSTANCE.getBitwiseBinaryInstruction_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_BINARY_INSTRUCTION__OP2 = eINSTANCE.getBitwiseBinaryInstruction_Op2();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shlImpl <em>Instruction shl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shlImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_shl()
     * @generated
     */
    EClass INSTRUCTION_SHL = eINSTANCE.getInstruction_shl();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_lshrImpl <em>Instruction lshr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_lshrImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_lshr()
     * @generated
     */
    EClass INSTRUCTION_LSHR = eINSTANCE.getInstruction_lshr();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_ashrImpl <em>Instruction ashr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_ashrImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_ashr()
     * @generated
     */
    EClass INSTRUCTION_ASHR = eINSTANCE.getInstruction_ashr();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_andImpl <em>Instruction and</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_andImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_and()
     * @generated
     */
    EClass INSTRUCTION_AND = eINSTANCE.getInstruction_and();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_orImpl <em>Instruction or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_orImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_or()
     * @generated
     */
    EClass INSTRUCTION_OR = eINSTANCE.getInstruction_or();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_xorImpl <em>Instruction xor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_xorImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_xor()
     * @generated
     */
    EClass INSTRUCTION_XOR = eINSTANCE.getInstruction_xor();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.VectorInstructionsImpl <em>Vector Instructions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.VectorInstructionsImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getVectorInstructions()
     * @generated
     */
    EClass VECTOR_INSTRUCTIONS = eINSTANCE.getVectorInstructions();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR_INSTRUCTIONS__OPCODE = eINSTANCE.getVectorInstructions_Opcode();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_extractelementImpl <em>Instruction extractelement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_extractelementImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_extractelement()
     * @generated
     */
    EClass INSTRUCTION_EXTRACTELEMENT = eINSTANCE.getInstruction_extractelement();

    /**
     * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_EXTRACTELEMENT__VECTOR = eINSTANCE.getInstruction_extractelement_Vector();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_EXTRACTELEMENT__INDEX = eINSTANCE.getInstruction_extractelement_Index();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_insertelementImpl <em>Instruction insertelement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_insertelementImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_insertelement()
     * @generated
     */
    EClass INSTRUCTION_INSERTELEMENT = eINSTANCE.getInstruction_insertelement();

    /**
     * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INSERTELEMENT__VECTOR = eINSTANCE.getInstruction_insertelement_Vector();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INSERTELEMENT__ELEMENT = eINSTANCE.getInstruction_insertelement_Element();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INSERTELEMENT__INDEX = eINSTANCE.getInstruction_insertelement_Index();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shufflevectorImpl <em>Instruction shufflevector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shufflevectorImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_shufflevector()
     * @generated
     */
    EClass INSTRUCTION_SHUFFLEVECTOR = eINSTANCE.getInstruction_shufflevector();

    /**
     * The meta object literal for the '<em><b>Vector1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SHUFFLEVECTOR__VECTOR1 = eINSTANCE.getInstruction_shufflevector_Vector1();

    /**
     * The meta object literal for the '<em><b>Vector2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SHUFFLEVECTOR__VECTOR2 = eINSTANCE.getInstruction_shufflevector_Vector2();

    /**
     * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SHUFFLEVECTOR__MASK = eINSTANCE.getInstruction_shufflevector_Mask();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.AggregateInstructionImpl <em>Aggregate Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.AggregateInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getAggregateInstruction()
     * @generated
     */
    EClass AGGREGATE_INSTRUCTION = eINSTANCE.getAggregateInstruction();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGGREGATE_INSTRUCTION__OPCODE = eINSTANCE.getAggregateInstruction_Opcode();

    /**
     * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGGREGATE_INSTRUCTION__AGGREGATE = eINSTANCE.getAggregateInstruction_Aggregate();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGGREGATE_INSTRUCTION__INDICES = eINSTANCE.getAggregateInstruction_Indices();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_extractvalueImpl <em>Instruction extractvalue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_extractvalueImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_extractvalue()
     * @generated
     */
    EClass INSTRUCTION_EXTRACTVALUE = eINSTANCE.getInstruction_extractvalue();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_insertvalueImpl <em>Instruction insertvalue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_insertvalueImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_insertvalue()
     * @generated
     */
    EClass INSTRUCTION_INSERTVALUE = eINSTANCE.getInstruction_insertvalue();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_INSERTVALUE__ELEMENT = eINSTANCE.getInstruction_insertvalue_Element();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MemoryInstructionImpl <em>Memory Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.MemoryInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMemoryInstruction()
     * @generated
     */
    EClass MEMORY_INSTRUCTION = eINSTANCE.getMemoryInstruction();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMORY_INSTRUCTION__OPCODE = eINSTANCE.getMemoryInstruction_Opcode();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_allocaImpl <em>Instruction alloca</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_allocaImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_alloca()
     * @generated
     */
    EClass INSTRUCTION_ALLOCA = eINSTANCE.getInstruction_alloca();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_ALLOCA__TYPE = eINSTANCE.getInstruction_alloca_Type();

    /**
     * The meta object literal for the '<em><b>Num Elements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_ALLOCA__NUM_ELEMENTS = eINSTANCE.getInstruction_alloca_NumElements();

    /**
     * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_ALLOCA__ALIGNMENT = eINSTANCE.getInstruction_alloca_Alignment();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_loadImpl <em>Instruction load</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_loadImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_load()
     * @generated
     */
    EClass INSTRUCTION_LOAD = eINSTANCE.getInstruction_load();

    /**
     * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_LOAD__POINTER = eINSTANCE.getInstruction_load_Pointer();

    /**
     * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_LOAD__ALIGNMENT = eINSTANCE.getInstruction_load_Alignment();

    /**
     * The meta object literal for the '<em><b>Nontemporal Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_LOAD__NONTEMPORAL_INDEX = eINSTANCE.getInstruction_load_NontemporalIndex();

    /**
     * The meta object literal for the '<em><b>Invariant Load Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_LOAD__INVARIANT_LOAD_INDEX = eINSTANCE.getInstruction_load_InvariantLoadIndex();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_LOAD__ORDERING = eINSTANCE.getInstruction_load_Ordering();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_storeImpl <em>Instruction store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_storeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_store()
     * @generated
     */
    EClass INSTRUCTION_STORE = eINSTANCE.getInstruction_store();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_STORE__VALUE = eINSTANCE.getInstruction_store_Value();

    /**
     * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_STORE__POINTER = eINSTANCE.getInstruction_store_Pointer();

    /**
     * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_STORE__ALIGNMENT = eINSTANCE.getInstruction_store_Alignment();

    /**
     * The meta object literal for the '<em><b>Nontemporal Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_STORE__NONTEMPORAL_INDEX = eINSTANCE.getInstruction_store_NontemporalIndex();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_STORE__ORDERING = eINSTANCE.getInstruction_store_Ordering();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fenceImpl <em>Instruction fence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fenceImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fence()
     * @generated
     */
    EClass INSTRUCTION_FENCE = eINSTANCE.getInstruction_fence();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_FENCE__ORDERING = eINSTANCE.getInstruction_fence_Ordering();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_cmpxchgImpl <em>Instruction cmpxchg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_cmpxchgImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_cmpxchg()
     * @generated
     */
    EClass INSTRUCTION_CMPXCHG = eINSTANCE.getInstruction_cmpxchg();

    /**
     * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CMPXCHG__POINTER = eINSTANCE.getInstruction_cmpxchg_Pointer();

    /**
     * The meta object literal for the '<em><b>Compared With</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CMPXCHG__COMPARED_WITH = eINSTANCE.getInstruction_cmpxchg_ComparedWith();

    /**
     * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CMPXCHG__NEW_VALUE = eINSTANCE.getInstruction_cmpxchg_NewValue();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_CMPXCHG__ORDERING = eINSTANCE.getInstruction_cmpxchg_Ordering();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_atomicrmwImpl <em>Instruction atomicrmw</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_atomicrmwImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_atomicrmw()
     * @generated
     */
    EClass INSTRUCTION_ATOMICRMW = eINSTANCE.getInstruction_atomicrmw();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_ATOMICRMW__OPERATION = eINSTANCE.getInstruction_atomicrmw_Operation();

    /**
     * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_ATOMICRMW__POINTER = eINSTANCE.getInstruction_atomicrmw_Pointer();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_ATOMICRMW__ARGUMENT = eINSTANCE.getInstruction_atomicrmw_Argument();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_ATOMICRMW__ORDERING = eINSTANCE.getInstruction_atomicrmw_Ordering();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_getelementptrImpl <em>Instruction getelementptr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_getelementptrImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_getelementptr()
     * @generated
     */
    EClass INSTRUCTION_GETELEMENTPTR = eINSTANCE.getInstruction_getelementptr();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_GETELEMENTPTR__BASE = eINSTANCE.getInstruction_getelementptr_Base();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_GETELEMENTPTR__INDICES = eINSTANCE.getInstruction_getelementptr_Indices();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConversionInstructionImpl <em>Conversion Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ConversionInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getConversionInstruction()
     * @generated
     */
    EClass CONVERSION_INSTRUCTION = eINSTANCE.getConversionInstruction();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONVERSION_INSTRUCTION__OPCODE = eINSTANCE.getConversionInstruction_Opcode();

    /**
     * The meta object literal for the '<em><b>From Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONVERSION_INSTRUCTION__FROM_TYPE = eINSTANCE.getConversionInstruction_FromType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONVERSION_INSTRUCTION__VALUE = eINSTANCE.getConversionInstruction_Value();

    /**
     * The meta object literal for the '<em><b>Target Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONVERSION_INSTRUCTION__TARGET_TYPE = eINSTANCE.getConversionInstruction_TargetType();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.OtherInstructionImpl <em>Other Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.OtherInstructionImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getOtherInstruction()
     * @generated
     */
    EClass OTHER_INSTRUCTION = eINSTANCE.getOtherInstruction();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OTHER_INSTRUCTION__OPCODE = eINSTANCE.getOtherInstruction_Opcode();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_icmpImpl <em>Instruction icmp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_icmpImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_icmp()
     * @generated
     */
    EClass INSTRUCTION_ICMP = eINSTANCE.getInstruction_icmp();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_ICMP__CONDITION = eINSTANCE.getInstruction_icmp_Condition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_ICMP__TYPE = eINSTANCE.getInstruction_icmp_Type();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_ICMP__OP1 = eINSTANCE.getInstruction_icmp_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_ICMP__OP2 = eINSTANCE.getInstruction_icmp_Op2();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fcmpImpl <em>Instruction fcmp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fcmpImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_fcmp()
     * @generated
     */
    EClass INSTRUCTION_FCMP = eINSTANCE.getInstruction_fcmp();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_FCMP__CONDITION = eINSTANCE.getInstruction_fcmp_Condition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_FCMP__TYPE = eINSTANCE.getInstruction_fcmp_Type();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_FCMP__OP1 = eINSTANCE.getInstruction_fcmp_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_FCMP__OP2 = eINSTANCE.getInstruction_fcmp_Op2();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_phiImpl <em>Instruction phi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_phiImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_phi()
     * @generated
     */
    EClass INSTRUCTION_PHI = eINSTANCE.getInstruction_phi();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_PHI__OPCODE = eINSTANCE.getInstruction_phi_Opcode();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_PHI__TYPE = eINSTANCE.getInstruction_phi_Type();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_PHI__VALUES = eINSTANCE.getInstruction_phi_Values();

    /**
     * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_PHI__LABELS = eINSTANCE.getInstruction_phi_Labels();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_selectImpl <em>Instruction select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_selectImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_select()
     * @generated
     */
    EClass INSTRUCTION_SELECT = eINSTANCE.getInstruction_select();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SELECT__CONDITION = eINSTANCE.getInstruction_select_Condition();

    /**
     * The meta object literal for the '<em><b>Value1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SELECT__VALUE1 = eINSTANCE.getInstruction_select_Value1();

    /**
     * The meta object literal for the '<em><b>Value2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SELECT__VALUE2 = eINSTANCE.getInstruction_select_Value2();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl <em>Instruction call non Void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_call_nonVoid()
     * @generated
     */
    EClass INSTRUCTION_CALL_NON_VOID = eINSTANCE.getInstruction_call_nonVoid();

    /**
     * The meta object literal for the '<em><b>Is Tail</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_CALL_NON_VOID__IS_TAIL = eINSTANCE.getInstruction_call_nonVoid_IsTail();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_CALL_NON_VOID__OPCODE = eINSTANCE.getInstruction_call_nonVoid_Opcode();

    /**
     * The meta object literal for the '<em><b>Cconv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_CALL_NON_VOID__CCONV = eINSTANCE.getInstruction_call_nonVoid_Cconv();

    /**
     * The meta object literal for the '<em><b>Return Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES = eINSTANCE.getInstruction_call_nonVoid_ReturnAttributes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_NON_VOID__TYPE = eINSTANCE.getInstruction_call_nonVoid_Type();

    /**
     * The meta object literal for the '<em><b>Callee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_NON_VOID__CALLEE = eINSTANCE.getInstruction_call_nonVoid_Callee();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_NON_VOID__ARGS = eINSTANCE.getInstruction_call_nonVoid_Args();

    /**
     * The meta object literal for the '<em><b>Function Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES = eINSTANCE.getInstruction_call_nonVoid_FunctionAttributes();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_voidImpl <em>Instruction call void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_voidImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_call_void()
     * @generated
     */
    EClass INSTRUCTION_CALL_VOID = eINSTANCE.getInstruction_call_void();

    /**
     * The meta object literal for the '<em><b>Is Tail</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_CALL_VOID__IS_TAIL = eINSTANCE.getInstruction_call_void_IsTail();

    /**
     * The meta object literal for the '<em><b>Opcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_CALL_VOID__OPCODE = eINSTANCE.getInstruction_call_void_Opcode();

    /**
     * The meta object literal for the '<em><b>Cconv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_CALL_VOID__CCONV = eINSTANCE.getInstruction_call_void_Cconv();

    /**
     * The meta object literal for the '<em><b>Return Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_VOID__RETURN_ATTRIBUTES = eINSTANCE.getInstruction_call_void_ReturnAttributes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_VOID__TYPE = eINSTANCE.getInstruction_call_void_Type();

    /**
     * The meta object literal for the '<em><b>Callee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_VOID__CALLEE = eINSTANCE.getInstruction_call_void_Callee();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_VOID__ARGS = eINSTANCE.getInstruction_call_void_Args();

    /**
     * The meta object literal for the '<em><b>Function Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_CALL_VOID__FUNCTION_ATTRIBUTES = eINSTANCE.getInstruction_call_void_FunctionAttributes();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ArgListImpl <em>Arg List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ArgListImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getArgList()
     * @generated
     */
    EClass ARG_LIST = eINSTANCE.getArgList();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_LIST__ARGUMENTS = eINSTANCE.getArgList_Arguments();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.CalleeImpl <em>Callee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.CalleeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getCallee()
     * @generated
     */
    EClass CALLEE = eINSTANCE.getCallee();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.InlineAssemblerImpl <em>Inline Assembler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.InlineAssemblerImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInlineAssembler()
     * @generated
     */
    EClass INLINE_ASSEMBLER = eINSTANCE.getInlineAssembler();

    /**
     * The meta object literal for the '<em><b>Assembler</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INLINE_ASSEMBLER__ASSEMBLER = eINSTANCE.getInlineAssembler_Assembler();

    /**
     * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INLINE_ASSEMBLER__FLAGS = eINSTANCE.getInlineAssembler_Flags();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_va_argImpl <em>Instruction va arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_va_argImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_va_arg()
     * @generated
     */
    EClass INSTRUCTION_VA_ARG = eINSTANCE.getInstruction_va_arg();

    /**
     * The meta object literal for the '<em><b>Arglist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_VA_ARG__ARGLIST = eINSTANCE.getInstruction_va_arg_Arglist();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_VA_ARG__TYPE = eINSTANCE.getInstruction_va_arg_Type();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_landingpadImpl <em>Instruction landingpad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_landingpadImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getInstruction_landingpad()
     * @generated
     */
    EClass INSTRUCTION_LANDINGPAD = eINSTANCE.getInstruction_landingpad();

    /**
     * The meta object literal for the '<em><b>Result Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_LANDINGPAD__RESULT_TYPE = eINSTANCE.getInstruction_landingpad_ResultType();

    /**
     * The meta object literal for the '<em><b>Personality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_LANDINGPAD__PERSONALITY = eINSTANCE.getInstruction_landingpad_Personality();

    /**
     * The meta object literal for the '<em><b>Clauses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_LANDINGPAD__CLAUSES = eINSTANCE.getInstruction_landingpad_Clauses();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.LandingpadClauseImpl <em>Landingpad Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LandingpadClauseImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getLandingpadClause()
     * @generated
     */
    EClass LANDINGPAD_CLAUSE = eINSTANCE.getLandingpadClause();

    /**
     * The meta object literal for the '<em><b>Landing Pad Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANDINGPAD_CLAUSE__LANDING_PAD_TYPE = eINSTANCE.getLandingpadClause_LandingPadType();

    /**
     * The meta object literal for the '<em><b>Catch Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANDINGPAD_CLAUSE__CATCH_TYPE = eINSTANCE.getLandingpadClause_CatchType();

    /**
     * The meta object literal for the '<em><b>Array Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANDINGPAD_CLAUSE__ARRAY_TYPE = eINSTANCE.getLandingpadClause_ArrayType();

    /**
     * The meta object literal for the '<em><b>Array Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANDINGPAD_CLAUSE__ARRAY_CONSTANT = eINSTANCE.getLandingpadClause_ArrayConstant();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypedValueImpl <em>Typed Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypedValueImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTypedValue()
     * @generated
     */
    EClass TYPED_VALUE = eINSTANCE.getTypedValue();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_VALUE__TYPE = eINSTANCE.getTypedValue_Type();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_VALUE__REF = eINSTANCE.getTypedValue_Ref();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ParameterTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getParameterType()
     * @generated
     */
    EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_TYPE__TYPE = eINSTANCE.getParameterType_Type();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_TYPE__ATTRS = eINSTANCE.getParameterType_Attrs();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ParameterAttributesImpl <em>Parameter Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ParameterAttributesImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getParameterAttributes()
     * @generated
     */
    EClass PARAMETER_ATTRIBUTES = eINSTANCE.getParameterAttributes();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_ATTRIBUTES__ATTRIBUTES = eINSTANCE.getParameterAttributes_Attributes();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ArgumentImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__REF = eINSTANCE.getArgument_Ref();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ParameterImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NonVoidTypeImpl <em>Non Void Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.NonVoidTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNonVoidType()
     * @generated
     */
    EClass NON_VOID_TYPE = eINSTANCE.getNonVoidType();

    /**
     * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_VOID_TYPE__BASE_TYPE = eINSTANCE.getNonVoidType_BaseType();

    /**
     * The meta object literal for the '<em><b>Suffixes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_VOID_TYPE__SUFFIXES = eINSTANCE.getNonVoidType_Suffixes();

    /**
     * The meta object literal for the '<em><b>Stars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_VOID_TYPE__STARS = eINSTANCE.getNonVoidType_Stars();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.StarImpl <em>Star</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.StarImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getStar()
     * @generated
     */
    EClass STAR = eINSTANCE.getStar();

    /**
     * The meta object literal for the '<em><b>Address Space</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAR__ADDRESS_SPACE = eINSTANCE.getStar_AddressSpace();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__BASE_TYPE = eINSTANCE.getType_BaseType();

    /**
     * The meta object literal for the '<em><b>Stars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__STARS = eINSTANCE.getType_Stars();

    /**
     * The meta object literal for the '<em><b>Suffixes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__SUFFIXES = eINSTANCE.getType_Suffixes();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypeSuffixImpl <em>Type Suffix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypeSuffixImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTypeSuffix()
     * @generated
     */
    EClass TYPE_SUFFIX = eINSTANCE.getTypeSuffix();

    /**
     * The meta object literal for the '<em><b>Contained Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_SUFFIX__CONTAINED_TYPES = eINSTANCE.getTypeSuffix_ContainedTypes();

    /**
     * The meta object literal for the '<em><b>Vararg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SUFFIX__VARARG = eINSTANCE.getTypeSuffix_Vararg();

    /**
     * The meta object literal for the '<em><b>Stars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_SUFFIX__STARS = eINSTANCE.getTypeSuffix_Stars();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveTypeImpl <em>Non Left Recursive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNonLeftRecursiveType()
     * @generated
     */
    EClass NON_LEFT_RECURSIVE_TYPE = eINSTANCE.getNonLeftRecursiveType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_LEFT_RECURSIVE_TYPE__TYPE = eINSTANCE.getNonLeftRecursiveType_Type();

    /**
     * The meta object literal for the '<em><b>Typedef</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_LEFT_RECURSIVE_TYPE__TYPEDEF = eINSTANCE.getNonLeftRecursiveType_Typedef();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveNonVoidTypeImpl <em>Non Left Recursive Non Void Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveNonVoidTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getNonLeftRecursiveNonVoidType()
     * @generated
     */
    EClass NON_LEFT_RECURSIVE_NON_VOID_TYPE = eINSTANCE.getNonLeftRecursiveNonVoidType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE = eINSTANCE.getNonLeftRecursiveNonVoidType_Type();

    /**
     * The meta object literal for the '<em><b>Typedef</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPEDEF = eINSTANCE.getNonLeftRecursiveNonVoidType_Typedef();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.TypeDefImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEF__NAME = eINSTANCE.getTypeDef_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__TYPE = eINSTANCE.getTypeDef_Type();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.IntTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.OpaqueTypeImpl <em>Opaque Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.OpaqueTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getOpaqueType()
     * @generated
     */
    EClass OPAQUE_TYPE = eINSTANCE.getOpaqueType();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.StructTypeImpl <em>Struct Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.StructTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getStructType()
     * @generated
     */
    EClass STRUCT_TYPE = eINSTANCE.getStructType();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_TYPE__TYPES = eINSTANCE.getStructType_Types();

    /**
     * The meta object literal for the '<em><b>Packed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_TYPE__PACKED = eINSTANCE.getStructType_Packed();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.VectorTypeImpl <em>Vector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.VectorTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getVectorType()
     * @generated
     */
    EClass VECTOR_TYPE = eINSTANCE.getVectorType();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR_TYPE__SIZE = eINSTANCE.getVectorType_Size();

    /**
     * The meta object literal for the '<em><b>Elem Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_TYPE__ELEM_TYPE = eINSTANCE.getVectorType_ElemType();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.ArrayTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getArrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getArrayType();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_TYPE__SIZE = eINSTANCE.getArrayType_Size();

    /**
     * The meta object literal for the '<em><b>Elem Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__ELEM_TYPE = eINSTANCE.getArrayType_ElemType();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.X86mmxTypeImpl <em>X8 6mmx Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.X86mmxTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getX86mmxType()
     * @generated
     */
    EClass X8_6MMX_TYPE = eINSTANCE.getX86mmxType();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.VoidTypeImpl <em>Void Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.VoidTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getVoidType()
     * @generated
     */
    EClass VOID_TYPE = eINSTANCE.getVoidType();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.MetadataTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getMetadataType()
     * @generated
     */
    EClass METADATA_TYPE = eINSTANCE.getMetadataType();

    /**
     * The meta object literal for the '{@link com.intel.llvm.ireditor.lLVM_IR.impl.FloatingTypeImpl <em>Floating Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.FloatingTypeImpl
     * @see com.intel.llvm.ireditor.lLVM_IR.impl.LLVM_IRPackageImpl#getFloatingType()
     * @generated
     */
    EClass FLOATING_TYPE = eINSTANCE.getFloatingType();

  }

} //LLVM_IRPackage
