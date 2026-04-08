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
public class EnumerationEnumerationLiteralsCompartmentItemSemanticEditPolicy
		extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EnumerationEnumerationLiteralsCompartmentItemSemanticEditPolicy() {
<<<<<<< HEAD
		super(ComponentsElementTypes.Enumeration_3008);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.EnumLiteral_3009 == req.getElementType()) {
=======
		super(ComponentsElementTypes.Enumeration_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.EnumLiteral_3005 == req.getElementType()) {
>>>>>>> branch 'master' of https://github.com/uclmTFG/TFG.git
			return getGEFWrapper(new EnumLiteralCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
