/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getRelationclass <em>Relationclass</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getGoclass1 <em>Goclass1</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getId <em>Id</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getName <em>Name</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getFunctionCreate <em>Function Create</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getFunctionDelete <em>Function Delete</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getFunctionUpdate <em>Function Update</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getFunctionIndex <em>Function Index</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getFunctionView <em>Function View</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getFunctionAdmin <em>Function Admin</em>}</li>
 *   <li>{@link Modeldos.modeldos.Class#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Attributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_Attributes()
	 * @model containment="true" upper="15"
	 * @generated
	 */
	EList<Attributes> getAttributes();

	/**
	 * Returns the value of the '<em><b>Relationclass</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Relations_Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationclass</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_Relationclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relations_Class> getRelationclass();

	/**
	 * Returns the value of the '<em><b>Goclass1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goclass1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goclass1</em>' reference.
	 * @see #setGoclass1(Relations_Class)
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_Goclass1()
	 * @model
	 * @generated
	 */
	Relations_Class getGoclass1();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getGoclass1 <em>Goclass1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goclass1</em>' reference.
	 * @see #getGoclass1()
	 * @generated
	 */
	void setGoclass1(Relations_Class value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Function Create</b></em>' attribute.
	 * The default value is <code>"authenticated"</code>.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Create</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #setFunctionCreate(TypeRol)
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_FunctionCreate()
	 * @model default="authenticated"
	 * @generated
	 */
	TypeRol getFunctionCreate();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getFunctionCreate <em>Function Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Create</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #getFunctionCreate()
	 * @generated
	 */
	void setFunctionCreate(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function Delete</b></em>' attribute.
	 * The default value is <code>"authenticated"</code>.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Delete</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #setFunctionDelete(TypeRol)
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_FunctionDelete()
	 * @model default="authenticated"
	 * @generated
	 */
	TypeRol getFunctionDelete();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getFunctionDelete <em>Function Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Delete</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #getFunctionDelete()
	 * @generated
	 */
	void setFunctionDelete(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function Update</b></em>' attribute.
	 * The default value is <code>"authenticated"</code>.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Update</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #setFunctionUpdate(TypeRol)
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_FunctionUpdate()
	 * @model default="authenticated"
	 * @generated
	 */
	TypeRol getFunctionUpdate();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getFunctionUpdate <em>Function Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Update</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #getFunctionUpdate()
	 * @generated
	 */
	void setFunctionUpdate(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function Index</b></em>' attribute.
	 * The default value is <code>"any"</code>.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Index</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #setFunctionIndex(TypeRol)
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_FunctionIndex()
	 * @model default="any"
	 * @generated
	 */
	TypeRol getFunctionIndex();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getFunctionIndex <em>Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Index</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #getFunctionIndex()
	 * @generated
	 */
	void setFunctionIndex(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function View</b></em>' attribute.
	 * The default value is <code>"any"</code>.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function View</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #setFunctionView(TypeRol)
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_FunctionView()
	 * @model default="any"
	 * @generated
	 */
	TypeRol getFunctionView();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getFunctionView <em>Function View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function View</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #getFunctionView()
	 * @generated
	 */
	void setFunctionView(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function Admin</b></em>' attribute.
	 * The default value is <code>"admin"</code>.
	 * The literals are from the enumeration {@link Modeldos.modeldos.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Admin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Admin</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #setFunctionAdmin(TypeRol)
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_FunctionAdmin()
	 * @model default="admin"
	 * @generated
	 */
	TypeRol getFunctionAdmin();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.Class#getFunctionAdmin <em>Function Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Admin</em>' attribute.
	 * @see Modeldos.modeldos.TypeRol
	 * @see #getFunctionAdmin()
	 * @generated
	 */
	void setFunctionAdmin(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Views}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getClass_Views()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<Views> getViews();

} // Class
