/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Expression extractvalue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue#getValue <em>Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_extractvalue()
 * @model
 * @generated
 */
public interface ConstantExpression_extractvalue extends ConstantExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(TypedValue)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_extractvalue_Value()
   * @model containment="true"
   * @generated
   */
  TypedValue getValue();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractvalue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(TypedValue value);

  /**
   * Returns the value of the '<em><b>Indices</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indices</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' attribute list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConstantExpression_extractvalue_Indices()
   * @model unique="false"
   * @generated
   */
  EList<String> getIndices();

} // ConstantExpression_extractvalue
