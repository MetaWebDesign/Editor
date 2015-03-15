/**
 */
package Oo_method.oo_method;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Oo_method.oo_method.Constraints#getConstraintComments <em>Constraint Comments</em>}</li>
 *   <li>{@link Oo_method.oo_method.Constraints#getConstFormulas <em>Const Formulas</em>}</li>
 * </ul>
 * </p>
 *
 * @see Oo_method.oo_method.Oo_methodPackage#getConstraints()
 * @model
 * @generated
 */
public interface Constraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Comments</em>' attribute.
	 * @see #setConstraintComments(String)
	 * @see Oo_method.oo_method.Oo_methodPackage#getConstraints_ConstraintComments()
	 * @model
	 * @generated
	 */
	String getConstraintComments();

	/**
	 * Sets the value of the '{@link Oo_method.oo_method.Constraints#getConstraintComments <em>Constraint Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Comments</em>' attribute.
	 * @see #getConstraintComments()
	 * @generated
	 */
	void setConstraintComments(String value);

	/**
	 * Returns the value of the '<em><b>Const Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link Oo_method.oo_method.ConstraintFormula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const Formulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Formulas</em>' containment reference list.
	 * @see Oo_method.oo_method.Oo_methodPackage#getConstraints_ConstFormulas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConstraintFormula> getConstFormulas();

} // Constraints
