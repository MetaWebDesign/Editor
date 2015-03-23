/**
 */
package modelo.impl;

import java.util.Collection;

import modelo.ModeloPackage;
import modelo.Relation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.ClassImpl#getHasRelaction <em>Has Relaction</em>}</li>
 *   <li>{@link modelo.impl.ClassImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements modelo.Class {
	/**
	 * The cached value of the '{@link #getHasRelaction() <em>Has Relaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> hasRelaction;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getHasRelaction() {
		if (hasRelaction == null) {
			hasRelaction = new EObjectContainmentEList<Relation>(Relation.class, this, ModeloPackage.CLASS__HAS_RELACTION);
		}
		return hasRelaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<Relation>(Relation.class, this, ModeloPackage.CLASS__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.CLASS__HAS_RELACTION:
				return ((InternalEList<?>)getHasRelaction()).basicRemove(otherEnd, msgs);
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
			case ModeloPackage.CLASS__HAS_RELACTION:
				return getHasRelaction();
			case ModeloPackage.CLASS__FROM:
				return getFrom();
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
			case ModeloPackage.CLASS__HAS_RELACTION:
				getHasRelaction().clear();
				getHasRelaction().addAll((Collection<? extends Relation>)newValue);
				return;
			case ModeloPackage.CLASS__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends Relation>)newValue);
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
			case ModeloPackage.CLASS__HAS_RELACTION:
				getHasRelaction().clear();
				return;
			case ModeloPackage.CLASS__FROM:
				getFrom().clear();
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
			case ModeloPackage.CLASS__HAS_RELACTION:
				return hasRelaction != null && !hasRelaction.isEmpty();
			case ModeloPackage.CLASS__FROM:
				return from != null && !from.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
