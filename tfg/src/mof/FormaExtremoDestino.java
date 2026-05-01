/**
 */
package mof;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Forma Extremo Destino</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mof.MofPackage#getFormaExtremoDestino()
 * @model
 * @generated
 */
public enum FormaExtremoDestino implements Enumerator {
	/**
	 * The '<em><b>Ninguna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINGUNA_VALUE
	 * @generated
	 * @ordered
	 */
	NINGUNA(0, "Ninguna", "Ninguna"),

	/**
	 * The '<em><b>Rombo Sin Relleno</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROMBO_SIN_RELLENO_VALUE
	 * @generated
	 * @ordered
	 */
	ROMBO_SIN_RELLENO(1, "RomboSinRelleno", "RomboSinRelleno"),

	/**
	 * The '<em><b>Rombo Relleno</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROMBO_RELLENO_VALUE
	 * @generated
	 * @ordered
	 */
	ROMBO_RELLENO(2, "RomboRelleno", "RomboRelleno");

	/**
	 * The '<em><b>Ninguna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINGUNA
	 * @model name="Ninguna"
	 * @generated
	 * @ordered
	 */
	public static final int NINGUNA_VALUE = 0;

	/**
	 * The '<em><b>Rombo Sin Relleno</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROMBO_SIN_RELLENO
	 * @model name="RomboSinRelleno"
	 * @generated
	 * @ordered
	 */
	public static final int ROMBO_SIN_RELLENO_VALUE = 1;

	/**
	 * The '<em><b>Rombo Relleno</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROMBO_RELLENO
	 * @model name="RomboRelleno"
	 * @generated
	 * @ordered
	 */
	public static final int ROMBO_RELLENO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Forma Extremo Destino</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormaExtremoDestino[] VALUES_ARRAY =
		new FormaExtremoDestino[] {
			NINGUNA,
			ROMBO_SIN_RELLENO,
			ROMBO_RELLENO,
		};

	/**
	 * A public read-only list of all the '<em><b>Forma Extremo Destino</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormaExtremoDestino> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Forma Extremo Destino</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormaExtremoDestino get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormaExtremoDestino result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Forma Extremo Destino</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormaExtremoDestino getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormaExtremoDestino result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Forma Extremo Destino</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormaExtremoDestino get(int value) {
		switch (value) {
			case NINGUNA_VALUE: return NINGUNA;
			case ROMBO_SIN_RELLENO_VALUE: return ROMBO_SIN_RELLENO;
			case ROMBO_RELLENO_VALUE: return ROMBO_RELLENO;
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
	private FormaExtremoDestino(int value, String name, String literal) {
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
	
} //FormaExtremoDestino
