/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.Map#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link Modeluno.modeluno.Map#getHasAtribute <em>Has Atribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Class</b></em>' containment reference list.
	 * The list contents are of type {@link Modeluno.modeluno.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Class</em>' containment reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getMap_HasClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modeluno.modeluno.Class> getHasClass();

	/**
	 * Returns the value of the '<em><b>Has Atribute</b></em>' containment reference list.
	 * The list contents are of type {@link Modeluno.modeluno.Atributte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atribute</em>' containment reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getMap_HasAtribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributte> getHasAtribute();

} // Map
