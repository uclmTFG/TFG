/*
* 
*/
package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class AssociationItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AssociationItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Association_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
