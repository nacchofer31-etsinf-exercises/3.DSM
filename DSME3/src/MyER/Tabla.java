/**
 */
package MyER;

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
 *   <li>{@link MyER.Tabla#getNombre <em>Nombre</em>}</li>
 *   <li>{@link MyER.Tabla#getPadre <em>Padre</em>}</li>
 *   <li>{@link MyER.Tabla#getColumnas <em>Columnas</em>}</li>
 * </ul>
 *
 * @see MyER.MyERPackage#getTabla()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NombreNoNulo UnicaClavePriamria NombreDeColumnaUnico'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NombreNoNulo='not self.Nombre.oclIsUndefined()' UnicaClavePriamria='self.columnas-&gt;select(EsPrimaria)-&gt;size() = 1' NombreDeColumnaUnico='self.columnas-&gt;isUnique(Nombre)'"
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
	 * @see MyER.MyERPackage#getTabla_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link MyER.Tabla#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Padre</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MyER.Esquema#getTablas <em>Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padre</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padre</em>' container reference.
	 * @see #setPadre(Esquema)
	 * @see MyER.MyERPackage#getTabla_Padre()
	 * @see MyER.Esquema#getTablas
	 * @model opposite="Tablas" required="true" transient="false"
	 * @generated
	 */
	Esquema getPadre();

	/**
	 * Sets the value of the '{@link MyER.Tabla#getPadre <em>Padre</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padre</em>' container reference.
	 * @see #getPadre()
	 * @generated
	 */
	void setPadre(Esquema value);

	/**
	 * Returns the value of the '<em><b>Columnas</b></em>' containment reference list.
	 * The list contents are of type {@link MyER.Columna}.
	 * It is bidirectional and its opposite is '{@link MyER.Columna#getTabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnas</em>' containment reference list.
	 * @see MyER.MyERPackage#getTabla_Columnas()
	 * @see MyER.Columna#getTabla
	 * @model opposite="tabla" containment="true"
	 * @generated
	 */
	EList<Columna> getColumnas();

} // Tabla
