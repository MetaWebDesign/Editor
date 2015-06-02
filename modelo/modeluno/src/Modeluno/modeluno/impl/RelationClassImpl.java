/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.RelationClass;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modeluno.modeluno.impl.RelationClassImpl#getGoClass <em>Go Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationClassImpl extends MinimalEObjectImpl.Container implements RelationClass {
	/**
	 * The cached value of the '{@link #getGoClass() <em>Go Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Modeluno.modeluno.Class> goClass;

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
		return ModelunoPackage.Literals.RELATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modeluno.modeluno.Class> getGoClass() {
		if (goClass == null) {
			goClass = new EObjectResolvingEList<Modeluno.modeluno.Class>(Modeluno.modeluno.Class.class, this, ModelunoPackage.RELATION_CLASS__GO_CLASS);
		}
		return goClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelunoPackage.RELATION_CLASS__GO_CLASS:
				return getGoClass();
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
			case ModelunoPackage.RELATION_CLASS__GO_CLASS:
				getGoClass().clear();
				getGoClass().addAll((Collection<? extends Modeluno.modeluno.Class>)newValue);
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
			case ModelunoPackage.RELATION_CLASS__GO_CLASS:
				getGoClass().clear();
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
			case ModelunoPackage.RELATION_CLASS__GO_CLASS:
				return goClass != null && !goClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationClassImpl
