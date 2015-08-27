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
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getAttribute_Destination <em>Attribute Destination</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_origin <em>Cardinality origin</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_Destination <em>Cardinality Destination</em>}</li>
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
	 * Returns the value of the '<em><b>Attribute Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Destination</em>' reference.
	 * @see #setAttribute_Destination(Attributes)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Attribute_Destination()
	 * @model
	 * @generated
	 */
	Attributes getAttribute_Destination();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getAttribute_Destination <em>Attribute Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Destination</em>' reference.
	 * @see #getAttribute_Destination()
	 * @generated
	 */
	void setAttribute_Destination(Attributes value);

	/**
	 * Returns the value of the '<em><b>Cardinality origin</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.typeCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality origin</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @see #setCardinality_origin(typeCardinality)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Cardinality_origin()
	 * @model
	 * @generated
	 */
	typeCardinality getCardinality_origin();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_origin <em>Cardinality origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality origin</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @see #getCardinality_origin()
	 * @generated
	 */
	void setCardinality_origin(typeCardinality value);

	/**
	 * Returns the value of the '<em><b>Cardinality Destination</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.typeCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Destination</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @see #setCardinality_Destination(typeCardinality)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_Cardinality_Destination()
	 * @model
	 * @generated
	 */
	typeCardinality getCardinality_Destination();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_Destination <em>Cardinality Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Destination</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @see #getCardinality_Destination()
	 * @generated
	 */
	void setCardinality_Destination(typeCardinality value);

} // RelationClass
