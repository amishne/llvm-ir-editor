package com.intel.llvm.ireditor;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValueRef;
import com.intel.llvm.ireditor.lLVM_IR.LocalValue;
import com.intel.llvm.ireditor.lLVM_IR.LocalValueRef;

public class LLVM_IRUtils {

	public static List<EObject> xrefs(EObject object) {
		List<EObject> result = new LinkedList<>();
		EObject root = EcoreUtil2.getRootContainer(object);
		
		if (object instanceof LocalValue) {
			for (LocalValueRef ref : EcoreUtil2.getAllContentsOfType(root, LocalValueRef.class)) {
				if (object == ref.getRef()) result.add(ref);
			}
		} else if (object instanceof BasicBlock) {
			for (BasicBlockRef ref : EcoreUtil2.getAllContentsOfType(root, BasicBlockRef.class)) {
				if (object == ref.getRef()) result.add(ref);
			}
		} else {
			for (GlobalValueRef ref : EcoreUtil2.getAllContentsOfType(root, GlobalValueRef.class)) {
				if (ref.getConstant() != null && object == ref.getConstant().getRef()) result.add(ref);
			}
		}
		
		return result;
	}

}
