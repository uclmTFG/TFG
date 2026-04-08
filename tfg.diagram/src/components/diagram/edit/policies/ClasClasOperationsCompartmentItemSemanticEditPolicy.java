/*
* 
*/
package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.MethodCreateCommand;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ClasClasOperationsCompartmentItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClasClasOperationsCompartmentItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Clas_3002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Method_3004 == req.getElementType()) {
			return getGEFWrapper(new MethodCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
