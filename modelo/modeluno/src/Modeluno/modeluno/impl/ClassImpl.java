/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.RelationAttribute;
import Modeluno.modeluno.RelationClass;
import Modeluno.modeluno.RelationService;

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
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getHasRelation <em>Has Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getGoRelation <em>Go Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getIdFunction <em>Id Function</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getGoAtributteRelation <em>Go Atributte Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getHasAtributeRelation <em>Has Atribute Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getHasServiceRelation <em>Has Service Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getGoServiceRelation <em>Go Service Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements Modeluno.modeluno.Class {
	/**
	 * The cached value of the '{@link #getHasRelation() <em>Has Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationClass> hasRelation;

	/**
	 * The cached value of the '{@link #getGoRelation() <em>Go Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationClass> goRelation;

	/**
	 * The default value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected static final String CNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected String cname = CNAME_EDEFAULT;

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
	 * The cached value of the '{@link #getGoAtributteRelation() <em>Go Atributte Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoAtributteRelation()
	 * @generated
	 * @ordered
	 */
	protected RelationAttribute goAtributteRelation;

	/**
	 * The cached value of the '{@link #getHasAtributeRelation() <em>Has Atribute Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAtributeRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationAttribute> hasAtributeRelation;

	/**
	 * The cached value of the '{@link #getHasServiceRelation() <em>Has Service Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasServiceRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationService> hasServiceRelation;

	/**
	 * The cached value of the '{@link #getGoServiceRelation() <em>Go Service Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoServiceRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationService> goServiceRelation;

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
		return ModelunoPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClass> getHasRelation() {
		if (hasRelation == null) {
			hasRelation = new EObjectContainmentEList<RelationClass>(RelationClass.class, this, ModelunoPackage.CLASS__HAS_RELATION);
		}
		return hasRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClass> getGoRelation() {
		if (goRelation == null) {
			goRelation = new EObjectResolvingEList<RelationClass>(RelationClass.class, this, ModelunoPackage.CLASS__GO_RELATION);
		}
		return goRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCname(String newCname) {
		String oldCname = cname;
		cname = newCname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CLASS__CNAME, oldCname, cname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CLASS__ID_FUNCTION, oldIdFunction, idFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationAttribute getGoAtributteRelation() {
		if (goAtributteRelation != null && goAtributteRelation.eIsProxy()) {
			InternalEObject oldGoAtributteRelation = (InternalEObject)goAtributteRelation;
			goAtributteRelation = (RelationAttribute)eResolveProxy(oldGoAtributteRelation);
			if (goAtributteRelation != oldGoAtributteRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.CLASS__GO_ATRIBUTTE_RELATION, oldGoAtributteRelation, goAtributteRelation));
			}
		}
		return goAtributteRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationAttribute basicGetGoAtributteRelation() {
		return goAtributteRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoAtributteRelation(RelationAttribute newGoAtributteRelation) {
		RelationAttribute oldGoAtributteRelation = goAtributteRelation;
		goAtributteRelation = newGoAtributteRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CLASS__GO_ATRIBUTTE_RELATION, oldGoAtributteRelation, goAtributteRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationAttribute> getHasAtributeRelation() {
		if (hasAtributeRelation == null) {
			hasAtributeRelation = new EObjectContainmentEList<RelationAttribute>(RelationAttribute.class, this, ModelunoPackage.CLASS__HAS_ATRIBUTE_RELATION);
		}
		return hasAtributeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationService> getHasServiceRelation() {
		if (hasServiceRelation == null) {
			hasServiceRelation = new EObjectContainmentEList<RelationService>(RelationService.class, this, ModelunoPackage.CLASS__HAS_SERVICE_RELATION);
		}
		return hasServiceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationService> getGoServiceRelation() {
		if (goServiceRelation == null) {
			goServiceRelation = new EObjectResolvingEList<RelationService>(RelationService.class, this, ModelunoPackage.CLASS__GO_SERVICE_RELATION);
		}
		return goServiceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.CLASS__HAS_RELATION:
				return ((InternalEList<?>)getHasRelation()).basicRemove(otherEnd, msgs);
			case ModelunoPackage.CLASS__HAS_ATRIBUTE_RELATION:
				return ((InternalEList<?>)getHasAtributeRelation()).basicRemove(otherEnd, msgs);
			case ModelunoPackage.CLASS__HAS_SERVICE_RELATION:
				return ((InternalEList<?>)getHasServiceRelation()).basicRemove(otherEnd, msgs);
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
			case ModelunoPackage.CLASS__HAS_RELATION:
				return getHasRelation();
			case ModelunoPackage.CLASS__GO_RELATION:
				return getGoRelation();
			case ModelunoPackage.CLASS__CNAME:
				return getCname();
			case ModelunoPackage.CLASS__ID_FUNCTION:
				return getIdFunction();
			case ModelunoPackage.CLASS__GO_ATRIBUTTE_RELATION:
				if (resolve) return getGoAtributteRelation();
				return basicGetGoAtributteRelation();
			case ModelunoPackage.CLASS__HAS_ATRIBUTE_RELATION:
				return getHasAtributeRelation();
			case ModelunoPackage.CLASS__HAS_SERVICE_RELATION:
				return getHasServiceRelation();
			case ModelunoPackage.CLASS__GO_SERVICE_RELATION:
				return getGoServiceRelation();
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
			case ModelunoPackage.CLASS__HAS_RELATION:
				getHasRelation().clear();
				getHasRelation().addAll((Collection<? extends RelationClass>)newValue);
				return;
			case ModelunoPackage.CLASS__GO_RELATION:
				getGoRelation().clear();
				getGoRelation().addAll((Collection<? extends RelationClass>)newValue);
				return;
			case ModelunoPackage.CLASS__CNAME:
				setCname((String)newValue);
				return;
			case ModelunoPackage.CLASS__ID_FUNCTION:
				setIdFunction((String)newValue);
				return;
			case ModelunoPackage.CLASS__GO_ATRIBUTTE_RELATION:
				setGoAtributteRelation((RelationAttribute)newValue);
				return;
			case ModelunoPackage.CLASS__HAS_ATRIBUTE_RELATION:
				getHasAtributeRelation().clear();
				getHasAtributeRelation().addAll((Collection<? extends RelationAttribute>)newValue);
				return;
			case ModelunoPackage.CLASS__HAS_SERVICE_RELATION:
				getHasServiceRelation().clear();
				getHasServiceRelation().addAll((Collection<? extends RelationService>)newValue);
				return;
			case ModelunoPackage.CLASS__GO_SERVICE_RELATION:
				getGoServiceRelation().clear();
				getGoServiceRelation().addAll((Collection<? extends RelationService>)newValue);
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
			case ModelunoPackage.CLASS__HAS_RELATION:
				getHasRelation().clear();
				return;
			case ModelunoPackage.CLASS__GO_RELATION:
				getGoRelation().clear();
				return;
			case ModelunoPackage.CLASS__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case ModelunoPackage.CLASS__ID_FUNCTION:
				setIdFunction(ID_FUNCTION_EDEFAULT);
				return;
			case ModelunoPackage.CLASS__GO_ATRIBUTTE_RELATION:
				setGoAtributteRelation((RelationAttribute)null);
				return;
			case ModelunoPackage.CLASS__HAS_ATRIBUTE_RELATION:
				getHasAtributeRelation().clear();
				return;
			case ModelunoPackage.CLASS__HAS_SERVICE_RELATION:
				getHasServiceRelation().clear();
				return;
			case ModelunoPackage.CLASS__GO_SERVICE_RELATION:
				getGoServiceRelation().clear();
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
			case ModelunoPackage.CLASS__HAS_RELATION:
				return hasRelation != null && !hasRelation.isEmpty();
			case ModelunoPackage.CLASS__GO_RELATION:
				return goRelation != null && !goRelation.isEmpty();
			case ModelunoPackage.CLASS__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case ModelunoPackage.CLASS__ID_FUNCTION:
				return ID_FUNCTION_EDEFAULT == null ? idFunction != null : !ID_FUNCTION_EDEFAULT.equals(idFunction);
			case ModelunoPackage.CLASS__GO_ATRIBUTTE_RELATION:
				return goAtributteRelation != null;
			case ModelunoPackage.CLASS__HAS_ATRIBUTE_RELATION:
				return hasAtributeRelation != null && !hasAtributeRelation.isEmpty();
			case ModelunoPackage.CLASS__HAS_SERVICE_RELATION:
				return hasServiceRelation != null && !hasServiceRelation.isEmpty();
			case ModelunoPackage.CLASS__GO_SERVICE_RELATION:
				return goServiceRelation != null && !goServiceRelation.isEmpty();
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
		result.append(" (Cname: ");
		result.append(cname);
		result.append(", idFunction: ");
		result.append(idFunction);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
