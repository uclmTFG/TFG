/**
 */
package components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link components.NoteLink#getNote <em>Note</em>}</li>
 *   <li>{@link components.NoteLink#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see components.ComponentsPackage#getNoteLink()
 * @model annotation="gmf.link source='note' target='element' style='dash' color='150,150,150' tool.name='Note Link'"
 * @generated
 */
public interface NoteLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference.
	 * @see #setNote(Note)
	 * @see components.ComponentsPackage#getNoteLink_Note()
	 * @model required="true"
	 * @generated
	 */
	Note getNote();

	/**
	 * Sets the value of the '{@link components.NoteLink#getNote <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Note value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Classifier)
	 * @see components.ComponentsPackage#getNoteLink_Element()
	 * @model required="true"
	 * @generated
	 */
	Classifier getElement();

	/**
	 * Sets the value of the '{@link components.NoteLink#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Classifier value);

} // NoteLink
