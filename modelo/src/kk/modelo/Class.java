/**
 */
package kk.modelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kk.modelo.Class#getCname <em>Cname</em>}</li>
 *   <li>{@link kk.modelo.Class#getHasAtributte <em>Has Atributte</em>}</li>
 * </ul>
 * </p>
 *
 * @see kk.modelo.ModeloPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
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
	 * @see kk.modelo.ModeloPackage#getClass_Cname()
	 * @model
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link kk.modelo.Class#getCname <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cname</em>' attribute.
	 * @see #getCname()
	 * @generated
	 */
	void setCname(String value);

	/**
	 * Returns the value of the '<em><b>Has Atributte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atributte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atributte</em>' containment reference.
	 * @see #setHasAtributte(Atributo)
	 * @see kk.modelo.ModeloPackage#getClass_HasAtributte()
	 * @model containment="true"
	 * @generated
	 */
	Atributo getHasAtributte();

	/**
	 * Sets the value of the '{@link kk.modelo.Class#getHasAtributte <em>Has Atributte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Atributte</em>' containment reference.
	 * @see #getHasAtributte()
	 * @generated
	 */
	void setHasAtributte(Atributo value);

} // Class
