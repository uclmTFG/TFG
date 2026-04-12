/**
 */
package mof;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visibilidad</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mof.MofPackage#getVisibilidad()
 * @model
 * @generated
 */
public enum Visibilidad implements Enumerator {
	/**
	 * The '<em><b>Privado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVADO_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVADO(0, "Privado", "Privado"),

	/**
	 * The '<em><b>Publico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLICO_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLICO(1, "Publico", "Publico"),

	/**
	 * The '<em><b>Protegido</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTEGIDO_VALUE
	 * @generated
	 * @ordered
	 */
	PROTEGIDO(2, "Protegido", "Protegido"),

	/**
	 * The '<em><b>Paquete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAQUETE_VALUE
	 * @generated
	 * @ordered
	 */
	PAQUETE(3, "Paquete", "Paquete"),

	/**
	 * The '<em><b>Estático</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTÁTICO_VALUE
	 * @generated
	 * @ordered
	 */
	ESTÁTICO(4, "Estático", "Est\u00e1tico");

	/**
	 * The '<em><b>Privado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVADO
	 * @model name="Privado"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVADO_VALUE = 0;

	/**
	 * The '<em><b>Publico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLICO
	 * @model name="Publico"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLICO_VALUE = 1;

	/**
	 * The '<em><b>Protegido</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTEGIDO
	 * @model name="Protegido"
	 * @generated
	 * @ordered
	 */
	public static final int PROTEGIDO_VALUE = 2;

	/**
	 * The '<em><b>Paquete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAQUETE
	 * @model name="Paquete"
	 * @generated
	 * @ordered
	 */
	public static final int PAQUETE_VALUE = 3;

	/**
	 * The '<em><b>Estático</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTÁTICO
	 * @model name="Estático"
	 * @generated
	 * @ordered
	 */
	public static final int ESTÁTICO_VALUE = 4;

	/**
	 * An array of all the '<em><b>Visibilidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Visibilidad[] VALUES_ARRAY =
		new Visibilidad[] {
			PRIVADO,
			PUBLICO,
			PROTEGIDO,
			PAQUETE,
			ESTÁTICO,
		};

	/**
	 * A public read-only list of all the '<em><b>Visibilidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Visibilidad> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Visibilidad</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Visibilidad get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Visibilidad result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibilidad</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Visibilidad getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Visibilidad result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibilidad</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Visibilidad get(int value) {
		switch (value) {
			case PRIVADO_VALUE: return PRIVADO;
			case PUBLICO_VALUE: return PUBLICO;
			case PROTEGIDO_VALUE: return PROTEGIDO;
			case PAQUETE_VALUE: return PAQUETE;
			case ESTÁTICO_VALUE: return ESTÁTICO;
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
	private Visibilidad(int value, String name, String literal) {
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
	
} //Visibilidad
