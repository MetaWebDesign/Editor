/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.Views#getTitle <em>Title</em>}</li>
 *   <li>{@link Modeldos.modeldos.Views#getRolView <em>Rol View</em>}</li>
 *   <li>{@link Modeldos.modeldos.Views#getHasRelationClass <em>Has Relation Class</em>}</li>
 *   <li>{@link Modeldos.modeldos.Views#getViewGoRelationClass <em>View Go Relation Class</em>}</li>
 *   <li>{@link Modeldos.modeldos.Views#getGroupName <em>Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getViews()
 * @model
 * @generated
 */
public interface Views extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see Modeldos.modeldos.ModeldosPackage#getViews_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Views#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Rol View</b></em>' attribute.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol View</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #setRolView(TypeRol)
	 * @see Modeldos.modeldos.ModeldosPackage#getViews_RolView()
	 * @model
	 * @generated
	 */
	TypeRol getRolView();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Views#getRolView <em>Rol View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol View</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #getRolView()
	 * @generated
	 */
	void setRolView(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Has Relation Class</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.RelationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relation Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relation Class</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getViews_HasRelationClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationClass> getHasRelationClass();

	/**
	 * Returns the value of the '<em><b>View Go Relation Class</b></em>' reference list.
	 * The list contents are of type {@link Modeldos.modeldos.RelationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Go Relation Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Go Relation Class</em>' reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getViews_ViewGoRelationClass()
	 * @model
	 * @generated
	 */
	EList<RelationClass> getViewGoRelationClass();

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' reference.
	 * @see #setGroupName(Group)
	 * @see Modeldos.modeldos.ModeldosPackage#getViews_GroupName()
	 * @model
	 * @generated
	 */
	Group getGroupName();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Views#getGroupName <em>Group Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' reference.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(Group value);

} // Views
