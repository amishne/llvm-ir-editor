/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landingpad Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getLandingPadType <em>Landing Pad Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getCatchType <em>Catch Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getArrayConstant <em>Array Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getLandingpadClause()
 * @model
 * @generated
 */
public interface LandingpadClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Landing Pad Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Landing Pad Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Landing Pad Type</em>' attribute.
   * @see #setLandingPadType(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getLandingpadClause_LandingPadType()
   * @model
   * @generated
   */
  String getLandingPadType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getLandingPadType <em>Landing Pad Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Landing Pad Type</em>' attribute.
   * @see #getLandingPadType()
   * @generated
   */
  void setLandingPadType(String value);

  /**
   * Returns the value of the '<em><b>Catch Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catch Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catch Type</em>' containment reference.
   * @see #setCatchType(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getLandingpadClause_CatchType()
   * @model containment="true"
   * @generated
   */
  TypedValue getCatchType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getCatchType <em>Catch Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Catch Type</em>' containment reference.
   * @see #getCatchType()
   * @generated
   */
  void setCatchType(TypedValue value);

  /**
   * Returns the value of the '<em><b>Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Type</em>' containment reference.
   * @see #setArrayType(ArrayType)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getLandingpadClause_ArrayType()
   * @model containment="true"
   * @generated
   */
  ArrayType getArrayType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getArrayType <em>Array Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Type</em>' containment reference.
   * @see #getArrayType()
   * @generated
   */
  void setArrayType(ArrayType value);

  /**
   * Returns the value of the '<em><b>Array Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Constant</em>' containment reference.
   * @see #setArrayConstant(ArrayConstant)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getLandingpadClause_ArrayConstant()
   * @model containment="true"
   * @generated
   */
  ArrayConstant getArrayConstant();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.LandingpadClause#getArrayConstant <em>Array Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Constant</em>' containment reference.
   * @see #getArrayConstant()
   * @generated
   */
  void setArrayConstant(ArrayConstant value);

} // LandingpadClause
