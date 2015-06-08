/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation PUnit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.RelationPUnit#getGoPunit2 <em>Go Punit2</em>}</li>
 *   <li>{@link Modeldos.modeldos.RelationPUnit#getRtoPUnit <em>Rto PUnit</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getRelationPUnit()
 * @model
 * @generated
 */
public interface RelationPUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Go Punit2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Punit2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Punit2</em>' reference.
	 * @see #setGoPunit2(PresentationUnit)
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationPUnit_GoPunit2()
	 * @model
	 * @generated
	 */
	PresentationUnit getGoPunit2();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.RelationPUnit#getGoPunit2 <em>Go Punit2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Punit2</em>' reference.
	 * @see #getGoPunit2()
	 * @generated
	 */
	void setGoPunit2(PresentationUnit value);

	/**
	 * Returns the value of the '<em><b>Rto PUnit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rto PUnit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rto PUnit</em>' containment reference.
	 * @see #setRtoPUnit(PresentationUnit)
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationPUnit_RtoPUnit()
	 * @model containment="true"
	 * @generated
	 */
	PresentationUnit getRtoPUnit();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.RelationPUnit#getRtoPUnit <em>Rto PUnit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rto PUnit</em>' containment reference.
	 * @see #getRtoPUnit()
	 * @generated
	 */
	void setRtoPUnit(PresentationUnit value);

} // RelationPUnit
