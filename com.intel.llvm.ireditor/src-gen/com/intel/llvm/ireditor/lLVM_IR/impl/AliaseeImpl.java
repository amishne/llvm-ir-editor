/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.Aliasee;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueDef;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aliasee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliaseeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliaseeImpl#getBitcast <em>Bitcast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliaseeImpl extends MinimalEObjectImpl.Container implements Aliasee
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
   * The cached value of the '{@link #getBitcast() <em>Bitcast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitcast()
   * @generated
   * @ordered
   */
  protected ConstantExpression_convert bitcast;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AliaseeImpl()
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
    return LLVM_IRPackage.Literals.ALIASEE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LLVM_IRPackage.ALIASEE__REF, oldRef, ref));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIASEE__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression_convert getBitcast()
  {
    return bitcast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBitcast(ConstantExpression_convert newBitcast, NotificationChain msgs)
  {
    ConstantExpression_convert oldBitcast = bitcast;
    bitcast = newBitcast;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIASEE__BITCAST, oldBitcast, newBitcast);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBitcast(ConstantExpression_convert newBitcast)
  {
    if (newBitcast != bitcast)
    {
      NotificationChain msgs = null;
      if (bitcast != null)
        msgs = ((InternalEObject)bitcast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.ALIASEE__BITCAST, null, msgs);
      if (newBitcast != null)
        msgs = ((InternalEObject)newBitcast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.ALIASEE__BITCAST, null, msgs);
      msgs = basicSetBitcast(newBitcast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIASEE__BITCAST, newBitcast, newBitcast));
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
      case LLVM_IRPackage.ALIASEE__BITCAST:
        return basicSetBitcast(null, msgs);
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
      case LLVM_IRPackage.ALIASEE__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case LLVM_IRPackage.ALIASEE__BITCAST:
        return getBitcast();
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
      case LLVM_IRPackage.ALIASEE__REF:
        setRef((GlobalValueDef)newValue);
        return;
      case LLVM_IRPackage.ALIASEE__BITCAST:
        setBitcast((ConstantExpression_convert)newValue);
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
      case LLVM_IRPackage.ALIASEE__REF:
        setRef((GlobalValueDef)null);
        return;
      case LLVM_IRPackage.ALIASEE__BITCAST:
        setBitcast((ConstantExpression_convert)null);
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
      case LLVM_IRPackage.ALIASEE__REF:
        return ref != null;
      case LLVM_IRPackage.ALIASEE__BITCAST:
        return bitcast != null;
    }
    return super.eIsSet(featureID);
  }

} //AliaseeImpl
