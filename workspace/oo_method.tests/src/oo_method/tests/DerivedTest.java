/**
 */
package oo_method.tests;

import junit.textui.TestRunner;

import oo_method.Derived;
import oo_method.Oo_methodFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Derived</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DerivedTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DerivedTest.class);
	}

	/**
	 * Constructs a new Derived test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Derived test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Derived getFixture() {
		return (Derived)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Oo_methodFactory.eINSTANCE.createDerived());
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

} //DerivedTest
