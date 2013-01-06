/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getCconv <em>Cconv</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettype <em>Rettype</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getName <em>Name</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getAttrs <em>Attrs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader()
 * @model
 * @generated
 */
public interface FunctionHeader extends GlobalValueDef
{
  /**
   * Returns the value of the '<em><b>Linkage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Linkage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Linkage</em>' attribute.
   * @see #setLinkage(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Linkage()
   * @model
   * @generated
   */
  String getLinkage();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getLinkage <em>Linkage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linkage</em>' attribute.
   * @see #getLinkage()
   * @generated
   */
  void setLinkage(String value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see #setVisibility(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Visibility()
   * @model
   * @generated
   */
  String getVisibility();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(String value);

  /**
   * Returns the value of the '<em><b>Cconv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cconv</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cconv</em>' attribute.
   * @see #setCconv(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Cconv()
   * @model
   * @generated
   */
  String getCconv();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getCconv <em>Cconv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cconv</em>' attribute.
   * @see #getCconv()
   * @generated
   */
  void setCconv(String value);

  /**
   * Returns the value of the '<em><b>Rettype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rettype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rettype</em>' containment reference.
   * @see #setRettype(ParameterType)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Rettype()
   * @model containment="true"
   * @generated
   */
  ParameterType getRettype();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettype <em>Rettype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rettype</em>' containment reference.
   * @see #getRettype()
   * @generated
   */
  void setRettype(ParameterType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Attrs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' containment reference.
   * @see #setAttrs(FunctionAttributes)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Attrs()
   * @model containment="true"
   * @generated
   */
  FunctionAttributes getAttrs();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getAttrs <em>Attrs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrs</em>' containment reference.
   * @see #getAttrs()
   * @generated
   */
  void setAttrs(FunctionAttributes value);

} // FunctionHeader
