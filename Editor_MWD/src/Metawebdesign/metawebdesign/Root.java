/**
 */
package Metawebdesign.metawebdesign;

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
 *   <li>{@link Metawebdesign.metawebdesign.Root#getClass_ <em>Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Root#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Root#getMenu <em>Menu</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Root#getGroup <em>Group</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Root#getViews <em>Views</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Root#getView_component <em>View component</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Root#getLink <em>Link</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Root#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRoot_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metawebdesign.metawebdesign.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Attributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRoot_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attributes> getAttribute();

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRoot_Menu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenu();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRoot_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Views}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRoot_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<Views> getViews();

	/**
	 * Returns the value of the '<em><b>View component</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.ViewComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View component</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRoot_View_component()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewComponent> getView_component();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRoot_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRoot_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

} // Root
