/**
 */
package Modelouno.modeluno;

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
 *   <li>{@link Modelouno.modeluno.Class#getHasRelation <em>Has Relation</em>}</li>
 *   <li>{@link Modelouno.modeluno.Class#getGoRelation <em>Go Relation</em>}</li>
 *   <li>{@link Modelouno.modeluno.Class#getCname <em>Cname</em>}</li>
 *   <li>{@link Modelouno.modeluno.Class#getIdFunction <em>Id Function</em>}</li>
 *   <li>{@link Modelouno.modeluno.Class#getGoAtributteRelation <em>Go Atributte Relation</em>}</li>
 *   <li>{@link Modelouno.modeluno.Class#getHasAtributeRelation <em>Has Atribute Relation</em>}</li>
 *   <li>{@link Modelouno.modeluno.Class#getHasServiceRelation <em>Has Service Relation</em>}</li>
 *   <li>{@link Modelouno.modeluno.Class#getGoServiceRelation <em>Go Service Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelouno.modeluno.ModelunoPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Modelouno.modeluno.Relation_Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relation</em>' containment reference list.
	 * @see Modelouno.modeluno.ModelunoPackage#getClass_HasRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation_Class> getHasRelation();

	/**
	 * Returns the value of the '<em><b>Go Relation</b></em>' reference list.
	 * The list contents are of type {@link Modelouno.modeluno.Relation_Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Relation</em>' reference list.
	 * @see Modelouno.modeluno.ModelunoPackage#getClass_GoRelation()
	 * @model
	 * @generated
	 */
	EList<Relation_Class> getGoRelation();

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
	 * @see Modelouno.modeluno.ModelunoPackage#getClass_Cname()
	 * @model
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Class#getCname <em>Cname</em>}' attribute.
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
	 * @see Modelouno.modeluno.ModelunoPackage#getClass_IdFunction()
	 * @model
	 * @generated
	 */
	String getIdFunction();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Class#getIdFunction <em>Id Function</em>}' attribute.
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
	 * @see #setGoAtributteRelation(Relation_Attribute)
	 * @see Modelouno.modeluno.ModelunoPackage#getClass_GoAtributteRelation()
	 * @model
	 * @generated
	 */
	Relation_Attribute getGoAtributteRelation();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Class#getGoAtributteRelation <em>Go Atributte Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Atributte Relation</em>' reference.
	 * @see #getGoAtributteRelation()
	 * @generated
	 */
	void setGoAtributteRelation(Relation_Attribute value);

	/**
	 * Returns the value of the '<em><b>Has Atribute Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Modelouno.modeluno.Relation_Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atribute Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atribute Relation</em>' containment reference list.
	 * @see Modelouno.modeluno.ModelunoPackage#getClass_HasAtributeRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation_Attribute> getHasAtributeRelation();

	/**
	 * Returns the value of the '<em><b>Has Service Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Modelouno.modeluno.Relation_Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Service Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Service Relation</em>' containment reference list.
	 * @see Modelouno.modeluno.ModelunoPackage#getClass_HasServiceRelation()
	 * @model containment="true" upper="7"
	 * @generated
	 */
	EList<Relation_Service> getHasServiceRelation();

	/**
	 * Returns the value of the '<em><b>Go Service Relation</b></em>' reference list.
	 * The list contents are of type {@link Modelouno.modeluno.Relation_Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Service Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Service Relation</em>' reference list.
	 * @see Modelouno.modeluno.ModelunoPackage#getClass_GoServiceRelation()
	 * @model upper="7"
	 * @generated
	 */
	EList<Relation_Service> getGoServiceRelation();

} // Class
