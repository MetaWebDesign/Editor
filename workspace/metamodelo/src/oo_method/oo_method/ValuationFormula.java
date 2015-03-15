/**
 */
package oo_method.oo_method;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valuation Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oo_method.oo_method.ValuationFormula#isCondition <em>Condition</em>}</li>
 *   <li>{@link oo_method.oo_method.ValuationFormula#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see oo_method.oo_method.Oo_methodPackage#getValuationFormula()
 * @model
 * @generated
 */
public interface ValuationFormula extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(boolean)
	 * @see oo_method.oo_method.Oo_methodPackage#getValuationFormula_Condition()
	 * @model
	 * @generated
	 */
	boolean isCondition();

	/**
	 * Sets the value of the '{@link oo_method.oo_method.ValuationFormula#isCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isCondition()
	 * @generated
	 */
	void setCondition(boolean value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see oo_method.oo_method.Oo_methodPackage#getValuationFormula_Effect()
	 * @model
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link oo_method.oo_method.ValuationFormula#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

} // ValuationFormula
