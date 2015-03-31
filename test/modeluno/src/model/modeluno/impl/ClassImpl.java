/**
 */
package model.modeluno.impl;

import java.util.Collection;

import model.modeluno.ModelunoPackage;
import model.modeluno.Relation;

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
 *   <li>{@link model.modeluno.impl.ClassImpl#getHasRelation <em>Has Relation</em>}</li>
 *   <li>{@link model.modeluno.impl.ClassImpl#getR1 <em>R1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements model.modeluno.Class {
	/**
	 * The cached value of the '{@link #getHasRelation() <em>Has Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> hasRelation;

	/**
	 * The cached value of the '{@link #getR1() <em>R1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> r1;

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
		return ModelunoPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getHasRelation() {
		if (hasRelation == null) {
			hasRelation = new EObjectContainmentEList<Relation>(Relation.class, this, ModelunoPackage.CLASS__HAS_RELATION);
		}
		return hasRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getR1() {
		if (r1 == null) {
			r1 = new EObjectResolvingEList<Relation>(Relation.class, this, ModelunoPackage.CLASS__R1);
		}
		return r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.CLASS__HAS_RELATION:
				return ((InternalEList<?>)getHasRelation()).basicRemove(otherEnd, msgs);
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
			case ModelunoPackage.CLASS__HAS_RELATION:
				return getHasRelation();
			case ModelunoPackage.CLASS__R1:
				return getR1();
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
			case ModelunoPackage.CLASS__HAS_RELATION:
				getHasRelation().clear();
				getHasRelation().addAll((Collection<? extends Relation>)newValue);
				return;
			case ModelunoPackage.CLASS__R1:
				getR1().clear();
				getR1().addAll((Collection<? extends Relation>)newValue);
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
			case ModelunoPackage.CLASS__HAS_RELATION:
				getHasRelation().clear();
				return;
			case ModelunoPackage.CLASS__R1:
				getR1().clear();
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
			case ModelunoPackage.CLASS__HAS_RELATION:
				return hasRelation != null && !hasRelation.isEmpty();
			case ModelunoPackage.CLASS__R1:
				return r1 != null && !r1.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
