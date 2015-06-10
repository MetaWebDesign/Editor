/**
 */
package Modeldos.modeldos;

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
 *   <li>{@link Modeldos.modeldos.RelationClass#getName <em>Name</em>}</li>
 *   <li>{@link Modeldos.modeldos.RelationClass#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Modeldos.modeldos.RelationClass#getPositionHorizotal <em>Position Horizotal</em>}</li>
 *   <li>{@link Modeldos.modeldos.RelationClass#getPositionVertical <em>Position Vertical</em>}</li>
 *   <li>{@link Modeldos.modeldos.RelationClass#getFromClass <em>From Class</em>}</li>
 *   <li>{@link Modeldos.modeldos.RelationClass#getAttributeGet <em>Attribute Get</em>}</li>
 *   <li>{@link Modeldos.modeldos.RelationClass#getAttributeReplace <em>Attribute Replace</em>}</li>
 *   <li>{@link Modeldos.modeldos.RelationClass#getAttributeSave <em>Attribute Save</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getRelationClass()
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
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.RelationClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Presentation</b></em>' attribute.
	 * The default value is <code>"string"</code>.
	 * The literals are from the enumeration {@link Modeldos.modeldos.typePresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Presentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Presentation</em>' attribute.
	 * @see Modeldos.modeldos.typePresentation
	 * @see #setTypePresentation(typePresentation)
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationClass_TypePresentation()
	 * @model default="string"
	 * @generated
	 */
	typePresentation getTypePresentation();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.RelationClass#getTypePresentation <em>Type Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Presentation</em>' attribute.
	 * @see Modeldos.modeldos.typePresentation
	 * @see #getTypePresentation()
	 * @generated
	 */
	void setTypePresentation(typePresentation value);

	/**
	 * Returns the value of the '<em><b>Position Horizotal</b></em>' attribute.
	 * The default value is <code>"center"</code>.
	 * The literals are from the enumeration {@link Modeldos.modeldos.typeHorizontalPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Horizotal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Horizotal</em>' attribute.
	 * @see Modeldos.modeldos.typeHorizontalPosition
	 * @see #setPositionHorizotal(typeHorizontalPosition)
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationClass_PositionHorizotal()
	 * @model default="center"
	 * @generated
	 */
	typeHorizontalPosition getPositionHorizotal();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.RelationClass#getPositionHorizotal <em>Position Horizotal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Horizotal</em>' attribute.
	 * @see Modeldos.modeldos.typeHorizontalPosition
	 * @see #getPositionHorizotal()
	 * @generated
	 */
	void setPositionHorizotal(typeHorizontalPosition value);

	/**
	 * Returns the value of the '<em><b>Position Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Vertical</em>' attribute.
	 * @see #setPositionVertical(int)
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationClass_PositionVertical()
	 * @model
	 * @generated
	 */
	int getPositionVertical();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.RelationClass#getPositionVertical <em>Position Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Vertical</em>' attribute.
	 * @see #getPositionVertical()
	 * @generated
	 */
	void setPositionVertical(int value);

	/**
	 * Returns the value of the '<em><b>From Class</b></em>' reference list.
	 * The list contents are of type {@link Modeldos.modeldos.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Class</em>' reference list.
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationClass_FromClass()
	 * @model
	 * @generated
	 */
	EList<Modeldos.modeldos.Class> getFromClass();

	/**
	 * Returns the value of the '<em><b>Attribute Get</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Get</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Get</em>' reference.
	 * @see #setAttributeGet(Attributes)
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationClass_AttributeGet()
	 * @model
	 * @generated
	 */
	Attributes getAttributeGet();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.RelationClass#getAttributeGet <em>Attribute Get</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Get</em>' reference.
	 * @see #getAttributeGet()
	 * @generated
	 */
	void setAttributeGet(Attributes value);

	/**
	 * Returns the value of the '<em><b>Attribute Replace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Replace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Replace</em>' reference.
	 * @see #setAttributeReplace(Attributes)
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationClass_AttributeReplace()
	 * @model
	 * @generated
	 */
	Attributes getAttributeReplace();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.RelationClass#getAttributeReplace <em>Attribute Replace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Replace</em>' reference.
	 * @see #getAttributeReplace()
	 * @generated
	 */
	void setAttributeReplace(Attributes value);

	/**
	 * Returns the value of the '<em><b>Attribute Save</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Save</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Save</em>' reference.
	 * @see #setAttributeSave(Attributes)
	 * @see Modeldos.modeldos.ModeldosPackage#getRelationClass_AttributeSave()
	 * @model
	 * @generated
	 */
	Attributes getAttributeSave();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.RelationClass#getAttributeSave <em>Attribute Save</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Save</em>' reference.
	 * @see #getAttributeSave()
	 * @generated
	 */
	void setAttributeSave(Attributes value);

} // RelationClass
