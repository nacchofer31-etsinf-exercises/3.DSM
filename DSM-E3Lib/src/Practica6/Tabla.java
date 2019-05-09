/**
 */
package Practica6;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Practica6.Tabla#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Practica6.Tabla#getColumnas <em>Columnas</em>}</li>
 *   <li>{@link Practica6.Tabla#getFks <em>Fks</em>}</li>
 *   <li>{@link Practica6.Tabla#getEsquema <em>Esquema</em>}</li>
 * </ul>
 *
 * @see Practica6.Practica6Package#getTabla()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Tabla extends CDOObject {
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
	 * @see Practica6.Practica6Package#getTabla_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Practica6.Tabla#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Columnas</b></em>' containment reference list.
	 * The list contents are of type {@link Practica6.Columna}.
	 * It is bidirectional and its opposite is '{@link Practica6.Columna#getTabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnas</em>' containment reference list.
	 * @see Practica6.Practica6Package#getTabla_Columnas()
	 * @see Practica6.Columna#getTabla
	 * @model opposite="tabla" containment="true"
	 * @generated
	 */
	EList<Columna> getColumnas();

	/**
	 * Returns the value of the '<em><b>Fks</b></em>' containment reference list.
	 * The list contents are of type {@link Practica6.FK}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fks</em>' containment reference list.
	 * @see Practica6.Practica6Package#getTabla_Fks()
	 * @model containment="true"
	 * @generated
	 */
	EList<FK> getFks();

	/**
	 * Returns the value of the '<em><b>Esquema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Practica6.Esquema#getTablas <em>Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Esquema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esquema</em>' container reference.
	 * @see #setEsquema(Esquema)
	 * @see Practica6.Practica6Package#getTabla_Esquema()
	 * @see Practica6.Esquema#getTablas
	 * @model opposite="tablas" required="true" transient="false"
	 * @generated
	 */
	Esquema getEsquema();

	/**
	 * Sets the value of the '{@link Practica6.Tabla#getEsquema <em>Esquema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Esquema</em>' container reference.
	 * @see #getEsquema()
	 * @generated
	 */
	void setEsquema(Esquema value);

} // Tabla
