/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.TargetInfo#getInfoType <em>Info Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.TargetInfo#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getTargetInfo()
 * @model
 * @generated
 */
public interface TargetInfo extends TopLevelElement
{
  /**
   * Returns the value of the '<em><b>Info Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Info Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Info Type</em>' attribute.
   * @see #setInfoType(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getTargetInfo_InfoType()
   * @model
   * @generated
   */
  String getInfoType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.TargetInfo#getInfoType <em>Info Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info Type</em>' attribute.
   * @see #getInfoType()
   * @generated
   */
  void setInfoType(String value);

  /**
   * Returns the value of the '<em><b>Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' attribute.
   * @see #setLayout(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getTargetInfo_Layout()
   * @model
   * @generated
   */
  String getLayout();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.TargetInfo#getLayout <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' attribute.
   * @see #getLayout()
   * @generated
   */
  void setLayout(String value);

} // TargetInfo
