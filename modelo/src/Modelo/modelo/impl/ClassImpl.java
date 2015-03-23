/**
 */
package Modelo.modelo.impl;

import Modelo.modelo.Attribute;
import Modelo.modelo.ModeloPackage;
import Modelo.modelo.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelo.modelo.impl.ClassImpl#getHasRelaction <em>Has Relaction</em>}</li>
 *   <li>{@link Modelo.modelo.impl.ClassImpl#getFrom <em>From</em>}</li>
 *   <li>{@link Modelo.modelo.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link Modelo.modelo.impl.ClassImpl#getHasAttribute <em>Has Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements Modelo.modelo.Class {
	/**
	 * The cached value of the '{@link #getHasRelaction() <em>Has Relaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> hasRelaction;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> from;

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
	 * The cached value of the '{@link #getHasAttribute() <em>Has Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute hasAttribute;

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
		return ModeloPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getHasRelaction() {
		if (hasRelaction == null) {
			hasRelaction = new EObjectContainmentEList<Relation>(Relation.class, this, ModeloPackage.CLASS__HAS_RELACTION);
		}
		return hasRelaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<Relation>(Relation.class, this, ModeloPackage.CLASS__FROM);
		}
		return from;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getHasAttribute() {
		return hasAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasAttribute(Attribute newHasAttribute, NotificationChain msgs) {
		Attribute oldHasAttribute = hasAttribute;
		hasAttribute = newHasAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloPackage.CLASS__HAS_ATTRIBUTE, oldHasAttribute, newHasAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAttribute(Attribute newHasAttribute) {
		if (newHasAttribute != hasAttribute) {
			NotificationChain msgs = null;
			if (hasAttribute != null)
				msgs = ((InternalEObject)hasAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeloPackage.CLASS__HAS_ATTRIBUTE, null, msgs);
			if (newHasAttribute != null)
				msgs = ((InternalEObject)newHasAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModeloPackage.CLASS__HAS_ATTRIBUTE, null, msgs);
			msgs = basicSetHasAttribute(newHasAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.CLASS__HAS_ATTRIBUTE, newHasAttribute, newHasAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.CLASS__HAS_RELACTION:
				return ((InternalEList<?>)getHasRelaction()).basicRemove(otherEnd, msgs);
			case ModeloPackage.CLASS__HAS_ATTRIBUTE:
				return basicSetHasAttribute(null, msgs);
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
			case ModeloPackage.CLASS__HAS_RELACTION:
				return getHasRelaction();
			case ModeloPackage.CLASS__FROM:
				return getFrom();
			case ModeloPackage.CLASS__NAME:
				return getName();
			case ModeloPackage.CLASS__HAS_ATTRIBUTE:
				return getHasAttribute();
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
			case ModeloPackage.CLASS__HAS_RELACTION:
				getHasRelaction().clear();
				getHasRelaction().addAll((Collection<? extends Relation>)newValue);
				return;
			case ModeloPackage.CLASS__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends Relation>)newValue);
				return;
			case ModeloPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case ModeloPackage.CLASS__HAS_ATTRIBUTE:
				setHasAttribute((Attribute)newValue);
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
			case ModeloPackage.CLASS__HAS_RELACTION:
				getHasRelaction().clear();
				return;
			case ModeloPackage.CLASS__FROM:
				getFrom().clear();
				return;
			case ModeloPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModeloPackage.CLASS__HAS_ATTRIBUTE:
				setHasAttribute((Attribute)null);
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
			case ModeloPackage.CLASS__HAS_RELACTION:
				return hasRelaction != null && !hasRelaction.isEmpty();
			case ModeloPackage.CLASS__FROM:
				return from != null && !from.isEmpty();
			case ModeloPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModeloPackage.CLASS__HAS_ATTRIBUTE:
				return hasAttribute != null;
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
