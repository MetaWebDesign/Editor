/**
 */
package Modelouno.modeluno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presetation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelouno.modeluno.PresetationUnit#getName_field <em>Name field</em>}</li>
 *   <li>{@link Modelouno.modeluno.PresetationUnit#getType <em>Type</em>}</li>
 *   <li>{@link Modelouno.modeluno.PresetationUnit#getHorizontalPosition <em>Horizontal Position</em>}</li>
 *   <li>{@link Modelouno.modeluno.PresetationUnit#getVerticalPosition <em>Vertical Position</em>}</li>
 *   <li>{@link Modelouno.modeluno.PresetationUnit#getPUhasViews <em>PUhas Views</em>}</li>
 *   <li>{@link Modelouno.modeluno.PresetationUnit#getPUgoToViews <em>PUgo To Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelouno.modeluno.ModelunoPackage#getPresetationUnit()
 * @model
 * @generated
 */
public interface PresetationUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Name field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name field</em>' attribute.
	 * @see #setName_field(String)
	 * @see Modelouno.modeluno.ModelunoPackage#getPresetationUnit_Name_field()
	 * @model
	 * @generated
	 */
	String getName_field();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.PresetationUnit#getName_field <em>Name field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name field</em>' attribute.
	 * @see #getName_field()
	 * @generated
	 */
	void setName_field(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Modelouno.modeluno.TypesView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Modelouno.modeluno.TypesView
	 * @see #setType(TypesView)
	 * @see Modelouno.modeluno.ModelunoPackage#getPresetationUnit_Type()
	 * @model
	 * @generated
	 */
	TypesView getType();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.PresetationUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Modelouno.modeluno.TypesView
	 * @see #getType()
	 * @generated
	 */
	void setType(TypesView value);

	/**
	 * Returns the value of the '<em><b>Horizontal Position</b></em>' attribute.
	 * The literals are from the enumeration {@link Modelouno.modeluno.typeHorizotalPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Position</em>' attribute.
	 * @see Modelouno.modeluno.typeHorizotalPosition
	 * @see #setHorizontalPosition(typeHorizotalPosition)
	 * @see Modelouno.modeluno.ModelunoPackage#getPresetationUnit_HorizontalPosition()
	 * @model
	 * @generated
	 */
	typeHorizotalPosition getHorizontalPosition();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.PresetationUnit#getHorizontalPosition <em>Horizontal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Position</em>' attribute.
	 * @see Modelouno.modeluno.typeHorizotalPosition
	 * @see #getHorizontalPosition()
	 * @generated
	 */
	void setHorizontalPosition(typeHorizotalPosition value);

	/**
	 * Returns the value of the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Position</em>' attribute.
	 * @see #setVerticalPosition(String)
	 * @see Modelouno.modeluno.ModelunoPackage#getPresetationUnit_VerticalPosition()
	 * @model
	 * @generated
	 */
	String getVerticalPosition();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.PresetationUnit#getVerticalPosition <em>Vertical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Position</em>' attribute.
	 * @see #getVerticalPosition()
	 * @generated
	 */
	void setVerticalPosition(String value);

	/**
	 * Returns the value of the '<em><b>PUhas Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PUhas Views</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PUhas Views</em>' containment reference.
	 * @see #setPUhasViews(Views)
	 * @see Modelouno.modeluno.ModelunoPackage#getPresetationUnit_PUhasViews()
	 * @model containment="true"
	 * @generated
	 */
	Views getPUhasViews();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.PresetationUnit#getPUhasViews <em>PUhas Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PUhas Views</em>' containment reference.
	 * @see #getPUhasViews()
	 * @generated
	 */
	void setPUhasViews(Views value);

	/**
	 * Returns the value of the '<em><b>PUgo To Views</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PUgo To Views</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PUgo To Views</em>' reference.
	 * @see #setPUgoToViews(Views)
	 * @see Modelouno.modeluno.ModelunoPackage#getPresetationUnit_PUgoToViews()
	 * @model
	 * @generated
	 */
	Views getPUgoToViews();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.PresetationUnit#getPUgoToViews <em>PUgo To Views</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PUgo To Views</em>' reference.
	 * @see #getPUgoToViews()
	 * @generated
	 */
	void setPUgoToViews(Views value);

} // PresetationUnit
