/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionRef#getIntrinsic <em>Intrinsic</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionRef()
 * @model
 * @generated
 */
public interface FunctionRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Intrinsic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intrinsic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intrinsic</em>' attribute.
   * @see #setIntrinsic(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionRef_Intrinsic()
   * @model
   * @generated
   */
  String getIntrinsic();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionRef#getIntrinsic <em>Intrinsic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intrinsic</em>' attribute.
   * @see #getIntrinsic()
   * @generated
   */
  void setIntrinsic(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(FunctionHeader)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionRef_Ref()
   * @model
   * @generated
   */
  FunctionHeader getRef();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionRef#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(FunctionHeader value);

} // FunctionRef
