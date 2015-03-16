/**
 */
package Oo_method.oo_method;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Oo_method.oo_method.Relation#getComposed <em>Composed</em>}</li>
 *   <li>{@link Oo_method.oo_method.Relation#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see Oo_method.oo_method.Oo_methodPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Composed</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Oo_method.oo_method.Class#getRCompound <em>RCompound</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed</em>' container reference.
	 * @see #setComposed(Oo_method.oo_method.Class)
	 * @see Oo_method.oo_method.Oo_methodPackage#getRelation_Composed()
	 * @see Oo_method.oo_method.Class#getRCompound
	 * @model opposite="rCompound" required="true" transient="false"
	 * @generated
	 */
	Oo_method.oo_method.Class getComposed();

	/**
	 * Sets the value of the '{@link Oo_method.oo_method.Relation#getComposed <em>Composed</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed</em>' container reference.
	 * @see #getComposed()
	 * @generated
	 */
	void setComposed(Oo_method.oo_method.Class value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Oo_method.oo_method.Class#getRComponents <em>RComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Oo_method.oo_method.Class)
	 * @see Oo_method.oo_method.Oo_methodPackage#getRelation_Component()
	 * @see Oo_method.oo_method.Class#getRComponents
	 * @model opposite="rComponents" required="true"
	 * @generated
	 */
	Oo_method.oo_method.Class getComponent();

	/**
	 * Sets the value of the '{@link Oo_method.oo_method.Relation#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Oo_method.oo_method.Class value);

} // Relation
