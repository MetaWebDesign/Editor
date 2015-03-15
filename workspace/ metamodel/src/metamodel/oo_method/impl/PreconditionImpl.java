/**
 */
package metamodel.oo_method.impl;

import java.util.Collection;

import metamodel.oo_method.Oo_methodPackage;
import metamodel.oo_method.Precondition;
import metamodel.oo_method.PreconditionFormula;

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
 * An implementation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oo_method.oo_method.impl.PreconditionImpl#getPreconditionComments <em>Precondition Comments</em>}</li>
 *   <li>{@link oo_method.oo_method.impl.PreconditionImpl#getPreFormulas <em>Pre Formulas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreconditionImpl extends MinimalEObjectImpl.Container implements Precondition {
	/**
	 * The default value of the '{@link #getPreconditionComments() <em>Precondition Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionComments()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreconditionComments() <em>Precondition Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionComments()
	 * @generated
	 * @ordered
	 */
	protected String preconditionComments = PRECONDITION_COMMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreFormulas() <em>Pre Formulas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreFormulas()
	 * @generated
	 * @ordered
	 */
	protected EList<PreconditionFormula> preFormulas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oo_methodPackage.Literals.PRECONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreconditionComments() {
		return preconditionComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreconditionComments(String newPreconditionComments) {
		String oldPreconditionComments = preconditionComments;
		preconditionComments = newPreconditionComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oo_methodPackage.PRECONDITION__PRECONDITION_COMMENTS, oldPreconditionComments, preconditionComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreconditionFormula> getPreFormulas() {
		if (preFormulas == null) {
			preFormulas = new EObjectContainmentEList<PreconditionFormula>(PreconditionFormula.class, this, Oo_methodPackage.PRECONDITION__PRE_FORMULAS);
		}
		return preFormulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Oo_methodPackage.PRECONDITION__PRE_FORMULAS:
				return ((InternalEList<?>)getPreFormulas()).basicRemove(otherEnd, msgs);
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
			case Oo_methodPackage.PRECONDITION__PRECONDITION_COMMENTS:
				return getPreconditionComments();
			case Oo_methodPackage.PRECONDITION__PRE_FORMULAS:
				return getPreFormulas();
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
			case Oo_methodPackage.PRECONDITION__PRECONDITION_COMMENTS:
				setPreconditionComments((String)newValue);
				return;
			case Oo_methodPackage.PRECONDITION__PRE_FORMULAS:
				getPreFormulas().clear();
				getPreFormulas().addAll((Collection<? extends PreconditionFormula>)newValue);
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
			case Oo_methodPackage.PRECONDITION__PRECONDITION_COMMENTS:
				setPreconditionComments(PRECONDITION_COMMENTS_EDEFAULT);
				return;
			case Oo_methodPackage.PRECONDITION__PRE_FORMULAS:
				getPreFormulas().clear();
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
			case Oo_methodPackage.PRECONDITION__PRECONDITION_COMMENTS:
				return PRECONDITION_COMMENTS_EDEFAULT == null ? preconditionComments != null : !PRECONDITION_COMMENTS_EDEFAULT.equals(preconditionComments);
			case Oo_methodPackage.PRECONDITION__PRE_FORMULAS:
				return preFormulas != null && !preFormulas.isEmpty();
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
		result.append(" (preconditionComments: ");
		result.append(preconditionComments);
		result.append(')');
		return result.toString();
	}

} //PreconditionImpl
