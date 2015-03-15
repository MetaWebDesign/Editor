/**
 */
package Oo_method.oo_method.impl;

import Oo_method.oo_method.DerivationFormula;
import Oo_method.oo_method.Derived;
import Oo_method.oo_method.Oo_methodPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Oo_method.oo_method.impl.DerivedImpl#getDerFormulas <em>Der Formulas</em>}</li>
 *   <li>{@link Oo_method.oo_method.impl.DerivedImpl#getDerivationComments <em>Derivation Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedImpl extends AttributeImpl implements Derived {
	/**
	 * The cached value of the '{@link #getDerFormulas() <em>Der Formulas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerFormulas()
	 * @generated
	 * @ordered
	 */
	protected EList<DerivationFormula> derFormulas;

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
	protected DerivedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oo_methodPackage.Literals.DERIVED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DerivationFormula> getDerFormulas() {
		if (derFormulas == null) {
			derFormulas = new EObjectContainmentEList<DerivationFormula>(DerivationFormula.class, this, Oo_methodPackage.DERIVED__DER_FORMULAS);
		}
		return derFormulas;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Oo_methodPackage.DERIVED__DERIVATION_COMMENTS, oldDerivationComments, derivationComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Oo_methodPackage.DERIVED__DER_FORMULAS:
				return ((InternalEList<?>)getDerFormulas()).basicRemove(otherEnd, msgs);
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
			case Oo_methodPackage.DERIVED__DER_FORMULAS:
				return getDerFormulas();
			case Oo_methodPackage.DERIVED__DERIVATION_COMMENTS:
				return getDerivationComments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Oo_methodPackage.DERIVED__DER_FORMULAS:
				getDerFormulas().clear();
				getDerFormulas().addAll((Collection<? extends DerivationFormula>)newValue);
				return;
			case Oo_methodPackage.DERIVED__DERIVATION_COMMENTS:
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
			case Oo_methodPackage.DERIVED__DER_FORMULAS:
				getDerFormulas().clear();
				return;
			case Oo_methodPackage.DERIVED__DERIVATION_COMMENTS:
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
			case Oo_methodPackage.DERIVED__DER_FORMULAS:
				return derFormulas != null && !derFormulas.isEmpty();
			case Oo_methodPackage.DERIVED__DERIVATION_COMMENTS:
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

} //DerivedImpl
