/**
 */
package MyER;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columna</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MyER.Columna#getNombre <em>Nombre</em>}</li>
 *   <li>{@link MyER.Columna#getTabla <em>Tabla</em>}</li>
 *   <li>{@link MyER.Columna#getTipo <em>Tipo</em>}</li>
 *   <li>{@link MyER.Columna#isEsPrimaria <em>Es Primaria</em>}</li>
 *   <li>{@link MyER.Columna#getClavesAjena <em>Claves Ajena</em>}</li>
 *   <li>{@link MyER.Columna#getEnClaveAjena <em>En Clave Ajena</em>}</li>
 * </ul>
 *
 * @see MyER.MyERPackage#getColumna()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NombreNoNulo'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NombreNoNulo='not self.Nombre.oclIsUndefined()'"
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
	 * @see MyER.MyERPackage#getColumna_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link MyER.Columna#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tabla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MyER.Tabla#getColumnas <em>Columnas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla</em>' container reference.
	 * @see #setTabla(Tabla)
	 * @see MyER.MyERPackage#getColumna_Tabla()
	 * @see MyER.Tabla#getColumnas
	 * @model opposite="columnas" required="true" transient="false"
	 * @generated
	 */
	Tabla getTabla();

	/**
	 * Sets the value of the '{@link MyER.Columna#getTabla <em>Tabla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla</em>' container reference.
	 * @see #getTabla()
	 * @generated
	 */
	void setTabla(Tabla value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link MyER.TipoDatosER}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see MyER.TipoDatosER
	 * @see #setTipo(TipoDatosER)
	 * @see MyER.MyERPackage#getColumna_Tipo()
	 * @model
	 * @generated
	 */
	TipoDatosER getTipo();

	/**
	 * Sets the value of the '{@link MyER.Columna#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see MyER.TipoDatosER
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoDatosER value);

	/**
	 * Returns the value of the '<em><b>Es Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Primaria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Primaria</em>' attribute.
	 * @see #setEsPrimaria(boolean)
	 * @see MyER.MyERPackage#getColumna_EsPrimaria()
	 * @model
	 * @generated
	 */
	boolean isEsPrimaria();

	/**
	 * Sets the value of the '{@link MyER.Columna#isEsPrimaria <em>Es Primaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Primaria</em>' attribute.
	 * @see #isEsPrimaria()
	 * @generated
	 */
	void setEsPrimaria(boolean value);

	/**
	 * Returns the value of the '<em><b>Claves Ajena</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MyER.ClaveAjena#getColumna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claves Ajena</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claves Ajena</em>' reference.
	 * @see #setClavesAjena(ClaveAjena)
	 * @see MyER.MyERPackage#getColumna_ClavesAjena()
	 * @see MyER.ClaveAjena#getColumna
	 * @model opposite="columna"
	 * @generated
	 */
	ClaveAjena getClavesAjena();

	/**
	 * Sets the value of the '{@link MyER.Columna#getClavesAjena <em>Claves Ajena</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claves Ajena</em>' reference.
	 * @see #getClavesAjena()
	 * @generated
	 */
	void setClavesAjena(ClaveAjena value);

	/**
	 * Returns the value of the '<em><b>En Clave Ajena</b></em>' reference list.
	 * The list contents are of type {@link MyER.ClaveAjena}.
	 * It is bidirectional and its opposite is '{@link MyER.ClaveAjena#getColumnaReferenciada <em>Columna Referenciada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>En Clave Ajena</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>En Clave Ajena</em>' reference list.
	 * @see MyER.MyERPackage#getColumna_EnClaveAjena()
	 * @see MyER.ClaveAjena#getColumnaReferenciada
	 * @model opposite="columnaReferenciada"
	 * @generated
	 */
	EList<ClaveAjena> getEnClaveAjena();

} // Columna
