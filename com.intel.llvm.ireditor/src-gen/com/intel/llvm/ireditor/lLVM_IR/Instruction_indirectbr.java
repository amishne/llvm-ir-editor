/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction indirectbr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getAddress <em>Address</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_indirectbr()
 * @model
 * @generated
 */
public interface Instruction_indirectbr extends EObject
{
  /**
   * Returns the value of the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opcode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opcode</em>' attribute.
   * @see #setOpcode(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_indirectbr_Opcode()
   * @model
   * @generated
   */
  String getOpcode();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getOpcode <em>Opcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opcode</em>' attribute.
   * @see #getOpcode()
   * @generated
   */
  void setOpcode(String value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' containment reference.
   * @see #setAddress(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_indirectbr_Address()
   * @model containment="true"
   * @generated
   */
  TypedValue getAddress();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr#getAddress <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' containment reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(TypedValue value);

  /**
   * Returns the value of the '<em><b>Destinations</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destinations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destinations</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_indirectbr_Destinations()
   * @model containment="true"
   * @generated
   */
  EList<BasicBlockRef> getDestinations();

} // Instruction_indirectbr
