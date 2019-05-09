/**
 */
package Practica6;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Esquema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Practica6.Esquema#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Practica6.Esquema#getTablas <em>Tablas</em>}</li>
 * </ul>
 *
 * @see Practica6.Practica6Package#getEsquema()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Esquema extends CDOObject {
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
	 * @see Practica6.Practica6Package#getEsquema_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Practica6.Esquema#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tablas</b></em>' containment reference list.
	 * The list contents are of type {@link Practica6.Tabla}.
	 * It is bidirectional and its opposite is '{@link Practica6.Tabla#getEsquema <em>Esquema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablas</em>' containment reference list.
	 * @see Practica6.Practica6Package#getEsquema_Tablas()
	 * @see Practica6.Tabla#getEsquema
	 * @model opposite="esquema" containment="true"
	 * @generated
	 */
	EList<Tabla> getTablas();

} // Esquema
