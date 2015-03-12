/**
 */
package oo_method;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oo_method.Attribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link oo_method.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link oo_method.Attribute#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see oo_method.Oo_methodPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oo_method.dataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see oo_method.dataTypes
	 * @see #setDataType(dataTypes)
	 * @see oo_method.Oo_methodPackage#getAttribute_DataType()
	 * @model
	 * @generated
	 */
	dataTypes getDataType();

	/**
	 * Sets the value of the '{@link oo_method.Attribute#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see oo_method.dataTypes
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(dataTypes value);

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
	 * @see oo_method.Oo_methodPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link oo_method.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' attribute.
	 * The literals are from the enumeration {@link oo_method.permissionsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' attribute.
	 * @see oo_method.permissionsType
	 * @see #setPermissions(permissionsType)
	 * @see oo_method.Oo_methodPackage#getAttribute_Permissions()
	 * @model
	 * @generated
	 */
	permissionsType getPermissions();

	/**
	 * Sets the value of the '{@link oo_method.Attribute#getPermissions <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' attribute.
	 * @see oo_method.permissionsType
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(permissionsType value);

} // Attribute
