/*
* 
*/
package mof.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import mof.diagram.edit.commands.NodoDosCreateCommand;
import mof.diagram.edit.commands.NodoUnoCreateCommand;
import mof.diagram.providers.MofElementTypes;

/**
 * @generated
 */
public class UMLDiagramItemSemanticEditPolicy extends MofBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UMLDiagramItemSemanticEditPolicy() {
		super(MofElementTypes.UMLDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MofElementTypes.NodoUno_2001 == req.getElementType()) {
			return getGEFWrapper(new NodoUnoCreateCommand(req));
		}
		if (MofElementTypes.NodoDos_2002 == req.getElementType()) {
			return getGEFWrapper(new NodoDosCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
