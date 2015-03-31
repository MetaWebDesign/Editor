/**
 */
package model.modeluno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.modeluno.Relation#getR2 <em>R2</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.modeluno.ModelunoPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>R2</b></em>' reference list.
	 * The list contents are of type {@link model.modeluno.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R2</em>' reference list.
	 * @see model.modeluno.ModelunoPackage#getRelation_R2()
	 * @model
	 * @generated
	 */
	EList<model.modeluno.Class> getR2();

} // Relation
