/**
 */
package guiaApe5;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see guiaApe5.GuiaApe5Package
 * @generated
 */
public interface GuiaApe5Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuiaApe5Factory eINSTANCE = guiaApe5.impl.GuiaApe5FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contenedor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor</em>'.
	 * @generated
	 */
	Contenedor createContenedor();

	/**
	 * Returns a new object of class '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sistema</em>'.
	 * @generated
	 */
	Sistema createSistema();

	/**
	 * Returns a new object of class '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemento</em>'.
	 * @generated
	 */
	Elemento createElemento();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GuiaApe5Package getGuiaApe5Package();

} //GuiaApe5Factory
