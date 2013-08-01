/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConstantList#getTypedConstants <em>Typed Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantList()
 * @model
 * @generated
 */
public interface ConstantList extends EObject
{
  /**
   * Returns the value of the '<em><b>Typed Constants</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.TypedConstant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typed Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typed Constants</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantList_TypedConstants()
   * @model containment="true"
   * @generated
   */
  EList<TypedConstant> getTypedConstants();

} // ConstantList
