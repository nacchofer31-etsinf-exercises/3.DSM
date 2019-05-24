/**
 */
package MyER;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clave Ajena</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MyER.ClaveAjena#getEsquema <em>Esquema</em>}</li>
 *   <li>{@link MyER.ClaveAjena#getColumna <em>Columna</em>}</li>
 *   <li>{@link MyER.ClaveAjena#getColumnaReferenciada <em>Columna Referenciada</em>}</li>
 *   <li>{@link MyER.ClaveAjena#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see MyER.MyERPackage#getClaveAjena()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OrigenDistintoDestino ColumnaReferenciaPrimaria NombreNoNulo ColumnaNoPrimaria TiposIguales'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OrigenDistintoDestino='self.columna&lt;&gt; self.columnaReferencia' ColumnaReferenciaPrimaria='self.columnaReferencia.EsPrimaria' NombreNoNulo='not self.Nombre.oclIsUndefined()' ColumnaNoPrimaria='not self.columna.EsPrimaria' TiposIguales='self.columna.Tipo=self.columnaReferencia.Tipo'"
 * @extends CDOObject
 * @generated
 */
public interface ClaveAjena extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Esquema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MyER.Esquema#getClavesAjenas <em>Claves Ajenas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Esquema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esquema</em>' container reference.
	 * @see #setEsquema(Esquema)
	 * @see MyER.MyERPackage#getClaveAjena_Esquema()
	 * @see MyER.Esquema#getClavesAjenas
	 * @model opposite="clavesAjenas" required="true" transient="false"
	 * @generated
	 */
	Esquema getEsquema();

	/**
	 * Sets the value of the '{@link MyER.ClaveAjena#getEsquema <em>Esquema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Esquema</em>' container reference.
	 * @see #getEsquema()
	 * @generated
	 */
	void setEsquema(Esquema value);

	/**
	 * Returns the value of the '<em><b>Columna</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MyER.Columna#getClavesAjena <em>Claves Ajena</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columna</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columna</em>' reference.
	 * @see #setColumna(Columna)
	 * @see MyER.MyERPackage#getClaveAjena_Columna()
	 * @see MyER.Columna#getClavesAjena
	 * @model opposite="clavesAjena" required="true"
	 * @generated
	 */
	Columna getColumna();

	/**
	 * Sets the value of the '{@link MyER.ClaveAjena#getColumna <em>Columna</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columna</em>' reference.
	 * @see #getColumna()
	 * @generated
	 */
	void setColumna(Columna value);

	/**
	 * Returns the value of the '<em><b>Columna Referenciada</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MyER.Columna#getEnClaveAjena <em>En Clave Ajena</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columna Referenciada</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columna Referenciada</em>' reference.
	 * @see #setColumnaReferenciada(Columna)
	 * @see MyER.MyERPackage#getClaveAjena_ColumnaReferenciada()
	 * @see MyER.Columna#getEnClaveAjena
	 * @model opposite="enClaveAjena" required="true"
	 * @generated
	 */
	Columna getColumnaReferenciada();

	/**
	 * Sets the value of the '{@link MyER.ClaveAjena#getColumnaReferenciada <em>Columna Referenciada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columna Referenciada</em>' reference.
	 * @see #getColumnaReferenciada()
	 * @generated
	 */
	void setColumnaReferenciada(Columna value);

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
	 * @see MyER.MyERPackage#getClaveAjena_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link MyER.ClaveAjena#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // ClaveAjena
