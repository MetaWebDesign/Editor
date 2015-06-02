/**
 */
package Modeluno.modeluno;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.ListView#getName <em>Name</em>}</li>
 *   <li>{@link Modeluno.modeluno.ListView#getHasViewIndex <em>Has View Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getListView()
 * @model
 * @generated
 */
public interface ListView extends Service {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"ListView"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Modeluno.modeluno.ModelunoPackage#getListView_Name()
	 * @model default="ListView" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Has View Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has View Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has View Index</em>' containment reference.
	 * @see #setHasViewIndex(ViewIndex)
	 * @see Modeluno.modeluno.ModelunoPackage#getListView_HasViewIndex()
	 * @model containment="true"
	 * @generated
	 */
	ViewIndex getHasViewIndex();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.ListView#getHasViewIndex <em>Has View Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has View Index</em>' containment reference.
	 * @see #getHasViewIndex()
	 * @generated
	 */
	void setHasViewIndex(ViewIndex value);

} // ListView
