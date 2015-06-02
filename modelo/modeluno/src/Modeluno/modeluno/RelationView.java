/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.RelationView#getRhasView <em>Rhas View</em>}</li>
 *   <li>{@link Modeluno.modeluno.RelationView#getGoToView <em>Go To View</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getRelationView()
 * @model
 * @generated
 */
public interface RelationView extends EObject {
	/**
	 * Returns the value of the '<em><b>Rhas View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhas View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhas View</em>' containment reference.
	 * @see #setRhasView(Views)
	 * @see Modeluno.modeluno.ModelunoPackage#getRelationView_RhasView()
	 * @model containment="true"
	 * @generated
	 */
	Views getRhasView();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.RelationView#getRhasView <em>Rhas View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhas View</em>' containment reference.
	 * @see #getRhasView()
	 * @generated
	 */
	void setRhasView(Views value);

	/**
	 * Returns the value of the '<em><b>Go To View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go To View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go To View</em>' reference.
	 * @see #setGoToView(Views)
	 * @see Modeluno.modeluno.ModelunoPackage#getRelationView_GoToView()
	 * @model
	 * @generated
	 */
	Views getGoToView();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.RelationView#getGoToView <em>Go To View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go To View</em>' reference.
	 * @see #getGoToView()
	 * @generated
	 */
	void setGoToView(Views value);

} // RelationView
