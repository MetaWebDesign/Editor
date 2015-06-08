/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.PresentationUnit;
import Modeldos.modeldos.RelationPUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation PUnit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.RelationPUnitImpl#getGoPunit2 <em>Go Punit2</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RelationPUnitImpl#getRtoPUnit <em>Rto PUnit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationPUnitImpl extends MinimalEObjectImpl.Container implements RelationPUnit {
	/**
	 * The cached value of the '{@link #getGoPunit2() <em>Go Punit2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoPunit2()
	 * @generated
	 * @ordered
	 */
	protected PresentationUnit goPunit2;

	/**
	 * The cached value of the '{@link #getRtoPUnit() <em>Rto PUnit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtoPUnit()
	 * @generated
	 * @ordered
	 */
	protected PresentationUnit rtoPUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationPUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.RELATION_PUNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationUnit getGoPunit2() {
		if (goPunit2 != null && goPunit2.eIsProxy()) {
			InternalEObject oldGoPunit2 = (InternalEObject)goPunit2;
			goPunit2 = (PresentationUnit)eResolveProxy(oldGoPunit2);
			if (goPunit2 != oldGoPunit2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeldosPackage.RELATION_PUNIT__GO_PUNIT2, oldGoPunit2, goPunit2));
			}
		}
		return goPunit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationUnit basicGetGoPunit2() {
		return goPunit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoPunit2(PresentationUnit newGoPunit2) {
		PresentationUnit oldGoPunit2 = goPunit2;
		goPunit2 = newGoPunit2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_PUNIT__GO_PUNIT2, oldGoPunit2, goPunit2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationUnit getRtoPUnit() {
		return rtoPUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtoPUnit(PresentationUnit newRtoPUnit, NotificationChain msgs) {
		PresentationUnit oldRtoPUnit = rtoPUnit;
		rtoPUnit = newRtoPUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_PUNIT__RTO_PUNIT, oldRtoPUnit, newRtoPUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtoPUnit(PresentationUnit newRtoPUnit) {
		if (newRtoPUnit != rtoPUnit) {
			NotificationChain msgs = null;
			if (rtoPUnit != null)
				msgs = ((InternalEObject)rtoPUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.RELATION_PUNIT__RTO_PUNIT, null, msgs);
			if (newRtoPUnit != null)
				msgs = ((InternalEObject)newRtoPUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.RELATION_PUNIT__RTO_PUNIT, null, msgs);
			msgs = basicSetRtoPUnit(newRtoPUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_PUNIT__RTO_PUNIT, newRtoPUnit, newRtoPUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.RELATION_PUNIT__RTO_PUNIT:
				return basicSetRtoPUnit(null, msgs);
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
			case ModeldosPackage.RELATION_PUNIT__GO_PUNIT2:
				if (resolve) return getGoPunit2();
				return basicGetGoPunit2();
			case ModeldosPackage.RELATION_PUNIT__RTO_PUNIT:
				return getRtoPUnit();
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
			case ModeldosPackage.RELATION_PUNIT__GO_PUNIT2:
				setGoPunit2((PresentationUnit)newValue);
				return;
			case ModeldosPackage.RELATION_PUNIT__RTO_PUNIT:
				setRtoPUnit((PresentationUnit)newValue);
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
			case ModeldosPackage.RELATION_PUNIT__GO_PUNIT2:
				setGoPunit2((PresentationUnit)null);
				return;
			case ModeldosPackage.RELATION_PUNIT__RTO_PUNIT:
				setRtoPUnit((PresentationUnit)null);
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
			case ModeldosPackage.RELATION_PUNIT__GO_PUNIT2:
				return goPunit2 != null;
			case ModeldosPackage.RELATION_PUNIT__RTO_PUNIT:
				return rtoPUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationPUnitImpl
