/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getFromType <em>From Type</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getValue <em>Value</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getTargetType <em>Target Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConversionInstruction()
 * @model
 * @generated
 */
public interface ConversionInstruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Opcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opcode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opcode</em>' attribute.
   * @see #setOpcode(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConversionInstruction_Opcode()
   * @model
   * @generated
   */
  String getOpcode();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getOpcode <em>Opcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opcode</em>' attribute.
   * @see #getOpcode()
   * @generated
   */
  void setOpcode(String value);

  /**
   * Returns the value of the '<em><b>From Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Type</em>' containment reference.
   * @see #setFromType(Type)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConversionInstruction_FromType()
   * @model containment="true"
   * @generated
   */
  Type getFromType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getFromType <em>From Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Type</em>' containment reference.
   * @see #getFromType()
   * @generated
   */
  void setFromType(Type value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ValueRef)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConversionInstruction_Value()
   * @model containment="true"
   * @generated
   */
  ValueRef getValue();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueRef value);

  /**
   * Returns the value of the '<em><b>Target Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Type</em>' containment reference.
   * @see #setTargetType(Type)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getConversionInstruction_TargetType()
   * @model containment="true"
   * @generated
   */
  Type getTargetType();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.ConversionInstruction#getTargetType <em>Target Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Type</em>' containment reference.
   * @see #getTargetType()
   * @generated
   */
  void setTargetType(Type value);

} // ConversionInstruction
