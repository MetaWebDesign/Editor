/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Admin;
import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.ViewAdmin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.AdminImpl#getName <em>Name</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.AdminImpl#getHasViewAdmin <em>Has View Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdminImpl extends ServiceImpl implements Admin {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Admin";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasViewAdmin() <em>Has View Admin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasViewAdmin()
	 * @generated
	 * @ordered
	 */
	protected ViewAdmin hasViewAdmin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAdmin getHasViewAdmin() {
		return hasViewAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasViewAdmin(ViewAdmin newHasViewAdmin, NotificationChain msgs) {
		ViewAdmin oldHasViewAdmin = hasViewAdmin;
		hasViewAdmin = newHasViewAdmin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.ADMIN__HAS_VIEW_ADMIN, oldHasViewAdmin, newHasViewAdmin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasViewAdmin(ViewAdmin newHasViewAdmin) {
		if (newHasViewAdmin != hasViewAdmin) {
			NotificationChain msgs = null;
			if (hasViewAdmin != null)
				msgs = ((InternalEObject)hasViewAdmin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.ADMIN__HAS_VIEW_ADMIN, null, msgs);
			if (newHasViewAdmin != null)
				msgs = ((InternalEObject)newHasViewAdmin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.ADMIN__HAS_VIEW_ADMIN, null, msgs);
			msgs = basicSetHasViewAdmin(newHasViewAdmin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ADMIN__HAS_VIEW_ADMIN, newHasViewAdmin, newHasViewAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.ADMIN__HAS_VIEW_ADMIN:
				return basicSetHasViewAdmin(null, msgs);
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
			case ModelunoPackage.ADMIN__NAME:
				return getName();
			case ModelunoPackage.ADMIN__HAS_VIEW_ADMIN:
				return getHasViewAdmin();
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
			case ModelunoPackage.ADMIN__HAS_VIEW_ADMIN:
				setHasViewAdmin((ViewAdmin)newValue);
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
			case ModelunoPackage.ADMIN__HAS_VIEW_ADMIN:
				setHasViewAdmin((ViewAdmin)null);
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
			case ModelunoPackage.ADMIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelunoPackage.ADMIN__HAS_VIEW_ADMIN:
				return hasViewAdmin != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AdminImpl
