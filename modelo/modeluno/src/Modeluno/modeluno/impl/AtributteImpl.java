/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Atributte;
import Modeluno.modeluno.ModelunoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link Modeluno.modeluno.impl.AtributteImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.AtributteImpl#getPermissions <em>Permissions</em>}</li>
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermissions() <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMISSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected String permissions = PERMISSIONS_EDEFAULT;

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
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATRIBUTTE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermissions() {
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermissions(String newPermissions) {
		String oldPermissions = permissions;
		permissions = newPermissions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATRIBUTTE__PERMISSIONS, oldPermissions, permissions));
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
			case ModelunoPackage.ATRIBUTTE__DATA_TYPE:
				return getDataType();
			case ModelunoPackage.ATRIBUTTE__PERMISSIONS:
				return getPermissions();
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
			case ModelunoPackage.ATRIBUTTE__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case ModelunoPackage.ATRIBUTTE__PERMISSIONS:
				setPermissions((String)newValue);
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
			case ModelunoPackage.ATRIBUTTE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case ModelunoPackage.ATRIBUTTE__PERMISSIONS:
				setPermissions(PERMISSIONS_EDEFAULT);
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
			case ModelunoPackage.ATRIBUTTE__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case ModelunoPackage.ATRIBUTTE__PERMISSIONS:
				return PERMISSIONS_EDEFAULT == null ? permissions != null : !PERMISSIONS_EDEFAULT.equals(permissions);
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
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", permissions: ");
		result.append(permissions);
		result.append(')');
		return result.toString();
	}

} //AtributteImpl
