/*
Copyright (c) 2013, Intel Corporation

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
      this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
      this list of conditions and the following disclaimer in the documentation
      and/or other materials provided with the distribution.
    * Neither the name of Intel Corporation nor the names of its contributors
      may be used to endorse or promote products derived from this software
      without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package com.intel.llvm.ireditor.cfg.views;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;

import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.CompositeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.DirectedGraphLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalShift;

import com.google.common.collect.Sets;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlock;
import com.intel.llvm.ireditor.lLVM_IR.BasicBlockRef;
import com.intel.llvm.ireditor.lLVM_IR.FunctionDef;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_br;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_indirectbr;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_nonVoid;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_invoke_void;
import com.intel.llvm.ireditor.lLVM_IR.Instruction_switch;
import com.intel.llvm.ireditor.lLVM_IR.Model;
import com.intel.llvm.ireditor.lLVM_IR.TerminatorInstruction;
import com.intel.llvm.ireditor.lLVM_IR.TopLevelElement;
import com.intel.llvm.ireditor.lLVM_IR.util.LLVM_IRSwitch;

public class LlvmCfgView extends ViewPart {

	class LinkWithEditorPartListener implements IPartListener2 {
		@Override public void partHidden(IWorkbenchPartReference partRef) {
			if (partRef.getId().equals("com.intel.llvm.ireditor.LLVM_IR") == false) return;
			unlinkFromPart(partRef.getPart(true));
		}
		@Override public void partVisible(IWorkbenchPartReference partRef) {
			if (partRef.getId().equals("com.intel.llvm.ireditor.LLVM_IR") == false) return;
			linkWithPart(partRef.getPart(true));
		}
		
		@Override public void partActivated(IWorkbenchPartReference partRef) {}
		@Override public void partDeactivated(IWorkbenchPartReference partRef) {}
		@Override public void partBroughtToTop(IWorkbenchPartReference partRef) {}
		@Override public void partClosed(IWorkbenchPartReference partRef) {}
		@Override public void partOpened(IWorkbenchPartReference partRef) {}
		@Override public void partInputChanged(IWorkbenchPartReference partRef) {}
		
	}
	
	class GraphicalModel {
		class ModelListener implements IXtextModelListener {
			@Override public void modelChanged(final XtextResource resource) {
				graph.getDisplay().syncExec(new Runnable() {
				    public void run() {
				        update(resource);
				    }
				});
			}
		}
		
		class NodeCreator extends LLVM_IRSwitch<Collection<? extends EObject>> {
			ThreadLocal<FunctionDef> currFunc = new ThreadLocal<FunctionDef>();
			
			@Override public Collection<? extends EObject> caseModel(Model object) {
				List<EObject> objects = new LinkedList<EObject>();
				for (TopLevelElement toplevel : object.getElements()) {
					Collection<? extends EObject> result = doSwitch(toplevel);
					if (result != null) objects.addAll(result);
				}
				return objects;
			}
			
			@Override public Collection<? extends EObject> caseFunctionDef(FunctionDef object) {
				List<EObject> objects = new LinkedList<EObject>();
				objects.add(object);
				if (nodes.containsKey(object) == false) {
					GraphNode node = createNode(object, object.getHeader().getName());
					nodes.put(object, node);
				}
				currFunc.set(object);
				for (BasicBlock bb : object.getBasicBlocks()) {
					Collection<? extends EObject> result = doSwitch(bb);
					if (result != null) objects.addAll(result);
				}
				return objects;
			}
			
			@Override public Collection<? extends EObject> caseBasicBlock(BasicBlock object) {
				if (nodes.containsKey(object) == false) {
					String name = currFunc.get().getHeader().getName() + " :: " + object.getName();
					GraphNode node = createNode(object, name);
					nodes.put(object, node);
				}
				return Collections.singleton(object);
			}
		}
		
		class ConnectionCreator extends LLVM_IRSwitch<Boolean> {
			ThreadLocal<BasicBlock> currBB = new ThreadLocal<BasicBlock>();
			
			@Override public Boolean caseModel(Model object) {
				for (TopLevelElement toplevel : object.getElements()) {
					doSwitch(toplevel);
				}
				return true;
			}
			
			@Override public Boolean caseFunctionDef(FunctionDef object) {
				if (object.getBasicBlocks().size() == 0) {
					// Missing basic blocks!
					return true;
				}
				connect(object, object.getBasicBlocks().get(0));
				
				for (BasicBlock bb : object.getBasicBlocks()) {
					doSwitch(bb);
				}
				return true;
			}
			
			@Override public Boolean caseBasicBlock(BasicBlock object) {
				if (object.getInstructions().size() == 0) {
					// Missing instructions!
					return true;
				}
				currBB.set(object);
				return doSwitch(object.getInstructions().get(object.getInstructions().size()-1));
			}
			
			@Override
			public Boolean caseTerminatorInstruction(TerminatorInstruction object) {
				return doSwitch(object.getInstruction());
			}
			
			@Override
			public Boolean caseInstruction_br(Instruction_br object) {
				if (object.getUnconditional() != null) connect(currBB.get(), object.getUnconditional().getRef());
				if (object.getTrue() != null) connect(currBB.get(), object.getTrue().getRef());
				if (object.getFalse() != null) connect(currBB.get(), object.getFalse().getRef());
				return true;
			}
			
			@Override
			public Boolean caseInstruction_switch(Instruction_switch object) {
				for (BasicBlockRef bb : object.getDestinations()) {
					connect(currBB.get(), bb.getRef());
				}
				if (object.getDefaultDest() != null) connect(currBB.get(), object.getDefaultDest().getRef());
				return true;
			}
			
			@Override
			public Boolean caseInstruction_indirectbr(Instruction_indirectbr object) {
				for (BasicBlockRef bb : object.getDestinations()) {
					connect(currBB.get(), bb.getRef());
				}
				return true;
			}
			
			@Override
			public Boolean caseInstruction_invoke_void(Instruction_invoke_void object) {
				if (object.getToLabel() != null) connect(currBB.get(), object.getToLabel().getRef());
				if (object.getExceptionLabel() != null) connect(currBB.get(), object.getExceptionLabel().getRef());
				return true;
			}
			
			@Override
			public Boolean caseInstruction_invoke_nonVoid(Instruction_invoke_nonVoid object) {
				if (object.getToLabel() != null) connect(currBB.get(), object.getToLabel().getRef());
				if (object.getExceptionLabel() != null) connect(currBB.get(), object.getExceptionLabel().getRef());
				return true;
			}
		}
		
		private final NodeCreator nodeCreator = new NodeCreator();
		private final ConnectionCreator connectionCreator = new ConnectionCreator();
		private final ModelListener listener = new ModelListener();
		private final Map<EObject, GraphNode> nodes = new HashMap<EObject, GraphNode>();
		private final Set<GraphConnection> connections = new HashSet<GraphConnection>();
		private final XtextEditor editor;
		private final IXtextDocument doc;
		
		public GraphicalModel(XtextEditor editor) {
			this.editor = editor;
			this.doc = editor.getDocument();
			doc.modify(new IUnitOfWork.Void<XtextResource>() {
				@Override
				public void process(XtextResource state) throws Exception {
					update(state);
				}
			});
			doc.addModelListener(listener);
		}
		
		public void update(XtextResource resource) {
			List<EObject> appearing = new LinkedList<EObject>();
			for (EObject model : resource.getContents()) {
				Collection<? extends EObject> result = nodeCreator.doSwitch(model);
				if (result != null) appearing.addAll(result);
			}
			
			for (GraphConnection conn : connections) {
				conn.dispose();
			}
			
			HashSet<EObject> difference = Sets.newHashSet(Sets.difference(nodes.keySet(), Sets.newHashSet(appearing)));
			
			for (EObject obj : difference) {
				nodes.get(obj).dispose();
				nodes.remove(obj);
			}
			
			// All basic blocks have been added now; connect them.
			for (EObject model : resource.getContents()) {
				connectionCreator.doSwitch(model);
			}
			
			graph.applyLayout();
		}

		public void connect(EObject from, EObject to) {
			GraphConnection conn =
					new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, nodes.get(from), nodes.get(to));
			connections.add(conn);
		}
		
		public GraphNode createNode(final EObject obj, String name) {
			GraphNode result = new GraphNode(graph, ZestStyles.NODES_NO_ANIMATION, name);
			result.addListener(SWT.MouseDoubleClick, new Listener() {
				@Override
				public void handleEvent(Event event) {
					int start = NodeModelUtils.findActualNodeFor(obj).getOffset();
					int length = NodeModelUtils.findActualNodeFor(obj).getLength();
					editor.selectAndReveal(start, length);
				}
			});
			return result;
		}
		
		private void clear() {
			for (GraphConnection conn : connections) {
				conn.dispose();
			}
			
			for (GraphNode node : nodes.values()) {
				node.dispose();
			}
			graph.applyLayout();
		}

		public void dispose() {
			doc.removeModelListener(listener);
			clear();
		}
		
	}

	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.intel.llvm.ireditor.cfg.views.LlvmCfgView";

	private Graph graph;
	private Map<XtextEditor, GraphicalModel> active = new HashMap<XtextEditor, GraphicalModel>();
	
	private synchronized void linkWithPart(IWorkbenchPart part) {
		if (part instanceof XtextEditor == false) return;
		XtextEditor editor = (XtextEditor) part;
		if (active.containsKey(editor)) return;
		
		active.put(editor, new GraphicalModel(editor));
	}
	
	private synchronized void unlinkFromPart(IWorkbenchPart part) {
		if (part instanceof XtextEditor == false) return;
		GraphicalModel model = active.get((XtextEditor)part);
		if (model == null) return;
		
		model.dispose();
		active.remove(part);
	}
	
	public void createPartControl(Composite parent) {
		graph = new Graph(parent, SWT.NONE);
		graph.setLayoutAlgorithm(
				new CompositeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING, new LayoutAlgorithm[] {
						new DirectedGraphLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING),
						new HorizontalShift(LayoutStyles.NO_LAYOUT_NODE_RESIZING)
				}), true);
		
		getSite().getPage().addPartListener(new LinkWithEditorPartListener());
	}
	
	@Override
	public void setFocus() {}
	
}