/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.SizeStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.SizeStyleImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.SizeStyleImpl#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.SizeStyleImpl#getPrefSize <em>Pref Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SizeStyleImpl extends EObjectImpl implements SizeStyle {
	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected Point maxSize = null;

	/**
	 * The cached value of the '{@link #getMinSize() <em>Min Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected Point minSize = null;

	/**
	 * The cached value of the '{@link #getPrefSize() <em>Pref Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefSize()
	 * @generated
	 * @ordered
	 */
	protected Point prefSize = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getSizeStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxSize(Point newMaxSize, NotificationChain msgs) {
		Point oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SIZE_STYLE__MAX_SIZE, oldMaxSize, newMaxSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSize(Point newMaxSize) {
		if (newMaxSize != maxSize) {
			NotificationChain msgs = null;
			if (maxSize != null)
				msgs = ((InternalEObject)maxSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SIZE_STYLE__MAX_SIZE, null, msgs);
			if (newMaxSize != null)
				msgs = ((InternalEObject)newMaxSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SIZE_STYLE__MAX_SIZE, null, msgs);
			msgs = basicSetMaxSize(newMaxSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SIZE_STYLE__MAX_SIZE, newMaxSize, newMaxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getMinSize() {
		return minSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinSize(Point newMinSize, NotificationChain msgs) {
		Point oldMinSize = minSize;
		minSize = newMinSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SIZE_STYLE__MIN_SIZE, oldMinSize, newMinSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSize(Point newMinSize) {
		if (newMinSize != minSize) {
			NotificationChain msgs = null;
			if (minSize != null)
				msgs = ((InternalEObject)minSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SIZE_STYLE__MIN_SIZE, null, msgs);
			if (newMinSize != null)
				msgs = ((InternalEObject)newMinSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SIZE_STYLE__MIN_SIZE, null, msgs);
			msgs = basicSetMinSize(newMinSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SIZE_STYLE__MIN_SIZE, newMinSize, newMinSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPrefSize() {
		return prefSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefSize(Point newPrefSize, NotificationChain msgs) {
		Point oldPrefSize = prefSize;
		prefSize = newPrefSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SIZE_STYLE__PREF_SIZE, oldPrefSize, newPrefSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefSize(Point newPrefSize) {
		if (newPrefSize != prefSize) {
			NotificationChain msgs = null;
			if (prefSize != null)
				msgs = ((InternalEObject)prefSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SIZE_STYLE__PREF_SIZE, null, msgs);
			if (newPrefSize != null)
				msgs = ((InternalEObject)newPrefSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFGraphPackage.SIZE_STYLE__PREF_SIZE, null, msgs);
			msgs = basicSetPrefSize(newPrefSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SIZE_STYLE__PREF_SIZE, newPrefSize, newPrefSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGraphPackage.SIZE_STYLE__MAX_SIZE:
					return basicSetMaxSize(null, msgs);
				case GMFGraphPackage.SIZE_STYLE__MIN_SIZE:
					return basicSetMinSize(null, msgs);
				case GMFGraphPackage.SIZE_STYLE__PREF_SIZE:
					return basicSetPrefSize(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGraphPackage.SIZE_STYLE__MAX_SIZE:
				return getMaxSize();
			case GMFGraphPackage.SIZE_STYLE__MIN_SIZE:
				return getMinSize();
			case GMFGraphPackage.SIZE_STYLE__PREF_SIZE:
				return getPrefSize();
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
			case GMFGraphPackage.SIZE_STYLE__MAX_SIZE:
				setMaxSize((Point)newValue);
				return;
			case GMFGraphPackage.SIZE_STYLE__MIN_SIZE:
				setMinSize((Point)newValue);
				return;
			case GMFGraphPackage.SIZE_STYLE__PREF_SIZE:
				setPrefSize((Point)newValue);
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
			case GMFGraphPackage.SIZE_STYLE__MAX_SIZE:
				setMaxSize((Point)null);
				return;
			case GMFGraphPackage.SIZE_STYLE__MIN_SIZE:
				setMinSize((Point)null);
				return;
			case GMFGraphPackage.SIZE_STYLE__PREF_SIZE:
				setPrefSize((Point)null);
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
			case GMFGraphPackage.SIZE_STYLE__MAX_SIZE:
				return maxSize != null;
			case GMFGraphPackage.SIZE_STYLE__MIN_SIZE:
				return minSize != null;
			case GMFGraphPackage.SIZE_STYLE__PREF_SIZE:
				return prefSize != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //SizeStyleImpl
