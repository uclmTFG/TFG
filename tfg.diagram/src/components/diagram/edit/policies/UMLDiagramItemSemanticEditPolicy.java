/*
* 
*/
package components.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import components.diagram.edit.commands.ClasCreateCommand;
import components.diagram.edit.commands.EnumerationCreateCommand;
import components.diagram.edit.commands.InterfaceCreateCommand;
import components.diagram.edit.commands.NoteCreateCommand;
<<<<<<< HEAD
import components.diagram.edit.commands.PackageCreateCommand;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class UMLDiagramItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UMLDiagramItemSemanticEditPolicy() {
		super(ComponentsElementTypes.UMLDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Package_2001 == req.getElementType()) {
			return getGEFWrapper(new PackageCreateCommand(req));
		}
		if (ComponentsElementTypes.Clas_2002 == req.getElementType()) {
			return getGEFWrapper(new ClasCreateCommand(req));
		}
		if (ComponentsElementTypes.Interface_2003 == req.getElementType()) {
			return getGEFWrapper(new InterfaceCreateCommand(req));
		}
		if (ComponentsElementTypes.Enumeration_2004 == req.getElementType()) {
			return getGEFWrapper(new EnumerationCreateCommand(req));
		}
		if (ComponentsElementTypes.Note_2005 == req.getElementType()) {
=======
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class UMLDiagramItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UMLDiagramItemSemanticEditPolicy() {
		super(ComponentsElementTypes.UMLDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Clas_2001 == req.getElementType()) {
			return getGEFWrapper(new ClasCreateCommand(req));
		}
		if (ComponentsElementTypes.Interface_2002 == req.getElementType()) {
			return getGEFWrapper(new InterfaceCreateCommand(req));
		}
		if (ComponentsElementTypes.Enumeration_2003 == req.getElementType()) {
			return getGEFWrapper(new EnumerationCreateCommand(req));
		}
		if (ComponentsElementTypes.Note_2004 == req.getElementType()) {
>>>>>>> branch 'master' of https://github.com/uclmTFG/TFG.git
			return getGEFWrapper(new NoteCreateCommand(req));
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
