/**
 */
package Metawebdesign.metawebdesign;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Contraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.RelationContraint#getRhasConstraint <em>Rhas Constraint</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationContraint#getGoRConstraint2 <em>Go RConstraint2</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationContraint()
 * @model
 * @generated
 */
public interface RelationContraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Rhas Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhas Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhas Constraint</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationContraint_RhasConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getRhasConstraint();

	/**
	 * Returns the value of the '<em><b>Go RConstraint2</b></em>' reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go RConstraint2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go RConstraint2</em>' reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationContraint_GoRConstraint2()
	 * @model
	 * @generated
	 */
	EList<Constraint> getGoRConstraint2();

} // RelationContraint
