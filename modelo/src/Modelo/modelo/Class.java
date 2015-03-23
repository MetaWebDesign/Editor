/**
 */
package Modelo.modelo;

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
 *   <li>{@link Modelo.modelo.Class#getHasRelaction <em>Has Relaction</em>}</li>
 *   <li>{@link Modelo.modelo.Class#getFrom <em>From</em>}</li>
 *   <li>{@link Modelo.modelo.Class#getName <em>Name</em>}</li>
 *   <li>{@link Modelo.modelo.Class#getHasAttribute <em>Has Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelo.modelo.ModeloPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Relaction</b></em>' containment reference list.
	 * The list contents are of type {@link Modelo.modelo.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relaction</em>' containment reference list.
	 * @see Modelo.modelo.ModeloPackage#getClass_HasRelaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getHasRelaction();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link Modelo.modelo.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see Modelo.modelo.ModeloPackage#getClass_From()
	 * @model
	 * @generated
	 */
	EList<Relation> getFrom();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Modelo.modelo.ModeloPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Modelo.modelo.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attribute</em>' containment reference.
	 * @see #setHasAttribute(Attribute)
	 * @see Modelo.modelo.ModeloPackage#getClass_HasAttribute()
	 * @model containment="true"
	 * @generated
	 */
	Attribute getHasAttribute();

	/**
	 * Sets the value of the '{@link Modelo.modelo.Class#getHasAttribute <em>Has Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Attribute</em>' containment reference.
	 * @see #getHasAttribute()
	 * @generated
	 */
	void setHasAttribute(Attribute value);

} // Class
