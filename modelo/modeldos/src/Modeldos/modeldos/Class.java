/**
 */
package Modeldos.modeldos;

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
 *   <li>{@link Modeldos.modeldos.Class#getHasRelation <em>Has Relation</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getR1 <em>R1</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getCname <em>Cname</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getHasAtribute <em>Has Atribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relation</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_HasRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getHasRelation();

	/**
	 * Returns the value of the '<em><b>R1</b></em>' reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R1</em>' reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_R1()
	 * @model
	 * @generated
	 */
	EList<Relation> getR1();

	/**
	 * Returns the value of the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cname</em>' attribute.
	 * @see #setCname(String)
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_Cname()
	 * @model
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getCname <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cname</em>' attribute.
	 * @see #getCname()
	 * @generated
	 */
	void setCname(String value);

	/**
	 * Returns the value of the '<em><b>Has Atribute</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Atributte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atribute</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_HasAtribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributte> getHasAtribute();

} // Class
