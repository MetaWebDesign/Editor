/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Modeluno.modeluno.ModelunoPackage
 * @generated
 */
public interface ModelunoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelunoFactory eINSTANCE = Modeluno.modeluno.impl.ModelunoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map</em>'.
	 * @generated
	 */
	Map createMap();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Relation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Class</em>'.
	 * @generated
	 */
	RelationClass createRelationClass();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Relation Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Attribute</em>'.
	 * @generated
	 */
	RelationAttribute createRelationAttribute();

	/**
	 * Returns a new object of class '<em>Attribute Not Derived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Not Derived</em>'.
	 * @generated
	 */
	Attribute_Not_Derived createAttribute_Not_Derived();

	/**
	 * Returns a new object of class '<em>Attribute Derived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Derived</em>'.
	 * @generated
	 */
	Attribute_Derived createAttribute_Derived();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Relation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Service</em>'.
	 * @generated
	 */
	RelationService createRelationService();

	/**
	 * Returns a new object of class '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create</em>'.
	 * @generated
	 */
	Create createCreate();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Update Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Object</em>'.
	 * @generated
	 */
	UpdateObject createUpdateObject();

	/**
	 * Returns a new object of class '<em>Update Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Attribute</em>'.
	 * @generated
	 */
	UpdateAttribute createUpdateAttribute();

	/**
	 * Returns a new object of class '<em>List View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List View</em>'.
	 * @generated
	 */
	ListView createListView();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin</em>'.
	 * @generated
	 */
	Admin createAdmin();

	/**
	 * Returns a new object of class '<em>Views</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Views</em>'.
	 * @generated
	 */
	Views createViews();

	/**
	 * Returns a new object of class '<em>View Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Input</em>'.
	 * @generated
	 */
	ViewInput createViewInput();

	/**
	 * Returns a new object of class '<em>View Update Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Update Object</em>'.
	 * @generated
	 */
	ViewUpdateObject createViewUpdateObject();

	/**
	 * Returns a new object of class '<em>View Update Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Update Attribute</em>'.
	 * @generated
	 */
	ViewUpdateAttribute createViewUpdateAttribute();

	/**
	 * Returns a new object of class '<em>View Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Index</em>'.
	 * @generated
	 */
	ViewIndex createViewIndex();

	/**
	 * Returns a new object of class '<em>View Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Attribute</em>'.
	 * @generated
	 */
	ViewAttribute createViewAttribute();

	/**
	 * Returns a new object of class '<em>View Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Admin</em>'.
	 * @generated
	 */
	ViewAdmin createViewAdmin();

	/**
	 * Returns a new object of class '<em>Relation View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation View</em>'.
	 * @generated
	 */
	RelationView createRelationView();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelunoPackage getModelunoPackage();

} //ModelunoFactory
