/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Node Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Label within node
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.GenNodeLabel#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNodeLabel()
 * @model annotation="http://www.eclipse.org/gmf/2005/constraints ocl='modelFacet.metaFeature.ecoreFeature.eContainingClass.isSuperTypeOf(node.getDomainMetaClass().ecoreClass)'"
 * @generated
 */
public interface GenNodeLabel extends GenLabel{
	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.codegen.gmfgen.GenNode#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(GenNode)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getGenNodeLabel_Node()
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode#getLabels
	 * @model opposite="labels" required="true"
	 * @generated
	 */
	GenNode getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.GenNodeLabel#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(GenNode value);

} // GenNodeLabel
