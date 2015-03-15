/**
 */
package Oo_method.oo_method;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Oo_method.oo_method.StructuralModel#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see Oo_method.oo_method.Oo_methodPackage#getStructuralModel()
 * @model
 * @generated
 */
public interface StructuralModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link Oo_method.oo_method.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see Oo_method.oo_method.Oo_methodPackage#getStructuralModel_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Oo_method.oo_method.Class> getClasses();

} // StructuralModel
