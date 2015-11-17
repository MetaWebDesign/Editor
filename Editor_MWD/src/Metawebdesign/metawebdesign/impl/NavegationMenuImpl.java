/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Link;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.NavegationMenu;
import Metawebdesign.metawebdesign.typeMenus;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navegation Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.NavegationMenuImpl#getHasLink <em>Has Link</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.NavegationMenuImpl#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.NavegationMenuImpl#getTypeMenu <em>Type Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavegationMenuImpl extends ViewComponentImpl implements NavegationMenu {
	/**
	 * The cached value of the '{@link #getHasLink() <em>Has Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> hasLink;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeMenu() <em>Type Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMenu()
	 * @generated
	 * @ordered
	 */
	protected static final typeMenus TYPE_MENU_EDEFAULT = typeMenus.PRINCIPAL;

	/**
	 * The cached value of the '{@link #getTypeMenu() <em>Type Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMenu()
	 * @generated
	 * @ordered
	 */
	protected typeMenus typeMenu = TYPE_MENU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavegationMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.NAVEGATION_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getHasLink() {
		if (hasLink == null) {
			hasLink = new EObjectContainmentEList<Link>(Link.class, this, MetawebdesignPackage.NAVEGATION_MENU__HAS_LINK);
		}
		return hasLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.NAVEGATION_MENU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeMenus getTypeMenu() {
		return typeMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMenu(typeMenus newTypeMenu) {
		typeMenus oldTypeMenu = typeMenu;
		typeMenu = newTypeMenu == null ? TYPE_MENU_EDEFAULT : newTypeMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.NAVEGATION_MENU__TYPE_MENU, oldTypeMenu, typeMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetawebdesignPackage.NAVEGATION_MENU__HAS_LINK:
				return ((InternalEList<?>)getHasLink()).basicRemove(otherEnd, msgs);
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
			case MetawebdesignPackage.NAVEGATION_MENU__HAS_LINK:
				return getHasLink();
			case MetawebdesignPackage.NAVEGATION_MENU__NAME:
				return getName();
			case MetawebdesignPackage.NAVEGATION_MENU__TYPE_MENU:
				return getTypeMenu();
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
			case MetawebdesignPackage.NAVEGATION_MENU__HAS_LINK:
				getHasLink().clear();
				getHasLink().addAll((Collection<? extends Link>)newValue);
				return;
			case MetawebdesignPackage.NAVEGATION_MENU__NAME:
				setName((String)newValue);
				return;
			case MetawebdesignPackage.NAVEGATION_MENU__TYPE_MENU:
				setTypeMenu((typeMenus)newValue);
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
			case MetawebdesignPackage.NAVEGATION_MENU__HAS_LINK:
				getHasLink().clear();
				return;
			case MetawebdesignPackage.NAVEGATION_MENU__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetawebdesignPackage.NAVEGATION_MENU__TYPE_MENU:
				setTypeMenu(TYPE_MENU_EDEFAULT);
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
			case MetawebdesignPackage.NAVEGATION_MENU__HAS_LINK:
				return hasLink != null && !hasLink.isEmpty();
			case MetawebdesignPackage.NAVEGATION_MENU__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetawebdesignPackage.NAVEGATION_MENU__TYPE_MENU:
				return typeMenu != TYPE_MENU_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", typeMenu: ");
		result.append(typeMenu);
		result.append(')');
		return result.toString();
	}

} //NavegationMenuImpl
