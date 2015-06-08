/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.PresentationUnit;
import Modeldos.modeldos.typeHorizontalPosition;
import Modeldos.modeldos.typePresentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.PresentationUnitImpl#getNameFeild <em>Name Feild</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.PresentationUnitImpl#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.PresentationUnitImpl#getHorizontalPosition <em>Horizontal Position</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.PresentationUnitImpl#getVerticalPosition <em>Vertical Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PresentationUnitImpl extends MinimalEObjectImpl.Container implements PresentationUnit {
	/**
	 * The default value of the '{@link #getNameFeild() <em>Name Feild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFeild()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FEILD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFeild() <em>Name Feild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFeild()
	 * @generated
	 * @ordered
	 */
	protected String nameFeild = NAME_FEILD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypePresentation() <em>Type Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePresentation()
	 * @generated
	 * @ordered
	 */
	protected static final typePresentation TYPE_PRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypePresentation() <em>Type Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePresentation()
	 * @generated
	 * @ordered
	 */
	protected typePresentation typePresentation = TYPE_PRESENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalPosition() <em>Horizontal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final typeHorizontalPosition HORIZONTAL_POSITION_EDEFAULT = typeHorizontalPosition.CENTER;

	/**
	 * The cached value of the '{@link #getHorizontalPosition() <em>Horizontal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalPosition()
	 * @generated
	 * @ordered
	 */
	protected typeHorizontalPosition horizontalPosition = HORIZONTAL_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalPosition() <em>Vertical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalPosition() <em>Vertical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalPosition()
	 * @generated
	 * @ordered
	 */
	protected int verticalPosition = VERTICAL_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.PRESENTATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameFeild() {
		return nameFeild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameFeild(String newNameFeild) {
		String oldNameFeild = nameFeild;
		nameFeild = newNameFeild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.PRESENTATION_UNIT__NAME_FEILD, oldNameFeild, nameFeild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typePresentation getTypePresentation() {
		return typePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePresentation(typePresentation newTypePresentation) {
		typePresentation oldTypePresentation = typePresentation;
		typePresentation = newTypePresentation == null ? TYPE_PRESENTATION_EDEFAULT : newTypePresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.PRESENTATION_UNIT__TYPE_PRESENTATION, oldTypePresentation, typePresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeHorizontalPosition getHorizontalPosition() {
		return horizontalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalPosition(typeHorizontalPosition newHorizontalPosition) {
		typeHorizontalPosition oldHorizontalPosition = horizontalPosition;
		horizontalPosition = newHorizontalPosition == null ? HORIZONTAL_POSITION_EDEFAULT : newHorizontalPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.PRESENTATION_UNIT__HORIZONTAL_POSITION, oldHorizontalPosition, horizontalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalPosition() {
		return verticalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalPosition(int newVerticalPosition) {
		int oldVerticalPosition = verticalPosition;
		verticalPosition = newVerticalPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.PRESENTATION_UNIT__VERTICAL_POSITION, oldVerticalPosition, verticalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeldosPackage.PRESENTATION_UNIT__NAME_FEILD:
				return getNameFeild();
			case ModeldosPackage.PRESENTATION_UNIT__TYPE_PRESENTATION:
				return getTypePresentation();
			case ModeldosPackage.PRESENTATION_UNIT__HORIZONTAL_POSITION:
				return getHorizontalPosition();
			case ModeldosPackage.PRESENTATION_UNIT__VERTICAL_POSITION:
				return getVerticalPosition();
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
			case ModeldosPackage.PRESENTATION_UNIT__NAME_FEILD:
				setNameFeild((String)newValue);
				return;
			case ModeldosPackage.PRESENTATION_UNIT__TYPE_PRESENTATION:
				setTypePresentation((typePresentation)newValue);
				return;
			case ModeldosPackage.PRESENTATION_UNIT__HORIZONTAL_POSITION:
				setHorizontalPosition((typeHorizontalPosition)newValue);
				return;
			case ModeldosPackage.PRESENTATION_UNIT__VERTICAL_POSITION:
				setVerticalPosition((Integer)newValue);
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
			case ModeldosPackage.PRESENTATION_UNIT__NAME_FEILD:
				setNameFeild(NAME_FEILD_EDEFAULT);
				return;
			case ModeldosPackage.PRESENTATION_UNIT__TYPE_PRESENTATION:
				setTypePresentation(TYPE_PRESENTATION_EDEFAULT);
				return;
			case ModeldosPackage.PRESENTATION_UNIT__HORIZONTAL_POSITION:
				setHorizontalPosition(HORIZONTAL_POSITION_EDEFAULT);
				return;
			case ModeldosPackage.PRESENTATION_UNIT__VERTICAL_POSITION:
				setVerticalPosition(VERTICAL_POSITION_EDEFAULT);
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
			case ModeldosPackage.PRESENTATION_UNIT__NAME_FEILD:
				return NAME_FEILD_EDEFAULT == null ? nameFeild != null : !NAME_FEILD_EDEFAULT.equals(nameFeild);
			case ModeldosPackage.PRESENTATION_UNIT__TYPE_PRESENTATION:
				return typePresentation != TYPE_PRESENTATION_EDEFAULT;
			case ModeldosPackage.PRESENTATION_UNIT__HORIZONTAL_POSITION:
				return horizontalPosition != HORIZONTAL_POSITION_EDEFAULT;
			case ModeldosPackage.PRESENTATION_UNIT__VERTICAL_POSITION:
				return verticalPosition != VERTICAL_POSITION_EDEFAULT;
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
		result.append(" (nameFeild: ");
		result.append(nameFeild);
		result.append(", typePresentation: ");
		result.append(typePresentation);
		result.append(", HorizontalPosition: ");
		result.append(horizontalPosition);
		result.append(", VerticalPosition: ");
		result.append(verticalPosition);
		result.append(')');
		return result.toString();
	}

} //PresentationUnitImpl
