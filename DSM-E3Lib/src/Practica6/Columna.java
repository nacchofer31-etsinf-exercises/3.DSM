/**
 */
package Practica6;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columna</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Practica6.Columna#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Practica6.Columna#getTipo <em>Tipo</em>}</li>
 *   <li>{@link Practica6.Columna#isEsPK <em>Es PK</em>}</li>
 *   <li>{@link Practica6.Columna#isPermiteNulos <em>Permite Nulos</em>}</li>
 *   <li>{@link Practica6.Columna#getTabla <em>Tabla</em>}</li>
 *   <li>{@link Practica6.Columna#getLargo <em>Largo</em>}</li>
 * </ul>
 *
 * @see Practica6.Practica6Package#getColumna()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Columna extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Practica6.Practica6Package#getColumna_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Practica6.Columna#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link Practica6.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see Practica6.TipoDato
	 * @see #setTipo(TipoDato)
	 * @see Practica6.Practica6Package#getColumna_Tipo()
	 * @model required="true"
	 * @generated
	 */
	TipoDato getTipo();

	/**
	 * Sets the value of the '{@link Practica6.Columna#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see Practica6.TipoDato
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Es PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es PK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es PK</em>' attribute.
	 * @see #setEsPK(boolean)
	 * @see Practica6.Practica6Package#getColumna_EsPK()
	 * @model required="true"
	 * @generated
	 */
	boolean isEsPK();

	/**
	 * Sets the value of the '{@link Practica6.Columna#isEsPK <em>Es PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es PK</em>' attribute.
	 * @see #isEsPK()
	 * @generated
	 */
	void setEsPK(boolean value);

	/**
	 * Returns the value of the '<em><b>Permite Nulos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permite Nulos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permite Nulos</em>' attribute.
	 * @see #setPermiteNulos(boolean)
	 * @see Practica6.Practica6Package#getColumna_PermiteNulos()
	 * @model required="true"
	 * @generated
	 */
	boolean isPermiteNulos();

	/**
	 * Sets the value of the '{@link Practica6.Columna#isPermiteNulos <em>Permite Nulos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permite Nulos</em>' attribute.
	 * @see #isPermiteNulos()
	 * @generated
	 */
	void setPermiteNulos(boolean value);

	/**
	 * Returns the value of the '<em><b>Tabla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Practica6.Tabla#getColumnas <em>Columnas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla</em>' container reference.
	 * @see #setTabla(Tabla)
	 * @see Practica6.Practica6Package#getColumna_Tabla()
	 * @see Practica6.Tabla#getColumnas
	 * @model opposite="columnas" required="true" transient="false"
	 * @generated
	 */
	Tabla getTabla();

	/**
	 * Sets the value of the '{@link Practica6.Columna#getTabla <em>Tabla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla</em>' container reference.
	 * @see #getTabla()
	 * @generated
	 */
	void setTabla(Tabla value);

	/**
	 * Returns the value of the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largo</em>' attribute.
	 * @see #setLargo(int)
	 * @see Practica6.Practica6Package#getColumna_Largo()
	 * @model
	 * @generated
	 */
	int getLargo();

	/**
	 * Sets the value of the '{@link Practica6.Columna#getLargo <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largo</em>' attribute.
	 * @see #getLargo()
	 * @generated
	 */
	void setLargo(int value);

} // Columna
