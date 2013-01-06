/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type Or Pointer To Function Type Suffix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix#getContainedTypes <em>Contained Types</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix#getVararg <em>Vararg</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix#getStars <em>Stars</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionTypeOrPointerToFunctionTypeSuffix()
 * @model
 * @generated
 */
public interface FunctionTypeOrPointerToFunctionTypeSuffix extends EObject
{
  /**
   * Returns the value of the '<em><b>Contained Types</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.ParameterType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contained Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contained Types</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionTypeOrPointerToFunctionTypeSuffix_ContainedTypes()
   * @model containment="true"
   * @generated
   */
  EList<ParameterType> getContainedTypes();

  /**
   * Returns the value of the '<em><b>Vararg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vararg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vararg</em>' attribute.
   * @see #setVararg(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionTypeOrPointerToFunctionTypeSuffix_Vararg()
   * @model
   * @generated
   */
  String getVararg();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix#getVararg <em>Vararg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vararg</em>' attribute.
   * @see #getVararg()
   * @generated
   */
  void setVararg(String value);

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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionTypeOrPointerToFunctionTypeSuffix_Stars()
   * @model containment="true"
   * @generated
   */
  EList<Star> getStars();

} // FunctionTypeOrPointerToFunctionTypeSuffix
