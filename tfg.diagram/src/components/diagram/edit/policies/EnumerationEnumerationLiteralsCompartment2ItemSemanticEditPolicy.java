/*
* 
*/
package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.EnumLiteralCreateCommand;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class EnumerationEnumerationLiteralsCompartment2ItemSemanticEditPolicy
		extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EnumerationEnumerationLiteralsCompartment2ItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Enumeration_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.EnumLiteral_3009 == req.getElementType()) {
			return getGEFWrapper(new EnumLiteralCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
