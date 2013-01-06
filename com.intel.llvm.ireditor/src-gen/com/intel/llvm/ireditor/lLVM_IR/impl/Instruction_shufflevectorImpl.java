/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.Instruction_shufflevector;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction shufflevector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shufflevectorImpl#getVector1 <em>Vector1</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shufflevectorImpl#getVector2 <em>Vector2</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_shufflevectorImpl#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_shufflevectorImpl extends VectorInstructionsImpl implements Instruction_shufflevector
{
  /**
   * The cached value of the '{@link #getVector1() <em>Vector1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVector1()
   * @generated
   * @ordered
   */
  protected TypedValue vector1;

  /**
   * The cached value of the '{@link #getVector2() <em>Vector2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVector2()
   * @generated
   * @ordered
   */
  protected TypedValue vector2;

  /**
   * The cached value of the '{@link #getMask() <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMask()
   * @generated
   * @ordered
   */
  protected TypedValue mask;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Instruction_shufflevectorImpl()
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
    return LLVM_IRPackage.Literals.INSTRUCTION_SHUFFLEVECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getVector1()
  {
    return vector1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVector1(TypedValue newVector1, NotificationChain msgs)
  {
    TypedValue oldVector1 = vector1;
    vector1 = newVector1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR1, oldVector1, newVector1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVector1(TypedValue newVector1)
  {
    if (newVector1 != vector1)
    {
      NotificationChain msgs = null;
      if (vector1 != null)
        msgs = ((InternalEObject)vector1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR1, null, msgs);
      if (newVector1 != null)
        msgs = ((InternalEObject)newVector1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR1, null, msgs);
      msgs = basicSetVector1(newVector1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR1, newVector1, newVector1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getVector2()
  {
    return vector2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVector2(TypedValue newVector2, NotificationChain msgs)
  {
    TypedValue oldVector2 = vector2;
    vector2 = newVector2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR2, oldVector2, newVector2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVector2(TypedValue newVector2)
  {
    if (newVector2 != vector2)
    {
      NotificationChain msgs = null;
      if (vector2 != null)
        msgs = ((InternalEObject)vector2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR2, null, msgs);
      if (newVector2 != null)
        msgs = ((InternalEObject)newVector2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR2, null, msgs);
      msgs = basicSetVector2(newVector2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR2, newVector2, newVector2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getMask()
  {
    return mask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMask(TypedValue newMask, NotificationChain msgs)
  {
    TypedValue oldMask = mask;
    mask = newMask;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__MASK, oldMask, newMask);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMask(TypedValue newMask)
  {
    if (newMask != mask)
    {
      NotificationChain msgs = null;
      if (mask != null)
        msgs = ((InternalEObject)mask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__MASK, null, msgs);
      if (newMask != null)
        msgs = ((InternalEObject)newMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__MASK, null, msgs);
      msgs = basicSetMask(newMask, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__MASK, newMask, newMask));
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
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR1:
        return basicSetVector1(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR2:
        return basicSetVector2(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__MASK:
        return basicSetMask(null, msgs);
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
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR1:
        return getVector1();
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR2:
        return getVector2();
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__MASK:
        return getMask();
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
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR1:
        setVector1((TypedValue)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR2:
        setVector2((TypedValue)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__MASK:
        setMask((TypedValue)newValue);
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
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR1:
        setVector1((TypedValue)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR2:
        setVector2((TypedValue)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__MASK:
        setMask((TypedValue)null);
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
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR1:
        return vector1 != null;
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__VECTOR2:
        return vector2 != null;
      case LLVM_IRPackage.INSTRUCTION_SHUFFLEVECTOR__MASK:
        return mask != null;
    }
    return super.eIsSet(featureID);
  }

} //Instruction_shufflevectorImpl
