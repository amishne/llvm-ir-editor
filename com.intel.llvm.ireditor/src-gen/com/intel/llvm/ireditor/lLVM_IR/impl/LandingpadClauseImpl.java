/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.ArrayConstant;
import com.intel.llvm.ireditor.lLVM_IR.ArrayType;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.LandingpadClause;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landingpad Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.LandingpadClauseImpl#getLandingPadType <em>Landing Pad Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.LandingpadClauseImpl#getCatchType <em>Catch Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.LandingpadClauseImpl#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.LandingpadClauseImpl#getArrayConstant <em>Array Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandingpadClauseImpl extends MinimalEObjectImpl.Container implements LandingpadClause
{
  /**
   * The default value of the '{@link #getLandingPadType() <em>Landing Pad Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLandingPadType()
   * @generated
   * @ordered
   */
  protected static final String LANDING_PAD_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLandingPadType() <em>Landing Pad Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLandingPadType()
   * @generated
   * @ordered
   */
  protected String landingPadType = LANDING_PAD_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCatchType() <em>Catch Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatchType()
   * @generated
   * @ordered
   */
  protected TypedValue catchType;

  /**
   * The cached value of the '{@link #getArrayType() <em>Array Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayType()
   * @generated
   * @ordered
   */
  protected ArrayType arrayType;

  /**
   * The cached value of the '{@link #getArrayConstant() <em>Array Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayConstant()
   * @generated
   * @ordered
   */
  protected ArrayConstant arrayConstant;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LandingpadClauseImpl()
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
    return LLVM_IRPackage.Literals.LANDINGPAD_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLandingPadType()
  {
    return landingPadType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLandingPadType(String newLandingPadType)
  {
    String oldLandingPadType = landingPadType;
    landingPadType = newLandingPadType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.LANDINGPAD_CLAUSE__LANDING_PAD_TYPE, oldLandingPadType, landingPadType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getCatchType()
  {
    return catchType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCatchType(TypedValue newCatchType, NotificationChain msgs)
  {
    TypedValue oldCatchType = catchType;
    catchType = newCatchType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.LANDINGPAD_CLAUSE__CATCH_TYPE, oldCatchType, newCatchType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCatchType(TypedValue newCatchType)
  {
    if (newCatchType != catchType)
    {
      NotificationChain msgs = null;
      if (catchType != null)
        msgs = ((InternalEObject)catchType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.LANDINGPAD_CLAUSE__CATCH_TYPE, null, msgs);
      if (newCatchType != null)
        msgs = ((InternalEObject)newCatchType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.LANDINGPAD_CLAUSE__CATCH_TYPE, null, msgs);
      msgs = basicSetCatchType(newCatchType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.LANDINGPAD_CLAUSE__CATCH_TYPE, newCatchType, newCatchType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType getArrayType()
  {
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayType(ArrayType newArrayType, NotificationChain msgs)
  {
    ArrayType oldArrayType = arrayType;
    arrayType = newArrayType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_TYPE, oldArrayType, newArrayType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayType(ArrayType newArrayType)
  {
    if (newArrayType != arrayType)
    {
      NotificationChain msgs = null;
      if (arrayType != null)
        msgs = ((InternalEObject)arrayType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_TYPE, null, msgs);
      if (newArrayType != null)
        msgs = ((InternalEObject)newArrayType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_TYPE, null, msgs);
      msgs = basicSetArrayType(newArrayType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_TYPE, newArrayType, newArrayType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayConstant getArrayConstant()
  {
    return arrayConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayConstant(ArrayConstant newArrayConstant, NotificationChain msgs)
  {
    ArrayConstant oldArrayConstant = arrayConstant;
    arrayConstant = newArrayConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_CONSTANT, oldArrayConstant, newArrayConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayConstant(ArrayConstant newArrayConstant)
  {
    if (newArrayConstant != arrayConstant)
    {
      NotificationChain msgs = null;
      if (arrayConstant != null)
        msgs = ((InternalEObject)arrayConstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_CONSTANT, null, msgs);
      if (newArrayConstant != null)
        msgs = ((InternalEObject)newArrayConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_CONSTANT, null, msgs);
      msgs = basicSetArrayConstant(newArrayConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_CONSTANT, newArrayConstant, newArrayConstant));
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
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__CATCH_TYPE:
        return basicSetCatchType(null, msgs);
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_TYPE:
        return basicSetArrayType(null, msgs);
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_CONSTANT:
        return basicSetArrayConstant(null, msgs);
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
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__LANDING_PAD_TYPE:
        return getLandingPadType();
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__CATCH_TYPE:
        return getCatchType();
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_TYPE:
        return getArrayType();
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_CONSTANT:
        return getArrayConstant();
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
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__LANDING_PAD_TYPE:
        setLandingPadType((String)newValue);
        return;
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__CATCH_TYPE:
        setCatchType((TypedValue)newValue);
        return;
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_TYPE:
        setArrayType((ArrayType)newValue);
        return;
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_CONSTANT:
        setArrayConstant((ArrayConstant)newValue);
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
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__LANDING_PAD_TYPE:
        setLandingPadType(LANDING_PAD_TYPE_EDEFAULT);
        return;
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__CATCH_TYPE:
        setCatchType((TypedValue)null);
        return;
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_TYPE:
        setArrayType((ArrayType)null);
        return;
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_CONSTANT:
        setArrayConstant((ArrayConstant)null);
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
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__LANDING_PAD_TYPE:
        return LANDING_PAD_TYPE_EDEFAULT == null ? landingPadType != null : !LANDING_PAD_TYPE_EDEFAULT.equals(landingPadType);
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__CATCH_TYPE:
        return catchType != null;
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_TYPE:
        return arrayType != null;
      case LLVM_IRPackage.LANDINGPAD_CLAUSE__ARRAY_CONSTANT:
        return arrayConstant != null;
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
    result.append(" (landingPadType: ");
    result.append(landingPadType);
    result.append(')');
    return result.toString();
  }

} //LandingpadClauseImpl
