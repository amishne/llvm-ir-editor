/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Left Recursive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType#getType <em>Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType#getTypedef <em>Typedef</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNonLeftRecursiveType()
 * @model
 * @generated
 */
public interface NonLeftRecursiveType extends EObject
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
   * @see #setType(EObject)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNonLeftRecursiveType_Type()
   * @model containment="true"
   * @generated
   */
  EObject getType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(EObject value);

  /**
   * Returns the value of the '<em><b>Typedef</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typedef</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typedef</em>' reference.
   * @see #setTypedef(TypeDef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNonLeftRecursiveType_Typedef()
   * @model
   * @generated
   */
  TypeDef getTypedef();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType#getTypedef <em>Typedef</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typedef</em>' reference.
   * @see #getTypedef()
   * @generated
   */
  void setTypedef(TypeDef value);

} // NonLeftRecursiveType
