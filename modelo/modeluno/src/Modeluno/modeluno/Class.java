/**
 */
package Modeluno.modeluno;

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
 *   <li>{@link Modeluno.modeluno.Class#getHasRelation <em>Has Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getGoRelation <em>Go Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getCname <em>Cname</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getIdFunction <em>Id Function</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getGoAtributteRelation <em>Go Atributte Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getHasAtributeRelation <em>Has Atribute Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getHasServiceRelation <em>Has Service Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getGoServiceRelation <em>Go Service Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Modeluno.modeluno.RelationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relation</em>' containment reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_HasRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationClass> getHasRelation();

	/**
	 * Returns the value of the '<em><b>Go Relation</b></em>' reference list.
	 * The list contents are of type {@link Modeluno.modeluno.RelationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Relation</em>' reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_GoRelation()
	 * @model
	 * @generated
	 */
	EList<RelationClass> getGoRelation();

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
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_Cname()
	 * @model
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Class#getCname <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cname</em>' attribute.
	 * @see #getCname()
	 * @generated
	 */
	void setCname(String value);

	/**
	 * Returns the value of the '<em><b>Id Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Function</em>' attribute.
	 * @see #setIdFunction(String)
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_IdFunction()
	 * @model
	 * @generated
	 */
	String getIdFunction();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Class#getIdFunction <em>Id Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Function</em>' attribute.
	 * @see #getIdFunction()
	 * @generated
	 */
	void setIdFunction(String value);

	/**
	 * Returns the value of the '<em><b>Go Atributte Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Atributte Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Atributte Relation</em>' reference.
	 * @see #setGoAtributteRelation(RelationAttribute)
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_GoAtributteRelation()
	 * @model
	 * @generated
	 */
	RelationAttribute getGoAtributteRelation();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Class#getGoAtributteRelation <em>Go Atributte Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Atributte Relation</em>' reference.
	 * @see #getGoAtributteRelation()
	 * @generated
	 */
	void setGoAtributteRelation(RelationAttribute value);

	/**
	 * Returns the value of the '<em><b>Has Atribute Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Modeluno.modeluno.RelationAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atribute Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atribute Relation</em>' containment reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_HasAtributeRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationAttribute> getHasAtributeRelation();

	/**
	 * Returns the value of the '<em><b>Has Service Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Modeluno.modeluno.RelationService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Service Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Service Relation</em>' containment reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_HasServiceRelation()
	 * @model containment="true" upper="7"
	 * @generated
	 */
	EList<RelationService> getHasServiceRelation();

	/**
	 * Returns the value of the '<em><b>Go Service Relation</b></em>' reference list.
	 * The list contents are of type {@link Modeluno.modeluno.RelationService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Service Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Service Relation</em>' reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_GoServiceRelation()
	 * @model upper="7"
	 * @generated
	 */
	EList<RelationService> getGoServiceRelation();

} // Class
