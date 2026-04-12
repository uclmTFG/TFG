/*
* 
*/
package mof.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import mof.diagram.edit.commands.NodoDos2CreateCommand;
import mof.diagram.providers.MofElementTypes;

/**
 * @generated
 */
public class NodoUnoNodoUnoNodosDosCompartmentItemSemanticEditPolicy extends MofBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public NodoUnoNodoUnoNodosDosCompartmentItemSemanticEditPolicy() {
		super(MofElementTypes.NodoUno_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MofElementTypes.NodoDos_3001 == req.getElementType()) {
			return getGEFWrapper(new NodoDos2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
