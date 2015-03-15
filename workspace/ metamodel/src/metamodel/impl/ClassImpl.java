/**
 */
package metamodel.impl;

import java.util.Collection;

import metamodel.Attribute;
import metamodel.Constraints;
import metamodel.Oo_methodPackage;
import metamodel.Relation;
import metamodel.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oo_method.impl.ClassImpl#getRCompound <em>RCompound</em>}</li>
 *   <li>{@link oo_method.impl.ClassImpl#getRComponents <em>RComponents</em>}</li>
 *   <li>{@link oo_method.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link oo_method.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link oo_method.impl.ClassImpl#getIdFunction <em>Id Function</em>}</li>
 *   <li>{@link oo_method.impl.ClassImpl#getServices <em>Services</em>}</li>
 *   <li>{@link oo_method.impl.ClassImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements metamodel.Class {
	/**
	 * The cached value of the '{@link #getRCompound() <em>RCompound</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCompound()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> rCompound;

	/**
	 * The cached value of the '{@link #getRComponents() <em>RComponents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> rComponents;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	 * The default value of the '{@link #getIdFunction() <em>Id Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdFunction() <em>Id Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdFunction()
	 * @generated
	 * @ordered
	 */
	protected String idFunction = ID_FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraints> constraints;

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
		return Oo_methodPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRCompound() {
		if (rCompound == null) {
			rCompound = new EObjectContainmentWithInverseEList<Relation>(Relation.class, this, Oo_methodPackage.CLASS__RCOMPOUND, Oo_methodPackage.RELATION__COMPOSED);
		}
		return rCompound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRComponents() {
		if (rComponents == null) {
			rComponents = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, Oo_methodPackage.CLASS__RCOMPONENTS, Oo_methodPackage.RELATION__COMPONENT);
		}
		return rComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, Oo_methodPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Oo_methodPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdFunction() {
		return idFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdFunction(String newIdFunction) {
		String oldIdFunction = idFunction;
		idFunction = newIdFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oo_methodPackage.CLASS__ID_FUNCTION, oldIdFunction, idFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, Oo_methodPackage.CLASS__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraints> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraints>(Constraints.class, this, Oo_methodPackage.CLASS__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Oo_methodPackage.CLASS__RCOMPOUND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRCompound()).basicAdd(otherEnd, msgs);
			case Oo_methodPackage.CLASS__RCOMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRComponents()).basicAdd(otherEnd, msgs);
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
			case Oo_methodPackage.CLASS__RCOMPOUND:
				return ((InternalEList<?>)getRCompound()).basicRemove(otherEnd, msgs);
			case Oo_methodPackage.CLASS__RCOMPONENTS:
				return ((InternalEList<?>)getRComponents()).basicRemove(otherEnd, msgs);
			case Oo_methodPackage.CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case Oo_methodPackage.CLASS__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case Oo_methodPackage.CLASS__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case Oo_methodPackage.CLASS__RCOMPOUND:
				return getRCompound();
			case Oo_methodPackage.CLASS__RCOMPONENTS:
				return getRComponents();
			case Oo_methodPackage.CLASS__ATTRIBUTES:
				return getAttributes();
			case Oo_methodPackage.CLASS__NAME:
				return getName();
			case Oo_methodPackage.CLASS__ID_FUNCTION:
				return getIdFunction();
			case Oo_methodPackage.CLASS__SERVICES:
				return getServices();
			case Oo_methodPackage.CLASS__CONSTRAINTS:
				return getConstraints();
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
			case Oo_methodPackage.CLASS__RCOMPOUND:
				getRCompound().clear();
				getRCompound().addAll((Collection<? extends Relation>)newValue);
				return;
			case Oo_methodPackage.CLASS__RCOMPONENTS:
				getRComponents().clear();
				getRComponents().addAll((Collection<? extends Relation>)newValue);
				return;
			case Oo_methodPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case Oo_methodPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case Oo_methodPackage.CLASS__ID_FUNCTION:
				setIdFunction((String)newValue);
				return;
			case Oo_methodPackage.CLASS__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case Oo_methodPackage.CLASS__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraints>)newValue);
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
			case Oo_methodPackage.CLASS__RCOMPOUND:
				getRCompound().clear();
				return;
			case Oo_methodPackage.CLASS__RCOMPONENTS:
				getRComponents().clear();
				return;
			case Oo_methodPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case Oo_methodPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Oo_methodPackage.CLASS__ID_FUNCTION:
				setIdFunction(ID_FUNCTION_EDEFAULT);
				return;
			case Oo_methodPackage.CLASS__SERVICES:
				getServices().clear();
				return;
			case Oo_methodPackage.CLASS__CONSTRAINTS:
				getConstraints().clear();
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
			case Oo_methodPackage.CLASS__RCOMPOUND:
				return rCompound != null && !rCompound.isEmpty();
			case Oo_methodPackage.CLASS__RCOMPONENTS:
				return rComponents != null && !rComponents.isEmpty();
			case Oo_methodPackage.CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case Oo_methodPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Oo_methodPackage.CLASS__ID_FUNCTION:
				return ID_FUNCTION_EDEFAULT == null ? idFunction != null : !ID_FUNCTION_EDEFAULT.equals(idFunction);
			case Oo_methodPackage.CLASS__SERVICES:
				return services != null && !services.isEmpty();
			case Oo_methodPackage.CLASS__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
		result.append(", idFunction: ");
		result.append(idFunction);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
