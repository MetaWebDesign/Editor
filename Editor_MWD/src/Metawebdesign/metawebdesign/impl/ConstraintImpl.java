/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Constraint;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.NotDerived;
import Metawebdesign.metawebdesign.TypeOperator;
import Metawebdesign.metawebdesign.TypeService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ConstraintImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ConstraintImpl#getService <em>Service</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ConstraintImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ConstraintImpl#getMansajeError <em>Mansaje Error</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ConstraintImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOperator OPERATOR_EDEFAULT = TypeOperator.MENOR;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected TypeOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final TypeService SERVICE_EDEFAULT = TypeService.NULL;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected TypeService service = SERVICE_EDEFAULT;

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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected NotDerived attribute;

	/**
	 * The default value of the '{@link #getMansajeError() <em>Mansaje Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMansajeError()
	 * @generated
	 * @ordered
	 */
	protected static final String MANSAJE_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMansajeError() <em>Mansaje Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMansajeError()
	 * @generated
	 * @ordered
	 */
	protected String mansajeError = MANSAJE_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(TypeOperator newOperator) {
		TypeOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CONSTRAINT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeService getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(TypeService newService) {
		TypeService oldService = service;
		service = newService == null ? SERVICE_EDEFAULT : newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CONSTRAINT__SERVICE, oldService, service));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotDerived getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (NotDerived)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.CONSTRAINT__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotDerived basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(NotDerived newAttribute) {
		NotDerived oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CONSTRAINT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMansajeError() {
		return mansajeError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMansajeError(String newMansajeError) {
		String oldMansajeError = mansajeError;
		mansajeError = newMansajeError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CONSTRAINT__MANSAJE_ERROR, oldMansajeError, mansajeError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CONSTRAINT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetawebdesignPackage.CONSTRAINT__OPERATOR:
				return getOperator();
			case MetawebdesignPackage.CONSTRAINT__SERVICE:
				return getService();
			case MetawebdesignPackage.CONSTRAINT__NAME:
				return getName();
			case MetawebdesignPackage.CONSTRAINT__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case MetawebdesignPackage.CONSTRAINT__MANSAJE_ERROR:
				return getMansajeError();
			case MetawebdesignPackage.CONSTRAINT__VALUE:
				return getValue();
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
			case MetawebdesignPackage.CONSTRAINT__OPERATOR:
				setOperator((TypeOperator)newValue);
				return;
			case MetawebdesignPackage.CONSTRAINT__SERVICE:
				setService((TypeService)newValue);
				return;
			case MetawebdesignPackage.CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case MetawebdesignPackage.CONSTRAINT__ATTRIBUTE:
				setAttribute((NotDerived)newValue);
				return;
			case MetawebdesignPackage.CONSTRAINT__MANSAJE_ERROR:
				setMansajeError((String)newValue);
				return;
			case MetawebdesignPackage.CONSTRAINT__VALUE:
				setValue((String)newValue);
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
			case MetawebdesignPackage.CONSTRAINT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case MetawebdesignPackage.CONSTRAINT__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case MetawebdesignPackage.CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetawebdesignPackage.CONSTRAINT__ATTRIBUTE:
				setAttribute((NotDerived)null);
				return;
			case MetawebdesignPackage.CONSTRAINT__MANSAJE_ERROR:
				setMansajeError(MANSAJE_ERROR_EDEFAULT);
				return;
			case MetawebdesignPackage.CONSTRAINT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case MetawebdesignPackage.CONSTRAINT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case MetawebdesignPackage.CONSTRAINT__SERVICE:
				return service != SERVICE_EDEFAULT;
			case MetawebdesignPackage.CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetawebdesignPackage.CONSTRAINT__ATTRIBUTE:
				return attribute != null;
			case MetawebdesignPackage.CONSTRAINT__MANSAJE_ERROR:
				return MANSAJE_ERROR_EDEFAULT == null ? mansajeError != null : !MANSAJE_ERROR_EDEFAULT.equals(mansajeError);
			case MetawebdesignPackage.CONSTRAINT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(", service: ");
		result.append(service);
		result.append(", name: ");
		result.append(name);
		result.append(", mansajeError: ");
		result.append(mansajeError);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
