/**
 */
package Construc.construc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Construc.construc.Relation#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see Construc.construc.ConstrucPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Construc.construc.Class)
	 * @see Construc.construc.ConstrucPackage#getRelation_To()
	 * @model
	 * @generated
	 */
	Construc.construc.Class getTo();

	/**
	 * Sets the value of the '{@link Construc.construc.Relation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Construc.construc.Class value);

} // Relation
