/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.codegen.util;

import java.lang.reflect.Method;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.gmf.codegen.templates.diacanvas.CanvasEditPartGen;
import org.eclipse.gmf.codegen.templates.diacanvas.InitDiagramFileActionGen;
import org.eclipse.gmf.codegen.templates.diacanvas.LinkEditPartGen;
import org.eclipse.gmf.codegen.templates.edit.SemanticHintsGenerator;
import org.eclipse.gmf.codegen.templates.edit.StructuralFeatureParserGenerator;
import org.eclipse.gmf.codegen.templates.edit.ViewFactoryGenerator;
import org.eclipse.gmf.codegen.templates.editor.CreationWizardGenerator;
import org.eclipse.gmf.codegen.templates.editor.CreationWizardPageGenerator;
import org.eclipse.gmf.codegen.templates.editor.DiagramEditorUtilGenerator;
import org.eclipse.gmf.codegen.templates.editor.DiagramFileCreatorGenerator;
import org.eclipse.gmf.codegen.templates.editor.EditorGenerator;
import org.eclipse.gmf.codegen.templates.editor.EditorMatchingStrategyGenerator;
import org.eclipse.gmf.codegen.templates.editor.PaletteFactoryGenerator;
import org.eclipse.gmf.codegen.templates.editor.PluginGenerator;
import org.eclipse.gmf.codegen.templates.editor.PluginXML;
import org.eclipse.gmf.codegen.templates.editor.PreferencesInitializerGenerator;
import org.eclipse.gmf.codegen.templates.parts.EditPartFactoryGenerator;
import org.eclipse.gmf.codegen.templates.parts.NodeEditPartGenerator;
import org.eclipse.gmf.codegen.templates.providers.EditPartProviderGenerator;
import org.eclipse.gmf.codegen.templates.providers.ElementTypesGenerator;
import org.eclipse.gmf.codegen.templates.providers.ViewProviderGenerator;
import org.osgi.framework.Bundle;

/**
 * Provides JET templates.
 * 
 * @author artem
 */
public class EmitterFactory {

	private static final String TEMPLATES_PLUGIN_ID = "org.eclipse.gmf.codegen";

	private static Bundle getTemplatesBundle() {
		return Platform.getBundle(TEMPLATES_PLUGIN_ID);
	}

	public static URL getJMergeControlFile() {
		return getTemplatesBundle().getEntry("/templates/emf-merge.xml");
	}

	private static boolean usePrecompiledTemplates() {
		return true;
	}

	// parts

	public static JETEmitter getNodeEditPartEmitter() throws JETException {
		return initializeEmitter("/templates/parts/NodeEditPart.javajet", NodeEditPartGenerator.class);
	}

	public static JETEmitter getLinkEditPartEmitter() throws JETException {
		return initializeEmitter("/templates/parts/LinkEditPart.javajet", LinkEditPartGen.class);
	}

	public static JETEmitter getCanvasEditPartEmitter() throws JETException {
		return initializeEmitter("/templates/parts/CanvasEditPart.javajet", CanvasEditPartGen.class);
	}

	public static JETEmitter getEditPartFactoryEmitter() throws JETException {
		return initializeEmitter("/templates/parts/EditPartFactory.javajet", EditPartFactoryGenerator.class);
	}

	// edit

	public static JETEmitter getStructuralFeatureParserEmitter() throws JETException {
		return initializeEmitter("/templates/edit/StructuralFeatureParser.javajet", StructuralFeatureParserGenerator.class);
	}

	public static JETEmitter getSemanticHintsEmitter() throws JETException {
		return initializeEmitter("/templates/edit/SemanticHints.javajet", SemanticHintsGenerator.class);
	}

	public static JETEmitter getViewFactoryEmitter() throws JETException {
		return initializeEmitter("/templates/edit/ViewFactory.javajet", ViewFactoryGenerator.class);
	}

	/*
	public static JETEmitter getNodeMetaInfoProviderEmitter() throws JETException {
		return initializeEmitter("/templates/edit/NodeMetaInfoProvider.javajet", NodeMetaInfoProviderGenerator.class);
	}

	public static JETEmitter getLinkMetaInfoProviderEmitter() throws JETException {
		return initializeEmitter("/templates/edit/LinkMetaInfoProvider.javajet", LinkMetaInfoProviderGenerator.class);
	}

	public static JETEmitter getCanvasMetaInfoProviderEmitter() throws JETException {
		return initializeEmitter("/templates/edit/CanvasMetaInfoProvider.javajet", CanvasMetaInfoProviderGenerator.class);
	}

	public static JETEmitter getMetaInfoProviderAF1Emitter() throws JETException {
		return initializeEmitter("/templates/edit/MetaInfoProviderAdapterFactory1.javajet", MetaInfoProviderAdapterFactory1Generator.class);
	}

	public static JETEmitter getMetaInfoProviderAF2Emitter() throws JETException {
		return initializeEmitter("/templates/edit/MetaInfoProviderAdapterFactory2.javajet", MetaInfoProviderAdapterFactory2Generator.class);
	}
	*/

