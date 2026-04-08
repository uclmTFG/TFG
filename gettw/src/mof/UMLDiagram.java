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
 *   <li>{@link mof.UMLDiagram#getNotes <em>Notes</em>}</li>
 *   <li>{@link mof.UMLDiagram#getNoteLinks <em>Note Links</em>}</li>
 * </ul>
 *
 * @see mof.MofPackage#getUMLDiagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface UMLDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see mof.MofPackage#getUMLDiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getElements();

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

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link mof.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see mof.MofPackage#getUMLDiagram_Notes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Note Links</b></em>' containment reference list.
	 * The list contents are of type {@link mof.NoteLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Links</em>' containment reference list.
	 * @see mof.MofPackage#getUMLDiagram_NoteLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<NoteLink> getNoteLinks();

} // UMLDiagram
