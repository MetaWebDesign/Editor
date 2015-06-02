/**
 */
package Modelouno.modeluno.impl;

import Modelouno.modeluno.Attribute;
import Modelouno.modeluno.Map;
import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.Service;
import Modelouno.modeluno.Views;

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
 *   <li>{@link Modelouno.modeluno.impl.MapImpl#getRoot_hasClass <em>Root has Class</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.MapImpl#getRoot_hasAtributte <em>Root has Atributte</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.MapImpl#getRootHasViews <em>Root Has Views</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.MapImpl#getRoothasService <em>Roothas Service</em>}</li>
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
	protected EList<Modelouno.modeluno.Class> root_hasClass;

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
	 * The cached value of the '{@link #getRootHasViews() <em>Root Has Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootHasViews()
	 * @generated
	 * @ordered
	 */
	protected EList<Views> rootHasViews;

	/**
	 * The cached value of the '{@link #getRoothasService() <em>Roothas Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoothasService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> roothasService;

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
	public EList<Modelouno.modeluno.Class> getRoot_hasClass() {
		if (root_hasClass == null) {
			root_hasClass = new EObjectContainmentEList<Modelouno.modeluno.Class>(Modelouno.modeluno.Class.class, this, ModelunoPackage.MAP__ROOT_HAS_CLASS);
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
	public EList<Views> getRootHasViews() {
		if (rootHasViews == null) {
			rootHasViews = new EObjectContainmentEList<Views>(Views.class, this, ModelunoPackage.MAP__ROOT_HAS_VIEWS);
		}
		return rootHasViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getRoothasService() {
		if (roothasService == null) {
			roothasService = new EObjectContainmentEList<Service>(Service.class, this, ModelunoPackage.MAP__ROOTHAS_SERVICE);
		}
		return roothasService;
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
			case ModelunoPackage.MAP__ROOT_HAS_VIEWS:
				return ((InternalEList<?>)getRootHasViews()).basicRemove(otherEnd, msgs);
			case ModelunoPackage.MAP__ROOTHAS_SERVICE:
				return ((InternalEList<?>)getRoothasService()).basicRemove(otherEnd, msgs);
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
			case ModelunoPackage.MAP__ROOT_HAS_VIEWS:
				return getRootHasViews();
			case ModelunoPackage.MAP__ROOTHAS_SERVICE:
				return getRoothasService();
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
				getRoot_hasClass().addAll((Collection<? extends Modelouno.modeluno.Class>)newValue);
				return;
			case ModelunoPackage.MAP__ROOT_HAS_ATRIBUTTE:
				getRoot_hasAtributte().clear();
				getRoot_hasAtributte().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ModelunoPackage.MAP__ROOT_HAS_VIEWS:
				getRootHasViews().clear();
				getRootHasViews().addAll((Collection<? extends Views>)newValue);
				return;
			case ModelunoPackage.MAP__ROOTHAS_SERVICE:
				getRoothasService().clear();
				getRoothasService().addAll((Collection<? extends Service>)newValue);
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
			case ModelunoPackage.MAP__ROOT_HAS_VIEWS:
				getRootHasViews().clear();
				return;
			case ModelunoPackage.MAP__ROOTHAS_SERVICE:
				getRoothasService().clear();
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
			case ModelunoPackage.MAP__ROOT_HAS_VIEWS:
				return rootHasViews != null && !rootHasViews.isEmpty();
			case ModelunoPackage.MAP__ROOTHAS_SERVICE:
				return roothasService != null && !roothasService.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MapImpl
