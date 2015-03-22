/**
 */
package Construc.construc;

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
 *   <li>{@link Construc.construc.Model#getFromModel <em>From Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see Construc.construc.ConstrucPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>From Model</b></em>' containment reference list.
	 * The list contents are of type {@link Construc.construc.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Model</em>' containment reference list.
	 * @see Construc.construc.ConstrucPackage#getModel_FromModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Construc.construc.Class> getFromModel();

} // Model
