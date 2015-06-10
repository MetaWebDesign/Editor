/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.Group;
import Modeldos.modeldos.Menu;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.TypeOrientation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.MenuImpl#getHasGroup <em>Has Group</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.MenuImpl#getName <em>Name</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.MenuImpl#getOrientated <em>Orientated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends MinimalEObjectImpl.Container implements Menu {
	/**
	 * The cached value of the '{@link #getHasGroup() <em>Has Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> hasGroup;

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
	 * The default value of the '{@link #getOrientated() <em>Orientated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientated()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOrientation ORIENTATED_EDEFAULT = TypeOrientation.TOP_HORIZONTAL;

	/**
	 * The cached value of the '{@link #getOrientated() <em>Orientated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientated()
	 * @generated
	 * @ordered
	 */
	protected TypeOrientation orientated = ORIENTATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getHasGroup() {
		if (hasGroup == null) {
			hasGroup = new EObjectContainmentEList<Group>(Group.class, this, ModeldosPackage.MENU__HAS_GROUP);
		}
		return hasGroup;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.MENU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOrientation getOrientated() {
		return orientated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientated(TypeOrientation newOrientated) {
		TypeOrientation oldOrientated = orientated;
		orientated = newOrientated == null ? ORIENTATED_EDEFAULT : newOrientated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.MENU__ORIENTATED, oldOrientated, orientated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.MENU__HAS_GROUP:
				return ((InternalEList<?>)getHasGroup()).basicRemove(otherEnd, msgs);
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
			case ModeldosPackage.MENU__HAS_GROUP:
				return getHasGroup();
			case ModeldosPackage.MENU__NAME:
				return getName();
			case ModeldosPackage.MENU__ORIENTATED:
				return getOrientated();
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
			case ModeldosPackage.MENU__HAS_GROUP:
				getHasGroup().clear();
				getHasGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case ModeldosPackage.MENU__NAME:
				setName((String)newValue);
				return;
			case ModeldosPackage.MENU__ORIENTATED:
				setOrientated((TypeOrientation)newValue);
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
			case ModeldosPackage.MENU__HAS_GROUP:
				getHasGroup().clear();
				return;
			case ModeldosPackage.MENU__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModeldosPackage.MENU__ORIENTATED:
				setOrientated(ORIENTATED_EDEFAULT);
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
			case ModeldosPackage.MENU__HAS_GROUP:
				return hasGroup != null && !hasGroup.isEmpty();
			case ModeldosPackage.MENU__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModeldosPackage.MENU__ORIENTATED:
				return orientated != ORIENTATED_EDEFAULT;
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
		result.append(", orientated: ");
		result.append(orientated);
		result.append(')');
		return result.toString();
	}

} //MenuImpl
