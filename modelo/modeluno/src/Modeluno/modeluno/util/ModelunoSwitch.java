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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Modeluno.modeluno.ModelunoPackage
 * @generated
 */
public class ModelunoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelunoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelunoSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelunoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelunoPackage.MAP: {
				Map map = (Map)theEObject;
				T result = caseMap(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.CLASS: {
				Modeluno.modeluno.Class class_ = (Modeluno.modeluno.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.RELATION_CLASS: {
				RelationClass relationClass = (RelationClass)theEObject;
				T result = caseRelationClass(relationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.RELATION_ATTRIBUTE: {
				RelationAttribute relationAttribute = (RelationAttribute)theEObject;
				T result = caseRelationAttribute(relationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.ATTRIBUTE_NOT_DERIVED: {
				Attribute_Not_Derived attribute_Not_Derived = (Attribute_Not_Derived)theEObject;
				T result = caseAttribute_Not_Derived(attribute_Not_Derived);
				if (result == null) result = caseAttribute(attribute_Not_Derived);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.ATTRIBUTE_DERIVED: {
				Attribute_Derived attribute_Derived = (Attribute_Derived)theEObject;
				T result = caseAttribute_Derived(attribute_Derived);
				if (result == null) result = caseAttribute(attribute_Derived);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.RELATION_SERVICE: {
				RelationService relationService = (RelationService)theEObject;
				T result = caseRelationService(relationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseService(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseService(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.UPDATE_OBJECT: {
				UpdateObject updateObject = (UpdateObject)theEObject;
				T result = caseUpdateObject(updateObject);
				if (result == null) result = caseService(updateObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.UPDATE_ATTRIBUTE: {
				UpdateAttribute updateAttribute = (UpdateAttribute)theEObject;
				T result = caseUpdateAttribute(updateAttribute);
				if (result == null) result = caseService(updateAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.LIST_VIEW: {
				ListView listView = (ListView)theEObject;
				T result = caseListView(listView);
				if (result == null) result = caseService(listView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseService(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.ADMIN: {
				Admin admin = (Admin)theEObject;
				T result = caseAdmin(admin);
				if (result == null) result = caseService(admin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.VIEWS: {
				Views views = (Views)theEObject;
				T result = caseViews(views);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.VIEW_INPUT: {
				ViewInput viewInput = (ViewInput)theEObject;
				T result = caseViewInput(viewInput);
				if (result == null) result = caseViews(viewInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.VIEW_UPDATE_OBJECT: {
				ViewUpdateObject viewUpdateObject = (ViewUpdateObject)theEObject;
				T result = caseViewUpdateObject(viewUpdateObject);
				if (result == null) result = caseViews(viewUpdateObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.VIEW_UPDATE_ATTRIBUTE: {
				ViewUpdateAttribute viewUpdateAttribute = (ViewUpdateAttribute)theEObject;
				T result = caseViewUpdateAttribute(viewUpdateAttribute);
				if (result == null) result = caseViews(viewUpdateAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.VIEW_INDEX: {
				ViewIndex viewIndex = (ViewIndex)theEObject;
				T result = caseViewIndex(viewIndex);
				if (result == null) result = caseViews(viewIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.VIEW_ATTRIBUTE: {
				ViewAttribute viewAttribute = (ViewAttribute)theEObject;
				T result = caseViewAttribute(viewAttribute);
				if (result == null) result = caseViews(viewAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.VIEW_ADMIN: {
				ViewAdmin viewAdmin = (ViewAdmin)theEObject;
				T result = caseViewAdmin(viewAdmin);
				if (result == null) result = caseViews(viewAdmin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.RELATION_VIEW: {
				RelationView relationView = (RelationView)theEObject;
				T result = caseRelationView(relationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelunoPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseViews(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(Modeluno.modeluno.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationClass(RelationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationAttribute(RelationAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Not Derived</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Not Derived</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute_Not_Derived(Attribute_Not_Derived object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Derived</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Derived</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute_Derived(Attribute_Derived object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationService(RelationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateObject(UpdateObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAttribute(UpdateAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListView(ListView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmin(Admin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Views</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Views</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViews(Views object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewInput(ViewInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Update Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Update Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewUpdateObject(ViewUpdateObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Update Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Update Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewUpdateAttribute(ViewUpdateAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewIndex(ViewIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewAttribute(ViewAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Admin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Admin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewAdmin(ViewAdmin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationView(RelationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelunoSwitch
