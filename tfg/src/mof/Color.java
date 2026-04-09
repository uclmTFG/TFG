/**
 */
package mof;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mof.MofPackage#getColor()
 * @model
 * @generated
 */
public enum Color implements Enumerator {
	/**
	 * The '<em><b>Blanco</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLANCO_VALUE
	 * @generated
	 * @ordered
	 */
	BLANCO(0, "Blanco", "Blanco"),

	/**
	 * The '<em><b>Negro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGRO_VALUE
	 * @generated
	 * @ordered
	 */
	NEGRO(1, "Negro", "Negro"),

	/**
	 * The '<em><b>Azul</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZUL_VALUE
	 * @generated
	 * @ordered
	 */
	AZUL(2, "Azul", "Azul"),

	/**
	 * The '<em><b>Amarillo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMARILLO_VALUE
	 * @generated
	 * @ordered
	 */
	AMARILLO(3, "Amarillo", "Amarillo"),

	/**
	 * The '<em><b>Naranja</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARANJA_VALUE
	 * @generated
	 * @ordered
	 */
	NARANJA(4, "Naranja", "Naranja"),

	/**
	 * The '<em><b>Rojo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROJO_VALUE
	 * @generated
	 * @ordered
	 */
	ROJO(5, "Rojo", "Rojo"),

	/**
	 * The '<em><b>Verde</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERDE_VALUE
	 * @generated
	 * @ordered
	 */
	VERDE(6, "Verde", "Verde"),

	/**
	 * The '<em><b>Rosa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROSA_VALUE
	 * @generated
	 * @ordered
	 */
	ROSA(7, "Rosa", "Rosa"),

	/**
	 * The '<em><b>Lila</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LILA_VALUE
	 * @generated
	 * @ordered
	 */
	LILA(8, "Lila", "Lila");

	/**
	 * The '<em><b>Blanco</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLANCO
	 * @model name="Blanco"
	 * @generated
	 * @ordered
	 */
	public static final int BLANCO_VALUE = 0;

	/**
	 * The '<em><b>Negro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGRO
	 * @model name="Negro"
	 * @generated
	 * @ordered
	 */
	public static final int NEGRO_VALUE = 1;

	/**
	 * The '<em><b>Azul</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZUL
	 * @model name="Azul"
	 * @generated
	 * @ordered
	 */
	public static final int AZUL_VALUE = 2;

	/**
	 * The '<em><b>Amarillo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMARILLO
	 * @model name="Amarillo"
	 * @generated
	 * @ordered
	 */
	public static final int AMARILLO_VALUE = 3;

	/**
	 * The '<em><b>Naranja</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARANJA
	 * @model name="Naranja"
	 * @generated
	 * @ordered
	 */
	public static final int NARANJA_VALUE = 4;

	/**
	 * The '<em><b>Rojo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROJO
	 * @model name="Rojo"
	 * @generated
	 * @ordered
	 */
	public static final int ROJO_VALUE = 5;

	/**
	 * The '<em><b>Verde</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERDE
	 * @model name="Verde"
	 * @generated
	 * @ordered
	 */
	public static final int VERDE_VALUE = 6;

	/**
	 * The '<em><b>Rosa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROSA
	 * @model name="Rosa"
	 * @generated
	 * @ordered
	 */
	public static final int ROSA_VALUE = 7;

	/**
	 * The '<em><b>Lila</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LILA
	 * @model name="Lila"
	 * @generated
	 * @ordered
	 */
	public static final int LILA_VALUE = 8;

	/**
	 * An array of all the '<em><b>Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Color[] VALUES_ARRAY =
		new Color[] {
			BLANCO,
			NEGRO,
			AZUL,
			AMARILLO,
			NARANJA,
			ROJO,
			VERDE,
			ROSA,
			LILA,
		};

	/**
	 * A public read-only list of all the '<em><b>Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Color get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Color result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Color getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Color result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Color get(int value) {
		switch (value) {
			case BLANCO_VALUE: return BLANCO;
			case NEGRO_VALUE: return NEGRO;
			case AZUL_VALUE: return AZUL;
			case AMARILLO_VALUE: return AMARILLO;
			case NARANJA_VALUE: return NARANJA;
			case ROJO_VALUE: return ROJO;
			case VERDE_VALUE: return VERDE;
			case ROSA_VALUE: return ROSA;
			case LILA_VALUE: return LILA;
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
	private Color(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //Color
