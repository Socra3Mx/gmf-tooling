/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitri Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.codegen.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;

/**
 * Utility methods for templates.
 * 
 * @author dstadnik
 */
public class AccessUtil {

	private AccessUtil() {}

	private static String asJavaConstantName(String s) {
		s = s.toUpperCase();
		StringBuffer b = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i == 0) {
				if (!Character.isJavaIdentifierStart(c)) {
					c = '_';
				}
			} else {
				if (!Character.isJavaIdentifierPart(c)) {
					c = '_';
				}
			}
			b.append(c);
		}
		return b.toString();
	}

	// naming patterns

	public static String getCompartmentId(GenCompartment compartment) {
		return asJavaConstantName(compartment.getTitle());
	}

	public static String getPaletteEntryId(EntryBase entry) {
		return asJavaConstantName(entry.getTitleKey());
	}

	public static String getLabelId(GenLabel label) {
		return label.getMetaFeature().getUpperName() + "_LABEL"; //$NON-NLS-1$
	}

	public static String getLabelTextId(GenLabel label) {
		return label.getMetaFeature().getUpperName() + "_TEXT"; //$NON-NLS-1$
	}

	public static String getSemanticHintsClassName(GenCommonBase genElement) {
		return genElement.getClassNamePrefix() + genElement.getClassNameSuffux() + "SemanticHints"; //$NON-NLS-1$
	}

	// model access
	
	public static List getAllChildNodes(GenNode node) {
		List result = new LinkedList();
		result.addAll(node.getChildNodes());
		for (Iterator it = node.getCompartments().iterator(); it.hasNext();) {
			GenCompartment nextCompartment = (GenCompartment) it.next();
			result.addAll(nextCompartment.getChildNodes());
		}
		return result;
	}
	
	public static Collection getAllContainers(GenDiagram diagram) {
		Collection result = new LinkedList();
		for (Iterator nodes = diagram.getNodes().iterator(); nodes.hasNext();) {
			GenNode nextNode = (GenNode) nodes.next();
			fillContainers(result, nextNode);
		}
		return result;
	}
	
	private static void fillContainers(Collection result, GenChildContainer container) {
		result.add(container);
		for (Iterator childNodes = container.getChildNodes().iterator(); childNodes.hasNext();) {
			GenChildNode childNode = (GenChildNode) childNodes.next();
			fillContainers(result, childNode);
		}
		if (container instanceof GenNode) {
			GenNode genNode = (GenNode) container;
			for (Iterator compartments = genNode.getCompartments().iterator(); compartments.hasNext();) {
				GenCompartment compartment = (GenCompartment) compartments.next();
				fillContainers(result, compartment);
			}
		}
	}
}
