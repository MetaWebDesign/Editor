/**
 */
package Modelouno.modeluno.impl;

import Modelouno.modeluno.Attribute;
import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.Relation_Attribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelouno.modeluno.impl.Relation_AttributeImpl#getGoAttribute <em>Go Attribute</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.Relation_AttributeImpl#getRhasAttribute <em>Rhas Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Relation_AttributeImpl extends MinimalEObjectImpl.Container implements Relation_Attribute {
	/**
	 * The cached value of the '{@link #getGoAttribute() <em>Go Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute goAttribute;

	/**
	 * The cached value of the '{@link #getRhasAttribute() <em>Rhas Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhasAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute rhasAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Relation_AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.RELATION_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getGoAttribute() {
		if (goAttribute != null && goAttribute.eIsProxy()) {
			InternalEObject oldGoAttribute = (InternalEObject)goAttribute;
			goAttribute = (Attribute)eResolveProxy(oldGoAttribute);
			if (goAttribute != oldGoAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.RELATION_ATTRIBUTE__GO_ATTRIBUTE, oldGoAttribute, goAttribute));
			}
		}
		return goAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetGoAttribute() {
		return goAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoAttribute(Attribute newGoAttribute) {
		Attribute oldGoAttribute = goAttribute;
		goAttribute = newGoAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.RELATION_ATTRIBUTE__GO_ATTRIBUTE, oldGoAttribute, goAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getRhasAttribute() {
		return rhasAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhasAttribute(Attribute newRhasAttribute, NotificationChain msgs) {
		Attribute oldRhasAttribute = rhasAttribute;
		rhasAttribute = newRhasAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.RELATION_ATTRIBUTE__RHAS_ATTRIBUTE, oldRhasAttribute, newRhasAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhasAttribute(Attribute newRhasAttribute) {
		if (newRhasAttribute != rhasAttribute) {
			NotificationChain msgs = null;
			if (rhasAttribute != null)
				msgs = ((InternalEObject)rhasAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.RELATION_ATTRIBUTE__RHAS_ATTRIBUTE, null, msgs);
			if (newRhasAttribute != null)
				msgs = ((InternalEObject)newRhasAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.RELATION_ATTRIBUTE__RHAS_ATTRIBUTE, null, msgs);
			msgs = basicSetRhasAttribute(newRhasAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.RELATION_ATTRIBUTE__RHAS_ATTRIBUTE, newRhasAttribute, newRhasAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.RELATION_ATTRIBUTE__RHAS_ATTRIBUTE:
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
			case ModelunoPackage.RELATION_ATTRIBUTE__GO_ATTRIBUTE:
				if (resolve) return getGoAttribute();
				return basicGetGoAttribute();
			case ModelunoPackage.RELATION_ATTRIBUTE__RHAS_ATTRIBUTE:
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
			case ModelunoPackage.RELATION_ATTRIBUTE__GO_ATTRIBUTE:
				setGoAttribute((Attribute)newValue);
				return;
			case ModelunoPackage.RELATION_ATTRIBUTE__RHAS_ATTRIBUTE:
				setRhasAttribute((Attribute)newValue);
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
			case ModelunoPackage.RELATION_ATTRIBUTE__GO_ATTRIBUTE:
				setGoAttribute((Attribute)null);
				return;
			case ModelunoPackage.RELATION_ATTRIBUTE__RHAS_ATTRIBUTE:
				setRhasAttribute((Attribute)null);
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
			case ModelunoPackage.RELATION_ATTRIBUTE__GO_ATTRIBUTE:
				return goAttribute != null;
			case ModelunoPackage.RELATION_ATTRIBUTE__RHAS_ATTRIBUTE:
				return rhasAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //Relation_AttributeImpl
