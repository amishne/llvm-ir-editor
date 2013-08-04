/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.FastMathFlag;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_fmul;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction fmul</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_fmulImpl#getFastMathFlags <em>Fast Math Flags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_fmulImpl extends BinaryInstructionImpl implements Instruction_fmul
{
  /**
   * The cached value of the '{@link #getFastMathFlags() <em>Fast Math Flags</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFastMathFlags()
   * @generated
   * @ordered
   */
  protected EList<FastMathFlag> fastMathFlags;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Instruction_fmulImpl()
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
    return LLVM_IRPackage.Literals.INSTRUCTION_FMUL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FastMathFlag> getFastMathFlags()
  {
    if (fastMathFlags == null)
    {
      fastMathFlags = new EObjectContainmentEList<FastMathFlag>(FastMathFlag.class, this, LLVM_IRPackage.INSTRUCTION_FMUL__FAST_MATH_FLAGS);
    }
    return fastMathFlags;
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
      case LLVM_IRPackage.INSTRUCTION_FMUL__FAST_MATH_FLAGS:
        return ((InternalEList<?>)getFastMathFlags()).basicRemove(otherEnd, msgs);
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
      case LLVM_IRPackage.INSTRUCTION_FMUL__FAST_MATH_FLAGS:
        return getFastMathFlags();
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
      case LLVM_IRPackage.INSTRUCTION_FMUL__FAST_MATH_FLAGS:
        getFastMathFlags().clear();
        getFastMathFlags().addAll((Collection<? extends FastMathFlag>)newValue);
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
      case LLVM_IRPackage.INSTRUCTION_FMUL__FAST_MATH_FLAGS:
        getFastMathFlags().clear();
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
      case LLVM_IRPackage.INSTRUCTION_FMUL__FAST_MATH_FLAGS:
        return fastMathFlags != null && !fastMathFlags.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Instruction_fmulImpl
