/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.AddressSpace;
import com.intel.llvm.ireditor.lLVM_IR.Constant;
import com.intel.llvm.ireditor.lLVM_IR.GlobalVariable;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl#getLinkage <em>Linkage</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl#getAddrspace <em>Addrspace</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl#getTlsModel <em>Tls Model</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl#getSection <em>Section</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.GlobalVariableImpl#getAlign <em>Align</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalVariableImpl extends GlobalValueImpl implements GlobalVariable
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
   * The cached value of the '{@link #getAddrspace() <em>Addrspace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddrspace()
   * @generated
   * @ordered
   */
  protected AddressSpace addrspace;

  /**
   * The default value of the '{@link #getTlsModel() <em>Tls Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTlsModel()
   * @generated
   * @ordered
   */
  protected static final String TLS_MODEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTlsModel() <em>Tls Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTlsModel()
   * @generated
   * @ordered
   */
  protected String tlsModel = TLS_MODEL_EDEFAULT;

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
   * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialValue()
   * @generated
   * @ordered
   */
  protected Constant initialValue;

  /**
   * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection()
   * @generated
   * @ordered
   */
  protected static final String SECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSection()
   * @generated
   * @ordered
   */
  protected String section = SECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlign()
   * @generated
   * @ordered
   */
  protected static final String ALIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlign()
   * @generated
   * @ordered
   */
  protected String align = ALIGN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GlobalVariableImpl()
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
    return LLVM_IRPackage.Literals.GLOBAL_VARIABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__LINKAGE, oldLinkage, linkage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressSpace getAddrspace()
  {
    return addrspace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddrspace(AddressSpace newAddrspace, NotificationChain msgs)
  {
    AddressSpace oldAddrspace = addrspace;
    addrspace = newAddrspace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__ADDRSPACE, oldAddrspace, newAddrspace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddrspace(AddressSpace newAddrspace)
  {
    if (newAddrspace != addrspace)
    {
      NotificationChain msgs = null;
      if (addrspace != null)
        msgs = ((InternalEObject)addrspace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VARIABLE__ADDRSPACE, null, msgs);
      if (newAddrspace != null)
        msgs = ((InternalEObject)newAddrspace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VARIABLE__ADDRSPACE, null, msgs);
      msgs = basicSetAddrspace(newAddrspace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__ADDRSPACE, newAddrspace, newAddrspace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTlsModel()
  {
    return tlsModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTlsModel(String newTlsModel)
  {
    String oldTlsModel = tlsModel;
    tlsModel = newTlsModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__TLS_MODEL, oldTlsModel, tlsModel));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VARIABLE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VARIABLE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant getInitialValue()
  {
    return initialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialValue(Constant newInitialValue, NotificationChain msgs)
  {
    Constant oldInitialValue = initialValue;
    initialValue = newInitialValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__INITIAL_VALUE, oldInitialValue, newInitialValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialValue(Constant newInitialValue)
  {
    if (newInitialValue != initialValue)
    {
      NotificationChain msgs = null;
      if (initialValue != null)
        msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VARIABLE__INITIAL_VALUE, null, msgs);
      if (newInitialValue != null)
        msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.GLOBAL_VARIABLE__INITIAL_VALUE, null, msgs);
      msgs = basicSetInitialValue(newInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__INITIAL_VALUE, newInitialValue, newInitialValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSection()
  {
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSection(String newSection)
  {
    String oldSection = section;
    section = newSection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__SECTION, oldSection, section));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlign()
  {
    return align;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlign(String newAlign)
  {
    String oldAlign = align;
    align = newAlign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.GLOBAL_VARIABLE__ALIGN, oldAlign, align));
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
      case LLVM_IRPackage.GLOBAL_VARIABLE__ADDRSPACE:
        return basicSetAddrspace(null, msgs);
      case LLVM_IRPackage.GLOBAL_VARIABLE__TYPE:
        return basicSetType(null, msgs);
      case LLVM_IRPackage.GLOBAL_VARIABLE__INITIAL_VALUE:
        return basicSetInitialValue(null, msgs);
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
      case LLVM_IRPackage.GLOBAL_VARIABLE__NAME:
        return getName();
      case LLVM_IRPackage.GLOBAL_VARIABLE__LINKAGE:
        return getLinkage();
      case LLVM_IRPackage.GLOBAL_VARIABLE__ADDRSPACE:
        return getAddrspace();
      case LLVM_IRPackage.GLOBAL_VARIABLE__TLS_MODEL:
        return getTlsModel();
      case LLVM_IRPackage.GLOBAL_VARIABLE__TYPE:
        return getType();
      case LLVM_IRPackage.GLOBAL_VARIABLE__INITIAL_VALUE:
        return getInitialValue();
      case LLVM_IRPackage.GLOBAL_VARIABLE__SECTION:
        return getSection();
      case LLVM_IRPackage.GLOBAL_VARIABLE__ALIGN:
        return getAlign();
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
      case LLVM_IRPackage.GLOBAL_VARIABLE__NAME:
        setName((String)newValue);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__LINKAGE:
        setLinkage((String)newValue);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__ADDRSPACE:
        setAddrspace((AddressSpace)newValue);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__TLS_MODEL:
        setTlsModel((String)newValue);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__TYPE:
        setType((Type)newValue);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__INITIAL_VALUE:
        setInitialValue((Constant)newValue);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__SECTION:
        setSection((String)newValue);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__ALIGN:
        setAlign((String)newValue);
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
      case LLVM_IRPackage.GLOBAL_VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__LINKAGE:
        setLinkage(LINKAGE_EDEFAULT);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__ADDRSPACE:
        setAddrspace((AddressSpace)null);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__TLS_MODEL:
        setTlsModel(TLS_MODEL_EDEFAULT);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__TYPE:
        setType((Type)null);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__INITIAL_VALUE:
        setInitialValue((Constant)null);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__SECTION:
        setSection(SECTION_EDEFAULT);
        return;
      case LLVM_IRPackage.GLOBAL_VARIABLE__ALIGN:
        setAlign(ALIGN_EDEFAULT);
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
      case LLVM_IRPackage.GLOBAL_VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LLVM_IRPackage.GLOBAL_VARIABLE__LINKAGE:
        return LINKAGE_EDEFAULT == null ? linkage != null : !LINKAGE_EDEFAULT.equals(linkage);
      case LLVM_IRPackage.GLOBAL_VARIABLE__ADDRSPACE:
        return addrspace != null;
      case LLVM_IRPackage.GLOBAL_VARIABLE__TLS_MODEL:
        return TLS_MODEL_EDEFAULT == null ? tlsModel != null : !TLS_MODEL_EDEFAULT.equals(tlsModel);
      case LLVM_IRPackage.GLOBAL_VARIABLE__TYPE:
        return type != null;
      case LLVM_IRPackage.GLOBAL_VARIABLE__INITIAL_VALUE:
        return initialValue != null;
      case LLVM_IRPackage.GLOBAL_VARIABLE__SECTION:
        return SECTION_EDEFAULT == null ? section != null : !SECTION_EDEFAULT.equals(section);
      case LLVM_IRPackage.GLOBAL_VARIABLE__ALIGN:
        return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
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
    result.append(", tlsModel: ");
    result.append(tlsModel);
    result.append(", section: ");
    result.append(section);
    result.append(", align: ");
    result.append(align);
    result.append(')');
    return result.toString();
  }

} //GlobalVariableImpl
