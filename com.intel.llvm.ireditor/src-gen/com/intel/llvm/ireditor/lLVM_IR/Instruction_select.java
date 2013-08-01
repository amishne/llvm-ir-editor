/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getValue1 <em>Value1</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getValue2 <em>Value2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_select()
 * @model
 * @generated
 */
public interface Instruction_select extends OtherInstruction
{
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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_select_Condition()
   * @model containment="true"
   * @generated
   */
  TypedValue getCondition();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(TypedValue value);

  /**
   * Returns the value of the '<em><b>Value1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value1</em>' containment reference.
   * @see #setValue1(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_select_Value1()
   * @model containment="true"
   * @generated
   */
  TypedValue getValue1();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getValue1 <em>Value1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value1</em>' containment reference.
   * @see #getValue1()
   * @generated
   */
  void setValue1(TypedValue value);

  /**
   * Returns the value of the '<em><b>Value2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value2</em>' containment reference.
   * @see #setValue2(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_select_Value2()
   * @model containment="true"
   * @generated
   */
  TypedValue getValue2();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_select#getValue2 <em>Value2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value2</em>' containment reference.
   * @see #getValue2()
   * @generated
   */
  void setValue2(TypedValue value);

} // Instruction_select
