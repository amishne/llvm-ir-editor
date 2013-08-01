/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.TargetInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.TargetInfoImpl#getInfoType <em>Info Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.TargetInfoImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetInfoImpl extends TopLevelElementImpl implements TargetInfo
{
  /**
   * The default value of the '{@link #getInfoType() <em>Info Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfoType()
   * @generated
   * @ordered
   */
  protected static final String INFO_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInfoType() <em>Info Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfoType()
   * @generated
   * @ordered
   */
  protected String infoType = INFO_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected static final String LAYOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected String layout = LAYOUT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetInfoImpl()
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
    return LLVM_IRPackage.Literals.TARGET_INFO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInfoType()
  {
    return infoType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfoType(String newInfoType)
  {
    String oldInfoType = infoType;
    infoType = newInfoType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.TARGET_INFO__INFO_TYPE, oldInfoType, infoType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(String newLayout)
  {
    String oldLayout = layout;
    layout = newLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.TARGET_INFO__LAYOUT, oldLayout, layout));
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
      case LLVM_IRPackage.TARGET_INFO__INFO_TYPE:
        return getInfoType();
      case LLVM_IRPackage.TARGET_INFO__LAYOUT:
        return getLayout();
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
      case LLVM_IRPackage.TARGET_INFO__INFO_TYPE:
        setInfoType((String)newValue);
        return;
      case LLVM_IRPackage.TARGET_INFO__LAYOUT:
        setLayout((String)newValue);
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
      case LLVM_IRPackage.TARGET_INFO__INFO_TYPE:
        setInfoType(INFO_TYPE_EDEFAULT);
        return;
      case LLVM_IRPackage.TARGET_INFO__LAYOUT:
        setLayout(LAYOUT_EDEFAULT);
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
      case LLVM_IRPackage.TARGET_INFO__INFO_TYPE:
        return INFO_TYPE_EDEFAULT == null ? infoType != null : !INFO_TYPE_EDEFAULT.equals(infoType);
      case LLVM_IRPackage.TARGET_INFO__LAYOUT:
        return LAYOUT_EDEFAULT == null ? layout != null : !LAYOUT_EDEFAULT.equals(layout);
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
    result.append(" (infoType: ");
    result.append(infoType);
    result.append(", layout: ");
    result.append(layout);
    result.append(')');
    return result.toString();
  }

} //TargetInfoImpl
