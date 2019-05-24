/**
 */
package MyER.impl;

import MyER.ClaveAjena;
import MyER.Columna;
import MyER.Esquema;
import MyER.MyERFactory;
import MyER.MyERPackage;
import MyER.Tabla;
import MyER.TipoDatosER;

import MyER.util.MyERValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyERPackageImpl extends EPackageImpl implements MyERPackage {
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
	private EClass esquemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claveAjenaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDatosEREEnum = null;

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
	 * @see MyER.MyERPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyERPackageImpl() {
		super(eNS_URI, MyERFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MyERPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyERPackage init() {
		if (isInited) return (MyERPackage)EPackage.Registry.INSTANCE.getEPackage(MyERPackage.eNS_URI);

		// Obtain or create and register package
		MyERPackageImpl theMyERPackage = (MyERPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyERPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyERPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMyERPackage.createPackageContents();

		// Initialize created meta-data
		theMyERPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMyERPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MyERValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMyERPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyERPackage.eNS_URI, theMyERPackage);
		return theMyERPackage;
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
	public EReference getTabla_Padre() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabla_Columnas() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(2);
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
	public EReference getColumna_Tabla() {
		return (EReference)columnaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumna_Tipo() {
		return (EAttribute)columnaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumna_EsPrimaria() {
		return (EAttribute)columnaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumna_ClavesAjena() {
		return (EReference)columnaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumna_EnClaveAjena() {
		return (EReference)columnaEClass.getEStructuralFeatures().get(5);
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
	public EReference getEsquema_ClavesAjenas() {
		return (EReference)esquemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaveAjena() {
		return claveAjenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaveAjena_Esquema() {
		return (EReference)claveAjenaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaveAjena_Columna() {
		return (EReference)claveAjenaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaveAjena_ColumnaReferenciada() {
		return (EReference)claveAjenaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaveAjena_Nombre() {
		return (EAttribute)claveAjenaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDatosER() {
		return tipoDatosEREEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyERFactory getMyERFactory() {
		return (MyERFactory)getEFactoryInstance();
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
		tablaEClass = createEClass(TABLA);
		createEAttribute(tablaEClass, TABLA__NOMBRE);
		createEReference(tablaEClass, TABLA__PADRE);
		createEReference(tablaEClass, TABLA__COLUMNAS);

		columnaEClass = createEClass(COLUMNA);
		createEAttribute(columnaEClass, COLUMNA__NOMBRE);
		createEReference(columnaEClass, COLUMNA__TABLA);
		createEAttribute(columnaEClass, COLUMNA__TIPO);
		createEAttribute(columnaEClass, COLUMNA__ES_PRIMARIA);
		createEReference(columnaEClass, COLUMNA__CLAVES_AJENA);
		createEReference(columnaEClass, COLUMNA__EN_CLAVE_AJENA);

		esquemaEClass = createEClass(ESQUEMA);
		createEAttribute(esquemaEClass, ESQUEMA__NOMBRE);
		createEReference(esquemaEClass, ESQUEMA__TABLAS);
		createEReference(esquemaEClass, ESQUEMA__CLAVES_AJENAS);

		claveAjenaEClass = createEClass(CLAVE_AJENA);
		createEReference(claveAjenaEClass, CLAVE_AJENA__ESQUEMA);
		createEReference(claveAjenaEClass, CLAVE_AJENA__COLUMNA);
		createEReference(claveAjenaEClass, CLAVE_AJENA__COLUMNA_REFERENCIADA);
		createEAttribute(claveAjenaEClass, CLAVE_AJENA__NOMBRE);

		// Create enums
		tipoDatosEREEnum = createEEnum(TIPO_DATOS_ER);
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
		initEClass(tablaEClass, Tabla.class, "Tabla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabla_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_Padre(), this.getEsquema(), this.getEsquema_Tablas(), "Padre", null, 1, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_Columnas(), this.getColumna(), this.getColumna_Tabla(), "columnas", null, 0, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnaEClass, Columna.class, "Columna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumna_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumna_Tabla(), this.getTabla(), this.getTabla_Columnas(), "tabla", null, 1, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumna_Tipo(), this.getTipoDatosER(), "Tipo", null, 0, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumna_EsPrimaria(), ecorePackage.getEBoolean(), "EsPrimaria", null, 0, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumna_ClavesAjena(), this.getClaveAjena(), this.getClaveAjena_Columna(), "clavesAjena", null, 0, 1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumna_EnClaveAjena(), this.getClaveAjena(), this.getClaveAjena_ColumnaReferenciada(), "enClaveAjena", null, 0, -1, Columna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esquemaEClass, Esquema.class, "Esquema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEsquema_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Esquema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsquema_Tablas(), this.getTabla(), this.getTabla_Padre(), "Tablas", null, 0, -1, Esquema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsquema_ClavesAjenas(), this.getClaveAjena(), this.getClaveAjena_Esquema(), "clavesAjenas", null, 0, -1, Esquema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claveAjenaEClass, ClaveAjena.class, "ClaveAjena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClaveAjena_Esquema(), this.getEsquema(), this.getEsquema_ClavesAjenas(), "esquema", null, 1, 1, ClaveAjena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaveAjena_Columna(), this.getColumna(), this.getColumna_ClavesAjena(), "columna", null, 1, 1, ClaveAjena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaveAjena_ColumnaReferenciada(), this.getColumna(), this.getColumna_EnClaveAjena(), "columnaReferenciada", null, 1, 1, ClaveAjena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaveAjena_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, ClaveAjena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoDatosEREEnum, TipoDatosER.class, "TipoDatosER");
		addEEnumLiteral(tipoDatosEREEnum, TipoDatosER.INTEGER);
		addEEnumLiteral(tipoDatosEREEnum, TipoDatosER.DOUBLE);
		addEEnumLiteral(tipoDatosEREEnum, TipoDatosER.STRING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (tablaEClass, 
		   source, 
		   new String[] {
			 "constraints", "NombreNoNulo UnicaClavePriamria NombreDeColumnaUnico"
		   });	
		addAnnotation
		  (columnaEClass, 
		   source, 
		   new String[] {
			 "constraints", "NombreNoNulo"
		   });	
		addAnnotation
		  (esquemaEClass, 
		   source, 
		   new String[] {
			 "constraints", "NobreClaveAjenaUnico NombreTablaUnico ClavesDistintas NombreNoNulo"
		   });	
		addAnnotation
		  (claveAjenaEClass, 
		   source, 
		   new String[] {
			 "constraints", "OrigenDistintoDestino ColumnaReferenciaPrimaria NombreNoNulo ColumnaNoPrimaria TiposIguales"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (tablaEClass, 
		   source, 
		   new String[] {
			 "NombreNoNulo", "not self.Nombre.oclIsUndefined()",
			 "UnicaClavePriamria", "self.columnas->select(EsPrimaria)->size() = 1",
			 "NombreDeColumnaUnico", "self.columnas->isUnique(Nombre)"
		   });	
		addAnnotation
		  (columnaEClass, 
		   source, 
		   new String[] {
			 "NombreNoNulo", "not self.Nombre.oclIsUndefined()"
		   });	
		addAnnotation
		  (esquemaEClass, 
		   source, 
		   new String[] {
			 "NobreClaveAjenaUnico", "self.clavesAjenas->isUnique(Nombre)",
			 "NombreTablaUnico", "self.Tablas->isUnique(Nombre)",
			 "ClavesDistintas", "self.clavesAjenas->forAll(ca1 : ClaveAjena, ca2 : ClaveAjena | ca1.columna = ca2.columna and ca1.columnaReferencia = ca2.columnaReferencia implies ca1 = ca2)",
			 "NombreNoNulo", "not self.Nombre.oclIsUndefined()"
		   });	
		addAnnotation
		  (claveAjenaEClass, 
		   source, 
		   new String[] {
			 "OrigenDistintoDestino", "self.columna<> self.columnaReferencia",
			 "ColumnaReferenciaPrimaria", "self.columnaReferencia.EsPrimaria",
			 "NombreNoNulo", "not self.Nombre.oclIsUndefined()",
			 "ColumnaNoPrimaria", "not self.columna.EsPrimaria",
			 "TiposIguales", "self.columna.Tipo=self.columnaReferencia.Tipo"
		   });
	}

} //MyERPackageImpl
