/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.wizards.pages;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;

/**
 * @author artem
 */
public class RootElementPage extends WizardPage implements Listener {

	private final WizardInput holder;
	private List elementsList;

	public RootElementPage(WizardInput input) {
		super("rootElementPage");
		holder = input;
		setPageComplete(false);
	}

	public void createControl(Composite parent) {
		Composite p = new Composite(parent, SWT.NONE);
		p.setLayout(new GridLayout(2, true));
		createGroup1(p);
		setControl(p);
		// add list of all containments
		// add palette/other visual info
	}

	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			populateElementsList();
		}
	}

	private void populateElementsList() {
		Collection el = holder.getCanvasElementCandidates();
		String[] items = new String[el.size()];
		int i = 0;
		for (Iterator it = el.iterator(); it.hasNext(); i++) {
			EClass next = (EClass) it.next();
			items[i] = next.getName();
		}
		elementsList.setItems(items);
	}

	private Group createGroup1(Composite p) {
		Group group1 = new Group(p, SWT.NONE);
		group1.setLayout(new FillLayout());
		group1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		group1.setText("Diagram Root Element");
		elementsList = new List(group1, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL);
		elementsList.addListener(SWT.Selection, this);
		return group1;
	}

	public void handleEvent(Event event) {
		if (-1 != elementsList.getSelectionIndex()) {
			holder.selectCanvasElement((EClass) holder.getCanvasElementCandidates().get(elementsList.getSelectionIndex()));
			holder.feedDefaultMapping();
			setPageComplete(true);
		}
	}
}
