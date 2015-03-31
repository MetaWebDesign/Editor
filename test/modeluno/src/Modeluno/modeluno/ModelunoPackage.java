/**
 */
package Modeluno.modeluno;

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
	 * The feature id for the '<em><b>Has Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__HAS_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>R1</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__R1 = 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.RelationImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 2;

	/**
	 * The feature id for the '<em><b>R2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__R2 = 0;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Map#getHasClass <em>Has Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Class</em>'.
	 * @see Modeluno.modeluno.Map#getHasClass()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_HasClass();

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
	 * Returns the meta object for the reference list '{@link Modeluno.modeluno.Class#getR1 <em>R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>R1</em>'.
	 * @see Modeluno.modeluno.Class#getR1()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_R1();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see Modeluno.modeluno.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference list '{@link Modeluno.modeluno.Relation#getR2 <em>R2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>R2</em>'.
	 * @see Modeluno.modeluno.Relation#getR2()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_R2();

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
		 * The meta object literal for the '<em><b>Has Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__HAS_CLASS = eINSTANCE.getMap_HasClass();

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
		 * The meta object literal for the '<em><b>R1</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__R1 = eINSTANCE.getClass_R1();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.RelationImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>R2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__R2 = eINSTANCE.getRelation_R2();

	}

} //ModelunoPackage
