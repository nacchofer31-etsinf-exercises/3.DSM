/**
 */
package MyER.impl;

import MyER.ClaveAjena;
import MyER.Esquema;
import MyER.MyERPackage;
import MyER.Tabla;

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
 *   <li>{@link MyER.impl.EsquemaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link MyER.impl.EsquemaImpl#getTablas <em>Tablas</em>}</li>
 *   <li>{@link MyER.impl.EsquemaImpl#getClavesAjenas <em>Claves Ajenas</em>}</li>
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
		return MyERPackage.Literals.ESQUEMA;
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
		return (String)eGet(MyERPackage.Literals.ESQUEMA__NOMBRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		eSet(MyERPackage.Literals.ESQUEMA__NOMBRE, newNombre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tabla> getTablas() {
		return (EList<Tabla>)eGet(MyERPackage.Literals.ESQUEMA__TABLAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ClaveAjena> getClavesAjenas() {
		return (EList<ClaveAjena>)eGet(MyERPackage.Literals.ESQUEMA__CLAVES_AJENAS, true);
	}

} //EsquemaImpl
