/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.ColorStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ColorStyleImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.ColorStyleImpl#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorStyleImpl extends EObjectImpl implements ColorStyle {
	/**
	 * The default value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected String foregroundColor = FOREGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getColorStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForegroundColor() {
		return foregroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroundColor(String newForegroundColor) {
		String oldForegroundColor = foregroundColor;
		foregroundColor = newForegroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.COLOR_STYLE__FOREGROUND_COLOR, oldForegroundColor, foregroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.COLOR_STYLE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGraphPackage.COLOR_STYLE__FOREGROUND_COLOR:
				return getForegroundColor();
			case GMFGraphPackage.COLOR_STYLE__BACKGROUND_COLOR:
				return getBackgroundColor();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGraphPackage.COLOR_STYLE__FOREGROUND_COLOR:
				setForegroundColor((String)newValue);
				return;
			case GMFGraphPackage.COLOR_STYLE__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGraphPackage.COLOR_STYLE__FOREGROUND_COLOR:
				setForegroundColor(FOREGROUND_COLOR_EDEFAULT);
				return;
			case GMFGraphPackage.COLOR_STYLE__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGraphPackage.COLOR_STYLE__FOREGROUND_COLOR:
				return FOREGROUND_COLOR_EDEFAULT == null ? foregroundColor != null : !FOREGROUND_COLOR_EDEFAULT.equals(foregroundColor);
			case GMFGraphPackage.COLOR_STYLE__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (foregroundColor: ");
		result.append(foregroundColor);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(')');
		return result.toString();
	}

} //ColorStyleImpl
