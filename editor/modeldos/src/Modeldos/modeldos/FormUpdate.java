/**
 */
package Modeldos.modeldos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.FormUpdate#getUpdatePresentationUnit <em>Update Presentation Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getFormUpdate()
 * @model
 * @generated
 */
public interface FormUpdate extends Views {
	/**
	 * Returns the value of the '<em><b>Update Presentation Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Presentation Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Presentation Unit</em>' containment reference.
	 * @see #setUpdatePresentationUnit(PresentationUnit)
	 * @see Modeldos.modeldos.ModeldosPackage#getFormUpdate_UpdatePresentationUnit()
	 * @model containment="true"
	 * @generated
	 */
	PresentationUnit getUpdatePresentationUnit();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.FormUpdate#getUpdatePresentationUnit <em>Update Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Presentation Unit</em>' containment reference.
	 * @see #getUpdatePresentationUnit()
	 * @generated
	 */
	void setUpdatePresentationUnit(PresentationUnit value);

} // FormUpdate
