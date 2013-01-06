/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.InlineAssembler;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Assembler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.InlineAssemblerImpl#getAssembler <em>Assembler</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.InlineAssemblerImpl#getFlags <em>Flags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InlineAssemblerImpl extends CalleeImpl implements InlineAssembler
{
  /**
   * The default value of the '{@link #getAssembler() <em>Assembler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssembler()
   * @generated
   * @ordered
   */
  protected static final String ASSEMBLER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssembler() <em>Assembler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssembler()
   * @generated
   * @ordered
   */
  protected String assembler = ASSEMBLER_EDEFAULT;

  /**
   * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlags()
   * @generated
   * @ordered
   */
  protected static final String FLAGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlags()
   * @generated
   * @ordered
   */
  protected String flags = FLAGS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InlineAssemblerImpl()
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
    return LLVM_IRPackage.Literals.INLINE_ASSEMBLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssembler()
  {
    return assembler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssembler(String newAssembler)
  {
    String oldAssembler = assembler;
    assembler = newAssembler;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INLINE_ASSEMBLER__ASSEMBLER, oldAssembler, assembler));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFlags()
  {
    return flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlags(String newFlags)
  {
    String oldFlags = flags;
    flags = newFlags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INLINE_ASSEMBLER__FLAGS, oldFlags, flags));
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
      case LLVM_IRPackage.INLINE_ASSEMBLER__ASSEMBLER:
        return getAssembler();
      case LLVM_IRPackage.INLINE_ASSEMBLER__FLAGS:
        return getFlags();
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
      case LLVM_IRPackage.INLINE_ASSEMBLER__ASSEMBLER:
        setAssembler((String)newValue);
        return;
      case LLVM_IRPackage.INLINE_ASSEMBLER__FLAGS:
        setFlags((String)newValue);
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
      case LLVM_IRPackage.INLINE_ASSEMBLER__ASSEMBLER:
        setAssembler(ASSEMBLER_EDEFAULT);
        return;
      case LLVM_IRPackage.INLINE_ASSEMBLER__FLAGS:
        setFlags(FLAGS_EDEFAULT);
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
      case LLVM_IRPackage.INLINE_ASSEMBLER__ASSEMBLER:
        return ASSEMBLER_EDEFAULT == null ? assembler != null : !ASSEMBLER_EDEFAULT.equals(assembler);
      case LLVM_IRPackage.INLINE_ASSEMBLER__FLAGS:
        return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
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
    result.append(" (assembler: ");
    result.append(assembler);
    result.append(", flags: ");
    result.append(flags);
    result.append(')');
    return result.toString();
  }

} //InlineAssemblerImpl
