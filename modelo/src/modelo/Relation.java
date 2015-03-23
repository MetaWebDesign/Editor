/**
 */
package modelo;

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
 *   <li>{@link modelo.Relation#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link modelo.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see modelo.ModeloPackage#getRelation_To()
	 * @model
	 * @generated
	 */
	EList<modelo.Class> getTo();

} // Relation
