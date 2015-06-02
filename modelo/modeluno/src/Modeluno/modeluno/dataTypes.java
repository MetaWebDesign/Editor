/**
 */
package Modeluno.modeluno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>data Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Modeluno.modeluno.ModelunoPackage#getdataTypes()
 * @model
 * @generated
 */
public enum dataTypes implements Enumerator {
	/**
	 * The '<em><b>Autonumeric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTONUMERIC_VALUE
	 * @generated
	 * @ordered
	 */
	AUTONUMERIC(0, "autonumeric", "autonumeric"),

	/**
	 * The '<em><b>Img</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMG_VALUE
	 * @generated
	 * @ordered
	 */
	IMG(1, "img", "img"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(2, "date", "date"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(3, "int", "int"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(5, "string", "string"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(4, "float", "float"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(7, "time", "time"),

	/**
	 * The '<em><b>Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO(6, "video", "video"),

	/**
	 * The '<em><b>Flash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLASH_VALUE
	 * @generated
	 * @ordered
	 */
	FLASH(8, "flash", "flash");

	/**
	 * The '<em><b>Autonumeric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autonumeric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTONUMERIC
	 * @model name="autonumeric"
	 * @generated
	 * @ordered
	 */
	public static final int AUTONUMERIC_VALUE = 0;

	/**
	 * The '<em><b>Img</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Img</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMG
	 * @model name="img"
	 * @generated
	 * @ordered
	 */
	public static final int IMG_VALUE = 1;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 2;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 3;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 5;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 4;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 7;

	/**
	 * The '<em><b>Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Video</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIDEO
	 * @model name="video"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_VALUE = 6;

	/**
	 * The '<em><b>Flash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLASH
	 * @model name="flash"
	 * @generated
	 * @ordered
	 */
	public static final int FLASH_VALUE = 8;

	/**
	 * An array of all the '<em><b>data Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final dataTypes[] VALUES_ARRAY =
		new dataTypes[] {
			AUTONUMERIC,
			IMG,
			DATE,
			INT,
			STRING,
			FLOAT,
			TIME,
			VIDEO,
			FLASH,
		};

	/**
	 * A public read-only list of all the '<em><b>data Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<dataTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>data Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static dataTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			dataTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>data Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static dataTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			dataTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>data Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static dataTypes get(int value) {
		switch (value) {
			case AUTONUMERIC_VALUE: return AUTONUMERIC;
			case IMG_VALUE: return IMG;
			case DATE_VALUE: return DATE;
			case INT_VALUE: return INT;
			case STRING_VALUE: return STRING;
			case FLOAT_VALUE: return FLOAT;
			case TIME_VALUE: return TIME;
			case VIDEO_VALUE: return VIDEO;
			case FLASH_VALUE: return FLASH;
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
	private dataTypes(int value, String name, String literal) {
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
	
} //dataTypes
