/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Value Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getRef <em>Ref</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getConstant <em>Constant</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalValueRef()
 * @model
 * @generated
 */
public interface GlobalValueRef extends ValueRef
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(GlobalValueDef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalValueRef_Ref()
   * @model
   * @generated
   */
  GlobalValueDef getRef();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(GlobalValueDef value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(Constant)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalValueRef_Constant()
   * @model containment="true"
   * @generated
   */
  Constant getConstant();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Constant value);

  /**
   * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metadata</em>' containment reference.
   * @see #setMetadata(MetadataRef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalValueRef_Metadata()
   * @model containment="true"
   * @generated
   */
  MetadataRef getMetadata();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef#getMetadata <em>Metadata</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metadata</em>' containment reference.
   * @see #getMetadata()
   * @generated
   */
  void setMetadata(MetadataRef value);

} // GlobalValueRef
