/**
 */
package Modeldos.modeldos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Modeldos.modeldos.ModeldosFactory
 * @model kind="package"
 * @generated
 */
public interface ModeldosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modeldos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modeldos/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modeldos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeldosPackage eINSTANCE = Modeldos.modeldos.impl.ModeldosPackageImpl.init();

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.RootImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__VIEWS = 2;

	/**
	 * The feature id for the '<em><b>Presentationunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PRESENTATIONUNIT = 3;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MENU = 4;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.ClassImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Relationclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__RELATIONCLASS = 1;

	/**
	 * The feature id for the '<em><b>Goclass1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GOCLASS1 = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 4;

	/**
	 * The feature id for the '<em><b>Function Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_CREATE = 5;

	/**
	 * The feature id for the '<em><b>Function Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_DELETE = 6;

	/**
	 * The feature id for the '<em><b>Function Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_UPDATE = 7;

	/**
	 * The feature id for the '<em><b>Function Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_INDEX = 8;

	/**
	 * The feature id for the '<em><b>Function View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_VIEW = 9;

	/**
	 * The feature id for the '<em><b>Function Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_ADMIN = 10;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VIEWS = 11;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.Relations_ClassImpl <em>Relations Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.Relations_ClassImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRelations_Class()
	 * @generated
	 */
	int RELATIONS_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Goclass2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_CLASS__GOCLASS2 = 0;

	/**
	 * The number of structural features of the '<em>Relations Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relations Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.AttributesImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ROL = 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__VALOR = 2;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__PRIMARY_KEY = 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>In The Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__IN_THE_FORM = 5;

	/**
	 * The feature id for the '<em><b>Has Presentation Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__HAS_PRESENTATION_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Go Punit1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__GO_PUNIT1 = 7;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.DerivedImpl <em>Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.DerivedImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getDerived()
	 * @generated
	 */
	int DERIVED = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__NAME = ATTRIBUTES__NAME;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__ROL = ATTRIBUTES__ROL;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__VALOR = ATTRIBUTES__VALOR;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__PRIMARY_KEY = ATTRIBUTES__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__DATA_TYPE = ATTRIBUTES__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>In The Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__IN_THE_FORM = ATTRIBUTES__IN_THE_FORM;

	/**
	 * The feature id for the '<em><b>Has Presentation Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__HAS_PRESENTATION_UNIT = ATTRIBUTES__HAS_PRESENTATION_UNIT;

	/**
	 * The feature id for the '<em><b>Go Punit1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__GO_PUNIT1 = ATTRIBUTES__GO_PUNIT1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__COMMENT = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__FORMULA = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_OPERATION_COUNT = ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.NotDerivedImpl <em>Not Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.NotDerivedImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getNotDerived()
	 * @generated
	 */
	int NOT_DERIVED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__NAME = ATTRIBUTES__NAME;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__ROL = ATTRIBUTES__ROL;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__VALOR = ATTRIBUTES__VALOR;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__PRIMARY_KEY = ATTRIBUTES__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__DATA_TYPE = ATTRIBUTES__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>In The Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__IN_THE_FORM = ATTRIBUTES__IN_THE_FORM;

	/**
	 * The feature id for the '<em><b>Has Presentation Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__HAS_PRESENTATION_UNIT = ATTRIBUTES__HAS_PRESENTATION_UNIT;

	/**
	 * The feature id for the '<em><b>Go Punit1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__GO_PUNIT1 = ATTRIBUTES__GO_PUNIT1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__DEFAULT_VALUE = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED_OPERATION_COUNT = ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.ViewsImpl <em>Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.ViewsImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getViews()
	 * @generated
	 */
	int VIEWS = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__TITLE = 0;

	/**
	 * The feature id for the '<em><b>View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__VIEW_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.FormCreateImpl <em>Form Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.FormCreateImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getFormCreate()
	 * @generated
	 */
	int FORM_CREATE = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CREATE__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CREATE__VIEW_GROUP = VIEWS__VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Create Presentation Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CREATE__CREATE_PRESENTATION_UNIT = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CREATE_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CREATE_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.FormUpdateImpl <em>Form Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.FormUpdateImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getFormUpdate()
	 * @generated
	 */
	int FORM_UPDATE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE__VIEW_GROUP = VIEWS__VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Update Presentation Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE__UPDATE_PRESENTATION_UNIT = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_UPDATE_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.ViewIndexImpl <em>View Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.ViewIndexImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getViewIndex()
	 * @generated
	 */
	int VIEW_INDEX = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INDEX__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INDEX__VIEW_GROUP = VIEWS__VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INDEX__ROWS = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INDEX_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INDEX_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.ViewAdminImpl <em>View Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.ViewAdminImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getViewAdmin()
	 * @generated
	 */
	int VIEW_ADMIN = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ADMIN__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ADMIN__VIEW_GROUP = VIEWS__VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ADMIN__ROWS = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ADMIN_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ADMIN_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.PresentationUnitImpl <em>Presentation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.PresentationUnitImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getPresentationUnit()
	 * @generated
	 */
	int PRESENTATION_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Name Feild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_UNIT__NAME_FEILD = 0;

	/**
	 * The feature id for the '<em><b>Type Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_UNIT__TYPE_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Horizontal Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_UNIT__HORIZONTAL_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Vertical Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_UNIT__VERTICAL_POSITION = 3;

	/**
	 * The number of structural features of the '<em>Presentation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_UNIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Presentation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.PageImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__VIEW_GROUP = VIEWS__VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ROL = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Presentation Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_PRESENTATION_UNIT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.MenuImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 13;

	/**
	 * The feature id for the '<em><b>Has Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__HAS_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.groupImpl <em>group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.groupImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getgroup()
	 * @generated
	 */
	int GROUP = 14;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ORDER = 1;

	/**
	 * The number of structural features of the '<em>group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.RelationPUnitImpl <em>Relation PUnit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.RelationPUnitImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRelationPUnit()
	 * @generated
	 */
	int RELATION_PUNIT = 15;

	/**
	 * The feature id for the '<em><b>Go Punit2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PUNIT__GO_PUNIT2 = 0;

	/**
	 * The feature id for the '<em><b>Rto PUnit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PUNIT__RTO_PUNIT = 1;

	/**
	 * The number of structural features of the '<em>Relation PUnit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PUNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation PUnit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PUNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.TypeRol <em>Type Rol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.TypeRol
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeRol()
	 * @generated
	 */
	int TYPE_ROL = 16;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.TypeAttributeForm <em>Type Attribute Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.TypeAttributeForm
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeAttributeForm()
	 * @generated
	 */
	int TYPE_ATTRIBUTE_FORM = 17;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.TypeData <em>Type Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.TypeData
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeData()
	 * @generated
	 */
	int TYPE_DATA = 18;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.typePresentation <em>type Presentation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.typePresentation
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#gettypePresentation()
	 * @generated
	 */
	int TYPE_PRESENTATION = 19;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.typeHorizontalPosition <em>type Horizontal Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.typeHorizontalPosition
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#gettypeHorizontalPosition()
	 * @generated
	 */
	int TYPE_HORIZONTAL_POSITION = 20;


	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see Modeldos.modeldos.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Root#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see Modeldos.modeldos.Root#getClass_()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Root#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see Modeldos.modeldos.Root#getAttribute()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Root#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see Modeldos.modeldos.Root#getViews()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Root#getPresentationunit <em>Presentationunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentationunit</em>'.
	 * @see Modeldos.modeldos.Root#getPresentationunit()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Presentationunit();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Root#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu</em>'.
	 * @see Modeldos.modeldos.Root#getMenu()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Menu();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Modeldos.modeldos.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see Modeldos.modeldos.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Class#getRelationclass <em>Relationclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationclass</em>'.
	 * @see Modeldos.modeldos.Class#getRelationclass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Relationclass();

	/**
	 * Returns the meta object for the reference '{@link Modeldos.modeldos.Class#getGoclass1 <em>Goclass1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goclass1</em>'.
	 * @see Modeldos.modeldos.Class#getGoclass1()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Goclass1();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Class#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Modeldos.modeldos.Class#getId()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Id();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeldos.modeldos.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Class#getFunctionCreate <em>Function Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Create</em>'.
	 * @see Modeldos.modeldos.Class#getFunctionCreate()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionCreate();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Class#getFunctionDelete <em>Function Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Delete</em>'.
	 * @see Modeldos.modeldos.Class#getFunctionDelete()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionDelete();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Class#getFunctionUpdate <em>Function Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Update</em>'.
	 * @see Modeldos.modeldos.Class#getFunctionUpdate()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionUpdate();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Class#getFunctionIndex <em>Function Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Index</em>'.
	 * @see Modeldos.modeldos.Class#getFunctionIndex()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionIndex();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Class#getFunctionView <em>Function View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function View</em>'.
	 * @see Modeldos.modeldos.Class#getFunctionView()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionView();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Class#getFunctionAdmin <em>Function Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Admin</em>'.
	 * @see Modeldos.modeldos.Class#getFunctionAdmin()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionAdmin();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Class#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see Modeldos.modeldos.Class#getViews()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Views();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Relations_Class <em>Relations Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relations Class</em>'.
	 * @see Modeldos.modeldos.Relations_Class
	 * @generated
	 */
	EClass getRelations_Class();

	/**
	 * Returns the meta object for the reference '{@link Modeldos.modeldos.Relations_Class#getGoclass2 <em>Goclass2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goclass2</em>'.
	 * @see Modeldos.modeldos.Relations_Class#getGoclass2()
	 * @see #getRelations_Class()
	 * @generated
	 */
	EReference getRelations_Class_Goclass2();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see Modeldos.modeldos.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Attributes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeldos.modeldos.Attributes#getName()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Name();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Attributes#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see Modeldos.modeldos.Attributes#getRol()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Rol();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Attributes#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Modeldos.modeldos.Attributes#getValor()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Valor();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Attributes#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see Modeldos.modeldos.Attributes#isPrimaryKey()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Attributes#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see Modeldos.modeldos.Attributes#getDataType()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Attributes#getInTheForm <em>In The Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In The Form</em>'.
	 * @see Modeldos.modeldos.Attributes#getInTheForm()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_InTheForm();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Attributes#getHasPresentationUnit <em>Has Presentation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Presentation Unit</em>'.
	 * @see Modeldos.modeldos.Attributes#getHasPresentationUnit()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_HasPresentationUnit();

	/**
	 * Returns the meta object for the reference '{@link Modeldos.modeldos.Attributes#getGoPunit1 <em>Go Punit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go Punit1</em>'.
	 * @see Modeldos.modeldos.Attributes#getGoPunit1()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_GoPunit1();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived</em>'.
	 * @see Modeldos.modeldos.Derived
	 * @generated
	 */
	EClass getDerived();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Derived#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Modeldos.modeldos.Derived#getComment()
	 * @see #getDerived()
	 * @generated
	 */
	EAttribute getDerived_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Derived#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see Modeldos.modeldos.Derived#getFormula()
	 * @see #getDerived()
	 * @generated
	 */
	EAttribute getDerived_Formula();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.NotDerived <em>Not Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Derived</em>'.
	 * @see Modeldos.modeldos.NotDerived
	 * @generated
	 */
	EClass getNotDerived();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.NotDerived#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Modeldos.modeldos.NotDerived#getDefaultValue()
	 * @see #getNotDerived()
	 * @generated
	 */
	EAttribute getNotDerived_DefaultValue();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Views</em>'.
	 * @see Modeldos.modeldos.Views
	 * @generated
	 */
	EClass getViews();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Views#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Modeldos.modeldos.Views#getTitle()
	 * @see #getViews()
	 * @generated
	 */
	EAttribute getViews_Title();

	/**
	 * Returns the meta object for the containment reference '{@link Modeldos.modeldos.Views#getViewGroup <em>View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Group</em>'.
	 * @see Modeldos.modeldos.Views#getViewGroup()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_ViewGroup();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.FormCreate <em>Form Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Create</em>'.
	 * @see Modeldos.modeldos.FormCreate
	 * @generated
	 */
	EClass getFormCreate();

	/**
	 * Returns the meta object for the containment reference '{@link Modeldos.modeldos.FormCreate#getCreatePresentationUnit <em>Create Presentation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Presentation Unit</em>'.
	 * @see Modeldos.modeldos.FormCreate#getCreatePresentationUnit()
	 * @see #getFormCreate()
	 * @generated
	 */
	EReference getFormCreate_CreatePresentationUnit();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.FormUpdate <em>Form Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Update</em>'.
	 * @see Modeldos.modeldos.FormUpdate
	 * @generated
	 */
	EClass getFormUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link Modeldos.modeldos.FormUpdate#getUpdatePresentationUnit <em>Update Presentation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Presentation Unit</em>'.
	 * @see Modeldos.modeldos.FormUpdate#getUpdatePresentationUnit()
	 * @see #getFormUpdate()
	 * @generated
	 */
	EReference getFormUpdate_UpdatePresentationUnit();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.ViewIndex <em>View Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Index</em>'.
	 * @see Modeldos.modeldos.ViewIndex
	 * @generated
	 */
	EClass getViewIndex();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.ViewIndex#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see Modeldos.modeldos.ViewIndex#getRows()
	 * @see #getViewIndex()
	 * @generated
	 */
	EAttribute getViewIndex_Rows();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.ViewAdmin <em>View Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Admin</em>'.
	 * @see Modeldos.modeldos.ViewAdmin
	 * @generated
	 */
	EClass getViewAdmin();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.ViewAdmin#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see Modeldos.modeldos.ViewAdmin#getRows()
	 * @see #getViewAdmin()
	 * @generated
	 */
	EAttribute getViewAdmin_Rows();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.PresentationUnit <em>Presentation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Unit</em>'.
	 * @see Modeldos.modeldos.PresentationUnit
	 * @generated
	 */
	EClass getPresentationUnit();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.PresentationUnit#getNameFeild <em>Name Feild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Feild</em>'.
	 * @see Modeldos.modeldos.PresentationUnit#getNameFeild()
	 * @see #getPresentationUnit()
	 * @generated
	 */
	EAttribute getPresentationUnit_NameFeild();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.PresentationUnit#getTypePresentation <em>Type Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Presentation</em>'.
	 * @see Modeldos.modeldos.PresentationUnit#getTypePresentation()
	 * @see #getPresentationUnit()
	 * @generated
	 */
	EAttribute getPresentationUnit_TypePresentation();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.PresentationUnit#getHorizontalPosition <em>Horizontal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Position</em>'.
	 * @see Modeldos.modeldos.PresentationUnit#getHorizontalPosition()
	 * @see #getPresentationUnit()
	 * @generated
	 */
	EAttribute getPresentationUnit_HorizontalPosition();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.PresentationUnit#getVerticalPosition <em>Vertical Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Position</em>'.
	 * @see Modeldos.modeldos.PresentationUnit#getVerticalPosition()
	 * @see #getPresentationUnit()
	 * @generated
	 */
	EAttribute getPresentationUnit_VerticalPosition();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see Modeldos.modeldos.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Page#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see Modeldos.modeldos.Page#getRol()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Rol();

	/**
	 * Returns the meta object for the containment reference '{@link Modeldos.modeldos.Page#getPagePresentationUnit <em>Page Presentation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Presentation Unit</em>'.
	 * @see Modeldos.modeldos.Page#getPagePresentationUnit()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PagePresentationUnit();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see Modeldos.modeldos.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference '{@link Modeldos.modeldos.Menu#getHasGroup <em>Has Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Group</em>'.
	 * @see Modeldos.modeldos.Menu#getHasGroup()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_HasGroup();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Menu#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Modeldos.modeldos.Menu#getNombre()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Nombre();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.group <em>group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>group</em>'.
	 * @see Modeldos.modeldos.group
	 * @generated
	 */
	EClass getgroup();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.group#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Modeldos.modeldos.group#getNombre()
	 * @see #getgroup()
	 * @generated
	 */
	EAttribute getgroup_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.group#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see Modeldos.modeldos.group#getOrder()
	 * @see #getgroup()
	 * @generated
	 */
	EAttribute getgroup_Order();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.RelationPUnit <em>Relation PUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation PUnit</em>'.
	 * @see Modeldos.modeldos.RelationPUnit
	 * @generated
	 */
	EClass getRelationPUnit();

	/**
	 * Returns the meta object for the reference '{@link Modeldos.modeldos.RelationPUnit#getGoPunit2 <em>Go Punit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go Punit2</em>'.
	 * @see Modeldos.modeldos.RelationPUnit#getGoPunit2()
	 * @see #getRelationPUnit()
	 * @generated
	 */
	EReference getRelationPUnit_GoPunit2();

	/**
	 * Returns the meta object for the containment reference '{@link Modeldos.modeldos.RelationPUnit#getRtoPUnit <em>Rto PUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rto PUnit</em>'.
	 * @see Modeldos.modeldos.RelationPUnit#getRtoPUnit()
	 * @see #getRelationPUnit()
	 * @generated
	 */
	EReference getRelationPUnit_RtoPUnit();

	/**
	 * Returns the meta object for enum '{@link Modeldos.modeldos.TypeRol <em>Type Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Rol</em>'.
	 * @see Modeldos.modeldos.TypeRol
	 * @generated
	 */
	EEnum getTypeRol();

	/**
	 * Returns the meta object for enum '{@link Modeldos.modeldos.TypeAttributeForm <em>Type Attribute Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Attribute Form</em>'.
	 * @see Modeldos.modeldos.TypeAttributeForm
	 * @generated
	 */
	EEnum getTypeAttributeForm();

	/**
	 * Returns the meta object for enum '{@link Modeldos.modeldos.TypeData <em>Type Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Data</em>'.
	 * @see Modeldos.modeldos.TypeData
	 * @generated
	 */
	EEnum getTypeData();

	/**
	 * Returns the meta object for enum '{@link Modeldos.modeldos.typePresentation <em>type Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Presentation</em>'.
	 * @see Modeldos.modeldos.typePresentation
	 * @generated
	 */
	EEnum gettypePresentation();

	/**
	 * Returns the meta object for enum '{@link Modeldos.modeldos.typeHorizontalPosition <em>type Horizontal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Horizontal Position</em>'.
	 * @see Modeldos.modeldos.typeHorizontalPosition
	 * @generated
	 */
	EEnum gettypeHorizontalPosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeldosFactory getModeldosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.RootImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CLASS = eINSTANCE.getRoot_Class();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ATTRIBUTE = eINSTANCE.getRoot_Attribute();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__VIEWS = eINSTANCE.getRoot_Views();

		/**
		 * The meta object literal for the '<em><b>Presentationunit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PRESENTATIONUNIT = eINSTANCE.getRoot_Presentationunit();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__MENU = eINSTANCE.getRoot_Menu();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.ClassImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Relationclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__RELATIONCLASS = eINSTANCE.getClass_Relationclass();

		/**
		 * The meta object literal for the '<em><b>Goclass1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GOCLASS1 = eINSTANCE.getClass_Goclass1();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ID = eINSTANCE.getClass_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Function Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__FUNCTION_CREATE = eINSTANCE.getClass_FunctionCreate();

		/**
		 * The meta object literal for the '<em><b>Function Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__FUNCTION_DELETE = eINSTANCE.getClass_FunctionDelete();

		/**
		 * The meta object literal for the '<em><b>Function Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__FUNCTION_UPDATE = eINSTANCE.getClass_FunctionUpdate();

		/**
		 * The meta object literal for the '<em><b>Function Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__FUNCTION_INDEX = eINSTANCE.getClass_FunctionIndex();

		/**
		 * The meta object literal for the '<em><b>Function View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__FUNCTION_VIEW = eINSTANCE.getClass_FunctionView();

		/**
		 * The meta object literal for the '<em><b>Function Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__FUNCTION_ADMIN = eINSTANCE.getClass_FunctionAdmin();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__VIEWS = eINSTANCE.getClass_Views();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.Relations_ClassImpl <em>Relations Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.Relations_ClassImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRelations_Class()
		 * @generated
		 */
		EClass RELATIONS_CLASS = eINSTANCE.getRelations_Class();

		/**
		 * The meta object literal for the '<em><b>Goclass2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS_CLASS__GOCLASS2 = eINSTANCE.getRelations_Class_Goclass2();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.AttributesImpl <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.AttributesImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getAttributes()
		 * @generated
		 */
		EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__NAME = eINSTANCE.getAttributes_Name();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__ROL = eINSTANCE.getAttributes_Rol();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__VALOR = eINSTANCE.getAttributes_Valor();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__PRIMARY_KEY = eINSTANCE.getAttributes_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__DATA_TYPE = eINSTANCE.getAttributes_DataType();

		/**
		 * The meta object literal for the '<em><b>In The Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__IN_THE_FORM = eINSTANCE.getAttributes_InTheForm();

		/**
		 * The meta object literal for the '<em><b>Has Presentation Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__HAS_PRESENTATION_UNIT = eINSTANCE.getAttributes_HasPresentationUnit();

		/**
		 * The meta object literal for the '<em><b>Go Punit1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__GO_PUNIT1 = eINSTANCE.getAttributes_GoPunit1();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.DerivedImpl <em>Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.DerivedImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getDerived()
		 * @generated
		 */
		EClass DERIVED = eINSTANCE.getDerived();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED__COMMENT = eINSTANCE.getDerived_Comment();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED__FORMULA = eINSTANCE.getDerived_Formula();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.NotDerivedImpl <em>Not Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.NotDerivedImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getNotDerived()
		 * @generated
		 */
		EClass NOT_DERIVED = eINSTANCE.getNotDerived();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT_DERIVED__DEFAULT_VALUE = eINSTANCE.getNotDerived_DefaultValue();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.ViewsImpl <em>Views</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.ViewsImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getViews()
		 * @generated
		 */
		EClass VIEWS = eINSTANCE.getViews();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWS__TITLE = eINSTANCE.getViews_Title();

		/**
		 * The meta object literal for the '<em><b>View Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__VIEW_GROUP = eINSTANCE.getViews_ViewGroup();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.FormCreateImpl <em>Form Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.FormCreateImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getFormCreate()
		 * @generated
		 */
		EClass FORM_CREATE = eINSTANCE.getFormCreate();

		/**
		 * The meta object literal for the '<em><b>Create Presentation Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CREATE__CREATE_PRESENTATION_UNIT = eINSTANCE.getFormCreate_CreatePresentationUnit();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.FormUpdateImpl <em>Form Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.FormUpdateImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getFormUpdate()
		 * @generated
		 */
		EClass FORM_UPDATE = eINSTANCE.getFormUpdate();

		/**
		 * The meta object literal for the '<em><b>Update Presentation Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_UPDATE__UPDATE_PRESENTATION_UNIT = eINSTANCE.getFormUpdate_UpdatePresentationUnit();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.ViewIndexImpl <em>View Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.ViewIndexImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getViewIndex()
		 * @generated
		 */
		EClass VIEW_INDEX = eINSTANCE.getViewIndex();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_INDEX__ROWS = eINSTANCE.getViewIndex_Rows();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.ViewAdminImpl <em>View Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.ViewAdminImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getViewAdmin()
		 * @generated
		 */
		EClass VIEW_ADMIN = eINSTANCE.getViewAdmin();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ADMIN__ROWS = eINSTANCE.getViewAdmin_Rows();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.PresentationUnitImpl <em>Presentation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.PresentationUnitImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getPresentationUnit()
		 * @generated
		 */
		EClass PRESENTATION_UNIT = eINSTANCE.getPresentationUnit();

		/**
		 * The meta object literal for the '<em><b>Name Feild</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_UNIT__NAME_FEILD = eINSTANCE.getPresentationUnit_NameFeild();

		/**
		 * The meta object literal for the '<em><b>Type Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_UNIT__TYPE_PRESENTATION = eINSTANCE.getPresentationUnit_TypePresentation();

		/**
		 * The meta object literal for the '<em><b>Horizontal Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_UNIT__HORIZONTAL_POSITION = eINSTANCE.getPresentationUnit_HorizontalPosition();

		/**
		 * The meta object literal for the '<em><b>Vertical Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_UNIT__VERTICAL_POSITION = eINSTANCE.getPresentationUnit_VerticalPosition();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.PageImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__ROL = eINSTANCE.getPage_Rol();

		/**
		 * The meta object literal for the '<em><b>Page Presentation Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGE_PRESENTATION_UNIT = eINSTANCE.getPage_PagePresentationUnit();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.MenuImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Has Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__HAS_GROUP = eINSTANCE.getMenu_HasGroup();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__NOMBRE = eINSTANCE.getMenu_Nombre();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.groupImpl <em>group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.groupImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getgroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getgroup();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NOMBRE = eINSTANCE.getgroup_Nombre();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ORDER = eINSTANCE.getgroup_Order();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.RelationPUnitImpl <em>Relation PUnit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.RelationPUnitImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRelationPUnit()
		 * @generated
		 */
		EClass RELATION_PUNIT = eINSTANCE.getRelationPUnit();

		/**
		 * The meta object literal for the '<em><b>Go Punit2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_PUNIT__GO_PUNIT2 = eINSTANCE.getRelationPUnit_GoPunit2();

		/**
		 * The meta object literal for the '<em><b>Rto PUnit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_PUNIT__RTO_PUNIT = eINSTANCE.getRelationPUnit_RtoPUnit();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.TypeRol <em>Type Rol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.TypeRol
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeRol()
		 * @generated
		 */
		EEnum TYPE_ROL = eINSTANCE.getTypeRol();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.TypeAttributeForm <em>Type Attribute Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.TypeAttributeForm
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeAttributeForm()
		 * @generated
		 */
		EEnum TYPE_ATTRIBUTE_FORM = eINSTANCE.getTypeAttributeForm();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.TypeData <em>Type Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.TypeData
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeData()
		 * @generated
		 */
		EEnum TYPE_DATA = eINSTANCE.getTypeData();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.typePresentation <em>type Presentation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.typePresentation
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#gettypePresentation()
		 * @generated
		 */
		EEnum TYPE_PRESENTATION = eINSTANCE.gettypePresentation();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.typeHorizontalPosition <em>type Horizontal Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.typeHorizontalPosition
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#gettypeHorizontalPosition()
		 * @generated
		 */
		EEnum TYPE_HORIZONTAL_POSITION = eINSTANCE.gettypeHorizontalPosition();

	}

} //ModeldosPackage
