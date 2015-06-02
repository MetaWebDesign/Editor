/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Admin;
import Modeluno.modeluno.Attribute;
import Modeluno.modeluno.Attribute_Derived;
import Modeluno.modeluno.Attribute_Not_Derived;
import Modeluno.modeluno.Create;
import Modeluno.modeluno.Delete;
import Modeluno.modeluno.ListView;
import Modeluno.modeluno.Map;
import Modeluno.modeluno.ModelunoFactory;
import Modeluno.modeluno.ModelunoPackage;
import Modeluno.modeluno.Page;
import Modeluno.modeluno.RelationAttribute;
import Modeluno.modeluno.RelationClass;
import Modeluno.modeluno.RelationService;
import Modeluno.modeluno.RelationView;
import Modeluno.modeluno.Rol;
import Modeluno.modeluno.Service;
import Modeluno.modeluno.TypeAttributeForm;
import Modeluno.modeluno.TypesAlert;
import Modeluno.modeluno.TypesView;
import Modeluno.modeluno.UpdateAttribute;
import Modeluno.modeluno.UpdateObject;
import Modeluno.modeluno.View;
import Modeluno.modeluno.ViewAdmin;
import Modeluno.modeluno.ViewAttribute;
import Modeluno.modeluno.ViewIndex;
import Modeluno.modeluno.ViewInput;
import Modeluno.modeluno.ViewUpdateAttribute;
import Modeluno.modeluno.ViewUpdateObject;
import Modeluno.modeluno.Views;
import Modeluno.modeluno.dataTypes;
import Modeluno.modeluno.typeHorizotalPosition;

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
public class ModelunoFactoryImpl extends EFactoryImpl implements ModelunoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelunoFactory init() {
		try {
			ModelunoFactory theModelunoFactory = (ModelunoFactory)EPackage.Registry.INSTANCE.getEFactory(ModelunoPackage.eNS_URI);
			if (theModelunoFactory != null) {
				return theModelunoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelunoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelunoFactoryImpl() {
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
			case ModelunoPackage.MAP: return createMap();
			case ModelunoPackage.CLASS: return createClass();
			case ModelunoPackage.RELATION_CLASS: return createRelationClass();
			case ModelunoPackage.ATTRIBUTE: return createAttribute();
			case ModelunoPackage.RELATION_ATTRIBUTE: return createRelationAttribute();
			case ModelunoPackage.ATTRIBUTE_NOT_DERIVED: return createAttribute_Not_Derived();
			case ModelunoPackage.ATTRIBUTE_DERIVED: return createAttribute_Derived();
			case ModelunoPackage.SERVICE: return createService();
			case ModelunoPackage.RELATION_SERVICE: return createRelationService();
			case ModelunoPackage.CREATE: return createCreate();
			case ModelunoPackage.DELETE: return createDelete();
			case ModelunoPackage.UPDATE_OBJECT: return createUpdateObject();
			case ModelunoPackage.UPDATE_ATTRIBUTE: return createUpdateAttribute();
			case ModelunoPackage.LIST_VIEW: return createListView();
			case ModelunoPackage.VIEW: return createView();
			case ModelunoPackage.ADMIN: return createAdmin();
			case ModelunoPackage.VIEWS: return createViews();
			case ModelunoPackage.VIEW_INPUT: return createViewInput();
			case ModelunoPackage.VIEW_UPDATE_OBJECT: return createViewUpdateObject();
			case ModelunoPackage.VIEW_UPDATE_ATTRIBUTE: return createViewUpdateAttribute();
			case ModelunoPackage.VIEW_INDEX: return createViewIndex();
			case ModelunoPackage.VIEW_ATTRIBUTE: return createViewAttribute();
			case ModelunoPackage.VIEW_ADMIN: return createViewAdmin();
			case ModelunoPackage.RELATION_VIEW: return createRelationView();
			case ModelunoPackage.PAGE: return createPage();
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
			case ModelunoPackage.ROL:
				return createRolFromString(eDataType, initialValue);
			case ModelunoPackage.TYPE_ATTRIBUTE_FORM:
				return createTypeAttributeFormFromString(eDataType, initialValue);
			case ModelunoPackage.DATA_TYPES:
				return createdataTypesFromString(eDataType, initialValue);
			case ModelunoPackage.TYPES_VIEW:
				return createTypesViewFromString(eDataType, initialValue);
			case ModelunoPackage.TYPE_HORIZOTAL_POSITION:
				return createtypeHorizotalPositionFromString(eDataType, initialValue);
			case ModelunoPackage.TYPES_ALERT:
				return createTypesAlertFromString(eDataType, initialValue);
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
			case ModelunoPackage.ROL:
				return convertRolToString(eDataType, instanceValue);
			case ModelunoPackage.TYPE_ATTRIBUTE_FORM:
				return convertTypeAttributeFormToString(eDataType, instanceValue);
			case ModelunoPackage.DATA_TYPES:
				return convertdataTypesToString(eDataType, instanceValue);
			case ModelunoPackage.TYPES_VIEW:
				return convertTypesViewToString(eDataType, instanceValue);
			case ModelunoPackage.TYPE_HORIZOTAL_POSITION:
				return converttypeHorizotalPositionToString(eDataType, instanceValue);
			case ModelunoPackage.TYPES_ALERT:
				return convertTypesAlertToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modeluno.modeluno.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
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
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationAttribute createRelationAttribute() {
		RelationAttributeImpl relationAttribute = new RelationAttributeImpl();
		return relationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_Not_Derived createAttribute_Not_Derived() {
		Attribute_Not_DerivedImpl attribute_Not_Derived = new Attribute_Not_DerivedImpl();
		return attribute_Not_Derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_Derived createAttribute_Derived() {
		Attribute_DerivedImpl attribute_Derived = new Attribute_DerivedImpl();
		return attribute_Derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationService createRelationService() {
		RelationServiceImpl relationService = new RelationServiceImpl();
		return relationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateObject createUpdateObject() {
		UpdateObjectImpl updateObject = new UpdateObjectImpl();
		return updateObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAttribute createUpdateAttribute() {
		UpdateAttributeImpl updateAttribute = new UpdateAttributeImpl();
		return updateAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListView createListView() {
		ListViewImpl listView = new ListViewImpl();
		return listView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
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
	public ViewInput createViewInput() {
		ViewInputImpl viewInput = new ViewInputImpl();
		return viewInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewUpdateObject createViewUpdateObject() {
		ViewUpdateObjectImpl viewUpdateObject = new ViewUpdateObjectImpl();
		return viewUpdateObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewUpdateAttribute createViewUpdateAttribute() {
		ViewUpdateAttributeImpl viewUpdateAttribute = new ViewUpdateAttributeImpl();
		return viewUpdateAttribute;
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
	public ViewAttribute createViewAttribute() {
		ViewAttributeImpl viewAttribute = new ViewAttributeImpl();
		return viewAttribute;
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
	public RelationView createRelationView() {
		RelationViewImpl relationView = new RelationViewImpl();
		return relationView;
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
	public Rol createRolFromString(EDataType eDataType, String initialValue) {
		Rol result = Rol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRolToString(EDataType eDataType, Object instanceValue) {
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
	public dataTypes createdataTypesFromString(EDataType eDataType, String initialValue) {
		dataTypes result = dataTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdataTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesView createTypesViewFromString(EDataType eDataType, String initialValue) {
		TypesView result = TypesView.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypesViewToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeHorizotalPosition createtypeHorizotalPositionFromString(EDataType eDataType, String initialValue) {
		typeHorizotalPosition result = typeHorizotalPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypeHorizotalPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAlert createTypesAlertFromString(EDataType eDataType, String initialValue) {
		TypesAlert result = TypesAlert.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypesAlertToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelunoPackage getModelunoPackage() {
		return (ModelunoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelunoPackage getPackage() {
		return ModelunoPackage.eINSTANCE;
	}

} //ModelunoFactoryImpl
