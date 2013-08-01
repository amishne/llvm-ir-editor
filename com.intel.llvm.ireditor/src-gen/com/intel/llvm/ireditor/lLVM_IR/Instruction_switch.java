/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getDefaultDest <em>Default Dest</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getCaseConditions <em>Case Conditions</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_switch()
 * @model
 * @generated
 */
public interface Instruction_switch extends EObject
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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_switch_Opcode()
   * @model
   * @generated
   */
  String getOpcode();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getOpcode <em>Opcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opcode</em>' attribute.
   * @see #getOpcode()
   * @generated
   */
  void setOpcode(String value);

  /**
   * Returns the value of the '<em><b>Comparison Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comparison Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparison Value</em>' containment reference.
   * @see #setComparisonValue(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_switch_ComparisonValue()
   * @model containment="true"
   * @generated
   */
  TypedValue getComparisonValue();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getComparisonValue <em>Comparison Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparison Value</em>' containment reference.
   * @see #getComparisonValue()
   * @generated
   */
  void setComparisonValue(TypedValue value);

  /**
   * Returns the value of the '<em><b>Default Dest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Dest</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Dest</em>' containment reference.
   * @see #setDefaultDest(BasicBlockRef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_switch_DefaultDest()
   * @model containment="true"
   * @generated
   */
  BasicBlockRef getDefaultDest();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_switch#getDefaultDest <em>Default Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Dest</em>' containment reference.
   * @see #getDefaultDest()
   * @generated
   */
  void setDefaultDest(BasicBlockRef value);

  /**
   * Returns the value of the '<em><b>Case Conditions</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.TypedValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Conditions</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_switch_CaseConditions()
   * @model containment="true"
   * @generated
   */
  EList<TypedValue> getCaseConditions();

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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_switch_Destinations()
   * @model containment="true"
   * @generated
   */
  EList<BasicBlockRef> getDestinations();

} // Instruction_switch
