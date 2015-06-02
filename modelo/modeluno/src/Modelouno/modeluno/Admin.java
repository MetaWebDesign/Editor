/**
 */
package Modelouno.modeluno;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelouno.modeluno.Admin#getName <em>Name</em>}</li>
 *   <li>{@link Modelouno.modeluno.Admin#getHasViewAdmin <em>Has View Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelouno.modeluno.ModelunoPackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends Service {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Admin"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Modelouno.modeluno.ModelunoPackage#getAdmin_Name()
	 * @model default="Admin" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Has View Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has View Admin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has View Admin</em>' containment reference.
	 * @see #setHasViewAdmin(ViewAdmin)
	 * @see Modelouno.modeluno.ModelunoPackage#getAdmin_HasViewAdmin()
	 * @model containment="true"
	 * @generated
	 */
	ViewAdmin getHasViewAdmin();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Admin#getHasViewAdmin <em>Has View Admin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has View Admin</em>' containment reference.
	 * @see #getHasViewAdmin()
	 * @generated
	 */
	void setHasViewAdmin(ViewAdmin value);

} // Admin
