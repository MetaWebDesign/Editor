/**
 */
package Construc.construc;

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
 *   <li>{@link Construc.construc.Class#getName <em>Name</em>}</li>
 *   <li>{@link Construc.construc.Class#getToRelation <em>To Relation</em>}</li>
 *   <li>{@link Construc.construc.Class#getFrom <em>From</em>}</li>
 *   <li>{@link Construc.construc.Class#getToAttribute <em>To Attribute</em>}</li>
 *   <li>{@link Construc.construc.Class#getToService <em>To Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see Construc.construc.ConstrucPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
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
	 * @see Construc.construc.ConstrucPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Construc.construc.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>To Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Construc.construc.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Relation</em>' containment reference list.
	 * @see Construc.construc.ConstrucPackage#getClass_ToRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getToRelation();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Relation)
	 * @see Construc.construc.ConstrucPackage#getClass_From()
	 * @model
	 * @generated
	 */
	Relation getFrom();

	/**
	 * Sets the value of the '{@link Construc.construc.Class#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Relation value);

	/**
	 * Returns the value of the '<em><b>To Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link Construc.construc.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Attribute</em>' containment reference list.
	 * @see Construc.construc.ConstrucPackage#getClass_ToAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getToAttribute();

	/**
	 * Returns the value of the '<em><b>To Service</b></em>' containment reference list.
	 * The list contents are of type {@link Construc.construc.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Service</em>' containment reference list.
	 * @see Construc.construc.ConstrucPackage#getClass_ToService()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getToService();

} // Class
