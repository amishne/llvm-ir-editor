package com.intel.llvm.ireditor;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDef;
import com.intel.llvm.ireditor.lLVM_IR.GlobalValue;
import com.intel.llvm.ireditor.lLVM_IR.Instruction;
import com.intel.llvm.ireditor.lLVM_IR.Parameter;

public class ReverseNamedElementIterator implements Iterable<EObject> {
	public enum Mode { INST, BB, PARAM, GLOBAL }
	
	private final INode node;
	private final ReverseNamedElementIterator.Mode initialMode;
	
	public ReverseNamedElementIterator(EObject object) {
		node = NodeModelUtils.findActualNodeFor(object);
		
		if (object instanceof BasicBlock) {
			initialMode = Mode.BB;
		} else if (object instanceof Parameter) {
			initialMode = Mode.PARAM;
		} else if (object instanceof Instruction) {
			initialMode = Mode.INST;
		} else if (object instanceof GlobalValue) {
			initialMode = Mode.GLOBAL;
		} else {
			throw new IllegalArgumentException(
					"Can only reverse iterate from a basic block, a paremeter or an instruction");
		}
	}
	
	public ReverseNamedElementIterator(INode node, ReverseNamedElementIterator.Mode initialMode) {
		this.node = node;
		this.initialMode = initialMode;
	}

	@Override
	public Iterator<EObject> iterator() {
		return initialMode == Mode.GLOBAL ? new ReverseGlobalIterator() : new ReverseLocalIterator();
	}
	
	class ReverseGlobalIterator implements Iterator<EObject> {
		INode curr = node;
		
		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public EObject next() {
			INode prev = curr.getPreviousSibling();
			curr = prev;
			return NodeModelUtils.findActualSemanticObjectFor(prev);
		}
		
		@Override
		public boolean hasNext() {
			return curr.hasPreviousSibling();
		}
	}
	
	class ReverseLocalIterator implements Iterator<EObject> {
		INode curr = node;
		final INode lastParam = getLastParamOfEnclosingFunction(curr);
		ReverseNamedElementIterator.Mode mode = initialMode;
		
		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public EObject next() {
			switch (mode) {
			case INST: {
				if (curr.hasPreviousSibling()) {
					curr = curr.getPreviousSibling();
					// FIXME hack!
					if (curr.hasPreviousSibling() == false) {
						// This was actually the first inst in the bb!
						curr = curr.getParent();
						mode = Mode.BB;
					}
				} else {
					// After the first instruction in a bb comes the enclosing bb
					curr = curr.getParent();
					mode = Mode.BB;
				}
			} break;
			case BB: {
				if (curr.hasPreviousSibling()) {
					// Is there a bb preceding this one? Go to the last inst there.
					curr = getLastInst(curr.getPreviousSibling());
					mode = Mode.INST;
				} else {
					// No preceding bb? Proceed to last parameter.
					// If there aren't any parameters, we shouldn't be here
					// because hasNext() will return false.
					curr = lastParam;
					mode = Mode.PARAM;
				}
			} break;
			case PARAM: {
				curr = curr.getPreviousSibling();
			} break;
			case GLOBAL:
				throw new IllegalStateException("A local iterator should not be iterating over globals");
			}
			return NodeModelUtils.findActualSemanticObjectFor(curr);
		}
		
		@Override
		public boolean hasNext() {
			switch (mode) {
			case INST: return true; // There's always a preceding bb
			case BB: return curr.hasPreviousSibling() || lastParam != null;
			case PARAM: return curr.hasPreviousSibling();
			case GLOBAL: throw new IllegalStateException("A local iterator should not be iterating over globals");
			}
			return false;
		}
		
		INode getLastInst(INode bbNode) {
			BidiTreeIterator<INode> iterator = bbNode.getAsTreeIterable().iterator();
			iterator.previous(); // Don't need bbNode itself
			return iterator.previous();
		}
		
		private INode getLastParamOfEnclosingFunction(INode node) {
			INode functionDefNode;
			
			switch (initialMode) {
			case INST: functionDefNode = node.getParent().getParent().getParent(); break;
			case BB: functionDefNode = node.getParent().getParent(); break;
			default: functionDefNode = null;
			}
			if (functionDefNode == null) return null;
			
			FunctionDef functionDef = (FunctionDef) NodeModelUtils.findActualSemanticObjectFor(functionDefNode);
			EList<Parameter> params = functionDef.getHeader().getParameters().getParameters();
			if (params.isEmpty()) return null;
			return NodeModelUtils.findActualNodeFor(params.get(params.size()-1));
		}
	}
	
}