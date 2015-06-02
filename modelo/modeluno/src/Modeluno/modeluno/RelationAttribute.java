/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.RelationAttribute#getGoAttribute <em>Go Attribute</em>}</li>
 *   <li>{@link Modeluno.modeluno.RelationAttribute#getRhasAttribute <em>Rhas Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getRelationAttribute()
 * @model
 * @generated
 */
public interface RelationAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Go Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Attribute</em>' reference.
	 * @see #setGoAttribute(Attribute)
	 * @see Modeluno.modeluno.ModelunoPackage#getRelationAttribute_GoAttribute()
	 * @model
	 * @generated
	 */
	Attribute getGoAttribute();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.RelationAttribute#getGoAttribute <em>Go Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Attribute</em>' reference.
	 * @see #getGoAttribute()
	 * @generated
	 */
	void setGoAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Rhas Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhas Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhas Attribute</em>' containment reference.
	 * @see #setRhasAttribute(Attribute)
	 * @see Modeluno.modeluno.ModelunoPackage#getRelationAttribute_RhasAttribute()
	 * @model containment="true"
	 * @generated
	 */
	Attribute getRhasAttribute();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.RelationAttribute#getRhasAttribute <em>Rhas Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhas Attribute</em>' containment reference.
	 * @see #getRhasAttribute()
	 * @generated
	 */
	void setRhasAttribute(Attribute value);

} // RelationAttribute
