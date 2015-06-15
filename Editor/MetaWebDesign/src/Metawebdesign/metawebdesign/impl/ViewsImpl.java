/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Group;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.RelationView;
import Metawebdesign.metawebdesign.TypeRol;
import Metawebdesign.metawebdesign.Views;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getRolView <em>Rol View</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getHasRelationView <em>Has Relation View</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getFromRelation <em>From Relation</em>}</li>
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
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected Group groupName;

	/**
	 * The cached value of the '{@link #getHasRelationView() <em>Has Relation View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelationView()
	 * @generated
	 * @ordered
	 */
	protected RelationView hasRelationView;

	/**
	 * The cached value of the '{@link #getFromRelation() <em>From Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRelation()
	 * @generated
	 * @ordered
	 */
	protected RelationView fromRelation;

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
		return MetawebdesignPackage.Literals.VIEWS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.VIEWS__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.VIEWS__ROL_VIEW, oldRolView, rolView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroupName() {
		if (groupName != null && groupName.eIsProxy()) {
			InternalEObject oldGroupName = (InternalEObject)groupName;
			groupName = (Group)eResolveProxy(oldGroupName);
			if (groupName != oldGroupName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.VIEWS__GROUP_NAME, oldGroupName, groupName));
			}
		}
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(Group newGroupName) {
		Group oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.VIEWS__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationView getHasRelationView() {
		return hasRelationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasRelationView(RelationView newHasRelationView, NotificationChain msgs) {
		RelationView oldHasRelationView = hasRelationView;
		hasRelationView = newHasRelationView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW, oldHasRelationView, newHasRelationView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRelationView(RelationView newHasRelationView) {
		if (newHasRelationView != hasRelationView) {
			NotificationChain msgs = null;
			if (hasRelationView != null)
				msgs = ((InternalEObject)hasRelationView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW, null, msgs);
			if (newHasRelationView != null)
				msgs = ((InternalEObject)newHasRelationView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW, null, msgs);
			msgs = basicSetHasRelationView(newHasRelationView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW, newHasRelationView, newHasRelationView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationView getFromRelation() {
		if (fromRelation != null && fromRelation.eIsProxy()) {
			InternalEObject oldFromRelation = (InternalEObject)fromRelation;
			fromRelation = (RelationView)eResolveProxy(oldFromRelation);
			if (fromRelation != oldFromRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.VIEWS__FROM_RELATION, oldFromRelation, fromRelation));
			}
		}
		return fromRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationView basicGetFromRelation() {
		return fromRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromRelation(RelationView newFromRelation) {
		RelationView oldFromRelation = fromRelation;
		fromRelation = newFromRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.VIEWS__FROM_RELATION, oldFromRelation, fromRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW:
				return basicSetHasRelationView(null, msgs);
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
			case MetawebdesignPackage.VIEWS__TITLE:
				return getTitle();
			case MetawebdesignPackage.VIEWS__ROL_VIEW:
				return getRolView();
			case MetawebdesignPackage.VIEWS__GROUP_NAME:
				if (resolve) return getGroupName();
				return basicGetGroupName();
			case MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW:
				return getHasRelationView();
			case MetawebdesignPackage.VIEWS__FROM_RELATION:
				if (resolve) return getFromRelation();
				return basicGetFromRelation();
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
			case MetawebdesignPackage.VIEWS__TITLE:
				setTitle((String)newValue);
				return;
			case MetawebdesignPackage.VIEWS__ROL_VIEW:
				setRolView((TypeRol)newValue);
				return;
			case MetawebdesignPackage.VIEWS__GROUP_NAME:
				setGroupName((Group)newValue);
				return;
			case MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW:
				setHasRelationView((RelationView)newValue);
				return;
			case MetawebdesignPackage.VIEWS__FROM_RELATION:
				setFromRelation((RelationView)newValue);
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
			case MetawebdesignPackage.VIEWS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case MetawebdesignPackage.VIEWS__ROL_VIEW:
				setRolView(ROL_VIEW_EDEFAULT);
				return;
			case MetawebdesignPackage.VIEWS__GROUP_NAME:
				setGroupName((Group)null);
				return;
			case MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW:
				setHasRelationView((RelationView)null);
				return;
			case MetawebdesignPackage.VIEWS__FROM_RELATION:
				setFromRelation((RelationView)null);
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
			case MetawebdesignPackage.VIEWS__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case MetawebdesignPackage.VIEWS__ROL_VIEW:
				return rolView != ROL_VIEW_EDEFAULT;
			case MetawebdesignPackage.VIEWS__GROUP_NAME:
				return groupName != null;
			case MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW:
				return hasRelationView != null;
			case MetawebdesignPackage.VIEWS__FROM_RELATION:
				return fromRelation != null;
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
		result.append(", rolView: ");
		result.append(rolView);
		result.append(')');
		return result.toString();
	}

} //ViewsImpl
