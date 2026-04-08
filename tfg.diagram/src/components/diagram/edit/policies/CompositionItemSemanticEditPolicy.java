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
public class CompositionItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CompositionItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Composition_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
