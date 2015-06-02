/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.Attribute#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link Modeluno.modeluno.Attribute#getAname <em>Aname</em>}</li>
 *   <li>{@link Modeluno.modeluno.Attribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Modeluno.modeluno.Attribute#getRol <em>Rol</em>}</li>
 *   <li>{@link Modeluno.modeluno.Attribute#getInTheForm <em>In The Form</em>}</li>
 *   <li>{@link Modeluno.modeluno.Attribute#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(boolean)
	 * @see Modeluno.modeluno.ModelunoPackage#getAttribute_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Attribute#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aname</em>' attribute.
	 * @see #setAname(String)
	 * @see Modeluno.modeluno.ModelunoPackage#getAttribute_Aname()
	 * @model
	 * @generated
	 */
	String getAname();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Attribute#getAname <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aname</em>' attribute.
	 * @see #getAname()
	 * @generated
	 */
	void setAname(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see Modeluno.modeluno.ModelunoPackage#getAttribute_DataType()
	 * @model
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Attribute#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' attribute.
	 * The literals are from the enumeration {@link Modeluno.modeluno.Rol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' attribute.
	 * @see Modeluno.modeluno.Rol
	 * @see #setRol(Rol)
	 * @see Modeluno.modeluno.ModelunoPackage#getAttribute_Rol()
	 * @model
	 * @generated
	 */
	Rol getRol();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Attribute#getRol <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' attribute.
	 * @see Modeluno.modeluno.Rol
	 * @see #getRol()
	 * @generated
	 */
	void setRol(Rol value);

	/**
	 * Returns the value of the '<em><b>In The Form</b></em>' attribute.
	 * The literals are from the enumeration {@link Modeluno.modeluno.TypeAttributeForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In The Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In The Form</em>' attribute.
	 * @see Modeluno.modeluno.TypeAttributeForm
	 * @see #setInTheForm(TypeAttributeForm)
	 * @see Modeluno.modeluno.ModelunoPackage#getAttribute_InTheForm()
	 * @model
	 * @generated
	 */
	TypeAttributeForm getInTheForm();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Attribute#getInTheForm <em>In The Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In The Form</em>' attribute.
	 * @see Modeluno.modeluno.TypeAttributeForm
	 * @see #getInTheForm()
	 * @generated
	 */
	void setInTheForm(TypeAttributeForm value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see Modeluno.modeluno.ModelunoPackage#getAttribute_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Attribute#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

} // Attribute
