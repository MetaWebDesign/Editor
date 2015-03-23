/**
 */
package modelo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.Class#getHasRelaction <em>Has Relaction</em>}</li>
 *   <li>{@link modelo.Class#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Relaction</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relaction</em>' containment reference list.
	 * @see modelo.ModeloPackage#getClass_HasRelaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getHasRelaction();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link modelo.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see modelo.ModeloPackage#getClass_From()
	 * @model
	 * @generated
	 */
	EList<Relation> getFrom();

} // Class
