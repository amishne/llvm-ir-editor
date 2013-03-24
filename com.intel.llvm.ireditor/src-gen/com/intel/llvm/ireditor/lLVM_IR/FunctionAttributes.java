/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getFunctionAttributes <em>Function Attributes</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getAlignstack <em>Alignstack</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getAlignstackValue <em>Alignstack Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes#getFunctionAttributeGroupRefs <em>Function Attribute Group Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionAttributes()
 * @model
 * @generated
 */
public interface FunctionAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Function Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Attributes</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionAttributes_FunctionAttributes()
   * @model containment="true"
   * @generated
   */
  EList<FunctionAttribute> getFunctionAttributes();

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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionAttributes_Alignstack()
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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionAttributes_AlignstackValue()
   * @model unique="false"
   * @generated
   */
  EList<String> getAlignstackValue();

  /**
   * Returns the value of the '<em><b>Function Attribute Group Refs</b></em>' reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.AttributeGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Attribute Group Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Attribute Group Refs</em>' reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionAttributes_FunctionAttributeGroupRefs()
   * @model
   * @generated
   */
  EList<AttributeGroup> getFunctionAttributeGroupRefs();

} // FunctionAttributes
