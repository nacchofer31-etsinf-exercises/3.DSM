/**
 */
package Practica6.impl;

import Practica6.Columna;
import Practica6.Practica6Package;
import Practica6.Tabla;
import Practica6.TipoDato;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columna</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Practica6.impl.ColumnaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Practica6.impl.ColumnaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link Practica6.impl.ColumnaImpl#isEsPK <em>Es PK</em>}</li>
 *   <li>{@link Practica6.impl.ColumnaImpl#isPermiteNulos <em>Permite Nulos</em>}</li>
 *   <li>{@link Practica6.impl.ColumnaImpl#getTabla <em>Tabla</em>}</li>
 *   <li>{@link Practica6.impl.ColumnaImpl#getLargo <em>Largo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnaImpl extends CDOObjectImpl implements Columna {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Practica6Package.Literals.COLUMNA;
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
		return (String)eGet(Practica6Package.Literals.COLUMNA__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(Practica6Package.Literals.COLUMNA__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipo() {
		return (TipoDato)eGet(Practica6Package.Literals.COLUMNA__TIPO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoDato newTipo) {
		eSet(Practica6Package.Literals.COLUMNA__TIPO, newTipo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsPK() {
		return (Boolean)eGet(Practica6Package.Literals.COLUMNA__ES_PK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsPK(boolean newEsPK) {
		eSet(Practica6Package.Literals.COLUMNA__ES_PK, newEsPK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPermiteNulos() {
		return (Boolean)eGet(Practica6Package.Literals.COLUMNA__PERMITE_NULOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermiteNulos(boolean newPermiteNulos) {
		eSet(Practica6Package.Literals.COLUMNA__PERMITE_NULOS, newPermiteNulos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getTabla() {
		return (Tabla)eGet(Practica6Package.Literals.COLUMNA__TABLA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabla(Tabla newTabla) {
		eSet(Practica6Package.Literals.COLUMNA__TABLA, newTabla);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLargo() {
		return (Integer)eGet(Practica6Package.Literals.COLUMNA__LARGO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargo(int newLargo) {
		eSet(Practica6Package.Literals.COLUMNA__LARGO, newLargo);
	}

} //ColumnaImpl
