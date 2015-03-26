/**
 */
package kk.modelo.impl;

import kk.modelo.Atributo;
import kk.modelo.ModeloPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kk.modelo.impl.ClassImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link kk.modelo.impl.ClassImpl#getHasAtributte <em>Has Atributte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements kk.modelo.Class {
	/**
	 * The default value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected static final String CNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected String cname = CNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasAtributte() <em>Has Atributte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAtributte()
	 * @generated
	 * @ordered
	 */
	protected Atributo hasAtributte;

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
	public String getCname() {
		return cname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCname(String newCname) {
		String oldCname = cname;
		cname = newCname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.CLASS__CNAME, oldCname, cname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo getHasAtributte() {
		return hasAtributte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasAtributte(Atributo newHasAtributte, NotificationChain msgs) {
		Atributo oldHasAtributte = hasAtributte;
		hasAtributte = newHasAtributte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloPackage.CLASS__HAS_ATRIBUTTE, oldHasAtributte, newHasAtributte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAtributte(Atributo newHasAtributte) {
		if (newHasAtributte != hasAtributte) {
			NotificationChain msgs = null;
			if (hasAtributte != null)
				msgs = ((InternalEObject)hasAtributte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeloPackage.CLASS__HAS_ATRIBUTTE, null, msgs);
			if (newHasAtributte != null)
				msgs = ((InternalEObject)newHasAtributte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModeloPackage.CLASS__HAS_ATRIBUTTE, null, msgs);
			msgs = basicSetHasAtributte(newHasAtributte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.CLASS__HAS_ATRIBUTTE, newHasAtributte, newHasAtributte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.CLASS__HAS_ATRIBUTTE:
				return basicSetHasAtributte(null, msgs);
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
			case ModeloPackage.CLASS__CNAME:
				return getCname();
			case ModeloPackage.CLASS__HAS_ATRIBUTTE:
				return getHasAtributte();
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
			case ModeloPackage.CLASS__CNAME:
				setCname((String)newValue);
				return;
			case ModeloPackage.CLASS__HAS_ATRIBUTTE:
				setHasAtributte((Atributo)newValue);
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
			case ModeloPackage.CLASS__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case ModeloPackage.CLASS__HAS_ATRIBUTTE:
				setHasAtributte((Atributo)null);
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
			case ModeloPackage.CLASS__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case ModeloPackage.CLASS__HAS_ATRIBUTTE:
				return hasAtributte != null;
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
		result.append(" (Cname: ");
		result.append(cname);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
