/**
 */
package Metawebdesign.metawebdesign.tests;

import Metawebdesign.metawebdesign.Derived;
import Metawebdesign.metawebdesign.MetawebdesignFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Derived</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DerivedTest extends AttributesTest {

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
		setFixture(MetawebdesignFactory.eINSTANCE.createDerived());
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
