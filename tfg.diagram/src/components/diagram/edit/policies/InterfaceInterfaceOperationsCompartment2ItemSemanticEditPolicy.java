/*
* 
*/
package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.Method2CreateCommand;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class InterfaceInterfaceOperationsCompartment2ItemSemanticEditPolicy
		extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InterfaceInterfaceOperationsCompartment2ItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Interface_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Method_3007 == req.getElementType()) {
			return getGEFWrapper(new Method2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
