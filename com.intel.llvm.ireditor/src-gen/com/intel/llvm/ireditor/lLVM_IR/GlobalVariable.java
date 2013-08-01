/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getName <em>Name</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getAddrspace <em>Addrspace</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getTlsModel <em>Tls Model</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getType <em>Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getSection <em>Section</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getAlign <em>Align</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalVariable()
 * @model
 * @generated
 */
public interface GlobalVariable extends GlobalValue, GlobalValueDef
{
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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalVariable_Linkage()
   * @model
   * @generated
   */
  String getLinkage();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getLinkage <em>Linkage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linkage</em>' attribute.
   * @see #getLinkage()
   * @generated
   */
  void setLinkage(String value);

  /**
   * Returns the value of the '<em><b>Addrspace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addrspace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addrspace</em>' containment reference.
   * @see #setAddrspace(AddressSpace)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalVariable_Addrspace()
   * @model containment="true"
   * @generated
   */
  AddressSpace getAddrspace();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getAddrspace <em>Addrspace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addrspace</em>' containment reference.
   * @see #getAddrspace()
   * @generated
   */
  void setAddrspace(AddressSpace value);

  /**
   * Returns the value of the '<em><b>Tls Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tls Model</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tls Model</em>' attribute.
   * @see #setTlsModel(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalVariable_TlsModel()
   * @model
   * @generated
   */
  String getTlsModel();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getTlsModel <em>Tls Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tls Model</em>' attribute.
   * @see #getTlsModel()
   * @generated
   */
  void setTlsModel(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalVariable_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Value</em>' containment reference.
   * @see #setInitialValue(Constant)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalVariable_InitialValue()
   * @model containment="true"
   * @generated
   */
  Constant getInitialValue();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getInitialValue <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Value</em>' containment reference.
   * @see #getInitialValue()
   * @generated
   */
  void setInitialValue(Constant value);

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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalVariable_Section()
   * @model
   * @generated
   */
  String getSection();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getSection <em>Section</em>}' attribute.
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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getGlobalVariable_Align()
   * @model
   * @generated
   */
  String getAlign();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.GlobalVariable#getAlign <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align</em>' attribute.
   * @see #getAlign()
   * @generated
   */
  void setAlign(String value);

} // GlobalVariable
