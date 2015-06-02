/**
 */
package Modelouno.modeluno.impl;

import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.PresetationUnit;
import Modelouno.modeluno.TypesView;
import Modelouno.modeluno.Views;
import Modelouno.modeluno.typeHorizotalPosition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presetation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelouno.modeluno.impl.PresetationUnitImpl#getName_field <em>Name field</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.PresetationUnitImpl#getType <em>Type</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.PresetationUnitImpl#getHorizontalPosition <em>Horizontal Position</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.PresetationUnitImpl#getVerticalPosition <em>Vertical Position</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.PresetationUnitImpl#getPUhasViews <em>PUhas Views</em>}</li>
 *   <li>{@link Modelouno.modeluno.impl.PresetationUnitImpl#getPUgoToViews <em>PUgo To Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PresetationUnitImpl extends MinimalEObjectImpl.Container implements PresetationUnit {
	/**
	 * The default value of the '{@link #getName_field() <em>Name field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_field()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_field() <em>Name field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_field()
	 * @generated
	 * @ordered
	 */
	protected String name_field = NAME_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypesView TYPE_EDEFAULT = TypesView.COMBO_BOX;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypesView type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalPosition() <em>Horizontal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final typeHorizotalPosition HORIZONTAL_POSITION_EDEFAULT = typeHorizotalPosition.LEFT;

	/**
	 * The cached value of the '{@link #getHorizontalPosition() <em>Horizontal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalPosition()
	 * @generated
	 * @ordered
	 */
	protected typeHorizotalPosition horizontalPosition = HORIZONTAL_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalPosition() <em>Vertical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String VERTICAL_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalPosition() <em>Vertical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalPosition()
	 * @generated
	 * @ordered
	 */
	protected String verticalPosition = VERTICAL_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPUhasViews() <em>PUhas Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPUhasViews()
	 * @generated
	 * @ordered
	 */
	protected Views pUhasViews;

	/**
	 * The cached value of the '{@link #getPUgoToViews() <em>PUgo To Views</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPUgoToViews()
	 * @generated
	 * @ordered
	 */
	protected Views pUgoToViews;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresetationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelunoPackage.Literals.PRESETATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_field() {
		return name_field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_field(String newName_field) {
		String oldName_field = name_field;
		name_field = newName_field;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.PRESETATION_UNIT__NAME_FIELD, oldName_field, name_field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesView getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypesView newType) {
		TypesView oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.PRESETATION_UNIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeHorizotalPosition getHorizontalPosition() {
		return horizontalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalPosition(typeHorizotalPosition newHorizontalPosition) {
		typeHorizotalPosition oldHorizontalPosition = horizontalPosition;
		horizontalPosition = newHorizontalPosition == null ? HORIZONTAL_POSITION_EDEFAULT : newHorizontalPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.PRESETATION_UNIT__HORIZONTAL_POSITION, oldHorizontalPosition, horizontalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerticalPosition() {
		return verticalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalPosition(String newVerticalPosition) {
		String oldVerticalPosition = verticalPosition;
		verticalPosition = newVerticalPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.PRESETATION_UNIT__VERTICAL_POSITION, oldVerticalPosition, verticalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views getPUhasViews() {
		return pUhasViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPUhasViews(Views newPUhasViews, NotificationChain msgs) {
		Views oldPUhasViews = pUhasViews;
		pUhasViews = newPUhasViews;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS, oldPUhasViews, newPUhasViews);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPUhasViews(Views newPUhasViews) {
		if (newPUhasViews != pUhasViews) {
			NotificationChain msgs = null;
			if (pUhasViews != null)
				msgs = ((InternalEObject)pUhasViews).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS, null, msgs);
			if (newPUhasViews != null)
				msgs = ((InternalEObject)newPUhasViews).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS, null, msgs);
			msgs = basicSetPUhasViews(newPUhasViews, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS, newPUhasViews, newPUhasViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views getPUgoToViews() {
		if (pUgoToViews != null && pUgoToViews.eIsProxy()) {
			InternalEObject oldPUgoToViews = (InternalEObject)pUgoToViews;
			pUgoToViews = (Views)eResolveProxy(oldPUgoToViews);
			if (pUgoToViews != oldPUgoToViews) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelunoPackage.PRESETATION_UNIT__PUGO_TO_VIEWS, oldPUgoToViews, pUgoToViews));
			}
		}
		return pUgoToViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views basicGetPUgoToViews() {
		return pUgoToViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPUgoToViews(Views newPUgoToViews) {
		Views oldPUgoToViews = pUgoToViews;
		pUgoToViews = newPUgoToViews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelunoPackage.PRESETATION_UNIT__PUGO_TO_VIEWS, oldPUgoToViews, pUgoToViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS:
				return basicSetPUhasViews(null, msgs);
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
			case ModelunoPackage.PRESETATION_UNIT__NAME_FIELD:
				return getName_field();
			case ModelunoPackage.PRESETATION_UNIT__TYPE:
				return getType();
			case ModelunoPackage.PRESETATION_UNIT__HORIZONTAL_POSITION:
				return getHorizontalPosition();
			case ModelunoPackage.PRESETATION_UNIT__VERTICAL_POSITION:
				return getVerticalPosition();
			case ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS:
				return getPUhasViews();
			case ModelunoPackage.PRESETATION_UNIT__PUGO_TO_VIEWS:
				if (resolve) return getPUgoToViews();
				return basicGetPUgoToViews();
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
			case ModelunoPackage.PRESETATION_UNIT__NAME_FIELD:
				setName_field((String)newValue);
				return;
			case ModelunoPackage.PRESETATION_UNIT__TYPE:
				setType((TypesView)newValue);
				return;
			case ModelunoPackage.PRESETATION_UNIT__HORIZONTAL_POSITION:
				setHorizontalPosition((typeHorizotalPosition)newValue);
				return;
			case ModelunoPackage.PRESETATION_UNIT__VERTICAL_POSITION:
				setVerticalPosition((String)newValue);
				return;
			case ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS:
				setPUhasViews((Views)newValue);
				return;
			case ModelunoPackage.PRESETATION_UNIT__PUGO_TO_VIEWS:
				setPUgoToViews((Views)newValue);
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
			case ModelunoPackage.PRESETATION_UNIT__NAME_FIELD:
				setName_field(NAME_FIELD_EDEFAULT);
				return;
			case ModelunoPackage.PRESETATION_UNIT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ModelunoPackage.PRESETATION_UNIT__HORIZONTAL_POSITION:
				setHorizontalPosition(HORIZONTAL_POSITION_EDEFAULT);
				return;
			case ModelunoPackage.PRESETATION_UNIT__VERTICAL_POSITION:
				setVerticalPosition(VERTICAL_POSITION_EDEFAULT);
				return;
			case ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS:
				setPUhasViews((Views)null);
				return;
			case ModelunoPackage.PRESETATION_UNIT__PUGO_TO_VIEWS:
				setPUgoToViews((Views)null);
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
			case ModelunoPackage.PRESETATION_UNIT__NAME_FIELD:
				return NAME_FIELD_EDEFAULT == null ? name_field != null : !NAME_FIELD_EDEFAULT.equals(name_field);
			case ModelunoPackage.PRESETATION_UNIT__TYPE:
				return type != TYPE_EDEFAULT;
			case ModelunoPackage.PRESETATION_UNIT__HORIZONTAL_POSITION:
				return horizontalPosition != HORIZONTAL_POSITION_EDEFAULT;
			case ModelunoPackage.PRESETATION_UNIT__VERTICAL_POSITION:
				return VERTICAL_POSITION_EDEFAULT == null ? verticalPosition != null : !VERTICAL_POSITION_EDEFAULT.equals(verticalPosition);
			case ModelunoPackage.PRESETATION_UNIT__PUHAS_VIEWS:
				return pUhasViews != null;
			case ModelunoPackage.PRESETATION_UNIT__PUGO_TO_VIEWS:
				return pUgoToViews != null;
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
		result.append(" (name_field: ");
		result.append(name_field);
		result.append(", type: ");
		result.append(type);
		result.append(", HorizontalPosition: ");
		result.append(horizontalPosition);
		result.append(", VerticalPosition: ");
		result.append(verticalPosition);
		result.append(')');
		return result.toString();
	}

} //PresetationUnitImpl
