/**
 */
package com.intel.llvm.ireditor.lLVM_IR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.intel.llvm.ireditor.lLVM_IR.FunctionDef#getBasicBlocks <em>Basic Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionDef()
 * @model
 * @generated
 */
public interface FunctionDef extends Function
{
  /**
   * Returns the value of the '<em><b>Basic Blocks</b></em>' containment reference list.
   * The list contents are of type {@link com.intel.llvm.ireditor.lLVM_IR.BasicBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Blocks</em>' containment reference list.
   * @see com.intel.llvm.ireditor.lLVM_IR.LLVM_IRPackage#getFunctionDef_BasicBlocks()
   * @model containment="true"
   * @generated
   */
  EList<BasicBlock> getBasicBlocks();

} // FunctionDef
