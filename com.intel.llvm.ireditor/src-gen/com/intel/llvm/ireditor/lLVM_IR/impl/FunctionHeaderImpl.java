/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes;
import com.intel.llvm.ireditor.lLVM_IR.FunctionHeader;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.Parameter;
import com.intel.llvm.ireditor.lLVM_IR.ParameterType;

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
 * An implementation of the model object '<em><b>Function Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl#getCconv <em>Cconv</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl#getRettype <em>Rettype</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionHeaderImpl#getAttrs <em>Attrs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionHeaderImpl extends GlobalValueDefImpl implements FunctionHeader
{
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
   * The default value of the '{@link #getCconv() <em>Cconv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCconv()
   * @generated
   * @ordered
   */
  protected static final String CCONV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCconv() <em>Cconv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCconv()
   * @generated
   * @ordered
   */
  protected String cconv = CCONV_EDEFAULT;

  /**
   * The cached value of the '{@link #getRettype() <em>Rettype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRettype()
   * @generated
   * @ordered
   */
  protected ParameterType rettype;

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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrs()
   * @generated
   * @ordered
   */
  protected FunctionAttributes attrs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionHeaderImpl()
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
    return LLVM_IRPackage.Literals.FUNCTION_HEADER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.FUNCTION_HEADER__LINKAGE, oldLinkage, linkage));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.FUNCTION_HEADER__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCconv()
  {
    return cconv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCconv(String newCconv)
  {
    String oldCconv = cconv;
    cconv = newCconv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.FUNCTION_HEADER__CCONV, oldCconv, cconv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType getRettype()
  {
    return rettype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRettype(ParameterType newRettype, NotificationChain msgs)
  {
    ParameterType oldRettype = rettype;
    rettype = newRettype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.FUNCTION_HEADER__RETTYPE, oldRettype, newRettype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRettype(ParameterType newRettype)
  {
    if (newRettype != rettype)
    {
      NotificationChain msgs = null;
      if (rettype != null)
        msgs = ((InternalEObject)rettype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.FUNCTION_HEADER__RETTYPE, null, msgs);
      if (newRettype != null)
        msgs = ((InternalEObject)newRettype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.FUNCTION_HEADER__RETTYPE, null, msgs);
      msgs = basicSetRettype(newRettype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.FUNCTION_HEADER__RETTYPE, newRettype, newRettype));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.FUNCTION_HEADER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, LLVM_IRPackage.FUNCTION_HEADER__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionAttributes getAttrs()
  {
    return attrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttrs(FunctionAttributes newAttrs, NotificationChain msgs)
  {
    FunctionAttributes oldAttrs = attrs;
    attrs = newAttrs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.FUNCTION_HEADER__ATTRS, oldAttrs, newAttrs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrs(FunctionAttributes newAttrs)
  {
    if (newAttrs != attrs)
    {
      NotificationChain msgs = null;
      if (attrs != null)
        msgs = ((InternalEObject)attrs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.FUNCTION_HEADER__ATTRS, null, msgs);
      if (newAttrs != null)
        msgs = ((InternalEObject)newAttrs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.FUNCTION_HEADER__ATTRS, null, msgs);
      msgs = basicSetAttrs(newAttrs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.FUNCTION_HEADER__ATTRS, newAttrs, newAttrs));
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
      case LLVM_IRPackage.FUNCTION_HEADER__RETTYPE:
        return basicSetRettype(null, msgs);
      case LLVM_IRPackage.FUNCTION_HEADER__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case LLVM_IRPackage.FUNCTION_HEADER__ATTRS:
        return basicSetAttrs(null, msgs);
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
      case LLVM_IRPackage.FUNCTION_HEADER__LINKAGE:
        return getLinkage();
      case LLVM_IRPackage.FUNCTION_HEADER__VISIBILITY:
        return getVisibility();
      case LLVM_IRPackage.FUNCTION_HEADER__CCONV:
        return getCconv();
      case LLVM_IRPackage.FUNCTION_HEADER__RETTYPE:
        return getRettype();
      case LLVM_IRPackage.FUNCTION_HEADER__NAME:
        return getName();
      case LLVM_IRPackage.FUNCTION_HEADER__PARAMETERS:
        return getParameters();
      case LLVM_IRPackage.FUNCTION_HEADER__ATTRS:
        return getAttrs();
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
      case LLVM_IRPackage.FUNCTION_HEADER__LINKAGE:
        setLinkage((String)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__VISIBILITY:
        setVisibility((String)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__CCONV:
        setCconv((String)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__RETTYPE:
        setRettype((ParameterType)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__NAME:
        setName((String)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__ATTRS:
        setAttrs((FunctionAttributes)newValue);
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
      case LLVM_IRPackage.FUNCTION_HEADER__LINKAGE:
        setLinkage(LINKAGE_EDEFAULT);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__CCONV:
        setCconv(CCONV_EDEFAULT);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__RETTYPE:
        setRettype((ParameterType)null);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__PARAMETERS:
        getParameters().clear();
        return;
      case LLVM_IRPackage.FUNCTION_HEADER__ATTRS:
        setAttrs((FunctionAttributes)null);
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
      case LLVM_IRPackage.FUNCTION_HEADER__LINKAGE:
        return LINKAGE_EDEFAULT == null ? linkage != null : !LINKAGE_EDEFAULT.equals(linkage);
      case LLVM_IRPackage.FUNCTION_HEADER__VISIBILITY:
        return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
      case LLVM_IRPackage.FUNCTION_HEADER__CCONV:
        return CCONV_EDEFAULT == null ? cconv != null : !CCONV_EDEFAULT.equals(cconv);
      case LLVM_IRPackage.FUNCTION_HEADER__RETTYPE:
        return rettype != null;
      case LLVM_IRPackage.FUNCTION_HEADER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LLVM_IRPackage.FUNCTION_HEADER__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case LLVM_IRPackage.FUNCTION_HEADER__ATTRS:
        return attrs != null;
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
    result.append(" (linkage: ");
    result.append(linkage);
    result.append(", visibility: ");
    result.append(visibility);
    result.append(", cconv: ");
    result.append(cconv);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionHeaderImpl
