/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 2;

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
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.Class_RelationImpl <em>Class Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.Class_RelationImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getClass_Relation()
	 * @generated
	 */
	int CLASS_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Go Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_RELATION__GO_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Class Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_RELATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_RELATION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = 1;

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
	 * The meta object id for the '{@link Modeluno.modeluno.impl.Attribute_RelationImpl <em>Attribute Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.Attribute_RelationImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAttribute_Relation()
	 * @generated
	 */
	int ATTRIBUTE_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Go Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION__GO_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Rhas Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION__RHAS_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attribute Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_RELATION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_DERIVED__PERMISSIONS = ATTRIBUTE__PERMISSIONS;

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
	 * The feature id for the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__PERMISSIONS = ATTRIBUTE__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Derivation Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__DERIVATION_COMMENTS = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__CONDITION = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__EFFECT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED__FORMULA = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attribute Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DERIVED_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link Modeluno.modeluno.Class_Relation <em>Class Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Relation</em>'.
	 * @see Modeluno.modeluno.Class_Relation
	 * @generated
	 */
	EClass getClass_Relation();

	/**
	 * Returns the meta object for the reference list '{@link Modeluno.modeluno.Class_Relation#getGoClass <em>Go Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Go Class</em>'.
	 * @see Modeluno.modeluno.Class_Relation#getGoClass()
	 * @see #getClass_Relation()
	 * @generated
	 */
	EReference getClass_Relation_GoClass();

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
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions</em>'.
	 * @see Modeluno.modeluno.Attribute#getPermissions()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Permissions();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Attribute_Relation <em>Attribute Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Relation</em>'.
	 * @see Modeluno.modeluno.Attribute_Relation
	 * @generated
	 */
	EClass getAttribute_Relation();

	/**
	 * Returns the meta object for the reference '{@link Modeluno.modeluno.Attribute_Relation#getGoAttribute <em>Go Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Go Attribute</em>'.
	 * @see Modeluno.modeluno.Attribute_Relation#getGoAttribute()
	 * @see #getAttribute_Relation()
	 * @generated
	 */
	EReference getAttribute_Relation_GoAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.Attribute_Relation#getRhasAttribute <em>Rhas Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhas Attribute</em>'.
	 * @see Modeluno.modeluno.Attribute_Relation#getRhasAttribute()
	 * @see #getAttribute_Relation()
	 * @generated
	 */
	EReference getAttribute_Relation_RhasAttribute();

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
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute_Derived#isCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see Modeluno.modeluno.Attribute_Derived#isCondition()
	 * @see #getAttribute_Derived()
	 * @generated
	 */
	EAttribute getAttribute_Derived_Condition();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Attribute_Derived#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see Modeluno.modeluno.Attribute_Derived#getEffect()
	 * @see #getAttribute_Derived()
	 * @generated
	 */
	EAttribute getAttribute_Derived_Effect();

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
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.Class_RelationImpl <em>Class Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.Class_RelationImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getClass_Relation()
		 * @generated
		 */
		EClass CLASS_RELATION = eINSTANCE.getClass_Relation();

		/**
		 * The meta object literal for the '<em><b>Go Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_RELATION__GO_CLASS = eINSTANCE.getClass_Relation_GoClass();

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
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PERMISSIONS = eINSTANCE.getAttribute_Permissions();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.Attribute_RelationImpl <em>Attribute Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.Attribute_RelationImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAttribute_Relation()
		 * @generated
		 */
		EClass ATTRIBUTE_RELATION = eINSTANCE.getAttribute_Relation();

		/**
		 * The meta object literal for the '<em><b>Go Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_RELATION__GO_ATTRIBUTE = eINSTANCE.getAttribute_Relation_GoAttribute();

		/**
		 * The meta object literal for the '<em><b>Rhas Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_RELATION__RHAS_ATTRIBUTE = eINSTANCE.getAttribute_Relation_RhasAttribute();

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
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DERIVED__CONDITION = eINSTANCE.getAttribute_Derived_Condition();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DERIVED__EFFECT = eINSTANCE.getAttribute_Derived_Effect();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DERIVED__FORMULA = eINSTANCE.getAttribute_Derived_Formula();

	}

} //ModelunoPackage
