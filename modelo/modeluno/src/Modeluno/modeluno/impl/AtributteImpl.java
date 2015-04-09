/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Atributte;
import Modeluno.modeluno.ModelunoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.AtributteImpl#getAname <em>Aname</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.AtributteImpl#getEsDe <em>Es De</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtributteImpl extends MinimalEObjectImpl.Container implements Atributte {
	/**
	 * The default value of the '{@link #getAname() <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAname()
	 * @generated
	 * @ordered
	 */
	protected static final String ANAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAname() <em>Aname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAname()
	 * @generated
	 * @ordered
	 */
	protected String aname = ANAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEsDe() <em>Es De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsDe()
	 * @generated
	 * @ordered
	 */
	protected Modeluno.modeluno.Class esDe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.ATRIBUTTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAname() {
		return aname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAname(String newAname) {
		String oldAname = aname;
		aname = newAname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATRIBUTTE__ANAME, oldAname, aname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modeluno.modeluno.Class getEsDe() {
		if (esDe != null && esDe.eIsProxy()) {
			InternalEObject oldEsDe = (InternalEObject)esDe;
			esDe = (Modeluno.modeluno.Class)eResolveProxy(oldEsDe);
			if (esDe != oldEsDe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.ATRIBUTTE__ES_DE, oldEsDe, esDe));
			}
		}
		return esDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modeluno.modeluno.Class basicGetEsDe() {
		return esDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsDe(Modeluno.modeluno.Class newEsDe) {
		Modeluno.modeluno.Class oldEsDe = esDe;
		esDe = newEsDe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATRIBUTTE__ES_DE, oldEsDe, esDe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelunoPackage.ATRIBUTTE__ANAME:
				return getAname();
			case ModelunoPackage.ATRIBUTTE__ES_DE:
				if (resolve) return getEsDe();
				return basicGetEsDe();
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
			case ModelunoPackage.ATRIBUTTE__ANAME:
				setAname((String)newValue);
				return;
			case ModelunoPackage.ATRIBUTTE__ES_DE:
				setEsDe((Modeluno.modeluno.Class)newValue);
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
			case ModelunoPackage.ATRIBUTTE__ANAME:
				setAname(ANAME_EDEFAULT);
				return;
			case ModelunoPackage.ATRIBUTTE__ES_DE:
				setEsDe((Modeluno.modeluno.Class)null);
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
			case ModelunoPackage.ATRIBUTTE__ANAME:
				return ANAME_EDEFAULT == null ? aname != null : !ANAME_EDEFAULT.equals(aname);
			case ModelunoPackage.ATRIBUTTE__ES_DE:
				return esDe != null;
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
		result.append(" (Aname: ");
		result.append(aname);
		result.append(')');
		return result.toString();
	}

} //AtributteImpl
