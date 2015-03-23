/**
 */
package Modelo.modelo;

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
 * @see Modelo.modelo.ModeloFactory
 * @model kind="package"
 * @generated
 */
public interface ModeloPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelo/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloPackage eINSTANCE = Modelo.modelo.impl.ModeloPackageImpl.init();

	/**
	 * The meta object id for the '{@link Modelo.modelo.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelo.modelo.impl.ModelImpl
	 * @see Modelo.modelo.impl.ModeloPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EREFERENCE0 = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modelo.modelo.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelo.modelo.impl.ClassImpl
	 * @see Modelo.modelo.impl.ModeloPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 1;

	/**
	 * The feature id for the '<em><b>Has Relaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HAS_RELACTION = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FROM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modelo.modelo.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelo.modelo.impl.RelationImpl
	 * @see Modelo.modelo.impl.ModeloPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TO = 0;

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
	 * Returns the meta object for class '{@link Modelo.modelo.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see Modelo.modelo.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link Modelo.modelo.Model#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference0</em>'.
	 * @see Modelo.modelo.Model#getEReference0()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_EReference0();

	/**
	 * Returns the meta object for class '{@link Modelo.modelo.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see Modelo.modelo.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link Modelo.modelo.Class#getHasRelaction <em>Has Relaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relaction</em>'.
	 * @see Modelo.modelo.Class#getHasRelaction()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_HasRelaction();

	/**
	 * Returns the meta object for the reference list '{@link Modelo.modelo.Class#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see Modelo.modelo.Class#getFrom()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_From();

	/**
	 * Returns the meta object for the attribute '{@link Modelo.modelo.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Modelo.modelo.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for class '{@link Modelo.modelo.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see Modelo.modelo.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference list '{@link Modelo.modelo.Relation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see Modelo.modelo.Relation#getTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_To();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeloFactory getModeloFactory();

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
		 * The meta object literal for the '{@link Modelo.modelo.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelo.modelo.impl.ModelImpl
		 * @see Modelo.modelo.impl.ModeloPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__EREFERENCE0 = eINSTANCE.getModel_EReference0();

		/**
		 * The meta object literal for the '{@link Modelo.modelo.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelo.modelo.impl.ClassImpl
		 * @see Modelo.modelo.impl.ModeloPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Has Relaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__HAS_RELACTION = eINSTANCE.getClass_HasRelaction();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__FROM = eINSTANCE.getClass_From();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '{@link Modelo.modelo.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelo.modelo.impl.RelationImpl
		 * @see Modelo.modelo.impl.ModeloPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TO = eINSTANCE.getRelation_To();

	}

} //ModeloPackage
