/**
 */
package Modeldos.modeldos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.Form#getName <em>Name</em>}</li>
 *   <li>{@link Modeldos.modeldos.Form#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Views {
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
	 * @see Modeldos.modeldos.ModeldosPackage#getForm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Form#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see Modeldos.modeldos.TypeService
	 * @see #setService(TypeService)
	 * @see Modeldos.modeldos.ModeldosPackage#getForm_Service()
	 * @model
	 * @generated
	 */
	TypeService getService();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Form#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see Modeldos.modeldos.TypeService
	 * @see #getService()
	 * @generated
	 */
	void setService(TypeService value);

} // Form
