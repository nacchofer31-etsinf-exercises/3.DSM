/**
 */
package MyER.impl;

import MyER.ClaveAjena;
import MyER.Columna;
import MyER.MyERPackage;
import MyER.Tabla;
import MyER.TipoDatosER;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link MyER.impl.ColumnaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link MyER.impl.ColumnaImpl#getTabla <em>Tabla</em>}</li>
 *   <li>{@link MyER.impl.ColumnaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link MyER.impl.ColumnaImpl#isEsPrimaria <em>Es Primaria</em>}</li>
 *   <li>{@link MyER.impl.ColumnaImpl#getClavesAjena <em>Claves Ajena</em>}</li>
 *   <li>{@link MyER.impl.ColumnaImpl#getEnClaveAjena <em>En Clave Ajena</em>}</li>
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
		return MyERPackage.Literals.COLUMNA;
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
		return (String)eGet(MyERPackage.Literals.COLUMNA__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(MyERPackage.Literals.COLUMNA__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getTabla() {
		return (Tabla)eGet(MyERPackage.Literals.COLUMNA__TABLA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabla(Tabla newTabla) {
		eSet(MyERPackage.Literals.COLUMNA__TABLA, newTabla);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDatosER getTipo() {
		return (TipoDatosER)eGet(MyERPackage.Literals.COLUMNA__TIPO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoDatosER newTipo) {
		eSet(MyERPackage.Literals.COLUMNA__TIPO, newTipo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsPrimaria() {
		return (Boolean)eGet(MyERPackage.Literals.COLUMNA__ES_PRIMARIA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsPrimaria(boolean newEsPrimaria) {
		eSet(MyERPackage.Literals.COLUMNA__ES_PRIMARIA, newEsPrimaria);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaveAjena getClavesAjena() {
		return (ClaveAjena)eGet(MyERPackage.Literals.COLUMNA__CLAVES_AJENA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClavesAjena(ClaveAjena newClavesAjena) {
		eSet(MyERPackage.Literals.COLUMNA__CLAVES_AJENA, newClavesAjena);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClaveAjena> getEnClaveAjena() {
		return (EList<ClaveAjena>)eGet(MyERPackage.Literals.COLUMNA__EN_CLAVE_AJENA, true);
	}

} //ColumnaImpl
