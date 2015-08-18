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
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getAttribute_Class_A <em>Attribute Class A</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getAttribute_Class_B <em>Attribute Class B</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_Class_A <em>Cardinality Class A</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_Class_B <em>Cardinality Class B</em>}</li>
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
	 * Returns the value of the '<em><b>Attribute Class A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Class A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Class A</em>' reference.
	 * @see #setAttribute_Class_A(Attributes)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Attribute_Class_A()
	 * @model
	 * @generated
	 */
	Attributes getAttribute_Class_A();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getAttribute_Class_A <em>Attribute Class A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Class A</em>' reference.
	 * @see #getAttribute_Class_A()
	 * @generated
	 */
	void setAttribute_Class_A(Attributes value);

	/**
	 * Returns the value of the '<em><b>Attribute Class B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Class B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Class B</em>' reference.
	 * @see #setAttribute_Class_B(Attributes)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Attribute_Class_B()
	 * @model
	 * @generated
	 */
	Attributes getAttribute_Class_B();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getAttribute_Class_B <em>Attribute Class B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Class B</em>' reference.
	 * @see #getAttribute_Class_B()
	 * @generated
	 */
	void setAttribute_Class_B(Attributes value);

	/**
	 * Returns the value of the '<em><b>Cardinality Class A</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.typeCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Class A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Class A</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @see #setCardinality_Class_A(typeCardinality)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Cardinality_Class_A()
	 * @model
	 * @generated
	 */
	typeCardinality getCardinality_Class_A();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_Class_A <em>Cardinality Class A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Class A</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @see #getCardinality_Class_A()
	 * @generated
	 */
	void setCardinality_Class_A(typeCardinality value);

	/**
	 * Returns the value of the '<em><b>Cardinality Class B</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.typeCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Class B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Class B</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @see #setCardinality_Class_B(typeCardinality)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Cardinality_Class_B()
	 * @model
	 * @generated
	 */
	typeCardinality getCardinality_Class_B();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_Class_B <em>Cardinality Class B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Class B</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @see #getCardinality_Class_B()
	 * @generated
	 */
	void setCardinality_Class_B(typeCardinality value);

} // RelationClass
