/**
 */
package Modeluno.modeluno.tests;

import Modeluno.modeluno.ModelunoFactory;
import Modeluno.modeluno.ViewAdmin;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Admin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewAdminTest extends ViewsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ViewAdminTest.class);
	}

	/**
	 * Constructs a new View Admin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAdminTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this View Admin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ViewAdmin getFixture() {
		return (ViewAdmin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelunoFactory.eINSTANCE.createViewAdmin());
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

} //ViewAdminTest
