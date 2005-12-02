/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gmf.mappings.AbstractNodeMapping;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.GMFMapPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.mappings.AbstractNodeMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractNodeMappingItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNodeMappingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDiagramNodePropertyDescriptor(object);
			addDomainMetaElementPropertyDescriptor(object);
			addContainmentFeaturePropertyDescriptor(object);
			addEditFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Diagram Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNodeMapping_diagramNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNodeMapping_diagramNode_feature", "_UI_AbstractNodeMapping_type"),
				 GMFMapPackage.eINSTANCE.getAbstractNodeMapping_DiagramNode(),
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Meta Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainMetaElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNodeMapping_domainMetaElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNodeMapping_domainMetaElement_feature", "_UI_AbstractNodeMapping_type"),
				 GMFMapPackage.eINSTANCE.getAbstractNodeMapping_DomainMetaElement(),
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containment Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addContainmentFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNodeMapping_containmentFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNodeMapping_containmentFeature_feature", "_UI_AbstractNodeMapping_type"),
				 GMFMapPackage.eINSTANCE.getAbstractNodeMapping_ContainmentFeature(),
				 true,
				 null,
				 null,
				 null) {
				protected Collection getComboBoxObjects(Object object) {
					if (object instanceof AbstractNodeMapping) {
						AbstractNodeMapping nm = (AbstractNodeMapping) object;
						if (nm.getDomainMetaElement() != null) {
							Set features = new HashSet();
							for (Iterator it = nm.getDomainMetaElement().getEPackage().eAllContents(); it.hasNext(); ) {
								Object next = it.next();
								if (next instanceof EReference) {
									EReference ref = (EReference) next;
									if (ref.isContainment() && nm.getDomainMetaElement().equals(ref.getEType())) {
										features.add(ref);
									}
								}
							}
							return features;
						}
					}
					return Collections.EMPTY_LIST;
				}
		});
	}

	/**
	 * This adds a property descriptor for the Edit Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addEditFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNodeMapping_editFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNodeMapping_editFeature_feature", "_UI_AbstractNodeMapping_type"),
				 GMFMapPackage.eINSTANCE.getAbstractNodeMapping_EditFeature(),
				 true,
				 null,
				 null,
				 null) {
				protected Collection getComboBoxObjects(Object object) {
					if (object instanceof AbstractNodeMapping) {
						AbstractNodeMapping nm = (AbstractNodeMapping) object;
						if (nm.getDomainMetaElement() != null) {
							return nm.getDomainMetaElement().getEAllAttributes();
						}
					}
					return Collections.EMPTY_LIST;
				}
		});
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GMFMapPackage.eINSTANCE.getAbstractNodeMapping_DomainSpecialization());
			childrenFeatures.add(GMFMapPackage.eINSTANCE.getAbstractNodeMapping_DomainInitializer());
			childrenFeatures.add(GMFMapPackage.eINSTANCE.getAbstractNodeMapping_ChildMappings());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_AbstractNodeMapping_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractNodeMapping.class)) {
			case GMFMapPackage.ABSTRACT_NODE_MAPPING__DOMAIN_SPECIALIZATION:
			case GMFMapPackage.ABSTRACT_NODE_MAPPING__DOMAIN_INITIALIZER:
			case GMFMapPackage.ABSTRACT_NODE_MAPPING__CHILD_MAPPINGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GMFMapPackage.eINSTANCE.getAbstractNodeMapping_DomainSpecialization(),
				 GMFMapFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(GMFMapPackage.eINSTANCE.getAbstractNodeMapping_DomainInitializer(),
				 GMFMapFactory.eINSTANCE.createFeatureSeqInitializer()));

		newChildDescriptors.add
			(createChildParameter
				(GMFMapPackage.eINSTANCE.getAbstractNodeMapping_ChildMappings(),
				 GMFMapFactory.eINSTANCE.createChildNodeMapping()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return GMFMapEditPlugin.INSTANCE;
	}

}
