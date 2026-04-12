/*
 * 
 */
package mof.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import mof.diagram.providers.MofElementTypes;
import mof.diagram.providers.MofModelingAssistantProvider;

/**
 * @generated
 */
public class MofModelingAssistantProviderOfUMLDiagramEditPart extends MofModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(MofElementTypes.Package_2001);
		types.add(MofElementTypes.NodoUno_2002);
		types.add(MofElementTypes.NodoDos_2003);
		types.add(MofElementTypes.AtributosMetodos_2004);
		return types;
	}

}
