/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Assembler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.InlineAssembler#getAssembler <em>Assembler</em>}</li>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.InlineAssembler#getFlags <em>Flags</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInlineAssembler()
 * @model
 * @generated
 */
public interface InlineAssembler extends Callee
{
  /**
   * Returns the value of the '<em><b>Assembler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assembler</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assembler</em>' attribute.
   * @see #setAssembler(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInlineAssembler_Assembler()
   * @model
   * @generated
   */
  String getAssembler();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAssembler#getAssembler <em>Assembler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assembler</em>' attribute.
   * @see #getAssembler()
   * @generated
   */
  void setAssembler(String value);

  /**
   * Returns the value of the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flags</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flags</em>' attribute.
   * @see #setFlags(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInlineAssembler_Flags()
   * @model
   * @generated
   */
  String getFlags();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAssembler#getFlags <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flags</em>' attribute.
   * @see #getFlags()
   * @generated
   */
  void setFlags(String value);

} // InlineAssembler
