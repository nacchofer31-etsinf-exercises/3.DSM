/**
 */
package Practica6.impl;

import Practica6.Columna;
import Practica6.FK;
import Practica6.Practica6Package;
import Practica6.Tabla;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Practica6.impl.FKImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Practica6.impl.FKImpl#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link Practica6.impl.FKImpl#getColumna <em>Columna</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FKImpl extends CDOObjectImpl implements FK {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FKImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Practica6Package.Literals.FK;
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
	public String getNombre() {
		return (String)eGet(Practica6Package.Literals.FK__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(Practica6Package.Literals.FK__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getReferencia() {
		return (Tabla)eGet(Practica6Package.Literals.FK__REFERENCIA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencia(Tabla newReferencia) {
		eSet(Practica6Package.Literals.FK__REFERENCIA, newReferencia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Columna getColumna() {
		return (Columna)eGet(Practica6Package.Literals.FK__COLUMNA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumna(Columna newColumna) {
		eSet(Practica6Package.Literals.FK__COLUMNA, newColumna);
	}

} //FKImpl
