/**
 */
package oo_method;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oo_method.ConstraintFormula#isCondition <em>Condition</em>}</li>
 *   <li>{@link oo_method.ConstraintFormula#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see oo_method.Oo_methodPackage#getConstraintFormula()
 * @model
 * @generated
 */
public interface ConstraintFormula extends EObject {
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
	 * @see oo_method.Oo_methodPackage#getConstraintFormula_Condition()
	 * @model
	 * @generated
	 */
	boolean isCondition();

	/**
	 * Sets the value of the '{@link oo_method.ConstraintFormula#isCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isCondition()
	 * @generated
	 */
	void setCondition(boolean value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(String)
	 * @see oo_method.Oo_methodPackage#getConstraintFormula_Error()
	 * @model
	 * @generated
	 */
	String getError();

	/**
	 * Sets the value of the '{@link oo_method.ConstraintFormula#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(String value);

} // ConstraintFormula
