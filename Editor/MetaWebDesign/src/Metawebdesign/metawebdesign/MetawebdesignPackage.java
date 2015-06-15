/**
 */
package Metawebdesign.metawebdesign;

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
 * @see Metawebdesign.metawebdesign.MetawebdesignFactory
 * @model kind="package"
 * @generated
 */
public interface MetawebdesignPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metawebdesign";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metawebdesign/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metawebdesign";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetawebdesignPackage eINSTANCE = Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl.init();

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.RootImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getRoot()
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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.ClassImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getClass_()
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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.AttributesImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getAttributes()
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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.DerivedImpl <em>Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.DerivedImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getDerived()
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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.NotDerivedImpl <em>Not Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.NotDerivedImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getNotDerived()
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
	 * The feature id for the '<em><b>Value Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__VALUE_DEFAULT = ATTRIBUTES_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.RelationClassImpl <em>Relation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.RelationClassImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getRelationClass()
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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.MenuImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getMenu()
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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.GroupImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getGroup()
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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.ViewsImpl <em>Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.ViewsImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getViews()
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
	 * The feature id for the '<em><b>Group Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__GROUP_NAME = 2;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__HAS_RELATION_VIEW = 3;

	/**
	 * The feature id for the '<em><b>From Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__FROM_RELATION = 4;

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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.FormImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getForm()
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
	 * The feature id for the '<em><b>Group Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__GROUP_NAME = VIEWS__GROUP_NAME;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__HAS_RELATION_VIEW = VIEWS__HAS_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>From Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FROM_RELATION = VIEWS__FROM_RELATION;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SERVICE = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.PageImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getPage()
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
	 * The feature id for the '<em><b>Group Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GROUP_NAME = VIEWS__GROUP_NAME;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HAS_RELATION_VIEW = VIEWS__HAS_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>From Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FROM_RELATION = VIEWS__FROM_RELATION;

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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.RelationViewImpl <em>Relation View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.RelationViewImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getRelationView()
	 * @generated
	 */
	int RELATION_VIEW = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__TYPE_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Position Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__POSITION_HORIZONTAL = 2;

	/**
	 * The feature id for the '<em><b>Position Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__POSITION_VERTICAL = 3;

	/**
	 * The feature id for the '<em><b>RViews Has Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__RVIEWS_HAS_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Rviews Go To Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__RVIEWS_GO_TO_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Get Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__GET_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__ROW = 7;

	/**
	 * The number of structural features of the '<em>Relation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Relation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeRol <em>Type Rol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeRol()
	 * @generated
	 */
	int TYPE_ROL = 12;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeAttributeForm <em>Type Attribute Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeAttributeForm
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeAttributeForm()
	 * @generated
	 */
	int TYPE_ATTRIBUTE_FORM = 13;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeData <em>Type Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeData
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeData()
	 * @generated
	 */
	int TYPE_DATA = 14;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.typePresentation <em>type Presentation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.typePresentation
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypePresentation()
	 * @generated
	 */
	int TYPE_PRESENTATION = 15;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.typeHorizontalPosition <em>type Horizontal Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.typeHorizontalPosition
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypeHorizontalPosition()
	 * @generated
	 */
	int TYPE_HORIZONTAL_POSITION = 16;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeService <em>Type Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeService
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeService()
	 * @generated
	 */
	int TYPE_SERVICE = 17;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeOrientation <em>Type Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeOrientation
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeOrientation()
	 * @generated
	 */
	int TYPE_ORIENTATION = 18;


	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see Metawebdesign.metawebdesign.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Root#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see Metawebdesign.metawebdesign.Root#getClass_()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Root#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see Metawebdesign.metawebdesign.Root#getAttribute()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Root#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu</em>'.
	 * @see Metawebdesign.metawebdesign.Root#getMenu()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Menu();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Root#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see Metawebdesign.metawebdesign.Root#getGroup()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Root#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see Metawebdesign.metawebdesign.Root#getViews()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Views();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Metawebdesign.metawebdesign.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Class#getHasAttributes <em>Has Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attributes</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getHasAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasAttributes();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Class#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getId()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Id();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Class#getFunctionCreate <em>Function Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Create</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getFunctionCreate()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionCreate();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Class#getFunctionDelete <em>Function Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Delete</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getFunctionDelete()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionDelete();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Class#getFunctionUpdate <em>Function Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Update</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getFunctionUpdate()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionUpdate();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Class#getFunctionIndex <em>Function Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Index</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getFunctionIndex()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionIndex();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Class#getFunctionView <em>Function View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function View</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getFunctionView()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionView();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Class#getFunctionAdmin <em>Function Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Admin</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getFunctionAdmin()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_FunctionAdmin();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Class#getHasRelationClass <em>Has Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relation Class</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getHasRelationClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasRelationClass();

	/**
	 * Returns the meta object for the reference list '{@link Metawebdesign.metawebdesign.Class#getGoRelationClass <em>Go Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Go Relation Class</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getGoRelationClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_GoRelationClass();

	/**
	 * Returns the meta object for the containment reference '{@link Metawebdesign.metawebdesign.Class#getHasView <em>Has View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has View</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getHasView()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasView();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see Metawebdesign.metawebdesign.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Attributes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.Attributes#getName()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Name();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Attributes#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see Metawebdesign.metawebdesign.Attributes#getRol()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Rol();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Attributes#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Metawebdesign.metawebdesign.Attributes#getValue()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Value();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Attributes#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see Metawebdesign.metawebdesign.Attributes#isPrimaryKey()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Attributes#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see Metawebdesign.metawebdesign.Attributes#getDataType()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Attributes#getInTheForm <em>In The Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In The Form</em>'.
	 * @see Metawebdesign.metawebdesign.Attributes#getInTheForm()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_InTheForm();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived</em>'.
	 * @see Metawebdesign.metawebdesign.Derived
	 * @generated
	 */
	EClass getDerived();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Derived#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Metawebdesign.metawebdesign.Derived#getComment()
	 * @see #getDerived()
	 * @generated
	 */
	EAttribute getDerived_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Derived#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see Metawebdesign.metawebdesign.Derived#getFormula()
	 * @see #getDerived()
	 * @generated
	 */
	EAttribute getDerived_Formula();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.NotDerived <em>Not Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Derived</em>'.
	 * @see Metawebdesign.metawebdesign.NotDerived
	 * @generated
	 */
	EClass getNotDerived();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.NotDerived#getValueDefault <em>Value Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Default</em>'.
	 * @see Metawebdesign.metawebdesign.NotDerived#getValueDefault()
	 * @see #getNotDerived()
	 * @generated
	 */
	EAttribute getNotDerived_ValueDefault();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.RelationClass <em>Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Class</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass
	 * @generated
	 */
	EClass getRelationClass();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getName()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationClass#getTypePresentation <em>Type Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Presentation</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getTypePresentation()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_TypePresentation();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationClass#getPositionHorizotal <em>Position Horizotal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Horizotal</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getPositionHorizotal()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_PositionHorizotal();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationClass#getPositionVertical <em>Position Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Vertical</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getPositionVertical()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_PositionVertical();

	/**
	 * Returns the meta object for the reference list '{@link Metawebdesign.metawebdesign.RelationClass#getFromClass <em>From Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Class</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getFromClass()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_FromClass();

	/**
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.RelationClass#getAttributeGet <em>Attribute Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Get</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getAttributeGet()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_AttributeGet();

	/**
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.RelationClass#getAttributeReplace <em>Attribute Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Replace</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getAttributeReplace()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_AttributeReplace();

	/**
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.RelationClass#getAttributeSave <em>Attribute Save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Save</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getAttributeSave()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_AttributeSave();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see Metawebdesign.metawebdesign.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Menu#getHasGroup <em>Has Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Group</em>'.
	 * @see Metawebdesign.metawebdesign.Menu#getHasGroup()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_HasGroup();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Menu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.Menu#getName()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Name();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Menu#getOrientated <em>Orientated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientated</em>'.
	 * @see Metawebdesign.metawebdesign.Menu#getOrientated()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Orientated();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see Metawebdesign.metawebdesign.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Group#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see Metawebdesign.metawebdesign.Group#getOrder()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Order();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Views</em>'.
	 * @see Metawebdesign.metawebdesign.Views
	 * @generated
	 */
	EClass getViews();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Views#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Metawebdesign.metawebdesign.Views#getTitle()
	 * @see #getViews()
	 * @generated
	 */
	EAttribute getViews_Title();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Views#getRolView <em>Rol View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol View</em>'.
	 * @see Metawebdesign.metawebdesign.Views#getRolView()
	 * @see #getViews()
	 * @generated
	 */
	EAttribute getViews_RolView();

	/**
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.Views#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Name</em>'.
	 * @see Metawebdesign.metawebdesign.Views#getGroupName()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_GroupName();

	/**
	 * Returns the meta object for the containment reference '{@link Metawebdesign.metawebdesign.Views#getHasRelationView <em>Has Relation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Relation View</em>'.
	 * @see Metawebdesign.metawebdesign.Views#getHasRelationView()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_HasRelationView();

	/**
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.Views#getFromRelation <em>From Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Relation</em>'.
	 * @see Metawebdesign.metawebdesign.Views#getFromRelation()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_FromRelation();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see Metawebdesign.metawebdesign.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Form#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see Metawebdesign.metawebdesign.Form#getService()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Service();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see Metawebdesign.metawebdesign.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Page#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see Metawebdesign.metawebdesign.Page#getContent()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Content();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.RelationView <em>Relation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation View</em>'.
	 * @see Metawebdesign.metawebdesign.RelationView
	 * @generated
	 */
	EClass getRelationView();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.RelationView#getName()
	 * @see #getRelationView()
	 * @generated
	 */
	EAttribute getRelationView_Name();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationView#getTypePresentation <em>Type Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Presentation</em>'.
	 * @see Metawebdesign.metawebdesign.RelationView#getTypePresentation()
	 * @see #getRelationView()
	 * @generated
	 */
	EAttribute getRelationView_TypePresentation();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationView#getPositionHorizontal <em>Position Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Horizontal</em>'.
	 * @see Metawebdesign.metawebdesign.RelationView#getPositionHorizontal()
	 * @see #getRelationView()
	 * @generated
	 */
	EAttribute getRelationView_PositionHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationView#getPositionVertical <em>Position Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Vertical</em>'.
	 * @see Metawebdesign.metawebdesign.RelationView#getPositionVertical()
	 * @see #getRelationView()
	 * @generated
	 */
	EAttribute getRelationView_PositionVertical();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.RelationView#getRViewsHasClass <em>RViews Has Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RViews Has Class</em>'.
	 * @see Metawebdesign.metawebdesign.RelationView#getRViewsHasClass()
	 * @see #getRelationView()
	 * @generated
	 */
	EReference getRelationView_RViewsHasClass();

	/**
	 * Returns the meta object for the reference list '{@link Metawebdesign.metawebdesign.RelationView#getRviewsGoToClass <em>Rviews Go To Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rviews Go To Class</em>'.
	 * @see Metawebdesign.metawebdesign.RelationView#getRviewsGoToClass()
	 * @see #getRelationView()
	 * @generated
	 */
	EReference getRelationView_RviewsGoToClass();

	/**
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.RelationView#getGetAttribute <em>Get Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Attribute</em>'.
	 * @see Metawebdesign.metawebdesign.RelationView#getGetAttribute()
	 * @see #getRelationView()
	 * @generated
	 */
	EReference getRelationView_GetAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationView#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see Metawebdesign.metawebdesign.RelationView#getRow()
	 * @see #getRelationView()
	 * @generated
	 */
	EAttribute getRelationView_Row();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.TypeRol <em>Type Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Rol</em>'.
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @generated
	 */
	EEnum getTypeRol();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.TypeAttributeForm <em>Type Attribute Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Attribute Form</em>'.
	 * @see Metawebdesign.metawebdesign.TypeAttributeForm
	 * @generated
	 */
	EEnum getTypeAttributeForm();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.TypeData <em>Type Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Data</em>'.
	 * @see Metawebdesign.metawebdesign.TypeData
	 * @generated
	 */
	EEnum getTypeData();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.typePresentation <em>type Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Presentation</em>'.
	 * @see Metawebdesign.metawebdesign.typePresentation
	 * @generated
	 */
	EEnum gettypePresentation();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.typeHorizontalPosition <em>type Horizontal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Horizontal Position</em>'.
	 * @see Metawebdesign.metawebdesign.typeHorizontalPosition
	 * @generated
	 */
	EEnum gettypeHorizontalPosition();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.TypeService <em>Type Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Service</em>'.
	 * @see Metawebdesign.metawebdesign.TypeService
	 * @generated
	 */
	EEnum getTypeService();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.TypeOrientation <em>Type Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Orientation</em>'.
	 * @see Metawebdesign.metawebdesign.TypeOrientation
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
	MetawebdesignFactory getMetawebdesignFactory();

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
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.RootImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getRoot()
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
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.ClassImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getClass_()
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
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.AttributesImpl <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.AttributesImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getAttributes()
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
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.DerivedImpl <em>Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.DerivedImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getDerived()
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
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.NotDerivedImpl <em>Not Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.NotDerivedImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getNotDerived()
		 * @generated
		 */
		EClass NOT_DERIVED = eINSTANCE.getNotDerived();

		/**
		 * The meta object literal for the '<em><b>Value Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT_DERIVED__VALUE_DEFAULT = eINSTANCE.getNotDerived_ValueDefault();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.RelationClassImpl <em>Relation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.RelationClassImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getRelationClass()
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
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.MenuImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getMenu()
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
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.GroupImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getGroup()
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
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.ViewsImpl <em>Views</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.ViewsImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getViews()
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
		 * The meta object literal for the '<em><b>Group Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__GROUP_NAME = eINSTANCE.getViews_GroupName();

		/**
		 * The meta object literal for the '<em><b>Has Relation View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__HAS_RELATION_VIEW = eINSTANCE.getViews_HasRelationView();

		/**
		 * The meta object literal for the '<em><b>From Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__FROM_RELATION = eINSTANCE.getViews_FromRelation();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.FormImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SERVICE = eINSTANCE.getForm_Service();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.PageImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getPage()
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
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.RelationViewImpl <em>Relation View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.RelationViewImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getRelationView()
		 * @generated
		 */
		EClass RELATION_VIEW = eINSTANCE.getRelationView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_VIEW__NAME = eINSTANCE.getRelationView_Name();

		/**
		 * The meta object literal for the '<em><b>Type Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_VIEW__TYPE_PRESENTATION = eINSTANCE.getRelationView_TypePresentation();

		/**
		 * The meta object literal for the '<em><b>Position Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_VIEW__POSITION_HORIZONTAL = eINSTANCE.getRelationView_PositionHorizontal();

		/**
		 * The meta object literal for the '<em><b>Position Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_VIEW__POSITION_VERTICAL = eINSTANCE.getRelationView_PositionVertical();

		/**
		 * The meta object literal for the '<em><b>RViews Has Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_VIEW__RVIEWS_HAS_CLASS = eINSTANCE.getRelationView_RViewsHasClass();

		/**
		 * The meta object literal for the '<em><b>Rviews Go To Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_VIEW__RVIEWS_GO_TO_CLASS = eINSTANCE.getRelationView_RviewsGoToClass();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_VIEW__GET_ATTRIBUTE = eINSTANCE.getRelationView_GetAttribute();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_VIEW__ROW = eINSTANCE.getRelationView_Row();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.TypeRol <em>Type Rol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.TypeRol
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeRol()
		 * @generated
		 */
		EEnum TYPE_ROL = eINSTANCE.getTypeRol();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.TypeAttributeForm <em>Type Attribute Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.TypeAttributeForm
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeAttributeForm()
		 * @generated
		 */
		EEnum TYPE_ATTRIBUTE_FORM = eINSTANCE.getTypeAttributeForm();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.TypeData <em>Type Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.TypeData
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeData()
		 * @generated
		 */
		EEnum TYPE_DATA = eINSTANCE.getTypeData();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.typePresentation <em>type Presentation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.typePresentation
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypePresentation()
		 * @generated
		 */
		EEnum TYPE_PRESENTATION = eINSTANCE.gettypePresentation();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.typeHorizontalPosition <em>type Horizontal Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.typeHorizontalPosition
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypeHorizontalPosition()
		 * @generated
		 */
		EEnum TYPE_HORIZONTAL_POSITION = eINSTANCE.gettypeHorizontalPosition();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.TypeService <em>Type Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.TypeService
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeService()
		 * @generated
		 */
		EEnum TYPE_SERVICE = eINSTANCE.getTypeService();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.TypeOrientation <em>Type Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.TypeOrientation
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeOrientation()
		 * @generated
		 */
		EEnum TYPE_ORIENTATION = eINSTANCE.getTypeOrientation();

	}

} //MetawebdesignPackage
