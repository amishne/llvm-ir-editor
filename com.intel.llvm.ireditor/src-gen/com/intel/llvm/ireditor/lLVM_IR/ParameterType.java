/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ParameterType#getType <em>Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ParameterType#getAttrs <em>Attrs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getParameterType()
 * @model
 * @generated
 */
public interface ParameterType extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getParameterType_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ParameterType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Attrs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' containment reference.
   * @see #setAttrs(ParameterAttributes)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getParameterType_Attrs()
   * @model containment="true"
   * @generated
   */
  ParameterAttributes getAttrs();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ParameterType#getAttrs <em>Attrs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrs</em>' containment reference.
   * @see #getAttrs()
   * @generated
   */
  void setAttrs(ParameterAttributes value);

} // ParameterType
