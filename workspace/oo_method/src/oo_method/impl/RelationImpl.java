/**
 */
package oo_method.impl;

import oo_method.Oo_methodPackage;
import oo_method.Relation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oo_method.impl.RelationImpl#getComposed <em>Composed</em>}</li>
 *   <li>{@link oo_method.impl.RelationImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected oo_method.Class component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oo_methodPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oo_method.Class getComposed() {
		if (eContainerFeatureID() != Oo_methodPackage.RELATION__COMPOSED) return null;
		return (oo_method.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposed(oo_method.Class newComposed, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComposed, Oo_methodPackage.RELATION__COMPOSED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposed(oo_method.Class newComposed) {
		if (newComposed != eInternalContainer() || (eContainerFeatureID() != Oo_methodPackage.RELATION__COMPOSED && newComposed != null)) {
			if (EcoreUtil.isAncestor(this, newComposed))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComposed != null)
				msgs = ((InternalEObject)newComposed).eInverseAdd(this, Oo_methodPackage.CLASS__RCOMPOUND, oo_method.Class.class, msgs);
			msgs = basicSetComposed(newComposed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oo_methodPackage.RELATION__COMPOSED, newComposed, newComposed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oo_method.Class getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (oo_method.Class)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oo_methodPackage.RELATION__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oo_method.Class basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(oo_method.Class newComponent, NotificationChain msgs) {
		oo_method.Class oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Oo_methodPackage.RELATION__COMPONENT, oldComponent, newComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(oo_method.Class newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject)component).eInverseRemove(this, Oo_methodPackage.CLASS__RCOMPONENTS, oo_method.Class.class, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, Oo_methodPackage.CLASS__RCOMPONENTS, oo_method.Class.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oo_methodPackage.RELATION__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Oo_methodPackage.RELATION__COMPOSED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComposed((oo_method.Class)otherEnd, msgs);
			case Oo_methodPackage.RELATION__COMPONENT:
				if (component != null)
					msgs = ((InternalEObject)component).eInverseRemove(this, Oo_methodPackage.CLASS__RCOMPONENTS, oo_method.Class.class, msgs);
				return basicSetComponent((oo_method.Class)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Oo_methodPackage.RELATION__COMPOSED:
				return basicSetComposed(null, msgs);
			case Oo_methodPackage.RELATION__COMPONENT:
				return basicSetComponent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Oo_methodPackage.RELATION__COMPOSED:
				return eInternalContainer().eInverseRemove(this, Oo_methodPackage.CLASS__RCOMPOUND, oo_method.Class.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oo_methodPackage.RELATION__COMPOSED:
				return getComposed();
			case Oo_methodPackage.RELATION__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case Oo_methodPackage.RELATION__COMPOSED:
				setComposed((oo_method.Class)newValue);
				return;
			case Oo_methodPackage.RELATION__COMPONENT:
				setComponent((oo_method.Class)newValue);
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
			case Oo_methodPackage.RELATION__COMPOSED:
				setComposed((oo_method.Class)null);
				return;
			case Oo_methodPackage.RELATION__COMPONENT:
				setComponent((oo_method.Class)null);
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
			case Oo_methodPackage.RELATION__COMPOSED:
				return getComposed() != null;
			case Oo_methodPackage.RELATION__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationImpl
