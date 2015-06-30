/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.CallAtribute;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.typeHorizontalPosition;
import Metawebdesign.metawebdesign.typePresentation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Atribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.CallAtributeImpl#getGetAttribute <em>Get Attribute</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.CallAtributeImpl#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.CallAtributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.CallAtributeImpl#getPositionHorizontal <em>Position Horizontal</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.CallAtributeImpl#getPostionVertical <em>Postion Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallAtributeImpl extends ViewComponentImpl implements CallAtribute {
	/**
	 * The cached value of the '{@link #getGetAttribute() <em>Get Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attributes getAttribute;

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
	 * The default value of the '{@link #getPositionHorizontal() <em>Position Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final typeHorizontalPosition POSITION_HORIZONTAL_EDEFAULT = typeHorizontalPosition.LEFT;

	/**
	 * The cached value of the '{@link #getPositionHorizontal() <em>Position Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionHorizontal()
	 * @generated
	 * @ordered
	 */
	protected typeHorizontalPosition positionHorizontal = POSITION_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostionVertical() <em>Postion Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostionVertical()
	 * @generated
	 * @ordered
	 */
	protected static final int POSTION_VERTICAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPostionVertical() <em>Postion Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostionVertical()
	 * @generated
	 * @ordered
	 */
	protected int postionVertical = POSTION_VERTICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallAtributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.CALL_ATRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getGetAttribute() {
		if (getAttribute != null && getAttribute.eIsProxy()) {
			InternalEObject oldGetAttribute = (InternalEObject)getAttribute;
			getAttribute = (Attributes)eResolveProxy(oldGetAttribute);
			if (getAttribute != oldGetAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.CALL_ATRIBUTE__GET_ATTRIBUTE, oldGetAttribute, getAttribute));
			}
		}
		return getAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetGetAttribute() {
		return getAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAttribute(Attributes newGetAttribute) {
		Attributes oldGetAttribute = getAttribute;
		getAttribute = newGetAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CALL_ATRIBUTE__GET_ATTRIBUTE, oldGetAttribute, getAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CALL_ATRIBUTE__TYPE_PRESENTATION, oldTypePresentation, typePresentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CALL_ATRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeHorizontalPosition getPositionHorizontal() {
		return positionHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionHorizontal(typeHorizontalPosition newPositionHorizontal) {
		typeHorizontalPosition oldPositionHorizontal = positionHorizontal;
		positionHorizontal = newPositionHorizontal == null ? POSITION_HORIZONTAL_EDEFAULT : newPositionHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CALL_ATRIBUTE__POSITION_HORIZONTAL, oldPositionHorizontal, positionHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPostionVertical() {
		return postionVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostionVertical(int newPostionVertical) {
		int oldPostionVertical = postionVertical;
		postionVertical = newPostionVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.CALL_ATRIBUTE__POSTION_VERTICAL, oldPostionVertical, postionVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetawebdesignPackage.CALL_ATRIBUTE__GET_ATTRIBUTE:
				if (resolve) return getGetAttribute();
				return basicGetGetAttribute();
			case MetawebdesignPackage.CALL_ATRIBUTE__TYPE_PRESENTATION:
				return getTypePresentation();
			case MetawebdesignPackage.CALL_ATRIBUTE__NAME:
				return getName();
			case MetawebdesignPackage.CALL_ATRIBUTE__POSITION_HORIZONTAL:
				return getPositionHorizontal();
			case MetawebdesignPackage.CALL_ATRIBUTE__POSTION_VERTICAL:
				return getPostionVertical();
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
			case MetawebdesignPackage.CALL_ATRIBUTE__GET_ATTRIBUTE:
				setGetAttribute((Attributes)newValue);
				return;
			case MetawebdesignPackage.CALL_ATRIBUTE__TYPE_PRESENTATION:
				setTypePresentation((typePresentation)newValue);
				return;
			case MetawebdesignPackage.CALL_ATRIBUTE__NAME:
				setName((String)newValue);
				return;
			case MetawebdesignPackage.CALL_ATRIBUTE__POSITION_HORIZONTAL:
				setPositionHorizontal((typeHorizontalPosition)newValue);
				return;
			case MetawebdesignPackage.CALL_ATRIBUTE__POSTION_VERTICAL:
				setPostionVertical((Integer)newValue);
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
			case MetawebdesignPackage.CALL_ATRIBUTE__GET_ATTRIBUTE:
				setGetAttribute((Attributes)null);
				return;
			case MetawebdesignPackage.CALL_ATRIBUTE__TYPE_PRESENTATION:
				setTypePresentation(TYPE_PRESENTATION_EDEFAULT);
				return;
			case MetawebdesignPackage.CALL_ATRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetawebdesignPackage.CALL_ATRIBUTE__POSITION_HORIZONTAL:
				setPositionHorizontal(POSITION_HORIZONTAL_EDEFAULT);
				return;
			case MetawebdesignPackage.CALL_ATRIBUTE__POSTION_VERTICAL:
				setPostionVertical(POSTION_VERTICAL_EDEFAULT);
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
			case MetawebdesignPackage.CALL_ATRIBUTE__GET_ATTRIBUTE:
				return getAttribute != null;
			case MetawebdesignPackage.CALL_ATRIBUTE__TYPE_PRESENTATION:
				return typePresentation != TYPE_PRESENTATION_EDEFAULT;
			case MetawebdesignPackage.CALL_ATRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetawebdesignPackage.CALL_ATRIBUTE__POSITION_HORIZONTAL:
				return positionHorizontal != POSITION_HORIZONTAL_EDEFAULT;
			case MetawebdesignPackage.CALL_ATRIBUTE__POSTION_VERTICAL:
				return postionVertical != POSTION_VERTICAL_EDEFAULT;
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
		result.append(" (typePresentation: ");
		result.append(typePresentation);
		result.append(", name: ");
		result.append(name);
		result.append(", positionHorizontal: ");
		result.append(positionHorizontal);
		result.append(", postionVertical: ");
		result.append(postionVertical);
		result.append(')');
		return result.toString();
	}

} //CallAtributeImpl
