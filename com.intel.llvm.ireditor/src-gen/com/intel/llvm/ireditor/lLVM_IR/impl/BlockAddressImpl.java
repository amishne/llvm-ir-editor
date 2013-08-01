/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.BlockAddress;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.BlockAddressImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.BlockAddressImpl#getBasicBlock <em>Basic Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockAddressImpl extends ConstantImpl implements BlockAddress
{
  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected GlobalValueRef function;

  /**
   * The cached value of the '{@link #getBasicBlock() <em>Basic Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicBlock()
   * @generated
   * @ordered
   */
  protected BasicBlockRef basicBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockAddressImpl()
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
    return LLVM_IRPackage.Literals.BLOCK_ADDRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalValueRef getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(GlobalValueRef newFunction, NotificationChain msgs)
  {
    GlobalValueRef oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.BLOCK_ADDRESS__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(GlobalValueRef newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.BLOCK_ADDRESS__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.BLOCK_ADDRESS__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.BLOCK_ADDRESS__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicBlockRef getBasicBlock()
  {
    return basicBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicBlock(BasicBlockRef newBasicBlock, NotificationChain msgs)
  {
    BasicBlockRef oldBasicBlock = basicBlock;
    basicBlock = newBasicBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.BLOCK_ADDRESS__BASIC_BLOCK, oldBasicBlock, newBasicBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasicBlock(BasicBlockRef newBasicBlock)
  {
    if (newBasicBlock != basicBlock)
    {
      NotificationChain msgs = null;
      if (basicBlock != null)
        msgs = ((InternalEObject)basicBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.BLOCK_ADDRESS__BASIC_BLOCK, null, msgs);
      if (newBasicBlock != null)
        msgs = ((InternalEObject)newBasicBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.BLOCK_ADDRESS__BASIC_BLOCK, null, msgs);
      msgs = basicSetBasicBlock(newBasicBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.BLOCK_ADDRESS__BASIC_BLOCK, newBasicBlock, newBasicBlock));
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
      case LLVM_IRPackage.BLOCK_ADDRESS__FUNCTION:
        return basicSetFunction(null, msgs);
      case LLVM_IRPackage.BLOCK_ADDRESS__BASIC_BLOCK:
        return basicSetBasicBlock(null, msgs);
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
      case LLVM_IRPackage.BLOCK_ADDRESS__FUNCTION:
        return getFunction();
      case LLVM_IRPackage.BLOCK_ADDRESS__BASIC_BLOCK:
        return getBasicBlock();
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
      case LLVM_IRPackage.BLOCK_ADDRESS__FUNCTION:
        setFunction((GlobalValueRef)newValue);
        return;
      case LLVM_IRPackage.BLOCK_ADDRESS__BASIC_BLOCK:
        setBasicBlock((BasicBlockRef)newValue);
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
      case LLVM_IRPackage.BLOCK_ADDRESS__FUNCTION:
        setFunction((GlobalValueRef)null);
        return;
      case LLVM_IRPackage.BLOCK_ADDRESS__BASIC_BLOCK:
        setBasicBlock((BasicBlockRef)null);
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
      case LLVM_IRPackage.BLOCK_ADDRESS__FUNCTION:
        return function != null;
      case LLVM_IRPackage.BLOCK_ADDRESS__BASIC_BLOCK:
        return basicBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //BlockAddressImpl
