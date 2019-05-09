/**
 */
package Practica6.impl;

import Practica6.Esquema;
import Practica6.Practica6Package;
import Practica6.Tabla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Esquema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Practica6.impl.EsquemaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Practica6.impl.EsquemaImpl#getTablas <em>Tablas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EsquemaImpl extends CDOObjectImpl implements Esquema {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsquemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Practica6Package.Literals.ESQUEMA;
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
		return (String)eGet(Practica6Package.Literals.ESQUEMA__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(Practica6Package.Literals.ESQUEMA__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tabla> getTablas() {
		return (EList<Tabla>)eGet(Practica6Package.Literals.ESQUEMA__TABLAS, true);
	}

} //EsquemaImpl
