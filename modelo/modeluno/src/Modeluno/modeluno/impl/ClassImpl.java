/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Attribute_Relation;
import Modeluno.modeluno.Class_Relation;
import Modeluno.modeluno.Constraints_Relation;
import Modeluno.modeluno.ModelunoPackage;

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
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getHasConstraintsRelation <em>Has Constraints Relation</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getGoConstraintsRelation <em>Go Constraints Relation</em>}</li>
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
	protected EList<Class_Relation> hasRelation;

	/**
	 * The cached value of the '{@link #getGoRelation() <em>Go Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Class_Relation> goRelation;

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
	protected Attribute_Relation goAtributteRelation;

	/**
	 * The cached value of the '{@link #getHasAtributeRelation() <em>Has Atribute Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAtributeRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute_Relation> hasAtributeRelation;

	/**
	 * The cached value of the '{@link #getHasConstraintsRelation() <em>Has Constraints Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConstraintsRelation()
	 * @generated
	 * @ordered
	 */
	protected Constraints_Relation hasConstraintsRelation;

	/**
	 * The cached value of the '{@link #getGoConstraintsRelation() <em>Go Constraints Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoConstraintsRelation()
	 * @generated
	 * @ordered
	 */
	protected Constraints_Relation goConstraintsRelation;

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
	public EList<Class_Relation> getHasRelation() {
		if (hasRelation == null) {
			hasRelation = new EObjectContainmentEList<Class_Relation>(Class_Relation.class, this, ModelunoPackage.CLASS__HAS_RELATION);
		}
		return hasRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Class_Relation> getGoRelation() {
		if (goRelation == null) {
			goRelation = new EObjectResolvingEList<Class_Relation>(Class_Relation.class, this, ModelunoPackage.CLASS__GO_RELATION);
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
	public Attribute_Relation getGoAtributteRelation() {
		if (goAtributteRelation != null && goAtributteRelation.eIsProxy()) {
			InternalEObject oldGoAtributteRelation = (InternalEObject)goAtributteRelation;
			goAtributteRelation = (Attribute_Relation)eResolveProxy(oldGoAtributteRelation);
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
	public Attribute_Relation basicGetGoAtributteRelation() {
		return goAtributteRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoAtributteRelation(Attribute_Relation newGoAtributteRelation) {
		Attribute_Relation oldGoAtributteRelation = goAtributteRelation;
		goAtributteRelation = newGoAtributteRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CLASS__GO_ATRIBUTTE_RELATION, oldGoAtributteRelation, goAtributteRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute_Relation> getHasAtributeRelation() {
		if (hasAtributeRelation == null) {
			hasAtributeRelation = new EObjectContainmentEList<Attribute_Relation>(Attribute_Relation.class, this, ModelunoPackage.CLASS__HAS_ATRIBUTE_RELATION);
		}
		return hasAtributeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints_Relation getHasConstraintsRelation() {
		return hasConstraintsRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasConstraintsRelation(Constraints_Relation newHasConstraintsRelation, NotificationChain msgs) {
		Constraints_Relation oldHasConstraintsRelation = hasConstraintsRelation;
		hasConstraintsRelation = newHasConstraintsRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.CLASS__HAS_CONSTRAINTS_RELATION, oldHasConstraintsRelation, newHasConstraintsRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasConstraintsRelation(Constraints_Relation newHasConstraintsRelation) {
		if (newHasConstraintsRelation != hasConstraintsRelation) {
			NotificationChain msgs = null;
			if (hasConstraintsRelation != null)
				msgs = ((InternalEObject)hasConstraintsRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.CLASS__HAS_CONSTRAINTS_RELATION, null, msgs);
			if (newHasConstraintsRelation != null)
				msgs = ((InternalEObject)newHasConstraintsRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.CLASS__HAS_CONSTRAINTS_RELATION, null, msgs);
			msgs = basicSetHasConstraintsRelation(newHasConstraintsRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CLASS__HAS_CONSTRAINTS_RELATION, newHasConstraintsRelation, newHasConstraintsRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints_Relation getGoConstraintsRelation() {
		if (goConstraintsRelation != null && goConstraintsRelation.eIsProxy()) {
			InternalEObject oldGoConstraintsRelation = (InternalEObject)goConstraintsRelation;
			goConstraintsRelation = (Constraints_Relation)eResolveProxy(oldGoConstraintsRelation);
			if (goConstraintsRelation != oldGoConstraintsRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.CLASS__GO_CONSTRAINTS_RELATION, oldGoConstraintsRelation, goConstraintsRelation));
			}
		}
		return goConstraintsRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints_Relation basicGetGoConstraintsRelation() {
		return goConstraintsRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoConstraintsRelation(Constraints_Relation newGoConstraintsRelation) {
		Constraints_Relation oldGoConstraintsRelation = goConstraintsRelation;
		goConstraintsRelation = newGoConstraintsRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CLASS__GO_CONSTRAINTS_RELATION, oldGoConstraintsRelation, goConstraintsRelation));
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
			case ModelunoPackage.CLASS__HAS_CONSTRAINTS_RELATION:
				return basicSetHasConstraintsRelation(null, msgs);
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
			case ModelunoPackage.CLASS__HAS_CONSTRAINTS_RELATION:
				return getHasConstraintsRelation();
			case ModelunoPackage.CLASS__GO_CONSTRAINTS_RELATION:
				if (resolve) return getGoConstraintsRelation();
				return basicGetGoConstraintsRelation();
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
				getHasRelation().addAll((Collection<? extends Class_Relation>)newValue);
				return;
			case ModelunoPackage.CLASS__GO_RELATION:
				getGoRelation().clear();
				getGoRelation().addAll((Collection<? extends Class_Relation>)newValue);
				return;
			case ModelunoPackage.CLASS__CNAME:
				setCname((String)newValue);
				return;
			case ModelunoPackage.CLASS__ID_FUNCTION:
				setIdFunction((String)newValue);
				return;
			case ModelunoPackage.CLASS__GO_ATRIBUTTE_RELATION:
				setGoAtributteRelation((Attribute_Relation)newValue);
				return;
			case ModelunoPackage.CLASS__HAS_ATRIBUTE_RELATION:
				getHasAtributeRelation().clear();
				getHasAtributeRelation().addAll((Collection<? extends Attribute_Relation>)newValue);
				return;
			case ModelunoPackage.CLASS__HAS_CONSTRAINTS_RELATION:
				setHasConstraintsRelation((Constraints_Relation)newValue);
				return;
			case ModelunoPackage.CLASS__GO_CONSTRAINTS_RELATION:
				setGoConstraintsRelation((Constraints_Relation)newValue);
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
				setGoAtributteRelation((Attribute_Relation)null);
				return;
			case ModelunoPackage.CLASS__HAS_ATRIBUTE_RELATION:
				getHasAtributeRelation().clear();
				return;
			case ModelunoPackage.CLASS__HAS_CONSTRAINTS_RELATION:
				setHasConstraintsRelation((Constraints_Relation)null);
				return;
			case ModelunoPackage.CLASS__GO_CONSTRAINTS_RELATION:
				setGoConstraintsRelation((Constraints_Relation)null);
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
			case ModelunoPackage.CLASS__HAS_CONSTRAINTS_RELATION:
				return hasConstraintsRelation != null;
			case ModelunoPackage.CLASS__GO_CONSTRAINTS_RELATION:
				return goConstraintsRelation != null;
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
