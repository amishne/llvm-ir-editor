/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.MetadataNodeElement;
import com.intel.llvm.ireditor.lLVM_IR.MetadataRef;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Node Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeElementImpl#getMetadataRef <em>Metadata Ref</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.MetadataNodeElementImpl#getNull <em>Null</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataNodeElementImpl extends MinimalEObjectImpl.Container implements MetadataNodeElement
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected TypedValue value;

  /**
   * The cached value of the '{@link #getMetadataRef() <em>Metadata Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetadataRef()
   * @generated
   * @ordered
   */
  protected MetadataRef metadataRef;

  /**
   * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected static final String NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected String null_ = NULL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetadataNodeElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LLVM_IRPackage.Literals.METADATA_NODE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(TypedValue newValue, NotificationChain msgs)
  {
    TypedValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.METADATA_NODE_ELEMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(TypedValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.METADATA_NODE_ELEMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.METADATA_NODE_ELEMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.METADATA_NODE_ELEMENT__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataRef getMetadataRef()
  {
    return metadataRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetadataRef(MetadataRef newMetadataRef, NotificationChain msgs)
  {
    MetadataRef oldMetadataRef = metadataRef;
    metadataRef = newMetadataRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.METADATA_NODE_ELEMENT__METADATA_REF, oldMetadataRef, newMetadataRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetadataRef(MetadataRef newMetadataRef)
  {
    if (newMetadataRef != metadataRef)
    {
      NotificationChain msgs = null;
      if (metadataRef != null)
        msgs = ((InternalEObject)metadataRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.METADATA_NODE_ELEMENT__METADATA_REF, null, msgs);
      if (newMetadataRef != null)
        msgs = ((InternalEObject)newMetadataRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.METADATA_NODE_ELEMENT__METADATA_REF, null, msgs);
      msgs = basicSetMetadataRef(newMetadataRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.METADATA_NODE_ELEMENT__METADATA_REF, newMetadataRef, newMetadataRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNull()
  {
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(String newNull)
  {
    String oldNull = null_;
    null_ = newNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.METADATA_NODE_ELEMENT__NULL, oldNull, null_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__VALUE:
        return basicSetValue(null, msgs);
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__METADATA_REF:
        return basicSetMetadataRef(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__VALUE:
        return getValue();
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__METADATA_REF:
        return getMetadataRef();
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__NULL:
        return getNull();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__VALUE:
        setValue((TypedValue)newValue);
        return;
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__METADATA_REF:
        setMetadataRef((MetadataRef)newValue);
        return;
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__NULL:
        setNull((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__VALUE:
        setValue((TypedValue)null);
        return;
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__METADATA_REF:
        setMetadataRef((MetadataRef)null);
        return;
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__NULL:
        setNull(NULL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__VALUE:
        return value != null;
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__METADATA_REF:
        return metadataRef != null;
      case LLVM_IRPackage.METADATA_NODE_ELEMENT__NULL:
        return NULL_EDEFAULT == null ? null_ != null : !NULL_EDEFAULT.equals(null_);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (null: ");
    result.append(null_);
    result.append(')');
    return result.toString();
  }

} //MetadataNodeElementImpl
