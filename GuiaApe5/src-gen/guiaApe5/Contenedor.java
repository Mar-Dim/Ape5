/**
 */
package guiaApe5;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link guiaApe5.Contenedor#getName <em>Name</em>}</li>
 *   <li>{@link guiaApe5.Contenedor#getPosee <em>Posee</em>}</li>
 *   <li>{@link guiaApe5.Contenedor#getRelaciona <em>Relaciona</em>}</li>
 *   <li>{@link guiaApe5.Contenedor#isMain <em>Main</em>}</li>
 *   <li>{@link guiaApe5.Contenedor#isEsVisual <em>Es Visual</em>}</li>
 * </ul>
 *
 * @see guiaApe5.GuiaApe5Package#getContenedor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='tipoDeDatoObligatorioSiNoVisual'"
 * @generated
 */
public interface Contenedor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see guiaApe5.GuiaApe5Package#getContenedor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link guiaApe5.Contenedor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Posee</b></em>' containment reference list.
	 * The list contents are of type {@link guiaApe5.Elemento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posee</em>' containment reference list.
	 * @see guiaApe5.GuiaApe5Package#getContenedor_Posee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Elemento> getPosee();

	/**
	 * Returns the value of the '<em><b>Relaciona</b></em>' reference list.
	 * The list contents are of type {@link guiaApe5.Contenedor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciona</em>' reference list.
	 * @see guiaApe5.GuiaApe5Package#getContenedor_Relaciona()
	 * @model
	 * @generated
	 */
	EList<Contenedor> getRelaciona();

	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(boolean)
	 * @see guiaApe5.GuiaApe5Package#getContenedor_Main()
	 * @model required="true"
	 * @generated
	 */
	boolean isMain();

	/**
	 * Sets the value of the '{@link guiaApe5.Contenedor#isMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #isMain()
	 * @generated
	 */
	void setMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Es Visual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Visual</em>' attribute.
	 * @see #setEsVisual(boolean)
	 * @see guiaApe5.GuiaApe5Package#getContenedor_EsVisual()
	 * @model required="true"
	 * @generated
	 */
	boolean isEsVisual();

	/**
	 * Sets the value of the '{@link guiaApe5.Contenedor#isEsVisual <em>Es Visual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Visual</em>' attribute.
	 * @see #isEsVisual()
	 * @generated
	 */
	void setEsVisual(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.relaciona -&gt; includes(self)'"
	 * @generated
	 */
	boolean noAsocioConmigo(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.posee -&gt; isUnique(e|e.name)'"
	 * @generated
	 */
	boolean noMismoNombre(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.esVisual implies (self.posee-&gt;forAll(e|not e.isPrimary) and self.relaciona-&gt;isEmpty())'"
	 * @generated
	 */
	boolean visualNoRelacionaNiTieneClave(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.esVisual implies self.posee -&gt; exists(e|e.isPrimary)'"
	 * @generated
	 */
	boolean tienePrimaryKeySiNoVisual(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.posee -&gt; select(e| e.isPrimary)-&gt; size()&lt;=1'"
	 * @generated
	 */
	boolean soloUnPrimaryKey(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.esVisual implies self.posee -&gt;forAll(e| not e.tipoDato.oclIsUndefined())'"
	 * @generated
	 */
	boolean tipoDeDatoObligatorioSiNoVisual(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Contenedor
