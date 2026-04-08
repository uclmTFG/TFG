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
public class InterfaceInterfaceOperationsCompartmentItemSemanticEditPolicy
		extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InterfaceInterfaceOperationsCompartmentItemSemanticEditPolicy() {
<<<<<<< HEAD
		super(ComponentsElementTypes.Interface_3006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Method_3007 == req.getElementType()) {
=======
		super(ComponentsElementTypes.Interface_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Method_3004 == req.getElementType()) {
>>>>>>> branch 'master' of https://github.com/uclmTFG/TFG.git
			return getGEFWrapper(new Method2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
