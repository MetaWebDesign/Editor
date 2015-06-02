/**
 */
package Modeluno.modeluno.tests;

import Modeluno.modeluno.ModelunoFactory;
import Modeluno.modeluno.ViewIndex;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Index</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewIndexTest extends ViewsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ViewIndexTest.class);
	}

	/**
	 * Constructs a new View Index test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewIndexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this View Index test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ViewIndex getFixture() {
		return (ViewIndex)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelunoFactory.eINSTANCE.createViewIndex());
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

} //ViewIndexTest
