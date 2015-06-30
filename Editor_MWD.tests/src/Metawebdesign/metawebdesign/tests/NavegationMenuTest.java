/**
 */
package Metawebdesign.metawebdesign.tests;

import Metawebdesign.metawebdesign.MetawebdesignFactory;
import Metawebdesign.metawebdesign.NavegationMenu;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Navegation Menu</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavegationMenuTest extends ViewComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NavegationMenuTest.class);
	}

	/**
	 * Constructs a new Navegation Menu test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavegationMenuTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Navegation Menu test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NavegationMenu getFixture() {
		return (NavegationMenu)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetawebdesignFactory.eINSTANCE.createNavegationMenu());
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

} //NavegationMenuTest
