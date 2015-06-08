/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.Attributes#getName <em>Name</em>}</li>
 *   <li>{@link Modeldos.modeldos.Attributes#getRol <em>Rol</em>}</li>
 *   <li>{@link Modeldos.modeldos.Attributes#getValor <em>Valor</em>}</li>
 *   <li>{@link Modeldos.modeldos.Attributes#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link Modeldos.modeldos.Attributes#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Modeldos.modeldos.Attributes#getInTheForm <em>In The Form</em>}</li>
 *   <li>{@link Modeldos.modeldos.Attributes#getHasPresentationUnit <em>Has Presentation Unit</em>}</li>
 *   <li>{@link Modeldos.modeldos.Attributes#getGoPunit1 <em>Go Punit1</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getAttributes()
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
	 * @see Modeldos.modeldos.ModeldosPackage#getAttributes_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Attributes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' attribute.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #setRol(TypeRol)
	 * @see Modeldos.modeldos.ModeldosPackage#getAttributes_Rol()
	 * @model
	 * @generated
	 */
	TypeRol getRol();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Attributes#getRol <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #getRol()
	 * @generated
	 */
	void setRol(TypeRol value);

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
	 * @see Modeldos.modeldos.ModeldosPackage#getAttributes_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Attributes#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

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
	 * @see Modeldos.modeldos.ModeldosPackage#getAttributes_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Attributes#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see Modeldos.modeldos.TypeData
	 * @see #setDataType(TypeData)
	 * @see Modeldos.modeldos.ModeldosPackage#getAttributes_DataType()
	 * @model
	 * @generated
	 */
	TypeData getDataType();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Attributes#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see Modeldos.modeldos.TypeData
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(TypeData value);

	/**
	 * Returns the value of the '<em><b>In The Form</b></em>' attribute.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeAttributeForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In The Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In The Form</em>' attribute.
	 * @see Modeldos.modeldos.TypeAttributeForm
	 * @see #setInTheForm(TypeAttributeForm)
	 * @see Modeldos.modeldos.ModeldosPackage#getAttributes_InTheForm()
	 * @model
	 * @generated
	 */
	TypeAttributeForm getInTheForm();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Attributes#getInTheForm <em>In The Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In The Form</em>' attribute.
	 * @see Modeldos.modeldos.TypeAttributeForm
	 * @see #getInTheForm()
	 * @generated
	 */
	void setInTheForm(TypeAttributeForm value);

	/**
	 * Returns the value of the '<em><b>Has Presentation Unit</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.RelationPUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Presentation Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Presentation Unit</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getAttributes_HasPresentationUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationPUnit> getHasPresentationUnit();

	/**
	 * Returns the value of the '<em><b>Go Punit1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Punit1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Punit1</em>' reference.
	 * @see #setGoPunit1(RelationPUnit)
	 * @see Modeldos.modeldos.ModeldosPackage#getAttributes_GoPunit1()
	 * @model
	 * @generated
	 */
	RelationPUnit getGoPunit1();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Attributes#getGoPunit1 <em>Go Punit1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Punit1</em>' reference.
	 * @see #getGoPunit1()
	 * @generated
	 */
	void setGoPunit1(RelationPUnit value);

} // Attributes
