/**
 */
package oo_method.oo_method;

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
 *   <li>{@link oo_method.oo_method.Class#getRCompound <em>RCompound</em>}</li>
 *   <li>{@link oo_method.oo_method.Class#getRComponents <em>RComponents</em>}</li>
 *   <li>{@link oo_method.oo_method.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link oo_method.oo_method.Class#getName <em>Name</em>}</li>
 *   <li>{@link oo_method.oo_method.Class#getIdFunction <em>Id Function</em>}</li>
 *   <li>{@link oo_method.oo_method.Class#getServices <em>Services</em>}</li>
 *   <li>{@link oo_method.oo_method.Class#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see oo_method.oo_method.Oo_methodPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>RCompound</b></em>' containment reference list.
	 * The list contents are of type {@link oo_method.oo_method.Relation}.
	 * It is bidirectional and its opposite is '{@link oo_method.oo_method.Relation#getComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RCompound</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RCompound</em>' containment reference list.
	 * @see oo_method.oo_method.Oo_methodPackage#getClass_RCompound()
	 * @see oo_method.oo_method.Relation#getComposed
	 * @model opposite="composed" containment="true"
	 * @generated
	 */
	EList<Relation> getRCompound();

	/**
	 * Returns the value of the '<em><b>RComponents</b></em>' reference list.
	 * The list contents are of type {@link oo_method.oo_method.Relation}.
	 * It is bidirectional and its opposite is '{@link oo_method.oo_method.Relation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RComponents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RComponents</em>' reference list.
	 * @see oo_method.oo_method.Oo_methodPackage#getClass_RComponents()
	 * @see oo_method.oo_method.Relation#getComponent
	 * @model opposite="component"
	 * @generated
	 */
	EList<Relation> getRComponents();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link oo_method.oo_method.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see oo_method.oo_method.Oo_methodPackage#getClass_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

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
	 * @see oo_method.oo_method.Oo_methodPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link oo_method.oo_method.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see oo_method.oo_method.Oo_methodPackage#getClass_IdFunction()
	 * @model derived="true"
	 * @generated
	 */
	String getIdFunction();

	/**
	 * Sets the value of the '{@link oo_method.oo_method.Class#getIdFunction <em>Id Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Function</em>' attribute.
	 * @see #getIdFunction()
	 * @generated
	 */
	void setIdFunction(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link oo_method.oo_method.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see oo_method.oo_method.Oo_methodPackage#getClass_Services()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link oo_method.oo_method.Constraints}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see oo_method.oo_method.Oo_methodPackage#getClass_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraints> getConstraints();

} // Class
