/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.AlignStack;
import com.intel.llvm.ireditor.lLVM_IR.AttributeGroup;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributesImpl#getFunctionAttributes <em>Function Attributes</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributesImpl#getAlignstack <em>Alignstack</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributesImpl#getAlignstackValue <em>Alignstack Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.FunctionAttributesImpl#getFunctionAttributeGroupRefs <em>Function Attribute Group Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionAttributesImpl extends MinimalEObjectImpl.Container implements FunctionAttributes
{
  /**
   * The cached value of the '{@link #getFunctionAttributes() <em>Function Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionAttributes()
   * @generated
   * @ordered
   */
  protected EList<FunctionAttribute> functionAttributes;

  /**
   * The cached value of the '{@link #getAlignstack() <em>Alignstack</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignstack()
   * @generated
   * @ordered
   */
  protected EList<AlignStack> alignstack;

  /**
   * The cached value of the '{@link #getAlignstackValue() <em>Alignstack Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignstackValue()
   * @generated
   * @ordered
   */
  protected EList<String> alignstackValue;

  /**
   * The cached value of the '{@link #getFunctionAttributeGroupRefs() <em>Function Attribute Group Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionAttributeGroupRefs()
   * @generated
   * @ordered
   */
  protected EList<AttributeGroup> functionAttributeGroupRefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionAttributesImpl()
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
    return LLVM_IRPackage.Literals.FUNCTION_ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionAttribute> getFunctionAttributes()
  {
    if (functionAttributes == null)
    {
      functionAttributes = new EObjectContainmentEList<FunctionAttribute>(FunctionAttribute.class, this, LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTES);
    }
    return functionAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AlignStack> getAlignstack()
  {
    if (alignstack == null)
    {
      alignstack = new EObjectContainmentEList<AlignStack>(AlignStack.class, this, LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK);
    }
    return alignstack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAlignstackValue()
  {
    if (alignstackValue == null)
    {
      alignstackValue = new EDataTypeEList<String>(String.class, this, LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK_VALUE);
    }
    return alignstackValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeGroup> getFunctionAttributeGroupRefs()
  {
    if (functionAttributeGroupRefs == null)
    {
      functionAttributeGroupRefs = new EObjectResolvingEList<AttributeGroup>(AttributeGroup.class, this, LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTE_GROUP_REFS);
    }
    return functionAttributeGroupRefs;
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
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTES:
        return ((InternalEList<?>)getFunctionAttributes()).basicRemove(otherEnd, msgs);
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK:
        return ((InternalEList<?>)getAlignstack()).basicRemove(otherEnd, msgs);
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
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTES:
        return getFunctionAttributes();
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK:
        return getAlignstack();
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK_VALUE:
        return getAlignstackValue();
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTE_GROUP_REFS:
        return getFunctionAttributeGroupRefs();
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
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTES:
        getFunctionAttributes().clear();
        getFunctionAttributes().addAll((Collection<? extends FunctionAttribute>)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK:
        getAlignstack().clear();
        getAlignstack().addAll((Collection<? extends AlignStack>)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK_VALUE:
        getAlignstackValue().clear();
        getAlignstackValue().addAll((Collection<? extends String>)newValue);
        return;
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTE_GROUP_REFS:
        getFunctionAttributeGroupRefs().clear();
        getFunctionAttributeGroupRefs().addAll((Collection<? extends AttributeGroup>)newValue);
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
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTES:
        getFunctionAttributes().clear();
        return;
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK:
        getAlignstack().clear();
        return;
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK_VALUE:
        getAlignstackValue().clear();
        return;
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTE_GROUP_REFS:
        getFunctionAttributeGroupRefs().clear();
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
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTES:
        return functionAttributes != null && !functionAttributes.isEmpty();
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK:
        return alignstack != null && !alignstack.isEmpty();
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__ALIGNSTACK_VALUE:
        return alignstackValue != null && !alignstackValue.isEmpty();
      case LLVM_IRPackage.FUNCTION_ATTRIBUTES__FUNCTION_ATTRIBUTE_GROUP_REFS:
        return functionAttributeGroupRefs != null && !functionAttributeGroupRefs.isEmpty();
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
    result.append(" (alignstackValue: ");
    result.append(alignstackValue);
    result.append(')');
    return result.toString();
  }

} //FunctionAttributesImpl
