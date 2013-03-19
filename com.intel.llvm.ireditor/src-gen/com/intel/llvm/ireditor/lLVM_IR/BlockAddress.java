/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.BlockAddress#getFunction <em>Function</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.BlockAddress#getBasicBlock <em>Basic Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getBlockAddress()
 * @model
 * @generated
 */
public interface BlockAddress extends Constant
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(GlobalValueRef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getBlockAddress_Function()
   * @model containment="true"
   * @generated
   */
  GlobalValueRef getFunction();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.BlockAddress#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(GlobalValueRef value);

  /**
   * Returns the value of the '<em><b>Basic Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Block</em>' containment reference.
   * @see #setBasicBlock(BasicBlockRef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getBlockAddress_BasicBlock()
   * @model containment="true"
   * @generated
   */
  BasicBlockRef getBasicBlock();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.BlockAddress#getBasicBlock <em>Basic Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic Block</em>' containment reference.
   * @see #getBasicBlock()
   * @generated
   */
  void setBasicBlock(BasicBlockRef value);

} // BlockAddress
