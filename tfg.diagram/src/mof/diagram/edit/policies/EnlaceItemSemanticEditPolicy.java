/*
* 
*/
package mof.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import mof.diagram.providers.MofElementTypes;

/**
 * @generated
 */
public class EnlaceItemSemanticEditPolicy extends MofBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EnlaceItemSemanticEditPolicy() {
		super(MofElementTypes.Enlace_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
