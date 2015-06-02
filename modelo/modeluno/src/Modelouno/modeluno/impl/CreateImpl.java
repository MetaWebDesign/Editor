/**
 */
package Modelouno.modeluno.impl;

import Modelouno.modeluno.Create;
import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.ViewInput;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelouno.modeluno.impl.CreateImpl#getName <em>Name</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.CreateImpl#getHasViewFormInput <em>Has View Form Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateImpl extends ServiceImpl implements Create {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Create";

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
	 * The cached value of the '{@link #getHasViewFormInput() <em>Has View Form Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasViewFormInput()
	 * @generated
	 * @ordered
	 */
	protected ViewInput hasViewFormInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.CREATE;
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
	public ViewInput getHasViewFormInput() {
		return hasViewFormInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasViewFormInput(ViewInput newHasViewFormInput, NotificationChain msgs) {
		ViewInput oldHasViewFormInput = hasViewFormInput;
		hasViewFormInput = newHasViewFormInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.CREATE__HAS_VIEW_FORM_INPUT, oldHasViewFormInput, newHasViewFormInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasViewFormInput(ViewInput newHasViewFormInput) {
		if (newHasViewFormInput != hasViewFormInput) {
			NotificationChain msgs = null;
			if (hasViewFormInput != null)
				msgs = ((InternalEObject)hasViewFormInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.CREATE__HAS_VIEW_FORM_INPUT, null, msgs);
			if (newHasViewFormInput != null)
				msgs = ((InternalEObject)newHasViewFormInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.CREATE__HAS_VIEW_FORM_INPUT, null, msgs);
			msgs = basicSetHasViewFormInput(newHasViewFormInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.CREATE__HAS_VIEW_FORM_INPUT, newHasViewFormInput, newHasViewFormInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.CREATE__HAS_VIEW_FORM_INPUT:
				return basicSetHasViewFormInput(null, msgs);
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
			case ModelunoPackage.CREATE__NAME:
				return getName();
			case ModelunoPackage.CREATE__HAS_VIEW_FORM_INPUT:
				return getHasViewFormInput();
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
			case ModelunoPackage.CREATE__HAS_VIEW_FORM_INPUT:
				setHasViewFormInput((ViewInput)newValue);
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
			case ModelunoPackage.CREATE__HAS_VIEW_FORM_INPUT:
				setHasViewFormInput((ViewInput)null);
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
			case ModelunoPackage.CREATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelunoPackage.CREATE__HAS_VIEW_FORM_INPUT:
				return hasViewFormInput != null;
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
		result.append(')');
		return result.toString();
	}

} //CreateImpl
