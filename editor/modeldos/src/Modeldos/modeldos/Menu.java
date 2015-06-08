/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.Menu#getHasGroup <em>Has Group</em>}</li>
 *   <li>{@link Modeldos.modeldos.Menu#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Group</em>' containment reference.
	 * @see #setHasGroup(group)
	 * @see Modeldos.modeldos.ModeldosPackage#getMenu_HasGroup()
	 * @model containment="true"
	 * @generated
	 */
	group getHasGroup();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Menu#getHasGroup <em>Has Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Group</em>' containment reference.
	 * @see #getHasGroup()
	 * @generated
	 */
	void setHasGroup(group value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Modeldos.modeldos.ModeldosPackage#getMenu_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Menu#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Menu
