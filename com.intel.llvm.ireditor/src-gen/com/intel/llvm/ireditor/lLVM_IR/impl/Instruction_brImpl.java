/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_br;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction br</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_brImpl#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_brImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_brImpl#getTrue <em>True</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_brImpl#getFalse <em>False</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_brImpl#getUnconditional <em>Unconditional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_brImpl extends MinimalEObjectImpl.Container implements Instruction_br
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
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected TypedValue condition;

  /**
   * The cached value of the '{@link #getTrue() <em>True</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue()
   * @generated
   * @ordered
   */
  protected BasicBlockRef true_;

  /**
   * The cached value of the '{@link #getFalse() <em>False</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse()
   * @generated
   * @ordered
   */
  protected BasicBlockRef false_;

  /**
   * The cached value of the '{@link #getUnconditional() <em>Unconditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnconditional()
   * @generated
   * @ordered
   */
  protected BasicBlockRef unconditional;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Instruction_brImpl()
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
    return LLVM_IRPackage.Literals.INSTRUCTION_BR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_BR__OPCODE, oldOpcode, opcode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(TypedValue newCondition, NotificationChain msgs)
  {
    TypedValue oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_BR__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(TypedValue newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_BR__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_BR__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_BR__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicBlockRef getTrue()
  {
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrue(BasicBlockRef newTrue, NotificationChain msgs)
  {
    BasicBlockRef oldTrue = true_;
    true_ = newTrue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_BR__TRUE, oldTrue, newTrue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue(BasicBlockRef newTrue)
  {
    if (newTrue != true_)
    {
      NotificationChain msgs = null;
      if (true_ != null)
        msgs = ((InternalEObject)true_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_BR__TRUE, null, msgs);
      if (newTrue != null)
        msgs = ((InternalEObject)newTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_BR__TRUE, null, msgs);
      msgs = basicSetTrue(newTrue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_BR__TRUE, newTrue, newTrue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicBlockRef getFalse()
  {
    return false_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFalse(BasicBlockRef newFalse, NotificationChain msgs)
  {
    BasicBlockRef oldFalse = false_;
    false_ = newFalse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_BR__FALSE, oldFalse, newFalse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalse(BasicBlockRef newFalse)
  {
    if (newFalse != false_)
    {
      NotificationChain msgs = null;
      if (false_ != null)
        msgs = ((InternalEObject)false_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_BR__FALSE, null, msgs);
      if (newFalse != null)
        msgs = ((InternalEObject)newFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_BR__FALSE, null, msgs);
      msgs = basicSetFalse(newFalse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_BR__FALSE, newFalse, newFalse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicBlockRef getUnconditional()
  {
    return unconditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnconditional(BasicBlockRef newUnconditional, NotificationChain msgs)
  {
    BasicBlockRef oldUnconditional = unconditional;
    unconditional = newUnconditional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_BR__UNCONDITIONAL, oldUnconditional, newUnconditional);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnconditional(BasicBlockRef newUnconditional)
  {
    if (newUnconditional != unconditional)
    {
      NotificationChain msgs = null;
      if (unconditional != null)
        msgs = ((InternalEObject)unconditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_BR__UNCONDITIONAL, null, msgs);
      if (newUnconditional != null)
        msgs = ((InternalEObject)newUnconditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_BR__UNCONDITIONAL, null, msgs);
      msgs = basicSetUnconditional(newUnconditional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_BR__UNCONDITIONAL, newUnconditional, newUnconditional));
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
      case LLVM_IRPackage.INSTRUCTION_BR__CONDITION:
        return basicSetCondition(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_BR__TRUE:
        return basicSetTrue(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_BR__FALSE:
        return basicSetFalse(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_BR__UNCONDITIONAL:
        return basicSetUnconditional(null, msgs);
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
      case LLVM_IRPackage.INSTRUCTION_BR__OPCODE:
        return getOpcode();
      case LLVM_IRPackage.INSTRUCTION_BR__CONDITION:
        return getCondition();
      case LLVM_IRPackage.INSTRUCTION_BR__TRUE:
        return getTrue();
      case LLVM_IRPackage.INSTRUCTION_BR__FALSE:
        return getFalse();
      case LLVM_IRPackage.INSTRUCTION_BR__UNCONDITIONAL:
        return getUnconditional();
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
      case LLVM_IRPackage.INSTRUCTION_BR__OPCODE:
        setOpcode((String)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_BR__CONDITION:
        setCondition((TypedValue)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_BR__TRUE:
        setTrue((BasicBlockRef)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_BR__FALSE:
        setFalse((BasicBlockRef)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_BR__UNCONDITIONAL:
        setUnconditional((BasicBlockRef)newValue);
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
      case LLVM_IRPackage.INSTRUCTION_BR__OPCODE:
        setOpcode(OPCODE_EDEFAULT);
        return;
      case LLVM_IRPackage.INSTRUCTION_BR__CONDITION:
        setCondition((TypedValue)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_BR__TRUE:
        setTrue((BasicBlockRef)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_BR__FALSE:
        setFalse((BasicBlockRef)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_BR__UNCONDITIONAL:
        setUnconditional((BasicBlockRef)null);
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
      case LLVM_IRPackage.INSTRUCTION_BR__OPCODE:
        return OPCODE_EDEFAULT == null ? opcode != null : !OPCODE_EDEFAULT.equals(opcode);
      case LLVM_IRPackage.INSTRUCTION_BR__CONDITION:
        return condition != null;
      case LLVM_IRPackage.INSTRUCTION_BR__TRUE:
        return true_ != null;
      case LLVM_IRPackage.INSTRUCTION_BR__FALSE:
        return false_ != null;
      case LLVM_IRPackage.INSTRUCTION_BR__UNCONDITIONAL:
        return unconditional != null;
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

} //Instruction_brImpl
