/**
 */
package Modelouno.modeluno.tests;

import Modelouno.modeluno.ModelunoFactory;
import Modelouno.modeluno.ViewAttribute;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewAttributeTest extends ViewsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ViewAttributeTest.class);
	}

	/**
	 * Constructs a new View Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this View Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ViewAttribute getFixture() {
		return (ViewAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelunoFactory.eINSTANCE.createViewAttribute());
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

} //ViewAttributeTest
