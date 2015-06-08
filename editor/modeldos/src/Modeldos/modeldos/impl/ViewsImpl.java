/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.Views;
import Modeldos.modeldos.group;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.ViewsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ViewsImpl#getViewGroup <em>View Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewsImpl extends MinimalEObjectImpl.Container implements Views {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewGroup() <em>View Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewGroup()
	 * @generated
	 * @ordered
	 */
	protected group viewGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.VIEWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.VIEWS__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public group getViewGroup() {
		return viewGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewGroup(group newViewGroup, NotificationChain msgs) {
		group oldViewGroup = viewGroup;
		viewGroup = newViewGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeldosPackage.VIEWS__VIEW_GROUP, oldViewGroup, newViewGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewGroup(group newViewGroup) {
		if (newViewGroup != viewGroup) {
			NotificationChain msgs = null;
			if (viewGroup != null)
				msgs = ((InternalEObject)viewGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.VIEWS__VIEW_GROUP, null, msgs);
			if (newViewGroup != null)
				msgs = ((InternalEObject)newViewGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModeldosPackage.VIEWS__VIEW_GROUP, null, msgs);
			msgs = basicSetViewGroup(newViewGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.VIEWS__VIEW_GROUP, newViewGroup, newViewGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.VIEWS__VIEW_GROUP:
				return basicSetViewGroup(null, msgs);
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
			case ModeldosPackage.VIEWS__TITLE:
				return getTitle();
			case ModeldosPackage.VIEWS__VIEW_GROUP:
				return getViewGroup();
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
			case ModeldosPackage.VIEWS__TITLE:
				setTitle((String)newValue);
				return;
			case ModeldosPackage.VIEWS__VIEW_GROUP:
				setViewGroup((group)newValue);
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
			case ModeldosPackage.VIEWS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ModeldosPackage.VIEWS__VIEW_GROUP:
				setViewGroup((group)null);
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
			case ModeldosPackage.VIEWS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ModeldosPackage.VIEWS__VIEW_GROUP:
				return viewGroup != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ViewsImpl
