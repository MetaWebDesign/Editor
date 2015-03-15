/**
 */
package metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oo_method.Precondition#getPreconditionComments <em>Precondition Comments</em>}</li>
 *   <li>{@link oo_method.Precondition#getPreFormulas <em>Pre Formulas</em>}</li>
 * </ul>
 * </p>
 *
 * @see oo_method.Oo_methodPackage#getPrecondition()
 * @model
 * @generated
 */
public interface Precondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Precondition Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition Comments</em>' attribute.
	 * @see #setPreconditionComments(String)
	 * @see oo_method.Oo_methodPackage#getPrecondition_PreconditionComments()
	 * @model
	 * @generated
	 */
	String getPreconditionComments();

	/**
	 * Sets the value of the '{@link oo_method.Precondition#getPreconditionComments <em>Precondition Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition Comments</em>' attribute.
	 * @see #getPreconditionComments()
	 * @generated
	 */
	void setPreconditionComments(String value);

	/**
	 * Returns the value of the '<em><b>Pre Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link oo_method.PreconditionFormula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Formulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Formulas</em>' containment reference list.
	 * @see oo_method.Oo_methodPackage#getPrecondition_PreFormulas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PreconditionFormula> getPreFormulas();

} // Precondition
