/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aliasee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Aliasee#getRef <em>Ref</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.Aliasee#getBitcast <em>Bitcast</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAliasee()
 * @model
 * @generated
 */
public interface Aliasee extends EObject
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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAliasee_Ref()
   * @model
   * @generated
   */
  GlobalValueDef getRef();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Aliasee#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(GlobalValueDef value);

  /**
   * Returns the value of the '<em><b>Bitcast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bitcast</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bitcast</em>' containment reference.
   * @see #setBitcast(ConstantExpression_convert)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getAliasee_Bitcast()
   * @model containment="true"
   * @generated
   */
  ConstantExpression_convert getBitcast();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.Aliasee#getBitcast <em>Bitcast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bitcast</em>' containment reference.
   * @see #getBitcast()
   * @generated
   */
  void setBitcast(ConstantExpression_convert value);

} // Aliasee
