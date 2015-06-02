/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.RelationView;
import Modeluno.modeluno.Views;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.RelationViewImpl#getRhasView <em>Rhas View</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.RelationViewImpl#getGoToView <em>Go To View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationViewImpl extends MinimalEObjectImpl.Container implements RelationView {
	/**
	 * The cached value of the '{@link #getRhasView() <em>Rhas View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhasView()
	 * @generated
	 * @ordered
	 */
	protected Views rhasView;

	/**
	 * The cached value of the '{@link #getGoToView() <em>Go To View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoToView()
	 * @generated
	 * @ordered
	 */
	protected Views goToView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.RELATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views getRhasView() {
		return rhasView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhasView(Views newRhasView, NotificationChain msgs) {
		Views oldRhasView = rhasView;
		rhasView = newRhasView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.RELATION_VIEW__RHAS_VIEW, oldRhasView, newRhasView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhasView(Views newRhasView) {
		if (newRhasView != rhasView) {
			NotificationChain msgs = null;
			if (rhasView != null)
				msgs = ((InternalEObject)rhasView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.RELATION_VIEW__RHAS_VIEW, null, msgs);
			if (newRhasView != null)
				msgs = ((InternalEObject)newRhasView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.RELATION_VIEW__RHAS_VIEW, null, msgs);
			msgs = basicSetRhasView(newRhasView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.RELATION_VIEW__RHAS_VIEW, newRhasView, newRhasView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views getGoToView() {
		if (goToView != null && goToView.eIsProxy()) {
			InternalEObject oldGoToView = (InternalEObject)goToView;
			goToView = (Views)eResolveProxy(oldGoToView);
			if (goToView != oldGoToView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.RELATION_VIEW__GO_TO_VIEW, oldGoToView, goToView));
			}
		}
		return goToView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views basicGetGoToView() {
		return goToView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoToView(Views newGoToView) {
		Views oldGoToView = goToView;
		goToView = newGoToView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.RELATION_VIEW__GO_TO_VIEW, oldGoToView, goToView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.RELATION_VIEW__RHAS_VIEW:
				return basicSetRhasView(null, msgs);
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
			case ModelunoPackage.RELATION_VIEW__RHAS_VIEW:
				return getRhasView();
			case ModelunoPackage.RELATION_VIEW__GO_TO_VIEW:
				if (resolve) return getGoToView();
				return basicGetGoToView();
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
			case ModelunoPackage.RELATION_VIEW__RHAS_VIEW:
				setRhasView((Views)newValue);
				return;
			case ModelunoPackage.RELATION_VIEW__GO_TO_VIEW:
				setGoToView((Views)newValue);
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
			case ModelunoPackage.RELATION_VIEW__RHAS_VIEW:
				setRhasView((Views)null);
				return;
			case ModelunoPackage.RELATION_VIEW__GO_TO_VIEW:
				setGoToView((Views)null);
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
			case ModelunoPackage.RELATION_VIEW__RHAS_VIEW:
				return rhasView != null;
			case ModelunoPackage.RELATION_VIEW__GO_TO_VIEW:
				return goToView != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationViewImpl
