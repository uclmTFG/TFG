/**
 */
package mof;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Forma</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mof.MofPackage#getForma()
 * @model
 * @generated
 */
public enum Forma implements Enumerator {
	/**
	 * The '<em><b>Rectángulo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTÁNGULO_VALUE
	 * @generated
	 * @ordered
	 */
	RECTÁNGULO(0, "Rectángulo", "Rect\u00e1ngulo"),

	/**
	 * The '<em><b>Rectángulo Redondeado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTÁNGULO_REDONDEADO_VALUE
	 * @generated
	 * @ordered
	 */
	RECTÁNGULO_REDONDEADO(1, "RectánguloRedondeado", "Rect\u00e1nguloRedondeado"),

	/**
	 * The '<em><b>Círculo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CÍRCULO_VALUE
	 * @generated
	 * @ordered
	 */
	CÍRCULO(2, "Círculo", "C\u00edrculo"),

	/**
	 * The '<em><b>Círculo Doble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CÍRCULO_DOBLE_VALUE
	 * @generated
	 * @ordered
	 */
	CÍRCULO_DOBLE(3, "CírculoDoble", "C\u00edrculoDoble"),

	/**
	 * The '<em><b>Barra</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARRA_VALUE
	 * @generated
	 * @ordered
	 */
	BARRA(4, "Barra", "Barra"),

	/**
	 * The '<em><b>Rombo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROMBO_VALUE
	 * @generated
	 * @ordered
	 */
	ROMBO(5, "Rombo", "Rombo"),

	/**
	 * The '<em><b>Actor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTOR(6, "Actor", "Actor");

	/**
	 * The '<em><b>Rectángulo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTÁNGULO
	 * @model name="Rectángulo"
	 * @generated
	 * @ordered
	 */
	public static final int RECTÁNGULO_VALUE = 0;

	/**
	 * The '<em><b>Rectángulo Redondeado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTÁNGULO_REDONDEADO
	 * @model name="RectánguloRedondeado"
	 * @generated
	 * @ordered
	 */
	public static final int RECTÁNGULO_REDONDEADO_VALUE = 1;

	/**
	 * The '<em><b>Círculo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CÍRCULO
	 * @model name="Círculo"
	 * @generated
	 * @ordered
	 */
	public static final int CÍRCULO_VALUE = 2;

	/**
	 * The '<em><b>Círculo Doble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CÍRCULO_DOBLE
	 * @model name="CírculoDoble"
	 * @generated
	 * @ordered
	 */
	public static final int CÍRCULO_DOBLE_VALUE = 3;

	/**
	 * The '<em><b>Barra</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARRA
	 * @model name="Barra"
	 * @generated
	 * @ordered
	 */
	public static final int BARRA_VALUE = 4;

	/**
	 * The '<em><b>Rombo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROMBO
	 * @model name="Rombo"
	 * @generated
	 * @ordered
	 */
	public static final int ROMBO_VALUE = 5;

	/**
	 * The '<em><b>Actor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @model name="Actor"
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR_VALUE = 6;

	/**
	 * An array of all the '<em><b>Forma</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Forma[] VALUES_ARRAY =
		new Forma[] {
			RECTÁNGULO,
			RECTÁNGULO_REDONDEADO,
			CÍRCULO,
			CÍRCULO_DOBLE,
			BARRA,
			ROMBO,
			ACTOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Forma</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Forma> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Forma</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Forma get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Forma result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Forma</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Forma getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Forma result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Forma</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Forma get(int value) {
		switch (value) {
			case RECTÁNGULO_VALUE: return RECTÁNGULO;
			case RECTÁNGULO_REDONDEADO_VALUE: return RECTÁNGULO_REDONDEADO;
			case CÍRCULO_VALUE: return CÍRCULO;
			case CÍRCULO_DOBLE_VALUE: return CÍRCULO_DOBLE;
			case BARRA_VALUE: return BARRA;
			case ROMBO_VALUE: return ROMBO;
			case ACTOR_VALUE: return ACTOR;
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
	private Forma(int value, String name, String literal) {
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
	
} //Forma
