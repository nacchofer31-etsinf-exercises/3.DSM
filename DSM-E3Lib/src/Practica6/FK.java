/**
 */
package Practica6;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Practica6.FK#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Practica6.FK#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link Practica6.FK#getColumna <em>Columna</em>}</li>
 * </ul>
 *
 * @see Practica6.Practica6Package#getFK()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface FK extends CDOObject {
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
	 * @see Practica6.Practica6Package#getFK_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Practica6.FK#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' reference.
	 * @see #setReferencia(Tabla)
	 * @see Practica6.Practica6Package#getFK_Referencia()
	 * @model required="true"
	 * @generated
	 */
	Tabla getReferencia();

	/**
	 * Sets the value of the '{@link Practica6.FK#getReferencia <em>Referencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' reference.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(Tabla value);

	/**
	 * Returns the value of the '<em><b>Columna</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columna</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columna</em>' reference.
	 * @see #setColumna(Columna)
	 * @see Practica6.Practica6Package#getFK_Columna()
	 * @model required="true"
	 * @generated
	 */
	Columna getColumna();

	/**
	 * Sets the value of the '{@link Practica6.FK#getColumna <em>Columna</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columna</em>' reference.
	 * @see #getColumna()
	 * @generated
	 */
	void setColumna(Columna value);

} // FK
