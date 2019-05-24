/**
 */
package MyER.util;

import MyER.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see MyER.MyERPackage
 * @generated
 */
public class MyERValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MyERValidator INSTANCE = new MyERValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MyER";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyERValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MyERPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MyERPackage.TABLA:
				return validateTabla((Tabla)value, diagnostics, context);
			case MyERPackage.COLUMNA:
				return validateColumna((Columna)value, diagnostics, context);
			case MyERPackage.ESQUEMA:
				return validateEsquema((Esquema)value, diagnostics, context);
			case MyERPackage.CLAVE_AJENA:
				return validateClaveAjena((ClaveAjena)value, diagnostics, context);
			case MyERPackage.TIPO_DATOS_ER:
				return validateTipoDatosER((TipoDatosER)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)tabla, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_NombreNoNulo(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_UnicaClavePriamria(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_NombreDeColumnaUnico(tabla, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NombreNoNulo constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLA__NOMBRE_NO_NULO__EEXPRESSION = "not self.Nombre.oclIsUndefined()";

	/**
	 * Validates the NombreNoNulo constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_NombreNoNulo(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.TABLA,
				 (EObject)tabla,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NombreNoNulo",
				 TABLA__NOMBRE_NO_NULO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UnicaClavePriamria constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLA__UNICA_CLAVE_PRIAMRIA__EEXPRESSION = "self.columnas->select(EsPrimaria)->size() = 1";

	/**
	 * Validates the UnicaClavePriamria constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_UnicaClavePriamria(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.TABLA,
				 (EObject)tabla,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UnicaClavePriamria",
				 TABLA__UNICA_CLAVE_PRIAMRIA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NombreDeColumnaUnico constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLA__NOMBRE_DE_COLUMNA_UNICO__EEXPRESSION = "self.columnas->isUnique(Nombre)";

	/**
	 * Validates the NombreDeColumnaUnico constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_NombreDeColumnaUnico(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.TABLA,
				 (EObject)tabla,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NombreDeColumnaUnico",
				 TABLA__NOMBRE_DE_COLUMNA_UNICO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumna(Columna columna, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)columna, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)columna, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)columna, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)columna, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)columna, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)columna, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)columna, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)columna, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)columna, diagnostics, context);
		if (result || diagnostics != null) result &= validateColumna_NombreNoNulo(columna, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NombreNoNulo constraint of '<em>Columna</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMNA__NOMBRE_NO_NULO__EEXPRESSION = "not self.Nombre.oclIsUndefined()";

	/**
	 * Validates the NombreNoNulo constraint of '<em>Columna</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumna_NombreNoNulo(Columna columna, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.COLUMNA,
				 (EObject)columna,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NombreNoNulo",
				 COLUMNA__NOMBRE_NO_NULO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEsquema(Esquema esquema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)esquema, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validateEsquema_NobreClaveAjenaUnico(esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validateEsquema_NombreTablaUnico(esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validateEsquema_ClavesDistintas(esquema, diagnostics, context);
		if (result || diagnostics != null) result &= validateEsquema_NombreNoNulo(esquema, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NobreClaveAjenaUnico constraint of '<em>Esquema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ESQUEMA__NOBRE_CLAVE_AJENA_UNICO__EEXPRESSION = "self.clavesAjenas->isUnique(Nombre)";

	/**
	 * Validates the NobreClaveAjenaUnico constraint of '<em>Esquema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEsquema_NobreClaveAjenaUnico(Esquema esquema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.ESQUEMA,
				 (EObject)esquema,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NobreClaveAjenaUnico",
				 ESQUEMA__NOBRE_CLAVE_AJENA_UNICO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NombreTablaUnico constraint of '<em>Esquema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ESQUEMA__NOMBRE_TABLA_UNICO__EEXPRESSION = "self.Tablas->isUnique(Nombre)";

	/**
	 * Validates the NombreTablaUnico constraint of '<em>Esquema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEsquema_NombreTablaUnico(Esquema esquema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.ESQUEMA,
				 (EObject)esquema,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NombreTablaUnico",
				 ESQUEMA__NOMBRE_TABLA_UNICO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ClavesDistintas constraint of '<em>Esquema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ESQUEMA__CLAVES_DISTINTAS__EEXPRESSION = "self.clavesAjenas->forAll(ca1 : ClaveAjena, ca2 : ClaveAjena | ca1.columna = ca2.columna and ca1.columnaReferencia = ca2.columnaReferencia implies ca1 = ca2)";

	/**
	 * Validates the ClavesDistintas constraint of '<em>Esquema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEsquema_ClavesDistintas(Esquema esquema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.ESQUEMA,
				 (EObject)esquema,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ClavesDistintas",
				 ESQUEMA__CLAVES_DISTINTAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NombreNoNulo constraint of '<em>Esquema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ESQUEMA__NOMBRE_NO_NULO__EEXPRESSION = "not self.Nombre.oclIsUndefined()";

	/**
	 * Validates the NombreNoNulo constraint of '<em>Esquema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEsquema_NombreNoNulo(Esquema esquema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.ESQUEMA,
				 (EObject)esquema,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NombreNoNulo",
				 ESQUEMA__NOMBRE_NO_NULO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaveAjena(ClaveAjena claveAjena, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)claveAjena, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validateClaveAjena_OrigenDistintoDestino(claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validateClaveAjena_ColumnaReferenciaPrimaria(claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validateClaveAjena_NombreNoNulo(claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validateClaveAjena_ColumnaNoPrimaria(claveAjena, diagnostics, context);
		if (result || diagnostics != null) result &= validateClaveAjena_TiposIguales(claveAjena, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OrigenDistintoDestino constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAVE_AJENA__ORIGEN_DISTINTO_DESTINO__EEXPRESSION = "self.columna<> self.columnaReferencia";

	/**
	 * Validates the OrigenDistintoDestino constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaveAjena_OrigenDistintoDestino(ClaveAjena claveAjena, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.CLAVE_AJENA,
				 (EObject)claveAjena,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OrigenDistintoDestino",
				 CLAVE_AJENA__ORIGEN_DISTINTO_DESTINO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ColumnaReferenciaPrimaria constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAVE_AJENA__COLUMNA_REFERENCIA_PRIMARIA__EEXPRESSION = "self.columnaReferencia.EsPrimaria";

	/**
	 * Validates the ColumnaReferenciaPrimaria constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaveAjena_ColumnaReferenciaPrimaria(ClaveAjena claveAjena, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.CLAVE_AJENA,
				 (EObject)claveAjena,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ColumnaReferenciaPrimaria",
				 CLAVE_AJENA__COLUMNA_REFERENCIA_PRIMARIA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NombreNoNulo constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAVE_AJENA__NOMBRE_NO_NULO__EEXPRESSION = "not self.Nombre.oclIsUndefined()";

	/**
	 * Validates the NombreNoNulo constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaveAjena_NombreNoNulo(ClaveAjena claveAjena, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.CLAVE_AJENA,
				 (EObject)claveAjena,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NombreNoNulo",
				 CLAVE_AJENA__NOMBRE_NO_NULO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ColumnaNoPrimaria constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAVE_AJENA__COLUMNA_NO_PRIMARIA__EEXPRESSION = "not self.columna.EsPrimaria";

	/**
	 * Validates the ColumnaNoPrimaria constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaveAjena_ColumnaNoPrimaria(ClaveAjena claveAjena, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.CLAVE_AJENA,
				 (EObject)claveAjena,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ColumnaNoPrimaria",
				 CLAVE_AJENA__COLUMNA_NO_PRIMARIA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TiposIguales constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAVE_AJENA__TIPOS_IGUALES__EEXPRESSION = "self.columna.Tipo=self.columnaReferencia.Tipo";

	/**
	 * Validates the TiposIguales constraint of '<em>Clave Ajena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaveAjena_TiposIguales(ClaveAjena claveAjena, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MyERPackage.Literals.CLAVE_AJENA,
				 (EObject)claveAjena,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TiposIguales",
				 CLAVE_AJENA__TIPOS_IGUALES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoDatosER(TipoDatosER tipoDatosER, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MyERValidator
