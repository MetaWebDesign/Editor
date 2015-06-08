/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.FormUpdate;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.PresentationUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.FormUpdateImpl#getUpdatePresentationUnit <em>Update Presentation Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormUpdateImpl extends ViewsImpl implements FormUpdate {
	/**
	 * The cached value of the '{@link #getUpdatePresentationUnit() <em>Update Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatePresentationUnit()
	 * @generated
	 * @ordered
	 */
	protected PresentationUnit updatePresentationUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormUpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.FORM_UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationUnit getUpdatePresentationUnit() {
		return updatePresentationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatePresentationUnit(PresentationUnit newUpdatePresentationUnit, NotificationChain msgs) {
		PresentationUnit oldUpdatePresentationUnit = updatePresentationUnit;
		updatePresentationUnit = newUpdatePresentationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeldosPackage.FORM_UPDATE__UPDATE_PRESENTATION_UNIT, oldUpdatePresentationUnit, newUpdatePresentationUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatePresentationUnit(PresentationUnit newUpdatePresentationUnit) {
		if (newUpdatePresentationUnit != updatePresentationUnit) {
			NotificationChain msgs = null;
			if (updatePresentationUnit != null)
				msgs = ((InternalEObject)updatePresentationUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.FORM_UPDATE__UPDATE_PRESENTATION_UNIT, null, msgs);
			if (newUpdatePresentationUnit != null)
				msgs = ((InternalEObject)newUpdatePresentationUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.FORM_UPDATE__UPDATE_PRESENTATION_UNIT, null, msgs);
			msgs = basicSetUpdatePresentationUnit(newUpdatePresentationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.FORM_UPDATE__UPDATE_PRESENTATION_UNIT, newUpdatePresentationUnit, newUpdatePresentationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.FORM_UPDATE__UPDATE_PRESENTATION_UNIT:
				return basicSetUpdatePresentationUnit(null, msgs);
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
			case ModeldosPackage.FORM_UPDATE__UPDATE_PRESENTATION_UNIT:
				return getUpdatePresentationUnit();
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
			case ModeldosPackage.FORM_UPDATE__UPDATE_PRESENTATION_UNIT:
				setUpdatePresentationUnit((PresentationUnit)newValue);
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
			case ModeldosPackage.FORM_UPDATE__UPDATE_PRESENTATION_UNIT:
				setUpdatePresentationUnit((PresentationUnit)null);
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
			case ModeldosPackage.FORM_UPDATE__UPDATE_PRESENTATION_UNIT:
				return updatePresentationUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //FormUpdateImpl
