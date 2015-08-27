/**
 */
package Metawebdesign.metawebdesign;

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
 *   <li>{@link Metawebdesign.metawebdesign.Views#getTitle <em>Title</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Views#getRolView <em>Rol View</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Views#getHasRelationView <em>Has Relation View</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Views#getFromRelation <em>From Relation</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Views#getHasViewComponent <em>Has View Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViews()
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViews_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Views#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Rol View</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol View</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #setRolView(TypeRol)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViews_RolView()
	 * @model
	 * @generated
	 */
	TypeRol getRolView();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Views#getRolView <em>Rol View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol View</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #getRolView()
	 * @generated
	 */
	void setRolView(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Has Relation View</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.RelationView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relation View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relation View</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViews_HasRelationView()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationView> getHasRelationView();

	/**
	 * Returns the value of the '<em><b>From Relation</b></em>' reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.RelationView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Relation</em>' reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViews_FromRelation()
	 * @model
	 * @generated
	 */
	EList<RelationView> getFromRelation();

	/**
	 * Returns the value of the '<em><b>Has View Component</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.ViewComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has View Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has View Component</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViews_HasViewComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewComponent> getHasViewComponent();

} // Views
