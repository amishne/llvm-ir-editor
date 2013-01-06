/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_convert;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Expression convert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_convertImpl#getFromType <em>From Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_convertImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_convertImpl#getTargetType <em>Target Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantExpression_convertImpl extends ConstantExpressionImpl implements ConstantExpression_convert
{
  /**
   * The cached value of the '{@link #getFromType() <em>From Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromType()
   * @generated
   * @ordered
   */
  protected Type fromType;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected GlobalValueRef constant;

  /**
   * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetType()
   * @generated
   * @ordered
   */
  protected Type targetType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstantExpression_convertImpl()
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
    return LLVM_IRPackage.Literals.CONSTANT_EXPRESSION_CONVERT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getFromType()
  {
    return fromType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromType(Type newFromType, NotificationChain msgs)
  {
    Type oldFromType = fromType;
    fromType = newFromType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__FROM_TYPE, oldFromType, newFromType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromType(Type newFromType)
  {
    if (newFromType != fromType)
    {
      NotificationChain msgs = null;
      if (fromType != null)
        msgs = ((InternalEObject)fromType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__FROM_TYPE, null, msgs);
      if (newFromType != null)
        msgs = ((InternalEObject)newFromType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__FROM_TYPE, null, msgs);
      msgs = basicSetFromType(newFromType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__FROM_TYPE, newFromType, newFromType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalValueRef getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant(GlobalValueRef newConstant, NotificationChain msgs)
  {
    GlobalValueRef oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(GlobalValueRef newConstant)
  {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__CONSTANT, newConstant, newConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getTargetType()
  {
    return targetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetType(Type newTargetType, NotificationChain msgs)
  {
    Type oldTargetType = targetType;
    targetType = newTargetType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE, oldTargetType, newTargetType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetType(Type newTargetType)
  {
    if (newTargetType != targetType)
    {
      NotificationChain msgs = null;
      if (targetType != null)
        msgs = ((InternalEObject)targetType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE, null, msgs);
      if (newTargetType != null)
        msgs = ((InternalEObject)newTargetType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE, null, msgs);
      msgs = basicSetTargetType(newTargetType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE, newTargetType, newTargetType));
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__FROM_TYPE:
        return basicSetFromType(null, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__CONSTANT:
        return basicSetConstant(null, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE:
        return basicSetTargetType(null, msgs);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__FROM_TYPE:
        return getFromType();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__CONSTANT:
        return getConstant();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE:
        return getTargetType();
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__FROM_TYPE:
        setFromType((Type)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__CONSTANT:
        setConstant((GlobalValueRef)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE:
        setTargetType((Type)newValue);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__FROM_TYPE:
        setFromType((Type)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__CONSTANT:
        setConstant((GlobalValueRef)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE:
        setTargetType((Type)null);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__FROM_TYPE:
        return fromType != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__CONSTANT:
        return constant != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_CONVERT__TARGET_TYPE:
        return targetType != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstantExpression_convertImpl
