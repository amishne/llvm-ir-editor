package com.intel.llvm.ireditor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.nodemodel.INode;

import com.intel.llvm.ireditor.lLVM_IR.util.LLVM_IRSwitch;

public class NameMap {
	private Namer namer = new Namer();
	private Map<INode, Name> map = new HashMap<INode, Name>();
	
	public void process(INode root) {
		for (INode node : root.getAsTreeIterable()) {
			Name name = namer.getName(node);
			if (name != null) map.put(node, name);
		}
	}
	
	private static class Namer extends LLVM_IRSwitch<Name> {

		public Name getName(INode node) {
			return doSwitch(node.getGrammarElement());
		}
		
	}
}
