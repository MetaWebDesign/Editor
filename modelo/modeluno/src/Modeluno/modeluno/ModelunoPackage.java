/**
 */
package Modeluno.modeluno;

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
 * @see Modeluno.modeluno.ModelunoFactory
 * @model kind="package"
 * @generated
 */
public interface ModelunoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modeluno";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modeluno/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modeluno";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelunoPackage eINSTANCE = Modeluno.modeluno.impl.ModelunoPackageImpl.init();

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.MapImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 0;

	/**
	 * The feature id for the '<em><b>Root has Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ROOT_HAS_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Root has Atributte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ROOT_HAS_ATRIBUTTE = 1;

	/**
	 * The feature id for the '<em><b>Root Has Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ROOT_HAS_VIEWS = 2;

	/**
	 * The feature id for the '<em><b>Roothas Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ROOTHAS_SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ClassImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 1;

	/**
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_RELATION = 0;

	/**
	 * The feature id for the '<em><b>Go Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GO_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CNAME = 2;

	/**
	 * The feature id for the '<em><b>Id Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Go Atributte Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GO_ATRIBUTTE_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Has Atribute Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_ATRIBUTE_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Has Service Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_SERVICE_RELATION = 6;

	/**
	 * The feature id for the '<em><b>Go Service Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GO_SERVICE_RELATION = 7;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.RelationClassImpl <em>Relation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.RelationClassImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelationClass()
	 * @generated
	 */
	int RELATION_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Go Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__GO_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Relation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.AttributeImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PRIMARY_KEY = 0;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANAME = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ROL = 3;

	/**
	 * The feature id for the '<em><b>In The Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IN_THE_FORM = 4;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALOR = 5;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.RelationAttributeImpl <em>Relation Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.RelationAttributeImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelationAttribute()
	 * @generated
	 */
	int RELATION_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Go Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ATTRIBUTE__GO_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Rhas Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ATTRIBUTE__RHAS_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Relation Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.Attribute_Not_DerivedImpl <em>Attribute Not Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.Attribute_Not_DerivedImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAttribute_Not_Derived()
	 * @generated
	 */
	int ATTRIBUTE_NOT_DERIVED = 5;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED__PRIMARY_KEY = ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED__ANAME = ATTRIBUTE__ANAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED__DATA_TYPE = ATTRIBUTE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED__ROL = ATTRIBUTE__ROL;

	/**
	 * The feature id for the '<em><b>In The Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED__IN_THE_FORM = ATTRIBUTE__IN_THE_FORM;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED__VALOR = ATTRIBUTE__VALOR;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED__DEFAULT_VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Not Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Not Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.Attribute_DerivedImpl <em>Attribute Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.Attribute_DerivedImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAttribute_Derived()
	 * @generated
	 */
	int ATTRIBUTE_DERIVED = 6;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__PRIMARY_KEY = ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__ANAME = ATTRIBUTE__ANAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__DATA_TYPE = ATTRIBUTE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__ROL = ATTRIBUTE__ROL;

	/**
	 * The feature id for the '<em><b>In The Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__IN_THE_FORM = ATTRIBUTE__IN_THE_FORM;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__VALOR = ATTRIBUTE__VALOR;

	/**
	 * The feature id for the '<em><b>Derivation Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__DERIVATION_COMMENTS = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__FORMULA = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ServiceImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ROL = 0;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__HAS_RELATION_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Go To Relation View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__GO_TO_RELATION_VIEW = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.RelationServiceImpl <em>Relation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.RelationServiceImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelationService()
	 * @generated
	 */
	int RELATION_SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Rhas Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SERVICE__RHAS_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Go Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SERVICE__GO_SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Relation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.CreateImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 9;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ROL = SERVICE__ROL;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__HAS_RELATION_VIEW = SERVICE__HAS_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Go To Relation View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__GO_TO_RELATION_VIEW = SERVICE__GO_TO_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__NAME = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has View Form Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__HAS_VIEW_FORM_INPUT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.DeleteImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 10;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__ROL = SERVICE__ROL;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__HAS_RELATION_VIEW = SERVICE__HAS_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Go To Relation View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__GO_TO_RELATION_VIEW = SERVICE__GO_TO_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NAME = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.UpdateObjectImpl <em>Update Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.UpdateObjectImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getUpdateObject()
	 * @generated
	 */
	int UPDATE_OBJECT = 11;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECT__ROL = SERVICE__ROL;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECT__HAS_RELATION_VIEW = SERVICE__HAS_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Go To Relation View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECT__GO_TO_RELATION_VIEW = SERVICE__GO_TO_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECT__NAME = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has View Update Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECT__HAS_VIEW_UPDATE_OBJECT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECT_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OBJECT_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.UpdateAttributeImpl <em>Update Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.UpdateAttributeImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getUpdateAttribute()
	 * @generated
	 */
	int UPDATE_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__ROL = SERVICE__ROL;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__HAS_RELATION_VIEW = SERVICE__HAS_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Go To Relation View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__GO_TO_RELATION_VIEW = SERVICE__GO_TO_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__NAME = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has View Update Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ListViewImpl <em>List View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ListViewImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getListView()
	 * @generated
	 */
	int LIST_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__ROL = SERVICE__ROL;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__HAS_RELATION_VIEW = SERVICE__HAS_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Go To Relation View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__GO_TO_RELATION_VIEW = SERVICE__GO_TO_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__NAME = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has View Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__HAS_VIEW_INDEX = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ViewImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 14;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ROL = SERVICE__ROL;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HAS_RELATION_VIEW = SERVICE__HAS_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Go To Relation View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__GO_TO_RELATION_VIEW = SERVICE__GO_TO_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has View Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__HAS_VIEW_ATTRIBUTE = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.AdminImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 15;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ROL = SERVICE__ROL;

	/**
	 * The feature id for the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__HAS_RELATION_VIEW = SERVICE__HAS_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Go To Relation View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__GO_TO_RELATION_VIEW = SERVICE__GO_TO_RELATION_VIEW;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__NAME = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has View Admin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__HAS_VIEW_ADMIN = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ViewsImpl <em>Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ViewsImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViews()
	 * @generated
	 */
	int VIEWS = 16;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__GROUP = 1;

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
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ViewInputImpl <em>View Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ViewInputImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewInput()
	 * @generated
	 */
	int VIEW_INPUT = 17;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INPUT__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INPUT__GROUP = VIEWS__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INPUT__NAME = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INPUT_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INPUT_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ViewUpdateObjectImpl <em>View Update Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ViewUpdateObjectImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewUpdateObject()
	 * @generated
	 */
	int VIEW_UPDATE_OBJECT = 18;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_OBJECT__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_OBJECT__GROUP = VIEWS__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_OBJECT__NAME = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Update Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_OBJECT_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Update Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_OBJECT_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ViewUpdateAttributeImpl <em>View Update Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ViewUpdateAttributeImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewUpdateAttribute()
	 * @generated
	 */
	int VIEW_UPDATE_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_ATTRIBUTE__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_ATTRIBUTE__GROUP = VIEWS__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_ATTRIBUTE__NAME = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_ATTRIBUTE_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_UPDATE_ATTRIBUTE_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ViewIndexImpl <em>View Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ViewIndexImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewIndex()
	 * @generated
	 */
	int VIEW_INDEX = 20;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INDEX__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INDEX__GROUP = VIEWS__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_INDEX__NAME = VIEWS_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ViewAttributeImpl <em>View Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ViewAttributeImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewAttribute()
	 * @generated
	 */
	int VIEW_ATTRIBUTE = 21;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE__GROUP = VIEWS__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE__NAME = VIEWS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE_FEATURE_COUNT = VIEWS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ATTRIBUTE_OPERATION_COUNT = VIEWS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.ViewAdminImpl <em>View Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.ViewAdminImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewAdmin()
	 * @generated
	 */
	int VIEW_ADMIN = 22;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ADMIN__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ADMIN__GROUP = VIEWS__GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ADMIN__NAME = VIEWS_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link Modeluno.modeluno.impl.RelationViewImpl <em>Relation View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.RelationViewImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelationView()
	 * @generated
	 */
	int RELATION_VIEW = 23;

	/**
	 * The feature id for the '<em><b>Rhas View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__RHAS_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Go To View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW__GO_TO_VIEW = 1;

	/**
	 * The number of structural features of the '<em>Relation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.PageImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 24;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = VIEWS__TITLE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GROUP = VIEWS__GROUP;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ROL = VIEWS_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link Modeluno.modeluno.Rol <em>Rol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.Rol
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 25;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.TypeAttributeForm <em>Type Attribute Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.TypeAttributeForm
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getTypeAttributeForm()
	 * @generated
	 */
	int TYPE_ATTRIBUTE_FORM = 26;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.dataTypes <em>data Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.dataTypes
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getdataTypes()
	 * @generated
	 */
	int DATA_TYPES = 27;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.TypesView <em>Types View</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.TypesView
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getTypesView()
	 * @generated
	 */
	int TYPES_VIEW = 28;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.typeHorizotalPosition <em>type Horizotal Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.typeHorizotalPosition
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#gettypeHorizotalPosition()
	 * @generated
	 */
	int TYPE_HORIZOTAL_POSITION = 29;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.TypesAlert <em>Types Alert</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.TypesAlert
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getTypesAlert()
	 * @generated
	 */
	int TYPES_ALERT = 30;


	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see Modeluno.modeluno.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Map#getRoot_hasClass <em>Root has Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root has Class</em>'.
	 * @see Modeluno.modeluno.Map#getRoot_hasClass()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Root_hasClass();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Map#getRoot_hasAtributte <em>Root has Atributte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root has Atributte</em>'.
	 * @see Modeluno.modeluno.Map#getRoot_hasAtributte()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Root_hasAtributte();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Map#getRootHasViews <em>Root Has Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Has Views</em>'.
	 * @see Modeluno.modeluno.Map#getRootHasViews()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_RootHasViews();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Map#getRoothasService <em>Roothas Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roothas Service</em>'.
	 * @see Modeluno.modeluno.Map#getRoothasService()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_RoothasService();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Modeluno.modeluno.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Class#getHasRelation <em>Has Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relation</em>'.
	 * @see Modeluno.modeluno.Class#getHasRelation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasRelation();

	/**
	 * Returns the meta object for the reference list '{@link Modeluno.modeluno.Class#getGoRelation <em>Go Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Go Relation</em>'.
	 * @see Modeluno.modeluno.Class#getGoRelation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_GoRelation();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Class#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see Modeluno.modeluno.Class#getCname()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Cname();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Class#getIdFunction <em>Id Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Function</em>'.
	 * @see Modeluno.modeluno.Class#getIdFunction()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IdFunction();

	/**
	 * Returns the meta object for the reference '{@link Modeluno.modeluno.Class#getGoAtributteRelation <em>Go Atributte Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go Atributte Relation</em>'.
	 * @see Modeluno.modeluno.Class#getGoAtributteRelation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_GoAtributteRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Class#getHasAtributeRelation <em>Has Atribute Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Atribute Relation</em>'.
	 * @see Modeluno.modeluno.Class#getHasAtributeRelation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasAtributeRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Class#getHasServiceRelation <em>Has Service Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Service Relation</em>'.
	 * @see Modeluno.modeluno.Class#getHasServiceRelation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasServiceRelation();

	/**
	 * Returns the meta object for the reference list '{@link Modeluno.modeluno.Class#getGoServiceRelation <em>Go Service Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Go Service Relation</em>'.
	 * @see Modeluno.modeluno.Class#getGoServiceRelation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_GoServiceRelation();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.RelationClass <em>Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Class</em>'.
	 * @see Modeluno.modeluno.RelationClass
	 * @generated
	 */
	EClass getRelationClass();

	/**
	 * Returns the meta object for the reference list '{@link Modeluno.modeluno.RelationClass#getGoClass <em>Go Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Go Class</em>'.
	 * @see Modeluno.modeluno.RelationClass#getGoClass()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_GoClass();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see Modeluno.modeluno.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see Modeluno.modeluno.Attribute#isPrimaryKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute#getAname <em>Aname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aname</em>'.
	 * @see Modeluno.modeluno.Attribute#getAname()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Aname();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see Modeluno.modeluno.Attribute#getDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see Modeluno.modeluno.Attribute#getRol()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Rol();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute#getInTheForm <em>In The Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In The Form</em>'.
	 * @see Modeluno.modeluno.Attribute#getInTheForm()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_InTheForm();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Modeluno.modeluno.Attribute#getValor()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Valor();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.RelationAttribute <em>Relation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Attribute</em>'.
	 * @see Modeluno.modeluno.RelationAttribute
	 * @generated
	 */
	EClass getRelationAttribute();

	/**
	 * Returns the meta object for the reference '{@link Modeluno.modeluno.RelationAttribute#getGoAttribute <em>Go Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go Attribute</em>'.
	 * @see Modeluno.modeluno.RelationAttribute#getGoAttribute()
	 * @see #getRelationAttribute()
	 * @generated
	 */
	EReference getRelationAttribute_GoAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.RelationAttribute#getRhasAttribute <em>Rhas Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhas Attribute</em>'.
	 * @see Modeluno.modeluno.RelationAttribute#getRhasAttribute()
	 * @see #getRelationAttribute()
	 * @generated
	 */
	EReference getRelationAttribute_RhasAttribute();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Attribute_Not_Derived <em>Attribute Not Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Not Derived</em>'.
	 * @see Modeluno.modeluno.Attribute_Not_Derived
	 * @generated
	 */
	EClass getAttribute_Not_Derived();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute_Not_Derived#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Modeluno.modeluno.Attribute_Not_Derived#getDefaultValue()
	 * @see #getAttribute_Not_Derived()
	 * @generated
	 */
	EAttribute getAttribute_Not_Derived_DefaultValue();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Attribute_Derived <em>Attribute Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Derived</em>'.
	 * @see Modeluno.modeluno.Attribute_Derived
	 * @generated
	 */
	EClass getAttribute_Derived();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute_Derived#getDerivationComments <em>Derivation Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivation Comments</em>'.
	 * @see Modeluno.modeluno.Attribute_Derived#getDerivationComments()
	 * @see #getAttribute_Derived()
	 * @generated
	 */
	EAttribute getAttribute_Derived_DerivationComments();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute_Derived#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see Modeluno.modeluno.Attribute_Derived#getFormula()
	 * @see #getAttribute_Derived()
	 * @generated
	 */
	EAttribute getAttribute_Derived_Formula();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see Modeluno.modeluno.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Service#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see Modeluno.modeluno.Service#getRol()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Rol();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.Service#getHasRelationView <em>Has Relation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Relation View</em>'.
	 * @see Modeluno.modeluno.Service#getHasRelationView()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_HasRelationView();

	/**
	 * Returns the meta object for the reference '{@link Modeluno.modeluno.Service#getGoToRelationView <em>Go To Relation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go To Relation View</em>'.
	 * @see Modeluno.modeluno.Service#getGoToRelationView()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_GoToRelationView();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.RelationService <em>Relation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Service</em>'.
	 * @see Modeluno.modeluno.RelationService
	 * @generated
	 */
	EClass getRelationService();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.RelationService#getRhasService <em>Rhas Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhas Service</em>'.
	 * @see Modeluno.modeluno.RelationService#getRhasService()
	 * @see #getRelationService()
	 * @generated
	 */
	EReference getRelationService_RhasService();

	/**
	 * Returns the meta object for the reference '{@link Modeluno.modeluno.RelationService#getGoService <em>Go Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go Service</em>'.
	 * @see Modeluno.modeluno.RelationService#getGoService()
	 * @see #getRelationService()
	 * @generated
	 */
	EReference getRelationService_GoService();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see Modeluno.modeluno.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Create#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.Create#getName()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.Create#getHasViewFormInput <em>Has View Form Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has View Form Input</em>'.
	 * @see Modeluno.modeluno.Create#getHasViewFormInput()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_HasViewFormInput();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see Modeluno.modeluno.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Delete#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.Delete#getName()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_Name();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.UpdateObject <em>Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Object</em>'.
	 * @see Modeluno.modeluno.UpdateObject
	 * @generated
	 */
	EClass getUpdateObject();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.UpdateObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.UpdateObject#getName()
	 * @see #getUpdateObject()
	 * @generated
	 */
	EAttribute getUpdateObject_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.UpdateObject#getHasViewUpdateObject <em>Has View Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has View Update Object</em>'.
	 * @see Modeluno.modeluno.UpdateObject#getHasViewUpdateObject()
	 * @see #getUpdateObject()
	 * @generated
	 */
	EReference getUpdateObject_HasViewUpdateObject();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.UpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Attribute</em>'.
	 * @see Modeluno.modeluno.UpdateAttribute
	 * @generated
	 */
	EClass getUpdateAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.UpdateAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.UpdateAttribute#getName()
	 * @see #getUpdateAttribute()
	 * @generated
	 */
	EAttribute getUpdateAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.UpdateAttribute#getHasViewUpdateObject <em>Has View Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has View Update Object</em>'.
	 * @see Modeluno.modeluno.UpdateAttribute#getHasViewUpdateObject()
	 * @see #getUpdateAttribute()
	 * @generated
	 */
	EReference getUpdateAttribute_HasViewUpdateObject();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.ListView <em>List View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List View</em>'.
	 * @see Modeluno.modeluno.ListView
	 * @generated
	 */
	EClass getListView();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.ListView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.ListView#getName()
	 * @see #getListView()
	 * @generated
	 */
	EAttribute getListView_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.ListView#getHasViewIndex <em>Has View Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has View Index</em>'.
	 * @see Modeluno.modeluno.ListView#getHasViewIndex()
	 * @see #getListView()
	 * @generated
	 */
	EReference getListView_HasViewIndex();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see Modeluno.modeluno.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.View#getHasViewAttribute <em>Has View Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has View Attribute</em>'.
	 * @see Modeluno.modeluno.View#getHasViewAttribute()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_HasViewAttribute();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see Modeluno.modeluno.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Admin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.Admin#getName()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.Admin#getHasViewAdmin <em>Has View Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has View Admin</em>'.
	 * @see Modeluno.modeluno.Admin#getHasViewAdmin()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_HasViewAdmin();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Views</em>'.
	 * @see Modeluno.modeluno.Views
	 * @generated
	 */
	EClass getViews();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Views#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Modeluno.modeluno.Views#getTitle()
	 * @see #getViews()
	 * @generated
	 */
	EAttribute getViews_Title();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Views#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see Modeluno.modeluno.Views#getGroup()
	 * @see #getViews()
	 * @generated
	 */
	EAttribute getViews_Group();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.ViewInput <em>View Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Input</em>'.
	 * @see Modeluno.modeluno.ViewInput
	 * @generated
	 */
	EClass getViewInput();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.ViewInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.ViewInput#getName()
	 * @see #getViewInput()
	 * @generated
	 */
	EAttribute getViewInput_Name();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.ViewUpdateObject <em>View Update Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Update Object</em>'.
	 * @see Modeluno.modeluno.ViewUpdateObject
	 * @generated
	 */
	EClass getViewUpdateObject();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.ViewUpdateObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.ViewUpdateObject#getName()
	 * @see #getViewUpdateObject()
	 * @generated
	 */
	EAttribute getViewUpdateObject_Name();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.ViewUpdateAttribute <em>View Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Update Attribute</em>'.
	 * @see Modeluno.modeluno.ViewUpdateAttribute
	 * @generated
	 */
	EClass getViewUpdateAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.ViewUpdateAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.ViewUpdateAttribute#getName()
	 * @see #getViewUpdateAttribute()
	 * @generated
	 */
	EAttribute getViewUpdateAttribute_Name();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.ViewIndex <em>View Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Index</em>'.
	 * @see Modeluno.modeluno.ViewIndex
	 * @generated
	 */
	EClass getViewIndex();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.ViewIndex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.ViewIndex#getName()
	 * @see #getViewIndex()
	 * @generated
	 */
	EAttribute getViewIndex_Name();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.ViewAttribute <em>View Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Attribute</em>'.
	 * @see Modeluno.modeluno.ViewAttribute
	 * @generated
	 */
	EClass getViewAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.ViewAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.ViewAttribute#getName()
	 * @see #getViewAttribute()
	 * @generated
	 */
	EAttribute getViewAttribute_Name();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.ViewAdmin <em>View Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Admin</em>'.
	 * @see Modeluno.modeluno.ViewAdmin
	 * @generated
	 */
	EClass getViewAdmin();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.ViewAdmin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modeluno.modeluno.ViewAdmin#getName()
	 * @see #getViewAdmin()
	 * @generated
	 */
	EAttribute getViewAdmin_Name();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.RelationView <em>Relation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation View</em>'.
	 * @see Modeluno.modeluno.RelationView
	 * @generated
	 */
	EClass getRelationView();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.RelationView#getRhasView <em>Rhas View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhas View</em>'.
	 * @see Modeluno.modeluno.RelationView#getRhasView()
	 * @see #getRelationView()
	 * @generated
	 */
	EReference getRelationView_RhasView();

	/**
	 * Returns the meta object for the reference '{@link Modeluno.modeluno.RelationView#getGoToView <em>Go To View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go To View</em>'.
	 * @see Modeluno.modeluno.RelationView#getGoToView()
	 * @see #getRelationView()
	 * @generated
	 */
	EReference getRelationView_GoToView();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see Modeluno.modeluno.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Page#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol</em>'.
	 * @see Modeluno.modeluno.Page#getRol()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Rol();

	/**
	 * Returns the meta object for enum '{@link Modeluno.modeluno.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rol</em>'.
	 * @see Modeluno.modeluno.Rol
	 * @generated
	 */
	EEnum getRol();

	/**
	 * Returns the meta object for enum '{@link Modeluno.modeluno.TypeAttributeForm <em>Type Attribute Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Attribute Form</em>'.
	 * @see Modeluno.modeluno.TypeAttributeForm
	 * @generated
	 */
	EEnum getTypeAttributeForm();

	/**
	 * Returns the meta object for enum '{@link Modeluno.modeluno.dataTypes <em>data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>data Types</em>'.
	 * @see Modeluno.modeluno.dataTypes
	 * @generated
	 */
	EEnum getdataTypes();

	/**
	 * Returns the meta object for enum '{@link Modeluno.modeluno.TypesView <em>Types View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Types View</em>'.
	 * @see Modeluno.modeluno.TypesView
	 * @generated
	 */
	EEnum getTypesView();

	/**
	 * Returns the meta object for enum '{@link Modeluno.modeluno.typeHorizotalPosition <em>type Horizotal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Horizotal Position</em>'.
	 * @see Modeluno.modeluno.typeHorizotalPosition
	 * @generated
	 */
	EEnum gettypeHorizotalPosition();

	/**
	 * Returns the meta object for enum '{@link Modeluno.modeluno.TypesAlert <em>Types Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Types Alert</em>'.
	 * @see Modeluno.modeluno.TypesAlert
	 * @generated
	 */
	EEnum getTypesAlert();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelunoFactory getModelunoFactory();

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
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.MapImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Root has Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ROOT_HAS_CLASS = eINSTANCE.getMap_Root_hasClass();

		/**
		 * The meta object literal for the '<em><b>Root has Atributte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ROOT_HAS_ATRIBUTTE = eINSTANCE.getMap_Root_hasAtributte();

		/**
		 * The meta object literal for the '<em><b>Root Has Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ROOT_HAS_VIEWS = eINSTANCE.getMap_RootHasViews();

		/**
		 * The meta object literal for the '<em><b>Roothas Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ROOTHAS_SERVICE = eINSTANCE.getMap_RoothasService();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ClassImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Has Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_RELATION = eINSTANCE.getClass_HasRelation();

		/**
		 * The meta object literal for the '<em><b>Go Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GO_RELATION = eINSTANCE.getClass_GoRelation();

		/**
		 * The meta object literal for the '<em><b>Cname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CNAME = eINSTANCE.getClass_Cname();

		/**
		 * The meta object literal for the '<em><b>Id Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ID_FUNCTION = eINSTANCE.getClass_IdFunction();

		/**
		 * The meta object literal for the '<em><b>Go Atributte Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GO_ATRIBUTTE_RELATION = eINSTANCE.getClass_GoAtributteRelation();

		/**
		 * The meta object literal for the '<em><b>Has Atribute Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_ATRIBUTE_RELATION = eINSTANCE.getClass_HasAtributeRelation();

		/**
		 * The meta object literal for the '<em><b>Has Service Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_SERVICE_RELATION = eINSTANCE.getClass_HasServiceRelation();

		/**
		 * The meta object literal for the '<em><b>Go Service Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GO_SERVICE_RELATION = eINSTANCE.getClass_GoServiceRelation();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.RelationClassImpl <em>Relation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.RelationClassImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelationClass()
		 * @generated
		 */
		EClass RELATION_CLASS = eINSTANCE.getRelationClass();

		/**
		 * The meta object literal for the '<em><b>Go Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__GO_CLASS = eINSTANCE.getRelationClass_GoClass();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.AttributeImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PRIMARY_KEY = eINSTANCE.getAttribute_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Aname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ANAME = eINSTANCE.getAttribute_Aname();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ROL = eINSTANCE.getAttribute_Rol();

		/**
		 * The meta object literal for the '<em><b>In The Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IN_THE_FORM = eINSTANCE.getAttribute_InTheForm();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALOR = eINSTANCE.getAttribute_Valor();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.RelationAttributeImpl <em>Relation Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.RelationAttributeImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelationAttribute()
		 * @generated
		 */
		EClass RELATION_ATTRIBUTE = eINSTANCE.getRelationAttribute();

		/**
		 * The meta object literal for the '<em><b>Go Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ATTRIBUTE__GO_ATTRIBUTE = eINSTANCE.getRelationAttribute_GoAttribute();

		/**
		 * The meta object literal for the '<em><b>Rhas Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ATTRIBUTE__RHAS_ATTRIBUTE = eINSTANCE.getRelationAttribute_RhasAttribute();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.Attribute_Not_DerivedImpl <em>Attribute Not Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.Attribute_Not_DerivedImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAttribute_Not_Derived()
		 * @generated
		 */
		EClass ATTRIBUTE_NOT_DERIVED = eINSTANCE.getAttribute_Not_Derived();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NOT_DERIVED__DEFAULT_VALUE = eINSTANCE.getAttribute_Not_Derived_DefaultValue();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.Attribute_DerivedImpl <em>Attribute Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.Attribute_DerivedImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAttribute_Derived()
		 * @generated
		 */
		EClass ATTRIBUTE_DERIVED = eINSTANCE.getAttribute_Derived();

		/**
		 * The meta object literal for the '<em><b>Derivation Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DERIVED__DERIVATION_COMMENTS = eINSTANCE.getAttribute_Derived_DerivationComments();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DERIVED__FORMULA = eINSTANCE.getAttribute_Derived_Formula();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ServiceImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ROL = eINSTANCE.getService_Rol();

		/**
		 * The meta object literal for the '<em><b>Has Relation View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__HAS_RELATION_VIEW = eINSTANCE.getService_HasRelationView();

		/**
		 * The meta object literal for the '<em><b>Go To Relation View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__GO_TO_RELATION_VIEW = eINSTANCE.getService_GoToRelationView();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.RelationServiceImpl <em>Relation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.RelationServiceImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelationService()
		 * @generated
		 */
		EClass RELATION_SERVICE = eINSTANCE.getRelationService();

		/**
		 * The meta object literal for the '<em><b>Rhas Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_SERVICE__RHAS_SERVICE = eINSTANCE.getRelationService_RhasService();

		/**
		 * The meta object literal for the '<em><b>Go Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_SERVICE__GO_SERVICE = eINSTANCE.getRelationService_GoService();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.CreateImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__NAME = eINSTANCE.getCreate_Name();

		/**
		 * The meta object literal for the '<em><b>Has View Form Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__HAS_VIEW_FORM_INPUT = eINSTANCE.getCreate_HasViewFormInput();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.DeleteImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__NAME = eINSTANCE.getDelete_Name();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.UpdateObjectImpl <em>Update Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.UpdateObjectImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getUpdateObject()
		 * @generated
		 */
		EClass UPDATE_OBJECT = eINSTANCE.getUpdateObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_OBJECT__NAME = eINSTANCE.getUpdateObject_Name();

		/**
		 * The meta object literal for the '<em><b>Has View Update Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_OBJECT__HAS_VIEW_UPDATE_OBJECT = eINSTANCE.getUpdateObject_HasViewUpdateObject();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.UpdateAttributeImpl <em>Update Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.UpdateAttributeImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getUpdateAttribute()
		 * @generated
		 */
		EClass UPDATE_ATTRIBUTE = eINSTANCE.getUpdateAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ATTRIBUTE__NAME = eINSTANCE.getUpdateAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Has View Update Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT = eINSTANCE.getUpdateAttribute_HasViewUpdateObject();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ListViewImpl <em>List View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ListViewImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getListView()
		 * @generated
		 */
		EClass LIST_VIEW = eINSTANCE.getListView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_VIEW__NAME = eINSTANCE.getListView_Name();

		/**
		 * The meta object literal for the '<em><b>Has View Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VIEW__HAS_VIEW_INDEX = eINSTANCE.getListView_HasViewIndex();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ViewImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Has View Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__HAS_VIEW_ATTRIBUTE = eINSTANCE.getView_HasViewAttribute();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.AdminImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__NAME = eINSTANCE.getAdmin_Name();

		/**
		 * The meta object literal for the '<em><b>Has View Admin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__HAS_VIEW_ADMIN = eINSTANCE.getAdmin_HasViewAdmin();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ViewsImpl <em>Views</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ViewsImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViews()
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
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWS__GROUP = eINSTANCE.getViews_Group();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ViewInputImpl <em>View Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ViewInputImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewInput()
		 * @generated
		 */
		EClass VIEW_INPUT = eINSTANCE.getViewInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_INPUT__NAME = eINSTANCE.getViewInput_Name();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ViewUpdateObjectImpl <em>View Update Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ViewUpdateObjectImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewUpdateObject()
		 * @generated
		 */
		EClass VIEW_UPDATE_OBJECT = eINSTANCE.getViewUpdateObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_UPDATE_OBJECT__NAME = eINSTANCE.getViewUpdateObject_Name();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ViewUpdateAttributeImpl <em>View Update Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ViewUpdateAttributeImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewUpdateAttribute()
		 * @generated
		 */
		EClass VIEW_UPDATE_ATTRIBUTE = eINSTANCE.getViewUpdateAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_UPDATE_ATTRIBUTE__NAME = eINSTANCE.getViewUpdateAttribute_Name();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ViewIndexImpl <em>View Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ViewIndexImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewIndex()
		 * @generated
		 */
		EClass VIEW_INDEX = eINSTANCE.getViewIndex();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_INDEX__NAME = eINSTANCE.getViewIndex_Name();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ViewAttributeImpl <em>View Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ViewAttributeImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewAttribute()
		 * @generated
		 */
		EClass VIEW_ATTRIBUTE = eINSTANCE.getViewAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ATTRIBUTE__NAME = eINSTANCE.getViewAttribute_Name();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.ViewAdminImpl <em>View Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.ViewAdminImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getViewAdmin()
		 * @generated
		 */
		EClass VIEW_ADMIN = eINSTANCE.getViewAdmin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ADMIN__NAME = eINSTANCE.getViewAdmin_Name();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.RelationViewImpl <em>Relation View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.RelationViewImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelationView()
		 * @generated
		 */
		EClass RELATION_VIEW = eINSTANCE.getRelationView();

		/**
		 * The meta object literal for the '<em><b>Rhas View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_VIEW__RHAS_VIEW = eINSTANCE.getRelationView_RhasView();

		/**
		 * The meta object literal for the '<em><b>Go To View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_VIEW__GO_TO_VIEW = eINSTANCE.getRelationView_GoToView();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.PageImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getPage()
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
		 * The meta object literal for the '{@link Modeluno.modeluno.Rol <em>Rol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.Rol
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRol()
		 * @generated
		 */
		EEnum ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.TypeAttributeForm <em>Type Attribute Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.TypeAttributeForm
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getTypeAttributeForm()
		 * @generated
		 */
		EEnum TYPE_ATTRIBUTE_FORM = eINSTANCE.getTypeAttributeForm();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.dataTypes <em>data Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.dataTypes
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getdataTypes()
		 * @generated
		 */
		EEnum DATA_TYPES = eINSTANCE.getdataTypes();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.TypesView <em>Types View</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.TypesView
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getTypesView()
		 * @generated
		 */
		EEnum TYPES_VIEW = eINSTANCE.getTypesView();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.typeHorizotalPosition <em>type Horizotal Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.typeHorizotalPosition
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#gettypeHorizotalPosition()
		 * @generated
		 */
		EEnum TYPE_HORIZOTAL_POSITION = eINSTANCE.gettypeHorizotalPosition();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.TypesAlert <em>Types Alert</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.TypesAlert
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getTypesAlert()
		 * @generated
		 */
		EEnum TYPES_ALERT = eINSTANCE.getTypesAlert();

	}

} //ModelunoPackage
