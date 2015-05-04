/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Attribute;
import Modeluno.modeluno.Constraints;
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
 *   <li>{@link Modeluno.modeluno.impl.MapImpl#getRoot_hasClass <em>Root has Class</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.MapImpl#getRoot_hasAtributte <em>Root has Atributte</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.MapImpl#getRoot_hasConstraints <em>Root has Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map {
	/**
	 * The cached value of the '{@link #getRoot_hasClass() <em>Root has Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot_hasClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Modeluno.modeluno.Class> root_hasClass;

	/**
	 * The cached value of the '{@link #getRoot_hasAtributte() <em>Root has Atributte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot_hasAtributte()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> root_hasAtributte;

	/**
	 * The cached value of the '{@link #getRoot_hasConstraints() <em>Root has Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot_hasConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraints> root_hasConstraints;

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
	public EList<Modeluno.modeluno.Class> getRoot_hasClass() {
		if (root_hasClass == null) {
			root_hasClass = new EObjectContainmentEList<Modeluno.modeluno.Class>(Modeluno.modeluno.Class.class, this, ModelunoPackage.MAP__ROOT_HAS_CLASS);
		}
		return root_hasClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getRoot_hasAtributte() {
		if (root_hasAtributte == null) {
			root_hasAtributte = new EObjectContainmentEList<Attribute>(Attribute.class, this, ModelunoPackage.MAP__ROOT_HAS_ATRIBUTTE);
		}
		return root_hasAtributte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraints> getRoot_hasConstraints() {
		if (root_hasConstraints == null) {
			root_hasConstraints = new EObjectContainmentEList<Constraints>(Constraints.class, this, ModelunoPackage.MAP__ROOT_HAS_CONSTRAINTS);
		}
		return root_hasConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.MAP__ROOT_HAS_CLASS:
				return ((InternalEList<?>)getRoot_hasClass()).basicRemove(otherEnd, msgs);
			case ModelunoPackage.MAP__ROOT_HAS_ATRIBUTTE:
				return ((InternalEList<?>)getRoot_hasAtributte()).basicRemove(otherEnd, msgs);
			case ModelunoPackage.MAP__ROOT_HAS_CONSTRAINTS:
				return ((InternalEList<?>)getRoot_hasConstraints()).basicRemove(otherEnd, msgs);
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
			case ModelunoPackage.MAP__ROOT_HAS_CLASS:
				return getRoot_hasClass();
			case ModelunoPackage.MAP__ROOT_HAS_ATRIBUTTE:
				return getRoot_hasAtributte();
			case ModelunoPackage.MAP__ROOT_HAS_CONSTRAINTS:
				return getRoot_hasConstraints();
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
			case ModelunoPackage.MAP__ROOT_HAS_CLASS:
				getRoot_hasClass().clear();
				getRoot_hasClass().addAll((Collection<? extends Modeluno.modeluno.Class>)newValue);
				return;
			case ModelunoPackage.MAP__ROOT_HAS_ATRIBUTTE:
				getRoot_hasAtributte().clear();
				getRoot_hasAtributte().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ModelunoPackage.MAP__ROOT_HAS_CONSTRAINTS:
				getRoot_hasConstraints().clear();
				getRoot_hasConstraints().addAll((Collection<? extends Constraints>)newValue);
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
			case ModelunoPackage.MAP__ROOT_HAS_CLASS:
				getRoot_hasClass().clear();
				return;
			case ModelunoPackage.MAP__ROOT_HAS_ATRIBUTTE:
				getRoot_hasAtributte().clear();
				return;
			case ModelunoPackage.MAP__ROOT_HAS_CONSTRAINTS:
				getRoot_hasConstraints().clear();
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
			case ModelunoPackage.MAP__ROOT_HAS_CLASS:
				return root_hasClass != null && !root_hasClass.isEmpty();
			case ModelunoPackage.MAP__ROOT_HAS_ATRIBUTTE:
				return root_hasAtributte != null && !root_hasAtributte.isEmpty();
			case ModelunoPackage.MAP__ROOT_HAS_CONSTRAINTS:
				return root_hasConstraints != null && !root_hasConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MapImpl
