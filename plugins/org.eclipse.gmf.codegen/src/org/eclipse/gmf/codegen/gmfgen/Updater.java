/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Updater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.Updater#getDiagramUpdaterClassName <em>Diagram Updater Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getUpdater()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Updater extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagram Updater Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Updater Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Updater Class Name</em>' attribute.
	 * @see #setDiagramUpdaterClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getUpdater_DiagramUpdaterClassName()
	 * @model
	 * @generated
	 */
	String getDiagramUpdaterClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.Updater#getDiagramUpdaterClassName <em>Diagram Updater Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Updater Class Name</em>' attribute.
	 * @see #getDiagramUpdaterClassName()
	 * @generated
	 */
	void setDiagramUpdaterClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDiagramUpdaterQualifiedClassName();

} // Updater
