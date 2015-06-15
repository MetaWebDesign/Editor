/**
 */
package Metawebdesign.metawebdesign;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Service</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Metawebdesign.metawebdesign.MetawebdesignPackage#getTypeService()
 * @model
 * @generated
 */
public enum TypeService implements Enumerator {
	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(0, "create", "create"),

	/**
	 * The '<em><b>Update attribute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_ATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_ATTRIBUTE(1, "update_attribute", "update_attribute"),

	/**
	 * The '<em><b>Update object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_OBJECT(2, "update_object", "update_object"),

	/**
	 * The '<em><b>Display objects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_OBJECTS_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY_OBJECTS(3, "display_objects", "display_objects"),

	/**
	 * The '<em><b>Display object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY_OBJECT(4, "display_object", "display_object"),

	/**
	 * The '<em><b>Admin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMIN_VALUE
	 * @generated
	 * @ordered
	 */
	ADMIN(5, "admin", "admin");

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model name="create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 0;

	/**
	 * The '<em><b>Update attribute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update attribute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE_ATTRIBUTE
	 * @model name="update_attribute"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_ATTRIBUTE_VALUE = 1;

	/**
	 * The '<em><b>Update object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE_OBJECT
	 * @model name="update_object"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_OBJECT_VALUE = 2;

	/**
	 * The '<em><b>Display objects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Display objects</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_OBJECTS
	 * @model name="display_objects"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY_OBJECTS_VALUE = 3;

	/**
	 * The '<em><b>Display object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Display object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_OBJECT
	 * @model name="display_object"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY_OBJECT_VALUE = 4;

	/**
	 * The '<em><b>Admin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Admin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMIN
	 * @model name="admin"
	 * @generated
	 * @ordered
	 */
	public static final int ADMIN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeService[] VALUES_ARRAY =
		new TypeService[] {
			CREATE,
			UPDATE_ATTRIBUTE,
			UPDATE_OBJECT,
			DISPLAY_OBJECTS,
			DISPLAY_OBJECT,
			ADMIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeService> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Service</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeService get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeService result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Service</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeService getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeService result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Service</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeService get(int value) {
		switch (value) {
			case CREATE_VALUE: return CREATE;
			case UPDATE_ATTRIBUTE_VALUE: return UPDATE_ATTRIBUTE;
			case UPDATE_OBJECT_VALUE: return UPDATE_OBJECT;
			case DISPLAY_OBJECTS_VALUE: return DISPLAY_OBJECTS;
			case DISPLAY_OBJECT_VALUE: return DISPLAY_OBJECT;
			case ADMIN_VALUE: return ADMIN;
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
	private TypeService(int value, String name, String literal) {
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
	
} //TypeService
