/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.ADerived;
import Modeluno.modeluno.ModelunoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADerived</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.ADerivedImpl#getDerivationComments <em>Derivation Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADerivedImpl extends AtributteImpl implements ADerived {
	/**
	 * The default value of the '{@link #getDerivationComments() <em>Derivation Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationComments()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVATION_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivationComments() <em>Derivation Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationComments()
	 * @generated
	 * @ordered
	 */
	protected String derivationComments = DERIVATION_COMMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADerivedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.ADERIVED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDerivationComments() {
		return derivationComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationComments(String newDerivationComments) {
		String oldDerivationComments = derivationComments;
		derivationComments = newDerivationComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ADERIVED__DERIVATION_COMMENTS, oldDerivationComments, derivationComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelunoPackage.ADERIVED__DERIVATION_COMMENTS:
				return getDerivationComments();
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
			case ModelunoPackage.ADERIVED__DERIVATION_COMMENTS:
				setDerivationComments((String)newValue);
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
			case ModelunoPackage.ADERIVED__DERIVATION_COMMENTS:
				setDerivationComments(DERIVATION_COMMENTS_EDEFAULT);
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
			case ModelunoPackage.ADERIVED__DERIVATION_COMMENTS:
				return DERIVATION_COMMENTS_EDEFAULT == null ? derivationComments != null : !DERIVATION_COMMENTS_EDEFAULT.equals(derivationComments);
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
		result.append(" (derivationComments: ");
		result.append(derivationComments);
		result.append(')');
		return result.toString();
	}

} //ADerivedImpl
