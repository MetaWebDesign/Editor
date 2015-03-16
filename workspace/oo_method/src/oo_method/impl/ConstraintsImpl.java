/**
 */
package oo_method.impl;

import java.util.Collection;

import oo_method.ConstraintFormula;
import oo_method.Constraints;
import oo_method.Oo_methodPackage;

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
 * An implementation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oo_method.impl.ConstraintsImpl#getConstraintComments <em>Constraint Comments</em>}</li>
 *   <li>{@link oo_method.impl.ConstraintsImpl#getConstFormulas <em>Const Formulas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintsImpl extends MinimalEObjectImpl.Container implements Constraints {
	/**
	 * The default value of the '{@link #getConstraintComments() <em>Constraint Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintComments()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintComments() <em>Constraint Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintComments()
	 * @generated
	 * @ordered
	 */
	protected String constraintComments = CONSTRAINT_COMMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstFormulas() <em>Const Formulas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstFormulas()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintFormula> constFormulas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oo_methodPackage.Literals.CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintComments() {
		return constraintComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintComments(String newConstraintComments) {
		String oldConstraintComments = constraintComments;
		constraintComments = newConstraintComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oo_methodPackage.CONSTRAINTS__CONSTRAINT_COMMENTS, oldConstraintComments, constraintComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintFormula> getConstFormulas() {
		if (constFormulas == null) {
			constFormulas = new EObjectContainmentEList<ConstraintFormula>(ConstraintFormula.class, this, Oo_methodPackage.CONSTRAINTS__CONST_FORMULAS);
		}
		return constFormulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Oo_methodPackage.CONSTRAINTS__CONST_FORMULAS:
				return ((InternalEList<?>)getConstFormulas()).basicRemove(otherEnd, msgs);
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
			case Oo_methodPackage.CONSTRAINTS__CONSTRAINT_COMMENTS:
				return getConstraintComments();
			case Oo_methodPackage.CONSTRAINTS__CONST_FORMULAS:
				return getConstFormulas();
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
			case Oo_methodPackage.CONSTRAINTS__CONSTRAINT_COMMENTS:
				setConstraintComments((String)newValue);
				return;
			case Oo_methodPackage.CONSTRAINTS__CONST_FORMULAS:
				getConstFormulas().clear();
				getConstFormulas().addAll((Collection<? extends ConstraintFormula>)newValue);
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
			case Oo_methodPackage.CONSTRAINTS__CONSTRAINT_COMMENTS:
				setConstraintComments(CONSTRAINT_COMMENTS_EDEFAULT);
				return;
			case Oo_methodPackage.CONSTRAINTS__CONST_FORMULAS:
				getConstFormulas().clear();
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
			case Oo_methodPackage.CONSTRAINTS__CONSTRAINT_COMMENTS:
				return CONSTRAINT_COMMENTS_EDEFAULT == null ? constraintComments != null : !CONSTRAINT_COMMENTS_EDEFAULT.equals(constraintComments);
			case Oo_methodPackage.CONSTRAINTS__CONST_FORMULAS:
				return constFormulas != null && !constFormulas.isEmpty();
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
		result.append(" (constraintComments: ");
		result.append(constraintComments);
		result.append(')');
		return result.toString();
	}

} //ConstraintsImpl
