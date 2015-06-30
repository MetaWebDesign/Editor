/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.LinkView;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.Views;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.LinkViewImpl#getLinkView <em>Link View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkViewImpl extends LinkImpl implements LinkView {
	/**
	 * The cached value of the '{@link #getLinkView() <em>Link View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkView()
	 * @generated
	 * @ordered
	 */
	protected Views linkView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.LINK_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views getLinkView() {
		if (linkView != null && linkView.eIsProxy()) {
			InternalEObject oldLinkView = (InternalEObject)linkView;
			linkView = (Views)eResolveProxy(oldLinkView);
			if (linkView != oldLinkView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.LINK_VIEW__LINK_VIEW, oldLinkView, linkView));
			}
		}
		return linkView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views basicGetLinkView() {
		return linkView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkView(Views newLinkView) {
		Views oldLinkView = linkView;
		linkView = newLinkView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.LINK_VIEW__LINK_VIEW, oldLinkView, linkView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetawebdesignPackage.LINK_VIEW__LINK_VIEW:
				if (resolve) return getLinkView();
				return basicGetLinkView();
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
			case MetawebdesignPackage.LINK_VIEW__LINK_VIEW:
				setLinkView((Views)newValue);
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
			case MetawebdesignPackage.LINK_VIEW__LINK_VIEW:
				setLinkView((Views)null);
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
			case MetawebdesignPackage.LINK_VIEW__LINK_VIEW:
				return linkView != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkViewImpl
