/**
 */
package Modeluno.modeluno.tests;

import Modeluno.modeluno.ModelunoFactory;
import Modeluno.modeluno.UpdateAttribute;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Update Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateAttributeTest extends ServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UpdateAttributeTest.class);
	}

	/**
	 * Constructs a new Update Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Update Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UpdateAttribute getFixture() {
		return (UpdateAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelunoFactory.eINSTANCE.createUpdateAttribute());
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

} //UpdateAttributeTest
