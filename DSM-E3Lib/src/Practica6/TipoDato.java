/**
 */
package Practica6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Dato</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Practica6.Practica6Package#getTipoDato()
 * @model
 * @generated
 */
public enum TipoDato implements Enumerator {
	/**
	 * The '<em><b>Entero</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERO_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERO(0, "Entero", "Entero"),

	/**
	 * The '<em><b>Real</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(1, "Real", "Real"),

	/**
	 * The '<em><b>Caracter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	CARACTER(2, "Caracter", "Caracter"),

	/**
	 * The '<em><b>Cadena</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CADENA_VALUE
	 * @generated
	 * @ordered
	 */
	CADENA(3, "Cadena", "Cadena"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(4, "Boolean", "Boolean"),

	/**
	 * The '<em><b>Fecha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FECHA_VALUE
	 * @generated
	 * @ordered
	 */
	FECHA(5, "Fecha", "Fecha"),

	/**
	 * The '<em><b>Fecha Hora</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FECHA_HORA_VALUE
	 * @generated
	 * @ordered
	 */
	FECHA_HORA(6, "FechaHora", "FechaHora");

	/**
	 * The '<em><b>Entero</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entero</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTERO
	 * @model name="Entero"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERO_VALUE = 0;

	/**
	 * The '<em><b>Real</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Real</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model name="Real"
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 1;

	/**
	 * The '<em><b>Caracter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Caracter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARACTER
	 * @model name="Caracter"
	 * @generated
	 * @ordered
	 */
	public static final int CARACTER_VALUE = 2;

	/**
	 * The '<em><b>Cadena</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cadena</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CADENA
	 * @model name="Cadena"
	 * @generated
	 * @ordered
	 */
	public static final int CADENA_VALUE = 3;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 4;

	/**
	 * The '<em><b>Fecha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fecha</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FECHA
	 * @model name="Fecha"
	 * @generated
	 * @ordered
	 */
	public static final int FECHA_VALUE = 5;

	/**
	 * The '<em><b>Fecha Hora</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fecha Hora</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FECHA_HORA
	 * @model name="FechaHora"
	 * @generated
	 * @ordered
	 */
	public static final int FECHA_HORA_VALUE = 6;

	/**
	 * An array of all the '<em><b>Tipo Dato</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoDato[] VALUES_ARRAY =
		new TipoDato[] {
			ENTERO,
			REAL,
			CARACTER,
			CADENA,
			BOOLEAN,
			FECHA,
			FECHA_HORA,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Dato</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoDato> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Dato</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoDato get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDato result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Dato</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoDato getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDato result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Dato</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoDato get(int value) {
		switch (value) {
			case ENTERO_VALUE: return ENTERO;
			case REAL_VALUE: return REAL;
			case CARACTER_VALUE: return CARACTER;
			case CADENA_VALUE: return CADENA;
			case BOOLEAN_VALUE: return BOOLEAN;
			case FECHA_VALUE: return FECHA;
			case FECHA_HORA_VALUE: return FECHA_HORA;
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
	private TipoDato(int value, String name, String literal) {
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
	
} //TipoDato
