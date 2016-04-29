/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.TypeAttributeForm;
import Metawebdesign.metawebdesign.TypeData;
import Metawebdesign.metawebdesign.TypeRol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.AttributesImpl#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.AttributesImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.AttributesImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.AttributesImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.AttributesImpl#getInTheForm <em>In The Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributesImpl extends MinimalEObjectImpl.Container implements Attributes {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRol ROL_EDEFAULT = TypeRol.ANONYMOUS;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected TypeRol rol = ROL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeData DATA_TYPE_EDEFAULT = TypeData.NONE;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected TypeData dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInTheForm() <em>In The Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTheForm()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAttributeForm IN_THE_FORM_EDEFAULT = TypeAttributeForm.REQUIRED;

	/**
	 * The cached value of the '{@link #getInTheForm() <em>In The Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTheForm()
	 * @generated
	 * @ordered
	 */
	protected TypeAttributeForm inTheForm = IN_THE_FORM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.ATTRIBUTES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol getRol() {
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRol(TypeRol newRol) {
		TypeRol oldRol = rol;
		rol = newRol == null ? ROL_EDEFAULT : newRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.ATTRIBUTES__ROL, oldRol, rol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(boolean newPrimaryKey) {
		boolean oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.ATTRIBUTES__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeData getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(TypeData newDataType) {
		TypeData oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.ATTRIBUTES__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAttributeForm getInTheForm() {
		return inTheForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInTheForm(TypeAttributeForm newInTheForm) {
		TypeAttributeForm oldInTheForm = inTheForm;
		inTheForm = newInTheForm == null ? IN_THE_FORM_EDEFAULT : newInTheForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.ATTRIBUTES__IN_THE_FORM, oldInTheForm, inTheForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetawebdesignPackage.ATTRIBUTES__NAME:
				return getName();
			case MetawebdesignPackage.ATTRIBUTES__ROL:
				return getRol();
			case MetawebdesignPackage.ATTRIBUTES__PRIMARY_KEY:
				return isPrimaryKey();
			case MetawebdesignPackage.ATTRIBUTES__DATA_TYPE:
				return getDataType();
			case MetawebdesignPackage.ATTRIBUTES__IN_THE_FORM:
				return getInTheForm();
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
			case MetawebdesignPackage.ATTRIBUTES__NAME:
				setName((String)newValue);
				return;
			case MetawebdesignPackage.ATTRIBUTES__ROL:
				setRol((TypeRol)newValue);
				return;
			case MetawebdesignPackage.ATTRIBUTES__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
				return;
			case MetawebdesignPackage.ATTRIBUTES__DATA_TYPE:
				setDataType((TypeData)newValue);
				return;
			case MetawebdesignPackage.ATTRIBUTES__IN_THE_FORM:
				setInTheForm((TypeAttributeForm)newValue);
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
			case MetawebdesignPackage.ATTRIBUTES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetawebdesignPackage.ATTRIBUTES__ROL:
				setRol(ROL_EDEFAULT);
				return;
			case MetawebdesignPackage.ATTRIBUTES__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case MetawebdesignPackage.ATTRIBUTES__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case MetawebdesignPackage.ATTRIBUTES__IN_THE_FORM:
				setInTheForm(IN_THE_FORM_EDEFAULT);
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
			case MetawebdesignPackage.ATTRIBUTES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetawebdesignPackage.ATTRIBUTES__ROL:
				return rol != ROL_EDEFAULT;
			case MetawebdesignPackage.ATTRIBUTES__PRIMARY_KEY:
				return primaryKey != PRIMARY_KEY_EDEFAULT;
			case MetawebdesignPackage.ATTRIBUTES__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case MetawebdesignPackage.ATTRIBUTES__IN_THE_FORM:
				return inTheForm != IN_THE_FORM_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", rol: ");
		result.append(rol);
		result.append(", PrimaryKey: ");
		result.append(primaryKey);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", inTheForm: ");
		result.append(inTheForm);
		result.append(')');
		return result.toString();
	}

} //AttributesImpl
