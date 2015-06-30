/**
 */
package Metawebdesign.metawebdesign;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getRViewsHasClass <em>RViews Has Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getFromClass <em>From Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView()
 * @model
 * @generated
 */
public interface RelationView extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationView#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>RViews Has Class</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RViews Has Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RViews Has Class</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_RViewsHasClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metawebdesign.metawebdesign.Class> getRViewsHasClass();

	/**
	 * Returns the value of the '<em><b>From Class</b></em>' reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Class</em>' reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_FromClass()
	 * @model
	 * @generated
	 */
	EList<Metawebdesign.metawebdesign.Class> getFromClass();

} // RelationView
