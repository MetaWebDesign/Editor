/**
 */
package Metawebdesign.metawebdesign.util;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.Constraint;
import Metawebdesign.metawebdesign.Derived;
import Metawebdesign.metawebdesign.Form;
import Metawebdesign.metawebdesign.Link;
import Metawebdesign.metawebdesign.LinkView;
import Metawebdesign.metawebdesign.LinkViewCRUD;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.NavegationMenu;
import Metawebdesign.metawebdesign.NotDerived;
import Metawebdesign.metawebdesign.Page;
import Metawebdesign.metawebdesign.RelationClass;
import Metawebdesign.metawebdesign.RelationContraint;
import Metawebdesign.metawebdesign.RelationView;
import Metawebdesign.metawebdesign.Root;
import Metawebdesign.metawebdesign.ViewAttribute;
import Metawebdesign.metawebdesign.ViewComponent;
import Metawebdesign.metawebdesign.Views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage
 * @generated
 */
public class MetawebdesignAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetawebdesignPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetawebdesignAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetawebdesignPackage.eINSTANCE;
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
	protected MetawebdesignSwitch<Adapter> modelSwitch =
		new MetawebdesignSwitch<Adapter>() {
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseClass(Metawebdesign.metawebdesign.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseAttributes(Attributes object) {
				return createAttributesAdapter();
			}
			@Override
			public Adapter caseDerived(Derived object) {
				return createDerivedAdapter();
			}
			@Override
			public Adapter caseNotDerived(NotDerived object) {
				return createNotDerivedAdapter();
			}
			@Override
			public Adapter caseRelationClass(RelationClass object) {
				return createRelationClassAdapter();
			}
			@Override
			public Adapter caseViews(Views object) {
				return createViewsAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseRelationView(RelationView object) {
				return createRelationViewAdapter();
			}
			@Override
			public Adapter caseViewComponent(ViewComponent object) {
				return createViewComponentAdapter();
			}
			@Override
			public Adapter caseViewAttribute(ViewAttribute object) {
				return createViewAttributeAdapter();
			}
			@Override
			public Adapter caseNavegationMenu(NavegationMenu object) {
				return createNavegationMenuAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseLinkViewCRUD(LinkViewCRUD object) {
				return createLinkViewCRUDAdapter();
			}
			@Override
			public Adapter caseLinkView(LinkView object) {
				return createLinkViewAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseRelationContraint(RelationContraint object) {
				return createRelationContraintAdapter();
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
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.Attributes
	 * @generated
	 */
	public Adapter createAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.Derived
	 * @generated
	 */
	public Adapter createDerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.NotDerived <em>Not Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.NotDerived
	 * @generated
	 */
	public Adapter createNotDerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.RelationClass <em>Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.RelationClass
	 * @generated
	 */
	public Adapter createRelationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.Views
	 * @generated
	 */
	public Adapter createViewsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.RelationView <em>Relation View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.RelationView
	 * @generated
	 */
	public Adapter createRelationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.ViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.ViewComponent
	 * @generated
	 */
	public Adapter createViewComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.ViewAttribute <em>View Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.ViewAttribute
	 * @generated
	 */
	public Adapter createViewAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.NavegationMenu <em>Navegation Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.NavegationMenu
	 * @generated
	 */
	public Adapter createNavegationMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.LinkViewCRUD <em>Link View CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.LinkViewCRUD
	 * @generated
	 */
	public Adapter createLinkViewCRUDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.LinkView <em>Link View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.LinkView
	 * @generated
	 */
	public Adapter createLinkViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metawebdesign.metawebdesign.RelationContraint <em>Relation Contraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metawebdesign.metawebdesign.RelationContraint
	 * @generated
	 */
	public Adapter createRelationContraintAdapter() {
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

} //MetawebdesignAdapterFactory
