/**
 */
package guiaApe5.util;

import guiaApe5.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see guiaApe5.GuiaApe5Package
 * @generated
 */
public class GuiaApe5Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GuiaApe5Validator INSTANCE = new GuiaApe5Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "guiaApe5";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Asocio Conmigo' of 'Contenedor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTENEDOR__NO_ASOCIO_CONMIGO = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Mismo Nombre' of 'Contenedor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTENEDOR__NO_MISMO_NOMBRE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Visual No Relaciona Ni Tiene Clave' of 'Contenedor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTENEDOR__VISUAL_NO_RELACIONA_NI_TIENE_CLAVE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tiene Primary Key Si No Visual' of 'Contenedor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTENEDOR__TIENE_PRIMARY_KEY_SI_NO_VISUAL = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Solo Un Primary Key' of 'Contenedor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTENEDOR__SOLO_UN_PRIMARY_KEY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tipo De Dato Obligatorio Si No Visual' of 'Contenedor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTENEDOR__TIPO_DE_DATO_OBLIGATORIO_SI_NO_VISUAL = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre Unico Por Contenedor' of 'Sistema'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SISTEMA__NOMBRE_UNICO_POR_CONTENEDOR = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Longitud Cadena' of 'Elemento'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENTO__LONGITUD_CADENA = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

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
	public GuiaApe5Validator() {
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
		return GuiaApe5Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case GuiaApe5Package.CONTENEDOR:
			return validateContenedor((Contenedor) value, diagnostics, context);
		case GuiaApe5Package.SISTEMA:
			return validateSistema((Sistema) value, diagnostics, context);
		case GuiaApe5Package.ELEMENTO:
			return validateElemento((Elemento) value, diagnostics, context);
		case GuiaApe5Package.TIPO_DATO:
			return validateTipoDato((TipoDato) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContenedor(Contenedor contenedor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contenedor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContenedor_tipoDeDatoObligatorioSiNoVisual(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContenedor_noAsocioConmigo(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContenedor_noMismoNombre(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContenedor_visualNoRelacionaNiTieneClave(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContenedor_tienePrimaryKeySiNoVisual(contenedor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateContenedor_soloUnPrimaryKey(contenedor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the tipoDeDatoObligatorioSiNoVisual constraint of '<em>Contenedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContenedor_tipoDeDatoObligatorioSiNoVisual(Contenedor contenedor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return contenedor.tipoDeDatoObligatorioSiNoVisual(diagnostics, context);
	}

	/**
	 * Validates the noAsocioConmigo constraint of '<em>Contenedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContenedor_noAsocioConmigo(Contenedor contenedor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return contenedor.noAsocioConmigo(diagnostics, context);
	}

	/**
	 * Validates the noMismoNombre constraint of '<em>Contenedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContenedor_noMismoNombre(Contenedor contenedor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return contenedor.noMismoNombre(diagnostics, context);
	}

	/**
	 * Validates the visualNoRelacionaNiTieneClave constraint of '<em>Contenedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContenedor_visualNoRelacionaNiTieneClave(Contenedor contenedor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return contenedor.visualNoRelacionaNiTieneClave(diagnostics, context);
	}

	/**
	 * Validates the tienePrimaryKeySiNoVisual constraint of '<em>Contenedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContenedor_tienePrimaryKeySiNoVisual(Contenedor contenedor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return contenedor.tienePrimaryKeySiNoVisual(diagnostics, context);
	}

	/**
	 * Validates the soloUnPrimaryKey constraint of '<em>Contenedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContenedor_soloUnPrimaryKey(Contenedor contenedor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return contenedor.soloUnPrimaryKey(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSistema(Sistema sistema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sistema, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSistema_nombreUnicoPorContenedor(sistema, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombreUnicoPorContenedor constraint of '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSistema_nombreUnicoPorContenedor(Sistema sistema, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return sistema.nombreUnicoPorContenedor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElemento(Elemento elemento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elemento, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(elemento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(elemento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(elemento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(elemento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(elemento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(elemento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(elemento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(elemento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElemento_longitudCadena(elemento, diagnostics, context);
		return result;
	}

	/**
	 * Validates the longitudCadena constraint of '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElemento_longitudCadena(Elemento elemento, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return elemento.longitudCadena(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoDato(TipoDato tipoDato, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //GuiaApe5Validator
