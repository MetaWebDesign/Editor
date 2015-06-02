/**
 */
package Modelouno.modeluno.impl;

import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.Relation_Service;
import Modelouno.modeluno.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelouno.modeluno.impl.Relation_ServiceImpl#getRhasService <em>Rhas Service</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.Relation_ServiceImpl#getGoService <em>Go Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Relation_ServiceImpl extends MinimalEObjectImpl.Container implements Relation_Service {
	/**
	 * The cached value of the '{@link #getRhasService() <em>Rhas Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhasService()
	 * @generated
	 * @ordered
	 */
	protected Service rhasService;

	/**
	 * The cached value of the '{@link #getGoService() <em>Go Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoService()
	 * @generated
	 * @ordered
	 */
	protected Service goService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Relation_ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.RELATION_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getRhasService() {
		return rhasService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhasService(Service newRhasService, NotificationChain msgs) {
		Service oldRhasService = rhasService;
		rhasService = newRhasService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.RELATION_SERVICE__RHAS_SERVICE, oldRhasService, newRhasService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhasService(Service newRhasService) {
		if (newRhasService != rhasService) {
			NotificationChain msgs = null;
			if (rhasService != null)
				msgs = ((InternalEObject)rhasService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.RELATION_SERVICE__RHAS_SERVICE, null, msgs);
			if (newRhasService != null)
				msgs = ((InternalEObject)newRhasService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.RELATION_SERVICE__RHAS_SERVICE, null, msgs);
			msgs = basicSetRhasService(newRhasService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.RELATION_SERVICE__RHAS_SERVICE, newRhasService, newRhasService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getGoService() {
		if (goService != null && goService.eIsProxy()) {
			InternalEObject oldGoService = (InternalEObject)goService;
			goService = (Service)eResolveProxy(oldGoService);
			if (goService != oldGoService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.RELATION_SERVICE__GO_SERVICE, oldGoService, goService));
			}
		}
		return goService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetGoService() {
		return goService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoService(Service newGoService) {
		Service oldGoService = goService;
		goService = newGoService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.RELATION_SERVICE__GO_SERVICE, oldGoService, goService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.RELATION_SERVICE__RHAS_SERVICE:
				return basicSetRhasService(null, msgs);
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
			case ModelunoPackage.RELATION_SERVICE__RHAS_SERVICE:
				return getRhasService();
			case ModelunoPackage.RELATION_SERVICE__GO_SERVICE:
				if (resolve) return getGoService();
				return basicGetGoService();
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
			case ModelunoPackage.RELATION_SERVICE__RHAS_SERVICE:
				setRhasService((Service)newValue);
				return;
			case ModelunoPackage.RELATION_SERVICE__GO_SERVICE:
				setGoService((Service)newValue);
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
			case ModelunoPackage.RELATION_SERVICE__RHAS_SERVICE:
				setRhasService((Service)null);
				return;
			case ModelunoPackage.RELATION_SERVICE__GO_SERVICE:
				setGoService((Service)null);
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
			case ModelunoPackage.RELATION_SERVICE__RHAS_SERVICE:
				return rhasService != null;
			case ModelunoPackage.RELATION_SERVICE__GO_SERVICE:
				return goService != null;
		}
		return super.eIsSet(featureID);
	}

} //Relation_ServiceImpl
