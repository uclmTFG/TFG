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
public class ComponentsModelingAssistantProviderOfUMLDiagramEditPart extends ComponentsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ComponentsElementTypes.Package_2001);
		types.add(ComponentsElementTypes.Clas_2002);
		types.add(ComponentsElementTypes.Interface_2003);
		types.add(ComponentsElementTypes.Enumeration_2004);
		types.add(ComponentsElementTypes.Note_2005);
		return types;
	}

}
