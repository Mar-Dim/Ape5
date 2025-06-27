/**
 */
package guiaApe5.impl;

import guiaApe5.Contenedor;
import guiaApe5.Elemento;
import guiaApe5.GuiaApe5Factory;
import guiaApe5.GuiaApe5Package;
import guiaApe5.Sistema;
import guiaApe5.TipoDato;

import guiaApe5.util.GuiaApe5Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
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
public class GuiaApe5PackageImpl extends EPackageImpl implements GuiaApe5Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sistemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoEClass = null;

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
	 * @see guiaApe5.GuiaApe5Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GuiaApe5PackageImpl() {
		super(eNS_URI, GuiaApe5Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GuiaApe5Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GuiaApe5Package init() {
		if (isInited)
			return (GuiaApe5Package) EPackage.Registry.INSTANCE.getEPackage(GuiaApe5Package.eNS_URI);

		// Obtain or create and register package
		Object registeredGuiaApe5Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		GuiaApe5PackageImpl theGuiaApe5Package = registeredGuiaApe5Package instanceof GuiaApe5PackageImpl
				? (GuiaApe5PackageImpl) registeredGuiaApe5Package
				: new GuiaApe5PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGuiaApe5Package.createPackageContents();

		// Initialize created meta-data
		theGuiaApe5Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theGuiaApe5Package, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return GuiaApe5Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theGuiaApe5Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GuiaApe5Package.eNS_URI, theGuiaApe5Package);
		return theGuiaApe5Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContenedor() {
		return contenedorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContenedor_Name() {
		return (EAttribute) contenedorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContenedor_Posee() {
		return (EReference) contenedorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContenedor_Relaciona() {
		return (EReference) contenedorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContenedor_Main() {
		return (EAttribute) contenedorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContenedor_EsVisual() {
		return (EAttribute) contenedorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContenedor__NoAsocioConmigo__DiagnosticChain_Map() {
		return contenedorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContenedor__NoMismoNombre__DiagnosticChain_Map() {
		return contenedorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContenedor__VisualNoRelacionaNiTieneClave__DiagnosticChain_Map() {
		return contenedorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContenedor__TienePrimaryKeySiNoVisual__DiagnosticChain_Map() {
		return contenedorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContenedor__SoloUnPrimaryKey__DiagnosticChain_Map() {
		return contenedorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContenedor__TipoDeDatoObligatorioSiNoVisual__DiagnosticChain_Map() {
		return contenedorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSistema() {
		return sistemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSistema_Name() {
		return (EAttribute) sistemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSistema_Contiene() {
		return (EReference) sistemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSistema__NombreUnicoPorContenedor__DiagnosticChain_Map() {
		return sistemaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElemento() {
		return elementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElemento_Name() {
		return (EAttribute) elementoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElemento_IsPrimary() {
		return (EAttribute) elementoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElemento_Longitud() {
		return (EAttribute) elementoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElemento_TipoDato() {
		return (EAttribute) elementoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElemento_EsObligatorio() {
		return (EAttribute) elementoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElemento__LongitudCadena__DiagnosticChain_Map() {
		return elementoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuiaApe5Factory getGuiaApe5Factory() {
		return (GuiaApe5Factory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		contenedorEClass = createEClass(CONTENEDOR);
		createEAttribute(contenedorEClass, CONTENEDOR__NAME);
		createEReference(contenedorEClass, CONTENEDOR__POSEE);
		createEReference(contenedorEClass, CONTENEDOR__RELACIONA);
		createEAttribute(contenedorEClass, CONTENEDOR__MAIN);
		createEAttribute(contenedorEClass, CONTENEDOR__ES_VISUAL);
		createEOperation(contenedorEClass, CONTENEDOR___NO_ASOCIO_CONMIGO__DIAGNOSTICCHAIN_MAP);
		createEOperation(contenedorEClass, CONTENEDOR___NO_MISMO_NOMBRE__DIAGNOSTICCHAIN_MAP);
		createEOperation(contenedorEClass, CONTENEDOR___VISUAL_NO_RELACIONA_NI_TIENE_CLAVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(contenedorEClass, CONTENEDOR___TIENE_PRIMARY_KEY_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(contenedorEClass, CONTENEDOR___SOLO_UN_PRIMARY_KEY__DIAGNOSTICCHAIN_MAP);
		createEOperation(contenedorEClass, CONTENEDOR___TIPO_DE_DATO_OBLIGATORIO_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP);

		sistemaEClass = createEClass(SISTEMA);
		createEAttribute(sistemaEClass, SISTEMA__NAME);
		createEReference(sistemaEClass, SISTEMA__CONTIENE);
		createEOperation(sistemaEClass, SISTEMA___NOMBRE_UNICO_POR_CONTENEDOR__DIAGNOSTICCHAIN_MAP);

		elementoEClass = createEClass(ELEMENTO);
		createEAttribute(elementoEClass, ELEMENTO__NAME);
		createEAttribute(elementoEClass, ELEMENTO__IS_PRIMARY);
		createEAttribute(elementoEClass, ELEMENTO__LONGITUD);
		createEAttribute(elementoEClass, ELEMENTO__TIPO_DATO);
		createEAttribute(elementoEClass, ELEMENTO__ES_OBLIGATORIO);
		createEOperation(elementoEClass, ELEMENTO___LONGITUD_CADENA__DIAGNOSTICCHAIN_MAP);

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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contenedorEClass, Contenedor.class, "Contenedor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Contenedor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedor_Posee(), this.getElemento(), null, "posee", null, 1, -1, Contenedor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedor_Relaciona(), this.getContenedor(), null, "relaciona", null, 0, -1,
				Contenedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedor_Main(), ecorePackage.getEBoolean(), "main", null, 1, 1, Contenedor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedor_EsVisual(), ecorePackage.getEBoolean(), "esVisual", null, 1, 1, Contenedor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getContenedor__NoAsocioConmigo__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "noAsocioConmigo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContenedor__NoMismoNombre__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"noMismoNombre", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContenedor__VisualNoRelacionaNiTieneClave__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "visualNoRelacionaNiTieneClave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContenedor__TienePrimaryKeySiNoVisual__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"tienePrimaryKeySiNoVisual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContenedor__SoloUnPrimaryKey__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"soloUnPrimaryKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContenedor__TipoDeDatoObligatorioSiNoVisual__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "tipoDeDatoObligatorioSiNoVisual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sistemaEClass, Sistema.class, "Sistema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSistema_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sistema.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSistema_Contiene(), this.getContenedor(), null, "contiene", null, 0, -1, Sistema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSistema__NombreUnicoPorContenedor__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"nombreUnicoPorContenedor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementoEClass, Elemento.class, "Elemento", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElemento_Name(), ecorePackage.getEString(), "name", null, 0, 1, Elemento.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElemento_IsPrimary(), ecorePackage.getEBoolean(), "isPrimary", null, 1, 1, Elemento.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElemento_Longitud(), ecorePackage.getEInt(), "longitud", null, 1, 1, Elemento.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElemento_TipoDato(), this.getTipoDato(), "tipoDato", null, 0, 1, Elemento.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElemento_EsObligatorio(), ecorePackage.getEBoolean(), "esObligatorio", null, 1, 1,
				Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getElemento__LongitudCadena__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"longitudCadena", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.STRING);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.INT);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BOOLEAN);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.DOUBLE);

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
		addAnnotation(this, source, new String[] {});
		addAnnotation(contenedorEClass, source, new String[] { "constraints", "tipoDeDatoObligatorioSiNoVisual" });
		addAnnotation(sistemaEClass, source, new String[] { "constraints", "nombreUnicoPorContenedor" });
		addAnnotation(elementoEClass, source, new String[] { "constraints", "longitudCadena" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getContenedor__NoAsocioConmigo__DiagnosticChain_Map(), source,
				new String[] { "body", "not self.relaciona -> includes(self)" });
		addAnnotation(getContenedor__NoMismoNombre__DiagnosticChain_Map(), source,
				new String[] { "body", "self.posee -> isUnique(e|e.name)" });
		addAnnotation(getContenedor__VisualNoRelacionaNiTieneClave__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self.esVisual implies (self.posee->forAll(e|not e.isPrimary) and self.relaciona->isEmpty())" });
		addAnnotation(getContenedor__TienePrimaryKeySiNoVisual__DiagnosticChain_Map(), source,
				new String[] { "body", "not self.esVisual implies self.posee -> exists(e|e.isPrimary)" });
		addAnnotation(getContenedor__SoloUnPrimaryKey__DiagnosticChain_Map(), source,
				new String[] { "body", "self.posee -> select(e| e.isPrimary)-> size()<=1" });
		addAnnotation(getContenedor__TipoDeDatoObligatorioSiNoVisual__DiagnosticChain_Map(), source, new String[] {
				"body", "not self.esVisual implies self.posee ->forAll(e| not e.tipoDato.oclIsUndefined())" });
		addAnnotation(getSistema__NombreUnicoPorContenedor__DiagnosticChain_Map(), source,
				new String[] { "body", "self.contiene->isUnique(c|c.name)" });
		addAnnotation(getElemento__LongitudCadena__DiagnosticChain_Map(), source,
				new String[] { "body", "self.tipoDato = TipoDato :: String implies self.longitud>0" });
	}

} //GuiaApe5PackageImpl
