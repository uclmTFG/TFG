/**
 */
package mof;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mof.MofPackage
 * @generated
 */
public interface MofFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MofFactory eINSTANCE = mof.impl.MofFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UML Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Diagram</em>'.
	 * @generated
	 */
	UMLDiagram createUMLDiagram();

	/**
	 * Returns a new object of class '<em>Nodo Uno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodo Uno</em>'.
	 * @generated
	 */
	NodoUno createNodoUno();

	/**
	 * Returns a new object of class '<em>Nodo Dos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodo Dos</em>'.
	 * @generated
	 */
	NodoDos createNodoDos();

	/**
	 * Returns a new object of class '<em>Enlace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enlace</em>'.
	 * @generated
	 */
	Enlace createEnlace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MofPackage getMofPackage();

} //MofFactory
