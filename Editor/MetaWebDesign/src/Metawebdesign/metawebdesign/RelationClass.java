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
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getPositionHorizotal <em>Position Horizotal</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getPositionVertical <em>Position Vertical</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getFromClass <em>From Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getAttributeGet <em>Attribute Get</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getAttributeReplace <em>Attribute Replace</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationClass#getAttributeSave <em>Attribute Save</em>}</li>
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
	 * Returns the value of the '<em><b>Type Presentation</b></em>' attribute.
	 * The default value is <code>"table"</code>.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.typePresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Presentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Presentation</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typePresentation
	 * @see #setTypePresentation(typePresentation)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_TypePresentation()
	 * @model default="table"
	 * @generated
	 */
	typePresentation getTypePresentation();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getTypePresentation <em>Type Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Presentation</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typePresentation
	 * @see #getTypePresentation()
	 * @generated
	 */
	void setTypePresentation(typePresentation value);

	/**
	 * Returns the value of the '<em><b>Position Horizotal</b></em>' attribute.
	 * The default value is <code>"center"</code>.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.typeHorizontalPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Horizotal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Horizotal</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeHorizontalPosition
	 * @see #setPositionHorizotal(typeHorizontalPosition)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_PositionHorizotal()
	 * @model default="center"
	 * @generated
	 */
	typeHorizontalPosition getPositionHorizotal();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getPositionHorizotal <em>Position Horizotal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Horizotal</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeHorizontalPosition
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_PositionVertical()
	 * @model
	 * @generated
	 */
	int getPositionVertical();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getPositionVertical <em>Position Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Vertical</em>' attribute.
	 * @see #getPositionVertical()
	 * @generated
	 */
	void setPositionVertical(int value);

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
	 * Returns the value of the '<em><b>Attribute Get</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Get</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Get</em>' reference.
	 * @see #setAttributeGet(Attributes)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_AttributeGet()
	 * @model
	 * @generated
	 */
	Attributes getAttributeGet();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getAttributeGet <em>Attribute Get</em>}' reference.
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_AttributeReplace()
	 * @model
	 * @generated
	 */
	Attributes getAttributeReplace();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getAttributeReplace <em>Attribute Replace</em>}' reference.
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationClass_AttributeSave()
	 * @model
	 * @generated
	 */
	Attributes getAttributeSave();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationClass#getAttributeSave <em>Attribute Save</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Save</em>' reference.
	 * @see #getAttributeSave()
	 * @generated
	 */
	void setAttributeSave(Attributes value);

} // RelationClass
