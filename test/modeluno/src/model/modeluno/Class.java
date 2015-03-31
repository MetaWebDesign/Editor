/**
 */
package model.modeluno;

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
 *   <li>{@link model.modeluno.Class#getHasRelation <em>Has Relation</em>}</li>
 *   <li>{@link model.modeluno.Class#getR1 <em>R1</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.modeluno.ModelunoPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Relation</b></em>' containment reference list.
	 * The list contents are of type {@link model.modeluno.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relation</em>' containment reference list.
	 * @see model.modeluno.ModelunoPackage#getClass_HasRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getHasRelation();

	/**
	 * Returns the value of the '<em><b>R1</b></em>' reference list.
	 * The list contents are of type {@link model.modeluno.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R1</em>' reference list.
	 * @see model.modeluno.ModelunoPackage#getClass_R1()
	 * @model
	 * @generated
	 */
	EList<Relation> getR1();

} // Class
