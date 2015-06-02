/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.RelationClass#getGoClass <em>Go Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getRelationClass()
 * @model
 * @generated
 */
public interface RelationClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Go Class</b></em>' reference list.
	 * The list contents are of type {@link Modeluno.modeluno.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Class</em>' reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getRelationClass_GoClass()
	 * @model
	 * @generated
	 */
	EList<Modeluno.modeluno.Class> getGoClass();

} // RelationClass
