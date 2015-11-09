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
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__VIEWS = 2;

	/**
	 * The feature id for the '<em><b>View component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__VIEW_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__LINK = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CONSTRAINT = 5;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Has Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_CONSTRAINT = 11;

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
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__PRIMARY_KEY = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>In The Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__IN_THE_FORM = 4;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>From Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__FROM_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Attribute Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__ATTRIBUTE_DESTINATION = 2;

	/**
	 * The feature id for the '<em><b>Cardinality origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__CARDINALITY_ORIGIN = 3;

	/**
	 * The feature id for the '<em><b>Cardinality Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__CARDINALITY_DESTINATION = 4;

	/**
	 * The number of structural features of the '<em>Relation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.ViewsImpl <em>Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.ViewsImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getViews()
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
	 * The feature id for the '<em><b>Rol View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__ROL_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Has View Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__HAS_VIEW_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.PageImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 7;

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
	 * The feature id for the '<em><b>Has View Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__HAS_VIEW_COMPONENT = VIEWS__HAS_VIEW_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTENT_HTML = VIEWS_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.ViewComponentImpl <em>View Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.ViewComponentImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getViewComponent()
	 * @generated
	 */
	int VIEW_COMPONENT = 8;

	/**
	 * The number of structural features of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.ViewAttributeImpl <em>View Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.ViewAttributeImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getViewAttribute()
	 * @generated
	 */
	int VIEW_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Get Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE__GET_ATTRIBUTE = VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE__TYPE_PRESENTATION = VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE__NAME = VIEW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE__POSITION_HORIZONTAL = VIEW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Postion Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE__POSTION_VERTICAL = VIEW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE__FROM = VIEW_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>View Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE_FEATURE_COUNT = VIEW_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>View Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE_OPERATION_COUNT = VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.NavegationMenuImpl <em>Navegation Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.NavegationMenuImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getNavegationMenu()
	 * @generated
	 */
	int NAVEGATION_MENU = 10;

	/**
	 * The feature id for the '<em><b>Has Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGATION_MENU__HAS_LINK = VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGATION_MENU__NAME = VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGATION_MENU__TYPE_MENU = VIEW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Navegation Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGATION_MENU_FEATURE_COUNT = VIEW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Navegation Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGATION_MENU_OPERATION_COUNT = VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.LinkImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.LinkViewCRUDImpl <em>Link View CRUD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.LinkViewCRUDImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getLinkViewCRUD()
	 * @generated
	 */
	int LINK_VIEW_CRUD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VIEW_CRUD__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VIEW_CRUD__SERVICE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VIEW_CRUD__FROM_CLASS = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link View CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VIEW_CRUD_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link View CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VIEW_CRUD_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.LinkViewImpl <em>Link View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.LinkViewImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getLinkView()
	 * @generated
	 */
	int LINK_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VIEW__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Link View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VIEW__LINK_VIEW = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VIEW_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_VIEW_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.impl.ConstraintImpl
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Mansaje Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__MANSAJE_ERROR = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeRol <em>Type Rol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeRol
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeRol()
	 * @generated
	 */
	int TYPE_ROL = 15;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeAttributeForm <em>Type Attribute Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeAttributeForm
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeAttributeForm()
	 * @generated
	 */
	int TYPE_ATTRIBUTE_FORM = 16;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeData <em>Type Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeData
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeData()
	 * @generated
	 */
	int TYPE_DATA = 17;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.typePresentation <em>type Presentation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.typePresentation
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypePresentation()
	 * @generated
	 */
	int TYPE_PRESENTATION = 18;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.typeHorizontalPosition <em>type Horizontal Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.typeHorizontalPosition
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypeHorizontalPosition()
	 * @generated
	 */
	int TYPE_HORIZONTAL_POSITION = 19;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeService <em>Type Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeService
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeService()
	 * @generated
	 */
	int TYPE_SERVICE = 20;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeOrientation <em>Type Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeOrientation
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeOrientation()
	 * @generated
	 */
	int TYPE_ORIENTATION = 21;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.TypeOperator <em>Type Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.TypeOperator
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeOperator()
	 * @generated
	 */
	int TYPE_OPERATOR = 22;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.typeViewAttribute <em>type View Attribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.typeViewAttribute
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypeViewAttribute()
	 * @generated
	 */
	int TYPE_VIEW_ATTRIBUTE = 23;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.typeCardinality <em>type Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypeCardinality()
	 * @generated
	 */
	int TYPE_CARDINALITY = 24;

	/**
	 * The meta object id for the '{@link Metawebdesign.metawebdesign.typeMenu <em>type Menu</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metawebdesign.metawebdesign.typeMenu
	 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypeMenu()
	 * @generated
	 */
	int TYPE_MENU = 25;


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
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Root#getView_component <em>View component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View component</em>'.
	 * @see Metawebdesign.metawebdesign.Root#getView_component()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_View_component();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Root#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see Metawebdesign.metawebdesign.Root#getLink()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Root#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see Metawebdesign.metawebdesign.Root#getConstraint()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Constraint();

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
	 * Returns the meta object for the containment reference '{@link Metawebdesign.metawebdesign.Class#getHasConstraint <em>Has Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Constraint</em>'.
	 * @see Metawebdesign.metawebdesign.Class#getHasConstraint()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasConstraint();

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
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.RelationClass#getAttribute_Destination <em>Attribute Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Destination</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getAttribute_Destination()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_Attribute_Destination();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_origin <em>Cardinality origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality origin</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getCardinality_origin()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_Cardinality_origin();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.RelationClass#getCardinality_Destination <em>Cardinality Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Destination</em>'.
	 * @see Metawebdesign.metawebdesign.RelationClass#getCardinality_Destination()
	 * @see #getRelationClass()
	 * @generated
	 */
	EAttribute getRelationClass_Cardinality_Destination();

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
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.Views#getHasViewComponent <em>Has View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has View Component</em>'.
	 * @see Metawebdesign.metawebdesign.Views#getHasViewComponent()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_HasViewComponent();

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
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Page#getContent_HTML <em>Content HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content HTML</em>'.
	 * @see Metawebdesign.metawebdesign.Page#getContent_HTML()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Content_HTML();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.ViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Component</em>'.
	 * @see Metawebdesign.metawebdesign.ViewComponent
	 * @generated
	 */
	EClass getViewComponent();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.ViewAttribute <em>View Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Attribute</em>'.
	 * @see Metawebdesign.metawebdesign.ViewAttribute
	 * @generated
	 */
	EClass getViewAttribute();

	/**
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.ViewAttribute#getGetAttribute <em>Get Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get Attribute</em>'.
	 * @see Metawebdesign.metawebdesign.ViewAttribute#getGetAttribute()
	 * @see #getViewAttribute()
	 * @generated
	 */
	EReference getViewAttribute_GetAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.ViewAttribute#getTypePresentation <em>Type Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Presentation</em>'.
	 * @see Metawebdesign.metawebdesign.ViewAttribute#getTypePresentation()
	 * @see #getViewAttribute()
	 * @generated
	 */
	EAttribute getViewAttribute_TypePresentation();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.ViewAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.ViewAttribute#getName()
	 * @see #getViewAttribute()
	 * @generated
	 */
	EAttribute getViewAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.ViewAttribute#getPositionHorizontal <em>Position Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Horizontal</em>'.
	 * @see Metawebdesign.metawebdesign.ViewAttribute#getPositionHorizontal()
	 * @see #getViewAttribute()
	 * @generated
	 */
	EAttribute getViewAttribute_PositionHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.ViewAttribute#getPostionVertical <em>Postion Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postion Vertical</em>'.
	 * @see Metawebdesign.metawebdesign.ViewAttribute#getPostionVertical()
	 * @see #getViewAttribute()
	 * @generated
	 */
	EAttribute getViewAttribute_PostionVertical();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.ViewAttribute#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see Metawebdesign.metawebdesign.ViewAttribute#getFrom()
	 * @see #getViewAttribute()
	 * @generated
	 */
	EAttribute getViewAttribute_From();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.NavegationMenu <em>Navegation Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navegation Menu</em>'.
	 * @see Metawebdesign.metawebdesign.NavegationMenu
	 * @generated
	 */
	EClass getNavegationMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link Metawebdesign.metawebdesign.NavegationMenu#getHasLink <em>Has Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Link</em>'.
	 * @see Metawebdesign.metawebdesign.NavegationMenu#getHasLink()
	 * @see #getNavegationMenu()
	 * @generated
	 */
	EReference getNavegationMenu_HasLink();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.NavegationMenu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.NavegationMenu#getName()
	 * @see #getNavegationMenu()
	 * @generated
	 */
	EAttribute getNavegationMenu_Name();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.NavegationMenu#getTypeMenu <em>Type Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Menu</em>'.
	 * @see Metawebdesign.metawebdesign.NavegationMenu#getTypeMenu()
	 * @see #getNavegationMenu()
	 * @generated
	 */
	EAttribute getNavegationMenu_TypeMenu();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see Metawebdesign.metawebdesign.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.LinkViewCRUD <em>Link View CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link View CRUD</em>'.
	 * @see Metawebdesign.metawebdesign.LinkViewCRUD
	 * @generated
	 */
	EClass getLinkViewCRUD();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.LinkViewCRUD#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see Metawebdesign.metawebdesign.LinkViewCRUD#getService()
	 * @see #getLinkViewCRUD()
	 * @generated
	 */
	EAttribute getLinkViewCRUD_Service();

	/**
	 * Returns the meta object for the reference list '{@link Metawebdesign.metawebdesign.LinkViewCRUD#getFromClass <em>From Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Class</em>'.
	 * @see Metawebdesign.metawebdesign.LinkViewCRUD#getFromClass()
	 * @see #getLinkViewCRUD()
	 * @generated
	 */
	EReference getLinkViewCRUD_FromClass();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.LinkView <em>Link View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link View</em>'.
	 * @see Metawebdesign.metawebdesign.LinkView
	 * @generated
	 */
	EClass getLinkView();

	/**
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.LinkView#getLinkView <em>Link View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link View</em>'.
	 * @see Metawebdesign.metawebdesign.LinkView#getLinkView()
	 * @see #getLinkView()
	 * @generated
	 */
	EReference getLinkView_LinkView();

	/**
	 * Returns the meta object for class '{@link Metawebdesign.metawebdesign.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see Metawebdesign.metawebdesign.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Constraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Metawebdesign.metawebdesign.Constraint#getOperator()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Operator();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Constraint#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see Metawebdesign.metawebdesign.Constraint#getService()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Service();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metawebdesign.metawebdesign.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the reference '{@link Metawebdesign.metawebdesign.Constraint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see Metawebdesign.metawebdesign.Constraint#getAttribute()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Constraint#getMansajeError <em>Mansaje Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mansaje Error</em>'.
	 * @see Metawebdesign.metawebdesign.Constraint#getMansajeError()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_MansajeError();

	/**
	 * Returns the meta object for the attribute '{@link Metawebdesign.metawebdesign.Constraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Metawebdesign.metawebdesign.Constraint#getValue()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Value();

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
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.TypeOperator <em>Type Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Operator</em>'.
	 * @see Metawebdesign.metawebdesign.TypeOperator
	 * @generated
	 */
	EEnum getTypeOperator();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.typeViewAttribute <em>type View Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type View Attribute</em>'.
	 * @see Metawebdesign.metawebdesign.typeViewAttribute
	 * @generated
	 */
	EEnum gettypeViewAttribute();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.typeCardinality <em>type Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Cardinality</em>'.
	 * @see Metawebdesign.metawebdesign.typeCardinality
	 * @generated
	 */
	EEnum gettypeCardinality();

	/**
	 * Returns the meta object for enum '{@link Metawebdesign.metawebdesign.typeMenu <em>type Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Menu</em>'.
	 * @see Metawebdesign.metawebdesign.typeMenu
	 * @generated
	 */
	EEnum gettypeMenu();

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
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__VIEWS = eINSTANCE.getRoot_Views();

		/**
		 * The meta object literal for the '<em><b>View component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__VIEW_COMPONENT = eINSTANCE.getRoot_View_component();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__LINK = eINSTANCE.getRoot_Link();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CONSTRAINT = eINSTANCE.getRoot_Constraint();

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
		 * The meta object literal for the '<em><b>Has Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_CONSTRAINT = eINSTANCE.getClass_HasConstraint();

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
		 * The meta object literal for the '<em><b>From Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__FROM_CLASS = eINSTANCE.getRelationClass_FromClass();

		/**
		 * The meta object literal for the '<em><b>Attribute Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__ATTRIBUTE_DESTINATION = eINSTANCE.getRelationClass_Attribute_Destination();

		/**
		 * The meta object literal for the '<em><b>Cardinality origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CLASS__CARDINALITY_ORIGIN = eINSTANCE.getRelationClass_Cardinality_origin();

		/**
		 * The meta object literal for the '<em><b>Cardinality Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CLASS__CARDINALITY_DESTINATION = eINSTANCE.getRelationClass_Cardinality_Destination();

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
		 * The meta object literal for the '<em><b>Has View Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__HAS_VIEW_COMPONENT = eINSTANCE.getViews_HasViewComponent();

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
		 * The meta object literal for the '<em><b>Content HTML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__CONTENT_HTML = eINSTANCE.getPage_Content_HTML();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.ViewComponentImpl <em>View Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.ViewComponentImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getViewComponent()
		 * @generated
		 */
		EClass VIEW_COMPONENT = eINSTANCE.getViewComponent();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.ViewAttributeImpl <em>View Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.ViewAttributeImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getViewAttribute()
		 * @generated
		 */
		EClass VIEW_ATTRIBUTE = eINSTANCE.getViewAttribute();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ATTRIBUTE__GET_ATTRIBUTE = eINSTANCE.getViewAttribute_GetAttribute();

		/**
		 * The meta object literal for the '<em><b>Type Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ATTRIBUTE__TYPE_PRESENTATION = eINSTANCE.getViewAttribute_TypePresentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ATTRIBUTE__NAME = eINSTANCE.getViewAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Position Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ATTRIBUTE__POSITION_HORIZONTAL = eINSTANCE.getViewAttribute_PositionHorizontal();

		/**
		 * The meta object literal for the '<em><b>Postion Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ATTRIBUTE__POSTION_VERTICAL = eINSTANCE.getViewAttribute_PostionVertical();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ATTRIBUTE__FROM = eINSTANCE.getViewAttribute_From();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.NavegationMenuImpl <em>Navegation Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.NavegationMenuImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getNavegationMenu()
		 * @generated
		 */
		EClass NAVEGATION_MENU = eINSTANCE.getNavegationMenu();

		/**
		 * The meta object literal for the '<em><b>Has Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVEGATION_MENU__HAS_LINK = eINSTANCE.getNavegationMenu_HasLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVEGATION_MENU__NAME = eINSTANCE.getNavegationMenu_Name();

		/**
		 * The meta object literal for the '<em><b>Type Menu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVEGATION_MENU__TYPE_MENU = eINSTANCE.getNavegationMenu_TypeMenu();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.LinkImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.LinkViewCRUDImpl <em>Link View CRUD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.LinkViewCRUDImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getLinkViewCRUD()
		 * @generated
		 */
		EClass LINK_VIEW_CRUD = eINSTANCE.getLinkViewCRUD();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_VIEW_CRUD__SERVICE = eINSTANCE.getLinkViewCRUD_Service();

		/**
		 * The meta object literal for the '<em><b>From Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VIEW_CRUD__FROM_CLASS = eINSTANCE.getLinkViewCRUD_FromClass();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.LinkViewImpl <em>Link View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.LinkViewImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getLinkView()
		 * @generated
		 */
		EClass LINK_VIEW = eINSTANCE.getLinkView();

		/**
		 * The meta object literal for the '<em><b>Link View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_VIEW__LINK_VIEW = eINSTANCE.getLinkView_LinkView();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.impl.ConstraintImpl
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__OPERATOR = eINSTANCE.getConstraint_Operator();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__SERVICE = eINSTANCE.getConstraint_Service();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__ATTRIBUTE = eINSTANCE.getConstraint_Attribute();

		/**
		 * The meta object literal for the '<em><b>Mansaje Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__MANSAJE_ERROR = eINSTANCE.getConstraint_MansajeError();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__VALUE = eINSTANCE.getConstraint_Value();

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

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.TypeOperator <em>Type Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.TypeOperator
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#getTypeOperator()
		 * @generated
		 */
		EEnum TYPE_OPERATOR = eINSTANCE.getTypeOperator();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.typeViewAttribute <em>type View Attribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.typeViewAttribute
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypeViewAttribute()
		 * @generated
		 */
		EEnum TYPE_VIEW_ATTRIBUTE = eINSTANCE.gettypeViewAttribute();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.typeCardinality <em>type Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.typeCardinality
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypeCardinality()
		 * @generated
		 */
		EEnum TYPE_CARDINALITY = eINSTANCE.gettypeCardinality();

		/**
		 * The meta object literal for the '{@link Metawebdesign.metawebdesign.typeMenu <em>type Menu</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metawebdesign.metawebdesign.typeMenu
		 * @see Metawebdesign.metawebdesign.impl.MetawebdesignPackageImpl#gettypeMenu()
		 * @generated
		 */
		EEnum TYPE_MENU = eINSTANCE.gettypeMenu();

	}

} //MetawebdesignPackage
