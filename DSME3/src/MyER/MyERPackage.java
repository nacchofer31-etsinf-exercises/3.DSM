/**
 */
package MyER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MyER.MyERFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MyERPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MyER";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MyER";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MyER";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyERPackage eINSTANCE = MyER.impl.MyERPackageImpl.init();

	/**
	 * The meta object id for the '{@link MyER.impl.TablaImpl <em>Tabla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyER.impl.TablaImpl
	 * @see MyER.impl.MyERPackageImpl#getTabla()
	 * @generated
	 */
	int TABLA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Padre</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__PADRE = 1;

	/**
	 * The feature id for the '<em><b>Columnas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__COLUMNAS = 2;

	/**
	 * The number of structural features of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MyER.impl.ColumnaImpl <em>Columna</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyER.impl.ColumnaImpl
	 * @see MyER.impl.MyERPackageImpl#getColumna()
	 * @generated
	 */
	int COLUMNA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__TABLA = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__TIPO = 2;

	/**
	 * The feature id for the '<em><b>Es Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__ES_PRIMARIA = 3;

	/**
	 * The feature id for the '<em><b>Claves Ajena</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__CLAVES_AJENA = 4;

	/**
	 * The feature id for the '<em><b>En Clave Ajena</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__EN_CLAVE_AJENA = 5;

	/**
	 * The number of structural features of the '<em>Columna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Columna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MyER.impl.EsquemaImpl <em>Esquema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyER.impl.EsquemaImpl
	 * @see MyER.impl.MyERPackageImpl#getEsquema()
	 * @generated
	 */
	int ESQUEMA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tablas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA__TABLAS = 1;

	/**
	 * The feature id for the '<em><b>Claves Ajenas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA__CLAVES_AJENAS = 2;

	/**
	 * The number of structural features of the '<em>Esquema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Esquema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MyER.impl.ClaveAjenaImpl <em>Clave Ajena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyER.impl.ClaveAjenaImpl
	 * @see MyER.impl.MyERPackageImpl#getClaveAjena()
	 * @generated
	 */
	int CLAVE_AJENA = 3;

	/**
	 * The feature id for the '<em><b>Esquema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_AJENA__ESQUEMA = 0;

	/**
	 * The feature id for the '<em><b>Columna</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_AJENA__COLUMNA = 1;

	/**
	 * The feature id for the '<em><b>Columna Referenciada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_AJENA__COLUMNA_REFERENCIADA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_AJENA__NOMBRE = 3;

	/**
	 * The number of structural features of the '<em>Clave Ajena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_AJENA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Clave Ajena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_AJENA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MyER.TipoDatosER <em>Tipo Datos ER</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MyER.TipoDatosER
	 * @see MyER.impl.MyERPackageImpl#getTipoDatosER()
	 * @generated
	 */
	int TIPO_DATOS_ER = 4;


	/**
	 * Returns the meta object for class '{@link MyER.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabla</em>'.
	 * @see MyER.Tabla
	 * @generated
	 */
	EClass getTabla();

	/**
	 * Returns the meta object for the attribute '{@link MyER.Tabla#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see MyER.Tabla#getNombre()
	 * @see #getTabla()
	 * @generated
	 */
	EAttribute getTabla_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link MyER.Tabla#getPadre <em>Padre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Padre</em>'.
	 * @see MyER.Tabla#getPadre()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Padre();

	/**
	 * Returns the meta object for the containment reference list '{@link MyER.Tabla#getColumnas <em>Columnas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columnas</em>'.
	 * @see MyER.Tabla#getColumnas()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Columnas();

	/**
	 * Returns the meta object for class '{@link MyER.Columna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columna</em>'.
	 * @see MyER.Columna
	 * @generated
	 */
	EClass getColumna();

	/**
	 * Returns the meta object for the attribute '{@link MyER.Columna#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see MyER.Columna#getNombre()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_Nombre();

	/**
	 * Returns the meta object for the container reference '{@link MyER.Columna#getTabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tabla</em>'.
	 * @see MyER.Columna#getTabla()
	 * @see #getColumna()
	 * @generated
	 */
	EReference getColumna_Tabla();

	/**
	 * Returns the meta object for the attribute '{@link MyER.Columna#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see MyER.Columna#getTipo()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link MyER.Columna#isEsPrimaria <em>Es Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Primaria</em>'.
	 * @see MyER.Columna#isEsPrimaria()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_EsPrimaria();

	/**
	 * Returns the meta object for the reference '{@link MyER.Columna#getClavesAjena <em>Claves Ajena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Claves Ajena</em>'.
	 * @see MyER.Columna#getClavesAjena()
	 * @see #getColumna()
	 * @generated
	 */
	EReference getColumna_ClavesAjena();

	/**
	 * Returns the meta object for the reference list '{@link MyER.Columna#getEnClaveAjena <em>En Clave Ajena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>En Clave Ajena</em>'.
	 * @see MyER.Columna#getEnClaveAjena()
	 * @see #getColumna()
	 * @generated
	 */
	EReference getColumna_EnClaveAjena();

	/**
	 * Returns the meta object for class '{@link MyER.Esquema <em>Esquema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Esquema</em>'.
	 * @see MyER.Esquema
	 * @generated
	 */
	EClass getEsquema();

	/**
	 * Returns the meta object for the attribute '{@link MyER.Esquema#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see MyER.Esquema#getNombre()
	 * @see #getEsquema()
	 * @generated
	 */
	EAttribute getEsquema_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link MyER.Esquema#getTablas <em>Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablas</em>'.
	 * @see MyER.Esquema#getTablas()
	 * @see #getEsquema()
	 * @generated
	 */
	EReference getEsquema_Tablas();

	/**
	 * Returns the meta object for the containment reference list '{@link MyER.Esquema#getClavesAjenas <em>Claves Ajenas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claves Ajenas</em>'.
	 * @see MyER.Esquema#getClavesAjenas()
	 * @see #getEsquema()
	 * @generated
	 */
	EReference getEsquema_ClavesAjenas();

	/**
	 * Returns the meta object for class '{@link MyER.ClaveAjena <em>Clave Ajena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clave Ajena</em>'.
	 * @see MyER.ClaveAjena
	 * @generated
	 */
	EClass getClaveAjena();

	/**
	 * Returns the meta object for the container reference '{@link MyER.ClaveAjena#getEsquema <em>Esquema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Esquema</em>'.
	 * @see MyER.ClaveAjena#getEsquema()
	 * @see #getClaveAjena()
	 * @generated
	 */
	EReference getClaveAjena_Esquema();

	/**
	 * Returns the meta object for the reference '{@link MyER.ClaveAjena#getColumna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columna</em>'.
	 * @see MyER.ClaveAjena#getColumna()
	 * @see #getClaveAjena()
	 * @generated
	 */
	EReference getClaveAjena_Columna();

	/**
	 * Returns the meta object for the reference '{@link MyER.ClaveAjena#getColumnaReferenciada <em>Columna Referenciada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columna Referenciada</em>'.
	 * @see MyER.ClaveAjena#getColumnaReferenciada()
	 * @see #getClaveAjena()
	 * @generated
	 */
	EReference getClaveAjena_ColumnaReferenciada();

	/**
	 * Returns the meta object for the attribute '{@link MyER.ClaveAjena#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see MyER.ClaveAjena#getNombre()
	 * @see #getClaveAjena()
	 * @generated
	 */
	EAttribute getClaveAjena_Nombre();

	/**
	 * Returns the meta object for enum '{@link MyER.TipoDatosER <em>Tipo Datos ER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Datos ER</em>'.
	 * @see MyER.TipoDatosER
	 * @generated
	 */
	EEnum getTipoDatosER();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyERFactory getMyERFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MyER.impl.TablaImpl <em>Tabla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyER.impl.TablaImpl
		 * @see MyER.impl.MyERPackageImpl#getTabla()
		 * @generated
		 */
		EClass TABLA = eINSTANCE.getTabla();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLA__NOMBRE = eINSTANCE.getTabla_Nombre();

		/**
		 * The meta object literal for the '<em><b>Padre</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__PADRE = eINSTANCE.getTabla_Padre();

		/**
		 * The meta object literal for the '<em><b>Columnas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__COLUMNAS = eINSTANCE.getTabla_Columnas();

		/**
		 * The meta object literal for the '{@link MyER.impl.ColumnaImpl <em>Columna</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyER.impl.ColumnaImpl
		 * @see MyER.impl.MyERPackageImpl#getColumna()
		 * @generated
		 */
		EClass COLUMNA = eINSTANCE.getColumna();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__NOMBRE = eINSTANCE.getColumna_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tabla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNA__TABLA = eINSTANCE.getColumna_Tabla();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__TIPO = eINSTANCE.getColumna_Tipo();

		/**
		 * The meta object literal for the '<em><b>Es Primaria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__ES_PRIMARIA = eINSTANCE.getColumna_EsPrimaria();

		/**
		 * The meta object literal for the '<em><b>Claves Ajena</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNA__CLAVES_AJENA = eINSTANCE.getColumna_ClavesAjena();

		/**
		 * The meta object literal for the '<em><b>En Clave Ajena</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNA__EN_CLAVE_AJENA = eINSTANCE.getColumna_EnClaveAjena();

		/**
		 * The meta object literal for the '{@link MyER.impl.EsquemaImpl <em>Esquema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyER.impl.EsquemaImpl
		 * @see MyER.impl.MyERPackageImpl#getEsquema()
		 * @generated
		 */
		EClass ESQUEMA = eINSTANCE.getEsquema();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESQUEMA__NOMBRE = eINSTANCE.getEsquema_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tablas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESQUEMA__TABLAS = eINSTANCE.getEsquema_Tablas();

		/**
		 * The meta object literal for the '<em><b>Claves Ajenas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESQUEMA__CLAVES_AJENAS = eINSTANCE.getEsquema_ClavesAjenas();

		/**
		 * The meta object literal for the '{@link MyER.impl.ClaveAjenaImpl <em>Clave Ajena</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyER.impl.ClaveAjenaImpl
		 * @see MyER.impl.MyERPackageImpl#getClaveAjena()
		 * @generated
		 */
		EClass CLAVE_AJENA = eINSTANCE.getClaveAjena();

		/**
		 * The meta object literal for the '<em><b>Esquema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAVE_AJENA__ESQUEMA = eINSTANCE.getClaveAjena_Esquema();

		/**
		 * The meta object literal for the '<em><b>Columna</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAVE_AJENA__COLUMNA = eINSTANCE.getClaveAjena_Columna();

		/**
		 * The meta object literal for the '<em><b>Columna Referenciada</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAVE_AJENA__COLUMNA_REFERENCIADA = eINSTANCE.getClaveAjena_ColumnaReferenciada();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAVE_AJENA__NOMBRE = eINSTANCE.getClaveAjena_Nombre();

		/**
		 * The meta object literal for the '{@link MyER.TipoDatosER <em>Tipo Datos ER</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MyER.TipoDatosER
		 * @see MyER.impl.MyERPackageImpl#getTipoDatosER()
		 * @generated
		 */
		EEnum TIPO_DATOS_ER = eINSTANCE.getTipoDatosER();

	}

} //MyERPackage