	// providers

	public static JETEmitter getElementTypesEmitter() throws JETException {
		return initializeEmitter("/templates/providers/ElementTypes.javajet", ElementTypesGenerator.class);
	}

	public static JETEmitter getViewProviderEmitter() throws JETException {
		return initializeEmitter("/templates/providers/ViewProvider.javajet", ViewProviderGenerator.class);
	}

	public static JETEmitter getEditPartProviderEmitter() throws JETException {
		return initializeEmitter("/templates/providers/EditPartProvider.javajet", EditPartProviderGenerator.class);
	}

	// editor
	
	public static JETEmitter getInitDiagramFileActionEmitter() throws JETException {
		return initializeEmitter("/templates/editor/InitDiagramFileAction.javajet", InitDiagramFileActionGen.class);
	}

	public static JETEmitter getPaletteEmitter() throws JETException {
		return initializeEmitter("/templates/editor/Palette.javajet", PaletteFactoryGenerator.class);
	}

	public static JETEmitter getDiagramEditorUtilEmitter() throws JETException {
		return initializeEmitter("/templates/editor/DiagramEditorUtil.javajet", DiagramEditorUtilGenerator.class);
	}

	public static JETEmitter getDiagramFileCreatorEmitter() throws JETException {
		return initializeEmitter("/templates/editor/DiagramFileCreator.javajet", DiagramFileCreatorGenerator.class);
	}

	public static JETEmitter getCreationWizardEmitter() throws JETException {
		return initializeEmitter("/templates/editor/CreationWizard.javajet", CreationWizardGenerator.class);
	}

	public static JETEmitter getCreationWizardPageEmitter() throws JETException {
		return initializeEmitter("/templates/editor/CreationWizardPage.javajet", CreationWizardPageGenerator.class);
	}

	public static JETEmitter getEditorEmitter() throws JETException {
		return initializeEmitter("/templates/editor/Editor.javajet", EditorGenerator.class);
	}

	public static JETEmitter getEditorMatchingStrategyEmitter() throws JETException {
		return initializeEmitter("/templates/editor/EditorMatchingStrategy.javajet", EditorMatchingStrategyGenerator.class);
	}

	public static JETEmitter getPreferencesInitializerEmitter() throws JETException {
		return initializeEmitter("/templates/editor/PreferencesInitializer.javajet", PreferencesInitializerGenerator.class);
	}

	public static JETEmitter getPluginClassEmitter() throws JETException {
		return initializeEmitter("/templates/editor/Plugin.javajet", PluginGenerator.class);
	}

	public static JETEmitter getPluginXmlEmitter() throws JETException {
		return initializeEmitter("/templates/editor/plugin.xmljet", PluginXML.class);
	}

	private static JETEmitter initializeEmitter(String relativeTemplatePath, Class precompiledTemplate) throws JETException {
		String path = relativeTemplatePath;
		URL url = getTemplatesBundle().getEntry(relativeTemplatePath);
		if (url != null) {
			path = url.toString();
		} else {
			if (!usePrecompiledTemplates()) {
				throw new JETException("Template " + relativeTemplatePath + " unavailable.");
			}
		}
		JETEmitter emitter = new JETEmitter(path, EmitterFactory.class.getClassLoader());
		try {
	        emitter.addVariable("EMF_CODEGEN", "org.eclipse.emf.codegen");
			emitter.addVariable("EMF_CODEGEN_ECORE", "org.eclipse.emf.codegen.ecore");
			emitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
			emitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");
			emitter.addVariable("DGMM", "org.eclipse.gmf.codegen");

			if (usePrecompiledTemplates()) {
				Method m = precompiledTemplate.getMethod("generate", new Class[] {Object.class});
				emitter.setMethod(m);
			}
		} catch (NoSuchMethodException ex) {
			ex.printStackTrace();
			// FALL-THROUGH. Ignore, rely on template file use
		}
		return emitter;
	}
}
