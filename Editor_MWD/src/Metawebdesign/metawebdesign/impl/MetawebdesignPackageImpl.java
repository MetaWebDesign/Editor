/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.Constraint;
import Metawebdesign.metawebdesign.Derived;
import Metawebdesign.metawebdesign.Form;
import Metawebdesign.metawebdesign.Link;
import Metawebdesign.metawebdesign.LinkView;
import Metawebdesign.metawebdesign.LinkViewCRUD;
import Metawebdesign.metawebdesign.MetawebdesignFactory;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.NavegationMenu;
import Metawebdesign.metawebdesign.NotDerived;
import Metawebdesign.metawebdesign.Page;
import Metawebdesign.metawebdesign.RelationClass;
import Metawebdesign.metawebdesign.RelationContraint;
import Metawebdesign.metawebdesign.RelationView;
import Metawebdesign.metawebdesign.Root;
import Metawebdesign.metawebdesign.TypeAttributeForm;
import Metawebdesign.metawebdesign.TypeData;
import Metawebdesign.metawebdesign.TypeOperator;
import Metawebdesign.metawebdesign.TypeOrientation;
import Metawebdesign.metawebdesign.TypeRol;
import Metawebdesign.metawebdesign.TypeService;
import Metawebdesign.metawebdesign.ViewAttribute;
import Metawebdesign.metawebdesign.ViewComponent;
import Metawebdesign.metawebdesign.Views;
import Metawebdesign.metawebdesign.typeCardinality;
import Metawebdesign.metawebdesign.typeHorizontalPosition;
import Metawebdesign.metawebdesign.typePresentation;
import Metawebdesign.metawebdesign.typeViewAttribute;

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
public class MetawebdesignPackageImpl extends EPackageImpl implements MetawebdesignPackage {
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
	private EClass relationViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewComponentEClass = null;

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
	private EClass navegationMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkViewCRUDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationContraintEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeViewAttributeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeCardinalityEEnum = null;

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
	 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetawebdesignPackageImpl() {
		super(eNS_URI, MetawebdesignFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetawebdesignPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetawebdesignPackage init() {
		if (isInited) return (MetawebdesignPackage)EPackage.Registry.INSTANCE.getEPackage(MetawebdesignPackage.eNS_URI);

		// Obtain or create and register package
		MetawebdesignPackageImpl theMetawebdesignPackage = (MetawebdesignPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetawebdesignPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetawebdesignPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMetawebdesignPackage.createPackageContents();

		// Initialize created meta-data
		theMetawebdesignPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetawebdesignPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetawebdesignPackage.eNS_URI, theMetawebdesignPackage);
		return theMetawebdesignPackage;
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
	public EReference getRoot_Views() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_View_component() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Link() {
		return (EReference)rootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Constraint() {
		return (EReference)rootEClass.getEStructuralFeatures().get(5);
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
	public EReference getClass_HasRelationConstraint() {
		return (EReference)classEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_GoRConstriant1() {
		return (EReference)classEClass.getEStructuralFeatures().get(13);
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
	public EAttribute getAttributes_PrimaryKey() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_DataType() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_InTheForm() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getNotDerived_ValueDefault() {
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
	public EReference getRelationClass_FromClass() {
		return (EReference)relationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClass_Attribute_Class_A() {
		return (EReference)relationClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClass_Attribute_Class_B() {
		return (EReference)relationClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationClass_Cardinality_Class_A() {
		return (EAttribute)relationClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationClass_Cardinality_Class_B() {
		return (EAttribute)relationClassEClass.getEStructuralFeatures().get(5);
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
	public EReference getViews_HasRelationView() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_FromRelation() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_HasViewComponent() {
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
	public EAttribute getForm_Service() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPage_Content_HTML() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationView() {
		return relationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationView_Name() {
		return (EAttribute)relationViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationView_RViewsHasClass() {
		return (EReference)relationViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationView_FromClass() {
		return (EReference)relationViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewComponent() {
		return viewComponentEClass;
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
	public EReference getViewAttribute_GetAttribute() {
		return (EReference)viewAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAttribute_TypePresentation() {
		return (EAttribute)viewAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAttribute_Name() {
		return (EAttribute)viewAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAttribute_PositionHorizontal() {
		return (EAttribute)viewAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAttribute_PostionVertical() {
		return (EAttribute)viewAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAttribute_From() {
		return (EAttribute)viewAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavegationMenu() {
		return navegationMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavegationMenu_HasLink() {
		return (EReference)navegationMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavegationMenu_Name() {
		return (EAttribute)navegationMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Name() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkViewCRUD() {
		return linkViewCRUDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkViewCRUD_Service() {
		return (EAttribute)linkViewCRUDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkViewCRUD_FromClass() {
		return (EReference)linkViewCRUDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkViewCRUD_FromRelation() {
		return (EReference)linkViewCRUDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkView() {
		return linkViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkView_LinkView() {
		return (EReference)linkViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Attribute() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Operator() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Service() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Name() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Value() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_MansajeError() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationContraint() {
		return relationContraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationContraint_RhasConstraint() {
		return (EReference)relationContraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationContraint_GoRConstraint2() {
		return (EReference)relationContraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationContraint_Name() {
		return (EAttribute)relationContraintEClass.getEStructuralFeatures().get(2);
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
	public EEnum getTypeOperator() {
		return typeOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettypeViewAttribute() {
		return typeViewAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettypeCardinality() {
		return typeCardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetawebdesignFactory getMetawebdesignFactory() {
		return (MetawebdesignFactory)getEFactoryInstance();
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
		createEReference(rootEClass, ROOT__VIEWS);
		createEReference(rootEClass, ROOT__VIEW_COMPONENT);
		createEReference(rootEClass, ROOT__LINK);
		createEReference(rootEClass, ROOT__CONSTRAINT);

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
		createEReference(classEClass, CLASS__HAS_RELATION_CONSTRAINT);
		createEReference(classEClass, CLASS__GO_RCONSTRIANT1);

		attributesEClass = createEClass(ATTRIBUTES);
		createEAttribute(attributesEClass, ATTRIBUTES__NAME);
		createEAttribute(attributesEClass, ATTRIBUTES__ROL);
		createEAttribute(attributesEClass, ATTRIBUTES__PRIMARY_KEY);
		createEAttribute(attributesEClass, ATTRIBUTES__DATA_TYPE);
		createEAttribute(attributesEClass, ATTRIBUTES__IN_THE_FORM);

		derivedEClass = createEClass(DERIVED);
		createEAttribute(derivedEClass, DERIVED__COMMENT);
		createEAttribute(derivedEClass, DERIVED__FORMULA);

		notDerivedEClass = createEClass(NOT_DERIVED);
		createEAttribute(notDerivedEClass, NOT_DERIVED__VALUE_DEFAULT);

		relationClassEClass = createEClass(RELATION_CLASS);
		createEAttribute(relationClassEClass, RELATION_CLASS__NAME);
		createEReference(relationClassEClass, RELATION_CLASS__FROM_CLASS);
		createEReference(relationClassEClass, RELATION_CLASS__ATTRIBUTE_CLASS_A);
		createEReference(relationClassEClass, RELATION_CLASS__ATTRIBUTE_CLASS_B);
		createEAttribute(relationClassEClass, RELATION_CLASS__CARDINALITY_CLASS_A);
		createEAttribute(relationClassEClass, RELATION_CLASS__CARDINALITY_CLASS_B);

		viewsEClass = createEClass(VIEWS);
		createEAttribute(viewsEClass, VIEWS__TITLE);
		createEAttribute(viewsEClass, VIEWS__ROL_VIEW);
		createEReference(viewsEClass, VIEWS__HAS_RELATION_VIEW);
		createEReference(viewsEClass, VIEWS__FROM_RELATION);
		createEReference(viewsEClass, VIEWS__HAS_VIEW_COMPONENT);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__SERVICE);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__CONTENT_HTML);

		relationViewEClass = createEClass(RELATION_VIEW);
		createEAttribute(relationViewEClass, RELATION_VIEW__NAME);
		createEReference(relationViewEClass, RELATION_VIEW__RVIEWS_HAS_CLASS);
		createEReference(relationViewEClass, RELATION_VIEW__FROM_CLASS);

		viewComponentEClass = createEClass(VIEW_COMPONENT);

		viewAttributeEClass = createEClass(VIEW_ATTRIBUTE);
		createEReference(viewAttributeEClass, VIEW_ATTRIBUTE__GET_ATTRIBUTE);
		createEAttribute(viewAttributeEClass, VIEW_ATTRIBUTE__TYPE_PRESENTATION);
		createEAttribute(viewAttributeEClass, VIEW_ATTRIBUTE__NAME);
		createEAttribute(viewAttributeEClass, VIEW_ATTRIBUTE__POSITION_HORIZONTAL);
		createEAttribute(viewAttributeEClass, VIEW_ATTRIBUTE__POSTION_VERTICAL);
		createEAttribute(viewAttributeEClass, VIEW_ATTRIBUTE__FROM);

		navegationMenuEClass = createEClass(NAVEGATION_MENU);
		createEReference(navegationMenuEClass, NAVEGATION_MENU__HAS_LINK);
		createEAttribute(navegationMenuEClass, NAVEGATION_MENU__NAME);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__NAME);

		linkViewCRUDEClass = createEClass(LINK_VIEW_CRUD);
		createEAttribute(linkViewCRUDEClass, LINK_VIEW_CRUD__SERVICE);
		createEReference(linkViewCRUDEClass, LINK_VIEW_CRUD__FROM_CLASS);
		createEReference(linkViewCRUDEClass, LINK_VIEW_CRUD__FROM_RELATION);

		linkViewEClass = createEClass(LINK_VIEW);
		createEReference(linkViewEClass, LINK_VIEW__LINK_VIEW);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__ATTRIBUTE);
		createEAttribute(constraintEClass, CONSTRAINT__OPERATOR);
		createEAttribute(constraintEClass, CONSTRAINT__SERVICE);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);
		createEReference(constraintEClass, CONSTRAINT__VALUE);
		createEAttribute(constraintEClass, CONSTRAINT__MANSAJE_ERROR);

		relationContraintEClass = createEClass(RELATION_CONTRAINT);
		createEReference(relationContraintEClass, RELATION_CONTRAINT__RHAS_CONSTRAINT);
		createEReference(relationContraintEClass, RELATION_CONTRAINT__GO_RCONSTRAINT2);
		createEAttribute(relationContraintEClass, RELATION_CONTRAINT__NAME);

		// Create enums
		typeRolEEnum = createEEnum(TYPE_ROL);
		typeAttributeFormEEnum = createEEnum(TYPE_ATTRIBUTE_FORM);
		typeDataEEnum = createEEnum(TYPE_DATA);
		typePresentationEEnum = createEEnum(TYPE_PRESENTATION);
		typeHorizontalPositionEEnum = createEEnum(TYPE_HORIZONTAL_POSITION);
		typeServiceEEnum = createEEnum(TYPE_SERVICE);
		typeOrientationEEnum = createEEnum(TYPE_ORIENTATION);
		typeOperatorEEnum = createEEnum(TYPE_OPERATOR);
		typeViewAttributeEEnum = createEEnum(TYPE_VIEW_ATTRIBUTE);
		typeCardinalityEEnum = createEEnum(TYPE_CARDINALITY);
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
		viewAttributeEClass.getESuperTypes().add(this.getViewComponent());
		navegationMenuEClass.getESuperTypes().add(this.getViewComponent());
		linkViewCRUDEClass.getESuperTypes().add(this.getLink());
		linkViewEClass.getESuperTypes().add(this.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Class(), this.getClass_(), null, "class", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Attribute(), this.getAttributes(), null, "attribute", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Views(), this.getViews(), null, "views", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_View_component(), this.getViewComponent(), null, "view_component", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Link(), this.getLink(), null, "link", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, Metawebdesign.metawebdesign.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_HasAttributes(), this.getAttributes(), null, "hasAttributes", null, 0, 15, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionCreate(), this.getTypeRol(), "functionCreate", "authenticated", 0, 1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionDelete(), this.getTypeRol(), "functionDelete", "authenticated", 0, 1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionUpdate(), this.getTypeRol(), "functionUpdate", "authenticated", 0, 1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionIndex(), this.getTypeRol(), "functionIndex", "any", 0, 1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionView(), this.getTypeRol(), "functionView", "any", 0, 1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_FunctionAdmin(), this.getTypeRol(), "functionAdmin", "admin", 0, 1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_HasRelationClass(), this.getRelationClass(), null, "hasRelationClass", null, 0, -1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_GoRelationClass(), this.getRelationClass(), null, "goRelationClass", null, 0, -1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_HasView(), this.getViews(), null, "hasView", null, 0, 1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_HasRelationConstraint(), this.getRelationContraint(), null, "hasRelationConstraint", null, 0, -1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_GoRConstriant1(), this.getRelationContraint(), null, "goRConstriant1", null, 0, -1, Metawebdesign.metawebdesign.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributes_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_Rol(), this.getTypeRol(), "rol", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_PrimaryKey(), ecorePackage.getEBoolean(), "PrimaryKey", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_DataType(), this.getTypeData(), "dataType", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_InTheForm(), this.getTypeAttributeForm(), "inTheForm", null, 0, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedEClass, Derived.class, "Derived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerived_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Derived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerived_Formula(), ecorePackage.getEString(), "formula", null, 0, 1, Derived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notDerivedEClass, NotDerived.class, "NotDerived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotDerived_ValueDefault(), ecorePackage.getEString(), "valueDefault", null, 0, 1, NotDerived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationClassEClass, RelationClass.class, "RelationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClass_FromClass(), this.getClass_(), null, "fromClass", null, 0, -1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClass_Attribute_Class_A(), this.getAttributes(), null, "Attribute_Class_A", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClass_Attribute_Class_B(), this.getAttributes(), null, "Attribute_Class_B", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationClass_Cardinality_Class_A(), this.gettypeCardinality(), "Cardinality_Class_A", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationClass_Cardinality_Class_B(), this.gettypeCardinality(), "Cardinality_Class_B", null, 0, 1, RelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewsEClass, Views.class, "Views", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViews_Title(), ecorePackage.getEString(), "title", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViews_RolView(), this.getTypeRol(), "rolView", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_HasRelationView(), this.getRelationView(), null, "hasRelationView", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_FromRelation(), this.getRelationView(), null, "fromRelation", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_HasViewComponent(), this.getViewComponent(), null, "hasViewComponent", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Service(), this.getTypeService(), "service", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Content_HTML(), ecorePackage.getEString(), "Content_HTML", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationViewEClass, RelationView.class, "RelationView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationView_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationView_RViewsHasClass(), this.getClass_(), null, "RViewsHasClass", null, 0, -1, RelationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationView_FromClass(), this.getClass_(), null, "fromClass", null, 0, -1, RelationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewComponentEClass, ViewComponent.class, "ViewComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewAttributeEClass, ViewAttribute.class, "ViewAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewAttribute_GetAttribute(), this.getAttributes(), null, "getAttribute", null, 0, 1, ViewAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewAttribute_TypePresentation(), this.gettypePresentation(), "typePresentation", "string", 0, 1, ViewAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ViewAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewAttribute_PositionHorizontal(), this.gettypeHorizontalPosition(), "positionHorizontal", null, 0, 1, ViewAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewAttribute_PostionVertical(), ecorePackage.getEInt(), "postionVertical", null, 0, 1, ViewAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewAttribute_From(), this.gettypeViewAttribute(), "From", "DataBase", 0, 1, ViewAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navegationMenuEClass, NavegationMenu.class, "NavegationMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavegationMenu_HasLink(), this.getLink(), null, "hasLink", null, 0, -1, NavegationMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNavegationMenu_Name(), ecorePackage.getEString(), "name", null, 0, 1, NavegationMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkViewCRUDEClass, LinkViewCRUD.class, "LinkViewCRUD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkViewCRUD_Service(), this.getTypeService(), "service", null, 0, 1, LinkViewCRUD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkViewCRUD_FromClass(), this.getClass_(), null, "fromClass", null, 0, -1, LinkViewCRUD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkViewCRUD_FromRelation(), this.getClass_(), null, "FromRelation", null, 0, -1, LinkViewCRUD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkViewEClass, LinkView.class, "LinkView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkView_LinkView(), this.getViews(), null, "linkView", null, 0, 1, LinkView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Attribute(), this.getDerived(), null, "Attribute", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Operator(), this.getTypeOperator(), "operator", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Service(), this.getTypeService(), "service", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Value(), this.getNotDerived(), null, "Value", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_MansajeError(), ecorePackage.getEString(), "mansajeError", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationContraintEClass, RelationContraint.class, "RelationContraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationContraint_RhasConstraint(), this.getConstraint(), null, "RhasConstraint", null, 0, -1, RelationContraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationContraint_GoRConstraint2(), this.getConstraint(), null, "goRConstraint2", null, 0, -1, RelationContraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationContraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationContraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(typeDataEEnum, TypeData.INTEGER);
		addEEnumLiteral(typeDataEEnum, TypeData.NUMERIC);
		addEEnumLiteral(typeDataEEnum, TypeData.TEXT);
		addEEnumLiteral(typeDataEEnum, TypeData.AUTOINCREMENTAL);
		addEEnumLiteral(typeDataEEnum, TypeData.IMG);
		addEEnumLiteral(typeDataEEnum, TypeData.TIME);
		addEEnumLiteral(typeDataEEnum, TypeData.DATE);
		addEEnumLiteral(typeDataEEnum, TypeData.DATE_TIME);
		addEEnumLiteral(typeDataEEnum, TypeData.VARCHAR10);
		addEEnumLiteral(typeDataEEnum, TypeData.VARCHAR30);
		addEEnumLiteral(typeDataEEnum, TypeData.VARCHAR50);

		initEEnum(typePresentationEEnum, typePresentation.class, "typePresentation");
		addEEnumLiteral(typePresentationEEnum, typePresentation.STRING);
		addEEnumLiteral(typePresentationEEnum, typePresentation.TABLE);
		addEEnumLiteral(typePresentationEEnum, typePresentation.COMBOBOX);
		addEEnumLiteral(typePresentationEEnum, typePresentation.RADIOBUTTOM);
		addEEnumLiteral(typePresentationEEnum, typePresentation.CHECKBOX);
		addEEnumLiteral(typePresentationEEnum, typePresentation.ITEM_LIST);
		addEEnumLiteral(typePresentationEEnum, typePresentation.FORM_EMAIL);
		addEEnumLiteral(typePresentationEEnum, typePresentation.FORM_PASSWORD);
		addEEnumLiteral(typePresentationEEnum, typePresentation.FORM_FILE);
		addEEnumLiteral(typePresentationEEnum, typePresentation.FORM_TEXT);
		addEEnumLiteral(typePresentationEEnum, typePresentation.TABLE_STRIPED);
		addEEnumLiteral(typePresentationEEnum, typePresentation.TABLE_BORDERED);
		addEEnumLiteral(typePresentationEEnum, typePresentation.TABLE_HOVER);
		addEEnumLiteral(typePresentationEEnum, typePresentation.IMG);

		initEEnum(typeHorizontalPositionEEnum, typeHorizontalPosition.class, "typeHorizontalPosition");
		addEEnumLiteral(typeHorizontalPositionEEnum, typeHorizontalPosition.LEFT);
		addEEnumLiteral(typeHorizontalPositionEEnum, typeHorizontalPosition.CENTER);
		addEEnumLiteral(typeHorizontalPositionEEnum, typeHorizontalPosition.RIGHT);
		addEEnumLiteral(typeHorizontalPositionEEnum, typeHorizontalPosition.EENUM_LITERAL0);

		initEEnum(typeServiceEEnum, TypeService.class, "TypeService");
		addEEnumLiteral(typeServiceEEnum, TypeService.CREATE);
		addEEnumLiteral(typeServiceEEnum, TypeService.UPDATE);

		initEEnum(typeOrientationEEnum, TypeOrientation.class, "TypeOrientation");
		addEEnumLiteral(typeOrientationEEnum, TypeOrientation.TOP_HORIZONTAL);
		addEEnumLiteral(typeOrientationEEnum, TypeOrientation.BOTTOM_HORIZONTAL);
		addEEnumLiteral(typeOrientationEEnum, TypeOrientation.LEFT_VERTICAL);
		addEEnumLiteral(typeOrientationEEnum, TypeOrientation.RIGHT_VERTICAL);

		initEEnum(typeOperatorEEnum, TypeOperator.class, "TypeOperator");
		addEEnumLiteral(typeOperatorEEnum, TypeOperator.IGUAL);
		addEEnumLiteral(typeOperatorEEnum, TypeOperator.MENOR);
		addEEnumLiteral(typeOperatorEEnum, TypeOperator.MAYOR);
		addEEnumLiteral(typeOperatorEEnum, TypeOperator.MENOR_IGUAL);
		addEEnumLiteral(typeOperatorEEnum, TypeOperator.MAYOR_IGUAL);
		addEEnumLiteral(typeOperatorEEnum, TypeOperator.DIFERENTE);

		initEEnum(typeViewAttributeEEnum, typeViewAttribute.class, "typeViewAttribute");
		addEEnumLiteral(typeViewAttributeEEnum, typeViewAttribute.DATA_BASE);
		addEEnumLiteral(typeViewAttributeEEnum, typeViewAttribute.SESSION_USER);

		initEEnum(typeCardinalityEEnum, typeCardinality.class, "typeCardinality");
		addEEnumLiteral(typeCardinalityEEnum, typeCardinality.ONE);
		addEEnumLiteral(typeCardinalityEEnum, typeCardinality.MANY);

		// Create resource
		createResource(eNS_URI);
	}

} //MetawebdesignPackageImpl
