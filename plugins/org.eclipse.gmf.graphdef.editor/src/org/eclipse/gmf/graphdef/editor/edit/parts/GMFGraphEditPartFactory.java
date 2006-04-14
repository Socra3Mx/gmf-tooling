package org.eclipse.gmf.graphdef.editor.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.gmf.graphdef.editor.part.GMFGraphVisualIDRegistry;

/**
 * @generated
 */
public class GMFGraphEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public static final String EXTERNAL_NODE_LABELS_LAYER = "External Node Labels";

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			if (!CanvasEditPart.MODEL_ID.equals(GMFGraphVisualIDRegistry.getModelID(view))) {
				return null;
			}

			int viewVisualID = GMFGraphVisualIDRegistry.getVisualID(view);
			switch (viewVisualID) {
			case 1001:
				return new CompartmentEditPart(view);
			case 4001:
				return new Compartment_nameEditPart(view);
			case 1002:
				return new NodeEditPart(view);
			case 4002:
				return new Node_nameEditPart(view);
			case 1003:
				return new ConnectionEditPart(view);
			case 4003:
				return new Connection_nameEditPart(view);
			case 1004:
				return new FigureGalleryEditPart(view);
			case 4004:
				return new FigureGallery_nameEditPart(view);
			case 2001:
				return new RectangleEditPart(view);
			case 2002:
				return new Rectangle2EditPart(view);
			case 2003:
				return new EllipseEditPart(view);
			case 2004:
				return new RoundedRectangleEditPart(view);
			case 2005:
				return new PolylineEditPart(view);
			case 2006:
				return new Ellipse2EditPart(view);
			case 2007:
				return new RoundedRectangle2EditPart(view);
			case 2008:
				return new Polyline2EditPart(view);
			case 5001:
				return new Compartment_VisualFacetsEditPart(view);
			case 5002:
				return new Node_VisualFacetsEditPart(view);
			case 5003:
				return new Connection_VisualFacetsEditPart(view);
			case 5004:
				return new FigureGallery_FiguresEditPart(view);
			case 79:
				return new CanvasEditPart(view);
			case 3001:
				return new FigureEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
		else {
			IFigure figure = source.getFigure();
			return new LabelCellEditorLocator((Label) figure);
		}
	}

	static private class TextCellEditorLocator implements CellEditorLocator {

		private WrapLabel wrapLabel;

		public TextCellEditorLocator(WrapLabel wrapLabel) {
			super();
			this.wrapLabel = wrapLabel;
		}

		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);

			if (getWrapLabel().isTextWrapped() && getWrapLabel().getText().length() > 0)
				rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
			else {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			}

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
		}

	}

	private static class LabelCellEditorLocator implements CellEditorLocator {

		private Label label;

		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		public Label getLabel() {
			return label;
		}

		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);

			int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
		}
	}
}
