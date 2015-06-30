/**
 */
package Metawebdesign.metawebdesign.tests;

import Metawebdesign.metawebdesign.LinkView;
import Metawebdesign.metawebdesign.MetawebdesignFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkViewTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkViewTest.class);
	}

	/**
	 * Constructs a new Link View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkView getFixture() {
		return (LinkView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetawebdesignFactory.eINSTANCE.createLinkView());
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

} //LinkViewTest
