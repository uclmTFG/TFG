/**
 */
package mof.impl;

import java.util.Collection;

import mof.Classifier;
import mof.MofPackage;
import mof.Note;
import mof.NoteLink;
import mof.Relationship;
import mof.UMLDiagram;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mof.impl.UMLDiagramImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link mof.impl.UMLDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link mof.impl.UMLDiagramImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link mof.impl.UMLDiagramImpl#getNoteLinks <em>Note Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLDiagramImpl extends EObjectImpl implements UMLDiagram {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> elements;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> links;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> notes;

	/**
	 * The cached value of the '{@link #getNoteLinks() <em>Note Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<NoteLink> noteLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MofPackage.Literals.UML_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Classifier>(Classifier.class, this, MofPackage.UML_DIAGRAM__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Relationship>(Relationship.class, this, MofPackage.UML_DIAGRAM__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Note> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Note>(Note.class, this, MofPackage.UML_DIAGRAM__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoteLink> getNoteLinks() {
		if (noteLinks == null) {
			noteLinks = new EObjectContainmentEList<NoteLink>(NoteLink.class, this, MofPackage.UML_DIAGRAM__NOTE_LINKS);
		}
		return noteLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MofPackage.UML_DIAGRAM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case MofPackage.UML_DIAGRAM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case MofPackage.UML_DIAGRAM__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case MofPackage.UML_DIAGRAM__NOTE_LINKS:
				return ((InternalEList<?>)getNoteLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MofPackage.UML_DIAGRAM__ELEMENTS:
				return getElements();
			case MofPackage.UML_DIAGRAM__LINKS:
				return getLinks();
			case MofPackage.UML_DIAGRAM__NOTES:
				return getNotes();
			case MofPackage.UML_DIAGRAM__NOTE_LINKS:
				return getNoteLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MofPackage.UML_DIAGRAM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Classifier>)newValue);
				return;
			case MofPackage.UML_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Relationship>)newValue);
				return;
			case MofPackage.UML_DIAGRAM__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
				return;
			case MofPackage.UML_DIAGRAM__NOTE_LINKS:
				getNoteLinks().clear();
				getNoteLinks().addAll((Collection<? extends NoteLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MofPackage.UML_DIAGRAM__ELEMENTS:
				getElements().clear();
				return;
			case MofPackage.UML_DIAGRAM__LINKS:
				getLinks().clear();
				return;
			case MofPackage.UML_DIAGRAM__NOTES:
				getNotes().clear();
				return;
			case MofPackage.UML_DIAGRAM__NOTE_LINKS:
				getNoteLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MofPackage.UML_DIAGRAM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case MofPackage.UML_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
			case MofPackage.UML_DIAGRAM__NOTES:
				return notes != null && !notes.isEmpty();
			case MofPackage.UML_DIAGRAM__NOTE_LINKS:
				return noteLinks != null && !noteLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UMLDiagramImpl
