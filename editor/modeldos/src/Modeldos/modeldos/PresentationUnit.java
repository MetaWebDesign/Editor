/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeldos.modeldos.PresentationUnit#getNameFeild <em>Name Feild</em>}</li>
 *   <li>{@link Modeldos.modeldos.PresentationUnit#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Modeldos.modeldos.PresentationUnit#getHorizontalPosition <em>Horizontal Position</em>}</li>
 *   <li>{@link Modeldos.modeldos.PresentationUnit#getVerticalPosition <em>Vertical Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeldos.modeldos.ModeldosPackage#getPresentationUnit()
 * @model
 * @generated
 */
public interface PresentationUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Feild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Feild</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Feild</em>' attribute.
	 * @see #setNameFeild(String)
	 * @see Modeldos.modeldos.ModeldosPackage#getPresentationUnit_NameFeild()
	 * @model
	 * @generated
	 */
	String getNameFeild();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.PresentationUnit#getNameFeild <em>Name Feild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Feild</em>' attribute.
	 * @see #getNameFeild()
	 * @generated
	 */
	void setNameFeild(String value);

	/**
	 * Returns the value of the '<em><b>Type Presentation</b></em>' attribute.
	 * The default value is <code>"text"</code>.
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
	 * @see Modeldos.modeldos.ModeldosPackage#getPresentationUnit_TypePresentation()
	 * @model default="text"
	 * @generated
	 */
	typePresentation getTypePresentation();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.PresentationUnit#getTypePresentation <em>Type Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Presentation</em>' attribute.
	 * @see Modeldos.modeldos.typePresentation
	 * @see #getTypePresentation()
	 * @generated
	 */
	void setTypePresentation(typePresentation value);

	/**
	 * Returns the value of the '<em><b>Horizontal Position</b></em>' attribute.
	 * The default value is <code>"center"</code>.
	 * The literals are from the enumeration {@link Modeldos.modeldos.typeHorizontalPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Position</em>' attribute.
	 * @see Modeldos.modeldos.typeHorizontalPosition
	 * @see #setHorizontalPosition(typeHorizontalPosition)
	 * @see Modeldos.modeldos.ModeldosPackage#getPresentationUnit_HorizontalPosition()
	 * @model default="center"
	 * @generated
	 */
	typeHorizontalPosition getHorizontalPosition();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.PresentationUnit#getHorizontalPosition <em>Horizontal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Position</em>' attribute.
	 * @see Modeldos.modeldos.typeHorizontalPosition
	 * @see #getHorizontalPosition()
	 * @generated
	 */
	void setHorizontalPosition(typeHorizontalPosition value);

	/**
	 * Returns the value of the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Position</em>' attribute.
	 * @see #setVerticalPosition(int)
	 * @see Modeldos.modeldos.ModeldosPackage#getPresentationUnit_VerticalPosition()
	 * @model
	 * @generated
	 */
	int getVerticalPosition();

	/**
	 * Sets the value of the '{@link Modeldos.modeldos.PresentationUnit#getVerticalPosition <em>Vertical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Position</em>' attribute.
	 * @see #getVerticalPosition()
	 * @generated
	 */
	void setVerticalPosition(int value);

} // PresentationUnit
