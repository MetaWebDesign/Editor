/**
 */
package Modeldos.modeldos;

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
	 * The meta object id for the '{@link Modeldos.modeldos.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.MapImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getMap()
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
	 * The meta object id for the '{@link Modeldos.modeldos.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.ClassImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getClass_()
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
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CNAME = 2;

	/**
	 * The feature id for the '<em><b>Has Atribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_ATRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modeldos.modeldos.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.RelationImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRelation()
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
	 * The meta object id for the '{@link Modeldos.modeldos.impl.AtributteImpl <em>Atributte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeldos.modeldos.impl.AtributteImpl
	 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getAtributte()
	 * @generated
	 */
	int ATRIBUTTE = 3;

	/**
	 * The feature id for the '<em><b>Aname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTTE__ANAME = 0;

	/**
	 * The feature id for the '<em><b>Es De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTTE__ES_DE = 1;

	/**
	 * The number of structural features of the '<em>Atributte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Atributte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTTE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see Modeldos.modeldos.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Map#getHasClass <em>Has Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Class</em>'.
	 * @see Modeldos.modeldos.Map#getHasClass()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_HasClass();

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
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Class#getHasRelation <em>Has Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relation</em>'.
	 * @see Modeldos.modeldos.Class#getHasRelation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasRelation();

	/**
	 * Returns the meta object for the reference list '{@link Modeldos.modeldos.Class#getR1 <em>R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>R1</em>'.
	 * @see Modeldos.modeldos.Class#getR1()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_R1();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Class#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see Modeldos.modeldos.Class#getCname()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Cname();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeldos.modeldos.Class#getHasAtribute <em>Has Atribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Atribute</em>'.
	 * @see Modeldos.modeldos.Class#getHasAtribute()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasAtribute();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see Modeldos.modeldos.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference list '{@link Modeldos.modeldos.Relation#getR2 <em>R2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>R2</em>'.
	 * @see Modeldos.modeldos.Relation#getR2()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_R2();

	/**
	 * Returns the meta object for class '{@link Modeldos.modeldos.Atributte <em>Atributte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributte</em>'.
	 * @see Modeldos.modeldos.Atributte
	 * @generated
	 */
	EClass getAtributte();

	/**
	 * Returns the meta object for the attribute '{@link Modeldos.modeldos.Atributte#getAname <em>Aname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aname</em>'.
	 * @see Modeldos.modeldos.Atributte#getAname()
	 * @see #getAtributte()
	 * @generated
	 */
	EAttribute getAtributte_Aname();

	/**
	 * Returns the meta object for the reference '{@link Modeldos.modeldos.Atributte#getEsDe <em>Es De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Es De</em>'.
	 * @see Modeldos.modeldos.Atributte#getEsDe()
	 * @see #getAtributte()
	 * @generated
	 */
	EReference getAtributte_EsDe();

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
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.MapImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getMap()
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
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.ClassImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getClass_()
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
		 * The meta object literal for the '<em><b>Cname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CNAME = eINSTANCE.getClass_Cname();

		/**
		 * The meta object literal for the '<em><b>Has Atribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_ATRIBUTE = eINSTANCE.getClass_HasAtribute();

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.RelationImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getRelation()
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

		/**
		 * The meta object literal for the '{@link Modeldos.modeldos.impl.AtributteImpl <em>Atributte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeldos.modeldos.impl.AtributteImpl
		 * @see Modeldos.modeldos.impl.ModeldosPackageImpl#getAtributte()
		 * @generated
		 */
		EClass ATRIBUTTE = eINSTANCE.getAtributte();

		/**
		 * The meta object literal for the '<em><b>Aname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTTE__ANAME = eINSTANCE.getAtributte_Aname();

		/**
		 * The meta object literal for the '<em><b>Es De</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTTE__ES_DE = eINSTANCE.getAtributte_EsDe();

	}

} //ModeldosPackage
