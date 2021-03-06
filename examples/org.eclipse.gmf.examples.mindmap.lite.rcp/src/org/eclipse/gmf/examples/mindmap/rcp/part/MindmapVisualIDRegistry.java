/*
 * Copyright (c) 2006, 2007 Borland Software Corporation.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *      Richard Gronback (Borland) - initial API and implementation
 */
package org.eclipse.gmf.examples.mindmap.rcp.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.examples.mindmap.Map;
import org.eclipse.gmf.examples.mindmap.MindmapPackage;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.MapEditPart;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.Relationship2EditPart;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.Relationship3EditPart;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.RelationshipEditPart;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.ResourceEditPart;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.ThreadEditPart;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.ThreadItemEditPart;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.ThreadThreadItemCompartmentEditPart;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.TopicEditPart;
import org.eclipse.gmf.examples.mindmap.rcp.edit.parts.TopicThreadCompartmentEditPart;
import org.eclipse.gmf.examples.mindmap.rcp.expressions.MindmapAbstractExpression;
import org.eclipse.gmf.examples.mindmap.rcp.expressions.MindmapOCLFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MindmapVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = MindmapDiagramEditorPlugin
			.getInstance().getBundle().getSymbolicName()
			+ "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static final MindmapAbstractExpression Relationship_4002_Constraint = MindmapOCLFactory
			.getExpression("self.type = RelationshipType::EXTENDS",
					MindmapPackage.eINSTANCE.getRelationship());

	/**
	 * @generated
	 */
	private static final MindmapAbstractExpression Relationship_4003_Constraint = MindmapOCLFactory
			.getExpression("self.type = RelationshipType::INCLUDES",
					MindmapPackage.eINSTANCE.getRelationship());

	/**
	 * @generated
	 */
	private static final MindmapAbstractExpression Relationship_4004_Constraint = MindmapOCLFactory
			.getExpression("self.type = RelationshipType::DEPENDENCY",
					MindmapPackage.eINSTANCE.getRelationship());

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MapEditPart.MODEL_ID.equals(view.getType())) {
				return MapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.gmf.examples.mindmap.rcp.part.MindmapVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MindmapDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MindmapPackage.eINSTANCE.getMap().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Map) domainElement)) {
			return MapEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.eclipse.gmf.examples.mindmap.rcp.part.MindmapVisualIDRegistry
				.getModelID(containerView);
		if (!MapEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MapEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.gmf.examples.mindmap.rcp.part.MindmapVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TopicThreadCompartmentEditPart.VISUAL_ID:
			if (MindmapPackage.eINSTANCE.getThread().isSuperTypeOf(
					domainElement.eClass())) {
				return ThreadEditPart.VISUAL_ID;
			}
			break;
		case ThreadThreadItemCompartmentEditPart.VISUAL_ID:
			if (MindmapPackage.eINSTANCE.getThreadItem().isSuperTypeOf(
					domainElement.eClass())) {
				return ThreadItemEditPart.VISUAL_ID;
			}
			break;
		case MapEditPart.VISUAL_ID:
			if (MindmapPackage.eINSTANCE.getTopic().isSuperTypeOf(
					domainElement.eClass())) {
				return TopicEditPart.VISUAL_ID;
			}
			if (MindmapPackage.eINSTANCE.getResource().isSuperTypeOf(
					domainElement.eClass())) {
				return ResourceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MindmapPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())
				&& evaluate(Relationship_4002_Constraint, domainElement)) {
			return RelationshipEditPart.VISUAL_ID;
		}
		if (MindmapPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())
				&& evaluate(Relationship_4003_Constraint, domainElement)) {
			return Relationship2EditPart.VISUAL_ID;
		}
		if (MindmapPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())
				&& evaluate(Relationship_4004_Constraint, domainElement)) {
			return Relationship3EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Map element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean evaluate(MindmapAbstractExpression expression,
			Object element) {
		Object result = expression.evaluate(element);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
