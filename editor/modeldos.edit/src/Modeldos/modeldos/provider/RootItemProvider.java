/**
 */
package Modeldos.modeldos.provider;


import Modeldos.modeldos.ModeldosFactory;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.Root;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Modeldos.modeldos.Root} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RootItemProvider 
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
	public RootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ModeldosPackage.Literals.ROOT__CLASS);
			childrenFeatures.add(ModeldosPackage.Literals.ROOT__ATTRIBUTE);
			childrenFeatures.add(ModeldosPackage.Literals.ROOT__MENU);
			childrenFeatures.add(ModeldosPackage.Literals.ROOT__GROUP);
			childrenFeatures.add(ModeldosPackage.Literals.ROOT__VIEWS);
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
	 * This returns Root.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Root"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Root_type");
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

		switch (notification.getFeatureID(Root.class)) {
			case ModeldosPackage.ROOT__CLASS:
			case ModeldosPackage.ROOT__ATTRIBUTE:
			case ModeldosPackage.ROOT__MENU:
			case ModeldosPackage.ROOT__GROUP:
			case ModeldosPackage.ROOT__VIEWS:
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
				(ModeldosPackage.Literals.ROOT__CLASS,
				 ModeldosFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(ModeldosPackage.Literals.ROOT__ATTRIBUTE,
				 ModeldosFactory.eINSTANCE.createAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(ModeldosPackage.Literals.ROOT__ATTRIBUTE,
				 ModeldosFactory.eINSTANCE.createDerived()));

		newChildDescriptors.add
			(createChildParameter
				(ModeldosPackage.Literals.ROOT__ATTRIBUTE,
				 ModeldosFactory.eINSTANCE.createNotDerived()));

		newChildDescriptors.add
			(createChildParameter
				(ModeldosPackage.Literals.ROOT__MENU,
				 ModeldosFactory.eINSTANCE.createMenu()));

		newChildDescriptors.add
			(createChildParameter
				(ModeldosPackage.Literals.ROOT__GROUP,
				 ModeldosFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModeldosPackage.Literals.ROOT__VIEWS,
				 ModeldosFactory.eINSTANCE.createViews()));

		newChildDescriptors.add
			(createChildParameter
				(ModeldosPackage.Literals.ROOT__VIEWS,
				 ModeldosFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(ModeldosPackage.Literals.ROOT__VIEWS,
				 ModeldosFactory.eINSTANCE.createPage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModeldosEditPlugin.INSTANCE;
	}

}
