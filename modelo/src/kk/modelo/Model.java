/**
 */
package kk.modelo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kk.modelo.Model#getHasClass <em>Has Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see kk.modelo.ModeloPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Class</b></em>' containment reference list.
	 * The list contents are of type {@link kk.modelo.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Class</em>' containment reference list.
	 * @see kk.modelo.ModeloPackage#getModel_HasClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<kk.modelo.Class> getHasClass();

} // Model
