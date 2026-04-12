/**
 */
package mof;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Forma Extremo Origen</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mof.MofPackage#getFormaExtremoOrigen()
 * @model
 * @generated
 */
public enum FormaExtremoOrigen implements Enumerator {
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
	 * The '<em><b>Flecha Abierta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLECHA_ABIERTA_VALUE
	 * @generated
	 * @ordered
	 */
	FLECHA_ABIERTA(1, "FlechaAbierta", "FlechaAbierta"),

	/**
	 * The '<em><b>Flecha Cerrada</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLECHA_CERRADA_VALUE
	 * @generated
	 * @ordered
	 */
	FLECHA_CERRADA(2, "FlechaCerrada", "FlechaCerrada");

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
	 * The '<em><b>Flecha Abierta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLECHA_ABIERTA
	 * @model name="FlechaAbierta"
	 * @generated
	 * @ordered
	 */
	public static final int FLECHA_ABIERTA_VALUE = 1;

	/**
	 * The '<em><b>Flecha Cerrada</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLECHA_CERRADA
	 * @model name="FlechaCerrada"
	 * @generated
	 * @ordered
	 */
	public static final int FLECHA_CERRADA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Forma Extremo Origen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormaExtremoOrigen[] VALUES_ARRAY =
		new FormaExtremoOrigen[] {
			NINGUNA,
			FLECHA_ABIERTA,
			FLECHA_CERRADA,
		};

	/**
	 * A public read-only list of all the '<em><b>Forma Extremo Origen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormaExtremoOrigen> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Forma Extremo Origen</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormaExtremoOrigen get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormaExtremoOrigen result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Forma Extremo Origen</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormaExtremoOrigen getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormaExtremoOrigen result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Forma Extremo Origen</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FormaExtremoOrigen get(int value) {
		switch (value) {
			case NINGUNA_VALUE: return NINGUNA;
			case FLECHA_ABIERTA_VALUE: return FLECHA_ABIERTA;
			case FLECHA_CERRADA_VALUE: return FLECHA_CERRADA;
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
	private FormaExtremoOrigen(int value, String name, String literal) {
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
	
} //FormaExtremoOrigen
