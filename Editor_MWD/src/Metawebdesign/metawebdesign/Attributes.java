/**
 */
package Metawebdesign.metawebdesign;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.Attributes#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Attributes#getRol <em>Rol</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Attributes#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Attributes#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Attributes#getInTheForm <em>In The Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getAttributes()
 * @model
 * @generated
 */
public interface Attributes extends EObject {
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getAttributes_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Attributes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #setRol(TypeRol)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getAttributes_Rol()
	 * @model
	 * @generated
	 */
	TypeRol getRol();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Attributes#getRol <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #getRol()
	 * @generated
	 */
	void setRol(TypeRol value);

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getAttributes_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Attributes#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeData
	 * @see #setDataType(TypeData)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getAttributes_DataType()
	 * @model
	 * @generated
	 */
	TypeData getDataType();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Attributes#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeData
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(TypeData value);

	/**
	 * Returns the value of the '<em><b>In The Form</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeAttributeForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In The Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In The Form</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeAttributeForm
	 * @see #setInTheForm(TypeAttributeForm)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getAttributes_InTheForm()
	 * @model
	 * @generated
	 */
	TypeAttributeForm getInTheForm();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Attributes#getInTheForm <em>In The Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In The Form</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeAttributeForm
	 * @see #getInTheForm()
	 * @generated
	 */
	void setInTheForm(TypeAttributeForm value);

} // Attributes
