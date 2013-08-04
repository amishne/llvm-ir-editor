/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction fsub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_fsub#getFastMathFlags <em>Fast Math Flags</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_fsub()
 * @model
 * @generated
 */
public interface Instruction_fsub extends BinaryInstruction
{
  /**
   * Returns the value of the '<em><b>Fast Math Flags</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.FastMathFlag}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fast Math Flags</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fast Math Flags</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_fsub_FastMathFlags()
   * @model containment="true"
   * @generated
   */
  EList<FastMathFlag> getFastMathFlags();

} // Instruction_fsub
