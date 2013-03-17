package com.intel.llvm.ireditor.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.MarkerCreator;
import org.eclipse.xtext.ui.editor.validation.MarkerIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.ValidationJob;
import org.eclipse.xtext.ui.validation.MarkerTypeProvider;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;

import com.google.inject.Inject;

// From https://bugs.eclipse.org/bugs/show_bug.cgi?id=388399
public class LlvmXtextEditorCallback extends AbstractDirtyStateAwareEditorCallback {
	@Inject
    private IResourceValidator resourceValidator;
    @Inject 
    private MarkerCreator markerCreator;
    @Inject
    private MarkerTypeProvider markerTypeProvider;
    @Inject
    private IssueResolutionProvider issueResolutionProvider;

    @Override
    public void afterCreatePartControl(XtextEditor editor) {
        super.afterCreatePartControl(editor);
        validate(editor);
    }

    private void validate(XtextEditor xtextEditor) {
        if (xtextEditor == null) return;
        if (xtextEditor.getInternalSourceViewer() == null) return;
        
        IXtextDocument xtextDocument = xtextEditor.getDocument();
        IResource resource = xtextEditor.getResource();
        IValidationIssueProcessor issueProcessor = resource != null ?
            new MarkerIssueProcessor(resource, markerCreator, markerTypeProvider) :
            new AnnotationIssueProcessor(xtextDocument, xtextEditor.getInternalSourceViewer().getAnnotationModel(),
            		issueResolutionProvider);
        ValidationJob validationJob = new ValidationJob(resourceValidator, xtextDocument, issueProcessor,
                CheckMode.ALL);
        validationJob.schedule();
    }
}
