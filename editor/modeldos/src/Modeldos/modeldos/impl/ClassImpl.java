/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.Attributes;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.Relations_Class;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getRelationclass <em>Relationclass</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getGoclass1 <em>Goclass1</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getId <em>Id</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getFunctionCreate <em>Function Create</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getFunctionDelete <em>Function Delete</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getFunctionUpdate <em>Function Update</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getFunctionIndex <em>Function Index</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getFunctionView <em>Function View</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getFunctionAdmin <em>Function Admin</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.ClassImpl#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements Modeldos.modeldos.Class {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attributes> attributes;

	/**
	 * The cached value of the '{@link #getRelationclass() <em>Relationclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationclass()
	 * @generated
	 * @ordered
	 */
	protected EList<Relations_Class> relationclass;

	/**
	 * The cached value of the '{@link #getGoclass1() <em>Goclass1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoclass1()
	 * @generated
	 * @ordered
	 */
	protected Relations_Class goclass1;

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
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<Views> views;

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
		return ModeldosPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributes> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attributes>(Attributes.class, this, ModeldosPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relations_Class> getRelationclass() {
		if (relationclass == null) {
			relationclass = new EObjectContainmentEList<Relations_Class>(Relations_Class.class, this, ModeldosPackage.CLASS__RELATIONCLASS);
		}
		return relationclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations_Class getGoclass1() {
		if (goclass1 != null && goclass1.eIsProxy()) {
			InternalEObject oldGoclass1 = (InternalEObject)goclass1;
			goclass1 = (Relations_Class)eResolveProxy(oldGoclass1);
			if (goclass1 != oldGoclass1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeldosPackage.CLASS__GOCLASS1, oldGoclass1, goclass1));
			}
		}
		return goclass1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations_Class basicGetGoclass1() {
		return goclass1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoclass1(Relations_Class newGoclass1) {
		Relations_Class oldGoclass1 = goclass1;
		goclass1 = newGoclass1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__GOCLASS1, oldGoclass1, goclass1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__FUNCTION_CREATE, oldFunctionCreate, functionCreate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__FUNCTION_DELETE, oldFunctionDelete, functionDelete));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__FUNCTION_UPDATE, oldFunctionUpdate, functionUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__FUNCTION_INDEX, oldFunctionIndex, functionIndex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__FUNCTION_VIEW, oldFunctionView, functionView));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.CLASS__FUNCTION_ADMIN, oldFunctionAdmin, functionAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Views> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<Views>(Views.class, this, ModeldosPackage.CLASS__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeldosPackage.CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ModeldosPackage.CLASS__RELATIONCLASS:
				return ((InternalEList<?>)getRelationclass()).basicRemove(otherEnd, msgs);
			case ModeldosPackage.CLASS__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
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
			case ModeldosPackage.CLASS__ATTRIBUTES:
				return getAttributes();
			case ModeldosPackage.CLASS__RELATIONCLASS:
				return getRelationclass();
			case ModeldosPackage.CLASS__GOCLASS1:
				if (resolve) return getGoclass1();
				return basicGetGoclass1();
			case ModeldosPackage.CLASS__ID:
				return getId();
			case ModeldosPackage.CLASS__NAME:
				return getName();
			case ModeldosPackage.CLASS__FUNCTION_CREATE:
				return getFunctionCreate();
			case ModeldosPackage.CLASS__FUNCTION_DELETE:
				return getFunctionDelete();
			case ModeldosPackage.CLASS__FUNCTION_UPDATE:
				return getFunctionUpdate();
			case ModeldosPackage.CLASS__FUNCTION_INDEX:
				return getFunctionIndex();
			case ModeldosPackage.CLASS__FUNCTION_VIEW:
				return getFunctionView();
			case ModeldosPackage.CLASS__FUNCTION_ADMIN:
				return getFunctionAdmin();
			case ModeldosPackage.CLASS__VIEWS:
				return getViews();
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
			case ModeldosPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attributes>)newValue);
				return;
			case ModeldosPackage.CLASS__RELATIONCLASS:
				getRelationclass().clear();
				getRelationclass().addAll((Collection<? extends Relations_Class>)newValue);
				return;
			case ModeldosPackage.CLASS__GOCLASS1:
				setGoclass1((Relations_Class)newValue);
				return;
			case ModeldosPackage.CLASS__ID:
				setId((Integer)newValue);
				return;
			case ModeldosPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case ModeldosPackage.CLASS__FUNCTION_CREATE:
				setFunctionCreate((TypeRol)newValue);
				return;
			case ModeldosPackage.CLASS__FUNCTION_DELETE:
				setFunctionDelete((TypeRol)newValue);
				return;
			case ModeldosPackage.CLASS__FUNCTION_UPDATE:
				setFunctionUpdate((TypeRol)newValue);
				return;
			case ModeldosPackage.CLASS__FUNCTION_INDEX:
				setFunctionIndex((TypeRol)newValue);
				return;
			case ModeldosPackage.CLASS__FUNCTION_VIEW:
				setFunctionView((TypeRol)newValue);
				return;
			case ModeldosPackage.CLASS__FUNCTION_ADMIN:
				setFunctionAdmin((TypeRol)newValue);
				return;
			case ModeldosPackage.CLASS__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends Views>)newValue);
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
			case ModeldosPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ModeldosPackage.CLASS__RELATIONCLASS:
				getRelationclass().clear();
				return;
			case ModeldosPackage.CLASS__GOCLASS1:
				setGoclass1((Relations_Class)null);
				return;
			case ModeldosPackage.CLASS__ID:
				setId(ID_EDEFAULT);
				return;
			case ModeldosPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModeldosPackage.CLASS__FUNCTION_CREATE:
				setFunctionCreate(FUNCTION_CREATE_EDEFAULT);
				return;
			case ModeldosPackage.CLASS__FUNCTION_DELETE:
				setFunctionDelete(FUNCTION_DELETE_EDEFAULT);
				return;
			case ModeldosPackage.CLASS__FUNCTION_UPDATE:
				setFunctionUpdate(FUNCTION_UPDATE_EDEFAULT);
				return;
			case ModeldosPackage.CLASS__FUNCTION_INDEX:
				setFunctionIndex(FUNCTION_INDEX_EDEFAULT);
				return;
			case ModeldosPackage.CLASS__FUNCTION_VIEW:
				setFunctionView(FUNCTION_VIEW_EDEFAULT);
				return;
			case ModeldosPackage.CLASS__FUNCTION_ADMIN:
				setFunctionAdmin(FUNCTION_ADMIN_EDEFAULT);
				return;
			case ModeldosPackage.CLASS__VIEWS:
				getViews().clear();
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
			case ModeldosPackage.CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ModeldosPackage.CLASS__RELATIONCLASS:
				return relationclass != null && !relationclass.isEmpty();
			case ModeldosPackage.CLASS__GOCLASS1:
				return goclass1 != null;
			case ModeldosPackage.CLASS__ID:
				return id != ID_EDEFAULT;
			case ModeldosPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModeldosPackage.CLASS__FUNCTION_CREATE:
				return functionCreate != FUNCTION_CREATE_EDEFAULT;
			case ModeldosPackage.CLASS__FUNCTION_DELETE:
				return functionDelete != FUNCTION_DELETE_EDEFAULT;
			case ModeldosPackage.CLASS__FUNCTION_UPDATE:
				return functionUpdate != FUNCTION_UPDATE_EDEFAULT;
			case ModeldosPackage.CLASS__FUNCTION_INDEX:
				return functionIndex != FUNCTION_INDEX_EDEFAULT;
			case ModeldosPackage.CLASS__FUNCTION_VIEW:
				return functionView != FUNCTION_VIEW_EDEFAULT;
			case ModeldosPackage.CLASS__FUNCTION_ADMIN:
				return functionAdmin != FUNCTION_ADMIN_EDEFAULT;
			case ModeldosPackage.CLASS__VIEWS:
				return views != null && !views.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
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
