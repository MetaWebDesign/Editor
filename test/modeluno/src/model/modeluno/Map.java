/**
 */
package model.modeluno;

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
 *   <li>{@link model.modeluno.Map#getHasClass <em>Has Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.modeluno.ModelunoPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Class</b></em>' containment reference list.
	 * The list contents are of type {@link model.modeluno.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Class</em>' containment reference list.
	 * @see model.modeluno.ModelunoPackage#getMap_HasClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<model.modeluno.Class> getHasClass();

} // Map
