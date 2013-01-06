/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.Type;
import com.intel.llvm.ireditor.lLVM_IR.ValueRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConversionInstructionImpl#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConversionInstructionImpl#getFromType <em>From Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConversionInstructionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.ConversionInstructionImpl#getTargetType <em>Target Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversionInstructionImpl extends MinimalEObjectImpl.Container implements ConversionInstruction
{
  /**
   * The default value of the '{@link #getOpcode() <em>Opcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpcode()
   * @generated
   * @ordered
   */
  protected static final String OPCODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpcode() <em>Opcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpcode()
   * @generated
   * @ordered
   */
  protected String opcode = OPCODE_EDEFAULT;

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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ValueRef value;

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
  protected ConversionInstructionImpl()
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
    return LLVM_IRPackage.Literals.CONVERSION_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpcode()
  {
    return opcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpcode(String newOpcode)
  {
    String oldOpcode = opcode;
    opcode = newOpcode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONVERSION_INSTRUCTION__OPCODE, oldOpcode, opcode));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONVERSION_INSTRUCTION__FROM_TYPE, oldFromType, newFromType);
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
        msgs = ((InternalEObject)fromType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONVERSION_INSTRUCTION__FROM_TYPE, null, msgs);
      if (newFromType != null)
        msgs = ((InternalEObject)newFromType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONVERSION_INSTRUCTION__FROM_TYPE, null, msgs);
      msgs = basicSetFromType(newFromType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONVERSION_INSTRUCTION__FROM_TYPE, newFromType, newFromType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueRef getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ValueRef newValue, NotificationChain msgs)
  {
    ValueRef oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONVERSION_INSTRUCTION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ValueRef newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONVERSION_INSTRUCTION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONVERSION_INSTRUCTION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONVERSION_INSTRUCTION__VALUE, newValue, newValue));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONVERSION_INSTRUCTION__TARGET_TYPE, oldTargetType, newTargetType);
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
        msgs = ((InternalEObject)targetType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONVERSION_INSTRUCTION__TARGET_TYPE, null, msgs);
      if (newTargetType != null)
        msgs = ((InternalEObject)newTargetType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.CONVERSION_INSTRUCTION__TARGET_TYPE, null, msgs);
      msgs = basicSetTargetType(newTargetType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.CONVERSION_INSTRUCTION__TARGET_TYPE, newTargetType, newTargetType));
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
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__FROM_TYPE:
        return basicSetFromType(null, msgs);
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__VALUE:
        return basicSetValue(null, msgs);
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__TARGET_TYPE:
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
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__OPCODE:
        return getOpcode();
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__FROM_TYPE:
        return getFromType();
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__VALUE:
        return getValue();
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__TARGET_TYPE:
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
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__OPCODE:
        setOpcode((String)newValue);
        return;
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__FROM_TYPE:
        setFromType((Type)newValue);
        return;
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__VALUE:
        setValue((ValueRef)newValue);
        return;
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__TARGET_TYPE:
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
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__OPCODE:
        setOpcode(OPCODE_EDEFAULT);
        return;
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__FROM_TYPE:
        setFromType((Type)null);
        return;
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__VALUE:
        setValue((ValueRef)null);
        return;
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__TARGET_TYPE:
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
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__OPCODE:
        return OPCODE_EDEFAULT == null ? opcode != null : !OPCODE_EDEFAULT.equals(opcode);
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__FROM_TYPE:
        return fromType != null;
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__VALUE:
        return value != null;
      case LLVM_IRPackage.CONVERSION_INSTRUCTION__TARGET_TYPE:
        return targetType != null;
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
    result.append(" (opcode: ");
    result.append(opcode);
    result.append(')');
    return result.toString();
  }

} //ConversionInstructionImpl
