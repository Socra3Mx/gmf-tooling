/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.ModelElementSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ModelElementSelectorImpl extends ValueExpressionImpl implements ModelElementSelector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getModelElementSelector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String[] getRequiredPluginIDs() {
		// For now hardcode only the default support for OCL
		// TODO - to be refactored to plugg-in other languages
		if("ocl".equals(getLanguage())) { //$NON-NLS-1$
			return new String[] { "org.eclipse.emf.query.ocl" }; //$NON-NLS-1$
		}
		return new String[0];		
	}

} //ModelElementSelectorImpl
