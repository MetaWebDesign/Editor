/**
 */
package Modeluno.modeluno.tests;

import Modeluno.modeluno.ModelunoFactory;
import Modeluno.modeluno.UpdateObject;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Update Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateObjectTest extends ServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UpdateObjectTest.class);
	}

	/**
	 * Constructs a new Update Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Update Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UpdateObject getFixture() {
		return (UpdateObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelunoFactory.eINSTANCE.createUpdateObject());
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

} //UpdateObjectTest
