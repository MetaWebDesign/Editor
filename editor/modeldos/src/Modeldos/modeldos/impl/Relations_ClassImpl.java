/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.Relations_Class;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relations Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.Relations_ClassImpl#getGoclass2 <em>Goclass2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Relations_ClassImpl extends MinimalEObjectImpl.Container implements Relations_Class {
	/**
	 * The cached value of the '{@link #getGoclass2() <em>Goclass2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoclass2()
	 * @generated
	 * @ordered
	 */
	protected Modeldos.modeldos.Class goclass2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Relations_ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.RELATIONS_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modeldos.modeldos.Class getGoclass2() {
		if (goclass2 != null && goclass2.eIsProxy()) {
			InternalEObject oldGoclass2 = (InternalEObject)goclass2;
			goclass2 = (Modeldos.modeldos.Class)eResolveProxy(oldGoclass2);
			if (goclass2 != oldGoclass2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeldosPackage.RELATIONS_CLASS__GOCLASS2, oldGoclass2, goclass2));
			}
		}
		return goclass2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modeldos.modeldos.Class basicGetGoclass2() {
		return goclass2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoclass2(Modeldos.modeldos.Class newGoclass2) {
		Modeldos.modeldos.Class oldGoclass2 = goclass2;
		goclass2 = newGoclass2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATIONS_CLASS__GOCLASS2, oldGoclass2, goclass2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeldosPackage.RELATIONS_CLASS__GOCLASS2:
				if (resolve) return getGoclass2();
				return basicGetGoclass2();
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
			case ModeldosPackage.RELATIONS_CLASS__GOCLASS2:
				setGoclass2((Modeldos.modeldos.Class)newValue);
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
			case ModeldosPackage.RELATIONS_CLASS__GOCLASS2:
				setGoclass2((Modeldos.modeldos.Class)null);
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
			case ModeldosPackage.RELATIONS_CLASS__GOCLASS2:
				return goclass2 != null;
		}
		return super.eIsSet(featureID);
	}

} //Relations_ClassImpl
