/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction br</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getTrue <em>True</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getFalse <em>False</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getUnconditional <em>Unconditional</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_br()
 * @model
 * @generated
 */
public interface Instruction_br extends EObject
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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_br_Opcode()
   * @model
   * @generated
   */
  String getOpcode();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getOpcode <em>Opcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opcode</em>' attribute.
   * @see #getOpcode()
   * @generated
   */
  void setOpcode(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_br_Condition()
   * @model containment="true"
   * @generated
   */
  TypedValue getCondition();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(TypedValue value);

  /**
   * Returns the value of the '<em><b>True</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True</em>' containment reference.
   * @see #setTrue(BasicBlockRef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_br_True()
   * @model containment="true"
   * @generated
   */
  BasicBlockRef getTrue();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getTrue <em>True</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True</em>' containment reference.
   * @see #getTrue()
   * @generated
   */
  void setTrue(BasicBlockRef value);

  /**
   * Returns the value of the '<em><b>False</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False</em>' containment reference.
   * @see #setFalse(BasicBlockRef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_br_False()
   * @model containment="true"
   * @generated
   */
  BasicBlockRef getFalse();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getFalse <em>False</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False</em>' containment reference.
   * @see #getFalse()
   * @generated
   */
  void setFalse(BasicBlockRef value);

  /**
   * Returns the value of the '<em><b>Unconditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unconditional</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unconditional</em>' containment reference.
   * @see #setUnconditional(BasicBlockRef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_br_Unconditional()
   * @model containment="true"
   * @generated
   */
  BasicBlockRef getUnconditional();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_br#getUnconditional <em>Unconditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unconditional</em>' containment reference.
   * @see #getUnconditional()
   * @generated
   */
  void setUnconditional(BasicBlockRef value);

} // Instruction_br
