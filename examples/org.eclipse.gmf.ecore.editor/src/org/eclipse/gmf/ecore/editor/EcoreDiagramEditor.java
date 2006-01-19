package org.eclipse.gmf.ecore.editor;

import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.ecore.edit.parts.EcoreEditPartFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.editor.FileDiagramEditor;
import org.eclipse.ui.IEditorInput;

/**
 * @generated
 */
public class EcoreDiagramEditor extends FileDiagramEditor {

	/**
	 * @generated
	 */
	public EcoreDiagramEditor() {
		super(true);
	}

	/**
	 * @generated
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		existingPaletteRoot = super.createPaletteRoot(existingPaletteRoot);
		EcorePaletteFactory.fillPalette(existingPaletteRoot, getDiagram());
		return existingPaletteRoot;
	}

	/**
	 * @generated
	 */
	protected void setDocumentProvider(IEditorInput input) {
		setDocumentProvider(new EcoreDocumentProvider());
	}

	/**
	 * @generated
	 */
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		DiagramRootEditPart root = (DiagramRootEditPart) getDiagramGraphicalViewer().getRootEditPart();
		LayeredPane printableLayers = (LayeredPane) root.getLayer(LayerConstants.PRINTABLE_LAYERS);
		FreeformLayer extLabelsLayer = new FreeformLayer();
		extLabelsLayer.setLayoutManager(new DelegatingLayout());
		printableLayers.addLayerAfter(extLabelsLayer, EcoreEditPartFactory.EXTERNAL_NODE_LABELS_LAYER, LayerConstants.PRIMARY_LAYER);
	}
}
