/*
 * 
 */
package components.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import components.diagram.providers.ComponentsElementTypes;
import components.diagram.providers.ComponentsModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentsModelingAssistantProviderOfMethodEditPart extends ComponentsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
<<<<<<< HEAD
		types.add(ComponentsElementTypes.Parameter_3005);
=======
		types.add(ComponentsElementTypes.Parameter_3003);
>>>>>>> branch 'master' of https://github.com/uclmTFG/TFG.git
		return types;
	}

}
