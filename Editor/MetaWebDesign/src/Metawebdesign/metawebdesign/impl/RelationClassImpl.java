/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.RelationClass;
import Metawebdesign.metawebdesign.typeHorizontalPosition;
import Metawebdesign.metawebdesign.typePresentation;

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
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getPositionHorizotal <em>Position Horizotal</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getPositionVertical <em>Position Vertical</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getFromClass <em>From Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getAttributeGet <em>Attribute Get</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getAttributeReplace <em>Attribute Replace</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationClassImpl#getAttributeSave <em>Attribute Save</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationClassImpl extends MinimalEObjectImpl.Container implements RelationClass {
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
	 * The default value of the '{@link #getTypePresentation() <em>Type Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePresentation()
	 * @generated
	 * @ordered
	 */
	protected static final typePresentation TYPE_PRESENTATION_EDEFAULT = typePresentation.STRING;

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
	 * The default value of the '{@link #getPositionHorizotal() <em>Position Horizotal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionHorizotal()
	 * @generated
	 * @ordered
	 */
	protected static final typeHorizontalPosition POSITION_HORIZOTAL_EDEFAULT = typeHorizontalPosition.CENTER;

	/**
	 * The cached value of the '{@link #getPositionHorizotal() <em>Position Horizotal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionHorizotal()
	 * @generated
	 * @ordered
	 */
	protected typeHorizontalPosition positionHorizotal = POSITION_HORIZOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionVertical() <em>Position Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionVertical()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_VERTICAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositionVertical() <em>Position Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionVertical()
	 * @generated
	 * @ordered
	 */
	protected int positionVertical = POSITION_VERTICAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromClass() <em>From Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Metawebdesign.metawebdesign.Class> fromClass;

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
		return MetawebdesignPackage.Literals.RELATION_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__TYPE_PRESENTATION, oldTypePresentation, typePresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeHorizontalPosition getPositionHorizotal() {
		return positionHorizotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionHorizotal(typeHorizontalPosition newPositionHorizotal) {
		typeHorizontalPosition oldPositionHorizotal = positionHorizotal;
		positionHorizotal = newPositionHorizotal == null ? POSITION_HORIZOTAL_EDEFAULT : newPositionHorizotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__POSITION_HORIZOTAL, oldPositionHorizotal, positionHorizotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPositionVertical() {
		return positionVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionVertical(int newPositionVertical) {
		int oldPositionVertical = positionVertical;
		positionVertical = newPositionVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__POSITION_VERTICAL, oldPositionVertical, positionVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metawebdesign.metawebdesign.Class> getFromClass() {
		if (fromClass == null) {
			fromClass = new EObjectResolvingEList<Metawebdesign.metawebdesign.Class>(Metawebdesign.metawebdesign.Class.class, this, MetawebdesignPackage.RELATION_CLASS__FROM_CLASS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_GET, oldAttributeGet, attributeGet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_GET, oldAttributeGet, attributeGet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_REPLACE, oldAttributeReplace, attributeReplace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_REPLACE, oldAttributeReplace, attributeReplace));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_SAVE, oldAttributeSave, attributeSave));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_SAVE, oldAttributeSave, attributeSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetawebdesignPackage.RELATION_CLASS__NAME:
				return getName();
			case MetawebdesignPackage.RELATION_CLASS__TYPE_PRESENTATION:
				return getTypePresentation();
			case MetawebdesignPackage.RELATION_CLASS__POSITION_HORIZOTAL:
				return getPositionHorizotal();
			case MetawebdesignPackage.RELATION_CLASS__POSITION_VERTICAL:
				return getPositionVertical();
			case MetawebdesignPackage.RELATION_CLASS__FROM_CLASS:
				return getFromClass();
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_GET:
				if (resolve) return getAttributeGet();
				return basicGetAttributeGet();
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_REPLACE:
				if (resolve) return getAttributeReplace();
				return basicGetAttributeReplace();
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_SAVE:
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
			case MetawebdesignPackage.RELATION_CLASS__NAME:
				setName((String)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__TYPE_PRESENTATION:
				setTypePresentation((typePresentation)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__POSITION_HORIZOTAL:
				setPositionHorizotal((typeHorizontalPosition)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__POSITION_VERTICAL:
				setPositionVertical((Integer)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__FROM_CLASS:
				getFromClass().clear();
				getFromClass().addAll((Collection<? extends Metawebdesign.metawebdesign.Class>)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_GET:
				setAttributeGet((Attributes)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_REPLACE:
				setAttributeReplace((Attributes)newValue);
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_SAVE:
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
			case MetawebdesignPackage.RELATION_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_CLASS__TYPE_PRESENTATION:
				setTypePresentation(TYPE_PRESENTATION_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_CLASS__POSITION_HORIZOTAL:
				setPositionHorizotal(POSITION_HORIZOTAL_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_CLASS__POSITION_VERTICAL:
				setPositionVertical(POSITION_VERTICAL_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_CLASS__FROM_CLASS:
				getFromClass().clear();
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_GET:
				setAttributeGet((Attributes)null);
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_REPLACE:
				setAttributeReplace((Attributes)null);
				return;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_SAVE:
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
			case MetawebdesignPackage.RELATION_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetawebdesignPackage.RELATION_CLASS__TYPE_PRESENTATION:
				return typePresentation != TYPE_PRESENTATION_EDEFAULT;
			case MetawebdesignPackage.RELATION_CLASS__POSITION_HORIZOTAL:
				return positionHorizotal != POSITION_HORIZOTAL_EDEFAULT;
			case MetawebdesignPackage.RELATION_CLASS__POSITION_VERTICAL:
				return positionVertical != POSITION_VERTICAL_EDEFAULT;
			case MetawebdesignPackage.RELATION_CLASS__FROM_CLASS:
				return fromClass != null && !fromClass.isEmpty();
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_GET:
				return attributeGet != null;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_REPLACE:
				return attributeReplace != null;
			case MetawebdesignPackage.RELATION_CLASS__ATTRIBUTE_SAVE:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", typePresentation: ");
		result.append(typePresentation);
		result.append(", positionHorizotal: ");
		result.append(positionHorizotal);
		result.append(", positionVertical: ");
		result.append(positionVertical);
		result.append(')');
		return result.toString();
	}

} //RelationClassImpl
