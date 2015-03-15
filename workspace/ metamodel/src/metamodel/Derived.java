/**
 */
package metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oo_method.Derived#getDerFormulas <em>Der Formulas</em>}</li>
 *   <li>{@link oo_method.Derived#getDerivationComments <em>Derivation Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see oo_method.Oo_methodPackage#getDerived()
 * @model
 * @generated
 */
public interface Derived extends Attribute {
	/**
	 * Returns the value of the '<em><b>Der Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link oo_method.DerivationFormula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Der Formulas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Der Formulas</em>' containment reference list.
	 * @see oo_method.Oo_methodPackage#getDerived_DerFormulas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DerivationFormula> getDerFormulas();

	/**
	 * Returns the value of the '<em><b>Derivation Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Comments</em>' attribute.
	 * @see #setDerivationComments(String)
	 * @see oo_method.Oo_methodPackage#getDerived_DerivationComments()
	 * @model
	 * @generated
	 */
	String getDerivationComments();

	/**
	 * Sets the value of the '{@link oo_method.Derived#getDerivationComments <em>Derivation Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Comments</em>' attribute.
	 * @see #getDerivationComments()
	 * @generated
	 */
	void setDerivationComments(String value);

} // Derived
