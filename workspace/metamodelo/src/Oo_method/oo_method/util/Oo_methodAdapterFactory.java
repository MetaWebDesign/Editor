/**
 */
package Oo_method.oo_method.util;

import Oo_method.oo_method.Argument;
import Oo_method.oo_method.Attribute;
import Oo_method.oo_method.ConstraintFormula;
import Oo_method.oo_method.Constraints;
import Oo_method.oo_method.DerivationFormula;
import Oo_method.oo_method.Derived;
import Oo_method.oo_method.NotDerived;
import Oo_method.oo_method.Oo_methodPackage;
import Oo_method.oo_method.Precondition;
import Oo_method.oo_method.PreconditionFormula;
import Oo_method.oo_method.Relation;
import Oo_method.oo_method.Service;
import Oo_method.oo_method.StructuralModel;
import Oo_method.oo_method.ValuationFormula;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Oo_method.oo_method.Oo_methodPackage
 * @generated
 */
public class Oo_methodAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Oo_methodPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oo_methodAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Oo_methodPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oo_methodSwitch<Adapter> modelSwitch =
		new Oo_methodSwitch<Adapter>() {
			@Override
			public Adapter caseClass(Oo_method.oo_method.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseDerived(Derived object) {
				return createDerivedAdapter();
			}
			@Override
			public Adapter caseNotDerived(NotDerived object) {
				return createNotDerivedAdapter();
			}
			@Override
			public Adapter caseDerivationFormula(DerivationFormula object) {
				return createDerivationFormulaAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter casePrecondition(Precondition object) {
				return createPreconditionAdapter();
			}
			@Override
			public Adapter casePreconditionFormula(PreconditionFormula object) {
				return createPreconditionFormulaAdapter();
			}
			@Override
			public Adapter caseValuationFormula(ValuationFormula object) {
				return createValuationFormulaAdapter();
			}
			@Override
			public Adapter caseConstraints(Constraints object) {
				return createConstraintsAdapter();
			}
			@Override
			public Adapter caseConstraintFormula(ConstraintFormula object) {
				return createConstraintFormulaAdapter();
			}
			@Override
			public Adapter caseStructuralModel(StructuralModel object) {
				return createStructuralModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.Derived
	 * @generated
	 */
	public Adapter createDerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.NotDerived <em>Not Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.NotDerived
	 * @generated
	 */
	public Adapter createNotDerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.DerivationFormula <em>Derivation Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.DerivationFormula
	 * @generated
	 */
	public Adapter createDerivationFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.Precondition
	 * @generated
	 */
	public Adapter createPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.PreconditionFormula <em>Precondition Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.PreconditionFormula
	 * @generated
	 */
	public Adapter createPreconditionFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.ValuationFormula <em>Valuation Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.ValuationFormula
	 * @generated
	 */
	public Adapter createValuationFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.Constraints
	 * @generated
	 */
	public Adapter createConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.ConstraintFormula <em>Constraint Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.ConstraintFormula
	 * @generated
	 */
	public Adapter createConstraintFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oo_method.oo_method.StructuralModel <em>Structural Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oo_method.oo_method.StructuralModel
	 * @generated
	 */
	public Adapter createStructuralModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Oo_methodAdapterFactory
