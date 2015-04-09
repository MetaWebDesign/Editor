/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.Atributte;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getHasRelation <em>Has Relation</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getR1 <em>R1</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getHasAtribute <em>Has Atribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements Modeldos.modeldos.Class {
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
	 * The default value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected static final String CNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected String cname = CNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasAtribute() <em>Has Atribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAtribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributte> hasAtribute;

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
		return ModeldosPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getHasRelation() {
		if (hasRelation == null) {
			hasRelation = new EObjectContainmentEList<Relation>(Relation.class, this, ModeldosPackage.CLASS__HAS_RELATION);
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
			r1 = new EObjectResolvingEList<Relation>(Relation.class, this, ModeldosPackage.CLASS__R1);
		}
		return r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCname(String newCname) {
		String oldCname = cname;
		cname = newCname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__CNAME, oldCname, cname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributte> getHasAtribute() {
		if (hasAtribute == null) {
			hasAtribute = new EObjectContainmentEList<Atributte>(Atributte.class, this, ModeldosPackage.CLASS__HAS_ATRIBUTE);
		}
		return hasAtribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.CLASS__HAS_RELATION:
				return ((InternalEList<?>)getHasRelation()).basicRemove(otherEnd, msgs);
			case ModeldosPackage.CLASS__HAS_ATRIBUTE:
				return ((InternalEList<?>)getHasAtribute()).basicRemove(otherEnd, msgs);
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
			case ModeldosPackage.CLASS__HAS_RELATION:
				return getHasRelation();
			case ModeldosPackage.CLASS__R1:
				return getR1();
			case ModeldosPackage.CLASS__CNAME:
				return getCname();
			case ModeldosPackage.CLASS__HAS_ATRIBUTE:
				return getHasAtribute();
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
			case ModeldosPackage.CLASS__HAS_RELATION:
				getHasRelation().clear();
				getHasRelation().addAll((Collection<? extends Relation>)newValue);
				return;
			case ModeldosPackage.CLASS__R1:
				getR1().clear();
				getR1().addAll((Collection<? extends Relation>)newValue);
				return;
			case ModeldosPackage.CLASS__CNAME:
				setCname((String)newValue);
				return;
			case ModeldosPackage.CLASS__HAS_ATRIBUTE:
				getHasAtribute().clear();
				getHasAtribute().addAll((Collection<? extends Atributte>)newValue);
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
			case ModeldosPackage.CLASS__HAS_RELATION:
				getHasRelation().clear();
				return;
			case ModeldosPackage.CLASS__R1:
				getR1().clear();
				return;
			case ModeldosPackage.CLASS__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case ModeldosPackage.CLASS__HAS_ATRIBUTE:
				getHasAtribute().clear();
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
			case ModeldosPackage.CLASS__HAS_RELATION:
				return hasRelation != null && !hasRelation.isEmpty();
			case ModeldosPackage.CLASS__R1:
				return r1 != null && !r1.isEmpty();
			case ModeldosPackage.CLASS__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case ModeldosPackage.CLASS__HAS_ATRIBUTE:
				return hasAtribute != null && !hasAtribute.isEmpty();
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
		result.append(" (Cname: ");
		result.append(cname);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
