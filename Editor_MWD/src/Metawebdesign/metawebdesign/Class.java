/**
 */
package Metawebdesign.metawebdesign;

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
 *   <li>{@link Metawebdesign.metawebdesign.Class#getHasAttributes <em>Has Attributes</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getId <em>Id</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getFunctionCreate <em>Function Create</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getFunctionDelete <em>Function Delete</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getFunctionUpdate <em>Function Update</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getFunctionIndex <em>Function Index</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getFunctionView <em>Function View</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getFunctionAdmin <em>Function Admin</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getHasRelationClass <em>Has Relation Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getGoRelationClass <em>Go Relation Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Class#getHasConstraint <em>Has Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Attributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attributes</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_HasAttributes()
	 * @model containment="true" upper="15"
	 * @generated
	 */
	EList<Attributes> getHasAttributes();

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Class#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Function Create</b></em>' attribute.
	 * The default value is <code>"authenticated"</code>.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Create</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #setFunctionCreate(TypeRol)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_FunctionCreate()
	 * @model default="authenticated"
	 * @generated
	 */
	TypeRol getFunctionCreate();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Class#getFunctionCreate <em>Function Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Create</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #getFunctionCreate()
	 * @generated
	 */
	void setFunctionCreate(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function Delete</b></em>' attribute.
	 * The default value is <code>"authenticated"</code>.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Delete</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #setFunctionDelete(TypeRol)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_FunctionDelete()
	 * @model default="authenticated"
	 * @generated
	 */
	TypeRol getFunctionDelete();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Class#getFunctionDelete <em>Function Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Delete</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #getFunctionDelete()
	 * @generated
	 */
	void setFunctionDelete(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function Update</b></em>' attribute.
	 * The default value is <code>"authenticated"</code>.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Update</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #setFunctionUpdate(TypeRol)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_FunctionUpdate()
	 * @model default="authenticated"
	 * @generated
	 */
	TypeRol getFunctionUpdate();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Class#getFunctionUpdate <em>Function Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Update</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #getFunctionUpdate()
	 * @generated
	 */
	void setFunctionUpdate(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function Index</b></em>' attribute.
	 * The default value is <code>"any"</code>.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Index</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #setFunctionIndex(TypeRol)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_FunctionIndex()
	 * @model default="any"
	 * @generated
	 */
	TypeRol getFunctionIndex();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Class#getFunctionIndex <em>Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Index</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #getFunctionIndex()
	 * @generated
	 */
	void setFunctionIndex(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function View</b></em>' attribute.
	 * The default value is <code>"any"</code>.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function View</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #setFunctionView(TypeRol)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_FunctionView()
	 * @model default="any"
	 * @generated
	 */
	TypeRol getFunctionView();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Class#getFunctionView <em>Function View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function View</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #getFunctionView()
	 * @generated
	 */
	void setFunctionView(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Function Admin</b></em>' attribute.
	 * The default value is <code>"admin"</code>.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeRol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Admin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Admin</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #setFunctionAdmin(TypeRol)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_FunctionAdmin()
	 * @model default="admin"
	 * @generated
	 */
	TypeRol getFunctionAdmin();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Class#getFunctionAdmin <em>Function Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Admin</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see #getFunctionAdmin()
	 * @generated
	 */
	void setFunctionAdmin(TypeRol value);

	/**
	 * Returns the value of the '<em><b>Has Relation Class</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.RelationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relation Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relation Class</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_HasRelationClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationClass> getHasRelationClass();

	/**
	 * Returns the value of the '<em><b>Go Relation Class</b></em>' reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.RelationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Relation Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Relation Class</em>' reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_GoRelationClass()
	 * @model
	 * @generated
	 */
	EList<RelationClass> getGoRelationClass();

	/**
	 * Returns the value of the '<em><b>Has Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Constraint</em>' containment reference.
	 * @see #setHasConstraint(Constraint)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getClass_HasConstraint()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getHasConstraint();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Class#getHasConstraint <em>Has Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Constraint</em>' containment reference.
	 * @see #getHasConstraint()
	 * @generated
	 */
	void setHasConstraint(Constraint value);

} // Class
