/**
 */
package Modelouno.modeluno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Types Alert</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Modelouno.modeluno.ModelunoPackage#getTypesAlert()
 * @model
 * @generated
 */
public enum TypesAlert implements Enumerator {
	/**
	 * The '<em><b>Successfully</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESSFULLY_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESSFULLY(0, "successfully", "successfully"),

	/**
	 * The '<em><b>Attention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTENTION_VALUE
	 * @generated
	 * @ordered
	 */
	ATTENTION(1, "attention", "attention"),

	/**
	 * The '<em><b>Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING(2, "warning", "warning"),

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(3, "error", "error");

	/**
	 * The '<em><b>Successfully</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Successfully</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCESSFULLY
	 * @model name="successfully"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESSFULLY_VALUE = 0;

	/**
	 * The '<em><b>Attention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attention</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTENTION
	 * @model name="attention"
	 * @generated
	 * @ordered
	 */
	public static final int ATTENTION_VALUE = 1;

	/**
	 * The '<em><b>Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Warning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARNING
	 * @model name="warning"
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_VALUE = 2;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model name="error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Types Alert</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypesAlert[] VALUES_ARRAY =
		new TypesAlert[] {
			SUCCESSFULLY,
			ATTENTION,
			WARNING,
			ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Types Alert</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypesAlert> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Types Alert</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesAlert get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypesAlert result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Types Alert</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesAlert getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypesAlert result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Types Alert</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesAlert get(int value) {
		switch (value) {
			case SUCCESSFULLY_VALUE: return SUCCESSFULLY;
			case ATTENTION_VALUE: return ATTENTION;
			case WARNING_VALUE: return WARNING;
			case ERROR_VALUE: return ERROR;
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
	private TypesAlert(int value, String name, String literal) {
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
	
} //TypesAlert
