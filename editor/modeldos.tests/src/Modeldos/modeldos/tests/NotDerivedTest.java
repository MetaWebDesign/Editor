/**
 */
package Modeldos.modeldos.tests;

import Modeldos.modeldos.ModeldosFactory;
import Modeldos.modeldos.NotDerived;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Derived</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotDerivedTest extends AttributesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotDerivedTest.class);
	}

	/**
	 * Constructs a new Not Derived test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotDerivedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not Derived test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotDerived getFixture() {
		return (NotDerived)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeldosFactory.eINSTANCE.createNotDerived());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NotDerivedTest
