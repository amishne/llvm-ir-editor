/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.FunctionTypeOrPointerToFunctionTypeSuffix;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.ParameterType;
import com.intel.llvm.ireditor.lLVM_IR.Star;

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
 * An implementation of the model object '<em><b>Function Type Or Pointer To Function Type Suffix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionTypeOrPointerToFunctionTypeSuffixImpl#getContainedTypes <em>Contained Types</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionTypeOrPointerToFunctionTypeSuffixImpl#getVararg <em>Vararg</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionTypeOrPointerToFunctionTypeSuffixImpl#getStars <em>Stars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionTypeOrPointerToFunctionTypeSuffixImpl extends MinimalEObjectImpl.Container implements FunctionTypeOrPointerToFunctionTypeSuffix
{
  /**
   * The cached value of the '{@link #getContainedTypes() <em>Contained Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainedTypes()
   * @generated
   * @ordered
   */
  protected EList<ParameterType> containedTypes;

  /**
   * The default value of the '{@link #getVararg() <em>Vararg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVararg()
   * @generated
   * @ordered
   */
  protected static final String VARARG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVararg() <em>Vararg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVararg()
   * @generated
   * @ordered
   */
  protected String vararg = VARARG_EDEFAULT;

  /**
   * The cached value of the '{@link #getStars() <em>Stars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStars()
   * @generated
   * @ordered
   */
  protected EList<Star> stars;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionTypeOrPointerToFunctionTypeSuffixImpl()
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
    return LLVM_IRPackage.Literals.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterType> getContainedTypes()
  {
    if (containedTypes == null)
    {
      containedTypes = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__CONTAINED_TYPES);
    }
    return containedTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVararg()
  {
    return vararg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVararg(String newVararg)
  {
    String oldVararg = vararg;
    vararg = newVararg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__VARARG, oldVararg, vararg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Star> getStars()
  {
    if (stars == null)
    {
      stars = new EObjectContainmentEList<Star>(Star.class, this, LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__STARS);
    }
    return stars;
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
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__CONTAINED_TYPES:
        return ((InternalEList<?>)getContainedTypes()).basicRemove(otherEnd, msgs);
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__STARS:
        return ((InternalEList<?>)getStars()).basicRemove(otherEnd, msgs);
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
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__CONTAINED_TYPES:
        return getContainedTypes();
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__VARARG:
        return getVararg();
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__STARS:
        return getStars();
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
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__CONTAINED_TYPES:
        getContainedTypes().clear();
        getContainedTypes().addAll((Collection<? extends ParameterType>)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__VARARG:
        setVararg((String)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__STARS:
        getStars().clear();
        getStars().addAll((Collection<? extends Star>)newValue);
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
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__CONTAINED_TYPES:
        getContainedTypes().clear();
        return;
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__VARARG:
        setVararg(VARARG_EDEFAULT);
        return;
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__STARS:
        getStars().clear();
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
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__CONTAINED_TYPES:
        return containedTypes != null && !containedTypes.isEmpty();
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__VARARG:
        return VARARG_EDEFAULT == null ? vararg != null : !VARARG_EDEFAULT.equals(vararg);
      case LLVM_IRPackage.FUNCTION_TYPE_OR_POINTER_TO_FUNCTION_TYPE_SUFFIX__STARS:
        return stars != null && !stars.isEmpty();
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
    result.append(" (vararg: ");
    result.append(vararg);
    result.append(')');
    return result.toString();
  }

} //FunctionTypeOrPointerToFunctionTypeSuffixImpl
