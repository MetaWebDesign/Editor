/**
 */
package Modeldos.modeldos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Orientation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Modeldos.modeldos.ModeldosPackage#getTypeOrientation()
 * @model
 * @generated
 */
public enum TypeOrientation implements Enumerator {
	/**
	 * The '<em><b>Top Horizontal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_HORIZONTAL(0, "topHorizontal", "topHorizontal"),

	/**
	 * The '<em><b>Bottom Horizontal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_HORIZONTAL(1, "bottomHorizontal", "bottomHorizontal"),

	/**
	 * The '<em><b>Left Vertical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_VERTICAL(2, "leftVertical", "leftVertical"),

	/**
	 * The '<em><b>Right Vertical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_VERTICAL(3, "rightVertical", "rightVertical");

	/**
	 * The '<em><b>Top Horizontal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top Horizontal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_HORIZONTAL
	 * @model name="topHorizontal"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_HORIZONTAL_VALUE = 0;

	/**
	 * The '<em><b>Bottom Horizontal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bottom Horizontal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_HORIZONTAL
	 * @model name="bottomHorizontal"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_HORIZONTAL_VALUE = 1;

	/**
	 * The '<em><b>Left Vertical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Vertical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_VERTICAL
	 * @model name="leftVertical"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VERTICAL_VALUE = 2;

	/**
	 * The '<em><b>Right Vertical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Vertical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VERTICAL
	 * @model name="rightVertical"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VERTICAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeOrientation[] VALUES_ARRAY =
		new TypeOrientation[] {
			TOP_HORIZONTAL,
			BOTTOM_HORIZONTAL,
			LEFT_VERTICAL,
			RIGHT_VERTICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeOrientation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Orientation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOrientation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOrientation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Orientation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOrientation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOrientation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Orientation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOrientation get(int value) {
		switch (value) {
			case TOP_HORIZONTAL_VALUE: return TOP_HORIZONTAL;
			case BOTTOM_HORIZONTAL_VALUE: return BOTTOM_HORIZONTAL;
			case LEFT_VERTICAL_VALUE: return LEFT_VERTICAL;
			case RIGHT_VERTICAL_VALUE: return RIGHT_VERTICAL;
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
	private TypeOrientation(int value, String name, String literal) {
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
	
} //TypeOrientation
