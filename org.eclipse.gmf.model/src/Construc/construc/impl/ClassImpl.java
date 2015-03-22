/**
 */
package Construc.construc.impl;

import Construc.construc.Attribute;
import Construc.construc.ConstrucPackage;
import Construc.construc.Relation;
import Construc.construc.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Construc.construc.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link Construc.construc.impl.ClassImpl#getToRelation <em>To Relation</em>}</li>
 *   <li>{@link Construc.construc.impl.ClassImpl#getFrom <em>From</em>}</li>
 *   <li>{@link Construc.construc.impl.ClassImpl#getToAttribute <em>To Attribute</em>}</li>
 *   <li>{@link Construc.construc.impl.ClassImpl#getToService <em>To Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements Construc.construc.Class {
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
	 * The cached value of the '{@link #getToRelation() <em>To Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> toRelation;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Relation from;

	/**
	 * The cached value of the '{@link #getToAttribute() <em>To Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> toAttribute;

	/**
	 * The cached value of the '{@link #getToService() <em>To Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> toService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstrucPackage.Literals.CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConstrucPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getToRelation() {
		if (toRelation == null) {
			toRelation = new EObjectContainmentEList<Relation>(Relation.class, this, ConstrucPackage.CLASS__TO_RELATION);
		}
		return toRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Relation)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstrucPackage.CLASS__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Relation newFrom) {
		Relation oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstrucPackage.CLASS__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getToAttribute() {
		if (toAttribute == null) {
			toAttribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, ConstrucPackage.CLASS__TO_ATTRIBUTE);
		}
		return toAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getToService() {
		if (toService == null) {
			toService = new EObjectContainmentEList<Service>(Service.class, this, ConstrucPackage.CLASS__TO_SERVICE);
		}
		return toService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstrucPackage.CLASS__TO_RELATION:
				return ((InternalEList<?>)getToRelation()).basicRemove(otherEnd, msgs);
			case ConstrucPackage.CLASS__TO_ATTRIBUTE:
				return ((InternalEList<?>)getToAttribute()).basicRemove(otherEnd, msgs);
			case ConstrucPackage.CLASS__TO_SERVICE:
				return ((InternalEList<?>)getToService()).basicRemove(otherEnd, msgs);
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
			case ConstrucPackage.CLASS__NAME:
				return getName();
			case ConstrucPackage.CLASS__TO_RELATION:
				return getToRelation();
			case ConstrucPackage.CLASS__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case ConstrucPackage.CLASS__TO_ATTRIBUTE:
				return getToAttribute();
			case ConstrucPackage.CLASS__TO_SERVICE:
				return getToService();
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
			case ConstrucPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case ConstrucPackage.CLASS__TO_RELATION:
				getToRelation().clear();
				getToRelation().addAll((Collection<? extends Relation>)newValue);
				return;
			case ConstrucPackage.CLASS__FROM:
				setFrom((Relation)newValue);
				return;
			case ConstrucPackage.CLASS__TO_ATTRIBUTE:
				getToAttribute().clear();
				getToAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ConstrucPackage.CLASS__TO_SERVICE:
				getToService().clear();
				getToService().addAll((Collection<? extends Service>)newValue);
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
			case ConstrucPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConstrucPackage.CLASS__TO_RELATION:
				getToRelation().clear();
				return;
			case ConstrucPackage.CLASS__FROM:
				setFrom((Relation)null);
				return;
			case ConstrucPackage.CLASS__TO_ATTRIBUTE:
				getToAttribute().clear();
				return;
			case ConstrucPackage.CLASS__TO_SERVICE:
				getToService().clear();
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
			case ConstrucPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConstrucPackage.CLASS__TO_RELATION:
				return toRelation != null && !toRelation.isEmpty();
			case ConstrucPackage.CLASS__FROM:
				return from != null;
			case ConstrucPackage.CLASS__TO_ATTRIBUTE:
				return toAttribute != null && !toAttribute.isEmpty();
			case ConstrucPackage.CLASS__TO_SERVICE:
				return toService != null && !toService.isEmpty();
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

} //ClassImpl
