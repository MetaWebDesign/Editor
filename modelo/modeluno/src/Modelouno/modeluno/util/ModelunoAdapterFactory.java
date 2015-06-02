/**
 */
package Modelouno.modeluno.util;

import Modelouno.modeluno.Admin;
import Modelouno.modeluno.Attribute;
import Modelouno.modeluno.Attribute_Derived;
import Modelouno.modeluno.Attribute_Not_Derived;
import Modelouno.modeluno.Create;
import Modelouno.modeluno.Delete;
import Modelouno.modeluno.Index;
import Modelouno.modeluno.Map;
import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.Page;
import Modelouno.modeluno.PresetationUnit;
import Modelouno.modeluno.Relation_Attribute;
import Modelouno.modeluno.Relation_Class;
import Modelouno.modeluno.Relation_Service;
import Modelouno.modeluno.Relation_View;
import Modelouno.modeluno.Service;
import Modelouno.modeluno.UpdateAttribute;
import Modelouno.modeluno.UpdateObject;
import Modelouno.modeluno.View;
import Modelouno.modeluno.ViewAdmin;
import Modelouno.modeluno.ViewAttribute;
import Modelouno.modeluno.ViewIndex;
import Modelouno.modeluno.ViewInput;
import Modelouno.modeluno.ViewUpdateAttribute;
import Modelouno.modeluno.ViewUpdateObject;
import Modelouno.modeluno.Views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Modelouno.modeluno.ModelunoPackage
 * @generated
 */
public class ModelunoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelunoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelunoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelunoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelunoSwitch<Adapter> modelSwitch =
		new ModelunoSwitch<Adapter>() {
			@Override
			public Adapter caseMap(Map object) {
				return createMapAdapter();
			}
			@Override
			public Adapter caseClass(Modelouno.modeluno.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseRelation_Class(Relation_Class object) {
				return createRelation_ClassAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseRelation_Attribute(Relation_Attribute object) {
				return createRelation_AttributeAdapter();
			}
			@Override
			public Adapter caseAttribute_Not_Derived(Attribute_Not_Derived object) {
				return createAttribute_Not_DerivedAdapter();
			}
			@Override
			public Adapter caseAttribute_Derived(Attribute_Derived object) {
				return createAttribute_DerivedAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseRelation_Service(Relation_Service object) {
				return createRelation_ServiceAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseUpdateObject(UpdateObject object) {
				return createUpdateObjectAdapter();
			}
			@Override
			public Adapter caseUpdateAttribute(UpdateAttribute object) {
				return createUpdateAttributeAdapter();
			}
			@Override
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseAdmin(Admin object) {
				return createAdminAdapter();
			}
			@Override
			public Adapter caseViews(Views object) {
				return createViewsAdapter();
			}
			@Override
			public Adapter caseViewInput(ViewInput object) {
				return createViewInputAdapter();
			}
			@Override
			public Adapter caseViewUpdateObject(ViewUpdateObject object) {
				return createViewUpdateObjectAdapter();
			}
			@Override
			public Adapter caseViewUpdateAttribute(ViewUpdateAttribute object) {
				return createViewUpdateAttributeAdapter();
			}
			@Override
			public Adapter caseViewIndex(ViewIndex object) {
				return createViewIndexAdapter();
			}
			@Override
			public Adapter caseViewAttribute(ViewAttribute object) {
				return createViewAttributeAdapter();
			}
			@Override
			public Adapter caseViewAdmin(ViewAdmin object) {
				return createViewAdminAdapter();
			}
			@Override
			public Adapter caseRelation_View(Relation_View object) {
				return createRelation_ViewAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter casePresetationUnit(PresetationUnit object) {
				return createPresetationUnitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Relation_Class <em>Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Relation_Class
	 * @generated
	 */
	public Adapter createRelation_ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Relation_Attribute <em>Relation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Relation_Attribute
	 * @generated
	 */
	public Adapter createRelation_AttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Attribute_Not_Derived <em>Attribute Not Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Attribute_Not_Derived
	 * @generated
	 */
	public Adapter createAttribute_Not_DerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Attribute_Derived <em>Attribute Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Attribute_Derived
	 * @generated
	 */
	public Adapter createAttribute_DerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Relation_Service <em>Relation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Relation_Service
	 * @generated
	 */
	public Adapter createRelation_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.UpdateObject <em>Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.UpdateObject
	 * @generated
	 */
	public Adapter createUpdateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.UpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.UpdateAttribute
	 * @generated
	 */
	public Adapter createUpdateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Views
	 * @generated
	 */
	public Adapter createViewsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.ViewInput <em>View Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.ViewInput
	 * @generated
	 */
	public Adapter createViewInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.ViewUpdateObject <em>View Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.ViewUpdateObject
	 * @generated
	 */
	public Adapter createViewUpdateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.ViewUpdateAttribute <em>View Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.ViewUpdateAttribute
	 * @generated
	 */
	public Adapter createViewUpdateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.ViewIndex <em>View Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.ViewIndex
	 * @generated
	 */
	public Adapter createViewIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.ViewAttribute <em>View Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.ViewAttribute
	 * @generated
	 */
	public Adapter createViewAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.ViewAdmin <em>View Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.ViewAdmin
	 * @generated
	 */
	public Adapter createViewAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Relation_View <em>Relation View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Relation_View
	 * @generated
	 */
	public Adapter createRelation_ViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelouno.modeluno.PresetationUnit <em>Presetation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelouno.modeluno.PresetationUnit
	 * @generated
	 */
	public Adapter createPresetationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelunoAdapterFactory
