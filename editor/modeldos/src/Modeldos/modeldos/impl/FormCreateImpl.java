/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.FormCreate;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.PresentationUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.FormCreateImpl#getCreatePresentationUnit <em>Create Presentation Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormCreateImpl extends ViewsImpl implements FormCreate {
	/**
	 * The cached value of the '{@link #getCreatePresentationUnit() <em>Create Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatePresentationUnit()
	 * @generated
	 * @ordered
	 */
	protected PresentationUnit createPresentationUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.FORM_CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationUnit getCreatePresentationUnit() {
		return createPresentationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatePresentationUnit(PresentationUnit newCreatePresentationUnit, NotificationChain msgs) {
		PresentationUnit oldCreatePresentationUnit = createPresentationUnit;
		createPresentationUnit = newCreatePresentationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeldosPackage.FORM_CREATE__CREATE_PRESENTATION_UNIT, oldCreatePresentationUnit, newCreatePresentationUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatePresentationUnit(PresentationUnit newCreatePresentationUnit) {
		if (newCreatePresentationUnit != createPresentationUnit) {
			NotificationChain msgs = null;
			if (createPresentationUnit != null)
				msgs = ((InternalEObject)createPresentationUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.FORM_CREATE__CREATE_PRESENTATION_UNIT, null, msgs);
			if (newCreatePresentationUnit != null)
				msgs = ((InternalEObject)newCreatePresentationUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.FORM_CREATE__CREATE_PRESENTATION_UNIT, null, msgs);
			msgs = basicSetCreatePresentationUnit(newCreatePresentationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.FORM_CREATE__CREATE_PRESENTATION_UNIT, newCreatePresentationUnit, newCreatePresentationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.FORM_CREATE__CREATE_PRESENTATION_UNIT:
				return basicSetCreatePresentationUnit(null, msgs);
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
			case ModeldosPackage.FORM_CREATE__CREATE_PRESENTATION_UNIT:
				return getCreatePresentationUnit();
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
			case ModeldosPackage.FORM_CREATE__CREATE_PRESENTATION_UNIT:
				setCreatePresentationUnit((PresentationUnit)newValue);
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
			case ModeldosPackage.FORM_CREATE__CREATE_PRESENTATION_UNIT:
				setCreatePresentationUnit((PresentationUnit)null);
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
			case ModeldosPackage.FORM_CREATE__CREATE_PRESENTATION_UNIT:
				return createPresentationUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //FormCreateImpl
