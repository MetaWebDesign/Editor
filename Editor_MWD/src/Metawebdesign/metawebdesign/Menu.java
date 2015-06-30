/**
 */
package Metawebdesign.metawebdesign;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.Menu#getHasGroup <em>Has Group</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Menu#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.Menu#getOrientated <em>Orientated</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Group</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Group</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getMenu_HasGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getHasGroup();

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getMenu_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Menu#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Orientated</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.TypeOrientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientated</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeOrientation
	 * @see #setOrientated(TypeOrientation)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getMenu_Orientated()
	 * @model
	 * @generated
	 */
	TypeOrientation getOrientated();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.Menu#getOrientated <em>Orientated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientated</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeOrientation
	 * @see #getOrientated()
	 * @generated
	 */
	void setOrientated(TypeOrientation value);

} // Menu
