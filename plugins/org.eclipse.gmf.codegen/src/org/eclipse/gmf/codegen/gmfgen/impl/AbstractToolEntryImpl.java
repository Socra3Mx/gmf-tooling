/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmf.codegen.gmfgen.AbstractToolEntry;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Tool Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.AbstractToolEntryImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.AbstractToolEntryImpl#getQualifiedToolName <em>Qualified Tool Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.impl.AbstractToolEntryImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractToolEntryImpl extends EntryBaseImpl implements AbstractToolEntry {
	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedToolName() <em>Qualified Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedToolName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_TOOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedToolName() <em>Qualified Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedToolName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedToolName = QUALIFIED_TOOL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap properties = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractToolEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getAbstractToolEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ABSTRACT_TOOL_ENTRY__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedToolName() {
		return qualifiedToolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedToolName(String newQualifiedToolName) {
		String oldQualifiedToolName = qualifiedToolName;
		qualifiedToolName = newQualifiedToolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenPackage.ABSTRACT_TOOL_ENTRY__QUALIFIED_TOOL_NAME, oldQualifiedToolName, qualifiedToolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getProperties() {
		if (properties == null) {
			properties = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GMFGenPackage.ABSTRACT_TOOL_ENTRY__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__PROPERTIES:
				return ((InternalEList)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__DEFAULT:
				return isDefault() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__QUALIFIED_TOOL_NAME:
				return getQualifiedToolName();
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__DEFAULT:
				setDefault(((Boolean)newValue).booleanValue());
				return;
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__QUALIFIED_TOOL_NAME:
				setQualifiedToolName((String)newValue);
				return;
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__QUALIFIED_TOOL_NAME:
				setQualifiedToolName(QUALIFIED_TOOL_NAME_EDEFAULT);
				return;
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__PROPERTIES:
				getProperties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__QUALIFIED_TOOL_NAME:
				return QUALIFIED_TOOL_NAME_EDEFAULT == null ? qualifiedToolName != null : !QUALIFIED_TOOL_NAME_EDEFAULT.equals(qualifiedToolName);
			case GMFGenPackage.ABSTRACT_TOOL_ENTRY__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (default: ");
		result.append(default_);
		result.append(", qualifiedToolName: ");
		result.append(qualifiedToolName);
		result.append(')');
		return result.toString();
	}

} //AbstractToolEntryImpl