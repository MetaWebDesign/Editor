/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Modeldos.modeldos.ModeldosPackage
 * @generated
 */
public interface ModeldosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeldosFactory eINSTANCE = Modeldos.modeldos.impl.ModeldosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Relations Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relations Class</em>'.
	 * @generated
	 */
	Relations_Class createRelations_Class();

	/**
	 * Returns a new object of class '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributes</em>'.
	 * @generated
	 */
	Attributes createAttributes();

	/**
	 * Returns a new object of class '<em>Derived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived</em>'.
	 * @generated
	 */
	Derived createDerived();

	/**
	 * Returns a new object of class '<em>Not Derived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Derived</em>'.
	 * @generated
	 */
	NotDerived createNotDerived();

	/**
	 * Returns a new object of class '<em>Views</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Views</em>'.
	 * @generated
	 */
	Views createViews();

	/**
	 * Returns a new object of class '<em>Form Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Create</em>'.
	 * @generated
	 */
	FormCreate createFormCreate();

	/**
	 * Returns a new object of class '<em>Form Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Update</em>'.
	 * @generated
	 */
	FormUpdate createFormUpdate();

	/**
	 * Returns a new object of class '<em>View Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Index</em>'.
	 * @generated
	 */
	ViewIndex createViewIndex();

	/**
	 * Returns a new object of class '<em>View Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Admin</em>'.
	 * @generated
	 */
	ViewAdmin createViewAdmin();

	/**
	 * Returns a new object of class '<em>Presentation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presentation Unit</em>'.
	 * @generated
	 */
	PresentationUnit createPresentationUnit();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu</em>'.
	 * @generated
	 */
	Menu createMenu();

	/**
	 * Returns a new object of class '<em>group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>group</em>'.
	 * @generated
	 */
	group creategroup();

	/**
	 * Returns a new object of class '<em>Relation PUnit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation PUnit</em>'.
	 * @generated
	 */
	RelationPUnit createRelationPUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModeldosPackage getModeldosPackage();

} //ModeldosFactory
