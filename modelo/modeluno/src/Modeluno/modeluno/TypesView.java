/**
 */
package Modeluno.modeluno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Types View</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Modeluno.modeluno.ModelunoPackage#getTypesView()
 * @model
 * @generated
 */
public enum TypesView implements Enumerator {
	/**
	 * The '<em><b>Combo Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBO_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	COMBO_BOX(0, "comboBox", "comboBox"),

	/**
	 * The '<em><b>Checkbox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX(1, "checkbox", "checkbox"),

	/**
	 * The '<em><b>Radio Buttom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_BUTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO_BUTTOM(2, "radioButtom", "radioButtom"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(3, "text", "text"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(4, "list", "list"),

	/**
	 * The '<em><b>Thumbnail labe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THUMBNAIL_LABE_VALUE
	 * @generated
	 * @ordered
	 */
	THUMBNAIL_LABE(5, "thumbnail_labe", "thumbnail_labe"),

	/**
	 * The '<em><b>Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE(6, "table", "table");

	/**
	 * The '<em><b>Combo Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Combo Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBO_BOX
	 * @model name="comboBox"
	 * @generated
	 * @ordered
	 */
	public static final int COMBO_BOX_VALUE = 0;

	/**
	 * The '<em><b>Checkbox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Checkbox</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @model name="checkbox"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_VALUE = 1;

	/**
	 * The '<em><b>Radio Buttom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radio Buttom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIO_BUTTOM
	 * @model name="radioButtom"
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_BUTTOM_VALUE = 2;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 3;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model name="list"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 4;

	/**
	 * The '<em><b>Thumbnail labe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Thumbnail labe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THUMBNAIL_LABE
	 * @model name="thumbnail_labe"
	 * @generated
	 * @ordered
	 */
	public static final int THUMBNAIL_LABE_VALUE = 5;

	/**
	 * The '<em><b>Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE
	 * @model name="table"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Types View</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypesView[] VALUES_ARRAY =
		new TypesView[] {
			COMBO_BOX,
			CHECKBOX,
			RADIO_BUTTOM,
			TEXT,
			LIST,
			THUMBNAIL_LABE,
			TABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Types View</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypesView> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Types View</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesView get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypesView result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Types View</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesView getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypesView result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Types View</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesView get(int value) {
		switch (value) {
			case COMBO_BOX_VALUE: return COMBO_BOX;
			case CHECKBOX_VALUE: return CHECKBOX;
			case RADIO_BUTTOM_VALUE: return RADIO_BUTTOM;
			case TEXT_VALUE: return TEXT;
			case LIST_VALUE: return LIST;
			case THUMBNAIL_LABE_VALUE: return THUMBNAIL_LABE;
			case TABLE_VALUE: return TABLE;
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
	private TypesView(int value, String name, String literal) {
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
	
} //TypesView
