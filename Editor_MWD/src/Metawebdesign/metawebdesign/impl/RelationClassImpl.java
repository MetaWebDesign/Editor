/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.RelationClass;

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
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getClass_A <em>Class A</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getClass_B <em>Class B</em>}</li>
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
	 * The cached value of the '{@link #getClass_A() <em>Class A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_A()
	 * @generated
	 * @ordered
	 */
	protected Attributes class_A;

	/**
	 * The cached value of the '{@link #getClass_B() <em>Class B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_B()
	 * @generated
	 * @ordered
	 */
	protected Attributes class_B;

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
	public Attributes getClass_A() {
		if (class_A != null && class_A.eIsProxy()) {
			InternalEObject oldClass_A = (InternalEObject)class_A;
			class_A = (Attributes)eResolveProxy(oldClass_A);
			if (class_A != oldClass_A) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.RELATION_CLASS__CLASS_A, oldClass_A, class_A));
			}
		}
		return class_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetClass_A() {
		return class_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_A(Attributes newClass_A) {
		Attributes oldClass_A = class_A;
		class_A = newClass_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__CLASS_A, oldClass_A, class_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getClass_B() {
		if (class_B != null && class_B.eIsProxy()) {
			InternalEObject oldClass_B = (InternalEObject)class_B;
			class_B = (Attributes)eResolveProxy(oldClass_B);
			if (class_B != oldClass_B) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.RELATION_CLASS__CLASS_B, oldClass_B, class_B));
			}
		}
		return class_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetClass_B() {
		return class_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_B(Attributes newClass_B) {
		Attributes oldClass_B = class_B;
		class_B = newClass_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__CLASS_B, oldClass_B, class_B));
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
			case MetawebdesignPackage.RELATION_CLASS__CLASS_A:
				if (resolve) return getClass_A();
				return basicGetClass_A();
			case MetawebdesignPackage.RELATION_CLASS__CLASS_B:
				if (resolve) return getClass_B();
				return basicGetClass_B();
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
			case MetawebdesignPackage.RELATION_CLASS__CLASS_A:
				setClass_A((Attributes)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CLASS_B:
				setClass_B((Attributes)newValue);
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
			case MetawebdesignPackage.RELATION_CLASS__CLASS_A:
				setClass_A((Attributes)null);
				return;
			case MetawebdesignPackage.RELATION_CLASS__CLASS_B:
				setClass_B((Attributes)null);
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
			case MetawebdesignPackage.RELATION_CLASS__CLASS_A:
				return class_A != null;
			case MetawebdesignPackage.RELATION_CLASS__CLASS_B:
				return class_B != null;
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
		result.append(')');
		return result.toString();
	}

} //RelationClassImpl
