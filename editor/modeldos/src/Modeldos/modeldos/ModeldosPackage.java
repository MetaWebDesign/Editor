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
	 * The feature id for the '<em><b>Menu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MENU = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__VIEWS = 4;

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
	 * The feature id for the '<em><b>Has Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = 2;

	/**
	 * The feature id for the '<em><b>Function Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_CREATE = 3;

	/**
	 * The feature id for the '<em><b>Function Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_DELETE = 4;

	/**
	 * The feature id for the '<em><b>Function Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_UPDATE = 5;

	/**
	 * The feature id for the '<em><b>Function Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_INDEX = 6;

	/**
	 * The feature id for the '<em><b>Function View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Function Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FUNCTION_ADMIN = 8;

	/**
	 * The feature id for the '<em><b>Has Relation Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_RELATION_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Go Relation Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GO_RELATION_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Has View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_VIEW = 11;

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
	 * The meta object id for the '{@link Modeldos.modeldos.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.AttributesImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 2;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__VALUE = 2;

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
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 6;

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
	int DERIVED = 3;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__VALUE = ATTRIBUTES__VALUE;

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
	int NOT_DERIVED = 4;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__VALUE = ATTRIBUTES__VALUE;

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
	 * The meta object id for the '{@link Modeldos.modeldos.impl.RelationClassImpl <em>Relation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.RelationClassImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRelationClass()
	 * @generated
	 */
	int RELATION_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__TYPE_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Position Horizotal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__POSITION_HORIZOTAL = 2;

	/**
	 * The feature id for the '<em><b>Position Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__POSITION_VERTICAL = 3;

	/**
	 * The feature id for the '<em><b>From Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__FROM_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Attribute Get</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__ATTRIBUTE_GET = 5;

	/**
	 * The feature id for the '<em><b>Attribute Replace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__ATTRIBUTE_REPLACE = 6;

	/**
	 * The feature id for the '<em><b>Attribute Save</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__ATTRIBUTE_SAVE = 7;

	/**
	 * The number of structural features of the '<em>Relation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Relation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.MenuImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 6;

	/**
	 * The feature id for the '<em><b>Has Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__HAS_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = 1;

	/**
	 * The feature id for the '<em><b>Orientated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ORIENTATED = 2;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.GroupImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ORDER = 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.ViewsImpl <em>Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.ViewsImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getViews()
	 * @generated
	 */
	int VIEWS = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Rol View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__ROL_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Has Relation Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__HAS_RELATION_CLASS = 2;

	/**
	 * The feature id for the '<em><b>View Go Relation Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__VIEW_GO_RELATION_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__GROUP_NAME = 4;

	/**
	 * The number of structural features of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.FormImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>Rol View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ROL_VIEW = VIEWS__ROL_VIEW;

	/**
	 * The feature id for the '<em><b>Has Relation Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__HAS_RELATION_CLASS = VIEWS__HAS_RELATION_CLASS;

	/**
	 * The feature id for the '<em><b>View Go Relation Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_GO_RELATION_CLASS = VIEWS__VIEW_GO_RELATION_CLASS;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__GROUP_NAME = VIEWS__GROUP_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SERVICE = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.PageImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>Rol View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ROL_VIEW = VIEWS__ROL_VIEW;

	/**
	 * The feature id for the '<em><b>Has Relation Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HAS_RELATION_CLASS = VIEWS__HAS_RELATION_CLASS;

	/**
	 * The feature id for the '<em><b>View Go Relation Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__VIEW_GO_RELATION_CLASS = VIEWS__VIEW_GO_RELATION_CLASS;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GROUP_NAME = VIEWS__GROUP_NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTENT = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.TypeRol <em>Type Rol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.TypeRol
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeRol()
	 * @generated
	 */
	int TYPE_ROL = 11;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.TypeAttributeForm <em>Type Attribute Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.TypeAttributeForm
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeAttributeForm()
	 * @generated
	 */
	int TYPE_ATTRIBUTE_FORM = 12;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.TypeData <em>Type Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.TypeData
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeData()
	 * @generated
	 */
	int TYPE_DATA = 13;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.typePresentation <em>type Presentation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.typePresentation
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#gettypePresentation()
	 * @generated
	 */
	int TYPE_PRESENTATION = 14;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.typeHorizontalPosition <em>type Horizontal Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.typeHorizontalPosition
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#gettypeHorizontalPosition()
	 * @generated
	 */
	int TYPE_HORIZONTAL_POSITION = 15;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.TypeService <em>Type Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.TypeService
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeService()
	 * @generated
	 */
	int TYPE_SERVICE = 16;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.TypeOrientation <em>Type Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.TypeOrientation
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeOrientation()
	 * @generated
	 */
	int TYPE_ORIENTATION = 17;


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
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Root#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see Modeldos.modeldos.Root#getGroup()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Group();

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
	 * Returns the meta object for class '{@link Modeldos.modeldos.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Modeldos.modeldos.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Class#getHasAttributes <em>Has Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attributes</em>'.
	 * @see Modeldos.modeldos.Class#getHasAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasAttributes();

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
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Class#getHasRelationClass <em>Has Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relation Class</em>'.
	 * @see Modeldos.modeldos.Class#getHasRelationClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasRelationClass();

	/**
	 * Returns the meta object for the reference list '{@link Modeldos.modeldos.Class#getGoRelationClass <em>Go Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Go Relation Class</em>'.
	 * @see Modeldos.modeldos.Class#getGoRelationClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_GoRelationClass();

	/**
	 * Returns the meta object for the containment reference '{@link Modeldos.modeldos.Class#getHasView <em>Has View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has View</em>'.
	 * @see Modeldos.modeldos.Class#getHasView()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasView();

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
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Attributes#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Modeldos.modeldos.Attributes#getValue()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Value();

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
	 * Returns the meta object for class '{@link Modeldos.modeldos.RelationClass <em>Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Class</em>'.
	 * @see Modeldos.modeldos.RelationClass
	 * @generated
	 */
	EClass getRelationClass();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.RelationClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeldos.modeldos.RelationClass#getName()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.RelationClass#getTypePresentation <em>Type Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Presentation</em>'.
	 * @see Modeldos.modeldos.RelationClass#getTypePresentation()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_TypePresentation();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.RelationClass#getPositionHorizotal <em>Position Horizotal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Horizotal</em>'.
	 * @see Modeldos.modeldos.RelationClass#getPositionHorizotal()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_PositionHorizotal();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.RelationClass#getPositionVertical <em>Position Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Vertical</em>'.
	 * @see Modeldos.modeldos.RelationClass#getPositionVertical()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_PositionVertical();

	/**
	 * Returns the meta object for the reference list '{@link Modeldos.modeldos.RelationClass#getFromClass <em>From Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Class</em>'.
	 * @see Modeldos.modeldos.RelationClass#getFromClass()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_FromClass();

	/**
	 * Returns the meta object for the reference '{@link Modeldos.modeldos.RelationClass#getAttributeGet <em>Attribute Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Get</em>'.
	 * @see Modeldos.modeldos.RelationClass#getAttributeGet()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_AttributeGet();

	/**
	 * Returns the meta object for the reference '{@link Modeldos.modeldos.RelationClass#getAttributeReplace <em>Attribute Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Replace</em>'.
	 * @see Modeldos.modeldos.RelationClass#getAttributeReplace()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_AttributeReplace();

	/**
	 * Returns the meta object for the reference '{@link Modeldos.modeldos.RelationClass#getAttributeSave <em>Attribute Save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Save</em>'.
	 * @see Modeldos.modeldos.RelationClass#getAttributeSave()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_AttributeSave();

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
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Menu#getHasGroup <em>Has Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Group</em>'.
	 * @see Modeldos.modeldos.Menu#getHasGroup()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_HasGroup();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Menu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeldos.modeldos.Menu#getName()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Name();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Menu#getOrientated <em>Orientated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientated</em>'.
	 * @see Modeldos.modeldos.Menu#getOrientated()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Orientated();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see Modeldos.modeldos.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeldos.modeldos.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Group#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see Modeldos.modeldos.Group#getOrder()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Order();

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
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Views#getRolView <em>Rol View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol View</em>'.
	 * @see Modeldos.modeldos.Views#getRolView()
	 * @see #getViews()
	 * @generated
	 */
	EAttribute getViews_RolView();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Views#getHasRelationClass <em>Has Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relation Class</em>'.
	 * @see Modeldos.modeldos.Views#getHasRelationClass()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_HasRelationClass();

	/**
	 * Returns the meta object for the reference list '{@link Modeldos.modeldos.Views#getViewGoRelationClass <em>View Go Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>View Go Relation Class</em>'.
	 * @see Modeldos.modeldos.Views#getViewGoRelationClass()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_ViewGoRelationClass();

	/**
	 * Returns the meta object for the reference '{@link Modeldos.modeldos.Views#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Name</em>'.
	 * @see Modeldos.modeldos.Views#getGroupName()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_GroupName();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see Modeldos.modeldos.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Form#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeldos.modeldos.Form#getName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Name();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Form#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see Modeldos.modeldos.Form#getService()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Service();

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
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Page#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see Modeldos.modeldos.Page#getContent()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Content();

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
	 * Returns the meta object for enum '{@link Modeldos.modeldos.TypeService <em>Type Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Service</em>'.
	 * @see Modeldos.modeldos.TypeService
	 * @generated
	 */
	EEnum getTypeService();

	/**
	 * Returns the meta object for enum '{@link Modeldos.modeldos.TypeOrientation <em>Type Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Orientation</em>'.
	 * @see Modeldos.modeldos.TypeOrientation
	 * @generated
	 */
	EEnum getTypeOrientation();

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
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__MENU = eINSTANCE.getRoot_Menu();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__GROUP = eINSTANCE.getRoot_Group();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__VIEWS = eINSTANCE.getRoot_Views();

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
		 * The meta object literal for the '<em><b>Has Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_ATTRIBUTES = eINSTANCE.getClass_HasAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ID = eINSTANCE.getClass_Id();

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
		 * The meta object literal for the '<em><b>Has Relation Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_RELATION_CLASS = eINSTANCE.getClass_HasRelationClass();

		/**
		 * The meta object literal for the '<em><b>Go Relation Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GO_RELATION_CLASS = eINSTANCE.getClass_GoRelationClass();

		/**
		 * The meta object literal for the '<em><b>Has View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_VIEW = eINSTANCE.getClass_HasView();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__VALUE = eINSTANCE.getAttributes_Value();

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
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.RelationClassImpl <em>Relation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.RelationClassImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRelationClass()
		 * @generated
		 */
		EClass RELATION_CLASS = eINSTANCE.getRelationClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CLASS__NAME = eINSTANCE.getRelationClass_Name();

		/**
		 * The meta object literal for the '<em><b>Type Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CLASS__TYPE_PRESENTATION = eINSTANCE.getRelationClass_TypePresentation();

		/**
		 * The meta object literal for the '<em><b>Position Horizotal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CLASS__POSITION_HORIZOTAL = eINSTANCE.getRelationClass_PositionHorizotal();

		/**
		 * The meta object literal for the '<em><b>Position Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CLASS__POSITION_VERTICAL = eINSTANCE.getRelationClass_PositionVertical();

		/**
		 * The meta object literal for the '<em><b>From Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__FROM_CLASS = eINSTANCE.getRelationClass_FromClass();

		/**
		 * The meta object literal for the '<em><b>Attribute Get</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__ATTRIBUTE_GET = eINSTANCE.getRelationClass_AttributeGet();

		/**
		 * The meta object literal for the '<em><b>Attribute Replace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__ATTRIBUTE_REPLACE = eINSTANCE.getRelationClass_AttributeReplace();

		/**
		 * The meta object literal for the '<em><b>Attribute Save</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__ATTRIBUTE_SAVE = eINSTANCE.getRelationClass_AttributeSave();

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
		 * The meta object literal for the '<em><b>Has Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__HAS_GROUP = eINSTANCE.getMenu_HasGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__NAME = eINSTANCE.getMenu_Name();

		/**
		 * The meta object literal for the '<em><b>Orientated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__ORIENTATED = eINSTANCE.getMenu_Orientated();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.GroupImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ORDER = eINSTANCE.getGroup_Order();

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
		 * The meta object literal for the '<em><b>Rol View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWS__ROL_VIEW = eINSTANCE.getViews_RolView();

		/**
		 * The meta object literal for the '<em><b>Has Relation Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__HAS_RELATION_CLASS = eINSTANCE.getViews_HasRelationClass();

		/**
		 * The meta object literal for the '<em><b>View Go Relation Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__VIEW_GO_RELATION_CLASS = eINSTANCE.getViews_ViewGoRelationClass();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__GROUP_NAME = eINSTANCE.getViews_GroupName();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.FormImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NAME = eINSTANCE.getForm_Name();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SERVICE = eINSTANCE.getForm_Service();

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
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__CONTENT = eINSTANCE.getPage_Content();

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

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.TypeService <em>Type Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.TypeService
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeService()
		 * @generated
		 */
		EEnum TYPE_SERVICE = eINSTANCE.getTypeService();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.TypeOrientation <em>Type Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.TypeOrientation
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getTypeOrientation()
		 * @generated
		 */
		EEnum TYPE_ORIENTATION = eINSTANCE.getTypeOrientation();

	}

} //ModeldosPackage
