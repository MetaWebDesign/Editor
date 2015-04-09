/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.Atributte#getAname <em>Aname</em>}</li>
 *   <li>{@link Modeldos.modeldos.Atributte#getEsDe <em>Es De</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getAtributte()
 * @model
 * @generated
 */
public interface Atributte extends EObject {
	/**
	 * Returns the value of the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aname</em>' attribute.
	 * @see #setAname(String)
	 * @see Modeldos.modeldos.ModeldosPackage#getAtributte_Aname()
	 * @model
	 * @generated
	 */
	String getAname();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Atributte#getAname <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aname</em>' attribute.
	 * @see #getAname()
	 * @generated
	 */
	void setAname(String value);

	/**
	 * Returns the value of the '<em><b>Es De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es De</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es De</em>' reference.
	 * @see #setEsDe(Modeldos.modeldos.Class)
	 * @see Modeldos.modeldos.ModeldosPackage#getAtributte_EsDe()
	 * @model
	 * @generated
	 */
	Modeldos.modeldos.Class getEsDe();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Atributte#getEsDe <em>Es De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es De</em>' reference.
	 * @see #getEsDe()
	 * @generated
	 */
	void setEsDe(Modeldos.modeldos.Class value);

} // Atributte
