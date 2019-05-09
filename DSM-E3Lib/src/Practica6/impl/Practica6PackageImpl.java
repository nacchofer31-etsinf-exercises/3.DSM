/**
 */
package Practica6.impl;

import Practica6.Columna;
import Practica6.Esquema;
import Practica6.Practica6Factory;
import Practica6.Practica6Package;
import Practica6.Tabla;
import Practica6.TipoDato;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Practica6PackageImpl extends EPackageImpl implements Practica6Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esquemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDatoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Practica6.Practica6Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Practica6PackageImpl() {
		super(eNS_URI, Practica6Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Practica6Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Practica6Package init() {
		if (isInited) return (Practica6Package)EPackage.Registry.INSTANCE.getEPackage(Practica6Package.eNS_URI);

		// Obtain or create and register package
		Practica6PackageImpl thePractica6Package = (Practica6PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Practica6PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Practica6PackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePractica6Package.createPackageContents();

		// Initialize created meta-data
		thePractica6Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePractica6Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Practica6Package.eNS_URI, thePractica6Package);
		return thePractica6Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsquema() {
		return esquemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsquema_Nombre() {
		return (EAttribute)esquemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsquema_Tablas() {
		return (EReference)esquemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabla() {
		return tablaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabla_Nombre() {
		return (EAttribute)tablaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_Columnas() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_Fks() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_Esquema() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumna() {
		return columnaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumna_Nombre() {
		return (EAttribute)columnaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumna_Tipo() {
		return (EAttribute)columnaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumna_EsPK() {
		return (EAttribute)columnaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumna_PermiteNulos() {
		return (EAttribute)columnaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumna_Tabla() {
		return (EReference)columnaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumna_Largo() {
		return (EAttribute)columnaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFK() {
		return fkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFK_Nombre() {
		return (EAttribute)fkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFK_Referencia() {
		return (EReference)fkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFK_Columna() {
		return (EReference)fkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practica6Factory getPractica6Factory() {
		return (Practica6Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		esquemaEClass = createEClass(ESQUEMA);
		createEAttribute(esquemaEClass, ESQUEMA__NOMBRE);
		createEReference(esquemaEClass, ESQUEMA__TABLAS);

		tablaEClass = createEClass(TABLA);
		createEAttribute(tablaEClass, TABLA__NOMBRE);
		createEReference(tablaEClass, TABLA__COLUMNAS);
		createEReference(tablaEClass, TABLA__FKS);
		createEReference(tablaEClass, TABLA__ESQUEMA);

		columnaEClass = createEClass(COLUMNA);
		createEAttribute(columnaEClass, COLUMNA__NOMBRE);
		createEAttribute(columnaEClass, COLUMNA__TIPO);
		createEAttribute(columnaEClass, COLUMNA__ES_PK);
		createEAttribute(columnaEClass, COLUMNA__PERMITE_NULOS);
		createEReference(columnaEClass, COLUMNA__TABLA);
		createEAttribute(columnaEClass, COLUMNA__LARGO);

		fkEClass = createEClass(FK);
		createEAttribute(fkEClass, FK__NOMBRE);
		createEReference(fkEClass, FK__REFERENCIA);
		createEReference(fkEClass, FK__COLUMNA);

		// Create enums
		tipoDatoEEnum = createEEnum(TIPO_DATO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(esquemaEClass, Esquema.class, "Esquema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEsquema_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Esquema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsquema_Tablas(), this.getTabla(), this.getTabla_Esquema(), "tablas", null, 0, -1, Esquema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tablaEClass, Tabla.class, "Tabla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabla_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_Columnas(), this.getColumna(), this.getColumna_Tabla(), "columnas", null, 0, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_Fks(), this.getFK(), null, "fks", null, 0, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_Esquema(), this.getEsquema(), this.getEsquema_Tablas(), "esquema", null, 1, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnaEClass, Columna.class, "Columna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumna_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumna_Tipo(), this.getTipoDato(), "tipo", null, 1, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumna_EsPK(), ecorePackage.getEBoolean(), "esPK", null, 1, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumna_PermiteNulos(), ecorePackage.getEBoolean(), "permiteNulos", null, 1, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumna_Tabla(), this.getTabla(), this.getTabla_Columnas(), "tabla", null, 1, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumna_Largo(), ecorePackage.getEInt(), "largo", null, 0, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fkEClass, Practica6.FK.class, "FK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFK_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Practica6.FK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFK_Referencia(), this.getTabla(), null, "referencia", null, 1, 1, Practica6.FK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFK_Columna(), this.getColumna(), null, "columna", null, 1, 1, Practica6.FK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.ENTERO);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.REAL);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.CARACTER);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.CADENA);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BOOLEAN);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.FECHA);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.FECHA_HORA);

		// Create resource
		createResource(eNS_URI);
	}

} //Practica6PackageImpl
