/**
 */
package Modelouno.modeluno.impl;

import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.UpdateAttribute;
import Modelouno.modeluno.ViewUpdateAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelouno.modeluno.impl.UpdateAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.UpdateAttributeImpl#getHasViewUpdateObject <em>Has View Update Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateAttributeImpl extends ServiceImpl implements UpdateAttribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "UpdateAttribute";

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
	 * The cached value of the '{@link #getHasViewUpdateObject() <em>Has View Update Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasViewUpdateObject()
	 * @generated
	 * @ordered
	 */
	protected ViewUpdateAttribute hasViewUpdateObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.UPDATE_ATTRIBUTE;
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
	public ViewUpdateAttribute getHasViewUpdateObject() {
		return hasViewUpdateObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasViewUpdateObject(ViewUpdateAttribute newHasViewUpdateObject, NotificationChain msgs) {
		ViewUpdateAttribute oldHasViewUpdateObject = hasViewUpdateObject;
		hasViewUpdateObject = newHasViewUpdateObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT, oldHasViewUpdateObject, newHasViewUpdateObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasViewUpdateObject(ViewUpdateAttribute newHasViewUpdateObject) {
		if (newHasViewUpdateObject != hasViewUpdateObject) {
			NotificationChain msgs = null;
			if (hasViewUpdateObject != null)
				msgs = ((InternalEObject)hasViewUpdateObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT, null, msgs);
			if (newHasViewUpdateObject != null)
				msgs = ((InternalEObject)newHasViewUpdateObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT, null, msgs);
			msgs = basicSetHasViewUpdateObject(newHasViewUpdateObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT, newHasViewUpdateObject, newHasViewUpdateObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT:
				return basicSetHasViewUpdateObject(null, msgs);
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
			case ModelunoPackage.UPDATE_ATTRIBUTE__NAME:
				return getName();
			case ModelunoPackage.UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT:
				return getHasViewUpdateObject();
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
			case ModelunoPackage.UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT:
				setHasViewUpdateObject((ViewUpdateAttribute)newValue);
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
			case ModelunoPackage.UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT:
				setHasViewUpdateObject((ViewUpdateAttribute)null);
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
			case ModelunoPackage.UPDATE_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelunoPackage.UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT:
				return hasViewUpdateObject != null;
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

} //UpdateAttributeImpl
