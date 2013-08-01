/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction atomicrmw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getPointer <em>Pointer</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getArgument <em>Argument</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_atomicrmw()
 * @model
 * @generated
 */
public interface Instruction_atomicrmw extends MemoryInstruction
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_atomicrmw_Operation()
   * @model
   * @generated
   */
  String getOperation();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
  void setOperation(String value);

  /**
   * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer</em>' containment reference.
   * @see #setPointer(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_atomicrmw_Pointer()
   * @model containment="true"
   * @generated
   */
  TypedValue getPointer();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getPointer <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer</em>' containment reference.
   * @see #getPointer()
   * @generated
   */
  void setPointer(TypedValue value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_atomicrmw_Argument()
   * @model containment="true"
   * @generated
   */
  TypedValue getArgument();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(TypedValue value);

  /**
   * Returns the value of the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering</em>' attribute.
   * @see #setOrdering(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInstruction_atomicrmw_Ordering()
   * @model
   * @generated
   */
  String getOrdering();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Instruction_atomicrmw#getOrdering <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordering</em>' attribute.
   * @see #getOrdering()
   * @generated
   */
  void setOrdering(String value);

} // Instruction_atomicrmw
