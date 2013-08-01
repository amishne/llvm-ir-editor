/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.VectorType#getSize <em>Size</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.VectorType#getElemType <em>Elem Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getVectorType()
 * @model
 * @generated
 */
public interface VectorType extends EObject
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getVectorType_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.VectorType#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

  /**
   * Returns the value of the '<em><b>Elem Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem Type</em>' containment reference.
   * @see #setElemType(Type)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getVectorType_ElemType()
   * @model containment="true"
   * @generated
   */
  Type getElemType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.VectorType#getElemType <em>Elem Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem Type</em>' containment reference.
   * @see #getElemType()
   * @generated
   */
  void setElemType(Type value);

} // VectorType
