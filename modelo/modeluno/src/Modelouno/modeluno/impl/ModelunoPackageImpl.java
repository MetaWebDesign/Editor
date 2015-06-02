/**
 */
package Modelouno.modeluno.impl;

import Modelouno.modeluno.Admin;
import Modelouno.modeluno.Attribute;
import Modelouno.modeluno.Attribute_Derived;
import Modelouno.modeluno.Attribute_Not_Derived;
import Modelouno.modeluno.Create;
import Modelouno.modeluno.Delete;
import Modelouno.modeluno.Index;
import Modelouno.modeluno.Map;
import Modelouno.modeluno.ModelunoFactory;
import Modelouno.modeluno.ModelunoPackage;
import Modelouno.modeluno.Page;
import Modelouno.modeluno.PresetationUnit;
import Modelouno.modeluno.Relation_Attribute;
import Modelouno.modeluno.Relation_Class;
import Modelouno.modeluno.Relation_Service;
import Modelouno.modeluno.Relation_View;
import Modelouno.modeluno.Rol;
import Modelouno.modeluno.Service;
import Modelouno.modeluno.TypeAttributeForm;
import Modelouno.modeluno.TypesAlert;
import Modelouno.modeluno.TypesView;
import Modelouno.modeluno.UpdateAttribute;
import Modelouno.modeluno.UpdateObject;
import Modelouno.modeluno.View;
import Modelouno.modeluno.ViewAdmin;
import Modelouno.modeluno.ViewAttribute;
import Modelouno.modeluno.ViewIndex;
import Modelouno.modeluno.ViewInput;
import Modelouno.modeluno.ViewUpdateAttribute;
import Modelouno.modeluno.ViewUpdateObject;
import Modelouno.modeluno.Views;
import Modelouno.modeluno.dataTypes;
import Modelouno.modeluno.typeHorizotalPosition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelunoPackageImpl extends EPackageImpl implements ModelunoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relation_ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relation_AttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute_Not_DerivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute_DerivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relation_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewUpdateObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewUpdateAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relation_ViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presetationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeAttributeFormEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typesViewEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeHorizotalPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typesAlertEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Modelouno.modeluno.ModelunoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelunoPackageImpl() {
		super(eNS_URI, ModelunoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelunoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelunoPackage init() {
		if (isInited) return (ModelunoPackage)EPackage.Registry.INSTANCE.getEPackage(ModelunoPackage.eNS_URI);

		// Obtain or create and register package
		ModelunoPackageImpl theModelunoPackage = (ModelunoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelunoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelunoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelunoPackage.createPackageContents();

		// Initialize created meta-data
		theModelunoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelunoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelunoPackage.eNS_URI, theModelunoPackage);
		return theModelunoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Root_hasClass() {
		return (EReference)mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Root_hasAtributte() {
		return (EReference)mapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_RootHasViews() {
		return (EReference)mapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_RoothasService() {
		return (EReference)mapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_HasRelation() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_GoRelation() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Cname() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IdFunction() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_GoAtributteRelation() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_HasAtributeRelation() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_HasServiceRelation() {
		return (EReference)classEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_GoServiceRelation() {
		return (EReference)classEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation_Class() {
		return relation_ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Class_GoClass() {
		return (EReference)relation_ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_PrimaryKey() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Aname() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_DataType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Rol() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_InTheForm() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Valor() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Has() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_HasPresentationUnit() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_AgoToPU() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation_Attribute() {
		return relation_AttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Attribute_GoAttribute() {
		return (EReference)relation_AttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Attribute_RhasAttribute() {
		return (EReference)relation_AttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute_Not_Derived() {
		return attribute_Not_DerivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Not_Derived_DefaultValue() {
		return (EAttribute)attribute_Not_DerivedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute_Derived() {
		return attribute_DerivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Derived_DerivationComments() {
		return (EAttribute)attribute_DerivedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Derived_Formula() {
		return (EAttribute)attribute_DerivedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Rol() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_HasRelationView() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_GoToRelationView() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation_Service() {
		return relation_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Service_RhasService() {
		return (EReference)relation_ServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Service_GoService() {
		return (EReference)relation_ServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreate_Name() {
		return (EAttribute)createEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreate_HasViewFormInput() {
		return (EReference)createEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelete_Name() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateObject() {
		return updateObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateObject_Name() {
		return (EAttribute)updateObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateObject_HasViewUpdateObject() {
		return (EReference)updateObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAttribute() {
		return updateAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateAttribute_Name() {
		return (EAttribute)updateAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAttribute_HasViewUpdateObject() {
		return (EReference)updateAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Name() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndex_HasViewIndex() {
		return (EReference)indexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Name() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_HasViewAttribute() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdmin_Name() {
		return (EAttribute)adminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdmin_HasViewAdmin() {
		return (EReference)adminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViews() {
		return viewsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViews_Title() {
		return (EAttribute)viewsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViews_Group() {
		return (EAttribute)viewsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewInput() {
		return viewInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewInput_Name() {
		return (EAttribute)viewInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewUpdateObject() {
		return viewUpdateObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewUpdateObject_Name() {
		return (EAttribute)viewUpdateObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewUpdateAttribute() {
		return viewUpdateAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewUpdateAttribute_Name() {
		return (EAttribute)viewUpdateAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewIndex() {
		return viewIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewIndex_Name() {
		return (EAttribute)viewIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewAttribute() {
		return viewAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAttribute_Name() {
		return (EAttribute)viewAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewAdmin() {
		return viewAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAdmin_Name() {
		return (EAttribute)viewAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation_View() {
		return relation_ViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_View_RhasView() {
		return (EReference)relation_ViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_View_GoToView() {
		return (EReference)relation_ViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Rol() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresetationUnit() {
		return presetationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresetationUnit_Name_field() {
		return (EAttribute)presetationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresetationUnit_Type() {
		return (EAttribute)presetationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresetationUnit_HorizontalPosition() {
		return (EAttribute)presetationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresetationUnit_VerticalPosition() {
		return (EAttribute)presetationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresetationUnit_PUhasViews() {
		return (EReference)presetationUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresetationUnit_PUgoToViews() {
		return (EReference)presetationUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRol() {
		return rolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeAttributeForm() {
		return typeAttributeFormEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getdataTypes() {
		return dataTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypesView() {
		return typesViewEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettypeHorizotalPosition() {
		return typeHorizotalPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypesAlert() {
		return typesAlertEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelunoFactory getModelunoFactory() {
		return (ModelunoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__ROOT_HAS_CLASS);
		createEReference(mapEClass, MAP__ROOT_HAS_ATRIBUTTE);
		createEReference(mapEClass, MAP__ROOT_HAS_VIEWS);
		createEReference(mapEClass, MAP__ROOTHAS_SERVICE);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__HAS_RELATION);
		createEReference(classEClass, CLASS__GO_RELATION);
		createEAttribute(classEClass, CLASS__CNAME);
		createEAttribute(classEClass, CLASS__ID_FUNCTION);
		createEReference(classEClass, CLASS__GO_ATRIBUTTE_RELATION);
		createEReference(classEClass, CLASS__HAS_ATRIBUTE_RELATION);
		createEReference(classEClass, CLASS__HAS_SERVICE_RELATION);
		createEReference(classEClass, CLASS__GO_SERVICE_RELATION);

		relation_ClassEClass = createEClass(RELATION_CLASS);
		createEReference(relation_ClassEClass, RELATION_CLASS__GO_CLASS);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__PRIMARY_KEY);
		createEAttribute(attributeEClass, ATTRIBUTE__ANAME);
		createEAttribute(attributeEClass, ATTRIBUTE__DATA_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__ROL);
		createEAttribute(attributeEClass, ATTRIBUTE__IN_THE_FORM);
		createEAttribute(attributeEClass, ATTRIBUTE__VALOR);
		createEReference(attributeEClass, ATTRIBUTE__HAS);
		createEReference(attributeEClass, ATTRIBUTE__HAS_PRESENTATION_UNIT);
		createEReference(attributeEClass, ATTRIBUTE__AGO_TO_PU);

		relation_AttributeEClass = createEClass(RELATION_ATTRIBUTE);
		createEReference(relation_AttributeEClass, RELATION_ATTRIBUTE__GO_ATTRIBUTE);
		createEReference(relation_AttributeEClass, RELATION_ATTRIBUTE__RHAS_ATTRIBUTE);

		attribute_Not_DerivedEClass = createEClass(ATTRIBUTE_NOT_DERIVED);
		createEAttribute(attribute_Not_DerivedEClass, ATTRIBUTE_NOT_DERIVED__DEFAULT_VALUE);

		attribute_DerivedEClass = createEClass(ATTRIBUTE_DERIVED);
		createEAttribute(attribute_DerivedEClass, ATTRIBUTE_DERIVED__DERIVATION_COMMENTS);
		createEAttribute(attribute_DerivedEClass, ATTRIBUTE_DERIVED__FORMULA);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__ROL);
		createEReference(serviceEClass, SERVICE__HAS_RELATION_VIEW);
		createEReference(serviceEClass, SERVICE__GO_TO_RELATION_VIEW);

		relation_ServiceEClass = createEClass(RELATION_SERVICE);
		createEReference(relation_ServiceEClass, RELATION_SERVICE__RHAS_SERVICE);
		createEReference(relation_ServiceEClass, RELATION_SERVICE__GO_SERVICE);

		createEClass = createEClass(CREATE);
		createEAttribute(createEClass, CREATE__NAME);
		createEReference(createEClass, CREATE__HAS_VIEW_FORM_INPUT);

		deleteEClass = createEClass(DELETE);
		createEAttribute(deleteEClass, DELETE__NAME);

		updateObjectEClass = createEClass(UPDATE_OBJECT);
		createEAttribute(updateObjectEClass, UPDATE_OBJECT__NAME);
		createEReference(updateObjectEClass, UPDATE_OBJECT__HAS_VIEW_UPDATE_OBJECT);

		updateAttributeEClass = createEClass(UPDATE_ATTRIBUTE);
		createEAttribute(updateAttributeEClass, UPDATE_ATTRIBUTE__NAME);
		createEReference(updateAttributeEClass, UPDATE_ATTRIBUTE__HAS_VIEW_UPDATE_OBJECT);

		indexEClass = createEClass(INDEX);
		createEAttribute(indexEClass, INDEX__NAME);
		createEReference(indexEClass, INDEX__HAS_VIEW_INDEX);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__NAME);
		createEReference(viewEClass, VIEW__HAS_VIEW_ATTRIBUTE);

		adminEClass = createEClass(ADMIN);
		createEAttribute(adminEClass, ADMIN__NAME);
		createEReference(adminEClass, ADMIN__HAS_VIEW_ADMIN);

		viewsEClass = createEClass(VIEWS);
		createEAttribute(viewsEClass, VIEWS__TITLE);
		createEAttribute(viewsEClass, VIEWS__GROUP);

		viewInputEClass = createEClass(VIEW_INPUT);
		createEAttribute(viewInputEClass, VIEW_INPUT__NAME);

		viewUpdateObjectEClass = createEClass(VIEW_UPDATE_OBJECT);
		createEAttribute(viewUpdateObjectEClass, VIEW_UPDATE_OBJECT__NAME);

		viewUpdateAttributeEClass = createEClass(VIEW_UPDATE_ATTRIBUTE);
		createEAttribute(viewUpdateAttributeEClass, VIEW_UPDATE_ATTRIBUTE__NAME);

		viewIndexEClass = createEClass(VIEW_INDEX);
		createEAttribute(viewIndexEClass, VIEW_INDEX__NAME);

		viewAttributeEClass = createEClass(VIEW_ATTRIBUTE);
		createEAttribute(viewAttributeEClass, VIEW_ATTRIBUTE__NAME);

		viewAdminEClass = createEClass(VIEW_ADMIN);
		createEAttribute(viewAdminEClass, VIEW_ADMIN__NAME);

		relation_ViewEClass = createEClass(RELATION_VIEW);
		createEReference(relation_ViewEClass, RELATION_VIEW__RHAS_VIEW);
		createEReference(relation_ViewEClass, RELATION_VIEW__GO_TO_VIEW);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__ROL);

		presetationUnitEClass = createEClass(PRESETATION_UNIT);
		createEAttribute(presetationUnitEClass, PRESETATION_UNIT__NAME_FIELD);
		createEAttribute(presetationUnitEClass, PRESETATION_UNIT__TYPE);
		createEAttribute(presetationUnitEClass, PRESETATION_UNIT__HORIZONTAL_POSITION);
		createEAttribute(presetationUnitEClass, PRESETATION_UNIT__VERTICAL_POSITION);
		createEReference(presetationUnitEClass, PRESETATION_UNIT__PUHAS_VIEWS);
		createEReference(presetationUnitEClass, PRESETATION_UNIT__PUGO_TO_VIEWS);

		// Create enums
		rolEEnum = createEEnum(ROL);
		typeAttributeFormEEnum = createEEnum(TYPE_ATTRIBUTE_FORM);
		dataTypesEEnum = createEEnum(DATA_TYPES);
		typesViewEEnum = createEEnum(TYPES_VIEW);
		typeHorizotalPositionEEnum = createEEnum(TYPE_HORIZOTAL_POSITION);
		typesAlertEEnum = createEEnum(TYPES_ALERT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attribute_Not_DerivedEClass.getESuperTypes().add(this.getAttribute());
		attribute_DerivedEClass.getESuperTypes().add(this.getAttribute());
		createEClass.getESuperTypes().add(this.getService());
		deleteEClass.getESuperTypes().add(this.getService());
		updateObjectEClass.getESuperTypes().add(this.getService());
		updateAttributeEClass.getESuperTypes().add(this.getService());
		indexEClass.getESuperTypes().add(this.getService());
		viewEClass.getESuperTypes().add(this.getService());
		adminEClass.getESuperTypes().add(this.getService());
		viewInputEClass.getESuperTypes().add(this.getViews());
		viewUpdateObjectEClass.getESuperTypes().add(this.getViews());
		viewUpdateAttributeEClass.getESuperTypes().add(this.getViews());
		viewIndexEClass.getESuperTypes().add(this.getViews());
		viewAttributeEClass.getESuperTypes().add(this.getViews());
		viewAdminEClass.getESuperTypes().add(this.getViews());
		pageEClass.getESuperTypes().add(this.getViews());

		// Initialize classes, features, and operations; add parameters
		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMap_Root_hasClass(), this.getClass_(), null, "Root_hasClass", null, 0, -1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_Root_hasAtributte(), this.getAttribute(), null, "Root_hasAtributte", null, 0, -1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_RootHasViews(), this.getViews(), null, "RootHasViews", null, 0, -1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_RoothasService(), this.getService(), null, "RoothasService", null, 0, -1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, Modelouno.modeluno.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_HasRelation(), this.getRelation_Class(), null, "hasRelation", null, 0, -1, Modelouno.modeluno.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_GoRelation(), this.getRelation_Class(), null, "goRelation", null, 0, -1, Modelouno.modeluno.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Cname(), ecorePackage.getEString(), "Cname", null, 0, 1, Modelouno.modeluno.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_IdFunction(), ecorePackage.getEString(), "idFunction", null, 0, 1, Modelouno.modeluno.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_GoAtributteRelation(), this.getRelation_Attribute(), null, "goAtributteRelation", null, 0, 1, Modelouno.modeluno.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_HasAtributeRelation(), this.getRelation_Attribute(), null, "hasAtributeRelation", null, 0, -1, Modelouno.modeluno.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_HasServiceRelation(), this.getRelation_Service(), null, "hasServiceRelation", null, 0, 7, Modelouno.modeluno.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_GoServiceRelation(), this.getRelation_Service(), null, "goServiceRelation", null, 0, 7, Modelouno.modeluno.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relation_ClassEClass, Relation_Class.class, "Relation_Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Class_GoClass(), this.getClass_(), null, "goClass", null, 0, -1, Relation_Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_PrimaryKey(), ecorePackage.getEBoolean(), "PrimaryKey", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Aname(), ecorePackage.getEString(), "aname", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Rol(), this.getRol(), "rol", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_InTheForm(), this.getTypeAttributeForm(), "inTheForm", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Has(), this.getPresetationUnit(), null, "has", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_HasPresentationUnit(), this.getPresetationUnit(), null, "hasPresentationUnit", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_AgoToPU(), this.getPresetationUnit(), null, "AgoToPU", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relation_AttributeEClass, Relation_Attribute.class, "Relation_Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Attribute_GoAttribute(), this.getAttribute(), null, "goAttribute", null, 0, 1, Relation_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Attribute_RhasAttribute(), this.getAttribute(), null, "RhasAttribute", null, 0, 1, Relation_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attribute_Not_DerivedEClass, Attribute_Not_Derived.class, "Attribute_Not_Derived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Not_Derived_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Attribute_Not_Derived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attribute_DerivedEClass, Attribute_Derived.class, "Attribute_Derived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Derived_DerivationComments(), ecorePackage.getEString(), "derivationComments", null, 0, 1, Attribute_Derived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Derived_Formula(), ecorePackage.getEString(), "Formula", null, 0, 1, Attribute_Derived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Rol(), this.getRol(), "rol", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_HasRelationView(), this.getRelation_View(), null, "hasRelationView", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_GoToRelationView(), this.getRelation_View(), null, "goToRelationView", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relation_ServiceEClass, Relation_Service.class, "Relation_Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Service_RhasService(), this.getService(), null, "RhasService", null, 0, 1, Relation_Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Service_GoService(), this.getService(), null, "goService", null, 0, 1, Relation_Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreate_Name(), ecorePackage.getEString(), "name", "Create", 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreate_HasViewFormInput(), this.getViewInput(), null, "hasViewFormInput", null, 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelete_Name(), ecorePackage.getEString(), "name", "Delete", 0, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateObjectEClass, UpdateObject.class, "UpdateObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateObject_Name(), ecorePackage.getEString(), "name", "UpdateObject", 0, 1, UpdateObject.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateObject_HasViewUpdateObject(), this.getViewUpdateObject(), null, "hasViewUpdateObject", null, 0, 1, UpdateObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateAttributeEClass, UpdateAttribute.class, "UpdateAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateAttribute_Name(), ecorePackage.getEString(), "name", "UpdateAttribute", 0, 1, UpdateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateAttribute_HasViewUpdateObject(), this.getViewUpdateAttribute(), null, "hasViewUpdateObject", null, 0, 1, UpdateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexEClass, Index.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndex_Name(), ecorePackage.getEString(), "name", "ListView", 0, 1, Index.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndex_HasViewIndex(), this.getViewIndex(), null, "hasViewIndex", null, 0, 1, Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", "View", 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_HasViewAttribute(), this.getViewAttribute(), null, "hasViewAttribute", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmin_Name(), ecorePackage.getEString(), "name", "Admin", 0, 1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmin_HasViewAdmin(), this.getViewAdmin(), null, "hasViewAdmin", null, 0, 1, Admin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewsEClass, Views.class, "Views", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViews_Title(), ecorePackage.getEString(), "title", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViews_Group(), ecorePackage.getEString(), "group", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewInputEClass, ViewInput.class, "ViewInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewInput_Name(), ecorePackage.getEString(), "name", "ViewFormInput", 0, 1, ViewInput.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewUpdateObjectEClass, ViewUpdateObject.class, "ViewUpdateObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewUpdateObject_Name(), ecorePackage.getEString(), "name", "ViewUpdateObject", 0, 1, ViewUpdateObject.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewUpdateAttributeEClass, ViewUpdateAttribute.class, "ViewUpdateAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewUpdateAttribute_Name(), ecorePackage.getEString(), "name", "ViewUpdateAttribute", 0, 1, ViewUpdateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewIndexEClass, ViewIndex.class, "ViewIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewIndex_Name(), ecorePackage.getEString(), "name", "ViewIndex", 0, 1, ViewIndex.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewAttributeEClass, ViewAttribute.class, "ViewAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewAttribute_Name(), ecorePackage.getEString(), "name", "ViewAttribute", 0, 1, ViewAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewAdminEClass, ViewAdmin.class, "ViewAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewAdmin_Name(), ecorePackage.getEString(), "name", "ViewAdmin", 0, 1, ViewAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relation_ViewEClass, Relation_View.class, "Relation_View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_View_RhasView(), this.getViews(), null, "RhasView", null, 0, 1, Relation_View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_View_GoToView(), this.getViews(), null, "goToView", null, 0, 1, Relation_View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Rol(), ecorePackage.getEString(), "rol", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presetationUnitEClass, PresetationUnit.class, "PresetationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresetationUnit_Name_field(), ecorePackage.getEString(), "name_field", null, 0, 1, PresetationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresetationUnit_Type(), this.getTypesView(), "type", null, 0, 1, PresetationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresetationUnit_HorizontalPosition(), this.gettypeHorizotalPosition(), "HorizontalPosition", null, 0, 1, PresetationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresetationUnit_VerticalPosition(), ecorePackage.getEString(), "VerticalPosition", null, 0, 1, PresetationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresetationUnit_PUhasViews(), this.getViews(), null, "PUhasViews", null, 0, 1, PresetationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresetationUnit_PUgoToViews(), this.getViews(), null, "PUgoToViews", null, 0, 1, PresetationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(rolEEnum, Rol.class, "Rol");
		addEEnumLiteral(rolEEnum, Rol.ANONYMOUS);
		addEEnumLiteral(rolEEnum, Rol.AUTHHENTICATED);
		addEEnumLiteral(rolEEnum, Rol.ADMIN);
		addEEnumLiteral(rolEEnum, Rol.ANY);

		initEEnum(typeAttributeFormEEnum, TypeAttributeForm.class, "TypeAttributeForm");
		addEEnumLiteral(typeAttributeFormEEnum, TypeAttributeForm.REQUIRED);
		addEEnumLiteral(typeAttributeFormEEnum, TypeAttributeForm.NOT_REQUIRED);

		initEEnum(dataTypesEEnum, dataTypes.class, "dataTypes");
		addEEnumLiteral(dataTypesEEnum, dataTypes.AUTONUMERIC);
		addEEnumLiteral(dataTypesEEnum, dataTypes.IMG);
		addEEnumLiteral(dataTypesEEnum, dataTypes.DATE);
		addEEnumLiteral(dataTypesEEnum, dataTypes.INT);
		addEEnumLiteral(dataTypesEEnum, dataTypes.STRING);
		addEEnumLiteral(dataTypesEEnum, dataTypes.FLOAT);
		addEEnumLiteral(dataTypesEEnum, dataTypes.TIME);
		addEEnumLiteral(dataTypesEEnum, dataTypes.VIDEO);
		addEEnumLiteral(dataTypesEEnum, dataTypes.FLASH);

		initEEnum(typesViewEEnum, TypesView.class, "TypesView");
		addEEnumLiteral(typesViewEEnum, TypesView.COMBO_BOX);
		addEEnumLiteral(typesViewEEnum, TypesView.CHECKBOX);
		addEEnumLiteral(typesViewEEnum, TypesView.RADIO_BUTTOM);
		addEEnumLiteral(typesViewEEnum, TypesView.TEXT);
		addEEnumLiteral(typesViewEEnum, TypesView.LIST);
		addEEnumLiteral(typesViewEEnum, TypesView.THUMBNAIL_LABE);
		addEEnumLiteral(typesViewEEnum, TypesView.TABLE);

		initEEnum(typeHorizotalPositionEEnum, typeHorizotalPosition.class, "typeHorizotalPosition");
		addEEnumLiteral(typeHorizotalPositionEEnum, typeHorizotalPosition.LEFT);
		addEEnumLiteral(typeHorizotalPositionEEnum, typeHorizotalPosition.CENTER);
		addEEnumLiteral(typeHorizotalPositionEEnum, typeHorizotalPosition.RIGHT);

		initEEnum(typesAlertEEnum, TypesAlert.class, "TypesAlert");
		addEEnumLiteral(typesAlertEEnum, TypesAlert.SUCCESSFULLY);
		addEEnumLiteral(typesAlertEEnum, TypesAlert.ATTENTION);
		addEEnumLiteral(typesAlertEEnum, TypesAlert.WARNING);
		addEEnumLiteral(typesAlertEEnum, TypesAlert.ERROR);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelunoPackageImpl
