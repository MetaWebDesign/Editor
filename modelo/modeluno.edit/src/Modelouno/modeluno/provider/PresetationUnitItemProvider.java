/**
 */
package Modelouno.modeluno.provider;


import Modelouno.modeluno.ModelunoFactory;
import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.PresetationUnit;

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
 * This is the item provider adapter for a {@link Modelouno.modeluno.PresetationUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PresetationUnitItemProvider 
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
	public PresetationUnitItemProvider(AdapterFactory adapterFactory) {
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

			addName_fieldPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addHorizontalPositionPropertyDescriptor(object);
			addVerticalPositionPropertyDescriptor(object);
			addPUgoToViewsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addName_fieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PresetationUnit_name_field_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PresetationUnit_name_field_feature", "_UI_PresetationUnit_type"),
				 ModelunoPackage.Literals.PRESETATION_UNIT__NAME_FIELD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PresetationUnit_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PresetationUnit_type_feature", "_UI_PresetationUnit_type"),
				 ModelunoPackage.Literals.PRESETATION_UNIT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PresetationUnit_HorizontalPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PresetationUnit_HorizontalPosition_feature", "_UI_PresetationUnit_type"),
				 ModelunoPackage.Literals.PRESETATION_UNIT__HORIZONTAL_POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PresetationUnit_VerticalPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PresetationUnit_VerticalPosition_feature", "_UI_PresetationUnit_type"),
				 ModelunoPackage.Literals.PRESETATION_UNIT__VERTICAL_POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PUgo To Views feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPUgoToViewsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PresetationUnit_PUgoToViews_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PresetationUnit_PUgoToViews_feature", "_UI_PresetationUnit_type"),
				 ModelunoPackage.Literals.PRESETATION_UNIT__PUGO_TO_VIEWS,
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
			childrenFeatures.add(ModelunoPackage.Literals.PRESETATION_UNIT__PUHAS_VIEWS);
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
	 * This returns PresetationUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PresetationUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PresetationUnit)object).getName_field();
		return label == null || label.length() == 0 ?
			getString("_UI_PresetationUnit_type") :
			getString("_UI_PresetationUnit_type") + " " + label;
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

		switch (notification.getFeatureID(PresetationUnit.class)) {
			case ModelunoPackage.PRESETATION_UNIT__NAME_FIELD:
			case ModelunoPackage.PRESETATION_UNIT__TYPE:
			case ModelunoPackage.PRESETATION_UNIT__HORIZONTAL_POSITION:
			case ModelunoPackage.PRESETATION_UNIT__VERTICAL_POSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS:
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
				(ModelunoPackage.Literals.PRESETATION_UNIT__PUHAS_VIEWS,
				 ModelunoFactory.eINSTANCE.createViews()));

		newChildDescriptors.add
			(createChildParameter
				(ModelunoPackage.Literals.PRESETATION_UNIT__PUHAS_VIEWS,
				 ModelunoFactory.eINSTANCE.createViewInput()));

		newChildDescriptors.add
			(createChildParameter
				(ModelunoPackage.Literals.PRESETATION_UNIT__PUHAS_VIEWS,
				 ModelunoFactory.eINSTANCE.createViewUpdateObject()));

		newChildDescriptors.add
			(createChildParameter
				(ModelunoPackage.Literals.PRESETATION_UNIT__PUHAS_VIEWS,
				 ModelunoFactory.eINSTANCE.createViewUpdateAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(ModelunoPackage.Literals.PRESETATION_UNIT__PUHAS_VIEWS,
				 ModelunoFactory.eINSTANCE.createViewIndex()));

		newChildDescriptors.add
			(createChildParameter
				(ModelunoPackage.Literals.PRESETATION_UNIT__PUHAS_VIEWS,
				 ModelunoFactory.eINSTANCE.createViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(ModelunoPackage.Literals.PRESETATION_UNIT__PUHAS_VIEWS,
				 ModelunoFactory.eINSTANCE.createViewAdmin()));

		newChildDescriptors.add
			(createChildParameter
				(ModelunoPackage.Literals.PRESETATION_UNIT__PUHAS_VIEWS,
				 ModelunoFactory.eINSTANCE.createPage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelunoEditPlugin.INSTANCE;
	}

}
