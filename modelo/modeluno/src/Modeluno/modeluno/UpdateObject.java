/**
 */
package Modeluno.modeluno;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.UpdateObject#getName <em>Name</em>}</li>
 *   <li>{@link Modeluno.modeluno.UpdateObject#getHasViewUpdateObject <em>Has View Update Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getUpdateObject()
 * @model
 * @generated
 */
public interface UpdateObject extends Service {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UpdateObject"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Modeluno.modeluno.ModelunoPackage#getUpdateObject_Name()
	 * @model default="UpdateObject" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Has View Update Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has View Update Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has View Update Object</em>' containment reference.
	 * @see #setHasViewUpdateObject(ViewUpdateObject)
	 * @see Modeluno.modeluno.ModelunoPackage#getUpdateObject_HasViewUpdateObject()
	 * @model containment="true"
	 * @generated
	 */
	ViewUpdateObject getHasViewUpdateObject();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.UpdateObject#getHasViewUpdateObject <em>Has View Update Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has View Update Object</em>' containment reference.
	 * @see #getHasViewUpdateObject()
	 * @generated
	 */
	void setHasViewUpdateObject(ViewUpdateObject value);

} // UpdateObject
