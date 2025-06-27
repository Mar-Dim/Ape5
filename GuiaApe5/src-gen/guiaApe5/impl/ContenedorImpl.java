/**
 */
package guiaApe5.impl;

import guiaApe5.Contenedor;
import guiaApe5.Elemento;
import guiaApe5.GuiaApe5Package;
import guiaApe5.GuiaApe5Tables;
import guiaApe5.TipoDato;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link guiaApe5.impl.ContenedorImpl#getName <em>Name</em>}</li>
 *   <li>{@link guiaApe5.impl.ContenedorImpl#getPosee <em>Posee</em>}</li>
 *   <li>{@link guiaApe5.impl.ContenedorImpl#getRelaciona <em>Relaciona</em>}</li>
 *   <li>{@link guiaApe5.impl.ContenedorImpl#isMain <em>Main</em>}</li>
 *   <li>{@link guiaApe5.impl.ContenedorImpl#isEsVisual <em>Es Visual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorImpl extends MinimalEObjectImpl.Container implements Contenedor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosee() <em>Posee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosee()
	 * @generated
	 * @ordered
	 */
	protected EList<Elemento> posee;

	/**
	 * The cached value of the '{@link #getRelaciona() <em>Relaciona</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaciona()
	 * @generated
	 * @ordered
	 */
	protected EList<Contenedor> relaciona;

	/**
	 * The default value of the '{@link #isMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMain()
	 * @generated
	 * @ordered
	 */
	protected boolean main = MAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsVisual() <em>Es Visual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsVisual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_VISUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsVisual() <em>Es Visual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsVisual()
	 * @generated
	 * @ordered
	 */
	protected boolean esVisual = ES_VISUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiaApe5Package.Literals.CONTENEDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiaApe5Package.CONTENEDOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Elemento> getPosee() {
		if (posee == null) {
			posee = new EObjectContainmentEList<Elemento>(Elemento.class, this, GuiaApe5Package.CONTENEDOR__POSEE);
		}
		return posee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contenedor> getRelaciona() {
		if (relaciona == null) {
			relaciona = new EObjectResolvingEList<Contenedor>(Contenedor.class, this,
					GuiaApe5Package.CONTENEDOR__RELACIONA);
		}
		return relaciona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMain(boolean newMain) {
		boolean oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiaApe5Package.CONTENEDOR__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsVisual() {
		return esVisual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsVisual(boolean newEsVisual) {
		boolean oldEsVisual = esVisual;
		esVisual = newEsVisual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiaApe5Package.CONTENEDOR__ES_VISUAL, oldEsVisual,
					esVisual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean noAsocioConmigo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Contenedor::noAsocioConmigo";
		try {
			/**
			 *
			 * inv noAsocioConmigo:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not self.relaciona->includes(self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GuiaApe5Package.Literals.CONTENEDOR___NO_ASOCIO_CONMIGO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GuiaApe5Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Contenedor> relaciona = this.getRelaciona();
				final /*@NonInvalid*/ OrderedSetValue BOXED_relaciona = idResolver
						.createOrderedSetOfAll(GuiaApe5Tables.ORD_CLSSid_Contenedor, relaciona);
				final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
						.evaluate(BOXED_relaciona, this).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!includes) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					if (includes) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						result = null;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, GuiaApe5Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean noMismoNombre(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Contenedor::noMismoNombre";
		try {
			/**
			 *
			 * inv noMismoNombre:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.posee->isUnique(e | e.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GuiaApe5Package.Literals.CONTENEDOR___NO_MISMO_NOMBRE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GuiaApe5Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Elemento> posee = this.getPosee();
					final /*@NonInvalid*/ OrderedSetValue BOXED_posee = idResolver
							.createOrderedSetOfAll(GuiaApe5Tables.ORD_CLSSid_Elemento, posee);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(GuiaApe5Tables.ORD_CLSSid_Elemento);
					Iterator<Object> ITERATOR_e_0 = BOXED_posee.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Elemento e_0 = (Elemento) ITERATOR_e_0.next();
						/**
						 * e.name
						 */
						final /*@NonInvalid*/ String name = e_0.getName();
						//
						if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
							result = false;
							break; // Abort after second find
						} else {
							accumulator.add(name);
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GuiaApe5Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean visualNoRelacionaNiTieneClave(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Contenedor::visualNoRelacionaNiTieneClave";
		try {
			/**
			 *
			 * inv visualNoRelacionaNiTieneClave:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.esVisual implies
			 *         self.posee->forAll(e | not e.isPrimary) and
			 *         self.relaciona->isEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GuiaApe5Package.Literals.CONTENEDOR___VISUAL_NO_RELACIONA_NI_TIENE_CLAVE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GuiaApe5Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ boolean esVisual = this.isEsVisual();
					final /*@Thrown*/ Boolean result;
					if (!esVisual) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and;
						try {
							/*@Caught*/ Object CAUGHT_forAll;
							try {
								final /*@NonInvalid*/ List<Elemento> posee = this.getPosee();
								final /*@NonInvalid*/ OrderedSetValue BOXED_posee = idResolver
										.createOrderedSetOfAll(GuiaApe5Tables.ORD_CLSSid_Elemento, posee);
								/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
								Iterator<Object> ITERATOR_e_0 = BOXED_posee.iterator();
								/*@Thrown*/ Boolean forAll;
								while (true) {
									if (!ITERATOR_e_0.hasNext()) {
										if (accumulator == null) {
											forAll = null;
										} else if (accumulator == ValueUtil.TRUE_VALUE) {
											forAll = ValueUtil.TRUE_VALUE;
										} else {
											throw (InvalidValueException) accumulator;
										}
										break;
									}
									/*@NonInvalid*/ Elemento e_0 = (Elemento) ITERATOR_e_0.next();
									/**
									 * not e.isPrimary
									 */
									final /*@NonInvalid*/ boolean isPrimary = e_0.isIsPrimary();
									final /*@NonInvalid*/ Boolean not;
									if (!isPrimary) {
										not = ValueUtil.TRUE_VALUE;
									} else {
										if (isPrimary) {
											not = ValueUtil.FALSE_VALUE;
										} else {
											not = null;
										}
									}
									//
									if (not == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
										forAll = ValueUtil.FALSE_VALUE;
										break; // Stop immediately
									} else if (not == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
										; // Carry on
									} else if (not == null) { // Abnormal null body evaluation result
										if (accumulator == ValueUtil.TRUE_VALUE) {
											accumulator = null; // Cache a null failure
										}
									} else { // Impossible badly typed result
										accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
									}
								}
								CAUGHT_forAll = forAll;
							} catch (Exception e) {
								CAUGHT_forAll = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and;
							if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ List<Contenedor> relaciona = this.getRelaciona();
								final /*@NonInvalid*/ OrderedSetValue BOXED_relaciona = idResolver
										.createOrderedSetOfAll(GuiaApe5Tables.ORD_CLSSid_Contenedor, relaciona);
								final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
										.evaluate(BOXED_relaciona).booleanValue();
								if (!isEmpty) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_forAll instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_forAll;
									}
									if (CAUGHT_forAll == null) {
										and = null;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						} catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if (CAUGHT_and == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GuiaApe5Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean tienePrimaryKeySiNoVisual(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Contenedor::tienePrimaryKeySiNoVisual";
		try {
			/**
			 *
			 * inv tienePrimaryKeySiNoVisual:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not self.esVisual implies
			 *         self.posee->exists(e | e.isPrimary)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GuiaApe5Package.Literals.CONTENEDOR___TIENE_PRIMARY_KEY_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GuiaApe5Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ boolean esVisual = this.isEsVisual();
					final /*@NonInvalid*/ Boolean not;
					if (!esVisual) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (esVisual) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ List<Elemento> posee = this.getPosee();
						final /*@NonInvalid*/ OrderedSetValue BOXED_posee = idResolver
								.createOrderedSetOfAll(GuiaApe5Tables.ORD_CLSSid_Elemento, posee);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_e_0 = BOXED_posee.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_e_0.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Elemento e_0 = (Elemento) ITERATOR_e_0.next();
							/**
							 * e.isPrimary
							 */
							final /*@NonInvalid*/ boolean isPrimary = e_0.isIsPrimary();
							//
							if (isPrimary) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!isPrimary) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if ((not == null) || (exists == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GuiaApe5Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean soloUnPrimaryKey(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Contenedor::soloUnPrimaryKey";
		try {
			/**
			 *
			 * inv soloUnPrimaryKey:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.posee->select(e | e.isPrimary)
			 *         ->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GuiaApe5Package.Literals.CONTENEDOR___SOLO_UN_PRIMARY_KEY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GuiaApe5Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Elemento> posee = this.getPosee();
				final /*@NonInvalid*/ OrderedSetValue BOXED_posee = idResolver
						.createOrderedSetOfAll(GuiaApe5Tables.ORD_CLSSid_Elemento, posee);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator = ValueUtil
						.createOrderedSetAccumulatorValue(GuiaApe5Tables.ORD_CLSSid_Elemento_0);
				Iterator<Object> ITERATOR_e_0 = BOXED_posee.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Elemento e_0 = (Elemento) ITERATOR_e_0.next();
					/**
					 * e.isPrimary
					 */
					final /*@NonInvalid*/ boolean isPrimary = e_0.isIsPrimary();
					//
					if (isPrimary) {
						accumulator.add(e_0);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE
						.evaluate(executor, size, GuiaApe5Tables.INT_1).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, GuiaApe5Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean tipoDeDatoObligatorioSiNoVisual(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Contenedor::tipoDeDatoObligatorioSiNoVisual";
		try {
			/**
			 *
			 * inv tipoDeDatoObligatorioSiNoVisual:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not self.esVisual implies
			 *         self.posee->forAll(e | not e.tipoDato.oclIsUndefined())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GuiaApe5Package.Literals.CONTENEDOR___TIPO_DE_DATO_OBLIGATORIO_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GuiaApe5Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ boolean esVisual = this.isEsVisual();
					final /*@NonInvalid*/ Boolean not;
					if (!esVisual) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (esVisual) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ List<Elemento> posee = this.getPosee();
							final /*@NonInvalid*/ OrderedSetValue BOXED_posee = idResolver
									.createOrderedSetOfAll(GuiaApe5Tables.ORD_CLSSid_Elemento, posee);
							/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_e_0 = BOXED_posee.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_e_0.hasNext()) {
									if (accumulator == null) {
										forAll = null;
									} else if (accumulator == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ Elemento e_0 = (Elemento) ITERATOR_e_0.next();
								/**
								 * not e.tipoDato.oclIsUndefined()
								 */
								final /*@NonInvalid*/ TipoDato tipoDato = e_0.getTipoDato();
								final /*@NonInvalid*/ boolean oclIsUndefined = tipoDato == null;
								final /*@NonInvalid*/ Boolean not_0;
								if (!oclIsUndefined) {
									not_0 = ValueUtil.TRUE_VALUE;
								} else {
									if (oclIsUndefined) {
										not_0 = ValueUtil.FALSE_VALUE;
									} else {
										not_0 = null;
									}
								}
								//
								if (not_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break; // Stop immediately
								} else if (not_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									; // Carry on
								} else if (not_0 == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.TRUE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll;
							}
							if ((not == null) || (CAUGHT_forAll == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, GuiaApe5Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GuiaApe5Package.CONTENEDOR__POSEE:
			return ((InternalEList<?>) getPosee()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GuiaApe5Package.CONTENEDOR__NAME:
			return getName();
		case GuiaApe5Package.CONTENEDOR__POSEE:
			return getPosee();
		case GuiaApe5Package.CONTENEDOR__RELACIONA:
			return getRelaciona();
		case GuiaApe5Package.CONTENEDOR__MAIN:
			return isMain();
		case GuiaApe5Package.CONTENEDOR__ES_VISUAL:
			return isEsVisual();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GuiaApe5Package.CONTENEDOR__NAME:
			setName((String) newValue);
			return;
		case GuiaApe5Package.CONTENEDOR__POSEE:
			getPosee().clear();
			getPosee().addAll((Collection<? extends Elemento>) newValue);
			return;
		case GuiaApe5Package.CONTENEDOR__RELACIONA:
			getRelaciona().clear();
			getRelaciona().addAll((Collection<? extends Contenedor>) newValue);
			return;
		case GuiaApe5Package.CONTENEDOR__MAIN:
			setMain((Boolean) newValue);
			return;
		case GuiaApe5Package.CONTENEDOR__ES_VISUAL:
			setEsVisual((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GuiaApe5Package.CONTENEDOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GuiaApe5Package.CONTENEDOR__POSEE:
			getPosee().clear();
			return;
		case GuiaApe5Package.CONTENEDOR__RELACIONA:
			getRelaciona().clear();
			return;
		case GuiaApe5Package.CONTENEDOR__MAIN:
			setMain(MAIN_EDEFAULT);
			return;
		case GuiaApe5Package.CONTENEDOR__ES_VISUAL:
			setEsVisual(ES_VISUAL_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GuiaApe5Package.CONTENEDOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GuiaApe5Package.CONTENEDOR__POSEE:
			return posee != null && !posee.isEmpty();
		case GuiaApe5Package.CONTENEDOR__RELACIONA:
			return relaciona != null && !relaciona.isEmpty();
		case GuiaApe5Package.CONTENEDOR__MAIN:
			return main != MAIN_EDEFAULT;
		case GuiaApe5Package.CONTENEDOR__ES_VISUAL:
			return esVisual != ES_VISUAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GuiaApe5Package.CONTENEDOR___NO_ASOCIO_CONMIGO__DIAGNOSTICCHAIN_MAP:
			return noAsocioConmigo((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GuiaApe5Package.CONTENEDOR___NO_MISMO_NOMBRE__DIAGNOSTICCHAIN_MAP:
			return noMismoNombre((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GuiaApe5Package.CONTENEDOR___VISUAL_NO_RELACIONA_NI_TIENE_CLAVE__DIAGNOSTICCHAIN_MAP:
			return visualNoRelacionaNiTieneClave((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GuiaApe5Package.CONTENEDOR___TIENE_PRIMARY_KEY_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP:
			return tienePrimaryKeySiNoVisual((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case GuiaApe5Package.CONTENEDOR___SOLO_UN_PRIMARY_KEY__DIAGNOSTICCHAIN_MAP:
			return soloUnPrimaryKey((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case GuiaApe5Package.CONTENEDOR___TIPO_DE_DATO_OBLIGATORIO_SI_NO_VISUAL__DIAGNOSTICCHAIN_MAP:
			return tipoDeDatoObligatorioSiNoVisual((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", main: ");
		result.append(main);
		result.append(", esVisual: ");
		result.append(esVisual);
		result.append(')');
		return result.toString();
	}

} //ContenedorImpl
