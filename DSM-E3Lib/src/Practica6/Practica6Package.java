/**
 */
package Practica6;

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
 * @see Practica6.Practica6Factory
 * @model kind="package"
 * @generated
 */
public interface Practica6Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Practica6";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Practica6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Practica6";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Practica6Package eINSTANCE = Practica6.impl.Practica6PackageImpl.init();

	/**
	 * The meta object id for the '{@link Practica6.impl.EsquemaImpl <em>Esquema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Practica6.impl.EsquemaImpl
	 * @see Practica6.impl.Practica6PackageImpl#getEsquema()
	 * @generated
	 */
	int ESQUEMA = 0;

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
	 * The number of structural features of the '<em>Esquema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Esquema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Practica6.impl.TablaImpl <em>Tabla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Practica6.impl.TablaImpl
	 * @see Practica6.impl.Practica6PackageImpl#getTabla()
	 * @generated
	 */
	int TABLA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Columnas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__COLUMNAS = 1;

	/**
	 * The feature id for the '<em><b>Fks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__FKS = 2;

	/**
	 * The feature id for the '<em><b>Esquema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__ESQUEMA = 3;

	/**
	 * The number of structural features of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Practica6.impl.ColumnaImpl <em>Columna</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Practica6.impl.ColumnaImpl
	 * @see Practica6.impl.Practica6PackageImpl#getColumna()
	 * @generated
	 */
	int COLUMNA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Es PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__ES_PK = 2;

	/**
	 * The feature id for the '<em><b>Permite Nulos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__PERMITE_NULOS = 3;

	/**
	 * The feature id for the '<em><b>Tabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__TABLA = 4;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__LARGO = 5;

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
	 * The meta object id for the '{@link Practica6.impl.FKImpl <em>FK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Practica6.impl.FKImpl
	 * @see Practica6.impl.Practica6PackageImpl#getFK()
	 * @generated
	 */
	int FK = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__REFERENCIA = 1;

	/**
	 * The feature id for the '<em><b>Columna</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__COLUMNA = 2;

	/**
	 * The number of structural features of the '<em>FK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>FK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Practica6.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Practica6.TipoDato
	 * @see Practica6.impl.Practica6PackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 4;


	/**
	 * Returns the meta object for class '{@link Practica6.Esquema <em>Esquema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Esquema</em>'.
	 * @see Practica6.Esquema
	 * @generated
	 */
	EClass getEsquema();

	/**
	 * Returns the meta object for the attribute '{@link Practica6.Esquema#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Practica6.Esquema#getNombre()
	 * @see #getEsquema()
	 * @generated
	 */
	EAttribute getEsquema_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link Practica6.Esquema#getTablas <em>Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablas</em>'.
	 * @see Practica6.Esquema#getTablas()
	 * @see #getEsquema()
	 * @generated
	 */
	EReference getEsquema_Tablas();

	/**
	 * Returns the meta object for class '{@link Practica6.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabla</em>'.
	 * @see Practica6.Tabla
	 * @generated
	 */
	EClass getTabla();

	/**
	 * Returns the meta object for the attribute '{@link Practica6.Tabla#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Practica6.Tabla#getNombre()
	 * @see #getTabla()
	 * @generated
	 */
	EAttribute getTabla_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link Practica6.Tabla#getColumnas <em>Columnas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columnas</em>'.
	 * @see Practica6.Tabla#getColumnas()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Columnas();

	/**
	 * Returns the meta object for the containment reference list '{@link Practica6.Tabla#getFks <em>Fks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fks</em>'.
	 * @see Practica6.Tabla#getFks()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Fks();

	/**
	 * Returns the meta object for the container reference '{@link Practica6.Tabla#getEsquema <em>Esquema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Esquema</em>'.
	 * @see Practica6.Tabla#getEsquema()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Esquema();

	/**
	 * Returns the meta object for class '{@link Practica6.Columna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columna</em>'.
	 * @see Practica6.Columna
	 * @generated
	 */
	EClass getColumna();

	/**
	 * Returns the meta object for the attribute '{@link Practica6.Columna#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Practica6.Columna#getNombre()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link Practica6.Columna#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Practica6.Columna#getTipo()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link Practica6.Columna#isEsPK <em>Es PK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es PK</em>'.
	 * @see Practica6.Columna#isEsPK()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_EsPK();

	/**
	 * Returns the meta object for the attribute '{@link Practica6.Columna#isPermiteNulos <em>Permite Nulos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permite Nulos</em>'.
	 * @see Practica6.Columna#isPermiteNulos()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_PermiteNulos();

	/**
	 * Returns the meta object for the container reference '{@link Practica6.Columna#getTabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tabla</em>'.
	 * @see Practica6.Columna#getTabla()
	 * @see #getColumna()
	 * @generated
	 */
	EReference getColumna_Tabla();

	/**
	 * Returns the meta object for the attribute '{@link Practica6.Columna#getLargo <em>Largo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Largo</em>'.
	 * @see Practica6.Columna#getLargo()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_Largo();

	/**
	 * Returns the meta object for class '{@link Practica6.FK <em>FK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FK</em>'.
	 * @see Practica6.FK
	 * @generated
	 */
	EClass getFK();

	/**
	 * Returns the meta object for the attribute '{@link Practica6.FK#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see Practica6.FK#getNombre()
	 * @see #getFK()
	 * @generated
	 */
	EAttribute getFK_Nombre();

	/**
	 * Returns the meta object for the reference '{@link Practica6.FK#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia</em>'.
	 * @see Practica6.FK#getReferencia()
	 * @see #getFK()
	 * @generated
	 */
	EReference getFK_Referencia();

	/**
	 * Returns the meta object for the reference '{@link Practica6.FK#getColumna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columna</em>'.
	 * @see Practica6.FK#getColumna()
	 * @see #getFK()
	 * @generated
	 */
	EReference getFK_Columna();

	/**
	 * Returns the meta object for enum '{@link Practica6.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see Practica6.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Practica6Factory getPractica6Factory();

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
		 * The meta object literal for the '{@link Practica6.impl.EsquemaImpl <em>Esquema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Practica6.impl.EsquemaImpl
		 * @see Practica6.impl.Practica6PackageImpl#getEsquema()
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
		 * The meta object literal for the '{@link Practica6.impl.TablaImpl <em>Tabla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Practica6.impl.TablaImpl
		 * @see Practica6.impl.Practica6PackageImpl#getTabla()
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
		 * The meta object literal for the '<em><b>Columnas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__COLUMNAS = eINSTANCE.getTabla_Columnas();

		/**
		 * The meta object literal for the '<em><b>Fks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__FKS = eINSTANCE.getTabla_Fks();

		/**
		 * The meta object literal for the '<em><b>Esquema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__ESQUEMA = eINSTANCE.getTabla_Esquema();

		/**
		 * The meta object literal for the '{@link Practica6.impl.ColumnaImpl <em>Columna</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Practica6.impl.ColumnaImpl
		 * @see Practica6.impl.Practica6PackageImpl#getColumna()
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
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__TIPO = eINSTANCE.getColumna_Tipo();

		/**
		 * The meta object literal for the '<em><b>Es PK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__ES_PK = eINSTANCE.getColumna_EsPK();

		/**
		 * The meta object literal for the '<em><b>Permite Nulos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__PERMITE_NULOS = eINSTANCE.getColumna_PermiteNulos();

		/**
		 * The meta object literal for the '<em><b>Tabla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNA__TABLA = eINSTANCE.getColumna_Tabla();

		/**
		 * The meta object literal for the '<em><b>Largo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__LARGO = eINSTANCE.getColumna_Largo();

		/**
		 * The meta object literal for the '{@link Practica6.impl.FKImpl <em>FK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Practica6.impl.FKImpl
		 * @see Practica6.impl.Practica6PackageImpl#getFK()
		 * @generated
		 */
		EClass FK = eINSTANCE.getFK();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FK__NOMBRE = eINSTANCE.getFK_Nombre();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FK__REFERENCIA = eINSTANCE.getFK_Referencia();

		/**
		 * The meta object literal for the '<em><b>Columna</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FK__COLUMNA = eINSTANCE.getFK_Columna();

		/**
		 * The meta object literal for the '{@link Practica6.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Practica6.TipoDato
		 * @see Practica6.impl.Practica6PackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

	}

} //Practica6Package
