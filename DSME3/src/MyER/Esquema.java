/**
 */
package MyER;

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
 *   <li>{@link MyER.Esquema#getNombre <em>Nombre</em>}</li>
 *   <li>{@link MyER.Esquema#getTablas <em>Tablas</em>}</li>
 *   <li>{@link MyER.Esquema#getClavesAjenas <em>Claves Ajenas</em>}</li>
 * </ul>
 *
 * @see MyER.MyERPackage#getEsquema()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NobreClaveAjenaUnico NombreTablaUnico ClavesDistintas NombreNoNulo'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NobreClaveAjenaUnico='self.clavesAjenas-&gt;isUnique(Nombre)' NombreTablaUnico='self.Tablas-&gt;isUnique(Nombre)' ClavesDistintas='self.clavesAjenas-&gt;forAll(ca1 : ClaveAjena, ca2 : ClaveAjena | ca1.columna = ca2.columna and ca1.columnaReferencia = ca2.columnaReferencia implies ca1 = ca2)' NombreNoNulo='not self.Nombre.oclIsUndefined()'"
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
	 * @see MyER.MyERPackage#getEsquema_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link MyER.Esquema#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tablas</b></em>' containment reference list.
	 * The list contents are of type {@link MyER.Tabla}.
	 * It is bidirectional and its opposite is '{@link MyER.Tabla#getPadre <em>Padre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablas</em>' containment reference list.
	 * @see MyER.MyERPackage#getEsquema_Tablas()
	 * @see MyER.Tabla#getPadre
	 * @model opposite="Padre" containment="true"
	 * @generated
	 */
	EList<Tabla> getTablas();

	/**
	 * Returns the value of the '<em><b>Claves Ajenas</b></em>' containment reference list.
	 * The list contents are of type {@link MyER.ClaveAjena}.
	 * It is bidirectional and its opposite is '{@link MyER.ClaveAjena#getEsquema <em>Esquema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claves Ajenas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claves Ajenas</em>' containment reference list.
	 * @see MyER.MyERPackage#getEsquema_ClavesAjenas()
	 * @see MyER.ClaveAjena#getEsquema
	 * @model opposite="esquema" containment="true"
	 * @generated
	 */
	EList<ClaveAjena> getClavesAjenas();

} // Esquema
