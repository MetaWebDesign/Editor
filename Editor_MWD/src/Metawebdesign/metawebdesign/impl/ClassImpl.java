/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.Constraint;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.RelationClass;
import Metawebdesign.metawebdesign.TypeRol;

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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getHasAttributes <em>Has Attributes</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getId <em>Id</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getFunctionCreate <em>Function Create</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getFunctionDelete <em>Function Delete</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getFunctionUpdate <em>Function Update</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getFunctionIndex <em>Function Index</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getFunctionView <em>Function View</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getFunctionAdmin <em>Function Admin</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getHasRelationClass <em>Has Relation Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getGoRelationClass <em>Go Relation Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.ClassImpl#getHasConstraint <em>Has Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements Metawebdesign.metawebdesign.Class {
	/**
	 * The cached value of the '{@link #getHasAttributes() <em>Has Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attributes> hasAttributes;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionCreate() <em>Function Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionCreate()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRol FUNCTION_CREATE_EDEFAULT = TypeRol.AUTHENTICATED;

	/**
	 * The cached value of the '{@link #getFunctionCreate() <em>Function Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionCreate()
	 * @generated
	 * @ordered
	 */
	protected TypeRol functionCreate = FUNCTION_CREATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionDelete() <em>Function Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDelete()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRol FUNCTION_DELETE_EDEFAULT = TypeRol.AUTHENTICATED;

	/**
	 * The cached value of the '{@link #getFunctionDelete() <em>Function Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDelete()
	 * @generated
	 * @ordered
	 */
	protected TypeRol functionDelete = FUNCTION_DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionUpdate() <em>Function Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRol FUNCTION_UPDATE_EDEFAULT = TypeRol.AUTHENTICATED;

	/**
	 * The cached value of the '{@link #getFunctionUpdate() <em>Function Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionUpdate()
	 * @generated
	 * @ordered
	 */
	protected TypeRol functionUpdate = FUNCTION_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionIndex() <em>Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionIndex()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRol FUNCTION_INDEX_EDEFAULT = TypeRol.ANY;

	/**
	 * The cached value of the '{@link #getFunctionIndex() <em>Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionIndex()
	 * @generated
	 * @ordered
	 */
	protected TypeRol functionIndex = FUNCTION_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionView() <em>Function View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionView()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRol FUNCTION_VIEW_EDEFAULT = TypeRol.ANY;

	/**
	 * The cached value of the '{@link #getFunctionView() <em>Function View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionView()
	 * @generated
	 * @ordered
	 */
	protected TypeRol functionView = FUNCTION_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionAdmin() <em>Function Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRol FUNCTION_ADMIN_EDEFAULT = TypeRol.ADMIN;

	/**
	 * The cached value of the '{@link #getFunctionAdmin() <em>Function Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionAdmin()
	 * @generated
	 * @ordered
	 */
	protected TypeRol functionAdmin = FUNCTION_ADMIN_EDEFAULT;

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
	 * The cached value of the '{@link #getGoRelationClass() <em>Go Relation Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoRelationClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationClass> goRelationClass;

	/**
	 * The cached value of the '{@link #getHasConstraint() <em>Has Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> hasConstraint;

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
		return MetawebdesignPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributes> getHasAttributes() {
		if (hasAttributes == null) {
			hasAttributes = new EObjectContainmentEList<Attributes>(Attributes.class, this, MetawebdesignPackage.CLASS__HAS_ATTRIBUTES);
		}
		return hasAttributes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CLASS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol getFunctionCreate() {
		return functionCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionCreate(TypeRol newFunctionCreate) {
		TypeRol oldFunctionCreate = functionCreate;
		functionCreate = newFunctionCreate == null ? FUNCTION_CREATE_EDEFAULT : newFunctionCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CLASS__FUNCTION_CREATE, oldFunctionCreate, functionCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol getFunctionDelete() {
		return functionDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionDelete(TypeRol newFunctionDelete) {
		TypeRol oldFunctionDelete = functionDelete;
		functionDelete = newFunctionDelete == null ? FUNCTION_DELETE_EDEFAULT : newFunctionDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CLASS__FUNCTION_DELETE, oldFunctionDelete, functionDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol getFunctionUpdate() {
		return functionUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionUpdate(TypeRol newFunctionUpdate) {
		TypeRol oldFunctionUpdate = functionUpdate;
		functionUpdate = newFunctionUpdate == null ? FUNCTION_UPDATE_EDEFAULT : newFunctionUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CLASS__FUNCTION_UPDATE, oldFunctionUpdate, functionUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol getFunctionIndex() {
		return functionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionIndex(TypeRol newFunctionIndex) {
		TypeRol oldFunctionIndex = functionIndex;
		functionIndex = newFunctionIndex == null ? FUNCTION_INDEX_EDEFAULT : newFunctionIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CLASS__FUNCTION_INDEX, oldFunctionIndex, functionIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol getFunctionView() {
		return functionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionView(TypeRol newFunctionView) {
		TypeRol oldFunctionView = functionView;
		functionView = newFunctionView == null ? FUNCTION_VIEW_EDEFAULT : newFunctionView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CLASS__FUNCTION_VIEW, oldFunctionView, functionView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol getFunctionAdmin() {
		return functionAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionAdmin(TypeRol newFunctionAdmin) {
		TypeRol oldFunctionAdmin = functionAdmin;
		functionAdmin = newFunctionAdmin == null ? FUNCTION_ADMIN_EDEFAULT : newFunctionAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CLASS__FUNCTION_ADMIN, oldFunctionAdmin, functionAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClass> getHasRelationClass() {
		if (hasRelationClass == null) {
			hasRelationClass = new EObjectContainmentEList<RelationClass>(RelationClass.class, this, MetawebdesignPackage.CLASS__HAS_RELATION_CLASS);
		}
		return hasRelationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClass> getGoRelationClass() {
		if (goRelationClass == null) {
			goRelationClass = new EObjectResolvingEList<RelationClass>(RelationClass.class, this, MetawebdesignPackage.CLASS__GO_RELATION_CLASS);
		}
		return goRelationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getHasConstraint() {
		if (hasConstraint == null) {
			hasConstraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, MetawebdesignPackage.CLASS__HAS_CONSTRAINT);
		}
		return hasConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetawebdesignPackage.CLASS__HAS_ATTRIBUTES:
				return ((InternalEList<?>)getHasAttributes()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.CLASS__HAS_RELATION_CLASS:
				return ((InternalEList<?>)getHasRelationClass()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.CLASS__HAS_CONSTRAINT:
				return ((InternalEList<?>)getHasConstraint()).basicRemove(otherEnd, msgs);
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
			case MetawebdesignPackage.CLASS__HAS_ATTRIBUTES:
				return getHasAttributes();
			case MetawebdesignPackage.CLASS__NAME:
				return getName();
			case MetawebdesignPackage.CLASS__ID:
				return getId();
			case MetawebdesignPackage.CLASS__FUNCTION_CREATE:
				return getFunctionCreate();
			case MetawebdesignPackage.CLASS__FUNCTION_DELETE:
				return getFunctionDelete();
			case MetawebdesignPackage.CLASS__FUNCTION_UPDATE:
				return getFunctionUpdate();
			case MetawebdesignPackage.CLASS__FUNCTION_INDEX:
				return getFunctionIndex();
			case MetawebdesignPackage.CLASS__FUNCTION_VIEW:
				return getFunctionView();
			case MetawebdesignPackage.CLASS__FUNCTION_ADMIN:
				return getFunctionAdmin();
			case MetawebdesignPackage.CLASS__HAS_RELATION_CLASS:
				return getHasRelationClass();
			case MetawebdesignPackage.CLASS__GO_RELATION_CLASS:
				return getGoRelationClass();
			case MetawebdesignPackage.CLASS__HAS_CONSTRAINT:
				return getHasConstraint();
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
			case MetawebdesignPackage.CLASS__HAS_ATTRIBUTES:
				getHasAttributes().clear();
				getHasAttributes().addAll((Collection<? extends Attributes>)newValue);
				return;
			case MetawebdesignPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case MetawebdesignPackage.CLASS__ID:
				setId((Integer)newValue);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_CREATE:
				setFunctionCreate((TypeRol)newValue);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_DELETE:
				setFunctionDelete((TypeRol)newValue);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_UPDATE:
				setFunctionUpdate((TypeRol)newValue);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_INDEX:
				setFunctionIndex((TypeRol)newValue);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_VIEW:
				setFunctionView((TypeRol)newValue);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_ADMIN:
				setFunctionAdmin((TypeRol)newValue);
				return;
			case MetawebdesignPackage.CLASS__HAS_RELATION_CLASS:
				getHasRelationClass().clear();
				getHasRelationClass().addAll((Collection<? extends RelationClass>)newValue);
				return;
			case MetawebdesignPackage.CLASS__GO_RELATION_CLASS:
				getGoRelationClass().clear();
				getGoRelationClass().addAll((Collection<? extends RelationClass>)newValue);
				return;
			case MetawebdesignPackage.CLASS__HAS_CONSTRAINT:
				getHasConstraint().clear();
				getHasConstraint().addAll((Collection<? extends Constraint>)newValue);
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
			case MetawebdesignPackage.CLASS__HAS_ATTRIBUTES:
				getHasAttributes().clear();
				return;
			case MetawebdesignPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetawebdesignPackage.CLASS__ID:
				setId(ID_EDEFAULT);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_CREATE:
				setFunctionCreate(FUNCTION_CREATE_EDEFAULT);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_DELETE:
				setFunctionDelete(FUNCTION_DELETE_EDEFAULT);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_UPDATE:
				setFunctionUpdate(FUNCTION_UPDATE_EDEFAULT);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_INDEX:
				setFunctionIndex(FUNCTION_INDEX_EDEFAULT);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_VIEW:
				setFunctionView(FUNCTION_VIEW_EDEFAULT);
				return;
			case MetawebdesignPackage.CLASS__FUNCTION_ADMIN:
				setFunctionAdmin(FUNCTION_ADMIN_EDEFAULT);
				return;
			case MetawebdesignPackage.CLASS__HAS_RELATION_CLASS:
				getHasRelationClass().clear();
				return;
			case MetawebdesignPackage.CLASS__GO_RELATION_CLASS:
				getGoRelationClass().clear();
				return;
			case MetawebdesignPackage.CLASS__HAS_CONSTRAINT:
				getHasConstraint().clear();
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
			case MetawebdesignPackage.CLASS__HAS_ATTRIBUTES:
				return hasAttributes != null && !hasAttributes.isEmpty();
			case MetawebdesignPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetawebdesignPackage.CLASS__ID:
				return id != ID_EDEFAULT;
			case MetawebdesignPackage.CLASS__FUNCTION_CREATE:
				return functionCreate != FUNCTION_CREATE_EDEFAULT;
			case MetawebdesignPackage.CLASS__FUNCTION_DELETE:
				return functionDelete != FUNCTION_DELETE_EDEFAULT;
			case MetawebdesignPackage.CLASS__FUNCTION_UPDATE:
				return functionUpdate != FUNCTION_UPDATE_EDEFAULT;
			case MetawebdesignPackage.CLASS__FUNCTION_INDEX:
				return functionIndex != FUNCTION_INDEX_EDEFAULT;
			case MetawebdesignPackage.CLASS__FUNCTION_VIEW:
				return functionView != FUNCTION_VIEW_EDEFAULT;
			case MetawebdesignPackage.CLASS__FUNCTION_ADMIN:
				return functionAdmin != FUNCTION_ADMIN_EDEFAULT;
			case MetawebdesignPackage.CLASS__HAS_RELATION_CLASS:
				return hasRelationClass != null && !hasRelationClass.isEmpty();
			case MetawebdesignPackage.CLASS__GO_RELATION_CLASS:
				return goRelationClass != null && !goRelationClass.isEmpty();
			case MetawebdesignPackage.CLASS__HAS_CONSTRAINT:
				return hasConstraint != null && !hasConstraint.isEmpty();
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
		result.append(", id: ");
		result.append(id);
		result.append(", functionCreate: ");
		result.append(functionCreate);
		result.append(", functionDelete: ");
		result.append(functionDelete);
		result.append(", functionUpdate: ");
		result.append(functionUpdate);
		result.append(", functionIndex: ");
		result.append(functionIndex);
		result.append(", functionView: ");
		result.append(functionView);
		result.append(", functionAdmin: ");
		result.append(functionAdmin);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
