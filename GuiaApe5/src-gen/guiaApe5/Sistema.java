/**
 */
package guiaApe5;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sistema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link guiaApe5.Sistema#getName <em>Name</em>}</li>
 *   <li>{@link guiaApe5.Sistema#getContiene <em>Contiene</em>}</li>
 * </ul>
 *
 * @see guiaApe5.GuiaApe5Package#getSistema()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nombreUnicoPorContenedor'"
 * @generated
 */
public interface Sistema extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see guiaApe5.GuiaApe5Package#getSistema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link guiaApe5.Sistema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contiene</b></em>' containment reference list.
	 * The list contents are of type {@link guiaApe5.Contenedor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contiene</em>' containment reference list.
	 * @see guiaApe5.GuiaApe5Package#getSistema_Contiene()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contenedor> getContiene();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.contiene-&gt;isUnique(c|c.name)'"
	 * @generated
	 */
	boolean nombreUnicoPorContenedor(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Sistema
