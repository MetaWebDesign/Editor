/**
 */
package Modeldos.modeldos.impl;

import Modeldos.modeldos.Attributes;
import Modeldos.modeldos.Derived;
import Modeldos.modeldos.FormCreate;
import Modeldos.modeldos.FormUpdate;
import Modeldos.modeldos.Menu;
import Modeldos.modeldos.ModeldosFactory;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.NotDerived;
import Modeldos.modeldos.Page;
import Modeldos.modeldos.PresentationUnit;
import Modeldos.modeldos.RelationPUnit;
import Modeldos.modeldos.Relations_Class;
import Modeldos.modeldos.Root;
import Modeldos.modeldos.TypeAttributeForm;
import Modeldos.modeldos.TypeData;
import Modeldos.modeldos.TypeRol;
import Modeldos.modeldos.ViewAdmin;
import Modeldos.modeldos.ViewIndex;
import Modeldos.modeldos.Views;
import Modeldos.modeldos.group;
import Modeldos.modeldos.typeHorizontalPosition;
import Modeldos.modeldos.typePresentation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeldosFactoryImpl extends EFactoryImpl implements ModeldosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeldosFactory init() {
		try {
			ModeldosFactory theModeldosFactory = (ModeldosFactory)EPackage.Registry.INSTANCE.getEFactory(ModeldosPackage.eNS_URI);
			if (theModeldosFactory != null) {
				return theModeldosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeldosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeldosFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModeldosPackage.ROOT: return createRoot();
			case ModeldosPackage.CLASS: return createClass();
			case ModeldosPackage.RELATIONS_CLASS: return createRelations_Class();
			case ModeldosPackage.ATTRIBUTES: return createAttributes();
			case ModeldosPackage.DERIVED: return createDerived();
			case ModeldosPackage.NOT_DERIVED: return createNotDerived();
			case ModeldosPackage.VIEWS: return createViews();
			case ModeldosPackage.FORM_CREATE: return createFormCreate();
			case ModeldosPackage.FORM_UPDATE: return createFormUpdate();
			case ModeldosPackage.VIEW_INDEX: return createViewIndex();
			case ModeldosPackage.VIEW_ADMIN: return createViewAdmin();
			case ModeldosPackage.PRESENTATION_UNIT: return createPresentationUnit();
			case ModeldosPackage.PAGE: return createPage();
			case ModeldosPackage.MENU: return createMenu();
			case ModeldosPackage.GROUP: return creategroup();
			case ModeldosPackage.RELATION_PUNIT: return createRelationPUnit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModeldosPackage.TYPE_ROL:
				return createTypeRolFromString(eDataType, initialValue);
			case ModeldosPackage.TYPE_ATTRIBUTE_FORM:
				return createTypeAttributeFormFromString(eDataType, initialValue);
			case ModeldosPackage.TYPE_DATA:
				return createTypeDataFromString(eDataType, initialValue);
			case ModeldosPackage.TYPE_PRESENTATION:
				return createtypePresentationFromString(eDataType, initialValue);
			case ModeldosPackage.TYPE_HORIZONTAL_POSITION:
				return createtypeHorizontalPositionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModeldosPackage.TYPE_ROL:
				return convertTypeRolToString(eDataType, instanceValue);
			case ModeldosPackage.TYPE_ATTRIBUTE_FORM:
				return convertTypeAttributeFormToString(eDataType, instanceValue);
			case ModeldosPackage.TYPE_DATA:
				return convertTypeDataToString(eDataType, instanceValue);
			case ModeldosPackage.TYPE_PRESENTATION:
				return converttypePresentationToString(eDataType, instanceValue);
			case ModeldosPackage.TYPE_HORIZONTAL_POSITION:
				return converttypeHorizontalPositionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modeldos.modeldos.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations_Class createRelations_Class() {
		Relations_ClassImpl relations_Class = new Relations_ClassImpl();
		return relations_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes createAttributes() {
		AttributesImpl attributes = new AttributesImpl();
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Derived createDerived() {
		DerivedImpl derived = new DerivedImpl();
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotDerived createNotDerived() {
		NotDerivedImpl notDerived = new NotDerivedImpl();
		return notDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views createViews() {
		ViewsImpl views = new ViewsImpl();
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormCreate createFormCreate() {
		FormCreateImpl formCreate = new FormCreateImpl();
		return formCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormUpdate createFormUpdate() {
		FormUpdateImpl formUpdate = new FormUpdateImpl();
		return formUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewIndex createViewIndex() {
		ViewIndexImpl viewIndex = new ViewIndexImpl();
		return viewIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAdmin createViewAdmin() {
		ViewAdminImpl viewAdmin = new ViewAdminImpl();
		return viewAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationUnit createPresentationUnit() {
		PresentationUnitImpl presentationUnit = new PresentationUnitImpl();
		return presentationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public group creategroup() {
		groupImpl group = new groupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationPUnit createRelationPUnit() {
		RelationPUnitImpl relationPUnit = new RelationPUnitImpl();
		return relationPUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRol createTypeRolFromString(EDataType eDataType, String initialValue) {
		TypeRol result = TypeRol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAttributeForm createTypeAttributeFormFromString(EDataType eDataType, String initialValue) {
		TypeAttributeForm result = TypeAttributeForm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAttributeFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeData createTypeDataFromString(EDataType eDataType, String initialValue) {
		TypeData result = TypeData.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typePresentation createtypePresentationFromString(EDataType eDataType, String initialValue) {
		typePresentation result = typePresentation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypePresentationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeHorizontalPosition createtypeHorizontalPositionFromString(EDataType eDataType, String initialValue) {
		typeHorizontalPosition result = typeHorizontalPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypeHorizontalPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeldosPackage getModeldosPackage() {
		return (ModeldosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModeldosPackage getPackage() {
		return ModeldosPackage.eINSTANCE;
	}

} //ModeldosFactoryImpl
