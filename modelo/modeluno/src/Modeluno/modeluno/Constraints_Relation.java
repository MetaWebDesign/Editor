/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.Constraints_Relation#getGoConstraints <em>Go Constraints</em>}</li>
 *   <li>{@link Modeluno.modeluno.Constraints_Relation#getHasConstraints <em>Has Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getConstraints_Relation()
 * @model
 * @generated
 */
public interface Constraints_Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Go Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Constraints</em>' containment reference.
	 * @see #setGoConstraints(Constraints)
	 * @see Modeluno.modeluno.ModelunoPackage#getConstraints_Relation_GoConstraints()
	 * @model containment="true"
	 * @generated
	 */
	Constraints getGoConstraints();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Constraints_Relation#getGoConstraints <em>Go Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Constraints</em>' containment reference.
	 * @see #getGoConstraints()
	 * @generated
	 */
	void setGoConstraints(Constraints value);

	/**
	 * Returns the value of the '<em><b>Has Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Constraints</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Constraints</em>' reference.
	 * @see #setHasConstraints(Constraints)
	 * @see Modeluno.modeluno.ModelunoPackage#getConstraints_Relation_HasConstraints()
	 * @model
	 * @generated
	 */
	Constraints getHasConstraints();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Constraints_Relation#getHasConstraints <em>Has Constraints</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Constraints</em>' reference.
	 * @see #getHasConstraints()
	 * @generated
	 */
	void setHasConstraints(Constraints value);

} // Constraints_Relation
