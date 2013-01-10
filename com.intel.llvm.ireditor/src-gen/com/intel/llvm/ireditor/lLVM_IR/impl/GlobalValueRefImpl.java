/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueDef;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.MetadataRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Value Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueRefImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueRefImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalValueRefImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalValueRefImpl extends ValueRefImpl implements GlobalValueRef
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected GlobalValueDef ref;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected Constant constant;

  /**
   * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetadata()
   * @generated
   * @ordered
   */
  protected MetadataRef metadata;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GlobalValueRefImpl()
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
    return LLVM_IRPackage.Literals.GLOBAL_VALUE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalValueDef getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (GlobalValueDef)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LLVM_IRPackage.GLOBAL_VALUE_REF__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalValueDef basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(GlobalValueDef newRef)
  {
    GlobalValueDef oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VALUE_REF__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant(Constant newConstant, NotificationChain msgs)
  {
    Constant oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VALUE_REF__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(Constant newConstant)
  {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VALUE_REF__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VALUE_REF__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VALUE_REF__CONSTANT, newConstant, newConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataRef getMetadata()
  {
    return metadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetadata(MetadataRef newMetadata, NotificationChain msgs)
  {
    MetadataRef oldMetadata = metadata;
    metadata = newMetadata;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VALUE_REF__METADATA, oldMetadata, newMetadata);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetadata(MetadataRef newMetadata)
  {
    if (newMetadata != metadata)
    {
      NotificationChain msgs = null;
      if (metadata != null)
        msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VALUE_REF__METADATA, null, msgs);
      if (newMetadata != null)
        msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VALUE_REF__METADATA, null, msgs);
      msgs = basicSetMetadata(newMetadata, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VALUE_REF__METADATA, newMetadata, newMetadata));
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
      case LLVM_IRPackage.GLOBAL_VALUE_REF__CONSTANT:
        return basicSetConstant(null, msgs);
      case LLVM_IRPackage.GLOBAL_VALUE_REF__METADATA:
        return basicSetMetadata(null, msgs);
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
      case LLVM_IRPackage.GLOBAL_VALUE_REF__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case LLVM_IRPackage.GLOBAL_VALUE_REF__CONSTANT:
        return getConstant();
      case LLVM_IRPackage.GLOBAL_VALUE_REF__METADATA:
        return getMetadata();
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
      case LLVM_IRPackage.GLOBAL_VALUE_REF__REF:
        setRef((GlobalValueDef)newValue);
        return;
      case LLVM_IRPackage.GLOBAL_VALUE_REF__CONSTANT:
        setConstant((Constant)newValue);
        return;
      case LLVM_IRPackage.GLOBAL_VALUE_REF__METADATA:
        setMetadata((MetadataRef)newValue);
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
      case LLVM_IRPackage.GLOBAL_VALUE_REF__REF:
        setRef((GlobalValueDef)null);
        return;
      case LLVM_IRPackage.GLOBAL_VALUE_REF__CONSTANT:
        setConstant((Constant)null);
        return;
      case LLVM_IRPackage.GLOBAL_VALUE_REF__METADATA:
        setMetadata((MetadataRef)null);
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
      case LLVM_IRPackage.GLOBAL_VALUE_REF__REF:
        return ref != null;
      case LLVM_IRPackage.GLOBAL_VALUE_REF__CONSTANT:
        return constant != null;
      case LLVM_IRPackage.GLOBAL_VALUE_REF__METADATA:
        return metadata != null;
    }
    return super.eIsSet(featureID);
  }

} //GlobalValueRefImpl
