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
public class ClasClasAttributesCompartmentItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClasClasAttributesCompartmentItemSemanticEditPolicy() {
<<<<<<< HEAD
		super(ComponentsElementTypes.Clas_3002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Property_3003 == req.getElementType()) {
=======
		super(ComponentsElementTypes.Clas_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Property_3001 == req.getElementType()) {
>>>>>>> branch 'master' of https://github.com/uclmTFG/TFG.git
			return getGEFWrapper(new PropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
