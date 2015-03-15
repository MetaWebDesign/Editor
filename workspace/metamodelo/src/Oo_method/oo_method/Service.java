/**
 */
package Oo_method.oo_method;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Oo_method.oo_method.Service#getName <em>Name</em>}</li>
 *   <li>{@link Oo_method.oo_method.Service#getArguments <em>Arguments</em>}</li>
 *   <li>{@link Oo_method.oo_method.Service#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link Oo_method.oo_method.Service#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see Oo_method.oo_method.Oo_methodPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Oo_method.oo_method.Oo_methodPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Oo_method.oo_method.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link Oo_method.oo_method.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see Oo_method.oo_method.Oo_methodPackage#getService_Arguments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
	 * The list contents are of type {@link Oo_method.oo_method.Precondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see Oo_method.oo_method.Oo_methodPackage#getService_Preconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Precondition> getPreconditions();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link Oo_method.oo_method.ServiceKinds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see Oo_method.oo_method.ServiceKinds
	 * @see #setKind(ServiceKinds)
	 * @see Oo_method.oo_method.Oo_methodPackage#getService_Kind()
	 * @model default="normal"
	 * @generated
	 */
	ServiceKinds getKind();

	/**
	 * Sets the value of the '{@link Oo_method.oo_method.Service#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see Oo_method.oo_method.ServiceKinds
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ServiceKinds value);

} // Service
