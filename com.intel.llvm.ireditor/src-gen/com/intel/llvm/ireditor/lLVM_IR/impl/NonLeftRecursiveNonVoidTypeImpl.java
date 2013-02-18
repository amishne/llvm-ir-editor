/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.NonLeftRecursiveNonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.TypeDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Left Recursive Non Void Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveNonVoidTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.NonLeftRecursiveNonVoidTypeImpl#getTypedef <em>Typedef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonLeftRecursiveNonVoidTypeImpl extends MinimalEObjectImpl.Container implements NonLeftRecursiveNonVoidType
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EObject type;

  /**
   * The cached value of the '{@link #getTypedef() <em>Typedef</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedef()
   * @generated
   * @ordered
   */
  protected TypeDef typedef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonLeftRecursiveNonVoidTypeImpl()
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
    return LLVM_IRPackage.Literals.NON_LEFT_RECURSIVE_NON_VOID_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(EObject newType, NotificationChain msgs)
  {
    EObject oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(EObject newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef getTypedef()
  {
    if (typedef != null && typedef.eIsProxy())
    {
      InternalEObject oldTypedef = (InternalEObject)typedef;
      typedef = (TypeDef)eResolveProxy(oldTypedef);
      if (typedef != oldTypedef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPEDEF, oldTypedef, typedef));
      }
    }
    return typedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef basicGetTypedef()
  {
    return typedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypedef(TypeDef newTypedef)
  {
    TypeDef oldTypedef = typedef;
    typedef = newTypedef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPEDEF, oldTypedef, typedef));
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
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE:
        return basicSetType(null, msgs);
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
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE:
        return getType();
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPEDEF:
        if (resolve) return getTypedef();
        return basicGetTypedef();
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
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE:
        setType((EObject)newValue);
        return;
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPEDEF:
        setTypedef((TypeDef)newValue);
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
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE:
        setType((EObject)null);
        return;
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPEDEF:
        setTypedef((TypeDef)null);
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
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPE:
        return type != null;
      case LLVM_IRPackage.NON_LEFT_RECURSIVE_NON_VOID_TYPE__TYPEDEF:
        return typedef != null;
    }
    return super.eIsSet(featureID);
  }

} //NonLeftRecursiveNonVoidTypeImpl
