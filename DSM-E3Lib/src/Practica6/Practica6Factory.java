/**
 */
package Practica6;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Practica6.Practica6Package
 * @generated
 */
public interface Practica6Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Practica6Factory eINSTANCE = Practica6.impl.Practica6FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Esquema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Esquema</em>'.
	 * @generated
	 */
	Esquema createEsquema();

	/**
	 * Returns a new object of class '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabla</em>'.
	 * @generated
	 */
	Tabla createTabla();

	/**
	 * Returns a new object of class '<em>Columna</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Columna</em>'.
	 * @generated
	 */
	Columna createColumna();

	/**
	 * Returns a new object of class '<em>FK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FK</em>'.
	 * @generated
	 */
	FK createFK();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Practica6Package getPractica6Package();

} //Practica6Factory
