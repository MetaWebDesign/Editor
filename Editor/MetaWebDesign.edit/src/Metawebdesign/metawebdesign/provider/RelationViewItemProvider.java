/**
 */
package Metawebdesign.metawebdesign.provider;


import Metawebdesign.metawebdesign.MetawebdesignFactory;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.RelationView;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Metawebdesign.metawebdesign.RelationView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationViewItemProvider 
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
	public RelationViewItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addTypePresentationPropertyDescriptor(object);
			addPositionHorizontalPropertyDescriptor(object);
			addPositionVerticalPropertyDescriptor(object);
			addGoViewsPropertyDescriptor(object);
			addRviewsGoToClassPropertyDescriptor(object);
			addGetAttributePropertyDescriptor(object);
			addRowPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationView_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationView_name_feature", "_UI_RelationView_type"),
				 MetawebdesignPackage.Literals.RELATION_VIEW__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Presentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePresentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationView_typePresentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationView_typePresentation_feature", "_UI_RelationView_type"),
				 MetawebdesignPackage.Literals.RELATION_VIEW__TYPE_PRESENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position Horizontal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionHorizontalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationView_positionHorizontal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationView_positionHorizontal_feature", "_UI_RelationView_type"),
				 MetawebdesignPackage.Literals.RELATION_VIEW__POSITION_HORIZONTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position Vertical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionVerticalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationView_positionVertical_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationView_positionVertical_feature", "_UI_RelationView_type"),
				 MetawebdesignPackage.Literals.RELATION_VIEW__POSITION_VERTICAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Go Views feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoViewsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationView_goViews_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationView_goViews_feature", "_UI_RelationView_type"),
				 MetawebdesignPackage.Literals.RELATION_VIEW__GO_VIEWS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rviews Go To Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRviewsGoToClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationView_RviewsGoToClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationView_RviewsGoToClass_feature", "_UI_RelationView_type"),
				 MetawebdesignPackage.Literals.RELATION_VIEW__RVIEWS_GO_TO_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Get Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGetAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationView_getAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationView_getAttribute_feature", "_UI_RelationView_type"),
				 MetawebdesignPackage.Literals.RELATION_VIEW__GET_ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationView_row_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationView_row_feature", "_UI_RelationView_type"),
				 MetawebdesignPackage.Literals.RELATION_VIEW__ROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetawebdesignPackage.Literals.RELATION_VIEW__RHAS_VIEWS);
			childrenFeatures.add(MetawebdesignPackage.Literals.RELATION_VIEW__RVIEWS_HAS_CLASS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RelationView.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RelationView"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RelationView)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RelationView_type") :
			getString("_UI_RelationView_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RelationView.class)) {
			case MetawebdesignPackage.RELATION_VIEW__NAME:
			case MetawebdesignPackage.RELATION_VIEW__TYPE_PRESENTATION:
			case MetawebdesignPackage.RELATION_VIEW__POSITION_HORIZONTAL:
			case MetawebdesignPackage.RELATION_VIEW__POSITION_VERTICAL:
			case MetawebdesignPackage.RELATION_VIEW__ROW:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MetawebdesignPackage.RELATION_VIEW__RHAS_VIEWS:
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.RELATION_VIEW__RHAS_VIEWS,
				 MetawebdesignFactory.eINSTANCE.createViews()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.RELATION_VIEW__RHAS_VIEWS,
				 MetawebdesignFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.RELATION_VIEW__RHAS_VIEWS,
				 MetawebdesignFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.RELATION_VIEW__RVIEWS_HAS_CLASS,
				 MetawebdesignFactory.eINSTANCE.createClass()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MetaWebDesignEditPlugin.INSTANCE;
	}

}
