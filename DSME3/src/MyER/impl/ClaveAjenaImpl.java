/**
 */
package MyER.impl;

import MyER.ClaveAjena;
import MyER.Columna;
import MyER.Esquema;
import MyER.MyERPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clave Ajena</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MyER.impl.ClaveAjenaImpl#getEsquema <em>Esquema</em>}</li>
 *   <li>{@link MyER.impl.ClaveAjenaImpl#getColumna <em>Columna</em>}</li>
 *   <li>{@link MyER.impl.ClaveAjenaImpl#getColumnaReferenciada <em>Columna Referenciada</em>}</li>
 *   <li>{@link MyER.impl.ClaveAjenaImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaveAjenaImpl extends CDOObjectImpl implements ClaveAjena {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaveAjenaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyERPackage.Literals.CLAVE_AJENA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Esquema getEsquema() {
		return (Esquema)eGet(MyERPackage.Literals.CLAVE_AJENA__ESQUEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsquema(Esquema newEsquema) {
		eSet(MyERPackage.Literals.CLAVE_AJENA__ESQUEMA, newEsquema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columna getColumna() {
		return (Columna)eGet(MyERPackage.Literals.CLAVE_AJENA__COLUMNA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumna(Columna newColumna) {
		eSet(MyERPackage.Literals.CLAVE_AJENA__COLUMNA, newColumna);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columna getColumnaReferenciada() {
		return (Columna)eGet(MyERPackage.Literals.CLAVE_AJENA__COLUMNA_REFERENCIADA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnaReferenciada(Columna newColumnaReferenciada) {
		eSet(MyERPackage.Literals.CLAVE_AJENA__COLUMNA_REFERENCIADA, newColumnaReferenciada);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return (String)eGet(MyERPackage.Literals.CLAVE_AJENA__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(MyERPackage.Literals.CLAVE_AJENA__NOMBRE, newNombre);
	}

} //ClaveAjenaImpl
