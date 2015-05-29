/**
 */
package Modeluno.modeluno.impl;

import Modeluno.modeluno.Attribute;
import Modeluno.modeluno.Attribute_Derived;
import Modeluno.modeluno.Attribute_Not_Derived;
import Modeluno.modeluno.Attribute_Relation;
import Modeluno.modeluno.Class_Relation;
import Modeluno.modeluno.Map;
import Modeluno.modeluno.ModelunoFactory;
import Modeluno.modeluno.ModelunoPackage;

import org.eclipse.emf.ecore.EClass;
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
			case ModelunoPackage.CLASS_RELATION: return createClass_Relation();
			case ModelunoPackage.ATTRIBUTE: return createAttribute();
			case ModelunoPackage.ATTRIBUTE_RELATION: return createAttribute_Relation();
			case ModelunoPackage.ATTRIBUTE_NOT_DERIVED: return createAttribute_Not_Derived();
			case ModelunoPackage.ATTRIBUTE_DERIVED: return createAttribute_Derived();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public Class_Relation createClass_Relation() {
		Class_RelationImpl class_Relation = new Class_RelationImpl();
		return class_Relation;
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
	public Attribute_Relation createAttribute_Relation() {
		Attribute_RelationImpl attribute_Relation = new Attribute_RelationImpl();
		return attribute_Relation;
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
