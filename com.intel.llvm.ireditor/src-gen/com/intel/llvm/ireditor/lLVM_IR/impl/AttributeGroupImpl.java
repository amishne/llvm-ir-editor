/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.AlignStack;
import com.intel.llvm.ireditor.lLVM_IR.AttributeGroup;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttribute;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.TargetSpecificAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AttributeGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AttributeGroupImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AttributeGroupImpl#getAlignstack <em>Alignstack</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AttributeGroupImpl#getAlignstackValue <em>Alignstack Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.AttributeGroupImpl#getTargetSpecificAttributes <em>Target Specific Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeGroupImpl extends TopLevelElementImpl implements AttributeGroup
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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<FunctionAttribute> attributes;

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
   * The cached value of the '{@link #getTargetSpecificAttributes() <em>Target Specific Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetSpecificAttributes()
   * @generated
   * @ordered
   */
  protected EList<TargetSpecificAttribute> targetSpecificAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeGroupImpl()
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
    return LLVM_IRPackage.Literals.ATTRIBUTE_GROUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.ATTRIBUTE_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<FunctionAttribute>(FunctionAttribute.class, this, LLVM_IRPackage.ATTRIBUTE_GROUP__ATTRIBUTES);
    }
    return attributes;
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
      alignstack = new EObjectContainmentEList<AlignStack>(AlignStack.class, this, LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK);
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
      alignstackValue = new EDataTypeEList<String>(String.class, this, LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK_VALUE);
    }
    return alignstackValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TargetSpecificAttribute> getTargetSpecificAttributes()
  {
    if (targetSpecificAttributes == null)
    {
      targetSpecificAttributes = new EObjectContainmentEList<TargetSpecificAttribute>(TargetSpecificAttribute.class, this, LLVM_IRPackage.ATTRIBUTE_GROUP__TARGET_SPECIFIC_ATTRIBUTES);
    }
    return targetSpecificAttributes;
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
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK:
        return ((InternalEList<?>)getAlignstack()).basicRemove(otherEnd, msgs);
      case LLVM_IRPackage.ATTRIBUTE_GROUP__TARGET_SPECIFIC_ATTRIBUTES:
        return ((InternalEList<?>)getTargetSpecificAttributes()).basicRemove(otherEnd, msgs);
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
      case LLVM_IRPackage.ATTRIBUTE_GROUP__NAME:
        return getName();
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ATTRIBUTES:
        return getAttributes();
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK:
        return getAlignstack();
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK_VALUE:
        return getAlignstackValue();
      case LLVM_IRPackage.ATTRIBUTE_GROUP__TARGET_SPECIFIC_ATTRIBUTES:
        return getTargetSpecificAttributes();
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
      case LLVM_IRPackage.ATTRIBUTE_GROUP__NAME:
        setName((String)newValue);
        return;
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends FunctionAttribute>)newValue);
        return;
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK:
        getAlignstack().clear();
        getAlignstack().addAll((Collection<? extends AlignStack>)newValue);
        return;
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK_VALUE:
        getAlignstackValue().clear();
        getAlignstackValue().addAll((Collection<? extends String>)newValue);
        return;
      case LLVM_IRPackage.ATTRIBUTE_GROUP__TARGET_SPECIFIC_ATTRIBUTES:
        getTargetSpecificAttributes().clear();
        getTargetSpecificAttributes().addAll((Collection<? extends TargetSpecificAttribute>)newValue);
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
      case LLVM_IRPackage.ATTRIBUTE_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ATTRIBUTES:
        getAttributes().clear();
        return;
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK:
        getAlignstack().clear();
        return;
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK_VALUE:
        getAlignstackValue().clear();
        return;
      case LLVM_IRPackage.ATTRIBUTE_GROUP__TARGET_SPECIFIC_ATTRIBUTES:
        getTargetSpecificAttributes().clear();
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
      case LLVM_IRPackage.ATTRIBUTE_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK:
        return alignstack != null && !alignstack.isEmpty();
      case LLVM_IRPackage.ATTRIBUTE_GROUP__ALIGNSTACK_VALUE:
        return alignstackValue != null && !alignstackValue.isEmpty();
      case LLVM_IRPackage.ATTRIBUTE_GROUP__TARGET_SPECIFIC_ATTRIBUTES:
        return targetSpecificAttributes != null && !targetSpecificAttributes.isEmpty();
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
    result.append(", alignstackValue: ");
    result.append(alignstackValue);
    result.append(')');
    return result.toString();
  }

} //AttributeGroupImpl
