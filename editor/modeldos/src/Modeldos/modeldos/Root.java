/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.Root#getClass_ <em>Class</em>}</li>
 *   <li>{@link Modeldos.modeldos.Root#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Modeldos.modeldos.Root#getMenu <em>Menu</em>}</li>
 *   <li>{@link Modeldos.modeldos.Root#getGroup <em>Group</em>}</li>
 *   <li>{@link Modeldos.modeldos.Root#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getRoot_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modeldos.modeldos.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Attributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getRoot_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attributes> getAttribute();

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getRoot_Menu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenu();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getRoot_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Views}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getRoot_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<Views> getViews();

} // Root