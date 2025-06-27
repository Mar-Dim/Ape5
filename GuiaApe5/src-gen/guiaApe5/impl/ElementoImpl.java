/**
 */
package guiaApe5.impl;

import guiaApe5.Elemento;
import guiaApe5.GuiaApe5Package;
import guiaApe5.GuiaApe5Tables;
import guiaApe5.TipoDato;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link guiaApe5.impl.ElementoImpl#getName <em>Name</em>}</li>
 *   <li>{@link guiaApe5.impl.ElementoImpl#isIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link guiaApe5.impl.ElementoImpl#getLongitud <em>Longitud</em>}</li>
 *   <li>{@link guiaApe5.impl.ElementoImpl#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link guiaApe5.impl.ElementoImpl#isEsObligatorio <em>Es Obligatorio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementoImpl extends MinimalEObjectImpl.Container implements Elemento {
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
	 * The default value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimary = IS_PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitud()
	 * @generated
	 * @ordered
	 */
	protected static final int LONGITUD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitud()
	 * @generated
	 * @ordered
	 */
	protected int longitud = LONGITUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_DATO_EDEFAULT = TipoDato.STRING;

	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDato = TIPO_DATO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsObligatorio() <em>Es Obligatorio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsObligatorio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_OBLIGATORIO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsObligatorio() <em>Es Obligatorio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsObligatorio()
	 * @generated
	 * @ordered
	 */
	protected boolean esObligatorio = ES_OBLIGATORIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiaApe5Package.Literals.ELEMENTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiaApe5Package.ELEMENTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPrimary() {
		return isPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPrimary(boolean newIsPrimary) {
		boolean oldIsPrimary = isPrimary;
		isPrimary = newIsPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiaApe5Package.ELEMENTO__IS_PRIMARY, oldIsPrimary,
					isPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLongitud() {
		return longitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitud(int newLongitud) {
		int oldLongitud = longitud;
		longitud = newLongitud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiaApe5Package.ELEMENTO__LONGITUD, oldLongitud,
					longitud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoDato getTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoDato(TipoDato newTipoDato) {
		TipoDato oldTipoDato = tipoDato;
		tipoDato = newTipoDato == null ? TIPO_DATO_EDEFAULT : newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiaApe5Package.ELEMENTO__TIPO_DATO, oldTipoDato,
					tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsObligatorio() {
		return esObligatorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsObligatorio(boolean newEsObligatorio) {
		boolean oldEsObligatorio = esObligatorio;
		esObligatorio = newEsObligatorio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiaApe5Package.ELEMENTO__ES_OBLIGATORIO,
					oldEsObligatorio, esObligatorio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean longitudCadena(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Elemento::longitudCadena";
		try {
			/**
			 *
			 * inv longitudCadena:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.tipoDato = TipoDato::String implies self.longitud > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					GuiaApe5Package.Literals.ELEMENTO___LONGITUD_CADENA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, GuiaApe5Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ TipoDato tipoDato = this.getTipoDato();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_tipoDato = tipoDato == null ? null
						: GuiaApe5Tables.ENUMid_TipoDato
								.getEnumerationLiteralId(ClassUtil.nonNullState(tipoDato.getName()));
				final /*@NonInvalid*/ boolean eq = BOXED_tipoDato == GuiaApe5Tables.ELITid_String;
				final /*@NonInvalid*/ Boolean result;
				if (!eq) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ int longitud = this.getLongitud();
					final /*@NonInvalid*/ IntegerValue BOXED_longitud = ValueUtil.integerValueOf(longitud);
					final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
							.evaluate(executor, BOXED_longitud, GuiaApe5Tables.INT_0).booleanValue();
					if (gt) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GuiaApe5Package.ELEMENTO__NAME:
			return getName();
		case GuiaApe5Package.ELEMENTO__IS_PRIMARY:
			return isIsPrimary();
		case GuiaApe5Package.ELEMENTO__LONGITUD:
			return getLongitud();
		case GuiaApe5Package.ELEMENTO__TIPO_DATO:
			return getTipoDato();
		case GuiaApe5Package.ELEMENTO__ES_OBLIGATORIO:
			return isEsObligatorio();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GuiaApe5Package.ELEMENTO__NAME:
			setName((String) newValue);
			return;
		case GuiaApe5Package.ELEMENTO__IS_PRIMARY:
			setIsPrimary((Boolean) newValue);
			return;
		case GuiaApe5Package.ELEMENTO__LONGITUD:
			setLongitud((Integer) newValue);
			return;
		case GuiaApe5Package.ELEMENTO__TIPO_DATO:
			setTipoDato((TipoDato) newValue);
			return;
		case GuiaApe5Package.ELEMENTO__ES_OBLIGATORIO:
			setEsObligatorio((Boolean) newValue);
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
		case GuiaApe5Package.ELEMENTO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GuiaApe5Package.ELEMENTO__IS_PRIMARY:
			setIsPrimary(IS_PRIMARY_EDEFAULT);
			return;
		case GuiaApe5Package.ELEMENTO__LONGITUD:
			setLongitud(LONGITUD_EDEFAULT);
			return;
		case GuiaApe5Package.ELEMENTO__TIPO_DATO:
			setTipoDato(TIPO_DATO_EDEFAULT);
			return;
		case GuiaApe5Package.ELEMENTO__ES_OBLIGATORIO:
			setEsObligatorio(ES_OBLIGATORIO_EDEFAULT);
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
		case GuiaApe5Package.ELEMENTO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GuiaApe5Package.ELEMENTO__IS_PRIMARY:
			return isPrimary != IS_PRIMARY_EDEFAULT;
		case GuiaApe5Package.ELEMENTO__LONGITUD:
			return longitud != LONGITUD_EDEFAULT;
		case GuiaApe5Package.ELEMENTO__TIPO_DATO:
			return tipoDato != TIPO_DATO_EDEFAULT;
		case GuiaApe5Package.ELEMENTO__ES_OBLIGATORIO:
			return esObligatorio != ES_OBLIGATORIO_EDEFAULT;
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
		case GuiaApe5Package.ELEMENTO___LONGITUD_CADENA__DIAGNOSTICCHAIN_MAP:
			return longitudCadena((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(", isPrimary: ");
		result.append(isPrimary);
		result.append(", longitud: ");
		result.append(longitud);
		result.append(", tipoDato: ");
		result.append(tipoDato);
		result.append(", esObligatorio: ");
		result.append(esObligatorio);
		result.append(')');
		return result.toString();
	}

} //ElementoImpl
