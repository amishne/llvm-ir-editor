/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Void Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getFunctionSuffix <em>Function Suffix</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getStars <em>Stars</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNonVoidType()
 * @model
 * @generated
 */
public interface NonVoidType extends EObject
{
  /**
   * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Type</em>' containment reference.
   * @see #setBaseType(EObject)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNonVoidType_BaseType()
   * @model containment="true"
   * @generated
   */
  EObject getBaseType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getBaseType <em>Base Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Type</em>' containment reference.
   * @see #getBaseType()
   * @generated
   */
  void setBaseType(EObject value);

  /**
   * Returns the value of the '<em><b>Function Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Suffix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Suffix</em>' containment reference.
   * @see #setFunctionSuffix(FunctionTypeOrPointerToFunctionTypeSuffix)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNonVoidType_FunctionSuffix()
   * @model containment="true"
   * @generated
   */
  FunctionTypeOrPointerToFunctionTypeSuffix getFunctionSuffix();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.NonVoidType#getFunctionSuffix <em>Function Suffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Suffix</em>' containment reference.
   * @see #getFunctionSuffix()
   * @generated
   */
  void setFunctionSuffix(FunctionTypeOrPointerToFunctionTypeSuffix value);

  /**
   * Returns the value of the '<em><b>Stars</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.Star}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stars</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNonVoidType_Stars()
   * @model containment="true"
   * @generated
   */
  EList<Star> getStars();

} // NonVoidType
