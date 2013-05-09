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
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
	private final Color COLOR_NORMAL_BB;
	private final Color COLOR_NO_PREDECESSORS;
	private final Color COLOR_FUNCTION;

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
					String name = object.getName();
					GraphNode node = createNode(object, name);
					nodes.put(object, node);
				}
				return Collections.singleton(object);
			}
		}
		
		class ConnectionCreator extends LLVM_IRSwitch<Collection<BasicBlock>> {
			ThreadLocal<BasicBlock> currBB = new ThreadLocal<BasicBlock>();
			
			@Override public Collection<BasicBlock> caseModel(Model object) {
				List<BasicBlock> havePredecessors = new LinkedList<BasicBlock>();
				for (TopLevelElement toplevel : object.getElements()) {
					Collection<BasicBlock> result = doSwitch(toplevel);
					if (result != null) havePredecessors.addAll(result);
				}
				return havePredecessors;
			}
			
			@Override public Collection<BasicBlock> caseFunctionDef(FunctionDef object) {
				if (object.getBasicBlocks().size() == 0) {
					// Missing basic blocks!
					return Collections.emptyList();
				}
				BasicBlock first = object.getBasicBlocks().get(0);
				List<BasicBlock> havePredecessors = new LinkedList<BasicBlock>();
				havePredecessors.add(first);
				connect(object, first);
				
				for (BasicBlock bb : object.getBasicBlocks()) {
					Collection<BasicBlock> result = doSwitch(bb);
					if (result != null) havePredecessors.addAll(result);
				}
				return havePredecessors;
			}
			
			@Override public Collection<BasicBlock> caseBasicBlock(BasicBlock object) {
				if (object.getInstructions().size() == 0) {
					// Missing instructions!
					return Collections.emptyList();
				}
				currBB.set(object);
				return doSwitch(object.getInstructions().get(object.getInstructions().size()-1));
			}
			
			@Override
			public Collection<BasicBlock> caseTerminatorInstruction(TerminatorInstruction object) {
				return doSwitch(object.getInstruction());
			}
			
			@Override
			public Collection<BasicBlock> caseInstruction_br(Instruction_br object) {
				List<BasicBlock> targets = new LinkedList<BasicBlock>();
				if (object.getUnconditional() != null) targets.add(object.getUnconditional().getRef());
				if (object.getTrue() != null) targets.add(object.getTrue().getRef());
				if (object.getFalse() != null) targets.add(object.getFalse().getRef());
				for (BasicBlock target : targets) {
					connect(currBB.get(), target);
				}
				return targets;
			}
			
			@Override
			public Collection<BasicBlock> caseInstruction_switch(Instruction_switch object) {
				List<BasicBlock> targets = new LinkedList<BasicBlock>();
				for (BasicBlockRef bb : object.getDestinations()) {
					targets.add(bb.getRef());
				}
				if (object.getDefaultDest() != null) {
					targets.add(object.getDefaultDest().getRef());
				}
				for (BasicBlock target : targets) {
					connect(currBB.get(), target);
				}
				return targets;
			}
			
			@Override
			public Collection<BasicBlock> caseInstruction_indirectbr(Instruction_indirectbr object) {
				List<BasicBlock> targets = new LinkedList<BasicBlock>();
				for (BasicBlockRef bb : object.getDestinations()) {
					targets.add(bb.getRef());
				}
				for (BasicBlock target : targets) {
					connect(currBB.get(), target);
				}
				return targets;
			}
			
			@Override
			public Collection<BasicBlock> caseInstruction_invoke_void(Instruction_invoke_void object) {
				List<BasicBlock> targets = new LinkedList<BasicBlock>();
				if (object.getToLabel() != null) targets.add(object.getToLabel().getRef());
				if (object.getExceptionLabel() != null) targets.add(object.getExceptionLabel().getRef());
				for (BasicBlock target : targets) {
					connect(currBB.get(), target);
				}
				return targets;
			}
			
			@Override
			public Collection<BasicBlock> caseInstruction_invoke_nonVoid(Instruction_invoke_nonVoid object) {
				List<BasicBlock> targets = new LinkedList<BasicBlock>();
				if (object.getToLabel() != null) targets.add(object.getToLabel().getRef());
				if (object.getExceptionLabel() != null) targets.add(object.getExceptionLabel().getRef());
				for (BasicBlock target : targets) {
					connect(currBB.get(), target);
				}
				return targets;
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
			Collection<BasicBlock> havePredecessors = new LinkedList<BasicBlock>();
			for (EObject model : resource.getContents()) {
				Collection<BasicBlock> results = connectionCreator.doSwitch(model);
				if (results != null) havePredecessors.addAll(results);
			}
			
			for (Entry<EObject, GraphNode> entry : nodes.entrySet()) {
				if (entry.getKey() instanceof BasicBlock && havePredecessors.contains(entry.getKey()) == false) {
					entry.getValue().setBackgroundColor(COLOR_NO_PREDECESSORS);
				} else {
					setColor(entry.getKey(), entry.getValue());
				}
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
			setColor(obj, result);
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
		
		private void setColor(EObject obj, GraphNode node) {
			node.setBackgroundColor(obj instanceof BasicBlock ? COLOR_NORMAL_BB : COLOR_FUNCTION);
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
	
	public LlvmCfgView() {
		COLOR_FUNCTION = new Color(Display.getCurrent(), 152, 251, 152);
		COLOR_NORMAL_BB = new Color(Display.getCurrent(), 193, 236, 250);
		COLOR_NO_PREDECESSORS = new Color(Display.getCurrent(), 208, 163, 163);
	}
	
	@Override
	public void dispose() {
		COLOR_NORMAL_BB.dispose();
		COLOR_NO_PREDECESSORS.dispose();
		COLOR_FUNCTION.dispose();
	}
	
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