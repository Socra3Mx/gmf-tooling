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
package org.eclipse.gmf.internal.codegen.popup.actions;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.util.Generator;
import org.eclipse.gmf.internal.codegen.CodeGenUIPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Runs generation of diagram editor project
 * 
 * @author artem
 */
public class ExecuteTemplatesAction implements IObjectActionDelegate, IRunnableWithProgress {

	private static final String ASK_INFO = "ask_info";
	private static final String ASK_OK = "ask_ok";

	private IFile mySelection;

	private IWorkbenchPart myPart;

	private IStatus myRunStatus;
	private GenEditorGenerator myGenModel;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		myPart = targetPart;
	}

	// TODO Jobs
	public void run(IAction action) {
		try {
			loadGenModel();
			assert getGenModel() != null;
			IStatus isGenModelValid = validateGenModel();
			if (!isGenModelValid.isOK()) {
				if (!MessageDialog.openConfirm(getShell(), action.getText(), formatMessage("generatecode.badsrc", isGenModelValid))) {
					return;
				}
			}
			
			myRunStatus = Status.CANCEL_STATUS;
			new ProgressMonitorDialog(getShell()).run(true, true, this);

			if (getRunStatus().isOK()) {
				if (!MessageDialogWithToggle.ALWAYS.equals(getPreferences().getString(ASK_OK))) {
					MessageDialogWithToggle.openInformation(getShell(), action.getText(), CodeGenUIPlugin.getBundleString("generatecode.ok"), CodeGenUIPlugin.getBundleString("generatecode.neveragain"), false, getPreferences(), ASK_OK);
				}
			} else if (myRunStatus.matches(IStatus.ERROR)) {
				CodeGenUIPlugin.getDefault().getLog().log(getRunStatus());
				MessageDialog.openError(getShell(), action.getText(), formatMessage("generatecode.err", getRunStatus()));
			} else if (myRunStatus.matches(IStatus.WARNING)) {
				MessageDialog.openWarning(getShell(), action.getText(), formatMessage("generatecode.warn", getRunStatus()));
			} else if (myRunStatus.matches(IStatus.INFO)) {
				if (!MessageDialogWithToggle.ALWAYS.equals(getPreferences().getString(ASK_INFO))) {
					MessageDialogWithToggle.openInformation(getShell(), action.getText(), formatMessage("generatecode.info", getRunStatus()), CodeGenUIPlugin.getBundleString("generatecode.neveragain"), false, getPreferences(), ASK_INFO);
				}
			}
		} catch (InvocationTargetException ex) {
		} catch (InterruptedException ex) {
		} finally {
			unloadGenModel();
		}
	}

	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		Generator g = new Generator(getGenModel());
		g.run(monitor);
		myRunStatus = g.getRunStatus();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		mySelection = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false) {
			return;
		}
		mySelection = (IFile) ((IStructuredSelection) selection).getFirstElement();
		action.setEnabled(true);
	}

	private static String formatMessage(String bundleStringKey, IStatus status) {
		return CodeGenUIPlugin.formatMessage(bundleStringKey, status);
	}

	private IStatus getRunStatus() {
		return myRunStatus;
	}

	private GenEditorGenerator getGenModel() {
		return myGenModel;
	}

	private void loadGenModel() {
		URI selected = URI.createPlatformResourceURI(mySelection.getFullPath().toString());
		ResourceSet srcResSet = new ResourceSetImpl();
		srcResSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		Resource srcRes = srcResSet.getResource(selected, true);
		Object root = srcRes.getContents().get(0);
		if (root instanceof GenDiagram) {
			myGenModel = ((GenDiagram) root).getEditorGen();
		} else if (root instanceof GenEditorGenerator) {
			myGenModel = (GenEditorGenerator) root;
		}
		if (myGenModel != null && myGenModel.getDomainGenModel() != null) {
			myGenModel.getDomainGenModel().reconcile();
		}
	}

	private void unloadGenModel() {
		if (myGenModel != null && myGenModel.eResource() != null) {
			myGenModel.eResource().unload();
		}
		myGenModel = null;
	}

	private IStatus validateGenModel() {
		return BasicDiagnostic.toIStatus(Diagnostician.INSTANCE.validate(getGenModel()));
	}

	private Shell getShell() {
		return myPart.getSite().getShell();
	}

	private static IPreferenceStore getPreferences() {
		return CodeGenUIPlugin.getDefault().getPreferenceStore();
	}
}
