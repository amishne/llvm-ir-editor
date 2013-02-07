/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.StructureConstant#getList <em>List</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.StructureConstant#getPacked <em>Packed</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getStructureConstant()
 * @model
 * @generated
 */
public interface StructureConstant extends Constant
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(ConstantList)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getStructureConstant_List()
   * @model containment="true"
   * @generated
   */
  ConstantList getList();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.StructureConstant#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(ConstantList value);

  /**
   * Returns the value of the '<em><b>Packed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packed</em>' attribute.
   * @see #setPacked(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getStructureConstant_Packed()
   * @model
   * @generated
   */
  String getPacked();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.StructureConstant#getPacked <em>Packed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Packed</em>' attribute.
   * @see #getPacked()
   * @generated
   */
  void setPacked(String value);

} // StructureConstant
