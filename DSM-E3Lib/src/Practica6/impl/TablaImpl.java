/**
 */
package Practica6.impl;

import Practica6.Columna;
import Practica6.Esquema;
import Practica6.FK;
import Practica6.Practica6Package;
import Practica6.Tabla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Practica6.impl.TablaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Practica6.impl.TablaImpl#getColumnas <em>Columnas</em>}</li>
 *   <li>{@link Practica6.impl.TablaImpl#getFks <em>Fks</em>}</li>
 *   <li>{@link Practica6.impl.TablaImpl#getEsquema <em>Esquema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TablaImpl extends CDOObjectImpl implements Tabla {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TablaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Practica6Package.Literals.TABLA;
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
		return (String)eGet(Practica6Package.Literals.TABLA__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(Practica6Package.Literals.TABLA__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Columna> getColumnas() {
		return (EList<Columna>)eGet(Practica6Package.Literals.TABLA__COLUMNAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FK> getFks() {
		return (EList<FK>)eGet(Practica6Package.Literals.TABLA__FKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Esquema getEsquema() {
		return (Esquema)eGet(Practica6Package.Literals.TABLA__ESQUEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsquema(Esquema newEsquema) {
		eSet(Practica6Package.Literals.TABLA__ESQUEMA, newEsquema);
	}

} //TablaImpl
