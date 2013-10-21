/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getName <em>Name</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getAlignstack <em>Alignstack</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getAlignstackValue <em>Alignstack Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getTargetSpecificAttributes <em>Target Specific Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAttributeGroup()
 * @model
 * @generated
 */
public interface AttributeGroup extends TopLevelElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAttributeGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAttributeGroup_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<FunctionAttribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Alignstack</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.AlignStack}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alignstack</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alignstack</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAttributeGroup_Alignstack()
   * @model containment="true"
   * @generated
   */
  EList<AlignStack> getAlignstack();

  /**
   * Returns the value of the '<em><b>Alignstack Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alignstack Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alignstack Value</em>' attribute list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAttributeGroup_AlignstackValue()
   * @model unique="false"
   * @generated
   */
  EList<String> getAlignstackValue();

  /**
   * Returns the value of the '<em><b>Target Specific Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.TargetSpecificAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Specific Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Specific Attributes</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAttributeGroup_TargetSpecificAttributes()
   * @model containment="true"
   * @generated
   */
  EList<TargetSpecificAttribute> getTargetSpecificAttributes();

} // AttributeGroup
