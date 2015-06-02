/**
 */
package Modelouno.modeluno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelouno.modeluno.Relation_Service#getRhasService <em>Rhas Service</em>}</li>
 *   <li>{@link Modelouno.modeluno.Relation_Service#getGoService <em>Go Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelouno.modeluno.ModelunoPackage#getRelation_Service()
 * @model
 * @generated
 */
public interface Relation_Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Rhas Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhas Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhas Service</em>' containment reference.
	 * @see #setRhasService(Service)
	 * @see Modelouno.modeluno.ModelunoPackage#getRelation_Service_RhasService()
	 * @model containment="true"
	 * @generated
	 */
	Service getRhasService();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Relation_Service#getRhasService <em>Rhas Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhas Service</em>' containment reference.
	 * @see #getRhasService()
	 * @generated
	 */
	void setRhasService(Service value);

	/**
	 * Returns the value of the '<em><b>Go Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Service</em>' reference.
	 * @see #setGoService(Service)
	 * @see Modelouno.modeluno.ModelunoPackage#getRelation_Service_GoService()
	 * @model
	 * @generated
	 */
	Service getGoService();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Relation_Service#getGoService <em>Go Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Service</em>' reference.
	 * @see #getGoService()
	 * @generated
	 */
	void setGoService(Service value);

} // Relation_Service
