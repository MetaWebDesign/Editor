/**
 */
package Metawebdesign.metawebdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getTypeOperator()
 * @model
 * @generated
 */
public enum TypeOperator implements Enumerator {
	/**
	 * The '<em><b>Igual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	IGUAL(0, "igual", "igual"),

	/**
	 * The '<em><b>Menor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENOR_VALUE
	 * @generated
	 * @ordered
	 */
	MENOR(1, "menor", "menor"),

	/**
	 * The '<em><b>Mayor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAYOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAYOR(2, "mayor", "mayor"),

	/**
	 * The '<em><b>Menor igual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENOR_IGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MENOR_IGUAL(3, "menor_igual", "menor_igual"),

	/**
	 * The '<em><b>Mayor igual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAYOR_IGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MAYOR_IGUAL(4, "mayor_igual", "mayor_igual"),

	/**
	 * The '<em><b>Diferente</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFERENTE_VALUE
	 * @generated
	 * @ordered
	 */
	DIFERENTE(5, "diferente", "diferente");

	/**
	 * The '<em><b>Igual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Igual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGUAL
	 * @model name="igual"
	 * @generated
	 * @ordered
	 */
	public static final int IGUAL_VALUE = 0;

	/**
	 * The '<em><b>Menor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Menor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENOR
	 * @model name="menor"
	 * @generated
	 * @ordered
	 */
	public static final int MENOR_VALUE = 1;

	/**
	 * The '<em><b>Mayor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mayor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAYOR
	 * @model name="mayor"
	 * @generated
	 * @ordered
	 */
	public static final int MAYOR_VALUE = 2;

	/**
	 * The '<em><b>Menor igual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Menor igual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENOR_IGUAL
	 * @model name="menor_igual"
	 * @generated
	 * @ordered
	 */
	public static final int MENOR_IGUAL_VALUE = 3;

	/**
	 * The '<em><b>Mayor igual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mayor igual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAYOR_IGUAL
	 * @model name="mayor_igual"
	 * @generated
	 * @ordered
	 */
	public static final int MAYOR_IGUAL_VALUE = 4;

	/**
	 * The '<em><b>Diferente</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diferente</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFERENTE
	 * @model name="diferente"
	 * @generated
	 * @ordered
	 */
	public static final int DIFERENTE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeOperator[] VALUES_ARRAY =
		new TypeOperator[] {
			IGUAL,
			MENOR,
			MAYOR,
			MENOR_IGUAL,
			MAYOR_IGUAL,
			DIFERENTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOperator get(int value) {
		switch (value) {
			case IGUAL_VALUE: return IGUAL;
			case MENOR_VALUE: return MENOR;
			case MAYOR_VALUE: return MAYOR;
			case MENOR_IGUAL_VALUE: return MENOR_IGUAL;
			case MAYOR_IGUAL_VALUE: return MAYOR_IGUAL;
			case DIFERENTE_VALUE: return DIFERENTE;
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
	private TypeOperator(int value, String name, String literal) {
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
	
} //TypeOperator
