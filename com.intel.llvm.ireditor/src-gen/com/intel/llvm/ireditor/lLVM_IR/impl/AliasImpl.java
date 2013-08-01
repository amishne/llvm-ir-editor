/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.Alias;
import com.intel.llvm.ireditor.lLVM_IR.Aliasee;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliasImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliasImpl#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliasImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliasImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AliasImpl#getAliasee <em>Aliasee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasImpl extends GlobalValueImpl implements Alias
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLinkage() <em>Linkage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkage()
   * @generated
   * @ordered
   */
  protected static final String LINKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinkage() <em>Linkage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkage()
   * @generated
   * @ordered
   */
  protected String linkage = LINKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final String VISIBILITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected String visibility = VISIBILITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getAliasee() <em>Aliasee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliasee()
   * @generated
   * @ordered
   */
  protected Aliasee aliasee;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AliasImpl()
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
    return LLVM_IRPackage.Literals.ALIAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIAS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLinkage()
  {
    return linkage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkage(String newLinkage)
  {
    String oldLinkage = linkage;
    linkage = newLinkage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIAS__LINKAGE, oldLinkage, linkage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(String newVisibility)
  {
    String oldVisibility = visibility;
    visibility = newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIAS__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIAS__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.ALIAS__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.ALIAS__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIAS__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aliasee getAliasee()
  {
    return aliasee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAliasee(Aliasee newAliasee, NotificationChain msgs)
  {
    Aliasee oldAliasee = aliasee;
    aliasee = newAliasee;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIAS__ALIASEE, oldAliasee, newAliasee);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAliasee(Aliasee newAliasee)
  {
    if (newAliasee != aliasee)
    {
      NotificationChain msgs = null;
      if (aliasee != null)
        msgs = ((InternalEObject)aliasee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.ALIAS__ALIASEE, null, msgs);
      if (newAliasee != null)
        msgs = ((InternalEObject)newAliasee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.ALIAS__ALIASEE, null, msgs);
      msgs = basicSetAliasee(newAliasee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ALIAS__ALIASEE, newAliasee, newAliasee));
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
      case LLVM_IRPackage.ALIAS__TYPE:
        return basicSetType(null, msgs);
      case LLVM_IRPackage.ALIAS__ALIASEE:
        return basicSetAliasee(null, msgs);
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
      case LLVM_IRPackage.ALIAS__NAME:
        return getName();
      case LLVM_IRPackage.ALIAS__LINKAGE:
        return getLinkage();
      case LLVM_IRPackage.ALIAS__VISIBILITY:
        return getVisibility();
      case LLVM_IRPackage.ALIAS__TYPE:
        return getType();
      case LLVM_IRPackage.ALIAS__ALIASEE:
        return getAliasee();
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
      case LLVM_IRPackage.ALIAS__NAME:
        setName((String)newValue);
        return;
      case LLVM_IRPackage.ALIAS__LINKAGE:
        setLinkage((String)newValue);
        return;
      case LLVM_IRPackage.ALIAS__VISIBILITY:
        setVisibility((String)newValue);
        return;
      case LLVM_IRPackage.ALIAS__TYPE:
        setType((Type)newValue);
        return;
      case LLVM_IRPackage.ALIAS__ALIASEE:
        setAliasee((Aliasee)newValue);
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
      case LLVM_IRPackage.ALIAS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LLVM_IRPackage.ALIAS__LINKAGE:
        setLinkage(LINKAGE_EDEFAULT);
        return;
      case LLVM_IRPackage.ALIAS__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case LLVM_IRPackage.ALIAS__TYPE:
        setType((Type)null);
        return;
      case LLVM_IRPackage.ALIAS__ALIASEE:
        setAliasee((Aliasee)null);
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
      case LLVM_IRPackage.ALIAS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LLVM_IRPackage.ALIAS__LINKAGE:
        return LINKAGE_EDEFAULT == null ? linkage != null : !LINKAGE_EDEFAULT.equals(linkage);
      case LLVM_IRPackage.ALIAS__VISIBILITY:
        return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
      case LLVM_IRPackage.ALIAS__TYPE:
        return type != null;
      case LLVM_IRPackage.ALIAS__ALIASEE:
        return aliasee != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", linkage: ");
    result.append(linkage);
    result.append(", visibility: ");
    result.append(visibility);
    result.append(')');
    return result.toString();
  }

} //AliasImpl
