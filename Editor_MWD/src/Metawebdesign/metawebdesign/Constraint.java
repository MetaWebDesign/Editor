/**
 */
package Metawebdesign.metawebdesign;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.Constraint#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Constraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Constraint#getValue <em>Value</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Constraint#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attributes)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getConstraint_Attribute()
	 * @model
	 * @generated
	 */
	Attributes getAttribute();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Constraint#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attributes value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeOperator
	 * @see #setOperator(TypeOperator)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getConstraint_Operator()
	 * @model
	 * @generated
	 */
	TypeOperator getOperator();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Constraint#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(TypeOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getConstraint_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Constraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeService
	 * @see #setService(TypeService)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getConstraint_Service()
	 * @model
	 * @generated
	 */
	TypeService getService();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Constraint#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeService
	 * @see #getService()
	 * @generated
	 */
	void setService(TypeService value);

} // Constraint
