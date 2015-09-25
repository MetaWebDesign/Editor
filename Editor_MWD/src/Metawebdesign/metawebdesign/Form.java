/**
 */
package Metawebdesign.metawebdesign;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.Form#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Views {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeService
	 * @see #setService(TypeService)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getForm_Service()
	 * @model
	 * @generated
	 */
	TypeService getService();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Form#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeService
	 * @see #getService()
	 * @generated
	 */
	void setService(TypeService value);

} // Form
