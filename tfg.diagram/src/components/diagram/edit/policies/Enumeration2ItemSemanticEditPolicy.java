/*
* 
*/
package components.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import components.diagram.edit.commands.AggregationCreateCommand;
import components.diagram.edit.commands.AggregationReorientCommand;
import components.diagram.edit.commands.AssociationCreateCommand;
import components.diagram.edit.commands.AssociationReorientCommand;
import components.diagram.edit.commands.CompositionCreateCommand;
import components.diagram.edit.commands.CompositionReorientCommand;
import components.diagram.edit.commands.DependencyCreateCommand;
import components.diagram.edit.commands.DependencyReorientCommand;
import components.diagram.edit.commands.GeneralizationCreateCommand;
import components.diagram.edit.commands.GeneralizationReorientCommand;
import components.diagram.edit.commands.ImplementationCreateCommand;
import components.diagram.edit.commands.ImplementationReorientCommand;
import components.diagram.edit.commands.NoteLinkCreateCommand;
import components.diagram.edit.commands.NoteLinkReorientCommand;
import components.diagram.edit.parts.AggregationEditPart;
import components.diagram.edit.parts.AssociationEditPart;
import components.diagram.edit.parts.CompositionEditPart;
import components.diagram.edit.parts.DependencyEditPart;
import components.diagram.edit.parts.EnumLiteralEditPart;
import components.diagram.edit.parts.EnumerationEnumerationLiteralsCompartmentEditPart;
import components.diagram.edit.parts.GeneralizationEditPart;
import components.diagram.edit.parts.ImplementationEditPart;
import components.diagram.edit.parts.NoteLinkEditPart;
import components.diagram.part.ComponentsVisualIDRegistry;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class Enumeration2ItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public Enumeration2ItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Enumeration_3008);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ComponentsVisualIDRegistry.getVisualID(incomingLink) == GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(incomingLink) == ImplementationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(incomingLink) == AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(incomingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(incomingLink) == CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(incomingLink) == DependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(incomingLink) == NoteLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ComponentsVisualIDRegistry.getVisualID(outgoingLink) == GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(outgoingLink) == ImplementationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(outgoingLink) == AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(outgoingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(outgoingLink) == CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ComponentsVisualIDRegistry.getVisualID(outgoingLink) == DependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ComponentsVisualIDRegistry.getVisualID(node)) {
			case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ComponentsVisualIDRegistry.getVisualID(cnode)) {
					case EnumLiteralEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ComponentsElementTypes.Generalization_4001 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Implementation_4002 == req.getElementType()) {
			return getGEFWrapper(new ImplementationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Association_4003 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Aggregation_4004 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Composition_4005 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Dependency_4006 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.NoteLink_4007 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ComponentsElementTypes.Generalization_4001 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Implementation_4002 == req.getElementType()) {
			return getGEFWrapper(new ImplementationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Association_4003 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Aggregation_4004 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Composition_4005 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.Dependency_4006 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ComponentsElementTypes.NoteLink_4007 == req.getElementType()) {
			return getGEFWrapper(new NoteLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GeneralizationEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationReorientCommand(req));
		case ImplementationEditPart.VISUAL_ID:
			return getGEFWrapper(new ImplementationReorientCommand(req));
		case AssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationReorientCommand(req));
		case AggregationEditPart.VISUAL_ID:
			return getGEFWrapper(new AggregationReorientCommand(req));
		case CompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositionReorientCommand(req));
		case DependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyReorientCommand(req));
		case NoteLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new NoteLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
