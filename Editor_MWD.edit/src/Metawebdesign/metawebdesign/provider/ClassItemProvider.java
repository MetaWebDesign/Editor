/**
 */
package Metawebdesign.metawebdesign.provider;


import Metawebdesign.metawebdesign.MetawebdesignFactory;
import Metawebdesign.metawebdesign.MetawebdesignPackage;

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
 * This is the item provider adapter for a {@link Metawebdesign.metawebdesign.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider 
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
	public ClassItemProvider(AdapterFactory adapterFactory) {
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
			addIdPropertyDescriptor(object);
			addFunctionCreatePropertyDescriptor(object);
			addFunctionDeletePropertyDescriptor(object);
			addFunctionUpdatePropertyDescriptor(object);
			addFunctionIndexPropertyDescriptor(object);
			addFunctionViewPropertyDescriptor(object);
			addFunctionAdminPropertyDescriptor(object);
			addGoRelationClassPropertyDescriptor(object);
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
				 getString("_UI_Class_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_name_feature", "_UI_Class_type"),
				 MetawebdesignPackage.Literals.CLASS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_id_feature", "_UI_Class_type"),
				 MetawebdesignPackage.Literals.CLASS__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function Create feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionCreatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_functionCreate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_functionCreate_feature", "_UI_Class_type"),
				 MetawebdesignPackage.Literals.CLASS__FUNCTION_CREATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function Delete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionDeletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_functionDelete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_functionDelete_feature", "_UI_Class_type"),
				 MetawebdesignPackage.Literals.CLASS__FUNCTION_DELETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function Update feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionUpdatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_functionUpdate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_functionUpdate_feature", "_UI_Class_type"),
				 MetawebdesignPackage.Literals.CLASS__FUNCTION_UPDATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_functionIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_functionIndex_feature", "_UI_Class_type"),
				 MetawebdesignPackage.Literals.CLASS__FUNCTION_INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_functionView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_functionView_feature", "_UI_Class_type"),
				 MetawebdesignPackage.Literals.CLASS__FUNCTION_VIEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function Admin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionAdminPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_functionAdmin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_functionAdmin_feature", "_UI_Class_type"),
				 MetawebdesignPackage.Literals.CLASS__FUNCTION_ADMIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Go Relation Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoRelationClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_goRelationClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_goRelationClass_feature", "_UI_Class_type"),
				 MetawebdesignPackage.Literals.CLASS__GO_RELATION_CLASS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(MetawebdesignPackage.Literals.CLASS__HAS_ATTRIBUTES);
			childrenFeatures.add(MetawebdesignPackage.Literals.CLASS__HAS_RELATION_CLASS);
			childrenFeatures.add(MetawebdesignPackage.Literals.CLASS__HAS_VIEW);
			childrenFeatures.add(MetawebdesignPackage.Literals.CLASS__HAS_CONSTRAINT);
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
	 * This returns Class.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Class"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Metawebdesign.metawebdesign.Class)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Class_type") :
			getString("_UI_Class_type") + " " + label;
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

		switch (notification.getFeatureID(Metawebdesign.metawebdesign.Class.class)) {
			case MetawebdesignPackage.CLASS__NAME:
			case MetawebdesignPackage.CLASS__ID:
			case MetawebdesignPackage.CLASS__FUNCTION_CREATE:
			case MetawebdesignPackage.CLASS__FUNCTION_DELETE:
			case MetawebdesignPackage.CLASS__FUNCTION_UPDATE:
			case MetawebdesignPackage.CLASS__FUNCTION_INDEX:
			case MetawebdesignPackage.CLASS__FUNCTION_VIEW:
			case MetawebdesignPackage.CLASS__FUNCTION_ADMIN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MetawebdesignPackage.CLASS__HAS_ATTRIBUTES:
			case MetawebdesignPackage.CLASS__HAS_RELATION_CLASS:
			case MetawebdesignPackage.CLASS__HAS_VIEW:
			case MetawebdesignPackage.CLASS__HAS_CONSTRAINT:
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
				(MetawebdesignPackage.Literals.CLASS__HAS_ATTRIBUTES,
				 MetawebdesignFactory.eINSTANCE.createAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.CLASS__HAS_ATTRIBUTES,
				 MetawebdesignFactory.eINSTANCE.createDerived()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.CLASS__HAS_ATTRIBUTES,
				 MetawebdesignFactory.eINSTANCE.createNotDerived()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.CLASS__HAS_RELATION_CLASS,
				 MetawebdesignFactory.eINSTANCE.createRelationClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.CLASS__HAS_VIEW,
				 MetawebdesignFactory.eINSTANCE.createViews()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.CLASS__HAS_VIEW,
				 MetawebdesignFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.CLASS__HAS_VIEW,
				 MetawebdesignFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(MetawebdesignPackage.Literals.CLASS__HAS_CONSTRAINT,
				 MetawebdesignFactory.eINSTANCE.createConstraint()));
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
