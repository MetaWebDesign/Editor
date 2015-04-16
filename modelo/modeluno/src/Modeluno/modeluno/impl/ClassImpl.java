/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.RAttribute;
import Modeluno.modeluno.Relation;

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
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getR1 <em>R1</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getIdFunction <em>Id Function</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getPoseeAtributte <em>Posee Atributte</em>}</li>
 *   <li>{@link Modeluno.modeluno.impl.ClassImpl#getEReference0 <em>EReference0</em>}</li>
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
	protected EList<Relation> hasRelation;

	/**
	 * The cached value of the '{@link #getR1() <em>R1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> r1;

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
	 * The cached value of the '{@link #getPoseeAtributte() <em>Posee Atributte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseeAtributte()
	 * @generated
	 * @ordered
	 */
	protected RAttribute poseeAtributte;

	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected EList<RAttribute> eReference0;

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
	public EList<Relation> getHasRelation() {
		if (hasRelation == null) {
			hasRelation = new EObjectContainmentEList<Relation>(Relation.class, this, ModelunoPackage.CLASS__HAS_RELATION);
		}
		return hasRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getR1() {
		if (r1 == null) {
			r1 = new EObjectResolvingEList<Relation>(Relation.class, this, ModelunoPackage.CLASS__R1);
		}
		return r1;
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
	public RAttribute getPoseeAtributte() {
		if (poseeAtributte != null && poseeAtributte.eIsProxy()) {
			InternalEObject oldPoseeAtributte = (InternalEObject)poseeAtributte;
			poseeAtributte = (RAttribute)eResolveProxy(oldPoseeAtributte);
			if (poseeAtributte != oldPoseeAtributte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.CLASS__POSEE_ATRIBUTTE, oldPoseeAtributte, poseeAtributte));
			}
		}
		return poseeAtributte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAttribute basicGetPoseeAtributte() {
		return poseeAtributte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseeAtributte(RAttribute newPoseeAtributte) {
		RAttribute oldPoseeAtributte = poseeAtributte;
		poseeAtributte = newPoseeAtributte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CLASS__POSEE_ATRIBUTTE, oldPoseeAtributte, poseeAtributte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RAttribute> getEReference0() {
		if (eReference0 == null) {
			eReference0 = new EObjectContainmentEList<RAttribute>(RAttribute.class, this, ModelunoPackage.CLASS__EREFERENCE0);
		}
		return eReference0;
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
			case ModelunoPackage.CLASS__EREFERENCE0:
				return ((InternalEList<?>)getEReference0()).basicRemove(otherEnd, msgs);
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
			case ModelunoPackage.CLASS__R1:
				return getR1();
			case ModelunoPackage.CLASS__CNAME:
				return getCname();
			case ModelunoPackage.CLASS__ID_FUNCTION:
				return getIdFunction();
			case ModelunoPackage.CLASS__POSEE_ATRIBUTTE:
				if (resolve) return getPoseeAtributte();
				return basicGetPoseeAtributte();
			case ModelunoPackage.CLASS__EREFERENCE0:
				return getEReference0();
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
				getHasRelation().addAll((Collection<? extends Relation>)newValue);
				return;
			case ModelunoPackage.CLASS__R1:
				getR1().clear();
				getR1().addAll((Collection<? extends Relation>)newValue);
				return;
			case ModelunoPackage.CLASS__CNAME:
				setCname((String)newValue);
				return;
			case ModelunoPackage.CLASS__ID_FUNCTION:
				setIdFunction((String)newValue);
				return;
			case ModelunoPackage.CLASS__POSEE_ATRIBUTTE:
				setPoseeAtributte((RAttribute)newValue);
				return;
			case ModelunoPackage.CLASS__EREFERENCE0:
				getEReference0().clear();
				getEReference0().addAll((Collection<? extends RAttribute>)newValue);
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
			case ModelunoPackage.CLASS__R1:
				getR1().clear();
				return;
			case ModelunoPackage.CLASS__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case ModelunoPackage.CLASS__ID_FUNCTION:
				setIdFunction(ID_FUNCTION_EDEFAULT);
				return;
			case ModelunoPackage.CLASS__POSEE_ATRIBUTTE:
				setPoseeAtributte((RAttribute)null);
				return;
			case ModelunoPackage.CLASS__EREFERENCE0:
				getEReference0().clear();
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
			case ModelunoPackage.CLASS__R1:
				return r1 != null && !r1.isEmpty();
			case ModelunoPackage.CLASS__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case ModelunoPackage.CLASS__ID_FUNCTION:
				return ID_FUNCTION_EDEFAULT == null ? idFunction != null : !ID_FUNCTION_EDEFAULT.equals(idFunction);
			case ModelunoPackage.CLASS__POSEE_ATRIBUTTE:
				return poseeAtributte != null;
			case ModelunoPackage.CLASS__EREFERENCE0:
				return eReference0 != null && !eReference0.isEmpty();
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
