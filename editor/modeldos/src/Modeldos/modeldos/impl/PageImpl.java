/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.Page;
import Modeldos.modeldos.PresentationUnit;
import Modeldos.modeldos.TypeRol;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.PageImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.PageImpl#getPagePresentationUnit <em>Page Presentation Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends ViewsImpl implements Page {
	/**
	 * The default value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRol ROL_EDEFAULT = TypeRol.ANONYMOUS;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected TypeRol rol = ROL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPagePresentationUnit() <em>Page Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagePresentationUnit()
	 * @generated
	 * @ordered
	 */
	protected PresentationUnit pagePresentationUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol getRol() {
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRol(TypeRol newRol) {
		TypeRol oldRol = rol;
		rol = newRol == null ? ROL_EDEFAULT : newRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.PAGE__ROL, oldRol, rol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationUnit getPagePresentationUnit() {
		return pagePresentationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPagePresentationUnit(PresentationUnit newPagePresentationUnit, NotificationChain msgs) {
		PresentationUnit oldPagePresentationUnit = pagePresentationUnit;
		pagePresentationUnit = newPagePresentationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeldosPackage.PAGE__PAGE_PRESENTATION_UNIT, oldPagePresentationUnit, newPagePresentationUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagePresentationUnit(PresentationUnit newPagePresentationUnit) {
		if (newPagePresentationUnit != pagePresentationUnit) {
			NotificationChain msgs = null;
			if (pagePresentationUnit != null)
				msgs = ((InternalEObject)pagePresentationUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.PAGE__PAGE_PRESENTATION_UNIT, null, msgs);
			if (newPagePresentationUnit != null)
				msgs = ((InternalEObject)newPagePresentationUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.PAGE__PAGE_PRESENTATION_UNIT, null, msgs);
			msgs = basicSetPagePresentationUnit(newPagePresentationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.PAGE__PAGE_PRESENTATION_UNIT, newPagePresentationUnit, newPagePresentationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.PAGE__PAGE_PRESENTATION_UNIT:
				return basicSetPagePresentationUnit(null, msgs);
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
			case ModeldosPackage.PAGE__ROL:
				return getRol();
			case ModeldosPackage.PAGE__PAGE_PRESENTATION_UNIT:
				return getPagePresentationUnit();
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
			case ModeldosPackage.PAGE__ROL:
				setRol((TypeRol)newValue);
				return;
			case ModeldosPackage.PAGE__PAGE_PRESENTATION_UNIT:
				setPagePresentationUnit((PresentationUnit)newValue);
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
			case ModeldosPackage.PAGE__ROL:
				setRol(ROL_EDEFAULT);
				return;
			case ModeldosPackage.PAGE__PAGE_PRESENTATION_UNIT:
				setPagePresentationUnit((PresentationUnit)null);
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
			case ModeldosPackage.PAGE__ROL:
				return rol != ROL_EDEFAULT;
			case ModeldosPackage.PAGE__PAGE_PRESENTATION_UNIT:
				return pagePresentationUnit != null;
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
		result.append(" (rol: ");
		result.append(rol);
		result.append(')');
		return result.toString();
	}

} //PageImpl
