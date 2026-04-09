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
public class GeneralizationItemSemanticEditPolicy extends MofBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GeneralizationItemSemanticEditPolicy() {
		super(MofElementTypes.Generalization_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
