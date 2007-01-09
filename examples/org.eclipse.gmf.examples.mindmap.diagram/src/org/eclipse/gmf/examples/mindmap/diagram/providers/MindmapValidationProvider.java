package org.eclipse.gmf.examples.mindmap.diagram.providers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;

import org.eclipse.emf.common.util.Diagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.emf.transaction.util.TransactionUtil;

import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IClientSelector;

import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;

import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

import org.eclipse.gmf.examples.mindmap.diagram.edit.parts.MapEditPart;

import org.eclipse.gmf.examples.mindmap.diagram.part.MindmapDiagramEditorPlugin;
import org.eclipse.gmf.examples.mindmap.diagram.part.MindmapDiagramEditorUtil;
import org.eclipse.gmf.examples.mindmap.diagram.part.MindmapVisualIDRegistry;

import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;

import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;

import org.eclipse.gmf.runtime.diagram.ui.OffscreenEditPartFactory;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;

import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;

import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;

import org.eclipse.jface.operation.IRunnableWithProgress;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import org.eclipse.ui.actions.WorkspaceModifyDelegatingOperation;

/**
 * @generated
 */
public class MindmapValidationProvider extends AbstractContributionItemProvider {
	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	protected IAction createAction(String actionId,
			IWorkbenchPartDescriptor partDescriptor) {
		if (ValidateAction.VALIDATE_ACTION_KEY.equals(actionId)) {
			return new ValidateAction(partDescriptor);
		}
		return super.createAction(actionId, partDescriptor);
	}

	/**
	 * @generated
	 */
	public static class ValidateAction extends Action {
		/**
		 * @generated
		 */
		public static final String VALIDATE_ACTION_KEY = "validateAction"; //$NON-NLS-1$
		/**
		 * @generated
		 */
		private IWorkbenchPartDescriptor workbenchPartDescriptor;

		/**
		 * @generated
		 */
		public ValidateAction(IWorkbenchPartDescriptor workbenchPartDescriptor) {
			setId(VALIDATE_ACTION_KEY);
			setText("Validate");
			this.workbenchPartDescriptor = workbenchPartDescriptor;
		}

		/**
		 * @generated
		 */
		public void run() {
			IWorkbenchPart workbenchPart = workbenchPartDescriptor
					.getPartPage().getActivePart();
			if (workbenchPart instanceof IDiagramWorkbenchPart) {
				final IDiagramWorkbenchPart part = (IDiagramWorkbenchPart) workbenchPart;
				try {
					new WorkspaceModifyDelegatingOperation(
							new IRunnableWithProgress() {
								public void run(IProgressMonitor monitor)
										throws InterruptedException,
										InvocationTargetException {
									runValidation(part.getDiagramEditPart(),
											part.getDiagram());
								}
							}).run(new NullProgressMonitor());
				} catch (Exception e) {
					MindmapDiagramEditorPlugin.getInstance().logError(
							"Validation action failed", e); //$NON-NLS-1$
				}
			}
		}

		/** 
		 * @generated
		 */
		public static void runValidation(View view) {
			try {
				if (MindmapDiagramEditorUtil.openDiagram(view.eResource())) {
					IEditorPart editorPart = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage()
							.getActiveEditor();
					if (editorPart instanceof IDiagramWorkbenchPart) {
						runValidation(((IDiagramWorkbenchPart) editorPart)
								.getDiagramEditPart(), view);
					} else {
						runNonUIValidation(view);
					}
				}
			} catch (Exception e) {
				MindmapDiagramEditorPlugin.getInstance().logError(
						"Validation action failed", e); //$NON-NLS-1$
			}
		}

		/**
		 * @generated
		 */
		public static void runNonUIValidation(View view) {
			DiagramEditPart diagramEditPart = OffscreenEditPartFactory
					.getInstance().createDiagramEditPart(view.getDiagram());
			runValidation(diagramEditPart, view);
		}

		/**
		 * @generated
		 */
		public static void runValidation(DiagramEditPart diagramEditPart,
				View view) {
			final View target = view;
			final DiagramEditPart diagramPart = diagramEditPart;
			Runnable task = new Runnable() {
				public void run() {
					try {
						constraintsActive = true;
						validate(diagramPart, target);
					} finally {
						constraintsActive = false;
					}
				}
			};
			TransactionalEditingDomain txDomain = TransactionUtil
					.getEditingDomain(target);
			if (txDomain != null) {
				try {
					txDomain.runExclusive(task);
				} catch (Exception e) {
					MindmapDiagramEditorPlugin.getInstance().logError(
							"Validation action failed", e); //$NON-NLS-1$
				}
			} else {
				task.run();
			}
		}

		/**
		 * @generated
		 */
		private static Diagnostic runEMFValidator(View target) {
			if (target.isSetElement() && target.getElement() != null) {
				return new Diagnostician() {
					public String getObjectLabel(EObject eObject) {
						return EMFCoreUtil.getQualifiedName(eObject, true);
					}
				}.validate(target.getElement());
			}
			return Diagnostic.OK_INSTANCE;
		}

		/**
		 * @generated
		 */
		private static void validate(DiagramEditPart diagramEditPart,
				View target) {
			IFile diagramFile = (target.eResource() != null) ? WorkspaceSynchronizer
					.getFile(target.eResource())
					: null;
			if (diagramFile != null) {
				MindmapMarkerNavigationProvider.deleteMarkers(diagramFile);
			}

			Diagnostic diagnostic = runEMFValidator(target);
			if (diagramFile != null) {
				MindmapMarkerNavigationProvider.createMarkers(diagramFile,
						diagnostic, diagramEditPart);
			}

			IBatchValidator validator = (IBatchValidator) ModelValidationService
					.getInstance().newValidator(EvaluationMode.BATCH);
			validator.setIncludeLiveConstraints(true);
			IStatus status = Status.OK_STATUS;
			if (target.isSetElement() && target.getElement() != null) {
				status = validator.validate(target.getElement());
				if (diagramFile != null) {
					MindmapMarkerNavigationProvider.createMarkers(diagramFile,
							status, diagramEditPart);
				}
			}

		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& MapEditPart.MODEL_ID.equals(MindmapVisualIDRegistry
							.getModelID((View) object));
		}
		return true;
	}

	/**
	 * @generated
	 */
	public static class DefaultCtx implements IClientSelector {
		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			return isInDefaultEditorContext(object);
		}
	}

} //MindmapValidationProvider
