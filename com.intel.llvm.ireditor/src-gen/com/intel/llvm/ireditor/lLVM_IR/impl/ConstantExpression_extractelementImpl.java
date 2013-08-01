/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_extractelement;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Expression extractelement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractelementImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_extractelementImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantExpression_extractelementImpl extends ConstantExpressionImpl implements ConstantExpression_extractelement
{
  /**
   * The cached value of the '{@link #getVector() <em>Vector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVector()
   * @generated
   * @ordered
   */
  protected TypedValue vector;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected TypedValue index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstantExpression_extractelementImpl()
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
    return LLVM_IRPackage.Literals.CONSTANT_EXPRESSION_EXTRACTELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getVector()
  {
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVector(TypedValue newVector, NotificationChain msgs)
  {
    TypedValue oldVector = vector;
    vector = newVector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR, oldVector, newVector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVector(TypedValue newVector)
  {
    if (newVector != vector)
    {
      NotificationChain msgs = null;
      if (vector != null)
        msgs = ((InternalEObject)vector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR, null, msgs);
      if (newVector != null)
        msgs = ((InternalEObject)newVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR, null, msgs);
      msgs = basicSetVector(newVector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR, newVector, newVector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(TypedValue newIndex, NotificationChain msgs)
  {
    TypedValue oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(TypedValue newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX, newIndex, newIndex));
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR:
        return basicSetVector(null, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX:
        return basicSetIndex(null, msgs);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR:
        return getVector();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX:
        return getIndex();
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR:
        setVector((TypedValue)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX:
        setIndex((TypedValue)newValue);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR:
        setVector((TypedValue)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX:
        setIndex((TypedValue)null);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__VECTOR:
        return vector != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_EXTRACTELEMENT__INDEX:
        return index != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstantExpression_extractelementImpl
