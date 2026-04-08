/*
* 
*/
package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.PropertyCreateCommand;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ClasClasAttributesCompartment2ItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClasClasAttributesCompartment2ItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Clas_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Property_3003 == req.getElementType()) {
			return getGEFWrapper(new PropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
