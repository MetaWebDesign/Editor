/**
 */
package Metawebdesign.metawebdesign.impl;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.Constraint;
import Metawebdesign.metawebdesign.Derived;
import Metawebdesign.metawebdesign.Link;
import Metawebdesign.metawebdesign.LinkView;
import Metawebdesign.metawebdesign.LinkViewCRUD;
import Metawebdesign.metawebdesign.MetawebdesignFactory;
import Metawebdesign.metawebdesign.MetawebdesignPackage;
import Metawebdesign.metawebdesign.NavegationMenu;
import Metawebdesign.metawebdesign.NotDerived;
import Metawebdesign.metawebdesign.Page;
import Metawebdesign.metawebdesign.RelationClass;
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
import Metawebdesign.metawebdesign.typeMenus;
import Metawebdesign.metawebdesign.typePresentacion;

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
public class MetawebdesignFactoryImpl extends EFactoryImpl implements MetawebdesignFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetawebdesignFactory init() {
		try {
			MetawebdesignFactory theMetawebdesignFactory = (MetawebdesignFactory)EPackage.Registry.INSTANCE.getEFactory(MetawebdesignPackage.eNS_URI);
			if (theMetawebdesignFactory != null) {
				return theMetawebdesignFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetawebdesignFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetawebdesignFactoryImpl() {
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
			case MetawebdesignPackage.ROOT: return createRoot();
			case MetawebdesignPackage.CLASS: return createClass();
			case MetawebdesignPackage.ATTRIBUTES: return createAttributes();
			case MetawebdesignPackage.DERIVED: return createDerived();
			case MetawebdesignPackage.NOT_DERIVED: return createNotDerived();
			case MetawebdesignPackage.RELATION_CLASS: return createRelationClass();
			case MetawebdesignPackage.VIEWS: return createViews();
			case MetawebdesignPackage.PAGE: return createPage();
			case MetawebdesignPackage.VIEW_COMPONENT: return createViewComponent();
			case MetawebdesignPackage.VIEW_ATTRIBUTE: return createViewAttribute();
			case MetawebdesignPackage.NAVEGATION_MENU: return createNavegationMenu();
			case MetawebdesignPackage.LINK: return createLink();
			case MetawebdesignPackage.LINK_VIEW_CRUD: return createLinkViewCRUD();
			case MetawebdesignPackage.LINK_VIEW: return createLinkView();
			case MetawebdesignPackage.CONSTRAINT: return createConstraint();
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
			case MetawebdesignPackage.TYPE_ROL:
				return createTypeRolFromString(eDataType, initialValue);
			case MetawebdesignPackage.TYPE_ATTRIBUTE_FORM:
				return createTypeAttributeFormFromString(eDataType, initialValue);
			case MetawebdesignPackage.TYPE_DATA:
				return createTypeDataFromString(eDataType, initialValue);
			case MetawebdesignPackage.TYPE_PRESENTACION:
				return createtypePresentacionFromString(eDataType, initialValue);
			case MetawebdesignPackage.TYPE_HORIZONTAL_POSITION:
				return createtypeHorizontalPositionFromString(eDataType, initialValue);
			case MetawebdesignPackage.TYPE_SERVICE:
				return createTypeServiceFromString(eDataType, initialValue);
			case MetawebdesignPackage.TYPE_ORIENTATION:
				return createTypeOrientationFromString(eDataType, initialValue);
			case MetawebdesignPackage.TYPE_OPERATOR:
				return createTypeOperatorFromString(eDataType, initialValue);
			case MetawebdesignPackage.TYPE_CARDINALITY:
				return createtypeCardinalityFromString(eDataType, initialValue);
			case MetawebdesignPackage.TYPE_MENUS:
				return createtypeMenusFromString(eDataType, initialValue);
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
			case MetawebdesignPackage.TYPE_ROL:
				return convertTypeRolToString(eDataType, instanceValue);
			case MetawebdesignPackage.TYPE_ATTRIBUTE_FORM:
				return convertTypeAttributeFormToString(eDataType, instanceValue);
			case MetawebdesignPackage.TYPE_DATA:
				return convertTypeDataToString(eDataType, instanceValue);
			case MetawebdesignPackage.TYPE_PRESENTACION:
				return converttypePresentacionToString(eDataType, instanceValue);
			case MetawebdesignPackage.TYPE_HORIZONTAL_POSITION:
				return converttypeHorizontalPositionToString(eDataType, instanceValue);
			case MetawebdesignPackage.TYPE_SERVICE:
				return convertTypeServiceToString(eDataType, instanceValue);
			case MetawebdesignPackage.TYPE_ORIENTATION:
				return convertTypeOrientationToString(eDataType, instanceValue);
			case MetawebdesignPackage.TYPE_OPERATOR:
				return convertTypeOperatorToString(eDataType, instanceValue);
			case MetawebdesignPackage.TYPE_CARDINALITY:
				return converttypeCardinalityToString(eDataType, instanceValue);
			case MetawebdesignPackage.TYPE_MENUS:
				return converttypeMenusToString(eDataType, instanceValue);
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
	public Metawebdesign.metawebdesign.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
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
	public RelationClass createRelationClass() {
		RelationClassImpl relationClass = new RelationClassImpl();
		return relationClass;
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
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewComponent createViewComponent() {
		ViewComponentImpl viewComponent = new ViewComponentImpl();
		return viewComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAttribute createViewAttribute() {
		ViewAttributeImpl viewAttribute = new ViewAttributeImpl();
		return viewAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavegationMenu createNavegationMenu() {
		NavegationMenuImpl navegationMenu = new NavegationMenuImpl();
		return navegationMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkViewCRUD createLinkViewCRUD() {
		LinkViewCRUDImpl linkViewCRUD = new LinkViewCRUDImpl();
		return linkViewCRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkView createLinkView() {
		LinkViewImpl linkView = new LinkViewImpl();
		return linkView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
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
	public typePresentacion createtypePresentacionFromString(EDataType eDataType, String initialValue) {
		typePresentacion result = typePresentacion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypePresentacionToString(EDataType eDataType, Object instanceValue) {
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
	public TypeService createTypeServiceFromString(EDataType eDataType, String initialValue) {
		TypeService result = TypeService.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOrientation createTypeOrientationFromString(EDataType eDataType, String initialValue) {
		TypeOrientation result = TypeOrientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOperator createTypeOperatorFromString(EDataType eDataType, String initialValue) {
		TypeOperator result = TypeOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeCardinality createtypeCardinalityFromString(EDataType eDataType, String initialValue) {
		typeCardinality result = typeCardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypeCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeMenus createtypeMenusFromString(EDataType eDataType, String initialValue) {
		typeMenus result = typeMenus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypeMenusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetawebdesignPackage getMetawebdesignPackage() {
		return (MetawebdesignPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetawebdesignPackage getPackage() {
		return MetawebdesignPackage.eINSTANCE;
	}

} //MetawebdesignFactoryImpl
