/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Node Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getValue <em>Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getMetadataRef <em>Metadata Ref</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getNull <em>Null</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getMetadataNodeElement()
 * @model
 * @generated
 */
public interface MetadataNodeElement extends EObject
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
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getMetadataNodeElement_Value()
   * @model containment="true"
   * @generated
   */
  TypedValue getValue();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(TypedValue value);

  /**
   * Returns the value of the '<em><b>Metadata Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metadata Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metadata Ref</em>' containment reference.
   * @see #setMetadataRef(MetadataRef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getMetadataNodeElement_MetadataRef()
   * @model containment="true"
   * @generated
   */
  MetadataRef getMetadataRef();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getMetadataRef <em>Metadata Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metadata Ref</em>' containment reference.
   * @see #getMetadataRef()
   * @generated
   */
  void setMetadataRef(MetadataRef value);

  /**
   * Returns the value of the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' attribute.
   * @see #setNull(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getMetadataNodeElement_Null()
   * @model
   * @generated
   */
  String getNull();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement#getNull <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' attribute.
   * @see #getNull()
   * @generated
   */
  void setNull(String value);

} // MetadataNodeElement
