/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /GuiaApe5/model/guiaApe5.ecore
 * using:
 *   /GuiaApe5/model/guiaApe5.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package guiaApe5;

// import guiaApe5.GuiaApe5Package;
// import guiaApe5.GuiaApe5Tables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * GuiaApe5Tables provides the dispatch tables for the guiaApe5 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class GuiaApe5Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(GuiaApe5Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_guiaApe5 = IdManager.getNsURIPackageId("http://www.example.org/guiaApe5", null, GuiaApe5Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Contenedor = GuiaApe5Tables.PACKid_http_c_s_s_www_example_org_s_guiaApe5.getClassId("Contenedor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Elemento = GuiaApe5Tables.PACKid_http_c_s_s_www_example_org_s_guiaApe5.getClassId("Elemento", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Sistema = GuiaApe5Tables.PACKid_http_c_s_s_www_example_org_s_guiaApe5.getClassId("Sistema", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = GuiaApe5Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TipoDato = GuiaApe5Tables.PACKid_http_c_s_s_www_example_org_s_guiaApe5.getEnumerationId("TipoDato");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Contenedor = TypeId.BAG.getSpecializedId(GuiaApe5Tables.CLSSid_Contenedor, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_String = GuiaApe5Tables.ENUMid_TipoDato.getEnumerationLiteralId("String");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Contenedor = TypeId.ORDERED_SET.getSpecializedId(GuiaApe5Tables.CLSSid_Contenedor, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Elemento = TypeId.ORDERED_SET.getSpecializedId(GuiaApe5Tables.CLSSid_Elemento, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Elemento_0 = TypeId.ORDERED_SET.getSpecializedId(GuiaApe5Tables.CLSSid_Elemento, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			GuiaApe5Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Contenedor = new EcoreExecutorType(GuiaApe5Package.Literals.CONTENEDOR, PACKAGE, 0);
		public static final EcoreExecutorType _Elemento = new EcoreExecutorType(GuiaApe5Package.Literals.ELEMENTO, PACKAGE, 0);
		public static final EcoreExecutorType _Sistema = new EcoreExecutorType(GuiaApe5Package.Literals.SISTEMA, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TipoDato = new EcoreExecutorEnumeration(GuiaApe5Package.Literals.TIPO_DATO, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Contenedor,
			_Elemento,
			_Sistema,
			_TipoDato
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Contenedor__Contenedor = new ExecutorFragment(Types._Contenedor, GuiaApe5Tables.Types._Contenedor);
		private static final ExecutorFragment _Contenedor__OclAny = new ExecutorFragment(Types._Contenedor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Contenedor__OclElement = new ExecutorFragment(Types._Contenedor, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Elemento__Elemento = new ExecutorFragment(Types._Elemento, GuiaApe5Tables.Types._Elemento);
		private static final ExecutorFragment _Elemento__OclAny = new ExecutorFragment(Types._Elemento, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Elemento__OclElement = new ExecutorFragment(Types._Elemento, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Sistema__OclAny = new ExecutorFragment(Types._Sistema, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Sistema__OclElement = new ExecutorFragment(Types._Sistema, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Sistema__Sistema = new ExecutorFragment(Types._Sistema, GuiaApe5Tables.Types._Sistema);

		private static final ExecutorFragment _TipoDato__OclAny = new ExecutorFragment(Types._TipoDato, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TipoDato__OclElement = new ExecutorFragment(Types._TipoDato, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TipoDato__OclEnumeration = new ExecutorFragment(Types._TipoDato, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TipoDato__OclType = new ExecutorFragment(Types._TipoDato, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TipoDato__TipoDato = new ExecutorFragment(Types._TipoDato, GuiaApe5Tables.Types._TipoDato);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Contenedor__esVisual = new EcoreExecutorProperty(GuiaApe5Package.Literals.CONTENEDOR__ES_VISUAL, Types._Contenedor, 0);
		public static final ExecutorProperty _Contenedor__main = new EcoreExecutorProperty(GuiaApe5Package.Literals.CONTENEDOR__MAIN, Types._Contenedor, 1);
		public static final ExecutorProperty _Contenedor__name = new EcoreExecutorProperty(GuiaApe5Package.Literals.CONTENEDOR__NAME, Types._Contenedor, 2);
		public static final ExecutorProperty _Contenedor__posee = new EcoreExecutorProperty(GuiaApe5Package.Literals.CONTENEDOR__POSEE, Types._Contenedor, 3);
		public static final ExecutorProperty _Contenedor__relaciona = new EcoreExecutorProperty(GuiaApe5Package.Literals.CONTENEDOR__RELACIONA, Types._Contenedor, 4);
		public static final ExecutorProperty _Contenedor__Contenedor__relaciona = new ExecutorPropertyWithImplementation("Contenedor", Types._Contenedor, 5, new EcoreLibraryOppositeProperty(GuiaApe5Package.Literals.CONTENEDOR__RELACIONA));
		public static final ExecutorProperty _Contenedor__Sistema__contiene = new ExecutorPropertyWithImplementation("Sistema", Types._Contenedor, 6, new EcoreLibraryOppositeProperty(GuiaApe5Package.Literals.SISTEMA__CONTIENE));

		public static final ExecutorProperty _Elemento__esObligatorio = new EcoreExecutorProperty(GuiaApe5Package.Literals.ELEMENTO__ES_OBLIGATORIO, Types._Elemento, 0);
		public static final ExecutorProperty _Elemento__isPrimary = new EcoreExecutorProperty(GuiaApe5Package.Literals.ELEMENTO__IS_PRIMARY, Types._Elemento, 1);
		public static final ExecutorProperty _Elemento__longitud = new EcoreExecutorProperty(GuiaApe5Package.Literals.ELEMENTO__LONGITUD, Types._Elemento, 2);
		public static final ExecutorProperty _Elemento__name = new EcoreExecutorProperty(GuiaApe5Package.Literals.ELEMENTO__NAME, Types._Elemento, 3);
		public static final ExecutorProperty _Elemento__tipoDato = new EcoreExecutorProperty(GuiaApe5Package.Literals.ELEMENTO__TIPO_DATO, Types._Elemento, 4);
		public static final ExecutorProperty _Elemento__Contenedor__posee = new ExecutorPropertyWithImplementation("Contenedor", Types._Elemento, 5, new EcoreLibraryOppositeProperty(GuiaApe5Package.Literals.CONTENEDOR__POSEE));

		public static final ExecutorProperty _Sistema__contiene = new EcoreExecutorProperty(GuiaApe5Package.Literals.SISTEMA__CONTIENE, Types._Sistema, 0);
		public static final ExecutorProperty _Sistema__name = new EcoreExecutorProperty(GuiaApe5Package.Literals.SISTEMA__NAME, Types._Sistema, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Contenedor =
			{
				Fragments._Contenedor__OclAny /* 0 */,
				Fragments._Contenedor__OclElement /* 1 */,
				Fragments._Contenedor__Contenedor /* 2 */
			};
		private static final int /*@NonNull*/ [] __Contenedor = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Elemento =
			{
				Fragments._Elemento__OclAny /* 0 */,
				Fragments._Elemento__OclElement /* 1 */,
				Fragments._Elemento__Elemento /* 2 */
			};
		private static final int /*@NonNull*/ [] __Elemento = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Sistema =
			{
				Fragments._Sistema__OclAny /* 0 */,
				Fragments._Sistema__OclElement /* 1 */,
				Fragments._Sistema__Sistema /* 2 */
			};
		private static final int /*@NonNull*/ [] __Sistema = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TipoDato =
			{
				Fragments._TipoDato__OclAny /* 0 */,
				Fragments._TipoDato__OclElement /* 1 */,
				Fragments._TipoDato__OclType /* 2 */,
				Fragments._TipoDato__OclEnumeration /* 3 */,
				Fragments._TipoDato__TipoDato /* 4 */
			};
		private static final int /*@NonNull*/ [] __TipoDato = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Contenedor.initFragments(_Contenedor, __Contenedor);
			Types._Elemento.initFragments(_Elemento, __Elemento);
			Types._Sistema.initFragments(_Sistema, __Sistema);
			Types._TipoDato.initFragments(_TipoDato, __TipoDato);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Contenedor__Contenedor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Contenedor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Contenedor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Elemento__Elemento = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Elemento__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Elemento__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Sistema__Sistema = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sistema__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Sistema__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__TipoDato = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TipoDato__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Contenedor__Contenedor.initOperations(_Contenedor__Contenedor);
			Fragments._Contenedor__OclAny.initOperations(_Contenedor__OclAny);
			Fragments._Contenedor__OclElement.initOperations(_Contenedor__OclElement);

			Fragments._Elemento__Elemento.initOperations(_Elemento__Elemento);
			Fragments._Elemento__OclAny.initOperations(_Elemento__OclAny);
			Fragments._Elemento__OclElement.initOperations(_Elemento__OclElement);

			Fragments._Sistema__OclAny.initOperations(_Sistema__OclAny);
			Fragments._Sistema__OclElement.initOperations(_Sistema__OclElement);
			Fragments._Sistema__Sistema.initOperations(_Sistema__Sistema);

			Fragments._TipoDato__OclAny.initOperations(_TipoDato__OclAny);
			Fragments._TipoDato__OclElement.initOperations(_TipoDato__OclElement);
			Fragments._TipoDato__OclEnumeration.initOperations(_TipoDato__OclEnumeration);
			Fragments._TipoDato__OclType.initOperations(_TipoDato__OclType);
			Fragments._TipoDato__TipoDato.initOperations(_TipoDato__TipoDato);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Contenedor = {
			GuiaApe5Tables.Properties._Contenedor__esVisual,
			GuiaApe5Tables.Properties._Contenedor__main,
			GuiaApe5Tables.Properties._Contenedor__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			GuiaApe5Tables.Properties._Contenedor__posee,
			GuiaApe5Tables.Properties._Contenedor__relaciona
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Elemento = {
			GuiaApe5Tables.Properties._Elemento__esObligatorio,
			GuiaApe5Tables.Properties._Elemento__isPrimary,
			GuiaApe5Tables.Properties._Elemento__longitud,
			GuiaApe5Tables.Properties._Elemento__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			GuiaApe5Tables.Properties._Elemento__tipoDato
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Sistema = {
			GuiaApe5Tables.Properties._Sistema__contiene,
			GuiaApe5Tables.Properties._Sistema__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TipoDato = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Contenedor__Contenedor.initProperties(_Contenedor);
			Fragments._Elemento__Elemento.initProperties(_Elemento);
			Fragments._Sistema__Sistema.initProperties(_Sistema);
			Fragments._TipoDato__TipoDato.initProperties(_TipoDato);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _TipoDato__String = new EcoreExecutorEnumerationLiteral(GuiaApe5Package.Literals.TIPO_DATO.getEEnumLiteral("String"), Types._TipoDato, 0);
		public static final EcoreExecutorEnumerationLiteral _TipoDato__int = new EcoreExecutorEnumerationLiteral(GuiaApe5Package.Literals.TIPO_DATO.getEEnumLiteral("int"), Types._TipoDato, 1);
		public static final EcoreExecutorEnumerationLiteral _TipoDato__boolean = new EcoreExecutorEnumerationLiteral(GuiaApe5Package.Literals.TIPO_DATO.getEEnumLiteral("boolean"), Types._TipoDato, 2);
		public static final EcoreExecutorEnumerationLiteral _TipoDato__double = new EcoreExecutorEnumerationLiteral(GuiaApe5Package.Literals.TIPO_DATO.getEEnumLiteral("double"), Types._TipoDato, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TipoDato = {
			_TipoDato__String,
			_TipoDato__int,
			_TipoDato__boolean,
			_TipoDato__double
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._TipoDato.initLiterals(_TipoDato);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of GuiaApe5Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new GuiaApe5Tables();
	}

	private GuiaApe5Tables() {
		super(GuiaApe5Package.eNS_URI);
	}
}
