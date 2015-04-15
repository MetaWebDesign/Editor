/**
 */
package Modeluno.modeluno.tests;

import Modeluno.modeluno.ANotDerived;
import Modeluno.modeluno.ModelunoFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ANot Derived</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ANotDerivedTest extends AtributteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ANotDerivedTest.class);
	}

	/**
	 * Constructs a new ANot Derived test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANotDerivedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ANot Derived test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ANotDerived getFixture() {
		return (ANotDerived)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelunoFactory.eINSTANCE.createANotDerived());
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

} //ANotDerivedTest
