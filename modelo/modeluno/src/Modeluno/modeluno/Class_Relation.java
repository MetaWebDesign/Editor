/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.Class_Relation#getGoClass <em>Go Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getClass_Relation()
 * @model
 * @generated
 */
public interface Class_Relation extends EObject {
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
	 * @see Modeluno.modeluno.ModelunoPackage#getClass_Relation_GoClass()
	 * @model
	 * @generated
	 */
	EList<Modeluno.modeluno.Class> getGoClass();

} // Class_Relation
