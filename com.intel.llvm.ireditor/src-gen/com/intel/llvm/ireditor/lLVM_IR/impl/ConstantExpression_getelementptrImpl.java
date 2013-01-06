/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.ConstantExpression_getelementptr;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Expression getelementptr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_getelementptrImpl#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_getelementptrImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_getelementptrImpl#getIndexTypes <em>Index Types</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConstantExpression_getelementptrImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantExpression_getelementptrImpl extends ConstantExpressionImpl implements ConstantExpression_getelementptr
{
  /**
   * The cached value of the '{@link #getConstantType() <em>Constant Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantType()
   * @generated
   * @ordered
   */
  protected Type constantType;

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
   * The cached value of the '{@link #getIndexTypes() <em>Index Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> indexTypes;

  /**
   * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndices()
   * @generated
   * @ordered
   */
  protected EList<Constant> indices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstantExpression_getelementptrImpl()
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
    return LLVM_IRPackage.Literals.CONSTANT_EXPRESSION_GETELEMENTPTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getConstantType()
  {
    return constantType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstantType(Type newConstantType, NotificationChain msgs)
  {
    Type oldConstantType = constantType;
    constantType = newConstantType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE, oldConstantType, newConstantType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantType(Type newConstantType)
  {
    if (newConstantType != constantType)
    {
      NotificationChain msgs = null;
      if (constantType != null)
        msgs = ((InternalEObject)constantType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE, null, msgs);
      if (newConstantType != null)
        msgs = ((InternalEObject)newConstantType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE, null, msgs);
      msgs = basicSetConstantType(newConstantType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE, newConstantType, newConstantType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT, oldConstant, newConstant);
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
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT, newConstant, newConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getIndexTypes()
  {
    if (indexTypes == null)
    {
      indexTypes = new EObjectContainmentEList<Type>(Type.class, this, LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDEX_TYPES);
    }
    return indexTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constant> getIndices()
  {
    if (indices == null)
    {
      indices = new EObjectContainmentEList<Constant>(Constant.class, this, LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDICES);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE:
        return basicSetConstantType(null, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT:
        return basicSetConstant(null, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDEX_TYPES:
        return ((InternalEList<?>)getIndexTypes()).basicRemove(otherEnd, msgs);
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDICES:
        return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE:
        return getConstantType();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT:
        return getConstant();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDEX_TYPES:
        return getIndexTypes();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDICES:
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE:
        setConstantType((Type)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT:
        setConstant((GlobalValueRef)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDEX_TYPES:
        getIndexTypes().clear();
        getIndexTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDICES:
        getIndices().clear();
        getIndices().addAll((Collection<? extends Constant>)newValue);
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE:
        setConstantType((Type)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT:
        setConstant((GlobalValueRef)null);
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDEX_TYPES:
        getIndexTypes().clear();
        return;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDICES:
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
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT_TYPE:
        return constantType != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__CONSTANT:
        return constant != null;
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDEX_TYPES:
        return indexTypes != null && !indexTypes.isEmpty();
      case LLVM_IRPackage.CONSTANT_EXPRESSION_GETELEMENTPTR__INDICES:
        return indices != null && !indices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConstantExpression_getelementptrImpl
