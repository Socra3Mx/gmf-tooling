/**
 * Copyright (c) 2010-2012 ISBAN S.L
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 * 		Ruben De Dios (ISBAN S.L)
 * 		Andrez Alvarez Mattos (ISBAN S.L)
 */
package org.eclipse.gmf.tooling.simplemap.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.simplemap.diagram.edit.parts.SimpleChildReferenceEditPart;
import org.eclipse.gmf.tooling.simplemap.diagram.edit.parts.SimpleCompartmentEditPart;
import org.eclipse.gmf.tooling.simplemap.diagram.edit.parts.SimpleLabelNodeEditPart;
import org.eclipse.gmf.tooling.simplemap.diagram.edit.parts.SimpleLinkMappingEditPart;
import org.eclipse.gmf.tooling.simplemap.diagram.edit.parts.SimpleMappingEditPart;
import org.eclipse.gmf.tooling.simplemap.diagram.edit.parts.SimpleSubNodeEditPart;
import org.eclipse.gmf.tooling.simplemap.diagram.edit.parts.SimpleTopNodeEditPart;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleChildNode;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleCompartment;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleMapping;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleSubNode;
import org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleTopNode;

/**
 * @generated
 */
public class SimplemapDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSemanticChildren(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleMappingEditPart.VISUAL_ID:
			return getSimpleMapping_79SemanticChildren(view);
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_1001SemanticChildren(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_2002SemanticChildren(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleMapping_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleMapping modelElement = (SimpleMapping) view.getElement();
		LinkedList<SimplemapNodeDescriptor> result = new LinkedList<SimplemapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			SimpleChildNode childElement = (SimpleChildNode) it.next();
			int visualID = SimplemapVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SimpleTopNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleLinkMappingEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleTopNode_1001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleTopNode modelElement = (SimpleTopNode) view.getElement();
		LinkedList<SimplemapNodeDescriptor> result = new LinkedList<SimplemapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			SimpleChildNode childElement = (SimpleChildNode) it.next();
			int visualID = SimplemapVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SimpleLabelNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleCompartmentEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleChildReferenceEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleSubNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleCompartment_2002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleCompartment modelElement = (SimpleCompartment) view.getElement();
		LinkedList<SimplemapNodeDescriptor> result = new LinkedList<SimplemapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			SimpleChildNode childElement = (SimpleChildNode) it.next();
			int visualID = SimplemapVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SimpleLabelNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleSubNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleChildReferenceEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleSubNode_2003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleSubNode modelElement = (SimpleSubNode) view.getElement();
		LinkedList<SimplemapNodeDescriptor> result = new LinkedList<SimplemapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it.hasNext();) {
			SimpleChildNode childElement = (SimpleChildNode) it.next();
			int visualID = SimplemapVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SimpleLabelNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleCompartmentEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleChildReferenceEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleSubNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getContainedLinks(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleMappingEditPart.VISUAL_ID:
			return getSimpleMapping_79ContainedLinks(view);
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_1001ContainedLinks(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_1002ContainedLinks(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_2001ContainedLinks(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_2002ContainedLinks(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2003ContainedLinks(view);
		case SimpleChildReferenceEditPart.VISUAL_ID:
			return getSimpleChildReference_2004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getIncomingLinks(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_1001IncomingLinks(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_1002IncomingLinks(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_2001IncomingLinks(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_2002IncomingLinks(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2003IncomingLinks(view);
		case SimpleChildReferenceEditPart.VISUAL_ID:
			return getSimpleChildReference_2004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getOutgoingLinks(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_1001OutgoingLinks(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_1002OutgoingLinks(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_2001OutgoingLinks(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_2002OutgoingLinks(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2003OutgoingLinks(view);
		case SimpleChildReferenceEditPart.VISUAL_ID:
			return getSimpleChildReference_2004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleMapping_79ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleTopNode_1001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLinkMapping_1002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNode_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleChildReference_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleTopNode_1001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLinkMapping_1002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNode_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleChildReference_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleTopNode_1001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLinkMapping_1002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNode_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleChildReference_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

}
