/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.RelationClass;
import Modeldos.modeldos.TypeRol;
import Modeldos.modeldos.Views;

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
 * An implementation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.ViewsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ViewsImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ViewsImpl#getRolView <em>Rol View</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ViewsImpl#getHasRelationClass <em>Has Relation Class</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ViewsImpl#getViewGoRelationClass <em>View Go Relation Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewsImpl extends MinimalEObjectImpl.Container implements Views {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolView() <em>Rol View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolView()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRol ROL_VIEW_EDEFAULT = TypeRol.ANONYMOUS;

	/**
	 * The cached value of the '{@link #getRolView() <em>Rol View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolView()
	 * @generated
	 * @ordered
	 */
	protected TypeRol rolView = ROL_VIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasRelationClass() <em>Has Relation Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelationClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationClass> hasRelationClass;

	/**
	 * The cached value of the '{@link #getViewGoRelationClass() <em>View Go Relation Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewGoRelationClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationClass> viewGoRelationClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.VIEWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.VIEWS__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.VIEWS__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol getRolView() {
		return rolView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolView(TypeRol newRolView) {
		TypeRol oldRolView = rolView;
		rolView = newRolView == null ? ROL_VIEW_EDEFAULT : newRolView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.VIEWS__ROL_VIEW, oldRolView, rolView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClass> getHasRelationClass() {
		if (hasRelationClass == null) {
			hasRelationClass = new EObjectContainmentEList<RelationClass>(RelationClass.class, this, ModeldosPackage.VIEWS__HAS_RELATION_CLASS);
		}
		return hasRelationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClass> getViewGoRelationClass() {
		if (viewGoRelationClass == null) {
			viewGoRelationClass = new EObjectResolvingEList<RelationClass>(RelationClass.class, this, ModeldosPackage.VIEWS__VIEW_GO_RELATION_CLASS);
		}
		return viewGoRelationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.VIEWS__HAS_RELATION_CLASS:
				return ((InternalEList<?>)getHasRelationClass()).basicRemove(otherEnd, msgs);
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
			case ModeldosPackage.VIEWS__TITLE:
				return getTitle();
			case ModeldosPackage.VIEWS__GROUP_NAME:
				return getGroupName();
			case ModeldosPackage.VIEWS__ROL_VIEW:
				return getRolView();
			case ModeldosPackage.VIEWS__HAS_RELATION_CLASS:
				return getHasRelationClass();
			case ModeldosPackage.VIEWS__VIEW_GO_RELATION_CLASS:
				return getViewGoRelationClass();
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
			case ModeldosPackage.VIEWS__TITLE:
				setTitle((String)newValue);
				return;
			case ModeldosPackage.VIEWS__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case ModeldosPackage.VIEWS__ROL_VIEW:
				setRolView((TypeRol)newValue);
				return;
			case ModeldosPackage.VIEWS__HAS_RELATION_CLASS:
				getHasRelationClass().clear();
				getHasRelationClass().addAll((Collection<? extends RelationClass>)newValue);
				return;
			case ModeldosPackage.VIEWS__VIEW_GO_RELATION_CLASS:
				getViewGoRelationClass().clear();
				getViewGoRelationClass().addAll((Collection<? extends RelationClass>)newValue);
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
			case ModeldosPackage.VIEWS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ModeldosPackage.VIEWS__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case ModeldosPackage.VIEWS__ROL_VIEW:
				setRolView(ROL_VIEW_EDEFAULT);
				return;
			case ModeldosPackage.VIEWS__HAS_RELATION_CLASS:
				getHasRelationClass().clear();
				return;
			case ModeldosPackage.VIEWS__VIEW_GO_RELATION_CLASS:
				getViewGoRelationClass().clear();
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
			case ModeldosPackage.VIEWS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ModeldosPackage.VIEWS__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case ModeldosPackage.VIEWS__ROL_VIEW:
				return rolView != ROL_VIEW_EDEFAULT;
			case ModeldosPackage.VIEWS__HAS_RELATION_CLASS:
				return hasRelationClass != null && !hasRelationClass.isEmpty();
			case ModeldosPackage.VIEWS__VIEW_GO_RELATION_CLASS:
				return viewGoRelationClass != null && !viewGoRelationClass.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(", rolView: ");
		result.append(rolView);
		result.append(')');
		return result.toString();
	}

} //ViewsImpl
