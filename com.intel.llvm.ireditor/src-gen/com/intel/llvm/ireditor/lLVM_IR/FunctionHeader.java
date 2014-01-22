/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


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
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettypeAttrs <em>Rettype Attrs</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettype <em>Rettype</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getName <em>Name</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getSection <em>Section</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getAlign <em>Align</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getGc <em>Gc</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getFunctionPrefix <em>Function Prefix</em>}</li>
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
   * Returns the value of the '<em><b>Cconv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cconv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cconv</em>' containment reference.
   * @see #setCconv(CConv)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Cconv()
   * @model containment="true"
   * @generated
   */
  CConv getCconv();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getCconv <em>Cconv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cconv</em>' containment reference.
   * @see #getCconv()
   * @generated
   */
  void setCconv(CConv value);

  /**
   * Returns the value of the '<em><b>Rettype Attrs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rettype Attrs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rettype Attrs</em>' containment reference.
   * @see #setRettypeAttrs(ParameterAttributes)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_RettypeAttrs()
   * @model containment="true"
   * @generated
   */
  ParameterAttributes getRettypeAttrs();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettypeAttrs <em>Rettype Attrs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rettype Attrs</em>' containment reference.
   * @see #getRettypeAttrs()
   * @generated
   */
  void setRettypeAttrs(ParameterAttributes value);

  /**
   * Returns the value of the '<em><b>Rettype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rettype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rettype</em>' containment reference.
   * @see #setRettype(Type)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Rettype()
   * @model containment="true"
   * @generated
   */
  Type getRettype();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getRettype <em>Rettype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rettype</em>' containment reference.
   * @see #getRettype()
   * @generated
   */
  void setRettype(Type value);

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
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(Parameters)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Parameters()
   * @model containment="true"
   * @generated
   */
  Parameters getParameters();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(Parameters value);

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

  /**
   * Returns the value of the '<em><b>Section</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Section</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Section</em>' attribute.
   * @see #setSection(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Section()
   * @model
   * @generated
   */
  String getSection();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getSection <em>Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Section</em>' attribute.
   * @see #getSection()
   * @generated
   */
  void setSection(String value);

  /**
   * Returns the value of the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align</em>' attribute.
   * @see #setAlign(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Align()
   * @model
   * @generated
   */
  String getAlign();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getAlign <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align</em>' attribute.
   * @see #getAlign()
   * @generated
   */
  void setAlign(String value);

  /**
   * Returns the value of the '<em><b>Gc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gc</em>' attribute.
   * @see #setGc(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_Gc()
   * @model
   * @generated
   */
  String getGc();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getGc <em>Gc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gc</em>' attribute.
   * @see #getGc()
   * @generated
   */
  void setGc(String value);

  /**
   * Returns the value of the '<em><b>Function Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Prefix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Prefix</em>' containment reference.
   * @see #setFunctionPrefix(FunctionPrefix)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionHeader_FunctionPrefix()
   * @model containment="true"
   * @generated
   */
  FunctionPrefix getFunctionPrefix();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.FunctionHeader#getFunctionPrefix <em>Function Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Prefix</em>' containment reference.
   * @see #getFunctionPrefix()
   * @generated
   */
  void setFunctionPrefix(FunctionPrefix value);

} // FunctionHeader
