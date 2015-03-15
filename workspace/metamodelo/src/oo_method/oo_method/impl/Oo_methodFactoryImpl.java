/**
 */
package oo_method.oo_method.impl;

import oo_method.oo_method.Argument;
import oo_method.oo_method.Attribute;
import oo_method.oo_method.ConstraintFormula;
import oo_method.oo_method.Constraints;
import oo_method.oo_method.DerivationFormula;
import oo_method.oo_method.Derived;
import oo_method.oo_method.NotDerived;
import oo_method.oo_method.Oo_methodFactory;
import oo_method.oo_method.Oo_methodPackage;
import oo_method.oo_method.Precondition;
import oo_method.oo_method.PreconditionFormula;
import oo_method.oo_method.Relation;
import oo_method.oo_method.Service;
import oo_method.oo_method.ServiceKinds;
import oo_method.oo_method.StructuralModel;
import oo_method.oo_method.ValuationFormula;
import oo_method.oo_method.dataTypes;
import oo_method.oo_method.permissionsType;

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
public class Oo_methodFactoryImpl extends EFactoryImpl implements Oo_methodFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Oo_methodFactory init() {
		try {
			Oo_methodFactory theOo_methodFactory = (Oo_methodFactory)EPackage.Registry.INSTANCE.getEFactory(Oo_methodPackage.eNS_URI);
			if (theOo_methodFactory != null) {
				return theOo_methodFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Oo_methodFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oo_methodFactoryImpl() {
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
			case Oo_methodPackage.CLASS: return createClass();
			case Oo_methodPackage.RELATION: return createRelation();
			case Oo_methodPackage.ATTRIBUTE: return createAttribute();
			case Oo_methodPackage.DERIVED: return createDerived();
			case Oo_methodPackage.NOT_DERIVED: return createNotDerived();
			case Oo_methodPackage.DERIVATION_FORMULA: return createDerivationFormula();
			case Oo_methodPackage.SERVICE: return createService();
			case Oo_methodPackage.ARGUMENT: return createArgument();
			case Oo_methodPackage.PRECONDITION: return createPrecondition();
			case Oo_methodPackage.PRECONDITION_FORMULA: return createPreconditionFormula();
			case Oo_methodPackage.VALUATION_FORMULA: return createValuationFormula();
			case Oo_methodPackage.CONSTRAINTS: return createConstraints();
			case Oo_methodPackage.CONSTRAINT_FORMULA: return createConstraintFormula();
			case Oo_methodPackage.STRUCTURAL_MODEL: return createStructuralModel();
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
			case Oo_methodPackage.DATA_TYPES:
				return createdataTypesFromString(eDataType, initialValue);
			case Oo_methodPackage.SERVICE_KINDS:
				return createServiceKindsFromString(eDataType, initialValue);
			case Oo_methodPackage.PERMISSIONS_TYPE:
				return createpermissionsTypeFromString(eDataType, initialValue);
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
			case Oo_methodPackage.DATA_TYPES:
				return convertdataTypesToString(eDataType, instanceValue);
			case Oo_methodPackage.SERVICE_KINDS:
				return convertServiceKindsToString(eDataType, instanceValue);
			case Oo_methodPackage.PERMISSIONS_TYPE:
				return convertpermissionsTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oo_method.oo_method.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
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
	public DerivationFormula createDerivationFormula() {
		DerivationFormulaImpl derivationFormula = new DerivationFormulaImpl();
		return derivationFormula;
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
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionFormula createPreconditionFormula() {
		PreconditionFormulaImpl preconditionFormula = new PreconditionFormulaImpl();
		return preconditionFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuationFormula createValuationFormula() {
		ValuationFormulaImpl valuationFormula = new ValuationFormulaImpl();
		return valuationFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints createConstraints() {
		ConstraintsImpl constraints = new ConstraintsImpl();
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintFormula createConstraintFormula() {
		ConstraintFormulaImpl constraintFormula = new ConstraintFormulaImpl();
		return constraintFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralModel createStructuralModel() {
		StructuralModelImpl structuralModel = new StructuralModelImpl();
		return structuralModel;
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
	public ServiceKinds createServiceKindsFromString(EDataType eDataType, String initialValue) {
		ServiceKinds result = ServiceKinds.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceKindsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public permissionsType createpermissionsTypeFromString(EDataType eDataType, String initialValue) {
		permissionsType result = permissionsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertpermissionsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oo_methodPackage getOo_methodPackage() {
		return (Oo_methodPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Oo_methodPackage getPackage() {
		return Oo_methodPackage.eINSTANCE;
	}

} //Oo_methodFactoryImpl
