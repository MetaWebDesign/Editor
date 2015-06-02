/**
 */
package Modeluno.modeluno.util;

import Modeluno.modeluno.Admin;
import Modeluno.modeluno.Attribute;
import Modeluno.modeluno.Attribute_Derived;
import Modeluno.modeluno.Attribute_Not_Derived;
import Modeluno.modeluno.Create;
import Modeluno.modeluno.Delete;
import Modeluno.modeluno.ListView;
import Modeluno.modeluno.Map;
import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.Page;
import Modeluno.modeluno.RelationAttribute;
import Modeluno.modeluno.RelationClass;
import Modeluno.modeluno.RelationService;
import Modeluno.modeluno.RelationView;
import Modeluno.modeluno.Service;
import Modeluno.modeluno.UpdateAttribute;
import Modeluno.modeluno.UpdateObject;
import Modeluno.modeluno.View;
import Modeluno.modeluno.ViewAdmin;
import Modeluno.modeluno.ViewAttribute;
import Modeluno.modeluno.ViewIndex;
import Modeluno.modeluno.ViewInput;
import Modeluno.modeluno.ViewUpdateAttribute;
import Modeluno.modeluno.ViewUpdateObject;
import Modeluno.modeluno.Views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Modeluno.modeluno.ModelunoPackage
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
			public Adapter caseClass(Modeluno.modeluno.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseRelationClass(RelationClass object) {
				return createRelationClassAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseRelationAttribute(RelationAttribute object) {
				return createRelationAttributeAdapter();
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
			public Adapter caseRelationService(RelationService object) {
				return createRelationServiceAdapter();
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
			public Adapter caseListView(ListView object) {
				return createListViewAdapter();
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
			public Adapter caseRelationView(RelationView object) {
				return createRelationViewAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
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
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.RelationClass <em>Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.RelationClass
	 * @generated
	 */
	public Adapter createRelationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.RelationAttribute <em>Relation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.RelationAttribute
	 * @generated
	 */
	public Adapter createRelationAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Attribute_Not_Derived <em>Attribute Not Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Attribute_Not_Derived
	 * @generated
	 */
	public Adapter createAttribute_Not_DerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Attribute_Derived <em>Attribute Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Attribute_Derived
	 * @generated
	 */
	public Adapter createAttribute_DerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.RelationService <em>Relation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.RelationService
	 * @generated
	 */
	public Adapter createRelationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.UpdateObject <em>Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.UpdateObject
	 * @generated
	 */
	public Adapter createUpdateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.UpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.UpdateAttribute
	 * @generated
	 */
	public Adapter createUpdateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.ListView <em>List View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.ListView
	 * @generated
	 */
	public Adapter createListViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Views
	 * @generated
	 */
	public Adapter createViewsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.ViewInput <em>View Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.ViewInput
	 * @generated
	 */
	public Adapter createViewInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.ViewUpdateObject <em>View Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.ViewUpdateObject
	 * @generated
	 */
	public Adapter createViewUpdateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.ViewUpdateAttribute <em>View Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.ViewUpdateAttribute
	 * @generated
	 */
	public Adapter createViewUpdateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.ViewIndex <em>View Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.ViewIndex
	 * @generated
	 */
	public Adapter createViewIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.ViewAttribute <em>View Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.ViewAttribute
	 * @generated
	 */
	public Adapter createViewAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.ViewAdmin <em>View Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.ViewAdmin
	 * @generated
	 */
	public Adapter createViewAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.RelationView <em>Relation View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.RelationView
	 * @generated
	 */
	public Adapter createRelationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeluno.modeluno.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeluno.modeluno.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
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
