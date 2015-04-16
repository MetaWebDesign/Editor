/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Atributte;
import Modeluno.modeluno.Map;
import Modeluno.modeluno.ModelunoPackage;

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
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.MapImpl#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.MapImpl#getHasAtributte <em>Has Atributte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map {
	/**
	 * The cached value of the '{@link #getHasClass() <em>Has Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Modeluno.modeluno.Class> hasClass;

	/**
	 * The cached value of the '{@link #getHasAtributte() <em>Has Atributte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAtributte()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributte> hasAtributte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modeluno.modeluno.Class> getHasClass() {
		if (hasClass == null) {
			hasClass = new EObjectContainmentEList<Modeluno.modeluno.Class>(Modeluno.modeluno.Class.class, this, ModelunoPackage.MAP__HAS_CLASS);
		}
		return hasClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributte> getHasAtributte() {
		if (hasAtributte == null) {
			hasAtributte = new EObjectContainmentEList<Atributte>(Atributte.class, this, ModelunoPackage.MAP__HAS_ATRIBUTTE);
		}
		return hasAtributte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.MAP__HAS_CLASS:
				return ((InternalEList<?>)getHasClass()).basicRemove(otherEnd, msgs);
			case ModelunoPackage.MAP__HAS_ATRIBUTTE:
				return ((InternalEList<?>)getHasAtributte()).basicRemove(otherEnd, msgs);
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
			case ModelunoPackage.MAP__HAS_CLASS:
				return getHasClass();
			case ModelunoPackage.MAP__HAS_ATRIBUTTE:
				return getHasAtributte();
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
			case ModelunoPackage.MAP__HAS_CLASS:
				getHasClass().clear();
				getHasClass().addAll((Collection<? extends Modeluno.modeluno.Class>)newValue);
				return;
			case ModelunoPackage.MAP__HAS_ATRIBUTTE:
				getHasAtributte().clear();
				getHasAtributte().addAll((Collection<? extends Atributte>)newValue);
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
			case ModelunoPackage.MAP__HAS_CLASS:
				getHasClass().clear();
				return;
			case ModelunoPackage.MAP__HAS_ATRIBUTTE:
				getHasAtributte().clear();
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
			case ModelunoPackage.MAP__HAS_CLASS:
				return hasClass != null && !hasClass.isEmpty();
			case ModelunoPackage.MAP__HAS_ATRIBUTTE:
				return hasAtributte != null && !hasAtributte.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MapImpl
