/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_insertvalue;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Expression insertvalue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertvalueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertvalueImpl#getElement <em>Element</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_insertvalueImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantExpression_insertvalueImpl extends ConstantExpressionImpl implements ConstantExpression_insertvalue
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
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected TypedValue element;

  /**
   * The cached value of the '{@link #getIndices() <em>Indices</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndices()
   * @generated
   * @ordered
   */
  protected EList<String> indices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstantExpression_insertvalueImpl()
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
    return LLVM_IRPackage.Literals.CONSTANT_EXPRESSION_INSERTVALUE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__VALUE, newValue, newValue));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT, oldElement, newElement);
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
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIndices()
  {
    if (indices == null)
    {
      indices = new EDataTypeEList<String>(String.class, this, LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__INDICES);
    }
    return indices;
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__VALUE:
        return basicSetValue(null, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT:
        return basicSetElement(null, msgs);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__VALUE:
        return getValue();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT:
        return getElement();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__INDICES:
        return getIndices();
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__VALUE:
        setValue((TypedValue)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT:
        setElement((TypedValue)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__INDICES:
        getIndices().clear();
        getIndices().addAll((Collection<? extends String>)newValue);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__VALUE:
        setValue((TypedValue)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT:
        setElement((TypedValue)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__INDICES:
        getIndices().clear();
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__VALUE:
        return value != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__ELEMENT:
        return element != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_INSERTVALUE__INDICES:
        return indices != null && !indices.isEmpty();
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
    result.append(" (indices: ");
    result.append(indices);
    result.append(')');
    return result.toString();
  }

} //ConstantExpression_insertvalueImpl
