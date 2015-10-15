/**
 */
package Metawebdesign.metawebdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>type View Attribute</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#gettypeViewAttribute()
 * @model
 * @generated
 */
public enum typeViewAttribute implements Enumerator {
	/**
	 * The '<em><b>Data Base</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_BASE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_BASE(0, "DataBase", "DataBase"),

	/**
	 * The '<em><b>Session User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SESSION_USER_VALUE
	 * @generated
	 * @ordered
	 */
	SESSION_USER(0, "SessionUser", "SessionUser");

	/**
	 * The '<em><b>Data Base</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Base</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_BASE
	 * @model name="DataBase"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_BASE_VALUE = 0;

	/**
	 * The '<em><b>Session User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Session User</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SESSION_USER
	 * @model name="SessionUser"
	 * @generated
	 * @ordered
	 */
	public static final int SESSION_USER_VALUE = 0;

	/**
	 * An array of all the '<em><b>type View Attribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final typeViewAttribute[] VALUES_ARRAY =
		new typeViewAttribute[] {
			DATA_BASE,
			SESSION_USER,
		};

	/**
	 * A public read-only list of all the '<em><b>type View Attribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<typeViewAttribute> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>type View Attribute</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typeViewAttribute get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typeViewAttribute result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type View Attribute</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typeViewAttribute getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typeViewAttribute result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type View Attribute</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typeViewAttribute get(int value) {
		switch (value) {
			case DATA_BASE_VALUE: return DATA_BASE;
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
	private typeViewAttribute(int value, String name, String literal) {
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
	
} //typeViewAttribute
