/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.RAttribute#getAtributoEsDe <em>Atributo Es De</em>}</li>
 *   <li>{@link Modeluno.modeluno.RAttribute#getRhasAttribute <em>Rhas Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getRAttribute()
 * @model
 * @generated
 */
public interface RAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Atributo Es De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributo Es De</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo Es De</em>' reference.
	 * @see #setAtributoEsDe(Atributte)
	 * @see Modeluno.modeluno.ModelunoPackage#getRAttribute_AtributoEsDe()
	 * @model
	 * @generated
	 */
	Atributte getAtributoEsDe();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.RAttribute#getAtributoEsDe <em>Atributo Es De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributo Es De</em>' reference.
	 * @see #getAtributoEsDe()
	 * @generated
	 */
	void setAtributoEsDe(Atributte value);

	/**
	 * Returns the value of the '<em><b>Rhas Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhas Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhas Attribute</em>' containment reference.
	 * @see #setRhasAttribute(Atributte)
	 * @see Modeluno.modeluno.ModelunoPackage#getRAttribute_RhasAttribute()
	 * @model containment="true"
	 * @generated
	 */
	Atributte getRhasAttribute();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.RAttribute#getRhasAttribute <em>Rhas Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhas Attribute</em>' containment reference.
	 * @see #getRhasAttribute()
	 * @generated
	 */
	void setRhasAttribute(Atributte value);

} // RAttribute
