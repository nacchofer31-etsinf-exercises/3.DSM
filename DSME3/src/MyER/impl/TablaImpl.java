/**
 */
package MyER.impl;

import MyER.Columna;
import MyER.Esquema;
import MyER.MyERPackage;
import MyER.Tabla;

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
 *   <li>{@link MyER.impl.TablaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link MyER.impl.TablaImpl#getPadre <em>Padre</em>}</li>
 *   <li>{@link MyER.impl.TablaImpl#getColumnas <em>Columnas</em>}</li>
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
		return MyERPackage.Literals.TABLA;
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
		return (String)eGet(MyERPackage.Literals.TABLA__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(MyERPackage.Literals.TABLA__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Esquema getPadre() {
		return (Esquema)eGet(MyERPackage.Literals.TABLA__PADRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadre(Esquema newPadre) {
		eSet(MyERPackage.Literals.TABLA__PADRE, newPadre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Columna> getColumnas() {
		return (EList<Columna>)eGet(MyERPackage.Literals.TABLA__COLUMNAS, true);
	}

} //TablaImpl
