/**
 */
package Modeldos.modeldos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.Page#getRol <em>Rol</em>}</li>
 *   <li>{@link Modeldos.modeldos.Page#getPagePresentationUnit <em>Page Presentation Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends Views {
	/**
	 * Returns the value of the '<em><b>Rol</b></em>' attribute.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #setRol(TypeRol)
	 * @see Modeldos.modeldos.ModeldosPackage#getPage_Rol()
	 * @model
	 * @generated
	 */
	TypeRol getRol();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Page#getRol <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #getRol()
	 * @generated
	 */
	void setRol(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Page Presentation Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Presentation Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Presentation Unit</em>' containment reference.
	 * @see #setPagePresentationUnit(PresentationUnit)
	 * @see Modeldos.modeldos.ModeldosPackage#getPage_PagePresentationUnit()
	 * @model containment="true"
	 * @generated
	 */
	PresentationUnit getPagePresentationUnit();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Page#getPagePresentationUnit <em>Page Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Presentation Unit</em>' containment reference.
	 * @see #getPagePresentationUnit()
	 * @generated
	 */
	void setPagePresentationUnit(PresentationUnit value);

} // Page
