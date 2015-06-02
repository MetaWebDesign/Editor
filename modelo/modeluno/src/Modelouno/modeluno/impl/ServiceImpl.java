/**
 */
package Modelouno.modeluno.impl;

import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.Relation_View;
import Modelouno.modeluno.Rol;
import Modelouno.modeluno.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelouno.modeluno.impl.ServiceImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.ServiceImpl#getHasRelationView <em>Has Relation View</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.ServiceImpl#getGoToRelationView <em>Go To Relation View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected static final Rol ROL_EDEFAULT = Rol.ANONYMOUS;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected Rol rol = ROL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasRelationView() <em>Has Relation View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelationView()
	 * @generated
	 * @ordered
	 */
	protected Relation_View hasRelationView;

	/**
	 * The cached value of the '{@link #getGoToRelationView() <em>Go To Relation View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoToRelationView()
	 * @generated
	 * @ordered
	 */
	protected Relation_View goToRelationView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rol getRol() {
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRol(Rol newRol) {
		Rol oldRol = rol;
		rol = newRol == null ? ROL_EDEFAULT : newRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.SERVICE__ROL, oldRol, rol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation_View getHasRelationView() {
		return hasRelationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasRelationView(Relation_View newHasRelationView, NotificationChain msgs) {
		Relation_View oldHasRelationView = hasRelationView;
		hasRelationView = newHasRelationView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.SERVICE__HAS_RELATION_VIEW, oldHasRelationView, newHasRelationView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRelationView(Relation_View newHasRelationView) {
		if (newHasRelationView != hasRelationView) {
			NotificationChain msgs = null;
			if (hasRelationView != null)
				msgs = ((InternalEObject)hasRelationView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.SERVICE__HAS_RELATION_VIEW, null, msgs);
			if (newHasRelationView != null)
				msgs = ((InternalEObject)newHasRelationView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.SERVICE__HAS_RELATION_VIEW, null, msgs);
			msgs = basicSetHasRelationView(newHasRelationView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.SERVICE__HAS_RELATION_VIEW, newHasRelationView, newHasRelationView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation_View getGoToRelationView() {
		if (goToRelationView != null && goToRelationView.eIsProxy()) {
			InternalEObject oldGoToRelationView = (InternalEObject)goToRelationView;
			goToRelationView = (Relation_View)eResolveProxy(oldGoToRelationView);
			if (goToRelationView != oldGoToRelationView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.SERVICE__GO_TO_RELATION_VIEW, oldGoToRelationView, goToRelationView));
			}
		}
		return goToRelationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation_View basicGetGoToRelationView() {
		return goToRelationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoToRelationView(Relation_View newGoToRelationView) {
		Relation_View oldGoToRelationView = goToRelationView;
		goToRelationView = newGoToRelationView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.SERVICE__GO_TO_RELATION_VIEW, oldGoToRelationView, goToRelationView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.SERVICE__HAS_RELATION_VIEW:
				return basicSetHasRelationView(null, msgs);
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
			case ModelunoPackage.SERVICE__ROL:
				return getRol();
			case ModelunoPackage.SERVICE__HAS_RELATION_VIEW:
				return getHasRelationView();
			case ModelunoPackage.SERVICE__GO_TO_RELATION_VIEW:
				if (resolve) return getGoToRelationView();
				return basicGetGoToRelationView();
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
			case ModelunoPackage.SERVICE__ROL:
				setRol((Rol)newValue);
				return;
			case ModelunoPackage.SERVICE__HAS_RELATION_VIEW:
				setHasRelationView((Relation_View)newValue);
				return;
			case ModelunoPackage.SERVICE__GO_TO_RELATION_VIEW:
				setGoToRelationView((Relation_View)newValue);
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
			case ModelunoPackage.SERVICE__ROL:
				setRol(ROL_EDEFAULT);
				return;
			case ModelunoPackage.SERVICE__HAS_RELATION_VIEW:
				setHasRelationView((Relation_View)null);
				return;
			case ModelunoPackage.SERVICE__GO_TO_RELATION_VIEW:
				setGoToRelationView((Relation_View)null);
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
			case ModelunoPackage.SERVICE__ROL:
				return rol != ROL_EDEFAULT;
			case ModelunoPackage.SERVICE__HAS_RELATION_VIEW:
				return hasRelationView != null;
			case ModelunoPackage.SERVICE__GO_TO_RELATION_VIEW:
				return goToRelationView != null;
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

} //ServiceImpl
