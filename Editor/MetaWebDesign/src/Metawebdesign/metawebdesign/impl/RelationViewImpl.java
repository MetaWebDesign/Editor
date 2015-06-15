/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.RelationView;
import Metawebdesign.metawebdesign.Views;
import Metawebdesign.metawebdesign.typeHorizontalPosition;
import Metawebdesign.metawebdesign.typePresentation;

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
 * An implementation of the model object '<em><b>Relation View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getTypePresentation <em>Type Presentation</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getPositionHorizontal <em>Position Horizontal</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getPositionVertical <em>Position Vertical</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getGoViews <em>Go Views</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getRhasViews <em>Rhas Views</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getRViewsHasClass <em>RViews Has Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getRviewsGoToClass <em>Rviews Go To Class</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getGetAttribute <em>Get Attribute</em>}</li>
 *   <li>{@link Metawebdesign.metawebdesign.impl.RelationViewImpl#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationViewImpl extends MinimalEObjectImpl.Container implements RelationView {
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
	 * The cached value of the '{@link #getGoViews() <em>Go Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoViews()
	 * @generated
	 * @ordered
	 */
	protected EList<Views> goViews;

	/**
	 * The cached value of the '{@link #getRhasViews() <em>Rhas Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhasViews()
	 * @generated
	 * @ordered
	 */
	protected EList<Views> rhasViews;

	/**
	 * The cached value of the '{@link #getRViewsHasClass() <em>RViews Has Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRViewsHasClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Metawebdesign.metawebdesign.Class> rViewsHasClass;

	/**
	 * The cached value of the '{@link #getRviewsGoToClass() <em>Rviews Go To Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRviewsGoToClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Metawebdesign.metawebdesign.Class> rviewsGoToClass;

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
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebdesignPackage.Literals.RELATION_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_VIEW__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_VIEW__TYPE_PRESENTATION, oldTypePresentation, typePresentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_VIEW__POSITION_HORIZONTAL, oldPositionHorizontal, positionHorizontal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_VIEW__POSITION_VERTICAL, oldPositionVertical, positionVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Views> getGoViews() {
		if (goViews == null) {
			goViews = new EObjectResolvingEList<Views>(Views.class, this, MetawebdesignPackage.RELATION_VIEW__GO_VIEWS);
		}
		return goViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Views> getRhasViews() {
		if (rhasViews == null) {
			rhasViews = new EObjectContainmentEList<Views>(Views.class, this, MetawebdesignPackage.RELATION_VIEW__RHAS_VIEWS);
		}
		return rhasViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metawebdesign.metawebdesign.Class> getRViewsHasClass() {
		if (rViewsHasClass == null) {
			rViewsHasClass = new EObjectContainmentEList<Metawebdesign.metawebdesign.Class>(Metawebdesign.metawebdesign.Class.class, this, MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS);
		}
		return rViewsHasClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metawebdesign.metawebdesign.Class> getRviewsGoToClass() {
		if (rviewsGoToClass == null) {
			rviewsGoToClass = new EObjectResolvingEList<Metawebdesign.metawebdesign.Class>(Metawebdesign.metawebdesign.Class.class, this, MetawebdesignPackage.RELATION_VIEW__RVIEWS_GO_TO_CLASS);
		}
		return rviewsGoToClass;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetawebdesignPackage.RELATION_VIEW__GET_ATTRIBUTE, oldGetAttribute, getAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_VIEW__GET_ATTRIBUTE, oldGetAttribute, getAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetawebdesignPackage.RELATION_VIEW__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetawebdesignPackage.RELATION_VIEW__RHAS_VIEWS:
				return ((InternalEList<?>)getRhasViews()).basicRemove(otherEnd, msgs);
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				return ((InternalEList<?>)getRViewsHasClass()).basicRemove(otherEnd, msgs);
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
			case MetawebdesignPackage.RELATION_VIEW__NAME:
				return getName();
			case MetawebdesignPackage.RELATION_VIEW__TYPE_PRESENTATION:
				return getTypePresentation();
			case MetawebdesignPackage.RELATION_VIEW__POSITION_HORIZONTAL:
				return getPositionHorizontal();
			case MetawebdesignPackage.RELATION_VIEW__POSITION_VERTICAL:
				return getPositionVertical();
			case MetawebdesignPackage.RELATION_VIEW__GO_VIEWS:
				return getGoViews();
			case MetawebdesignPackage.RELATION_VIEW__RHAS_VIEWS:
				return getRhasViews();
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				return getRViewsHasClass();
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_GO_TO_CLASS:
				return getRviewsGoToClass();
			case MetawebdesignPackage.RELATION_VIEW__GET_ATTRIBUTE:
				if (resolve) return getGetAttribute();
				return basicGetGetAttribute();
			case MetawebdesignPackage.RELATION_VIEW__ROW:
				return getRow();
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
			case MetawebdesignPackage.RELATION_VIEW__NAME:
				setName((String)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__TYPE_PRESENTATION:
				setTypePresentation((typePresentation)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__POSITION_HORIZONTAL:
				setPositionHorizontal((typeHorizontalPosition)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__POSITION_VERTICAL:
				setPositionVertical((Integer)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__GO_VIEWS:
				getGoViews().clear();
				getGoViews().addAll((Collection<? extends Views>)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__RHAS_VIEWS:
				getRhasViews().clear();
				getRhasViews().addAll((Collection<? extends Views>)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				getRViewsHasClass().clear();
				getRViewsHasClass().addAll((Collection<? extends Metawebdesign.metawebdesign.Class>)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_GO_TO_CLASS:
				getRviewsGoToClass().clear();
				getRviewsGoToClass().addAll((Collection<? extends Metawebdesign.metawebdesign.Class>)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__GET_ATTRIBUTE:
				setGetAttribute((Attributes)newValue);
				return;
			case MetawebdesignPackage.RELATION_VIEW__ROW:
				setRow((Integer)newValue);
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
			case MetawebdesignPackage.RELATION_VIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_VIEW__TYPE_PRESENTATION:
				setTypePresentation(TYPE_PRESENTATION_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_VIEW__POSITION_HORIZONTAL:
				setPositionHorizontal(POSITION_HORIZONTAL_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_VIEW__POSITION_VERTICAL:
				setPositionVertical(POSITION_VERTICAL_EDEFAULT);
				return;
			case MetawebdesignPackage.RELATION_VIEW__GO_VIEWS:
				getGoViews().clear();
				return;
			case MetawebdesignPackage.RELATION_VIEW__RHAS_VIEWS:
				getRhasViews().clear();
				return;
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				getRViewsHasClass().clear();
				return;
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_GO_TO_CLASS:
				getRviewsGoToClass().clear();
				return;
			case MetawebdesignPackage.RELATION_VIEW__GET_ATTRIBUTE:
				setGetAttribute((Attributes)null);
				return;
			case MetawebdesignPackage.RELATION_VIEW__ROW:
				setRow(ROW_EDEFAULT);
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
			case MetawebdesignPackage.RELATION_VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetawebdesignPackage.RELATION_VIEW__TYPE_PRESENTATION:
				return typePresentation != TYPE_PRESENTATION_EDEFAULT;
			case MetawebdesignPackage.RELATION_VIEW__POSITION_HORIZONTAL:
				return positionHorizontal != POSITION_HORIZONTAL_EDEFAULT;
			case MetawebdesignPackage.RELATION_VIEW__POSITION_VERTICAL:
				return positionVertical != POSITION_VERTICAL_EDEFAULT;
			case MetawebdesignPackage.RELATION_VIEW__GO_VIEWS:
				return goViews != null && !goViews.isEmpty();
			case MetawebdesignPackage.RELATION_VIEW__RHAS_VIEWS:
				return rhasViews != null && !rhasViews.isEmpty();
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_HAS_CLASS:
				return rViewsHasClass != null && !rViewsHasClass.isEmpty();
			case MetawebdesignPackage.RELATION_VIEW__RVIEWS_GO_TO_CLASS:
				return rviewsGoToClass != null && !rviewsGoToClass.isEmpty();
			case MetawebdesignPackage.RELATION_VIEW__GET_ATTRIBUTE:
				return getAttribute != null;
			case MetawebdesignPackage.RELATION_VIEW__ROW:
				return row != ROW_EDEFAULT;
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
		result.append(", positionHorizontal: ");
		result.append(positionHorizontal);
		result.append(", positionVertical: ");
		result.append(positionVertical);
		result.append(", row: ");
		result.append(row);
		result.append(')');
		return result.toString();
	}

} //RelationViewImpl
