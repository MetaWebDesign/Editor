/**
 */
package Metawebdesign.metawebdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>type Menu</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#gettypeMenu()
 * @model
 * @generated
 */
public enum typeMenu implements Enumerator {
	/**
<<<<<<< HEAD
	 * The '<em><b>Principal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINCIPAL_VALUE
	 * @generated
	 * @ordered
	 */
	PRINCIPAL(0, "principal", "principal"),

	/**
	 * The '<em><b>Navegation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVEGATION_VALUE
	 * @generated
	 * @ordered
	 */
	NAVEGATION(0, "navegation", "navegation");

	/**
	 * The '<em><b>Principal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Principal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRINCIPAL
	 * @model name="principal"
	 * @generated
	 * @ordered
	 */
	public static final int PRINCIPAL_VALUE = 0;

	/**
	 * The '<em><b>Navegation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Navegation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAVEGATION
	 * @model name="navegation"
	 * @generated
	 * @ordered
	 */
	public static final int NAVEGATION_VALUE = 0;
=======
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "default"),

	/**
	 * The '<em><b>All view horizontal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VIEW_HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_VIEW_HORIZONTAL(0, "all_view_horizontal", "all_view_horizontal"),

	/**
	 * The '<em><b>All view vertical left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VIEW_VERTICAL_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_VIEW_VERTICAL_LEFT(0, "all_view_vertical_left", "all_view_vertical_left"),

	/**
	 * The '<em><b>All view vertical right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VIEW_VERTICAL_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_VIEW_VERTICAL_RIGHT(0, "all_view_vertical_right", "all_view_vertical_right"),

	/**
	 * The '<em><b>Vertical left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL_LEFT(0, "vertical_left", "vertical_left"),

	/**
	 * The '<em><b>Vertical right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL_RIGHT(0, "vertical_right", "vertical_right");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>All view horizontal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All view horizontal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_VIEW_HORIZONTAL
	 * @model name="all_view_horizontal"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VIEW_HORIZONTAL_VALUE = 0;

	/**
	 * The '<em><b>All view vertical left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All view vertical left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_VIEW_VERTICAL_LEFT
	 * @model name="all_view_vertical_left"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VIEW_VERTICAL_LEFT_VALUE = 0;

	/**
	 * The '<em><b>All view vertical right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All view vertical right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_VIEW_VERTICAL_RIGHT
	 * @model name="all_view_vertical_right"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VIEW_VERTICAL_RIGHT_VALUE = 0;

	/**
	 * The '<em><b>Vertical left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vertical left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_LEFT
	 * @model name="vertical_left"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_LEFT_VALUE = 0;

	/**
	 * The '<em><b>Vertical right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vertical right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_RIGHT
	 * @model name="vertical_right"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_RIGHT_VALUE = 0;
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98

	/**
	 * An array of all the '<em><b>type Menu</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final typeMenu[] VALUES_ARRAY =
		new typeMenu[] {
<<<<<<< HEAD
			PRINCIPAL,
			NAVEGATION,
=======
			DEFAULT,
			ALL_VIEW_HORIZONTAL,
			ALL_VIEW_VERTICAL_LEFT,
			ALL_VIEW_VERTICAL_RIGHT,
			VERTICAL_LEFT,
			VERTICAL_RIGHT,
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		};

	/**
	 * A public read-only list of all the '<em><b>type Menu</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<typeMenu> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>type Menu</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typeMenu get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typeMenu result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type Menu</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typeMenu getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typeMenu result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type Menu</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typeMenu get(int value) {
		switch (value) {
<<<<<<< HEAD
			case PRINCIPAL_VALUE: return PRINCIPAL;
=======
			case DEFAULT_VALUE: return DEFAULT;
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private typeMenu(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //typeMenu
