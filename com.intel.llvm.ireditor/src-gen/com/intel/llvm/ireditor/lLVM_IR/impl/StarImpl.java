/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.AddressSpace;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.Star;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Star</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.StarImpl#getAddressSpace <em>Address Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StarImpl extends MinimalEObjectImpl.Container implements Star
{
  /**
   * The cached value of the '{@link #getAddressSpace() <em>Address Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressSpace()
   * @generated
   * @ordered
   */
  protected AddressSpace addressSpace;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StarImpl()
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
    return LLVM_IRPackage.Literals.STAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressSpace getAddressSpace()
  {
    return addressSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddressSpace(AddressSpace newAddressSpace, NotificationChain msgs)
  {
    AddressSpace oldAddressSpace = addressSpace;
    addressSpace = newAddressSpace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.STAR__ADDRESS_SPACE, oldAddressSpace, newAddressSpace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddressSpace(AddressSpace newAddressSpace)
  {
    if (newAddressSpace != addressSpace)
    {
      NotificationChain msgs = null;
      if (addressSpace != null)
        msgs = ((InternalEObject)addressSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.STAR__ADDRESS_SPACE, null, msgs);
      if (newAddressSpace != null)
        msgs = ((InternalEObject)newAddressSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.STAR__ADDRESS_SPACE, null, msgs);
      msgs = basicSetAddressSpace(newAddressSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.STAR__ADDRESS_SPACE, newAddressSpace, newAddressSpace));
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
      case LLVM_IRPackage.STAR__ADDRESS_SPACE:
        return basicSetAddressSpace(null, msgs);
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
      case LLVM_IRPackage.STAR__ADDRESS_SPACE:
        return getAddressSpace();
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
      case LLVM_IRPackage.STAR__ADDRESS_SPACE:
        setAddressSpace((AddressSpace)newValue);
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
      case LLVM_IRPackage.STAR__ADDRESS_SPACE:
        setAddressSpace((AddressSpace)null);
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
      case LLVM_IRPackage.STAR__ADDRESS_SPACE:
        return addressSpace != null;
    }
    return super.eIsSet(featureID);
  }

} //StarImpl
