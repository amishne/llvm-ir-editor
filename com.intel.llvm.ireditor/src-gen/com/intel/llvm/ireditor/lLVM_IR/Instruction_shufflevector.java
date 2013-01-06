/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction shufflevector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getVector1 <em>Vector1</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getVector2 <em>Vector2</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_shufflevector()
 * @model
 * @generated
 */
public interface Instruction_shufflevector extends VectorInstructions
{
  /**
   * Returns the value of the '<em><b>Vector1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vector1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector1</em>' containment reference.
   * @see #setVector1(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_shufflevector_Vector1()
   * @model containment="true"
   * @generated
   */
  TypedValue getVector1();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getVector1 <em>Vector1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector1</em>' containment reference.
   * @see #getVector1()
   * @generated
   */
  void setVector1(TypedValue value);

  /**
   * Returns the value of the '<em><b>Vector2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vector2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector2</em>' containment reference.
   * @see #setVector2(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_shufflevector_Vector2()
   * @model containment="true"
   * @generated
   */
  TypedValue getVector2();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getVector2 <em>Vector2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector2</em>' containment reference.
   * @see #getVector2()
   * @generated
   */
  void setVector2(TypedValue value);

  /**
   * Returns the value of the '<em><b>Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mask</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mask</em>' containment reference.
   * @see #setMask(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_shufflevector_Mask()
   * @model containment="true"
   * @generated
   */
  TypedValue getMask();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector#getMask <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mask</em>' containment reference.
   * @see #getMask()
   * @generated
   */
  void setMask(TypedValue value);

} // Instruction_shufflevector
