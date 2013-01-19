package com.intel.llvm.ireditor.validation;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction;
import com.intel.llvm.ireditor.lLVM_IR.Parameter;
import com.intel.llvm.ireditor.names.NameResolver;
import com.intel.llvm.ireditor.names.NumberedName;

public class NameMapper {
	private NameResolver namer = new NameResolver();
	private NumberedName prevName = null;
	// A WeakHashMap is used because a modification in the function def just removes the function
	// from the visited set, but does not clear anything in prevNames.
	private Map<EObject, NumberedName> prevNames = new WeakHashMap<EObject, NumberedName>();
	private Set<FunctionDef> visited = new HashSet<FunctionDef>();
	
	public NumberedName getPrecedingNumberedObjectName(EObject object) {
		EObject enclosing = object.eContainer();
		while (enclosing instanceof FunctionDef == false) enclosing = enclosing.eContainer();
		final FunctionDef enclosingFunction = (FunctionDef) enclosing;
		if (visited.contains(enclosingFunction) == false) {
			mapNames(enclosingFunction);
			visited.add(enclosingFunction);
			enclosingFunction.eAdapters().add(new Adapter() {
				
				public void setTarget(Notifier newTarget) {}
				
				public void notifyChanged(Notification notification) {
					visited.remove(enclosingFunction);
				}
				
				public boolean isAdapterForType(Object type) {
					return true;
				}
				
				public Notifier getTarget() {
					return enclosingFunction;
				}
			});
		}
		return prevNames.get(object);
	}

	private void mapNames(FunctionDef f) {
		prevName = null;
		for (Parameter p : f.getHeader().getParameters().getParameters()) {
			addName(p);
		}
		for (BasicBlock bb : f.getBody().getBasicBlocks()) {
			addName(bb);
			for (Instruction inst : bb.getInstructions()) {
				addName(inst);
			}
		}
	}

	private void addName(EObject object) {
		NumberedName name = namer.resolveNumberedName(object);
		if (name == null) return; // Not a numbered name
		
		prevNames.put(object, prevName);
		prevName = name;
	}

}
