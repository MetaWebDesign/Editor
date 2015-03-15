/**
 */
package oo_method.oo_method;

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
 * @see oo_method.oo_method.Oo_methodFactory
 * @model kind="package"
 * @generated
 */
public interface Oo_methodPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oo_method";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "oo_method";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oo_method";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Oo_methodPackage eINSTANCE = oo_method.oo_method.impl.Oo_methodPackageImpl.init();

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.ClassImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>RCompound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__RCOMPOUND = 0;

	/**
	 * The feature id for the '<em><b>RComponents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__RCOMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 3;

	/**
	 * The feature id for the '<em><b>Id Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SERVICES = 5;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONSTRAINTS = 6;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.RelationImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 1;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__COMPOSED = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.AttributeImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PERMISSIONS = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.DerivedImpl <em>Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.DerivedImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getDerived()
	 * @generated
	 */
	int DERIVED = 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__DATA_TYPE = ATTRIBUTE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__PERMISSIONS = ATTRIBUTE__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Der Formulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__DER_FORMULAS = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derivation Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__DERIVATION_COMMENTS = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.NotDerivedImpl <em>Not Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.NotDerivedImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getNotDerived()
	 * @generated
	 */
	int NOT_DERIVED = 4;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__DATA_TYPE = ATTRIBUTE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__PERMISSIONS = ATTRIBUTE__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED__DEFAULT_VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_DERIVED_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.DerivationFormulaImpl <em>Derivation Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.DerivationFormulaImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getDerivationFormula()
	 * @generated
	 */
	int DERIVATION_FORMULA = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_FORMULA__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_FORMULA__EFFECT = 1;

	/**
	 * The number of structural features of the '<em>Derivation Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_FORMULA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Derivation Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.ServiceImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRECONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__KIND = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.ArgumentImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DEFAULT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.PreconditionImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 8;

	/**
	 * The feature id for the '<em><b>Precondition Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__PRECONDITION_COMMENTS = 0;

	/**
	 * The feature id for the '<em><b>Pre Formulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__PRE_FORMULAS = 1;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.PreconditionFormulaImpl <em>Precondition Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.PreconditionFormulaImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getPreconditionFormula()
	 * @generated
	 */
	int PRECONDITION_FORMULA = 9;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FORMULA__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FORMULA__ERROR = 1;

	/**
	 * The number of structural features of the '<em>Precondition Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FORMULA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Precondition Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.ValuationFormulaImpl <em>Valuation Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.ValuationFormulaImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getValuationFormula()
	 * @generated
	 */
	int VALUATION_FORMULA = 10;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION_FORMULA__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION_FORMULA__EFFECT = 1;

	/**
	 * The number of structural features of the '<em>Valuation Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION_FORMULA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Valuation Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUATION_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.ConstraintsImpl <em>Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.ConstraintsImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getConstraints()
	 * @generated
	 */
	int CONSTRAINTS = 11;

	/**
	 * The feature id for the '<em><b>Constraint Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__CONSTRAINT_COMMENTS = 0;

	/**
	 * The feature id for the '<em><b>Const Formulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__CONST_FORMULAS = 1;

	/**
	 * The number of structural features of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.ConstraintFormulaImpl <em>Constraint Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.ConstraintFormulaImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getConstraintFormula()
	 * @generated
	 */
	int CONSTRAINT_FORMULA = 12;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FORMULA__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FORMULA__ERROR = 1;

	/**
	 * The number of structural features of the '<em>Constraint Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FORMULA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.impl.StructuralModelImpl <em>Structural Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.impl.StructuralModelImpl
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getStructuralModel()
	 * @generated
	 */
	int STRUCTURAL_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_MODEL__CLASSES = 0;

	/**
	 * The number of structural features of the '<em>Structural Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Structural Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.dataTypes <em>data Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.dataTypes
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getdataTypes()
	 * @generated
	 */
	int DATA_TYPES = 14;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.ServiceKinds <em>Service Kinds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.ServiceKinds
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getServiceKinds()
	 * @generated
	 */
	int SERVICE_KINDS = 15;

	/**
	 * The meta object id for the '{@link oo_method.oo_method.permissionsType <em>permissions Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oo_method.oo_method.permissionsType
	 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getpermissionsType()
	 * @generated
	 */
	int PERMISSIONS_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see oo_method.oo_method.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.Class#getRCompound <em>RCompound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RCompound</em>'.
	 * @see oo_method.oo_method.Class#getRCompound()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_RCompound();

	/**
	 * Returns the meta object for the reference list '{@link oo_method.oo_method.Class#getRComponents <em>RComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RComponents</em>'.
	 * @see oo_method.oo_method.Class#getRComponents()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_RComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see oo_method.oo_method.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oo_method.oo_method.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Class#getIdFunction <em>Id Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Function</em>'.
	 * @see oo_method.oo_method.Class#getIdFunction()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IdFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.Class#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see oo_method.oo_method.Class#getServices()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.Class#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see oo_method.oo_method.Class#getConstraints()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Constraints();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see oo_method.oo_method.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the container reference '{@link oo_method.oo_method.Relation#getComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Composed</em>'.
	 * @see oo_method.oo_method.Relation#getComposed()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Composed();

	/**
	 * Returns the meta object for the reference '{@link oo_method.oo_method.Relation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see oo_method.oo_method.Relation#getComponent()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Component();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see oo_method.oo_method.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Attribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see oo_method.oo_method.Attribute#getDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oo_method.oo_method.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Attribute#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions</em>'.
	 * @see oo_method.oo_method.Attribute#getPermissions()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Permissions();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived</em>'.
	 * @see oo_method.oo_method.Derived
	 * @generated
	 */
	EClass getDerived();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.Derived#getDerFormulas <em>Der Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Der Formulas</em>'.
	 * @see oo_method.oo_method.Derived#getDerFormulas()
	 * @see #getDerived()
	 * @generated
	 */
	EReference getDerived_DerFormulas();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Derived#getDerivationComments <em>Derivation Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivation Comments</em>'.
	 * @see oo_method.oo_method.Derived#getDerivationComments()
	 * @see #getDerived()
	 * @generated
	 */
	EAttribute getDerived_DerivationComments();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.NotDerived <em>Not Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Derived</em>'.
	 * @see oo_method.oo_method.NotDerived
	 * @generated
	 */
	EClass getNotDerived();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.NotDerived#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see oo_method.oo_method.NotDerived#getDefaultValue()
	 * @see #getNotDerived()
	 * @generated
	 */
	EAttribute getNotDerived_DefaultValue();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.DerivationFormula <em>Derivation Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation Formula</em>'.
	 * @see oo_method.oo_method.DerivationFormula
	 * @generated
	 */
	EClass getDerivationFormula();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.DerivationFormula#isCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see oo_method.oo_method.DerivationFormula#isCondition()
	 * @see #getDerivationFormula()
	 * @generated
	 */
	EAttribute getDerivationFormula_Condition();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.DerivationFormula#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see oo_method.oo_method.DerivationFormula#getEffect()
	 * @see #getDerivationFormula()
	 * @generated
	 */
	EAttribute getDerivationFormula_Effect();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see oo_method.oo_method.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oo_method.oo_method.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.Service#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see oo_method.oo_method.Service#getArguments()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.Service#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions</em>'.
	 * @see oo_method.oo_method.Service#getPreconditions()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Preconditions();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Service#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see oo_method.oo_method.Service#getKind()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Kind();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see oo_method.oo_method.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oo_method.oo_method.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Argument#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see oo_method.oo_method.Argument#getDefaultValue()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_DefaultValue();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see oo_method.oo_method.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Precondition#getPreconditionComments <em>Precondition Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition Comments</em>'.
	 * @see oo_method.oo_method.Precondition#getPreconditionComments()
	 * @see #getPrecondition()
	 * @generated
	 */
	EAttribute getPrecondition_PreconditionComments();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.Precondition#getPreFormulas <em>Pre Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Formulas</em>'.
	 * @see oo_method.oo_method.Precondition#getPreFormulas()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_PreFormulas();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.PreconditionFormula <em>Precondition Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition Formula</em>'.
	 * @see oo_method.oo_method.PreconditionFormula
	 * @generated
	 */
	EClass getPreconditionFormula();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.PreconditionFormula#isCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see oo_method.oo_method.PreconditionFormula#isCondition()
	 * @see #getPreconditionFormula()
	 * @generated
	 */
	EAttribute getPreconditionFormula_Condition();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.PreconditionFormula#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see oo_method.oo_method.PreconditionFormula#getError()
	 * @see #getPreconditionFormula()
	 * @generated
	 */
	EAttribute getPreconditionFormula_Error();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.ValuationFormula <em>Valuation Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valuation Formula</em>'.
	 * @see oo_method.oo_method.ValuationFormula
	 * @generated
	 */
	EClass getValuationFormula();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.ValuationFormula#isCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see oo_method.oo_method.ValuationFormula#isCondition()
	 * @see #getValuationFormula()
	 * @generated
	 */
	EAttribute getValuationFormula_Condition();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.ValuationFormula#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see oo_method.oo_method.ValuationFormula#getEffect()
	 * @see #getValuationFormula()
	 * @generated
	 */
	EAttribute getValuationFormula_Effect();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints</em>'.
	 * @see oo_method.oo_method.Constraints
	 * @generated
	 */
	EClass getConstraints();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.Constraints#getConstraintComments <em>Constraint Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Comments</em>'.
	 * @see oo_method.oo_method.Constraints#getConstraintComments()
	 * @see #getConstraints()
	 * @generated
	 */
	EAttribute getConstraints_ConstraintComments();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.Constraints#getConstFormulas <em>Const Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Const Formulas</em>'.
	 * @see oo_method.oo_method.Constraints#getConstFormulas()
	 * @see #getConstraints()
	 * @generated
	 */
	EReference getConstraints_ConstFormulas();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.ConstraintFormula <em>Constraint Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Formula</em>'.
	 * @see oo_method.oo_method.ConstraintFormula
	 * @generated
	 */
	EClass getConstraintFormula();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.ConstraintFormula#isCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see oo_method.oo_method.ConstraintFormula#isCondition()
	 * @see #getConstraintFormula()
	 * @generated
	 */
	EAttribute getConstraintFormula_Condition();

	/**
	 * Returns the meta object for the attribute '{@link oo_method.oo_method.ConstraintFormula#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see oo_method.oo_method.ConstraintFormula#getError()
	 * @see #getConstraintFormula()
	 * @generated
	 */
	EAttribute getConstraintFormula_Error();

	/**
	 * Returns the meta object for class '{@link oo_method.oo_method.StructuralModel <em>Structural Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Model</em>'.
	 * @see oo_method.oo_method.StructuralModel
	 * @generated
	 */
	EClass getStructuralModel();

	/**
	 * Returns the meta object for the containment reference list '{@link oo_method.oo_method.StructuralModel#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see oo_method.oo_method.StructuralModel#getClasses()
	 * @see #getStructuralModel()
	 * @generated
	 */
	EReference getStructuralModel_Classes();

	/**
	 * Returns the meta object for enum '{@link oo_method.oo_method.dataTypes <em>data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>data Types</em>'.
	 * @see oo_method.oo_method.dataTypes
	 * @generated
	 */
	EEnum getdataTypes();

	/**
	 * Returns the meta object for enum '{@link oo_method.oo_method.ServiceKinds <em>Service Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Kinds</em>'.
	 * @see oo_method.oo_method.ServiceKinds
	 * @generated
	 */
	EEnum getServiceKinds();

	/**
	 * Returns the meta object for enum '{@link oo_method.oo_method.permissionsType <em>permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>permissions Type</em>'.
	 * @see oo_method.oo_method.permissionsType
	 * @generated
	 */
	EEnum getpermissionsType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Oo_methodFactory getOo_methodFactory();

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
		 * The meta object literal for the '{@link oo_method.oo_method.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.ClassImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>RCompound</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__RCOMPOUND = eINSTANCE.getClass_RCompound();

		/**
		 * The meta object literal for the '<em><b>RComponents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__RCOMPONENTS = eINSTANCE.getClass_RComponents();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Id Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ID_FUNCTION = eINSTANCE.getClass_IdFunction();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SERVICES = eINSTANCE.getClass_Services();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CONSTRAINTS = eINSTANCE.getClass_Constraints();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.RelationImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Composed</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__COMPOSED = eINSTANCE.getRelation_Composed();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__COMPONENT = eINSTANCE.getRelation_Component();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.AttributeImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PERMISSIONS = eINSTANCE.getAttribute_Permissions();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.DerivedImpl <em>Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.DerivedImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getDerived()
		 * @generated
		 */
		EClass DERIVED = eINSTANCE.getDerived();

		/**
		 * The meta object literal for the '<em><b>Der Formulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED__DER_FORMULAS = eINSTANCE.getDerived_DerFormulas();

		/**
		 * The meta object literal for the '<em><b>Derivation Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED__DERIVATION_COMMENTS = eINSTANCE.getDerived_DerivationComments();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.NotDerivedImpl <em>Not Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.NotDerivedImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getNotDerived()
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
		 * The meta object literal for the '{@link oo_method.oo_method.impl.DerivationFormulaImpl <em>Derivation Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.DerivationFormulaImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getDerivationFormula()
		 * @generated
		 */
		EClass DERIVATION_FORMULA = eINSTANCE.getDerivationFormula();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION_FORMULA__CONDITION = eINSTANCE.getDerivationFormula_Condition();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION_FORMULA__EFFECT = eINSTANCE.getDerivationFormula_Effect();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.ServiceImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ARGUMENTS = eINSTANCE.getService_Arguments();

		/**
		 * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PRECONDITIONS = eINSTANCE.getService_Preconditions();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__KIND = eINSTANCE.getService_Kind();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.ArgumentImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__DEFAULT_VALUE = eINSTANCE.getArgument_DefaultValue();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.PreconditionImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '<em><b>Precondition Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION__PRECONDITION_COMMENTS = eINSTANCE.getPrecondition_PreconditionComments();

		/**
		 * The meta object literal for the '<em><b>Pre Formulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECONDITION__PRE_FORMULAS = eINSTANCE.getPrecondition_PreFormulas();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.PreconditionFormulaImpl <em>Precondition Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.PreconditionFormulaImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getPreconditionFormula()
		 * @generated
		 */
		EClass PRECONDITION_FORMULA = eINSTANCE.getPreconditionFormula();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION_FORMULA__CONDITION = eINSTANCE.getPreconditionFormula_Condition();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITION_FORMULA__ERROR = eINSTANCE.getPreconditionFormula_Error();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.ValuationFormulaImpl <em>Valuation Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.ValuationFormulaImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getValuationFormula()
		 * @generated
		 */
		EClass VALUATION_FORMULA = eINSTANCE.getValuationFormula();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUATION_FORMULA__CONDITION = eINSTANCE.getValuationFormula_Condition();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUATION_FORMULA__EFFECT = eINSTANCE.getValuationFormula_Effect();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.ConstraintsImpl <em>Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.ConstraintsImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getConstraints()
		 * @generated
		 */
		EClass CONSTRAINTS = eINSTANCE.getConstraints();

		/**
		 * The meta object literal for the '<em><b>Constraint Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINTS__CONSTRAINT_COMMENTS = eINSTANCE.getConstraints_ConstraintComments();

		/**
		 * The meta object literal for the '<em><b>Const Formulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS__CONST_FORMULAS = eINSTANCE.getConstraints_ConstFormulas();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.ConstraintFormulaImpl <em>Constraint Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.ConstraintFormulaImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getConstraintFormula()
		 * @generated
		 */
		EClass CONSTRAINT_FORMULA = eINSTANCE.getConstraintFormula();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_FORMULA__CONDITION = eINSTANCE.getConstraintFormula_Condition();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_FORMULA__ERROR = eINSTANCE.getConstraintFormula_Error();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.impl.StructuralModelImpl <em>Structural Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.impl.StructuralModelImpl
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getStructuralModel()
		 * @generated
		 */
		EClass STRUCTURAL_MODEL = eINSTANCE.getStructuralModel();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_MODEL__CLASSES = eINSTANCE.getStructuralModel_Classes();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.dataTypes <em>data Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.dataTypes
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getdataTypes()
		 * @generated
		 */
		EEnum DATA_TYPES = eINSTANCE.getdataTypes();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.ServiceKinds <em>Service Kinds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.ServiceKinds
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getServiceKinds()
		 * @generated
		 */
		EEnum SERVICE_KINDS = eINSTANCE.getServiceKinds();

		/**
		 * The meta object literal for the '{@link oo_method.oo_method.permissionsType <em>permissions Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oo_method.oo_method.permissionsType
		 * @see oo_method.oo_method.impl.Oo_methodPackageImpl#getpermissionsType()
		 * @generated
		 */
		EEnum PERMISSIONS_TYPE = eINSTANCE.getpermissionsType();

	}

} //Oo_methodPackage
