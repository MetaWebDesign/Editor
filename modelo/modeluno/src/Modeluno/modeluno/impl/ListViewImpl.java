/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.ListView;
import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.ViewIndex;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.ListViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ListViewImpl#getHasViewIndex <em>Has View Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListViewImpl extends ServiceImpl implements ListView {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "ListView";

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
	 * The cached value of the '{@link #getHasViewIndex() <em>Has View Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasViewIndex()
	 * @generated
	 * @ordered
	 */
	protected ViewIndex hasViewIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.LIST_VIEW;
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
	public ViewIndex getHasViewIndex() {
		return hasViewIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasViewIndex(ViewIndex newHasViewIndex, NotificationChain msgs) {
		ViewIndex oldHasViewIndex = hasViewIndex;
		hasViewIndex = newHasViewIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.LIST_VIEW__HAS_VIEW_INDEX, oldHasViewIndex, newHasViewIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasViewIndex(ViewIndex newHasViewIndex) {
		if (newHasViewIndex != hasViewIndex) {
			NotificationChain msgs = null;
			if (hasViewIndex != null)
				msgs = ((InternalEObject)hasViewIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.LIST_VIEW__HAS_VIEW_INDEX, null, msgs);
			if (newHasViewIndex != null)
				msgs = ((InternalEObject)newHasViewIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.LIST_VIEW__HAS_VIEW_INDEX, null, msgs);
			msgs = basicSetHasViewIndex(newHasViewIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.LIST_VIEW__HAS_VIEW_INDEX, newHasViewIndex, newHasViewIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.LIST_VIEW__HAS_VIEW_INDEX:
				return basicSetHasViewIndex(null, msgs);
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
			case ModelunoPackage.LIST_VIEW__NAME:
				return getName();
			case ModelunoPackage.LIST_VIEW__HAS_VIEW_INDEX:
				return getHasViewIndex();
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
			case ModelunoPackage.LIST_VIEW__HAS_VIEW_INDEX:
				setHasViewIndex((ViewIndex)newValue);
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
			case ModelunoPackage.LIST_VIEW__HAS_VIEW_INDEX:
				setHasViewIndex((ViewIndex)null);
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
			case ModelunoPackage.LIST_VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelunoPackage.LIST_VIEW__HAS_VIEW_INDEX:
				return hasViewIndex != null;
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

} //ListViewImpl
