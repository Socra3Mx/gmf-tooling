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
package org.eclipse.gmf.tooling.simplemap.simplemappings;

import org.eclipse.gmf.mappings.NodeMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Child Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleChildReference#getReferencedChild <em>Referenced Child</em>}</li>
 *   <li>{@link org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleChildReference#getReferencedSimpleNode <em>Referenced Simple Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.tooling.simplemap.simplemappings.SimplemappingsPackage#getSimpleChildReference()
 * @model
 * @generated
 */
public interface SimpleChildReference extends SimpleNodeReference, SimpleChildNode {

	/**
	 * Returns the value of the '<em><b>Referenced Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Child</em>' reference.
	 * @see #setReferencedChild(NodeMapping)
	 * @see org.eclipse.gmf.tooling.simplemap.simplemappings.SimplemappingsPackage#getSimpleChildReference_ReferencedChild()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	NodeMapping getReferencedChild();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleChildReference#getReferencedChild <em>Referenced Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Child</em>' reference.
	 * @see #getReferencedChild()
	 * @generated
	 */
	void setReferencedChild(NodeMapping value);

	/**
	 * Returns the value of the '<em><b>Referenced Simple Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Simple Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Simple Node</em>' reference.
	 * @see #setReferencedSimpleNode(SimpleNode)
	 * @see org.eclipse.gmf.tooling.simplemap.simplemappings.SimplemappingsPackage#getSimpleChildReference_ReferencedSimpleNode()
	 * @model
	 * @generated
	 */
	SimpleNode getReferencedSimpleNode();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.tooling.simplemap.simplemappings.SimpleChildReference#getReferencedSimpleNode <em>Referenced Simple Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Simple Node</em>' reference.
	 * @see #getReferencedSimpleNode()
	 * @generated
	 */
	void setReferencedSimpleNode(SimpleNode value);

} // SimpleChildReference
