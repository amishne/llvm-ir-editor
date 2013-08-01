/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Star</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Star#getAddressSpace <em>Address Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getStar()
 * @model
 * @generated
 */
public interface Star extends EObject
{
  /**
   * Returns the value of the '<em><b>Address Space</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address Space</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address Space</em>' containment reference.
   * @see #setAddressSpace(AddressSpace)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getStar_AddressSpace()
   * @model containment="true"
   * @generated
   */
  AddressSpace getAddressSpace();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Star#getAddressSpace <em>Address Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address Space</em>' containment reference.
   * @see #getAddressSpace()
   * @generated
   */
  void setAddressSpace(AddressSpace value);

} // Star
