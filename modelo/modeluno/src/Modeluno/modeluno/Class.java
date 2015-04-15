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
 *   <li>{@link Modeluno.modeluno.Class#getR1 <em>R1</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getCname <em>Cname</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getIdFunction <em>Id Function</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getPoseeAtributte <em>Posee Atributte</em>}</li>
 *   <li>{@link Modeluno.modeluno.Class#getEReference0 <em>EReference0</em>}</li>
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
	 * The list contents are of type {@link Modeluno.modeluno.Relation}.
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
	EList<Relation> getHasRelation();

	/**
	 * Returns the value of the '<em><b>R1</b></em>' reference list.
	 * The list contents are of type {@link Modeluno.modeluno.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R1</em>' reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_R1()
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
	 * Returns the value of the '<em><b>Posee Atributte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posee Atributte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posee Atributte</em>' reference.
	 * @see #setPoseeAtributte(RAttribute)
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_PoseeAtributte()
	 * @model
	 * @generated
	 */
	RAttribute getPoseeAtributte();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Class#getPoseeAtributte <em>Posee Atributte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posee Atributte</em>' reference.
	 * @see #getPoseeAtributte()
	 * @generated
	 */
	void setPoseeAtributte(RAttribute value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' containment reference list.
	 * The list contents are of type {@link Modeluno.modeluno.RAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' containment reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_EReference0()
	 * @model containment="true"
	 * @generated
	 */
	EList<RAttribute> getEReference0();

} // Class
