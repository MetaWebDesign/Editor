/**
 */
package Modelouno.modeluno.impl;

import Modelouno.modeluno.Attribute;
import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.PresetationUnit;
import Modelouno.modeluno.Rol;
import Modelouno.modeluno.TypeAttributeForm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelouno.modeluno.impl.AttributeImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.AttributeImpl#getAname <em>Aname</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.AttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.AttributeImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.AttributeImpl#getInTheForm <em>In The Form</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.AttributeImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.AttributeImpl#getHas <em>Has</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.AttributeImpl#getHasPresentationUnit <em>Has Presentation Unit</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.AttributeImpl#getAgoToPU <em>Ago To PU</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
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
	 * The default value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected static final Rol ROL_EDEFAULT = Rol.ANONYMOUS;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected Rol rol = ROL_EDEFAULT;

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
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected String valor = VALOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected PresetationUnit has;

	/**
	 * The cached value of the '{@link #getHasPresentationUnit() <em>Has Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPresentationUnit()
	 * @generated
	 * @ordered
	 */
	protected PresetationUnit hasPresentationUnit;

	/**
	 * The cached value of the '{@link #getAgoToPU() <em>Ago To PU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgoToPU()
	 * @generated
	 * @ordered
	 */
	protected PresetationUnit agoToPU;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__ANAME, oldAname, aname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rol getRol() {
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRol(Rol newRol) {
		Rol oldRol = rol;
		rol = newRol == null ? ROL_EDEFAULT : newRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__ROL, oldRol, rol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__IN_THE_FORM, oldInTheForm, inTheForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(String newValor) {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresetationUnit getHas() {
		if (has != null && has.eIsProxy()) {
			InternalEObject oldHas = (InternalEObject)has;
			has = (PresetationUnit)eResolveProxy(oldHas);
			if (has != oldHas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.ATTRIBUTE__HAS, oldHas, has));
			}
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresetationUnit basicGetHas() {
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas(PresetationUnit newHas) {
		PresetationUnit oldHas = has;
		has = newHas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__HAS, oldHas, has));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresetationUnit getHasPresentationUnit() {
		return hasPresentationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasPresentationUnit(PresetationUnit newHasPresentationUnit, NotificationChain msgs) {
		PresetationUnit oldHasPresentationUnit = hasPresentationUnit;
		hasPresentationUnit = newHasPresentationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__HAS_PRESENTATION_UNIT, oldHasPresentationUnit, newHasPresentationUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPresentationUnit(PresetationUnit newHasPresentationUnit) {
		if (newHasPresentationUnit != hasPresentationUnit) {
			NotificationChain msgs = null;
			if (hasPresentationUnit != null)
				msgs = ((InternalEObject)hasPresentationUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.ATTRIBUTE__HAS_PRESENTATION_UNIT, null, msgs);
			if (newHasPresentationUnit != null)
				msgs = ((InternalEObject)newHasPresentationUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.ATTRIBUTE__HAS_PRESENTATION_UNIT, null, msgs);
			msgs = basicSetHasPresentationUnit(newHasPresentationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__HAS_PRESENTATION_UNIT, newHasPresentationUnit, newHasPresentationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresetationUnit getAgoToPU() {
		if (agoToPU != null && agoToPU.eIsProxy()) {
			InternalEObject oldAgoToPU = (InternalEObject)agoToPU;
			agoToPU = (PresetationUnit)eResolveProxy(oldAgoToPU);
			if (agoToPU != oldAgoToPU) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.ATTRIBUTE__AGO_TO_PU, oldAgoToPU, agoToPU));
			}
		}
		return agoToPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresetationUnit basicGetAgoToPU() {
		return agoToPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgoToPU(PresetationUnit newAgoToPU) {
		PresetationUnit oldAgoToPU = agoToPU;
		agoToPU = newAgoToPU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.ATTRIBUTE__AGO_TO_PU, oldAgoToPU, agoToPU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.ATTRIBUTE__HAS_PRESENTATION_UNIT:
				return basicSetHasPresentationUnit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelunoPackage.ATTRIBUTE__PRIMARY_KEY:
				return isPrimaryKey();
			case ModelunoPackage.ATTRIBUTE__ANAME:
				return getAname();
			case ModelunoPackage.ATTRIBUTE__DATA_TYPE:
				return getDataType();
			case ModelunoPackage.ATTRIBUTE__ROL:
				return getRol();
			case ModelunoPackage.ATTRIBUTE__IN_THE_FORM:
				return getInTheForm();
			case ModelunoPackage.ATTRIBUTE__VALOR:
				return getValor();
			case ModelunoPackage.ATTRIBUTE__HAS:
				if (resolve) return getHas();
				return basicGetHas();
			case ModelunoPackage.ATTRIBUTE__HAS_PRESENTATION_UNIT:
				return getHasPresentationUnit();
			case ModelunoPackage.ATTRIBUTE__AGO_TO_PU:
				if (resolve) return getAgoToPU();
				return basicGetAgoToPU();
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
			case ModelunoPackage.ATTRIBUTE__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE__ANAME:
				setAname((String)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE__ROL:
				setRol((Rol)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE__IN_THE_FORM:
				setInTheForm((TypeAttributeForm)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE__VALOR:
				setValor((String)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE__HAS:
				setHas((PresetationUnit)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE__HAS_PRESENTATION_UNIT:
				setHasPresentationUnit((PresetationUnit)newValue);
				return;
			case ModelunoPackage.ATTRIBUTE__AGO_TO_PU:
				setAgoToPU((PresetationUnit)newValue);
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
			case ModelunoPackage.ATTRIBUTE__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case ModelunoPackage.ATTRIBUTE__ANAME:
				setAname(ANAME_EDEFAULT);
				return;
			case ModelunoPackage.ATTRIBUTE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case ModelunoPackage.ATTRIBUTE__ROL:
				setRol(ROL_EDEFAULT);
				return;
			case ModelunoPackage.ATTRIBUTE__IN_THE_FORM:
				setInTheForm(IN_THE_FORM_EDEFAULT);
				return;
			case ModelunoPackage.ATTRIBUTE__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case ModelunoPackage.ATTRIBUTE__HAS:
				setHas((PresetationUnit)null);
				return;
			case ModelunoPackage.ATTRIBUTE__HAS_PRESENTATION_UNIT:
				setHasPresentationUnit((PresetationUnit)null);
				return;
			case ModelunoPackage.ATTRIBUTE__AGO_TO_PU:
				setAgoToPU((PresetationUnit)null);
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
			case ModelunoPackage.ATTRIBUTE__PRIMARY_KEY:
				return primaryKey != PRIMARY_KEY_EDEFAULT;
			case ModelunoPackage.ATTRIBUTE__ANAME:
				return ANAME_EDEFAULT == null ? aname != null : !ANAME_EDEFAULT.equals(aname);
			case ModelunoPackage.ATTRIBUTE__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case ModelunoPackage.ATTRIBUTE__ROL:
				return rol != ROL_EDEFAULT;
			case ModelunoPackage.ATTRIBUTE__IN_THE_FORM:
				return inTheForm != IN_THE_FORM_EDEFAULT;
			case ModelunoPackage.ATTRIBUTE__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
			case ModelunoPackage.ATTRIBUTE__HAS:
				return has != null;
			case ModelunoPackage.ATTRIBUTE__HAS_PRESENTATION_UNIT:
				return hasPresentationUnit != null;
			case ModelunoPackage.ATTRIBUTE__AGO_TO_PU:
				return agoToPU != null;
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
		result.append(" (PrimaryKey: ");
		result.append(primaryKey);
		result.append(", aname: ");
		result.append(aname);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", rol: ");
		result.append(rol);
		result.append(", inTheForm: ");
		result.append(inTheForm);
		result.append(", valor: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
