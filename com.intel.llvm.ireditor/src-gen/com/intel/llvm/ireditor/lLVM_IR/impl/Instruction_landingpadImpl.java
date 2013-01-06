/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.FunctionRef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_landingpad;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.LandingpadClause;
import com.intel.llvm.ireditor.lLVM_IR.Type;

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
 * An implementation of the model object '<em><b>Instruction landingpad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_landingpadImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_landingpadImpl#getPersonalityType <em>Personality Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_landingpadImpl#getPersonalityFunction <em>Personality Function</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_landingpadImpl#getClauses <em>Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_landingpadImpl extends OtherInstructionImpl implements Instruction_landingpad
{
  /**
   * The cached value of the '{@link #getResultType() <em>Result Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultType()
   * @generated
   * @ordered
   */
  protected Type resultType;

  /**
   * The cached value of the '{@link #getPersonalityType() <em>Personality Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonalityType()
   * @generated
   * @ordered
   */
  protected Type personalityType;

  /**
   * The cached value of the '{@link #getPersonalityFunction() <em>Personality Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonalityFunction()
   * @generated
   * @ordered
   */
  protected FunctionRef personalityFunction;

  /**
   * The cached value of the '{@link #getClauses() <em>Clauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClauses()
   * @generated
   * @ordered
   */
  protected EList<LandingpadClause> clauses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Instruction_landingpadImpl()
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
    return LLVM_IRPackage.Literals.INSTRUCTION_LANDINGPAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getResultType()
  {
    return resultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResultType(Type newResultType, NotificationChain msgs)
  {
    Type oldResultType = resultType;
    resultType = newResultType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_LANDINGPAD__RESULT_TYPE, oldResultType, newResultType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultType(Type newResultType)
  {
    if (newResultType != resultType)
    {
      NotificationChain msgs = null;
      if (resultType != null)
        msgs = ((InternalEObject)resultType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_LANDINGPAD__RESULT_TYPE, null, msgs);
      if (newResultType != null)
        msgs = ((InternalEObject)newResultType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_LANDINGPAD__RESULT_TYPE, null, msgs);
      msgs = basicSetResultType(newResultType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_LANDINGPAD__RESULT_TYPE, newResultType, newResultType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getPersonalityType()
  {
    return personalityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPersonalityType(Type newPersonalityType, NotificationChain msgs)
  {
    Type oldPersonalityType = personalityType;
    personalityType = newPersonalityType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE, oldPersonalityType, newPersonalityType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonalityType(Type newPersonalityType)
  {
    if (newPersonalityType != personalityType)
    {
      NotificationChain msgs = null;
      if (personalityType != null)
        msgs = ((InternalEObject)personalityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE, null, msgs);
      if (newPersonalityType != null)
        msgs = ((InternalEObject)newPersonalityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE, null, msgs);
      msgs = basicSetPersonalityType(newPersonalityType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE, newPersonalityType, newPersonalityType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionRef getPersonalityFunction()
  {
    return personalityFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPersonalityFunction(FunctionRef newPersonalityFunction, NotificationChain msgs)
  {
    FunctionRef oldPersonalityFunction = personalityFunction;
    personalityFunction = newPersonalityFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION, oldPersonalityFunction, newPersonalityFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonalityFunction(FunctionRef newPersonalityFunction)
  {
    if (newPersonalityFunction != personalityFunction)
    {
      NotificationChain msgs = null;
      if (personalityFunction != null)
        msgs = ((InternalEObject)personalityFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION, null, msgs);
      if (newPersonalityFunction != null)
        msgs = ((InternalEObject)newPersonalityFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION, null, msgs);
      msgs = basicSetPersonalityFunction(newPersonalityFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION, newPersonalityFunction, newPersonalityFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LandingpadClause> getClauses()
  {
    if (clauses == null)
    {
      clauses = new EObjectContainmentEList<LandingpadClause>(LandingpadClause.class, this, LLVM_IRPackage.INSTRUCTION_LANDINGPAD__CLAUSES);
    }
    return clauses;
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
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__RESULT_TYPE:
        return basicSetResultType(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE:
        return basicSetPersonalityType(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION:
        return basicSetPersonalityFunction(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__CLAUSES:
        return ((InternalEList<?>)getClauses()).basicRemove(otherEnd, msgs);
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
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__RESULT_TYPE:
        return getResultType();
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE:
        return getPersonalityType();
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION:
        return getPersonalityFunction();
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__CLAUSES:
        return getClauses();
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
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__RESULT_TYPE:
        setResultType((Type)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE:
        setPersonalityType((Type)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION:
        setPersonalityFunction((FunctionRef)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__CLAUSES:
        getClauses().clear();
        getClauses().addAll((Collection<? extends LandingpadClause>)newValue);
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
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__RESULT_TYPE:
        setResultType((Type)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE:
        setPersonalityType((Type)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION:
        setPersonalityFunction((FunctionRef)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__CLAUSES:
        getClauses().clear();
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
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__RESULT_TYPE:
        return resultType != null;
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_TYPE:
        return personalityType != null;
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__PERSONALITY_FUNCTION:
        return personalityFunction != null;
      case LLVM_IRPackage.INSTRUCTION_LANDINGPAD__CLAUSES:
        return clauses != null && !clauses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Instruction_landingpadImpl
