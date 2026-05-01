/**
 */
package mof;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mof.UMLDiagram#getNodos <em>Nodos</em>}</li>
 *   <li>{@link mof.UMLDiagram#getEnlaces <em>Enlaces</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getUMLDiagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface UMLDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodos</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Nodo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodos</em>' containment reference list.
	 * @see mof.MofPackage#getUMLDiagram_Nodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nodo> getNodos();

	/**
	 * Returns the value of the '<em><b>Enlaces</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Enlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enlaces</em>' containment reference list.
	 * @see mof.MofPackage#getUMLDiagram_Enlaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enlace> getEnlaces();

} // UMLDiagram
