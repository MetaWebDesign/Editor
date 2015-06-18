/**
 */
package Metawebdesign.metawebdesign;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getFromClass <em>From Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getClass_A <em>Class A</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getClass_B <em>Class B</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass()
 * @model
 * @generated
 */
public interface RelationClass extends EObject {
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From Class</b></em>' reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Class</em>' reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_FromClass()
	 * @model
	 * @generated
	 */
	EList<Metawebdesign.metawebdesign.Class> getFromClass();

	/**
	 * Returns the value of the '<em><b>Class A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class A</em>' reference.
	 * @see #setClass_A(Attributes)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Class_A()
	 * @model
	 * @generated
	 */
	Attributes getClass_A();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getClass_A <em>Class A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class A</em>' reference.
	 * @see #getClass_A()
	 * @generated
	 */
	void setClass_A(Attributes value);

	/**
	 * Returns the value of the '<em><b>Class B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class B</em>' reference.
	 * @see #setClass_B(Attributes)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Class_B()
	 * @model
	 * @generated
	 */
	Attributes getClass_B();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getClass_B <em>Class B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class B</em>' reference.
	 * @see #getClass_B()
	 * @generated
	 */
	void setClass_B(Attributes value);

} // RelationClass
