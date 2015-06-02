/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.View;
import Modeluno.modeluno.ViewAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ViewImpl#getHasViewAttribute <em>Has View Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends ServiceImpl implements View {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "View";

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
	 * The cached value of the '{@link #getHasViewAttribute() <em>Has View Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasViewAttribute()
	 * @generated
	 * @ordered
	 */
	protected ViewAttribute hasViewAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.VIEW;
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
	public ViewAttribute getHasViewAttribute() {
		return hasViewAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasViewAttribute(ViewAttribute newHasViewAttribute, NotificationChain msgs) {
		ViewAttribute oldHasViewAttribute = hasViewAttribute;
		hasViewAttribute = newHasViewAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.VIEW__HAS_VIEW_ATTRIBUTE, oldHasViewAttribute, newHasViewAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasViewAttribute(ViewAttribute newHasViewAttribute) {
		if (newHasViewAttribute != hasViewAttribute) {
			NotificationChain msgs = null;
			if (hasViewAttribute != null)
				msgs = ((InternalEObject)hasViewAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.VIEW__HAS_VIEW_ATTRIBUTE, null, msgs);
			if (newHasViewAttribute != null)
				msgs = ((InternalEObject)newHasViewAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.VIEW__HAS_VIEW_ATTRIBUTE, null, msgs);
			msgs = basicSetHasViewAttribute(newHasViewAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.VIEW__HAS_VIEW_ATTRIBUTE, newHasViewAttribute, newHasViewAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.VIEW__HAS_VIEW_ATTRIBUTE:
				return basicSetHasViewAttribute(null, msgs);
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
			case ModelunoPackage.VIEW__NAME:
				return getName();
			case ModelunoPackage.VIEW__HAS_VIEW_ATTRIBUTE:
				return getHasViewAttribute();
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
			case ModelunoPackage.VIEW__HAS_VIEW_ATTRIBUTE:
				setHasViewAttribute((ViewAttribute)newValue);
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
			case ModelunoPackage.VIEW__HAS_VIEW_ATTRIBUTE:
				setHasViewAttribute((ViewAttribute)null);
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
			case ModelunoPackage.VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelunoPackage.VIEW__HAS_VIEW_ATTRIBUTE:
				return hasViewAttribute != null;
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

} //ViewImpl
