/**
 */
package Metawebdesign.metawebdesign;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Atribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.CallAtribute#getGetAttribute <em>Get Attribute</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.CallAtribute#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.CallAtribute#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.CallAtribute#getPositionHorizontal <em>Position Horizontal</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.CallAtribute#getPostionVertical <em>Postion Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getCallAtribute()
 * @model
 * @generated
 */
public interface CallAtribute extends ViewComponent {
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getCallAtribute_GetAttribute()
	 * @model
	 * @generated
	 */
	Attributes getGetAttribute();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.CallAtribute#getGetAttribute <em>Get Attribute</em>}' reference.
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getCallAtribute_TypePresentation()
	 * @model default="string"
	 * @generated
	 */
	typePresentation getTypePresentation();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.CallAtribute#getTypePresentation <em>Type Presentation</em>}' attribute.
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getCallAtribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.CallAtribute#getName <em>Name</em>}' attribute.
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getCallAtribute_PositionHorizontal()
	 * @model
	 * @generated
	 */
	typeHorizontalPosition getPositionHorizontal();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.CallAtribute#getPositionHorizontal <em>Position Horizontal</em>}' attribute.
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getCallAtribute_PostionVertical()
	 * @model
	 * @generated
	 */
	int getPostionVertical();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.CallAtribute#getPostionVertical <em>Postion Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postion Vertical</em>' attribute.
	 * @see #getPostionVertical()
	 * @generated
	 */
	void setPostionVertical(int value);

} // CallAtribute
