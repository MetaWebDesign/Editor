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
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getAttribute_Class_A <em>Attribute Class A</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getAttribute_Class_B <em>Attribute Class B</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getCardinality_Class_A <em>Cardinality Class A</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getCardinality_Class_B <em>Cardinality Class B</em>}</li>
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
	 * The cached value of the '{@link #getAttribute_Class_A() <em>Attribute Class A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_Class_A()
	 * @generated
	 * @ordered
	 */
	protected Attributes attribute_Class_A;

	/**
	 * The cached value of the '{@link #getAttribute_Class_B() <em>Attribute Class B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute_Class_B()
	 * @generated
	 * @ordered
	 */
	protected Attributes attribute_Class_B;

	/**
	 * The default value of the '{@link #getCardinality_Class_A() <em>Cardinality Class A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality_Class_A()
	 * @generated
	 * @ordered
	 */
	protected static final typeCardinality CARDINALITY_CLASS_A_EDEFAULT = typeCardinality.ONE;

	/**
	 * The cached value of the '{@link #getCardinality_Class_A() <em>Cardinality Class A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality_Class_A()
	 * @generated
	 * @ordered
	 */
	protected typeCardinality cardinality_Class_A = CARDINALITY_CLASS_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality_Class_B() <em>Cardinality Class B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality_Class_B()
	 * @generated
	 * @ordered
	 */
	protected static final typeCardinality CARDINALITY_CLASS_B_EDEFAULT = typeCardinality.ONE;

	/**
	 * The cached value of the '{@link #getCardinality_Class_B() <em>Cardinality Class B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality_Class_B()
	 * @generated
	 * @ordered
	 */
	protected typeCardinality cardinality_Class_B = CARDINALITY_CLASS_B_EDEFAULT;

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
	public Attributes getAttribute_Class_A() {
		if (attribute_Class_A != null && attribute_Class_A.eIsProxy()) {
			InternalEObject oldAttribute_Class_A = (InternalEObject)attribute_Class_A;
			attribute_Class_A = (Attributes)eResolveProxy(oldAttribute_Class_A);
			if (attribute_Class_A != oldAttribute_Class_A) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_A, oldAttribute_Class_A, attribute_Class_A));
			}
		}
		return attribute_Class_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetAttribute_Class_A() {
		return attribute_Class_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute_Class_A(Attributes newAttribute_Class_A) {
		Attributes oldAttribute_Class_A = attribute_Class_A;
		attribute_Class_A = newAttribute_Class_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_A, oldAttribute_Class_A, attribute_Class_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttribute_Class_B() {
		if (attribute_Class_B != null && attribute_Class_B.eIsProxy()) {
			InternalEObject oldAttribute_Class_B = (InternalEObject)attribute_Class_B;
			attribute_Class_B = (Attributes)eResolveProxy(oldAttribute_Class_B);
			if (attribute_Class_B != oldAttribute_Class_B) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_B, oldAttribute_Class_B, attribute_Class_B));
			}
		}
		return attribute_Class_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetAttribute_Class_B() {
		return attribute_Class_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute_Class_B(Attributes newAttribute_Class_B) {
		Attributes oldAttribute_Class_B = attribute_Class_B;
		attribute_Class_B = newAttribute_Class_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_B, oldAttribute_Class_B, attribute_Class_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeCardinality getCardinality_Class_A() {
		return cardinality_Class_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality_Class_A(typeCardinality newCardinality_Class_A) {
		typeCardinality oldCardinality_Class_A = cardinality_Class_A;
		cardinality_Class_A = newCardinality_Class_A == null ? CARDINALITY_CLASS_A_EDEFAULT : newCardinality_Class_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_A, oldCardinality_Class_A, cardinality_Class_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeCardinality getCardinality_Class_B() {
		return cardinality_Class_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality_Class_B(typeCardinality newCardinality_Class_B) {
		typeCardinality oldCardinality_Class_B = cardinality_Class_B;
		cardinality_Class_B = newCardinality_Class_B == null ? CARDINALITY_CLASS_B_EDEFAULT : newCardinality_Class_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_B, oldCardinality_Class_B, cardinality_Class_B));
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
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_A:
				if (resolve) return getAttribute_Class_A();
				return basicGetAttribute_Class_A();
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_B:
				if (resolve) return getAttribute_Class_B();
				return basicGetAttribute_Class_B();
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_A:
				return getCardinality_Class_A();
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_B:
				return getCardinality_Class_B();
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
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_A:
				setAttribute_Class_A((Attributes)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_B:
				setAttribute_Class_B((Attributes)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_A:
				setCardinality_Class_A((typeCardinality)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_B:
				setCardinality_Class_B((typeCardinality)newValue);
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
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_A:
				setAttribute_Class_A((Attributes)null);
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_B:
				setAttribute_Class_B((Attributes)null);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_A:
				setCardinality_Class_A(CARDINALITY_CLASS_A_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_B:
				setCardinality_Class_B(CARDINALITY_CLASS_B_EDEFAULT);
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
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_A:
				return attribute_Class_A != null;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_CLASS_B:
				return attribute_Class_B != null;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_A:
				return cardinality_Class_A != CARDINALITY_CLASS_A_EDEFAULT;
			case MetawebdesignPackage.RELATION_CLASS__CARDINALITY_CLASS_B:
				return cardinality_Class_B != CARDINALITY_CLASS_B_EDEFAULT;
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
		result.append(", Cardinality_Class_A: ");
		result.append(cardinality_Class_A);
		result.append(", Cardinality_Class_B: ");
		result.append(cardinality_Class_B);
		result.append(')');
		return result.toString();
	}

} //RelationClassImpl
