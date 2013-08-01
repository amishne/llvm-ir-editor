/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Expression select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getOp1 <em>Op1</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getOp2 <em>Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_select()
 * @model
 * @generated
 */
public interface ConstantExpression_select extends ConstantExpression
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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_select_Condition()
   * @model containment="true"
   * @generated
   */
  TypedValue getCondition();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(TypedValue value);

  /**
   * Returns the value of the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op1</em>' containment reference.
   * @see #setOp1(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_select_Op1()
   * @model containment="true"
   * @generated
   */
  TypedValue getOp1();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getOp1 <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op1</em>' containment reference.
   * @see #getOp1()
   * @generated
   */
  void setOp1(TypedValue value);

  /**
   * Returns the value of the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' containment reference.
   * @see #setOp2(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_select_Op2()
   * @model containment="true"
   * @generated
   */
  TypedValue getOp2();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_select#getOp2 <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' containment reference.
   * @see #getOp2()
   * @generated
   */
  void setOp2(TypedValue value);

} // ConstantExpression_select
