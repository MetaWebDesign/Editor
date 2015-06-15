/**
 */
package Metawebdesign.metawebdesign;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getPositionHorizontal <em>Position Horizontal</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getPositionVertical <em>Position Vertical</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getRViewsHasClass <em>RViews Has Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getRviewsGoToClass <em>Rviews Go To Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getGetAttribute <em>Get Attribute</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.RelationView#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView()
 * @model
 * @generated
 */
public interface RelationView extends EObject {
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationView#getName <em>Name</em>}' attribute.
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_TypePresentation()
	 * @model default="string"
	 * @generated
	 */
	typePresentation getTypePresentation();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationView#getTypePresentation <em>Type Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Presentation</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typePresentation
	 * @see #getTypePresentation()
	 * @generated
	 */
	void setTypePresentation(typePresentation value);

	/**
	 * Returns the value of the '<em><b>Position Horizontal</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.typeHorizontalPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Horizontal</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeHorizontalPosition
	 * @see #setPositionHorizontal(typeHorizontalPosition)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_PositionHorizontal()
	 * @model
	 * @generated
	 */
	typeHorizontalPosition getPositionHorizontal();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationView#getPositionHorizontal <em>Position Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Horizontal</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeHorizontalPosition
	 * @see #getPositionHorizontal()
	 * @generated
	 */
	void setPositionHorizontal(typeHorizontalPosition value);

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_PositionVertical()
	 * @model
	 * @generated
	 */
	int getPositionVertical();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationView#getPositionVertical <em>Position Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Vertical</em>' attribute.
	 * @see #getPositionVertical()
	 * @generated
	 */
	void setPositionVertical(int value);

	/**
	 * Returns the value of the '<em><b>RViews Has Class</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RViews Has Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RViews Has Class</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_RViewsHasClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metawebdesign.metawebdesign.Class> getRViewsHasClass();

	/**
	 * Returns the value of the '<em><b>Rviews Go To Class</b></em>' reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rviews Go To Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rviews Go To Class</em>' reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_RviewsGoToClass()
	 * @model
	 * @generated
	 */
	EList<Metawebdesign.metawebdesign.Class> getRviewsGoToClass();

	/**
	 * Returns the value of the '<em><b>Get Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Attribute</em>' reference.
	 * @see #setGetAttribute(Attributes)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_GetAttribute()
	 * @model
	 * @generated
	 */
	Attributes getGetAttribute();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationView#getGetAttribute <em>Get Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Attribute</em>' reference.
	 * @see #getGetAttribute()
	 * @generated
	 */
	void setGetAttribute(Attributes value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(int)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getRelationView_Row()
	 * @model
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.RelationView#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

} // RelationView
