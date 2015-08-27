/**
 */
package Metawebdesign.metawebdesign;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.ViewAttribute#getGetAttribute <em>Get Attribute</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.ViewAttribute#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.ViewAttribute#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.ViewAttribute#getPositionHorizontal <em>Position Horizontal</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.ViewAttribute#getPostionVertical <em>Postion Vertical</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.ViewAttribute#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViewAttribute()
 * @model
 * @generated
 */
public interface ViewAttribute extends ViewComponent {
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViewAttribute_GetAttribute()
	 * @model
	 * @generated
	 */
	Attributes getGetAttribute();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.ViewAttribute#getGetAttribute <em>Get Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Attribute</em>' reference.
	 * @see #getGetAttribute()
	 * @generated
	 */
	void setGetAttribute(Attributes value);

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViewAttribute_TypePresentation()
	 * @model default="string"
	 * @generated
	 */
	typePresentation getTypePresentation();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.ViewAttribute#getTypePresentation <em>Type Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Presentation</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typePresentation
	 * @see #getTypePresentation()
	 * @generated
	 */
	void setTypePresentation(typePresentation value);

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViewAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.ViewAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViewAttribute_PositionHorizontal()
	 * @model
	 * @generated
	 */
	typeHorizontalPosition getPositionHorizontal();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.ViewAttribute#getPositionHorizontal <em>Position Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Horizontal</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeHorizontalPosition
	 * @see #getPositionHorizontal()
	 * @generated
	 */
	void setPositionHorizontal(typeHorizontalPosition value);

	/**
	 * Returns the value of the '<em><b>Postion Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postion Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postion Vertical</em>' attribute.
	 * @see #setPostionVertical(int)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViewAttribute_PostionVertical()
	 * @model
	 * @generated
	 */
	int getPostionVertical();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.ViewAttribute#getPostionVertical <em>Postion Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postion Vertical</em>' attribute.
	 * @see #getPostionVertical()
	 * @generated
	 */
	void setPostionVertical(int value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * The default value is <code>"DataBase"</code>.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.typeViewAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeViewAttribute
	 * @see #setFrom(typeViewAttribute)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getViewAttribute_From()
	 * @model default="DataBase"
	 * @generated
	 */
	typeViewAttribute getFrom();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.ViewAttribute#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeViewAttribute
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(typeViewAttribute value);

} // ViewAttribute
