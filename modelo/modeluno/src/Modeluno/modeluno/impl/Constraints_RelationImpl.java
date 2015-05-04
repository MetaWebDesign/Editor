/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Constraints;
import Modeluno.modeluno.Constraints_Relation;
import Modeluno.modeluno.ModelunoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.Constraints_RelationImpl#getGoConstraints <em>Go Constraints</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.Constraints_RelationImpl#getHasConstraints <em>Has Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Constraints_RelationImpl extends MinimalEObjectImpl.Container implements Constraints_Relation {
	/**
	 * The cached value of the '{@link #getGoConstraints() <em>Go Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoConstraints()
	 * @generated
	 * @ordered
	 */
	protected Constraints goConstraints;

	/**
	 * The cached value of the '{@link #getHasConstraints() <em>Has Constraints</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConstraints()
	 * @generated
	 * @ordered
	 */
	protected Constraints hasConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Constraints_RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.CONSTRAINTS_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints getGoConstraints() {
		return goConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoConstraints(Constraints newGoConstraints, NotificationChain msgs) {
		Constraints oldGoConstraints = goConstraints;
		goConstraints = newGoConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.CONSTRAINTS_RELATION__GO_CONSTRAINTS, oldGoConstraints, newGoConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoConstraints(Constraints newGoConstraints) {
		if (newGoConstraints != goConstraints) {
			NotificationChain msgs = null;
			if (goConstraints != null)
				msgs = ((InternalEObject)goConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.CONSTRAINTS_RELATION__GO_CONSTRAINTS, null, msgs);
			if (newGoConstraints != null)
				msgs = ((InternalEObject)newGoConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.CONSTRAINTS_RELATION__GO_CONSTRAINTS, null, msgs);
			msgs = basicSetGoConstraints(newGoConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CONSTRAINTS_RELATION__GO_CONSTRAINTS, newGoConstraints, newGoConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints getHasConstraints() {
		if (hasConstraints != null && hasConstraints.eIsProxy()) {
			InternalEObject oldHasConstraints = (InternalEObject)hasConstraints;
			hasConstraints = (Constraints)eResolveProxy(oldHasConstraints);
			if (hasConstraints != oldHasConstraints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.CONSTRAINTS_RELATION__HAS_CONSTRAINTS, oldHasConstraints, hasConstraints));
			}
		}
		return hasConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints basicGetHasConstraints() {
		return hasConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasConstraints(Constraints newHasConstraints) {
		Constraints oldHasConstraints = hasConstraints;
		hasConstraints = newHasConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CONSTRAINTS_RELATION__HAS_CONSTRAINTS, oldHasConstraints, hasConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.CONSTRAINTS_RELATION__GO_CONSTRAINTS:
				return basicSetGoConstraints(null, msgs);
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
			case ModelunoPackage.CONSTRAINTS_RELATION__GO_CONSTRAINTS:
				return getGoConstraints();
			case ModelunoPackage.CONSTRAINTS_RELATION__HAS_CONSTRAINTS:
				if (resolve) return getHasConstraints();
				return basicGetHasConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelunoPackage.CONSTRAINTS_RELATION__GO_CONSTRAINTS:
				setGoConstraints((Constraints)newValue);
				return;
			case ModelunoPackage.CONSTRAINTS_RELATION__HAS_CONSTRAINTS:
				setHasConstraints((Constraints)newValue);
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
			case ModelunoPackage.CONSTRAINTS_RELATION__GO_CONSTRAINTS:
				setGoConstraints((Constraints)null);
				return;
			case ModelunoPackage.CONSTRAINTS_RELATION__HAS_CONSTRAINTS:
				setHasConstraints((Constraints)null);
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
			case ModelunoPackage.CONSTRAINTS_RELATION__GO_CONSTRAINTS:
				return goConstraints != null;
			case ModelunoPackage.CONSTRAINTS_RELATION__HAS_CONSTRAINTS:
				return hasConstraints != null;
		}
		return super.eIsSet(featureID);
	}

} //Constraints_RelationImpl
