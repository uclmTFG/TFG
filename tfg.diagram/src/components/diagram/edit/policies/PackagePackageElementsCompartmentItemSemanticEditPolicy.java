/*
* 
*/
package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.Clas2CreateCommand;
import components.diagram.edit.commands.Enumeration2CreateCommand;
import components.diagram.edit.commands.Interface2CreateCommand;
import components.diagram.edit.commands.Package2CreateCommand;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class PackagePackageElementsCompartmentItemSemanticEditPolicy extends ComponentsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PackagePackageElementsCompartmentItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Package_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Package_3001 == req.getElementType()) {
			return getGEFWrapper(new Package2CreateCommand(req));
		}
		if (ComponentsElementTypes.Clas_3002 == req.getElementType()) {
			return getGEFWrapper(new Clas2CreateCommand(req));
		}
		if (ComponentsElementTypes.Interface_3006 == req.getElementType()) {
			return getGEFWrapper(new Interface2CreateCommand(req));
		}
		if (ComponentsElementTypes.Enumeration_3008 == req.getElementType()) {
			return getGEFWrapper(new Enumeration2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
