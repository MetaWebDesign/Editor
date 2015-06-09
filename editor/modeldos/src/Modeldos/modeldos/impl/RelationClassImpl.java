/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.Attributes;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.RelationClass;
import Modeldos.modeldos.typeHorizontalPosition;
import Modeldos.modeldos.typePresentation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeldos.modeldos.impl.RelationClassImpl#getRelationName <em>Relation Name</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RelationClassImpl#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RelationClassImpl#getHorizontalPosition <em>Horizontal Position</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RelationClassImpl#getVerticalPosition <em>Vertical Position</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RelationClassImpl#getFromClass <em>From Class</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RelationClassImpl#getAttributeGet <em>Attribute Get</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RelationClassImpl#getAttributeReplace <em>Attribute Replace</em>}</li>
 *   <li>{@link Modeldos.modeldos.impl.RelationClassImpl#getAttributeSave <em>Attribute Save</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationClassImpl extends MinimalEObjectImpl.Container implements RelationClass {
	/**
	 * The default value of the '{@link #getRelationName() <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationName()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationName() <em>Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationName()
	 * @generated
	 * @ordered
	 */
	protected String relationName = RELATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypePresentation() <em>Type Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePresentation()
	 * @generated
	 * @ordered
	 */
	//protected static final typePresentation TYPE_PRESENTATION_EDEFAULT = typePresentation.STRING;
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
	 * The cached value of the '{@link #getFromClass() <em>From Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Modeldos.modeldos.Class> fromClass;

	/**
	 * The cached value of the '{@link #getAttributeGet() <em>Attribute Get</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeGet()
	 * @generated
	 * @ordered
	 */
	protected Attributes attributeGet;

	/**
	 * The cached value of the '{@link #getAttributeReplace() <em>Attribute Replace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeReplace()
	 * @generated
	 * @ordered
	 */
	protected Attributes attributeReplace;

	/**
	 * The cached value of the '{@link #getAttributeSave() <em>Attribute Save</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSave()
	 * @generated
	 * @ordered
	 */
	protected Attributes attributeSave;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeldosPackage.Literals.RELATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationName() {
		return relationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationName(String newRelationName) {
		String oldRelationName = relationName;
		relationName = newRelationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_CLASS__RELATION_NAME, oldRelationName, relationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_CLASS__TYPE_PRESENTATION, oldTypePresentation, typePresentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_CLASS__HORIZONTAL_POSITION, oldHorizontalPosition, horizontalPosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_CLASS__VERTICAL_POSITION, oldVerticalPosition, verticalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modeldos.modeldos.Class> getFromClass() {
		if (fromClass == null) {
			fromClass = new EObjectResolvingEList<Modeldos.modeldos.Class>(Modeldos.modeldos.Class.class, this, ModeldosPackage.RELATION_CLASS__FROM_CLASS);
		}
		return fromClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttributeGet() {
		if (attributeGet != null && attributeGet.eIsProxy()) {
			InternalEObject oldAttributeGet = (InternalEObject)attributeGet;
			attributeGet = (Attributes)eResolveProxy(oldAttributeGet);
			if (attributeGet != oldAttributeGet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeldosPackage.RELATION_CLASS__ATTRIBUTE_GET, oldAttributeGet, attributeGet));
			}
		}
		return attributeGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetAttributeGet() {
		return attributeGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeGet(Attributes newAttributeGet) {
		Attributes oldAttributeGet = attributeGet;
		attributeGet = newAttributeGet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_CLASS__ATTRIBUTE_GET, oldAttributeGet, attributeGet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttributeReplace() {
		if (attributeReplace != null && attributeReplace.eIsProxy()) {
			InternalEObject oldAttributeReplace = (InternalEObject)attributeReplace;
			attributeReplace = (Attributes)eResolveProxy(oldAttributeReplace);
			if (attributeReplace != oldAttributeReplace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeldosPackage.RELATION_CLASS__ATTRIBUTE_REPLACE, oldAttributeReplace, attributeReplace));
			}
		}
		return attributeReplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetAttributeReplace() {
		return attributeReplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeReplace(Attributes newAttributeReplace) {
		Attributes oldAttributeReplace = attributeReplace;
		attributeReplace = newAttributeReplace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_CLASS__ATTRIBUTE_REPLACE, oldAttributeReplace, attributeReplace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttributeSave() {
		if (attributeSave != null && attributeSave.eIsProxy()) {
			InternalEObject oldAttributeSave = (InternalEObject)attributeSave;
			attributeSave = (Attributes)eResolveProxy(oldAttributeSave);
			if (attributeSave != oldAttributeSave) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeldosPackage.RELATION_CLASS__ATTRIBUTE_SAVE, oldAttributeSave, attributeSave));
			}
		}
		return attributeSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetAttributeSave() {
		return attributeSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeSave(Attributes newAttributeSave) {
		Attributes oldAttributeSave = attributeSave;
		attributeSave = newAttributeSave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeldosPackage.RELATION_CLASS__ATTRIBUTE_SAVE, oldAttributeSave, attributeSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeldosPackage.RELATION_CLASS__RELATION_NAME:
				return getRelationName();
			case ModeldosPackage.RELATION_CLASS__TYPE_PRESENTATION:
				return getTypePresentation();
			case ModeldosPackage.RELATION_CLASS__HORIZONTAL_POSITION:
				return getHorizontalPosition();
			case ModeldosPackage.RELATION_CLASS__VERTICAL_POSITION:
				return getVerticalPosition();
			case ModeldosPackage.RELATION_CLASS__FROM_CLASS:
				return getFromClass();
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_GET:
				if (resolve) return getAttributeGet();
				return basicGetAttributeGet();
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_REPLACE:
				if (resolve) return getAttributeReplace();
				return basicGetAttributeReplace();
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_SAVE:
				if (resolve) return getAttributeSave();
				return basicGetAttributeSave();
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
			case ModeldosPackage.RELATION_CLASS__RELATION_NAME:
				setRelationName((String)newValue);
				return;
			case ModeldosPackage.RELATION_CLASS__TYPE_PRESENTATION:
				setTypePresentation((typePresentation)newValue);
				return;
			case ModeldosPackage.RELATION_CLASS__HORIZONTAL_POSITION:
				setHorizontalPosition((typeHorizontalPosition)newValue);
				return;
			case ModeldosPackage.RELATION_CLASS__VERTICAL_POSITION:
				setVerticalPosition((Integer)newValue);
				return;
			case ModeldosPackage.RELATION_CLASS__FROM_CLASS:
				getFromClass().clear();
				getFromClass().addAll((Collection<? extends Modeldos.modeldos.Class>)newValue);
				return;
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_GET:
				setAttributeGet((Attributes)newValue);
				return;
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_REPLACE:
				setAttributeReplace((Attributes)newValue);
				return;
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_SAVE:
				setAttributeSave((Attributes)newValue);
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
			case ModeldosPackage.RELATION_CLASS__RELATION_NAME:
				setRelationName(RELATION_NAME_EDEFAULT);
				return;
			case ModeldosPackage.RELATION_CLASS__TYPE_PRESENTATION:
				setTypePresentation(TYPE_PRESENTATION_EDEFAULT);
				return;
			case ModeldosPackage.RELATION_CLASS__HORIZONTAL_POSITION:
				setHorizontalPosition(HORIZONTAL_POSITION_EDEFAULT);
				return;
			case ModeldosPackage.RELATION_CLASS__VERTICAL_POSITION:
				setVerticalPosition(VERTICAL_POSITION_EDEFAULT);
				return;
			case ModeldosPackage.RELATION_CLASS__FROM_CLASS:
				getFromClass().clear();
				return;
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_GET:
				setAttributeGet((Attributes)null);
				return;
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_REPLACE:
				setAttributeReplace((Attributes)null);
				return;
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_SAVE:
				setAttributeSave((Attributes)null);
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
			case ModeldosPackage.RELATION_CLASS__RELATION_NAME:
				return RELATION_NAME_EDEFAULT == null ? relationName != null : !RELATION_NAME_EDEFAULT.equals(relationName);
			case ModeldosPackage.RELATION_CLASS__TYPE_PRESENTATION:
				return typePresentation != TYPE_PRESENTATION_EDEFAULT;
			case ModeldosPackage.RELATION_CLASS__HORIZONTAL_POSITION:
				return horizontalPosition != HORIZONTAL_POSITION_EDEFAULT;
			case ModeldosPackage.RELATION_CLASS__VERTICAL_POSITION:
				return verticalPosition != VERTICAL_POSITION_EDEFAULT;
			case ModeldosPackage.RELATION_CLASS__FROM_CLASS:
				return fromClass != null && !fromClass.isEmpty();
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_GET:
				return attributeGet != null;
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_REPLACE:
				return attributeReplace != null;
			case ModeldosPackage.RELATION_CLASS__ATTRIBUTE_SAVE:
				return attributeSave != null;
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
		result.append(" (relationName: ");
		result.append(relationName);
		result.append(", typePresentation: ");
		result.append(typePresentation);
		result.append(", HorizontalPosition: ");
		result.append(horizontalPosition);
		result.append(", VerticalPosition: ");
		result.append(verticalPosition);
		result.append(')');
		return result.toString();
	}

} //RelationClassImpl
