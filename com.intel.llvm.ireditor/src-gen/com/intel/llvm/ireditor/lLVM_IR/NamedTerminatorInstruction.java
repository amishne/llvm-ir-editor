/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Terminator Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNamedTerminatorInstruction()
 * @model
 * @generated
 */
public interface NamedTerminatorInstruction extends NamedInstruction
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
   * @see #setInstruction(Instruction_invoke_nonVoid)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getNamedTerminatorInstruction_Instruction()
   * @model containment="true"
   * @generated
   */
  Instruction_invoke_nonVoid getInstruction();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.NamedTerminatorInstruction#getInstruction <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' containment reference.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(Instruction_invoke_nonVoid value);

} // NamedTerminatorInstruction
