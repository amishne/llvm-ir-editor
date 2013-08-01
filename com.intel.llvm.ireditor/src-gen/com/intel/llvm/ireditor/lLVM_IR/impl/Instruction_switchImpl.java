/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_switch;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_switchImpl#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_switchImpl#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_switchImpl#getDefaultDest <em>Default Dest</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_switchImpl#getCaseConditions <em>Case Conditions</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_switchImpl#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_switchImpl extends MinimalEObjectImpl.Container implements Instruction_switch
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
   * The cached value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparisonValue()
   * @generated
   * @ordered
   */
  protected TypedValue comparisonValue;

  /**
   * The cached value of the '{@link #getDefaultDest() <em>Default Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultDest()
   * @generated
   * @ordered
   */
  protected BasicBlockRef defaultDest;

  /**
   * The cached value of the '{@link #getCaseConditions() <em>Case Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseConditions()
   * @generated
   * @ordered
   */
  protected EList<TypedValue> caseConditions;

  /**
   * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinations()
   * @generated
   * @ordered
   */
  protected EList<BasicBlockRef> destinations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Instruction_switchImpl()
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
    return LLVM_IRPackage.Literals.INSTRUCTION_SWITCH;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SWITCH__OPCODE, oldOpcode, opcode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getComparisonValue()
  {
    return comparisonValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComparisonValue(TypedValue newComparisonValue, NotificationChain msgs)
  {
    TypedValue oldComparisonValue = comparisonValue;
    comparisonValue = newComparisonValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SWITCH__COMPARISON_VALUE, oldComparisonValue, newComparisonValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComparisonValue(TypedValue newComparisonValue)
  {
    if (newComparisonValue != comparisonValue)
    {
      NotificationChain msgs = null;
      if (comparisonValue != null)
        msgs = ((InternalEObject)comparisonValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SWITCH__COMPARISON_VALUE, null, msgs);
      if (newComparisonValue != null)
        msgs = ((InternalEObject)newComparisonValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SWITCH__COMPARISON_VALUE, null, msgs);
      msgs = basicSetComparisonValue(newComparisonValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SWITCH__COMPARISON_VALUE, newComparisonValue, newComparisonValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicBlockRef getDefaultDest()
  {
    return defaultDest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultDest(BasicBlockRef newDefaultDest, NotificationChain msgs)
  {
    BasicBlockRef oldDefaultDest = defaultDest;
    defaultDest = newDefaultDest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SWITCH__DEFAULT_DEST, oldDefaultDest, newDefaultDest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultDest(BasicBlockRef newDefaultDest)
  {
    if (newDefaultDest != defaultDest)
    {
      NotificationChain msgs = null;
      if (defaultDest != null)
        msgs = ((InternalEObject)defaultDest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SWITCH__DEFAULT_DEST, null, msgs);
      if (newDefaultDest != null)
        msgs = ((InternalEObject)newDefaultDest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_SWITCH__DEFAULT_DEST, null, msgs);
      msgs = basicSetDefaultDest(newDefaultDest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_SWITCH__DEFAULT_DEST, newDefaultDest, newDefaultDest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypedValue> getCaseConditions()
  {
    if (caseConditions == null)
    {
      caseConditions = new EObjectContainmentEList<TypedValue>(TypedValue.class, this, LLVM_IRPackage.INSTRUCTION_SWITCH__CASE_CONDITIONS);
    }
    return caseConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BasicBlockRef> getDestinations()
  {
    if (destinations == null)
    {
      destinations = new EObjectContainmentEList<BasicBlockRef>(BasicBlockRef.class, this, LLVM_IRPackage.INSTRUCTION_SWITCH__DESTINATIONS);
    }
    return destinations;
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
      case LLVM_IRPackage.INSTRUCTION_SWITCH__COMPARISON_VALUE:
        return basicSetComparisonValue(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DEFAULT_DEST:
        return basicSetDefaultDest(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_SWITCH__CASE_CONDITIONS:
        return ((InternalEList<?>)getCaseConditions()).basicRemove(otherEnd, msgs);
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DESTINATIONS:
        return ((InternalEList<?>)getDestinations()).basicRemove(otherEnd, msgs);
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
      case LLVM_IRPackage.INSTRUCTION_SWITCH__OPCODE:
        return getOpcode();
      case LLVM_IRPackage.INSTRUCTION_SWITCH__COMPARISON_VALUE:
        return getComparisonValue();
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DEFAULT_DEST:
        return getDefaultDest();
      case LLVM_IRPackage.INSTRUCTION_SWITCH__CASE_CONDITIONS:
        return getCaseConditions();
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DESTINATIONS:
        return getDestinations();
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
      case LLVM_IRPackage.INSTRUCTION_SWITCH__OPCODE:
        setOpcode((String)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__COMPARISON_VALUE:
        setComparisonValue((TypedValue)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DEFAULT_DEST:
        setDefaultDest((BasicBlockRef)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__CASE_CONDITIONS:
        getCaseConditions().clear();
        getCaseConditions().addAll((Collection<? extends TypedValue>)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DESTINATIONS:
        getDestinations().clear();
        getDestinations().addAll((Collection<? extends BasicBlockRef>)newValue);
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
      case LLVM_IRPackage.INSTRUCTION_SWITCH__OPCODE:
        setOpcode(OPCODE_EDEFAULT);
        return;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__COMPARISON_VALUE:
        setComparisonValue((TypedValue)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DEFAULT_DEST:
        setDefaultDest((BasicBlockRef)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__CASE_CONDITIONS:
        getCaseConditions().clear();
        return;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DESTINATIONS:
        getDestinations().clear();
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
      case LLVM_IRPackage.INSTRUCTION_SWITCH__OPCODE:
        return OPCODE_EDEFAULT == null ? opcode != null : !OPCODE_EDEFAULT.equals(opcode);
      case LLVM_IRPackage.INSTRUCTION_SWITCH__COMPARISON_VALUE:
        return comparisonValue != null;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DEFAULT_DEST:
        return defaultDest != null;
      case LLVM_IRPackage.INSTRUCTION_SWITCH__CASE_CONDITIONS:
        return caseConditions != null && !caseConditions.isEmpty();
      case LLVM_IRPackage.INSTRUCTION_SWITCH__DESTINATIONS:
        return destinations != null && !destinations.isEmpty();
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

} //Instruction_switchImpl
