/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.Attributes;
import Modeldos.modeldos.Derived;
import Modeldos.modeldos.Form;
import Modeldos.modeldos.Group;
import Modeldos.modeldos.Menu;
import Modeldos.modeldos.ModeldosFactory;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.NotDerived;
import Modeldos.modeldos.Page;
import Modeldos.modeldos.RelationClass;
import Modeldos.modeldos.Root;
import Modeldos.modeldos.TypeAttributeForm;
import Modeldos.modeldos.TypeData;
import Modeldos.modeldos.TypeOrientation;
import Modeldos.modeldos.TypeRol;
import Modeldos.modeldos.TypeService;
import Modeldos.modeldos.Views;
import Modeldos.modeldos.typeHorizontalPosition;
import Modeldos.modeldos.typePresentation;

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
public class ModeldosPackageImpl extends EPackageImpl implements ModeldosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

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
	private EClass attributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notDerivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

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
	private EClass formEClass = null;

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
	private EEnum typeRolEEnum = null;

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
	private EEnum typeDataEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typePresentationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeHorizontalPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOrientationEEnum = null;

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
	 * @see Modeldos.modeldos.ModeldosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModeldosPackageImpl() {
		super(eNS_URI, ModeldosFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModeldosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModeldosPackage init() {
		if (isInited) return (ModeldosPackage)EPackage.Registry.INSTANCE.getEPackage(ModeldosPackage.eNS_URI);

		// Obtain or create and register package
		ModeldosPackageImpl theModeldosPackage = (ModeldosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModeldosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModeldosPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModeldosPackage.createPackageContents();

		// Initialize created meta-data
		theModeldosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModeldosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModeldosPackage.eNS_URI, theModeldosPackage);
		return theModeldosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Class() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Attribute() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Menu() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Group() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Views() {
		return (EReference)rootEClass.getEStructuralFeatures().get(4);
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
	public EReference getClass_HasAttributes() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Id() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_FunctionCreate() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_FunctionDelete() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_FunctionUpdate() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_FunctionIndex() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_FunctionView() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_FunctionAdmin() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_HasRelationClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_GoRelationClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_HasView() {
		return (EReference)classEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributes() {
		return attributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_Name() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_Rol() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_Value() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_PrimaryKey() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_DataType() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_InTheForm() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerived() {
		return derivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerived_Comment() {
		return (EAttribute)derivedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerived_Formula() {
		return (EAttribute)derivedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotDerived() {
		return notDerivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotDerived_DefaultValue() {
		return (EAttribute)notDerivedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationClass() {
		return relationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationClass_Name() {
		return (EAttribute)relationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationClass_TypePresentation() {
		return (EAttribute)relationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationClass_PositionHorizotal() {
		return (EAttribute)relationClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationClass_PositionVertical() {
		return (EAttribute)relationClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClass_FromClass() {
		return (EReference)relationClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClass_AttributeGet() {
		return (EReference)relationClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClass_AttributeReplace() {
		return (EReference)relationClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClass_AttributeSave() {
		return (EReference)relationClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_HasGroup() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Name() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Orientated() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Name() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Order() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getViews_RolView() {
		return (EAttribute)viewsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_HasRelationClass() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_ViewGoRelationClass() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_GroupName() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Name() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Service() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPage_Content() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRol() {
		return typeRolEEnum;
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
	public EEnum getTypeData() {
		return typeDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettypePresentation() {
		return typePresentationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettypeHorizontalPosition() {
		return typeHorizontalPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeService() {
		return typeServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeOrientation() {
		return typeOrientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeldosFactory getModeldosFactory() {
		return (ModeldosFactory)getEFactoryInstance();
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
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__CLASS);
		createEReference(rootEClass, ROOT__ATTRIBUTE);
		createEReference(rootEClass, ROOT__MENU);
		createEReference(rootEClass, ROOT__GROUP);
		createEReference(rootEClass, ROOT__VIEWS);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__HAS_ATTRIBUTES);
		createEAttribute(classEClass, CLASS__NAME);
		createEAttribute(classEClass, CLASS__ID);
		createEAttribute(classEClass, CLASS__FUNCTION_CREATE);
		createEAttribute(classEClass, CLASS__FUNCTION_DELETE);
		createEAttribute(classEClass, CLASS__FUNCTION_UPDATE);
		createEAttribute(classEClass, CLASS__FUNCTION_INDEX);
		createEAttribute(classEClass, CLASS__FUNCTION_VIEW);
		createEAttribute(classEClass, CLASS__FUNCTION_ADMIN);
		createEReference(classEClass, CLASS__HAS_RELATION_CLASS);
		createEReference(classEClass, CLASS__GO_RELATION_CLASS);
		createEReference(classEClass, CLASS__HAS_VIEW);

		attributesEClass = createEClass(ATTRIBUTES);
		createEAttribute(attributesEClass, ATTRIBUTES__NAME);
		createEAttribute(attributesEClass, ATTRIBUTES__ROL);
		createEAttribute(attributesEClass, ATTRIBUTES__VALUE);
		createEAttribute(attributesEClass, ATTRIBUTES__PRIMARY_KEY);
		createEAttribute(attributesEClass, ATTRIBUTES__DATA_TYPE);
		createEAttribute(attributesEClass, ATTRIBUTES__IN_THE_FORM);

		derivedEClass = createEClass(DERIVED);
		createEAttribute(derivedEClass, DERIVED__COMMENT);
		createEAttribute(derivedEClass, DERIVED__FORMULA);

		notDerivedEClass = createEClass(NOT_DERIVED);
		createEAttribute(notDerivedEClass, NOT_DERIVED__DEFAULT_VALUE);

		relationClassEClass = createEClass(RELATION_CLASS);
		createEAttribute(relationClassEClass, RELATION_CLASS__NAME);
		createEAttribute(relationClassEClass, RELATION_CLASS__TYPE_PRESENTATION);
		createEAttribute(relationClassEClass, RELATION_CLASS__POSITION_HORIZOTAL);
		createEAttribute(relationClassEClass, RELATION_CLASS__POSITION_VERTICAL);
		createEReference(relationClassEClass, RELATION_CLASS__FROM_CLASS);
		createEReference(relationClassEClass, RELATION_CLASS__ATTRIBUTE_GET);
		createEReference(relationClassEClass, RELATION_CLASS__ATTRIBUTE_REPLACE);
		createEReference(relationClassEClass, RELATION_CLASS__ATTRIBUTE_SAVE);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__HAS_GROUP);
		createEAttribute(menuEClass, MENU__NAME);
		createEAttribute(menuEClass, MENU__ORIENTATED);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__NAME);
		createEAttribute(groupEClass, GROUP__ORDER);

		viewsEClass = createEClass(VIEWS);
		createEAttribute(viewsEClass, VIEWS__TITLE);
		createEAttribute(viewsEClass, VIEWS__ROL_VIEW);
		createEReference(viewsEClass, VIEWS__HAS_RELATION_CLASS);
		createEReference(viewsEClass, VIEWS__VIEW_GO_RELATION_CLASS);
		createEReference(viewsEClass, VIEWS__GROUP_NAME);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__NAME);
		createEAttribute(formEClass, FORM__SERVICE);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__CONTENT);

		// Create enums
		typeRolEEnum = createEEnum(TYPE_ROL);
		typeAttributeFormEEnum = createEEnum(TYPE_ATTRIBUTE_FORM);
		typeDataEEnum = createEEnum(TYPE_DATA);
		typePresentationEEnum = createEEnum(TYPE_PRESENTATION);
		typeHorizontalPositionEEnum = createEEnum(TYPE_HORIZONTAL_POSITION);
		typeServiceEEnum = createEEnum(TYPE_SERVICE);
		typeOrientationEEnum = createEEnum(TYPE_ORIENTATION);
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
		derivedEClass.getESuperTypes().add(this.getAttributes());
		notDerivedEClass.getESuperTypes().add(this.getAttributes());
		formEClass.getESuperTypes().add(this.getViews());
		pageEClass.getESuperTypes().add(this.getViews());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Class(), this.getClass_(), null, "class", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Attribute(), this.getAttributes(), null, "attribute", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Menu(), this.getMenu(), null, "menu", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Group(), this.getGroup(), null, "group", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Views(), this.getViews(), null, "views", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, Modeldos.modeldos.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_HasAttributes(), this.getAttributes(), null, "hasAttributes", null, 0, 15, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionCreate(), this.getTypeRol(), "functionCreate", "authenticated", 0, 1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionDelete(), this.getTypeRol(), "functionDelete", "authenticated", 0, 1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionUpdate(), this.getTypeRol(), "functionUpdate", "authenticated", 0, 1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionIndex(), this.getTypeRol(), "functionIndex", "any", 0, 1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionView(), this.getTypeRol(), "functionView", "any", 0, 1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionAdmin(), this.getTypeRol(), "functionAdmin", "admin", 0, 1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_HasRelationClass(), this.getRelationClass(), null, "hasRelationClass", null, 0, -1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_GoRelationClass(), this.getRelationClass(), null, "goRelationClass", null, 0, -1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_HasView(), this.getViews(), null, "hasView", null, 0, 1, Modeldos.modeldos.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributes_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_Rol(), this.getTypeRol(), "rol", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_Value(), ecorePackage.getEString(), "value", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_PrimaryKey(), ecorePackage.getEBoolean(), "primaryKey", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_DataType(), this.getTypeData(), "dataType", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_InTheForm(), this.getTypeAttributeForm(), "inTheForm", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedEClass, Derived.class, "Derived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerived_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Derived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerived_Formula(), ecorePackage.getEString(), "formula", null, 0, 1, Derived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notDerivedEClass, NotDerived.class, "NotDerived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotDerived_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, NotDerived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationClassEClass, RelationClass.class, "RelationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationClass_TypePresentation(), this.gettypePresentation(), "typePresentation", "string", 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationClass_PositionHorizotal(), this.gettypeHorizontalPosition(), "positionHorizotal", "center", 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationClass_PositionVertical(), ecorePackage.getEInt(), "positionVertical", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClass_FromClass(), this.getClass_(), null, "fromClass", null, 0, -1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClass_AttributeGet(), this.getAttributes(), null, "attributeGet", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClass_AttributeReplace(), this.getAttributes(), null, "attributeReplace", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClass_AttributeSave(), this.getAttributes(), null, "attributeSave", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_HasGroup(), this.getGroup(), null, "hasGroup", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_Name(), ecorePackage.getEString(), "name", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_Orientated(), this.getTypeOrientation(), "orientated", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewsEClass, Views.class, "Views", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViews_Title(), ecorePackage.getEString(), "title", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViews_RolView(), this.getTypeRol(), "rolView", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_HasRelationClass(), this.getRelationClass(), null, "hasRelationClass", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_ViewGoRelationClass(), this.getRelationClass(), null, "viewGoRelationClass", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_GroupName(), this.getGroup(), null, "groupName", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Service(), this.getTypeService(), "service", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Content(), ecorePackage.getEString(), "Content", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeRolEEnum, TypeRol.class, "TypeRol");
		addEEnumLiteral(typeRolEEnum, TypeRol.ANONYMOUS);
		addEEnumLiteral(typeRolEEnum, TypeRol.AUTHENTICATED);
		addEEnumLiteral(typeRolEEnum, TypeRol.ADMIN);
		addEEnumLiteral(typeRolEEnum, TypeRol.ANY);

		initEEnum(typeAttributeFormEEnum, TypeAttributeForm.class, "TypeAttributeForm");
		addEEnumLiteral(typeAttributeFormEEnum, TypeAttributeForm.REQUIRED);
		addEEnumLiteral(typeAttributeFormEEnum, TypeAttributeForm.NOT_REQUIRED);

		initEEnum(typeDataEEnum, TypeData.class, "TypeData");
		addEEnumLiteral(typeDataEEnum, TypeData.NUMERIC);
		addEEnumLiteral(typeDataEEnum, TypeData.TEXT);
		addEEnumLiteral(typeDataEEnum, TypeData.AUTOINCREMENTAL);
		addEEnumLiteral(typeDataEEnum, TypeData.IMG);
		addEEnumLiteral(typeDataEEnum, TypeData.TIME);
		addEEnumLiteral(typeDataEEnum, TypeData.DATE);
		addEEnumLiteral(typeDataEEnum, TypeData.DATE_TIME);

		initEEnum(typePresentationEEnum, typePresentation.class, "typePresentation");
		addEEnumLiteral(typePresentationEEnum, typePresentation.STRING);
		addEEnumLiteral(typePresentationEEnum, typePresentation.TABLE);
		addEEnumLiteral(typePresentationEEnum, typePresentation.COMBOBOX);
		addEEnumLiteral(typePresentationEEnum, typePresentation.RADIOBUTTOM);
		addEEnumLiteral(typePresentationEEnum, typePresentation.CHECKBOX);
		addEEnumLiteral(typePresentationEEnum, typePresentation.ITEM_LIST);

		initEEnum(typeHorizontalPositionEEnum, typeHorizontalPosition.class, "typeHorizontalPosition");
		addEEnumLiteral(typeHorizontalPositionEEnum, typeHorizontalPosition.LEFT);
		addEEnumLiteral(typeHorizontalPositionEEnum, typeHorizontalPosition.CENTER);
		addEEnumLiteral(typeHorizontalPositionEEnum, typeHorizontalPosition.RIGHT);

		initEEnum(typeServiceEEnum, TypeService.class, "TypeService");
		addEEnumLiteral(typeServiceEEnum, TypeService.CREATE);
		addEEnumLiteral(typeServiceEEnum, TypeService.UPDATE_ATTRIBUTE);
		addEEnumLiteral(typeServiceEEnum, TypeService.UPDATE_OBJECT);
		addEEnumLiteral(typeServiceEEnum, TypeService.DISPLAY_OBJECTS);
		addEEnumLiteral(typeServiceEEnum, TypeService.DISPLAY_OBJECT);
		addEEnumLiteral(typeServiceEEnum, TypeService.ADMIN);

		initEEnum(typeOrientationEEnum, TypeOrientation.class, "TypeOrientation");
		addEEnumLiteral(typeOrientationEEnum, TypeOrientation.TOP_HORIZONTAL);
		addEEnumLiteral(typeOrientationEEnum, TypeOrientation.BOTTOM_HORIZONTAL);
		addEEnumLiteral(typeOrientationEEnum, TypeOrientation.LEFT_VERTICAL);
		addEEnumLiteral(typeOrientationEEnum, TypeOrientation.RIGHT_VERTICAL);

		// Create resource
		createResource(eNS_URI);
	}

} //ModeldosPackageImpl
