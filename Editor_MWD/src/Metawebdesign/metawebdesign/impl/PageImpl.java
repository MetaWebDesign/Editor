/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.Page;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.PageImpl#getContent_HTML <em>Content HTML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends ViewsImpl implements Page {
	/**
	 * The default value of the '{@link #getContent_HTML() <em>Content HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent_HTML()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_HTML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent_HTML() <em>Content HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent_HTML()
	 * @generated
	 * @ordered
	 */
	protected String content_HTML = CONTENT_HTML_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent_HTML() {
		return content_HTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent_HTML(String newContent_HTML) {
		String oldContent_HTML = content_HTML;
		content_HTML = newContent_HTML;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.PAGE__CONTENT_HTML, oldContent_HTML, content_HTML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetawebdesignPackage.PAGE__CONTENT_HTML:
				return getContent_HTML();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetawebdesignPackage.PAGE__CONTENT_HTML:
				setContent_HTML((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetawebdesignPackage.PAGE__CONTENT_HTML:
				setContent_HTML(CONTENT_HTML_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetawebdesignPackage.PAGE__CONTENT_HTML:
				return CONTENT_HTML_EDEFAULT == null ? content_HTML != null : !CONTENT_HTML_EDEFAULT.equals(content_HTML);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Content_HTML: ");
		result.append(content_HTML);
		result.append(')');
		return result.toString();
	}

} //PageImpl
