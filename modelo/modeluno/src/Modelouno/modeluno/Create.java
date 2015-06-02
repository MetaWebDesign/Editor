/**
 */
package Modelouno.modeluno;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelouno.modeluno.Create#getName <em>Name</em>}</li>
 *   <li>{@link Modelouno.modeluno.Create#getHasViewFormInput <em>Has View Form Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelouno.modeluno.ModelunoPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends Service {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Create"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Modelouno.modeluno.ModelunoPackage#getCreate_Name()
	 * @model default="Create" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Has View Form Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has View Form Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has View Form Input</em>' containment reference.
	 * @see #setHasViewFormInput(ViewInput)
	 * @see Modelouno.modeluno.ModelunoPackage#getCreate_HasViewFormInput()
	 * @model containment="true"
	 * @generated
	 */
	ViewInput getHasViewFormInput();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Create#getHasViewFormInput <em>Has View Form Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has View Form Input</em>' containment reference.
	 * @see #getHasViewFormInput()
	 * @generated
	 */
	void setHasViewFormInput(ViewInput value);

} // Create
