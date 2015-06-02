/**
 */
package Modelouno.modeluno;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelouno.modeluno.View#getName <em>Name</em>}</li>
 *   <li>{@link Modelouno.modeluno.View#getHasViewAttribute <em>Has View Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelouno.modeluno.ModelunoPackage#getView()
 * @model
 * @generated
 */
public interface View extends Service {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"View"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Modelouno.modeluno.ModelunoPackage#getView_Name()
	 * @model default="View" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Has View Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has View Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has View Attribute</em>' containment reference.
	 * @see #setHasViewAttribute(ViewAttribute)
	 * @see Modelouno.modeluno.ModelunoPackage#getView_HasViewAttribute()
	 * @model containment="true"
	 * @generated
	 */
	ViewAttribute getHasViewAttribute();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.View#getHasViewAttribute <em>Has View Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has View Attribute</em>' containment reference.
	 * @see #getHasViewAttribute()
	 * @generated
	 */
	void setHasViewAttribute(ViewAttribute value);

} // View
