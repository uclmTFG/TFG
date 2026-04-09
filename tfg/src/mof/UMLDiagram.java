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
 *   <li>{@link mof.UMLDiagram#getElements <em>Elements</em>}</li>
 *   <li>{@link mof.UMLDiagram#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getUMLDiagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface UMLDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Nodeone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see mof.MofPackage#getUMLDiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nodeone> getElements();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see mof.MofPackage#getUMLDiagram_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getLinks();

} // UMLDiagram
