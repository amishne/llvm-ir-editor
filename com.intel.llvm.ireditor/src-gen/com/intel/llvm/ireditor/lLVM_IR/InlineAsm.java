/**
 */
package com.intel.llvm.ireditor.lLVM_IR;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Asm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.InlineAsm#getAsmLine <em>Asm Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInlineAsm()
 * @model
 * @generated
 */
public interface InlineAsm extends TopLevelElement
{
  /**
   * Returns the value of the '<em><b>Asm Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asm Line</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asm Line</em>' attribute.
   * @see #setAsmLine(String)
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getInlineAsm_AsmLine()
   * @model
   * @generated
   */
  String getAsmLine();

  /**
   * Sets the value of the '{@link com.intel.llvm.ireditor.lLVM_IR.InlineAsm#getAsmLine <em>Asm Line</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asm Line</em>' attribute.
   * @see #getAsmLine()
   * @generated
   */
  void setAsmLine(String value);

} // InlineAsm
