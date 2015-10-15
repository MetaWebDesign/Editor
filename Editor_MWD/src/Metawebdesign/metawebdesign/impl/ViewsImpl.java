/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.TypeRol;
import Metawebdesign.metawebdesign.ViewComponent;
import Metawebdesign.metawebdesign.Views;

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
 * An implementation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getRolView <em>Rol View</em>}</li>
<<<<<<< HEAD
=======
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getHasRelationView <em>Has Relation View</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getFromRelation <em>From Relation</em>}</li>
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
 *   <li>{@link Metawebdesign.metawebdesign.impl.ViewsImpl#getHasViewComponent <em>Has View Component</em>}</li>
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
<<<<<<< HEAD
=======
	 * The cached value of the '{@link #getHasRelationView() <em>Has Relation View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelationView()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationView> hasRelationView;

	/**
	 * The cached value of the '{@link #getFromRelation() <em>From Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationView> fromRelation;

	/**
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
	 * The cached value of the '{@link #getHasViewComponent() <em>Has View Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasViewComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewComponent> hasViewComponent;

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
<<<<<<< HEAD
=======
	public EList<RelationView> getHasRelationView() {
		if (hasRelationView == null) {
			hasRelationView = new EObjectContainmentEList<RelationView>(RelationView.class, this, MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW);
		}
		return hasRelationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationView> getFromRelation() {
		if (fromRelation == null) {
			fromRelation = new EObjectResolvingEList<RelationView>(RelationView.class, this, MetawebdesignPackage.VIEWS__FROM_RELATION);
		}
		return fromRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
	public EList<ViewComponent> getHasViewComponent() {
		if (hasViewComponent == null) {
			hasViewComponent = new EObjectContainmentEList<ViewComponent>(ViewComponent.class, this, MetawebdesignPackage.VIEWS__HAS_VIEW_COMPONENT);
		}
		return hasViewComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetawebdesignPackage.VIEWS__HAS_VIEW_COMPONENT:
				return ((InternalEList<?>)getHasViewComponent()).basicRemove(otherEnd, msgs);
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
<<<<<<< HEAD
=======
			case MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW:
				return getHasRelationView();
			case MetawebdesignPackage.VIEWS__FROM_RELATION:
				return getFromRelation();
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			case MetawebdesignPackage.VIEWS__HAS_VIEW_COMPONENT:
				return getHasViewComponent();
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
			case MetawebdesignPackage.VIEWS__TITLE:
				setTitle((String)newValue);
				return;
			case MetawebdesignPackage.VIEWS__ROL_VIEW:
				setRolView((TypeRol)newValue);
				return;
<<<<<<< HEAD
=======
			case MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW:
				getHasRelationView().clear();
				getHasRelationView().addAll((Collection<? extends RelationView>)newValue);
				return;
			case MetawebdesignPackage.VIEWS__FROM_RELATION:
				getFromRelation().clear();
				getFromRelation().addAll((Collection<? extends RelationView>)newValue);
				return;
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			case MetawebdesignPackage.VIEWS__HAS_VIEW_COMPONENT:
				getHasViewComponent().clear();
				getHasViewComponent().addAll((Collection<? extends ViewComponent>)newValue);
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
<<<<<<< HEAD
=======
			case MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW:
				getHasRelationView().clear();
				return;
			case MetawebdesignPackage.VIEWS__FROM_RELATION:
				getFromRelation().clear();
				return;
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			case MetawebdesignPackage.VIEWS__HAS_VIEW_COMPONENT:
				getHasViewComponent().clear();
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
<<<<<<< HEAD
=======
			case MetawebdesignPackage.VIEWS__HAS_RELATION_VIEW:
				return hasRelationView != null && !hasRelationView.isEmpty();
			case MetawebdesignPackage.VIEWS__FROM_RELATION:
				return fromRelation != null && !fromRelation.isEmpty();
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			case MetawebdesignPackage.VIEWS__HAS_VIEW_COMPONENT:
				return hasViewComponent != null && !hasViewComponent.isEmpty();
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
