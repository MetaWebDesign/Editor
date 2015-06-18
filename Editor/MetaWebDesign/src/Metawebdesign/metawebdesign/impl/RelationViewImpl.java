/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.RelationView;

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
 * An implementation of the model object '<em><b>Relation View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getRViewsHasClass <em>RViews Has Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getFromClass <em>From Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationViewImpl extends MinimalEObjectImpl.Container implements RelationView {
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
	 * The cached value of the '{@link #getRViewsHasClass() <em>RViews Has Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRViewsHasClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Metawebdesign.metawebdesign.Class> rViewsHasClass;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.RELATION_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metawebdesign.metawebdesign.Class> getRViewsHasClass() {
		if (rViewsHasClass == null) {
			rViewsHasClass = new EObjectContainmentEList<Metawebdesign.metawebdesign.Class>(Metawebdesign.metawebdesign.Class.class, this, MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS);
		}
		return rViewsHasClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metawebdesign.metawebdesign.Class> getFromClass() {
		if (fromClass == null) {
			fromClass = new EObjectResolvingEList<Metawebdesign.metawebdesign.Class>(Metawebdesign.metawebdesign.Class.class, this, MetawebdesignPackage.RELATION_VIEW__FROM_CLASS);
		}
		return fromClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				return ((InternalEList<?>)getRViewsHasClass()).basicRemove(otherEnd, msgs);
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
			case MetawebdesignPackage.RELATION_VIEW__NAME:
				return getName();
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				return getRViewsHasClass();
			case MetawebdesignPackage.RELATION_VIEW__FROM_CLASS:
				return getFromClass();
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
			case MetawebdesignPackage.RELATION_VIEW__NAME:
				setName((String)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				getRViewsHasClass().clear();
				getRViewsHasClass().addAll((Collection<? extends Metawebdesign.metawebdesign.Class>)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__FROM_CLASS:
				getFromClass().clear();
				getFromClass().addAll((Collection<? extends Metawebdesign.metawebdesign.Class>)newValue);
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
			case MetawebdesignPackage.RELATION_VIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				getRViewsHasClass().clear();
				return;
			case MetawebdesignPackage.RELATION_VIEW__FROM_CLASS:
				getFromClass().clear();
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
			case MetawebdesignPackage.RELATION_VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				return rViewsHasClass != null && !rViewsHasClass.isEmpty();
			case MetawebdesignPackage.RELATION_VIEW__FROM_CLASS:
				return fromClass != null && !fromClass.isEmpty();
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

} //RelationViewImpl
