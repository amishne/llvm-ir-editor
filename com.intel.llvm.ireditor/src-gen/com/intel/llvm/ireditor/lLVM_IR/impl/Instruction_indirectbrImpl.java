/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr;
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
 * An implementation of the model object '<em><b>Instruction indirectbr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_indirectbrImpl#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_indirectbrImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_indirectbrImpl#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_indirectbrImpl extends MinimalEObjectImpl.Container implements Instruction_indirectbr
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
   * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected TypedValue address;

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
  protected Instruction_indirectbrImpl()
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
    return LLVM_IRPackage.Literals.INSTRUCTION_INDIRECTBR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INDIRECTBR__OPCODE, oldOpcode, opcode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getAddress()
  {
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddress(TypedValue newAddress, NotificationChain msgs)
  {
    TypedValue oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INDIRECTBR__ADDRESS, oldAddress, newAddress);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddress(TypedValue newAddress)
  {
    if (newAddress != address)
    {
      NotificationChain msgs = null;
      if (address != null)
        msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INDIRECTBR__ADDRESS, null, msgs);
      if (newAddress != null)
        msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_INDIRECTBR__ADDRESS, null, msgs);
      msgs = basicSetAddress(newAddress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_INDIRECTBR__ADDRESS, newAddress, newAddress));
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
      destinations = new EObjectContainmentEList<BasicBlockRef>(BasicBlockRef.class, this, LLVM_IRPackage.INSTRUCTION_INDIRECTBR__DESTINATIONS);
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
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__ADDRESS:
        return basicSetAddress(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__DESTINATIONS:
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
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__OPCODE:
        return getOpcode();
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__ADDRESS:
        return getAddress();
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__DESTINATIONS:
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
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__OPCODE:
        setOpcode((String)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__ADDRESS:
        setAddress((TypedValue)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__DESTINATIONS:
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
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__OPCODE:
        setOpcode(OPCODE_EDEFAULT);
        return;
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__ADDRESS:
        setAddress((TypedValue)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__DESTINATIONS:
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
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__OPCODE:
        return OPCODE_EDEFAULT == null ? opcode != null : !OPCODE_EDEFAULT.equals(opcode);
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__ADDRESS:
        return address != null;
      case LLVM_IRPackage.INSTRUCTION_INDIRECTBR__DESTINATIONS:
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

} //Instruction_indirectbrImpl
