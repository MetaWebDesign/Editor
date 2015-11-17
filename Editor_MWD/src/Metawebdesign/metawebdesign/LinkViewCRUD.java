/**
 */
package Metawebdesign.metawebdesign;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link View CRUD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.LinkViewCRUD#getService <em>Service</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.LinkViewCRUD#getFromClass <em>From Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getLinkViewCRUD()
 * @model
 * @generated
 */
public interface LinkViewCRUD extends Link {
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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getLinkViewCRUD_Service()
	 * @model
	 * @generated
	 */
	TypeService getService();

	/**
	 * Sets the value of the '{@link Metawebdesign.metawebdesign.LinkViewCRUD#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see Metawebdesign.metawebdesign.TypeService
	 * @see #getService()
	 * @generated
	 */
	void setService(TypeService value);

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getLinkViewCRUD_FromClass()
	 * @model
	 * @generated
	 */
	EList<Metawebdesign.metawebdesign.Class> getFromClass();

} // LinkViewCRUD
