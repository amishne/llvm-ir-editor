/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.Instruction_store;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.MetadataRef;
import com.intel.llvm.ireditor.lLVM_IR.TypedValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_storeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_storeImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_storeImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_storeImpl#getNontemporalIndex <em>Nontemporal Index</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_storeImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_storeImpl extends MemoryInstructionImpl implements Instruction_store
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
   * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer()
   * @generated
   * @ordered
   */
  protected TypedValue pointer;

  /**
   * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment()
   * @generated
   * @ordered
   */
  protected static final String ALIGNMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment()
   * @generated
   * @ordered
   */
  protected String alignment = ALIGNMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getNontemporalIndex() <em>Nontemporal Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNontemporalIndex()
   * @generated
   * @ordered
   */
  protected MetadataRef nontemporalIndex;

  /**
   * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdering()
   * @generated
   * @ordered
   */
  protected static final String ORDERING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdering()
   * @generated
   * @ordered
   */
  protected String ordering = ORDERING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Instruction_storeImpl()
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
    return LLVM_IRPackage.Literals.INSTRUCTION_STORE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_STORE__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_STORE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_STORE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_STORE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedValue getPointer()
  {
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointer(TypedValue newPointer, NotificationChain msgs)
  {
    TypedValue oldPointer = pointer;
    pointer = newPointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_STORE__POINTER, oldPointer, newPointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointer(TypedValue newPointer)
  {
    if (newPointer != pointer)
    {
      NotificationChain msgs = null;
      if (pointer != null)
        msgs = ((InternalEObject)pointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_STORE__POINTER, null, msgs);
      if (newPointer != null)
        msgs = ((InternalEObject)newPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_STORE__POINTER, null, msgs);
      msgs = basicSetPointer(newPointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_STORE__POINTER, newPointer, newPointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlignment()
  {
    return alignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignment(String newAlignment)
  {
    String oldAlignment = alignment;
    alignment = newAlignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_STORE__ALIGNMENT, oldAlignment, alignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataRef getNontemporalIndex()
  {
    return nontemporalIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNontemporalIndex(MetadataRef newNontemporalIndex, NotificationChain msgs)
  {
    MetadataRef oldNontemporalIndex = nontemporalIndex;
    nontemporalIndex = newNontemporalIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_STORE__NONTEMPORAL_INDEX, oldNontemporalIndex, newNontemporalIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNontemporalIndex(MetadataRef newNontemporalIndex)
  {
    if (newNontemporalIndex != nontemporalIndex)
    {
      NotificationChain msgs = null;
      if (nontemporalIndex != null)
        msgs = ((InternalEObject)nontemporalIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_STORE__NONTEMPORAL_INDEX, null, msgs);
      if (newNontemporalIndex != null)
        msgs = ((InternalEObject)newNontemporalIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_STORE__NONTEMPORAL_INDEX, null, msgs);
      msgs = basicSetNontemporalIndex(newNontemporalIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_STORE__NONTEMPORAL_INDEX, newNontemporalIndex, newNontemporalIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrdering()
  {
    return ordering;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrdering(String newOrdering)
  {
    String oldOrdering = ordering;
    ordering = newOrdering;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_STORE__ORDERING, oldOrdering, ordering));
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
      case LLVM_IRPackage.INSTRUCTION_STORE__VALUE:
        return basicSetValue(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_STORE__POINTER:
        return basicSetPointer(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_STORE__NONTEMPORAL_INDEX:
        return basicSetNontemporalIndex(null, msgs);
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
      case LLVM_IRPackage.INSTRUCTION_STORE__VALUE:
        return getValue();
      case LLVM_IRPackage.INSTRUCTION_STORE__POINTER:
        return getPointer();
      case LLVM_IRPackage.INSTRUCTION_STORE__ALIGNMENT:
        return getAlignment();
      case LLVM_IRPackage.INSTRUCTION_STORE__NONTEMPORAL_INDEX:
        return getNontemporalIndex();
      case LLVM_IRPackage.INSTRUCTION_STORE__ORDERING:
        return getOrdering();
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
      case LLVM_IRPackage.INSTRUCTION_STORE__VALUE:
        setValue((TypedValue)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_STORE__POINTER:
        setPointer((TypedValue)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_STORE__ALIGNMENT:
        setAlignment((String)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_STORE__NONTEMPORAL_INDEX:
        setNontemporalIndex((MetadataRef)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_STORE__ORDERING:
        setOrdering((String)newValue);
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
      case LLVM_IRPackage.INSTRUCTION_STORE__VALUE:
        setValue((TypedValue)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_STORE__POINTER:
        setPointer((TypedValue)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_STORE__ALIGNMENT:
        setAlignment(ALIGNMENT_EDEFAULT);
        return;
      case LLVM_IRPackage.INSTRUCTION_STORE__NONTEMPORAL_INDEX:
        setNontemporalIndex((MetadataRef)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_STORE__ORDERING:
        setOrdering(ORDERING_EDEFAULT);
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
      case LLVM_IRPackage.INSTRUCTION_STORE__VALUE:
        return value != null;
      case LLVM_IRPackage.INSTRUCTION_STORE__POINTER:
        return pointer != null;
      case LLVM_IRPackage.INSTRUCTION_STORE__ALIGNMENT:
        return ALIGNMENT_EDEFAULT == null ? alignment != null : !ALIGNMENT_EDEFAULT.equals(alignment);
      case LLVM_IRPackage.INSTRUCTION_STORE__NONTEMPORAL_INDEX:
        return nontemporalIndex != null;
      case LLVM_IRPackage.INSTRUCTION_STORE__ORDERING:
        return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
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
    result.append(" (alignment: ");
    result.append(alignment);
    result.append(", ordering: ");
    result.append(ordering);
    result.append(')');
    return result.toString();
  }

} //Instruction_storeImpl
