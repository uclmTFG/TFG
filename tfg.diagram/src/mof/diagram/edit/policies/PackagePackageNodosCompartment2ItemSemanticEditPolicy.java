/*
* 
*/
package mof.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import mof.diagram.edit.commands.AtributosMetodos2CreateCommand;
import mof.diagram.edit.commands.NodoDos2CreateCommand;
import mof.diagram.edit.commands.NodoUno2CreateCommand;
import mof.diagram.edit.commands.Package2CreateCommand;
import mof.diagram.providers.MofElementTypes;

/**
 * @generated
 */
public class PackagePackageNodosCompartment2ItemSemanticEditPolicy extends MofBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PackagePackageNodosCompartment2ItemSemanticEditPolicy() {
		super(MofElementTypes.Package_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MofElementTypes.Package_3001 == req.getElementType()) {
			return getGEFWrapper(new Package2CreateCommand(req));
		}
		if (MofElementTypes.NodoUno_3002 == req.getElementType()) {
			return getGEFWrapper(new NodoUno2CreateCommand(req));
		}
		if (MofElementTypes.NodoDos_3003 == req.getElementType()) {
			return getGEFWrapper(new NodoDos2CreateCommand(req));
		}
		if (MofElementTypes.AtributosMetodos_3004 == req.getElementType()) {
			return getGEFWrapper(new AtributosMetodos2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
