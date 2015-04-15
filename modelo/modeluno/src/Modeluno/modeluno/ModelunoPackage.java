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
	 * The feature id for the '<em><b>Has Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__HAS_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Has Atribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__HAS_ATRIBUTE = 1;

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
	 * The feature id for the '<em><b>Id Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Posee Atributte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__POSEE_ATRIBUTTE = 4;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EREFERENCE0 = 5;

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
	 * The meta object id for the '{@link Modeluno.modeluno.impl.AtributteImpl <em>Atributte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.AtributteImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAtributte()
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
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTTE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTTE__PERMISSIONS = 2;

	/**
	 * The number of structural features of the '<em>Atributte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atributte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTTE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link Modeluno.modeluno.impl.RAttributeImpl <em>RAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modeluno.modeluno.impl.RAttributeImpl
	 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRAttribute()
	 * @generated
	 */
	int RATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Atributo Es De</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATTRIBUTE__ATRIBUTO_ES_DE = 0;

	/**
	 * The feature id for the '<em><b>Rhas Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATTRIBUTE__RHAS_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>RAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATTRIBUTE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Map#getHasAtribute <em>Has Atribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Atribute</em>'.
	 * @see Modeluno.modeluno.Map#getHasAtribute()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_HasAtribute();

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
	 * Returns the meta object for the reference '{@link Modeluno.modeluno.Class#getPoseeAtributte <em>Posee Atributte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Posee Atributte</em>'.
	 * @see Modeluno.modeluno.Class#getPoseeAtributte()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_PoseeAtributte();

	/**
	 * Returns the meta object for the containment reference list '{@link Modeluno.modeluno.Class#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference0</em>'.
	 * @see Modeluno.modeluno.Class#getEReference0()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_EReference0();

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
	 * Returns the meta object for class '{@link Modeluno.modeluno.Atributte <em>Atributte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributte</em>'.
	 * @see Modeluno.modeluno.Atributte
	 * @generated
	 */
	EClass getAtributte();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Atributte#getAname <em>Aname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aname</em>'.
	 * @see Modeluno.modeluno.Atributte#getAname()
	 * @see #getAtributte()
	 * @generated
	 */
	EAttribute getAtributte_Aname();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Atributte#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see Modeluno.modeluno.Atributte#getDataType()
	 * @see #getAtributte()
	 * @generated
	 */
	EAttribute getAtributte_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Modeluno.modeluno.Atributte#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions</em>'.
	 * @see Modeluno.modeluno.Atributte#getPermissions()
	 * @see #getAtributte()
	 * @generated
	 */
	EAttribute getAtributte_Permissions();

	/**
	 * Returns the meta object for class '{@link Modeluno.modeluno.RAttribute <em>RAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAttribute</em>'.
	 * @see Modeluno.modeluno.RAttribute
	 * @generated
	 */
	EClass getRAttribute();

	/**
	 * Returns the meta object for the reference '{@link Modeluno.modeluno.RAttribute#getAtributoEsDe <em>Atributo Es De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atributo Es De</em>'.
	 * @see Modeluno.modeluno.RAttribute#getAtributoEsDe()
	 * @see #getRAttribute()
	 * @generated
	 */
	EReference getRAttribute_AtributoEsDe();

	/**
	 * Returns the meta object for the containment reference '{@link Modeluno.modeluno.RAttribute#getRhasAttribute <em>Rhas Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhas Attribute</em>'.
	 * @see Modeluno.modeluno.RAttribute#getRhasAttribute()
	 * @see #getRAttribute()
	 * @generated
	 */
	EReference getRAttribute_RhasAttribute();

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
		 * The meta object literal for the '<em><b>Has Atribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__HAS_ATRIBUTE = eINSTANCE.getMap_HasAtribute();

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
		 * The meta object literal for the '<em><b>Posee Atributte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__POSEE_ATRIBUTTE = eINSTANCE.getClass_PoseeAtributte();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EREFERENCE0 = eINSTANCE.getClass_EReference0();

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

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.AtributteImpl <em>Atributte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.AtributteImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getAtributte()
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
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTTE__DATA_TYPE = eINSTANCE.getAtributte_DataType();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTTE__PERMISSIONS = eINSTANCE.getAtributte_Permissions();

		/**
		 * The meta object literal for the '{@link Modeluno.modeluno.impl.RAttributeImpl <em>RAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modeluno.modeluno.impl.RAttributeImpl
		 * @see Modeluno.modeluno.impl.ModelunoPackageImpl#getRAttribute()
		 * @generated
		 */
		EClass RATTRIBUTE = eINSTANCE.getRAttribute();

		/**
		 * The meta object literal for the '<em><b>Atributo Es De</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATTRIBUTE__ATRIBUTO_ES_DE = eINSTANCE.getRAttribute_AtributoEsDe();

		/**
		 * The meta object literal for the '<em><b>Rhas Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATTRIBUTE__RHAS_ATTRIBUTE = eINSTANCE.getRAttribute_RhasAttribute();

	}

} //ModelunoPackage
