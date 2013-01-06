/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Middle Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNamedMiddleInstruction()
 * @model
 * @generated
 */
public interface NamedMiddleInstruction extends NamedInstruction
{
  /**
   * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instruction</em>' containment reference.
   * @see #setInstruction(EObject)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNamedMiddleInstruction_Instruction()
   * @model containment="true"
   * @generated
   */
  EObject getInstruction();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.NamedMiddleInstruction#getInstruction <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' containment reference.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(EObject value);

} // NamedMiddleInstruction
