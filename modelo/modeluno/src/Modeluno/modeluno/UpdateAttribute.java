/**
 */
package Modeluno.modeluno;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.UpdateAttribute#getName <em>Name</em>}</li>
 *   <li>{@link Modeluno.modeluno.UpdateAttribute#getHasViewUpdateObject <em>Has View Update Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getUpdateAttribute()
 * @model
 * @generated
 */
public interface UpdateAttribute extends Service {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UpdateAttribute"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Modeluno.modeluno.ModelunoPackage#getUpdateAttribute_Name()
	 * @model default="UpdateAttribute" changeable="false"
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
	 * @see #setHasViewUpdateObject(ViewUpdateAttribute)
	 * @see Modeluno.modeluno.ModelunoPackage#getUpdateAttribute_HasViewUpdateObject()
	 * @model containment="true"
	 * @generated
	 */
	ViewUpdateAttribute getHasViewUpdateObject();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.UpdateAttribute#getHasViewUpdateObject <em>Has View Update Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has View Update Object</em>' containment reference.
	 * @see #getHasViewUpdateObject()
	 * @generated
	 */
	void setHasViewUpdateObject(ViewUpdateAttribute value);

} // UpdateAttribute
