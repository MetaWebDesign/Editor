/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.LinkViewCRUD;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.TypeService;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link View CRUD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.LinkViewCRUDImpl#getService <em>Service</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.LinkViewCRUDImpl#getFromClass <em>From Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.LinkViewCRUDImpl#getFromRelation <em>From Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkViewCRUDImpl extends LinkImpl implements LinkViewCRUD {
	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final TypeService SERVICE_EDEFAULT = TypeService.NULL;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected TypeService service = SERVICE_EDEFAULT;

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
	 * The cached value of the '{@link #getFromRelation() <em>From Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Metawebdesign.metawebdesign.Class> fromRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkViewCRUDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.LINK_VIEW_CRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeService getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(TypeService newService) {
		TypeService oldService = service;
		service = newService == null ? SERVICE_EDEFAULT : newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.LINK_VIEW_CRUD__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metawebdesign.metawebdesign.Class> getFromClass() {
		if (fromClass == null) {
			fromClass = new EObjectResolvingEList<Metawebdesign.metawebdesign.Class>(Metawebdesign.metawebdesign.Class.class, this, MetawebdesignPackage.LINK_VIEW_CRUD__FROM_CLASS);
		}
		return fromClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metawebdesign.metawebdesign.Class> getFromRelation() {
		if (fromRelation == null) {
			fromRelation = new EObjectResolvingEList<Metawebdesign.metawebdesign.Class>(Metawebdesign.metawebdesign.Class.class, this, MetawebdesignPackage.LINK_VIEW_CRUD__FROM_RELATION);
		}
		return fromRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetawebdesignPackage.LINK_VIEW_CRUD__SERVICE:
				return getService();
			case MetawebdesignPackage.LINK_VIEW_CRUD__FROM_CLASS:
				return getFromClass();
			case MetawebdesignPackage.LINK_VIEW_CRUD__FROM_RELATION:
				return getFromRelation();
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
			case MetawebdesignPackage.LINK_VIEW_CRUD__SERVICE:
				setService((TypeService)newValue);
				return;
			case MetawebdesignPackage.LINK_VIEW_CRUD__FROM_CLASS:
				getFromClass().clear();
				getFromClass().addAll((Collection<? extends Metawebdesign.metawebdesign.Class>)newValue);
				return;
			case MetawebdesignPackage.LINK_VIEW_CRUD__FROM_RELATION:
				getFromRelation().clear();
				getFromRelation().addAll((Collection<? extends Metawebdesign.metawebdesign.Class>)newValue);
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
			case MetawebdesignPackage.LINK_VIEW_CRUD__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case MetawebdesignPackage.LINK_VIEW_CRUD__FROM_CLASS:
				getFromClass().clear();
				return;
			case MetawebdesignPackage.LINK_VIEW_CRUD__FROM_RELATION:
				getFromRelation().clear();
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
			case MetawebdesignPackage.LINK_VIEW_CRUD__SERVICE:
				return service != SERVICE_EDEFAULT;
			case MetawebdesignPackage.LINK_VIEW_CRUD__FROM_CLASS:
				return fromClass != null && !fromClass.isEmpty();
			case MetawebdesignPackage.LINK_VIEW_CRUD__FROM_RELATION:
				return fromRelation != null && !fromRelation.isEmpty();
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
		result.append(" (service: ");
		result.append(service);
		result.append(')');
		return result.toString();
	}

} //LinkViewCRUDImpl
