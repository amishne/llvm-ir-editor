/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Expression extractelement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement#getVector <em>Vector</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_extractelement()
 * @model
 * @generated
 */
public interface ConstantExpression_extractelement extends ConstantExpression
{
  /**
   * Returns the value of the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector</em>' containment reference.
   * @see #setVector(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_extractelement_Vector()
   * @model containment="true"
   * @generated
   */
  TypedValue getVector();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement#getVector <em>Vector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector</em>' containment reference.
   * @see #getVector()
   * @generated
   */
  void setVector(TypedValue value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_extractelement_Index()
   * @model containment="true"
   * @generated
   */
  TypedValue getIndex();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(TypedValue value);

} // ConstantExpression_extractelement
