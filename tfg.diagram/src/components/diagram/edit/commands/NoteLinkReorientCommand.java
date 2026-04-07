/*
 * 
 */
package components.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import components.Classifier;
import components.Note;
import components.NoteLink;
import components.UMLDiagram;
import components.diagram.edit.policies.ComponentsBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NoteLinkReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public NoteLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof NoteLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Note && newEnd instanceof Note)) {
			return false;
		}
		Classifier target = getLink().getElement();
		if (!(getLink().eContainer() instanceof UMLDiagram)) {
			return false;
		}
		UMLDiagram container = (UMLDiagram) getLink().eContainer();
		return ComponentsBaseItemSemanticEditPolicy.getLinkConstraints().canExistNoteLink_4007(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Classifier && newEnd instanceof Classifier)) {
			return false;
		}
		Note source = getLink().getNote();
		if (!(getLink().eContainer() instanceof UMLDiagram)) {
			return false;
		}
		UMLDiagram container = (UMLDiagram) getLink().eContainer();
		return ComponentsBaseItemSemanticEditPolicy.getLinkConstraints().canExistNoteLink_4007(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setNote(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setElement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected NoteLink getLink() {
		return (NoteLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Note getOldSource() {
		return (Note) oldEnd;
	}

	/**
	* @generated
	*/
	protected Note getNewSource() {
		return (Note) newEnd;
	}

	/**
	* @generated
	*/
	protected Classifier getOldTarget() {
		return (Classifier) oldEnd;
	}

	/**
	* @generated
	*/
	protected Classifier getNewTarget() {
		return (Classifier) newEnd;
	}
}
