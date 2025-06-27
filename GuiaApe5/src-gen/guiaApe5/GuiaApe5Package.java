/**
 */
package guiaApe5;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see guiaApe5.GuiaApe5Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface GuiaApe5Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "guiaApe5";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/guiaApe5";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "guiaApe5";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuiaApe5Package eINSTANCE = guiaApe5.impl.GuiaApe5PackageImpl.init();

	/**
	 * The meta object id for the '{@link guiaApe5.impl.ContenedorImpl <em>Contenedor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guiaApe5.impl.ContenedorImpl
	 * @see guiaApe5.impl.GuiaApe5PackageImpl#getContenedor()
	 * @generated
	 */
	int CONTENEDOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Posee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__POSEE = 1;

	/**
	 * The feature id for the '<em><b>Relaciona</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__RELACIONA = 2;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__MAIN = 3;

	/**
	 * The feature id for the '<em><b>Es Visual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__ES_VISUAL = 4;

	/**
	 * The number of structural features of the '<em>Contenedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>No Asocio Conmigo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR___NO_ASOCIO_CONMIGO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>No Mismo Nombre</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR___NO_MISMO_NOMBRE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Visual No Relaciona Ni Tiene Clave</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR___VISUAL_NO_RELACIONA_NI_TIENE_CLAVE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Tiene Primary Key Si No Visual</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR___TIENE_PRIMARY_KEY_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Solo Un Primary Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR___SOLO_UN_PRIMARY_KEY__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Tipo De Dato Obligatorio Si No Visual</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR___TIPO_DE_DATO_OBLIGATORIO_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The number of operations of the '<em>Contenedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link guiaApe5.impl.SistemaImpl <em>Sistema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guiaApe5.impl.SistemaImpl
	 * @see guiaApe5.impl.GuiaApe5PackageImpl#getSistema()
	 * @generated
	 */
	int SISTEMA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contiene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__CONTIENE = 1;

	/**
	 * The number of structural features of the '<em>Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Nombre Unico Por Contenedor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA___NOMBRE_UNICO_POR_CONTENEDOR__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link guiaApe5.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guiaApe5.impl.ElementoImpl
	 * @see guiaApe5.impl.GuiaApe5PackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__IS_PRIMARY = 1;

	/**
	 * The feature id for the '<em><b>Longitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__LONGITUD = 2;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__TIPO_DATO = 3;

	/**
	 * The feature id for the '<em><b>Es Obligatorio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__ES_OBLIGATORIO = 4;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Longitud Cadena</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO___LONGITUD_CADENA__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link guiaApe5.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guiaApe5.TipoDato
	 * @see guiaApe5.impl.GuiaApe5PackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 3;

	/**
	 * Returns the meta object for class '{@link guiaApe5.Contenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor</em>'.
	 * @see guiaApe5.Contenedor
	 * @generated
	 */
	EClass getContenedor();

	/**
	 * Returns the meta object for the attribute '{@link guiaApe5.Contenedor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see guiaApe5.Contenedor#getName()
	 * @see #getContenedor()
	 * @generated
	 */
	EAttribute getContenedor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link guiaApe5.Contenedor#getPosee <em>Posee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posee</em>'.
	 * @see guiaApe5.Contenedor#getPosee()
	 * @see #getContenedor()
	 * @generated
	 */
	EReference getContenedor_Posee();

	/**
	 * Returns the meta object for the reference list '{@link guiaApe5.Contenedor#getRelaciona <em>Relaciona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relaciona</em>'.
	 * @see guiaApe5.Contenedor#getRelaciona()
	 * @see #getContenedor()
	 * @generated
	 */
	EReference getContenedor_Relaciona();

	/**
	 * Returns the meta object for the attribute '{@link guiaApe5.Contenedor#isMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see guiaApe5.Contenedor#isMain()
	 * @see #getContenedor()
	 * @generated
	 */
	EAttribute getContenedor_Main();

	/**
	 * Returns the meta object for the attribute '{@link guiaApe5.Contenedor#isEsVisual <em>Es Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Visual</em>'.
	 * @see guiaApe5.Contenedor#isEsVisual()
	 * @see #getContenedor()
	 * @generated
	 */
	EAttribute getContenedor_EsVisual();

	/**
	 * Returns the meta object for the '{@link guiaApe5.Contenedor#noAsocioConmigo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Asocio Conmigo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Asocio Conmigo</em>' operation.
	 * @see guiaApe5.Contenedor#noAsocioConmigo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContenedor__NoAsocioConmigo__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link guiaApe5.Contenedor#noMismoNombre(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Mismo Nombre</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Mismo Nombre</em>' operation.
	 * @see guiaApe5.Contenedor#noMismoNombre(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContenedor__NoMismoNombre__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link guiaApe5.Contenedor#visualNoRelacionaNiTieneClave(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Visual No Relaciona Ni Tiene Clave</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visual No Relaciona Ni Tiene Clave</em>' operation.
	 * @see guiaApe5.Contenedor#visualNoRelacionaNiTieneClave(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContenedor__VisualNoRelacionaNiTieneClave__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link guiaApe5.Contenedor#tienePrimaryKeySiNoVisual(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Tiene Primary Key Si No Visual</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tiene Primary Key Si No Visual</em>' operation.
	 * @see guiaApe5.Contenedor#tienePrimaryKeySiNoVisual(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContenedor__TienePrimaryKeySiNoVisual__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link guiaApe5.Contenedor#soloUnPrimaryKey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Solo Un Primary Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Solo Un Primary Key</em>' operation.
	 * @see guiaApe5.Contenedor#soloUnPrimaryKey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContenedor__SoloUnPrimaryKey__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link guiaApe5.Contenedor#tipoDeDatoObligatorioSiNoVisual(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Tipo De Dato Obligatorio Si No Visual</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tipo De Dato Obligatorio Si No Visual</em>' operation.
	 * @see guiaApe5.Contenedor#tipoDeDatoObligatorioSiNoVisual(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContenedor__TipoDeDatoObligatorioSiNoVisual__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link guiaApe5.Sistema <em>Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sistema</em>'.
	 * @see guiaApe5.Sistema
	 * @generated
	 */
	EClass getSistema();

	/**
	 * Returns the meta object for the attribute '{@link guiaApe5.Sistema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see guiaApe5.Sistema#getName()
	 * @see #getSistema()
	 * @generated
	 */
	EAttribute getSistema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link guiaApe5.Sistema#getContiene <em>Contiene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contiene</em>'.
	 * @see guiaApe5.Sistema#getContiene()
	 * @see #getSistema()
	 * @generated
	 */
	EReference getSistema_Contiene();

	/**
	 * Returns the meta object for the '{@link guiaApe5.Sistema#nombreUnicoPorContenedor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nombre Unico Por Contenedor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nombre Unico Por Contenedor</em>' operation.
	 * @see guiaApe5.Sistema#nombreUnicoPorContenedor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSistema__NombreUnicoPorContenedor__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link guiaApe5.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see guiaApe5.Elemento
	 * @generated
	 */
	EClass getElemento();

	/**
	 * Returns the meta object for the attribute '{@link guiaApe5.Elemento#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see guiaApe5.Elemento#getName()
	 * @see #getElemento()
	 * @generated
	 */
	EAttribute getElemento_Name();

	/**
	 * Returns the meta object for the attribute '{@link guiaApe5.Elemento#isIsPrimary <em>Is Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary</em>'.
	 * @see guiaApe5.Elemento#isIsPrimary()
	 * @see #getElemento()
	 * @generated
	 */
	EAttribute getElemento_IsPrimary();

	/**
	 * Returns the meta object for the attribute '{@link guiaApe5.Elemento#getLongitud <em>Longitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitud</em>'.
	 * @see guiaApe5.Elemento#getLongitud()
	 * @see #getElemento()
	 * @generated
	 */
	EAttribute getElemento_Longitud();

	/**
	 * Returns the meta object for the attribute '{@link guiaApe5.Elemento#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see guiaApe5.Elemento#getTipoDato()
	 * @see #getElemento()
	 * @generated
	 */
	EAttribute getElemento_TipoDato();

	/**
	 * Returns the meta object for the attribute '{@link guiaApe5.Elemento#isEsObligatorio <em>Es Obligatorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Obligatorio</em>'.
	 * @see guiaApe5.Elemento#isEsObligatorio()
	 * @see #getElemento()
	 * @generated
	 */
	EAttribute getElemento_EsObligatorio();

	/**
	 * Returns the meta object for the '{@link guiaApe5.Elemento#longitudCadena(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Longitud Cadena</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Longitud Cadena</em>' operation.
	 * @see guiaApe5.Elemento#longitudCadena(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElemento__LongitudCadena__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link guiaApe5.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see guiaApe5.TipoDato
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
	GuiaApe5Factory getGuiaApe5Factory();

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
		 * The meta object literal for the '{@link guiaApe5.impl.ContenedorImpl <em>Contenedor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guiaApe5.impl.ContenedorImpl
		 * @see guiaApe5.impl.GuiaApe5PackageImpl#getContenedor()
		 * @generated
		 */
		EClass CONTENEDOR = eINSTANCE.getContenedor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR__NAME = eINSTANCE.getContenedor_Name();

		/**
		 * The meta object literal for the '<em><b>Posee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR__POSEE = eINSTANCE.getContenedor_Posee();

		/**
		 * The meta object literal for the '<em><b>Relaciona</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR__RELACIONA = eINSTANCE.getContenedor_Relaciona();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR__MAIN = eINSTANCE.getContenedor_Main();

		/**
		 * The meta object literal for the '<em><b>Es Visual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR__ES_VISUAL = eINSTANCE.getContenedor_EsVisual();

		/**
		 * The meta object literal for the '<em><b>No Asocio Conmigo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR___NO_ASOCIO_CONMIGO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getContenedor__NoAsocioConmigo__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Mismo Nombre</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR___NO_MISMO_NOMBRE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getContenedor__NoMismoNombre__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Visual No Relaciona Ni Tiene Clave</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR___VISUAL_NO_RELACIONA_NI_TIENE_CLAVE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getContenedor__VisualNoRelacionaNiTieneClave__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Tiene Primary Key Si No Visual</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR___TIENE_PRIMARY_KEY_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getContenedor__TienePrimaryKeySiNoVisual__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Solo Un Primary Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR___SOLO_UN_PRIMARY_KEY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getContenedor__SoloUnPrimaryKey__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Tipo De Dato Obligatorio Si No Visual</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENEDOR___TIPO_DE_DATO_OBLIGATORIO_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getContenedor__TipoDeDatoObligatorioSiNoVisual__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link guiaApe5.impl.SistemaImpl <em>Sistema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guiaApe5.impl.SistemaImpl
		 * @see guiaApe5.impl.GuiaApe5PackageImpl#getSistema()
		 * @generated
		 */
		EClass SISTEMA = eINSTANCE.getSistema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SISTEMA__NAME = eINSTANCE.getSistema_Name();

		/**
		 * The meta object literal for the '<em><b>Contiene</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA__CONTIENE = eINSTANCE.getSistema_Contiene();

		/**
		 * The meta object literal for the '<em><b>Nombre Unico Por Contenedor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA___NOMBRE_UNICO_POR_CONTENEDOR__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSistema__NombreUnicoPorContenedor__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link guiaApe5.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guiaApe5.impl.ElementoImpl
		 * @see guiaApe5.impl.GuiaApe5PackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO__NAME = eINSTANCE.getElemento_Name();

		/**
		 * The meta object literal for the '<em><b>Is Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO__IS_PRIMARY = eINSTANCE.getElemento_IsPrimary();

		/**
		 * The meta object literal for the '<em><b>Longitud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO__LONGITUD = eINSTANCE.getElemento_Longitud();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO__TIPO_DATO = eINSTANCE.getElemento_TipoDato();

		/**
		 * The meta object literal for the '<em><b>Es Obligatorio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO__ES_OBLIGATORIO = eINSTANCE.getElemento_EsObligatorio();

		/**
		 * The meta object literal for the '<em><b>Longitud Cadena</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENTO___LONGITUD_CADENA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElemento__LongitudCadena__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link guiaApe5.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guiaApe5.TipoDato
		 * @see guiaApe5.impl.GuiaApe5PackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

	}

} //GuiaApe5Package
