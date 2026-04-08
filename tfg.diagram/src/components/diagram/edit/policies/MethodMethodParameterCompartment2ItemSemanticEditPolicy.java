/*
* 
*/
package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.ParameterCreateCommand;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class MethodMethodParameterCompartment2ItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MethodMethodParameterCompartment2ItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Method_3007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Parameter_3005 == req.getElementType()) {
			return getGEFWrapper(new ParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
