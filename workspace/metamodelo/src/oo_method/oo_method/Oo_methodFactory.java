/**
 */
package oo_method.oo_method;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see oo_method.oo_method.Oo_methodPackage
 * @generated
 */
public interface Oo_methodFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Oo_methodFactory eINSTANCE = oo_method.oo_method.impl.Oo_methodFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Derived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived</em>'.
	 * @generated
	 */
	Derived createDerived();

	/**
	 * Returns a new object of class '<em>Not Derived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Derived</em>'.
	 * @generated
	 */
	NotDerived createNotDerived();

	/**
	 * Returns a new object of class '<em>Derivation Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derivation Formula</em>'.
	 * @generated
	 */
	DerivationFormula createDerivationFormula();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition</em>'.
	 * @generated
	 */
	Precondition createPrecondition();

	/**
	 * Returns a new object of class '<em>Precondition Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition Formula</em>'.
	 * @generated
	 */
	PreconditionFormula createPreconditionFormula();

	/**
	 * Returns a new object of class '<em>Valuation Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valuation Formula</em>'.
	 * @generated
	 */
	ValuationFormula createValuationFormula();

	/**
	 * Returns a new object of class '<em>Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraints</em>'.
	 * @generated
	 */
	Constraints createConstraints();

	/**
	 * Returns a new object of class '<em>Constraint Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Formula</em>'.
	 * @generated
	 */
	ConstraintFormula createConstraintFormula();

	/**
	 * Returns a new object of class '<em>Structural Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structural Model</em>'.
	 * @generated
	 */
	StructuralModel createStructuralModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Oo_methodPackage getOo_methodPackage();

} //Oo_methodFactory
