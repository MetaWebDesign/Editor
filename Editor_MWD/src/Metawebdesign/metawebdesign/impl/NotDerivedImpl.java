/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.NotDerived;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Derived</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.NotDerivedImpl#getValueDefault <em>Value Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotDerivedImpl extends AttributesImpl implements NotDerived {
	/**
	 * The default value of the '{@link #getValueDefault() <em>Value Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueDefault() <em>Value Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDefault()
	 * @generated
	 * @ordered
	 */
	protected String valueDefault = VALUE_DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotDerivedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.NOT_DERIVED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueDefault() {
		return valueDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDefault(String newValueDefault) {
		String oldValueDefault = valueDefault;
		valueDefault = newValueDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.NOT_DERIVED__VALUE_DEFAULT, oldValueDefault, valueDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetawebdesignPackage.NOT_DERIVED__VALUE_DEFAULT:
				return getValueDefault();
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
			case MetawebdesignPackage.NOT_DERIVED__VALUE_DEFAULT:
				setValueDefault((String)newValue);
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
			case MetawebdesignPackage.NOT_DERIVED__VALUE_DEFAULT:
				setValueDefault(VALUE_DEFAULT_EDEFAULT);
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
			case MetawebdesignPackage.NOT_DERIVED__VALUE_DEFAULT:
				return VALUE_DEFAULT_EDEFAULT == null ? valueDefault != null : !VALUE_DEFAULT_EDEFAULT.equals(valueDefault);
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
		result.append(" (valueDefault: ");
		result.append(valueDefault);
		result.append(')');
		return result.toString();
	}

} //NotDerivedImpl
