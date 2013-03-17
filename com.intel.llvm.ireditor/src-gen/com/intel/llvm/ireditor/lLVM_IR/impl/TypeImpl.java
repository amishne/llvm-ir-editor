/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveType;
import com.intel.llvm.ireditor.lLVM_IR.Star;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.TypeSuffix;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypeImpl#getStars <em>Stars</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.TypeImpl#getSuffixes <em>Suffixes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseType()
   * @generated
   * @ordered
   */
  protected NonLeftRecursiveType baseType;

  /**
   * The cached value of the '{@link #getStars() <em>Stars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStars()
   * @generated
   * @ordered
   */
  protected EList<Star> stars;

  /**
   * The cached value of the '{@link #getSuffixes() <em>Suffixes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuffixes()
   * @generated
   * @ordered
   */
  protected EList<TypeSuffix> suffixes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return LLVM_IRPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonLeftRecursiveType getBaseType()
  {
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseType(NonLeftRecursiveType newBaseType, NotificationChain msgs)
  {
    NonLeftRecursiveType oldBaseType = baseType;
    baseType = newBaseType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.TYPE__BASE_TYPE, oldBaseType, newBaseType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseType(NonLeftRecursiveType newBaseType)
  {
    if (newBaseType != baseType)
    {
      NotificationChain msgs = null;
      if (baseType != null)
        msgs = ((InternalEObject)baseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.TYPE__BASE_TYPE, null, msgs);
      if (newBaseType != null)
        msgs = ((InternalEObject)newBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.TYPE__BASE_TYPE, null, msgs);
      msgs = basicSetBaseType(newBaseType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.TYPE__BASE_TYPE, newBaseType, newBaseType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Star> getStars()
  {
    if (stars == null)
    {
      stars = new EObjectContainmentEList<Star>(Star.class, this, LLVM_IRPackage.TYPE__STARS);
    }
    return stars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeSuffix> getSuffixes()
  {
    if (suffixes == null)
    {
      suffixes = new EObjectContainmentEList<TypeSuffix>(TypeSuffix.class, this, LLVM_IRPackage.TYPE__SUFFIXES);
    }
    return suffixes;
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
      case LLVM_IRPackage.TYPE__BASE_TYPE:
        return basicSetBaseType(null, msgs);
      case LLVM_IRPackage.TYPE__STARS:
        return ((InternalEList<?>)getStars()).basicRemove(otherEnd, msgs);
      case LLVM_IRPackage.TYPE__SUFFIXES:
        return ((InternalEList<?>)getSuffixes()).basicRemove(otherEnd, msgs);
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
      case LLVM_IRPackage.TYPE__BASE_TYPE:
        return getBaseType();
      case LLVM_IRPackage.TYPE__STARS:
        return getStars();
      case LLVM_IRPackage.TYPE__SUFFIXES:
        return getSuffixes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LLVM_IRPackage.TYPE__BASE_TYPE:
        setBaseType((NonLeftRecursiveType)newValue);
        return;
      case LLVM_IRPackage.TYPE__STARS:
        getStars().clear();
        getStars().addAll((Collection<? extends Star>)newValue);
        return;
      case LLVM_IRPackage.TYPE__SUFFIXES:
        getSuffixes().clear();
        getSuffixes().addAll((Collection<? extends TypeSuffix>)newValue);
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
      case LLVM_IRPackage.TYPE__BASE_TYPE:
        setBaseType((NonLeftRecursiveType)null);
        return;
      case LLVM_IRPackage.TYPE__STARS:
        getStars().clear();
        return;
      case LLVM_IRPackage.TYPE__SUFFIXES:
        getSuffixes().clear();
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
      case LLVM_IRPackage.TYPE__BASE_TYPE:
        return baseType != null;
      case LLVM_IRPackage.TYPE__STARS:
        return stars != null && !stars.isEmpty();
      case LLVM_IRPackage.TYPE__SUFFIXES:
        return suffixes != null && !suffixes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypeImpl
