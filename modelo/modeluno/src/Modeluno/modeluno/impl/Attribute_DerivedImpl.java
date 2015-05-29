/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Attribute_Derived;
import Modeluno.modeluno.ModelunoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Derived</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.Attribute_DerivedImpl#getDerivationComments <em>Derivation Comments</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.Attribute_DerivedImpl#isCondition <em>Condition</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.Attribute_DerivedImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.Attribute_DerivedImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Attribute_DerivedImpl extends AttributeImpl implements Attribute_Derived {
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
	 * The default value of the '{@link #isCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONDITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attribute_DerivedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.ATTRIBUTE_DERIVED;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE_DERIVED__DERIVATION_COMMENTS, oldDerivationComments, derivationComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(boolean newCondition) {
		boolean oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE_DERIVED__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE_DERIVED__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE_DERIVED__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelunoPackage.ATTRIBUTE_DERIVED__DERIVATION_COMMENTS:
				return getDerivationComments();
			case ModelunoPackage.ATTRIBUTE_DERIVED__CONDITION:
				return isCondition();
			case ModelunoPackage.ATTRIBUTE_DERIVED__EFFECT:
				return getEffect();
			case ModelunoPackage.ATTRIBUTE_DERIVED__FORMULA:
				return getFormula();
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
			case ModelunoPackage.ATTRIBUTE_DERIVED__DERIVATION_COMMENTS:
				setDerivationComments((String)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE_DERIVED__CONDITION:
				setCondition((Boolean)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE_DERIVED__EFFECT:
				setEffect((String)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE_DERIVED__FORMULA:
				setFormula((String)newValue);
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
			case ModelunoPackage.ATTRIBUTE_DERIVED__DERIVATION_COMMENTS:
				setDerivationComments(DERIVATION_COMMENTS_EDEFAULT);
				return;
			case ModelunoPackage.ATTRIBUTE_DERIVED__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case ModelunoPackage.ATTRIBUTE_DERIVED__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case ModelunoPackage.ATTRIBUTE_DERIVED__FORMULA:
				setFormula(FORMULA_EDEFAULT);
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
			case ModelunoPackage.ATTRIBUTE_DERIVED__DERIVATION_COMMENTS:
				return DERIVATION_COMMENTS_EDEFAULT == null ? derivationComments != null : !DERIVATION_COMMENTS_EDEFAULT.equals(derivationComments);
			case ModelunoPackage.ATTRIBUTE_DERIVED__CONDITION:
				return condition != CONDITION_EDEFAULT;
			case ModelunoPackage.ATTRIBUTE_DERIVED__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case ModelunoPackage.ATTRIBUTE_DERIVED__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
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
		result.append(", Condition: ");
		result.append(condition);
		result.append(", Effect: ");
		result.append(effect);
		result.append(", Formula: ");
		result.append(formula);
		result.append(')');
		return result.toString();
	}

} //Attribute_DerivedImpl
