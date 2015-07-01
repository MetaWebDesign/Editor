/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.Constraint;
import Metawebdesign.metawebdesign.Group;
import Metawebdesign.metawebdesign.Link;
import Metawebdesign.metawebdesign.Menu;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.Root;
import Metawebdesign.metawebdesign.ViewComponent;
import Metawebdesign.metawebdesign.Views;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RootImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RootImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RootImpl#getViews <em>Views</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RootImpl#getView_component <em>View component</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RootImpl#getLink <em>Link</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RootImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<Metawebdesign.metawebdesign.Class> class_;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attributes> attribute;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menu;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<Views> views;

	/**
	 * The cached value of the '{@link #getView_component() <em>View component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView_component()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewComponent> view_component;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metawebdesign.metawebdesign.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<Metawebdesign.metawebdesign.Class>(Metawebdesign.metawebdesign.Class.class, this, MetawebdesignPackage.ROOT__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributes> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attributes>(Attributes.class, this, MetawebdesignPackage.ROOT__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getMenu() {
		if (menu == null) {
			menu = new EObjectContainmentEList<Menu>(Menu.class, this, MetawebdesignPackage.ROOT__MENU);
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, MetawebdesignPackage.ROOT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Views> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<Views>(Views.class, this, MetawebdesignPackage.ROOT__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewComponent> getView_component() {
		if (view_component == null) {
			view_component = new EObjectContainmentEList<ViewComponent>(ViewComponent.class, this, MetawebdesignPackage.ROOT__VIEW_COMPONENT);
		}
		return view_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, MetawebdesignPackage.ROOT__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, MetawebdesignPackage.ROOT__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetawebdesignPackage.ROOT__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.ROOT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.ROOT__MENU:
				return ((InternalEList<?>)getMenu()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.ROOT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.ROOT__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.ROOT__VIEW_COMPONENT:
				return ((InternalEList<?>)getView_component()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.ROOT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.ROOT__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
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
			case MetawebdesignPackage.ROOT__CLASS:
				return getClass_();
			case MetawebdesignPackage.ROOT__ATTRIBUTE:
				return getAttribute();
			case MetawebdesignPackage.ROOT__MENU:
				return getMenu();
			case MetawebdesignPackage.ROOT__GROUP:
				return getGroup();
			case MetawebdesignPackage.ROOT__VIEWS:
				return getViews();
			case MetawebdesignPackage.ROOT__VIEW_COMPONENT:
				return getView_component();
			case MetawebdesignPackage.ROOT__LINK:
				return getLink();
			case MetawebdesignPackage.ROOT__CONSTRAINT:
				return getConstraint();
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
			case MetawebdesignPackage.ROOT__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends Metawebdesign.metawebdesign.Class>)newValue);
				return;
			case MetawebdesignPackage.ROOT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attributes>)newValue);
				return;
			case MetawebdesignPackage.ROOT__MENU:
				getMenu().clear();
				getMenu().addAll((Collection<? extends Menu>)newValue);
				return;
			case MetawebdesignPackage.ROOT__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case MetawebdesignPackage.ROOT__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends Views>)newValue);
				return;
			case MetawebdesignPackage.ROOT__VIEW_COMPONENT:
				getView_component().clear();
				getView_component().addAll((Collection<? extends ViewComponent>)newValue);
				return;
			case MetawebdesignPackage.ROOT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case MetawebdesignPackage.ROOT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
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
			case MetawebdesignPackage.ROOT__CLASS:
				getClass_().clear();
				return;
			case MetawebdesignPackage.ROOT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case MetawebdesignPackage.ROOT__MENU:
				getMenu().clear();
				return;
			case MetawebdesignPackage.ROOT__GROUP:
				getGroup().clear();
				return;
			case MetawebdesignPackage.ROOT__VIEWS:
				getViews().clear();
				return;
			case MetawebdesignPackage.ROOT__VIEW_COMPONENT:
				getView_component().clear();
				return;
			case MetawebdesignPackage.ROOT__LINK:
				getLink().clear();
				return;
			case MetawebdesignPackage.ROOT__CONSTRAINT:
				getConstraint().clear();
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
			case MetawebdesignPackage.ROOT__CLASS:
				return class_ != null && !class_.isEmpty();
			case MetawebdesignPackage.ROOT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case MetawebdesignPackage.ROOT__MENU:
				return menu != null && !menu.isEmpty();
			case MetawebdesignPackage.ROOT__GROUP:
				return group != null && !group.isEmpty();
			case MetawebdesignPackage.ROOT__VIEWS:
				return views != null && !views.isEmpty();
			case MetawebdesignPackage.ROOT__VIEW_COMPONENT:
				return view_component != null && !view_component.isEmpty();
			case MetawebdesignPackage.ROOT__LINK:
				return link != null && !link.isEmpty();
			case MetawebdesignPackage.ROOT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
