/**
 */
package Modeluno.modeluno.tests;

import Modeluno.modeluno.ModelunoFactory;
import Modeluno.modeluno.RelationService;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationServiceTest extends TestCase {

	/**
	 * The fixture for this Relation Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationServiceTest.class);
	}

	/**
	 * Constructs a new Relation Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Relation Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RelationService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Relation Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationService getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelunoFactory.eINSTANCE.createRelationService());
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

} //RelationServiceTest
