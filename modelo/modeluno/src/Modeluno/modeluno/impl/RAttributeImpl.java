/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Atributte;
import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.RAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.RAttributeImpl#getAtributoEsDe <em>Atributo Es De</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.RAttributeImpl#getRhasAttribute <em>Rhas Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RAttributeImpl extends MinimalEObjectImpl.Container implements RAttribute {
	/**
	 * The cached value of the '{@link #getAtributoEsDe() <em>Atributo Es De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributoEsDe()
	 * @generated
	 * @ordered
	 */
	protected Atributte atributoEsDe;

	/**
	 * The cached value of the '{@link #getRhasAttribute() <em>Rhas Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhasAttribute()
	 * @generated
	 * @ordered
	 */
	protected Atributte rhasAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.RATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributte getAtributoEsDe() {
		if (atributoEsDe != null && atributoEsDe.eIsProxy()) {
			InternalEObject oldAtributoEsDe = (InternalEObject)atributoEsDe;
			atributoEsDe = (Atributte)eResolveProxy(oldAtributoEsDe);
			if (atributoEsDe != oldAtributoEsDe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.RATTRIBUTE__ATRIBUTO_ES_DE, oldAtributoEsDe, atributoEsDe));
			}
		}
		return atributoEsDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributte basicGetAtributoEsDe() {
		return atributoEsDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributoEsDe(Atributte newAtributoEsDe) {
		Atributte oldAtributoEsDe = atributoEsDe;
		atributoEsDe = newAtributoEsDe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.RATTRIBUTE__ATRIBUTO_ES_DE, oldAtributoEsDe, atributoEsDe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributte getRhasAttribute() {
		return rhasAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhasAttribute(Atributte newRhasAttribute, NotificationChain msgs) {
		Atributte oldRhasAttribute = rhasAttribute;
		rhasAttribute = newRhasAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.RATTRIBUTE__RHAS_ATTRIBUTE, oldRhasAttribute, newRhasAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhasAttribute(Atributte newRhasAttribute) {
		if (newRhasAttribute != rhasAttribute) {
			NotificationChain msgs = null;
			if (rhasAttribute != null)
				msgs = ((InternalEObject)rhasAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.RATTRIBUTE__RHAS_ATTRIBUTE, null, msgs);
			if (newRhasAttribute != null)
				msgs = ((InternalEObject)newRhasAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.RATTRIBUTE__RHAS_ATTRIBUTE, null, msgs);
			msgs = basicSetRhasAttribute(newRhasAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.RATTRIBUTE__RHAS_ATTRIBUTE, newRhasAttribute, newRhasAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.RATTRIBUTE__RHAS_ATTRIBUTE:
				return basicSetRhasAttribute(null, msgs);
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
			case ModelunoPackage.RATTRIBUTE__ATRIBUTO_ES_DE:
				if (resolve) return getAtributoEsDe();
				return basicGetAtributoEsDe();
			case ModelunoPackage.RATTRIBUTE__RHAS_ATTRIBUTE:
				return getRhasAttribute();
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
			case ModelunoPackage.RATTRIBUTE__ATRIBUTO_ES_DE:
				setAtributoEsDe((Atributte)newValue);
				return;
			case ModelunoPackage.RATTRIBUTE__RHAS_ATTRIBUTE:
				setRhasAttribute((Atributte)newValue);
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
			case ModelunoPackage.RATTRIBUTE__ATRIBUTO_ES_DE:
				setAtributoEsDe((Atributte)null);
				return;
			case ModelunoPackage.RATTRIBUTE__RHAS_ATTRIBUTE:
				setRhasAttribute((Atributte)null);
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
			case ModelunoPackage.RATTRIBUTE__ATRIBUTO_ES_DE:
				return atributoEsDe != null;
			case ModelunoPackage.RATTRIBUTE__RHAS_ATTRIBUTE:
				return rhasAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //RAttributeImpl
