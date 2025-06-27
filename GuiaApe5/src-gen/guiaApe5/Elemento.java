/**
 */
package guiaApe5;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link guiaApe5.Elemento#getName <em>Name</em>}</li>
 *   <li>{@link guiaApe5.Elemento#isIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link guiaApe5.Elemento#getLongitud <em>Longitud</em>}</li>
 *   <li>{@link guiaApe5.Elemento#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link guiaApe5.Elemento#isEsObligatorio <em>Es Obligatorio</em>}</li>
 * </ul>
 *
 * @see guiaApe5.GuiaApe5Package#getElemento()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='longitudCadena'"
 * @generated
 */
public interface Elemento extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see guiaApe5.GuiaApe5Package#getElemento_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link guiaApe5.Elemento#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #setIsPrimary(boolean)
	 * @see guiaApe5.GuiaApe5Package#getElemento_IsPrimary()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPrimary();

	/**
	 * Sets the value of the '{@link guiaApe5.Elemento#isIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #isIsPrimary()
	 * @generated
	 */
	void setIsPrimary(boolean value);

	/**
	 * Returns the value of the '<em><b>Longitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitud</em>' attribute.
	 * @see #setLongitud(int)
	 * @see guiaApe5.GuiaApe5Package#getElemento_Longitud()
	 * @model required="true"
	 * @generated
	 */
	int getLongitud();

	/**
	 * Sets the value of the '{@link guiaApe5.Elemento#getLongitud <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitud</em>' attribute.
	 * @see #getLongitud()
	 * @generated
	 */
	void setLongitud(int value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' attribute.
	 * The literals are from the enumeration {@link guiaApe5.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' attribute.
	 * @see guiaApe5.TipoDato
	 * @see #setTipoDato(TipoDato)
	 * @see guiaApe5.GuiaApe5Package#getElemento_TipoDato()
	 * @model
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link guiaApe5.Elemento#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see guiaApe5.TipoDato
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Es Obligatorio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Obligatorio</em>' attribute.
	 * @see #setEsObligatorio(boolean)
	 * @see guiaApe5.GuiaApe5Package#getElemento_EsObligatorio()
	 * @model required="true"
	 * @generated
	 */
	boolean isEsObligatorio();

	/**
	 * Sets the value of the '{@link guiaApe5.Elemento#isEsObligatorio <em>Es Obligatorio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Obligatorio</em>' attribute.
	 * @see #isEsObligatorio()
	 * @generated
	 */
	void setEsObligatorio(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.tipoDato = TipoDato :: String implies self.longitud&gt;0'"
	 * @generated
	 */
	boolean longitudCadena(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Elemento
