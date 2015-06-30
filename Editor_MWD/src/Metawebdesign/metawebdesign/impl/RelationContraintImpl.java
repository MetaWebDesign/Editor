/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Constraint;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.RelationContraint;

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
 * An implementation of the model object '<em><b>Relation Contraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationContraintImpl#getRhasConstraint <em>Rhas Constraint</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationContraintImpl#getGoRConstraint2 <em>Go RConstraint2</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationContraintImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationContraintImpl extends MinimalEObjectImpl.Container implements RelationContraint {
	/**
	 * The cached value of the '{@link #getRhasConstraint() <em>Rhas Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhasConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> rhasConstraint;

	/**
	 * The cached value of the '{@link #getGoRConstraint2() <em>Go RConstraint2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoRConstraint2()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> goRConstraint2;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationContraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.RELATION_CONTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getRhasConstraint() {
		if (rhasConstraint == null) {
			rhasConstraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, MetawebdesignPackage.RELATION_CONTRAINT__RHAS_CONSTRAINT);
		}
		return rhasConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getGoRConstraint2() {
		if (goRConstraint2 == null) {
			goRConstraint2 = new EObjectResolvingEList<Constraint>(Constraint.class, this, MetawebdesignPackage.RELATION_CONTRAINT__GO_RCONSTRAINT2);
		}
		return goRConstraint2;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CONTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetawebdesignPackage.RELATION_CONTRAINT__RHAS_CONSTRAINT:
				return ((InternalEList<?>)getRhasConstraint()).basicRemove(otherEnd, msgs);
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
			case MetawebdesignPackage.RELATION_CONTRAINT__RHAS_CONSTRAINT:
				return getRhasConstraint();
			case MetawebdesignPackage.RELATION_CONTRAINT__GO_RCONSTRAINT2:
				return getGoRConstraint2();
			case MetawebdesignPackage.RELATION_CONTRAINT__NAME:
				return getName();
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
			case MetawebdesignPackage.RELATION_CONTRAINT__RHAS_CONSTRAINT:
				getRhasConstraint().clear();
				getRhasConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case MetawebdesignPackage.RELATION_CONTRAINT__GO_RCONSTRAINT2:
				getGoRConstraint2().clear();
				getGoRConstraint2().addAll((Collection<? extends Constraint>)newValue);
				return;
			case MetawebdesignPackage.RELATION_CONTRAINT__NAME:
				setName((String)newValue);
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
			case MetawebdesignPackage.RELATION_CONTRAINT__RHAS_CONSTRAINT:
				getRhasConstraint().clear();
				return;
			case MetawebdesignPackage.RELATION_CONTRAINT__GO_RCONSTRAINT2:
				getGoRConstraint2().clear();
				return;
			case MetawebdesignPackage.RELATION_CONTRAINT__NAME:
				setName(NAME_EDEFAULT);
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
			case MetawebdesignPackage.RELATION_CONTRAINT__RHAS_CONSTRAINT:
				return rhasConstraint != null && !rhasConstraint.isEmpty();
			case MetawebdesignPackage.RELATION_CONTRAINT__GO_RCONSTRAINT2:
				return goRConstraint2 != null && !goRConstraint2.isEmpty();
			case MetawebdesignPackage.RELATION_CONTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //RelationContraintImpl
