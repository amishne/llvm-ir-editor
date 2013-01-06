/**
 */
package com.intel.llvm.ireditor.lLVM_IR.impl;

import com.intel.llvm.ireditor.lLVM_IR.ArgList;
import com.intel.llvm.ireditor.lLVM_IR.Callee;
import com.intel.llvm.ireditor.lLVM_IR.FunctionAttributes;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_call_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage;
import com.intel.llvm.ireditor.lLVM_IR.NonVoidType;
import com.intel.llvm.ireditor.lLVM_IR.ParameterAttributes;
import com.intel.llvm.ireditor.lLVM_IR.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction call non Void</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl#isIsTail <em>Is Tail</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl#getCconv <em>Cconv</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl#getReturnAttributes <em>Return Attributes</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl#getFunctionPointerType <em>Function Pointer Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.impl.Instruction_call_nonVoidImpl#getFunctionAttributes <em>Function Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instruction_call_nonVoidImpl extends MinimalEObjectImpl.Container implements Instruction_call_nonVoid
{
  /**
   * The default value of the '{@link #isIsTail() <em>Is Tail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTail()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TAIL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsTail() <em>Is Tail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTail()
   * @generated
   * @ordered
   */
  protected boolean isTail = IS_TAIL_EDEFAULT;

  /**
   * The default value of the '{@link #getOpcode() <em>Opcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpcode()
   * @generated
   * @ordered
   */
  protected static final String OPCODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpcode() <em>Opcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpcode()
   * @generated
   * @ordered
   */
  protected String opcode = OPCODE_EDEFAULT;

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
   * The cached value of the '{@link #getReturnAttributes() <em>Return Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnAttributes()
   * @generated
   * @ordered
   */
  protected ParameterAttributes returnAttributes;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected NonVoidType returnType;

  /**
   * The cached value of the '{@link #getFunctionPointerType() <em>Function Pointer Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionPointerType()
   * @generated
   * @ordered
   */
  protected Type functionPointerType;

  /**
   * The cached value of the '{@link #getCallee() <em>Callee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallee()
   * @generated
   * @ordered
   */
  protected Callee callee;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected ArgList args;

  /**
   * The cached value of the '{@link #getFunctionAttributes() <em>Function Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionAttributes()
   * @generated
   * @ordered
   */
  protected FunctionAttributes functionAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Instruction_call_nonVoidImpl()
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
    return LLVM_IRPackage.Literals.INSTRUCTION_CALL_NON_VOID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsTail()
  {
    return isTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsTail(boolean newIsTail)
  {
    boolean oldIsTail = isTail;
    isTail = newIsTail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__IS_TAIL, oldIsTail, isTail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpcode()
  {
    return opcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpcode(String newOpcode)
  {
    String oldOpcode = opcode;
    opcode = newOpcode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__OPCODE, oldOpcode, opcode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CCONV, oldCconv, cconv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterAttributes getReturnAttributes()
  {
    return returnAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnAttributes(ParameterAttributes newReturnAttributes, NotificationChain msgs)
  {
    ParameterAttributes oldReturnAttributes = returnAttributes;
    returnAttributes = newReturnAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES, oldReturnAttributes, newReturnAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnAttributes(ParameterAttributes newReturnAttributes)
  {
    if (newReturnAttributes != returnAttributes)
    {
      NotificationChain msgs = null;
      if (returnAttributes != null)
        msgs = ((InternalEObject)returnAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES, null, msgs);
      if (newReturnAttributes != null)
        msgs = ((InternalEObject)newReturnAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES, null, msgs);
      msgs = basicSetReturnAttributes(newReturnAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES, newReturnAttributes, newReturnAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonVoidType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(NonVoidType newReturnType, NotificationChain msgs)
  {
    NonVoidType oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(NonVoidType newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getFunctionPointerType()
  {
    return functionPointerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionPointerType(Type newFunctionPointerType, NotificationChain msgs)
  {
    Type oldFunctionPointerType = functionPointerType;
    functionPointerType = newFunctionPointerType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE, oldFunctionPointerType, newFunctionPointerType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionPointerType(Type newFunctionPointerType)
  {
    if (newFunctionPointerType != functionPointerType)
    {
      NotificationChain msgs = null;
      if (functionPointerType != null)
        msgs = ((InternalEObject)functionPointerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE, null, msgs);
      if (newFunctionPointerType != null)
        msgs = ((InternalEObject)newFunctionPointerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE, null, msgs);
      msgs = basicSetFunctionPointerType(newFunctionPointerType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE, newFunctionPointerType, newFunctionPointerType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Callee getCallee()
  {
    return callee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCallee(Callee newCallee, NotificationChain msgs)
  {
    Callee oldCallee = callee;
    callee = newCallee;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CALLEE, oldCallee, newCallee);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallee(Callee newCallee)
  {
    if (newCallee != callee)
    {
      NotificationChain msgs = null;
      if (callee != null)
        msgs = ((InternalEObject)callee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CALLEE, null, msgs);
      if (newCallee != null)
        msgs = ((InternalEObject)newCallee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CALLEE, null, msgs);
      msgs = basicSetCallee(newCallee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CALLEE, newCallee, newCallee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgList getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(ArgList newArgs, NotificationChain msgs)
  {
    ArgList oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__ARGS, oldArgs, newArgs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(ArgList newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__ARGS, newArgs, newArgs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionAttributes getFunctionAttributes()
  {
    return functionAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionAttributes(FunctionAttributes newFunctionAttributes, NotificationChain msgs)
  {
    FunctionAttributes oldFunctionAttributes = functionAttributes;
    functionAttributes = newFunctionAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES, oldFunctionAttributes, newFunctionAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionAttributes(FunctionAttributes newFunctionAttributes)
  {
    if (newFunctionAttributes != functionAttributes)
    {
      NotificationChain msgs = null;
      if (functionAttributes != null)
        msgs = ((InternalEObject)functionAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES, null, msgs);
      if (newFunctionAttributes != null)
        msgs = ((InternalEObject)newFunctionAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES, null, msgs);
      msgs = basicSetFunctionAttributes(newFunctionAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES, newFunctionAttributes, newFunctionAttributes));
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
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES:
        return basicSetReturnAttributes(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE:
        return basicSetFunctionPointerType(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CALLEE:
        return basicSetCallee(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__ARGS:
        return basicSetArgs(null, msgs);
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES:
        return basicSetFunctionAttributes(null, msgs);
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
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__IS_TAIL:
        return isIsTail();
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__OPCODE:
        return getOpcode();
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CCONV:
        return getCconv();
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES:
        return getReturnAttributes();
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_TYPE:
        return getReturnType();
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE:
        return getFunctionPointerType();
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CALLEE:
        return getCallee();
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__ARGS:
        return getArgs();
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES:
        return getFunctionAttributes();
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
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__IS_TAIL:
        setIsTail((Boolean)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__OPCODE:
        setOpcode((String)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CCONV:
        setCconv((String)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES:
        setReturnAttributes((ParameterAttributes)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_TYPE:
        setReturnType((NonVoidType)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE:
        setFunctionPointerType((Type)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CALLEE:
        setCallee((Callee)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__ARGS:
        setArgs((ArgList)newValue);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES:
        setFunctionAttributes((FunctionAttributes)newValue);
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
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__IS_TAIL:
        setIsTail(IS_TAIL_EDEFAULT);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__OPCODE:
        setOpcode(OPCODE_EDEFAULT);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CCONV:
        setCconv(CCONV_EDEFAULT);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES:
        setReturnAttributes((ParameterAttributes)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_TYPE:
        setReturnType((NonVoidType)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE:
        setFunctionPointerType((Type)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CALLEE:
        setCallee((Callee)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__ARGS:
        setArgs((ArgList)null);
        return;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES:
        setFunctionAttributes((FunctionAttributes)null);
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
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__IS_TAIL:
        return isTail != IS_TAIL_EDEFAULT;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__OPCODE:
        return OPCODE_EDEFAULT == null ? opcode != null : !OPCODE_EDEFAULT.equals(opcode);
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CCONV:
        return CCONV_EDEFAULT == null ? cconv != null : !CCONV_EDEFAULT.equals(cconv);
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_ATTRIBUTES:
        return returnAttributes != null;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__RETURN_TYPE:
        return returnType != null;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_POINTER_TYPE:
        return functionPointerType != null;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__CALLEE:
        return callee != null;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__ARGS:
        return args != null;
      case LLVM_IRPackage.INSTRUCTION_CALL_NON_VOID__FUNCTION_ATTRIBUTES:
        return functionAttributes != null;
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
    result.append(" (isTail: ");
    result.append(isTail);
    result.append(", opcode: ");
    result.append(opcode);
    result.append(", cconv: ");
    result.append(cconv);
    result.append(')');
    return result.toString();
  }

} //Instruction_call_nonVoidImpl
