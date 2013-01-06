/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertelement;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;
import com.intel.llvm.ireditor.lLVM_IR.ValueRef;
import com.intel.llvm.ireditor.lLVM_IR.VectorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Expression insertelement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertelementImpl#getVectorType <em>Vector Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertelementImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertelementImpl#getElement <em>Element</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertelementImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantExpression_insertelementImpl extends ConstantExpressionImpl implements ConstantExpression_insertelement
{
  /**
   * The cached value of the '{@link #getVectorType() <em>Vector Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVectorType()
   * @generated
   * @ordered
   */
  protected VectorType vectorType;

  /**
   * The cached value of the '{@link #getVector() <em>Vector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVector()
   * @generated
   * @ordered
   */
  protected ValueRef vector;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected TypedValue element;

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
  protected ConstantExpression_insertelementImpl()
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
    return LLVM_IRPackage.Literals.CONSTANT_EXPRESSION_INSERTELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VectorType getVectorType()
  {
    return vectorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVectorType(VectorType newVectorType, NotificationChain msgs)
  {
    VectorType oldVectorType = vectorType;
    vectorType = newVectorType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE, oldVectorType, newVectorType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVectorType(VectorType newVectorType)
  {
    if (newVectorType != vectorType)
    {
      NotificationChain msgs = null;
      if (vectorType != null)
        msgs = ((InternalEObject)vectorType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE, null, msgs);
      if (newVectorType != null)
        msgs = ((InternalEObject)newVectorType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE, null, msgs);
      msgs = basicSetVectorType(newVectorType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE, newVectorType, newVectorType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueRef getVector()
  {
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVector(ValueRef newVector, NotificationChain msgs)
  {
    ValueRef oldVector = vector;
    vector = newVector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR, oldVector, newVector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVector(ValueRef newVector)
  {
    if (newVector != vector)
    {
      NotificationChain msgs = null;
      if (vector != null)
        msgs = ((InternalEObject)vector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR, null, msgs);
      if (newVector != null)
        msgs = ((InternalEObject)newVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR, null, msgs);
      msgs = basicSetVector(newVector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR, newVector, newVector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(TypedValue newElement, NotificationChain msgs)
  {
    TypedValue oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(TypedValue newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT, newElement, newElement));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__INDEX, oldIndex, newIndex);
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
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__INDEX, newIndex, newIndex));
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE:
        return basicSetVectorType(null, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR:
        return basicSetVector(null, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT:
        return basicSetElement(null, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__INDEX:
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE:
        return getVectorType();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR:
        return getVector();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT:
        return getElement();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__INDEX:
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE:
        setVectorType((VectorType)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR:
        setVector((ValueRef)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT:
        setElement((TypedValue)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__INDEX:
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE:
        setVectorType((VectorType)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR:
        setVector((ValueRef)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT:
        setElement((TypedValue)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__INDEX:
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR_TYPE:
        return vectorType != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__VECTOR:
        return vector != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__ELEMENT:
        return element != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTELEMENT__INDEX:
        return index != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstantExpression_insertelementImpl
