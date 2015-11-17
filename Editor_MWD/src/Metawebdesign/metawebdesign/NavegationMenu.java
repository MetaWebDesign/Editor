/**
 */
package Metawebdesign.metawebdesign;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navegation Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.NavegationMenu#getHasLink <em>Has Link</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.NavegationMenu#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.NavegationMenu#getTypeMenu <em>Type Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getNavegationMenu()
 * @model
 * @generated
 */
public interface NavegationMenu extends ViewComponent {
	/**
	 * Returns the value of the '<em><b>Has Link</b></em>' containment reference list.
	 * The list contents are of type {@link Metawebdesign.metawebdesign.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Link</em>' containment reference list.
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getNavegationMenu_HasLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getHasLink();

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getNavegationMenu_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.NavegationMenu#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Menu</b></em>' attribute.
	 * The literals are from the enumeration {@link Metawebdesign.metawebdesign.typeMenus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Menu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Menu</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeMenus
	 * @see #setTypeMenu(typeMenus)
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getNavegationMenu_TypeMenu()
	 * @model
	 * @generated
	 */
	typeMenus getTypeMenu();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.NavegationMenu#getTypeMenu <em>Type Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Menu</em>' attribute.
	 * @see Metawebdesign.metawebdesign.typeMenus
	 * @see #getTypeMenu()
	 * @generated
	 */
	void setTypeMenu(typeMenus value);

} // NavegationMenu
