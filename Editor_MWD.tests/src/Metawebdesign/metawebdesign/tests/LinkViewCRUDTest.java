/**
 */
package Metawebdesign.metawebdesign.tests;

import Metawebdesign.metawebdesign.LinkViewCRUD;
import Metawebdesign.metawebdesign.MetawebdesignFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link View CRUD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkViewCRUDTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkViewCRUDTest.class);
	}

	/**
	 * Constructs a new Link View CRUD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkViewCRUDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link View CRUD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkViewCRUD getFixture() {
		return (LinkViewCRUD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetawebdesignFactory.eINSTANCE.createLinkViewCRUD());
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

} //LinkViewCRUDTest
