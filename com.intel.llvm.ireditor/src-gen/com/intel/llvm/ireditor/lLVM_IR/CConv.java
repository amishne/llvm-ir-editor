/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CConv</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.CConv#getVal <em>Val</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.CConv#getCustomNumber <em>Custom Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getCConv()
 * @model
 * @generated
 */
public interface CConv extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getCConv_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.CConv#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

  /**
   * Returns the value of the '<em><b>Custom Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Number</em>' attribute.
   * @see #setCustomNumber(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getCConv_CustomNumber()
   * @model
   * @generated
   */
  String getCustomNumber();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.CConv#getCustomNumber <em>Custom Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Number</em>' attribute.
   * @see #getCustomNumber()
   * @generated
   */
  void setCustomNumber(String value);

} // CConv
