/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.RelationClass;
import Metawebdesign.metawebdesign.typeCardinality;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getFromClass <em>From Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getAttribute_Destination <em>Attribute Destination</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getCardinality_origin <em>Cardinality origin</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getCardinality_Destination <em>Cardinality Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationClassImpl extends MinimalEObjectImpl.Container implements RelationClass {
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
	 * The cached value of the '{@link #getFromClass() <em>From Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Metawebdesign.metawebdesign.Class> fromClass;

	/**
	 * The cached value of the '{@link #getAttribute_Destination() <em>Attribute Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_Destination()
	 * @generated
	 * @ordered
	 */
	protected Attributes attribute_Destination;

	/**
	 * The default value of the '{@link #getCardinality_origin() <em>Cardinality origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality_origin()
	 * @generated
	 * @ordered
	 */
	protected static final typeCardinality CARDINALITY_ORIGIN_EDEFAULT = typeCardinality.ONE;

	/**
	 * The cached value of the '{@link #getCardinality_origin() <em>Cardinality origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality_origin()
	 * @generated
	 * @ordered
	 */
	protected typeCardinality cardinality_origin = CARDINALITY_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality_Destination() <em>Cardinality Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality_Destination()
	 * @generated
	 * @ordered
	 */
	protected static final typeCardinality CARDINALITY_DESTINATION_EDEFAULT = typeCardinality.ONE;

	/**
	 * The cached value of the '{@link #getCardinality_Destination() <em>Cardinality Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality_Destination()
	 * @generated
	 * @ordered
	 */
	protected typeCardinality cardinality_Destination = CARDINALITY_DESTINATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.RELATION_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metawebdesign.metawebdesign.Class> getFromClass() {
		if (fromClass == null) {
			fromClass = new EObjectResolvingEList<Metawebdesign.metawebdesign.Class>(Metawebdesign.metawebdesign.Class.class, this, MetawebdesignPackage.RELATION_CLASS__FROM_CLASS);
		}
		return fromClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttribute_Destination() {
		if (attribute_Destination != null && attribute_Destination.eIsProxy()) {
			InternalEObject oldAttribute_Destination = (InternalEObject)attribute_Destination;
			attribute_Destination = (Attributes)eResolveProxy(oldAttribute_Destination);
			if (attribute_Destination != oldAttribute_Destination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_DESTINATION, oldAttribute_Destination, attribute_Destination));
			}
		}
		return attribute_Destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetAttribute_Destination() {
		return attribute_Destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute_Destination(Attributes newAttribute_Destination) {
		Attributes oldAttribute_Destination = attribute_Destination;
		attribute_Destination = newAttribute_Destination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_DESTINATION, oldAttribute_Destination, attribute_Destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeCardinality getCardinality_origin() {
		return cardinality_origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality_origin(typeCardinality newCardinality_origin) {
		typeCardinality oldCardinality_origin = cardinality_origin;
		cardinality_origin = newCardinality_origin == null ? CARDINALITY_ORIGIN_EDEFAULT : newCardinality_origin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__CARDINALITY_ORIGIN, oldCardinality_origin, cardinality_origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeCardinality getCardinality_Destination() {
		return cardinality_Destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality_Destination(typeCardinality newCardinality_Destination) {
		typeCardinality oldCardinality_Destination = cardinality_Destination;
		cardinality_Destination = newCardinality_Destination == null ? CARDINALITY_DESTINATION_EDEFAULT : newCardinality_Destination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__CARDINALITY_DESTINATION, oldCardinality_Destination, cardinality_Destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetawebdesignPackage.RELATION_CLASS__NAME:
				return getName();
			case MetawebdesignPackage.RELATION_CLASS__FROM_CLASS:
				return getFromClass();
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_DESTINATION:
				if (resolve) return getAttribute_Destination();
				return basicGetAttribute_Destination();
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_ORIGIN:
				return getCardinality_origin();
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_DESTINATION:
				return getCardinality_Destination();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetawebdesignPackage.RELATION_CLASS__NAME:
				setName((String)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__FROM_CLASS:
				getFromClass().clear();
				getFromClass().addAll((Collection<? extends Metawebdesign.metawebdesign.Class>)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_DESTINATION:
				setAttribute_Destination((Attributes)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_ORIGIN:
				setCardinality_origin((typeCardinality)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_DESTINATION:
				setCardinality_Destination((typeCardinality)newValue);
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
			case MetawebdesignPackage.RELATION_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_CLASS__FROM_CLASS:
				getFromClass().clear();
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_DESTINATION:
				setAttribute_Destination((Attributes)null);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_ORIGIN:
				setCardinality_origin(CARDINALITY_ORIGIN_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_DESTINATION:
				setCardinality_Destination(CARDINALITY_DESTINATION_EDEFAULT);
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
			case MetawebdesignPackage.RELATION_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetawebdesignPackage.RELATION_CLASS__FROM_CLASS:
				return fromClass != null && !fromClass.isEmpty();
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_DESTINATION:
				return attribute_Destination != null;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_ORIGIN:
				return cardinality_origin != CARDINALITY_ORIGIN_EDEFAULT;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_DESTINATION:
				return cardinality_Destination != CARDINALITY_DESTINATION_EDEFAULT;
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
		result.append(", Cardinality_origin: ");
		result.append(cardinality_origin);
		result.append(", Cardinality_Destination: ");
		result.append(cardinality_Destination);
		result.append(')');
		return result.toString();
	}

} //RelationClassImpl
