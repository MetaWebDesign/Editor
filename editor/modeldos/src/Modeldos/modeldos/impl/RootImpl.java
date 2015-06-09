/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.Attributes;
import Modeldos.modeldos.Group;
import Modeldos.modeldos.Menu;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.Root;
import Modeldos.modeldos.Views;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.RootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RootImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RootImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RootImpl#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<Modeldos.modeldos.Class> class_;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attributes> attribute;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menu;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<Views> views;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modeldos.modeldos.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<Modeldos.modeldos.Class>(Modeldos.modeldos.Class.class, this, ModeldosPackage.ROOT__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributes> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attributes>(Attributes.class, this, ModeldosPackage.ROOT__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getMenu() {
		if (menu == null) {
			menu = new EObjectContainmentEList<Menu>(Menu.class, this, ModeldosPackage.ROOT__MENU);
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, ModeldosPackage.ROOT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Views> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<Views>(Views.class, this, ModeldosPackage.ROOT__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.ROOT__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case ModeldosPackage.ROOT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case ModeldosPackage.ROOT__MENU:
				return ((InternalEList<?>)getMenu()).basicRemove(otherEnd, msgs);
			case ModeldosPackage.ROOT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ModeldosPackage.ROOT__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeldosPackage.ROOT__CLASS:
				return getClass_();
			case ModeldosPackage.ROOT__ATTRIBUTE:
				return getAttribute();
			case ModeldosPackage.ROOT__MENU:
				return getMenu();
			case ModeldosPackage.ROOT__GROUP:
				return getGroup();
			case ModeldosPackage.ROOT__VIEWS:
				return getViews();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModeldosPackage.ROOT__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends Modeldos.modeldos.Class>)newValue);
				return;
			case ModeldosPackage.ROOT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attributes>)newValue);
				return;
			case ModeldosPackage.ROOT__MENU:
				getMenu().clear();
				getMenu().addAll((Collection<? extends Menu>)newValue);
				return;
			case ModeldosPackage.ROOT__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case ModeldosPackage.ROOT__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends Views>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModeldosPackage.ROOT__CLASS:
				getClass_().clear();
				return;
			case ModeldosPackage.ROOT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case ModeldosPackage.ROOT__MENU:
				getMenu().clear();
				return;
			case ModeldosPackage.ROOT__GROUP:
				getGroup().clear();
				return;
			case ModeldosPackage.ROOT__VIEWS:
				getViews().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModeldosPackage.ROOT__CLASS:
				return class_ != null && !class_.isEmpty();
			case ModeldosPackage.ROOT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case ModeldosPackage.ROOT__MENU:
				return menu != null && !menu.isEmpty();
			case ModeldosPackage.ROOT__GROUP:
				return group != null && !group.isEmpty();
			case ModeldosPackage.ROOT__VIEWS:
				return views != null && !views.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
