/*
 * 
 */
package mof.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import mof.diagram.edit.parts.NodoDos2EditPart;
import mof.diagram.edit.parts.NodoDosEditPart;
import mof.diagram.edit.parts.NodoUnoEditPart;
import mof.diagram.providers.MofElementTypes;
import mof.diagram.providers.MofModelingAssistantProvider;

/**
 * @generated
 */
public class MofModelingAssistantProviderOfNodoDosEditPart extends MofModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((NodoDosEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(NodoDosEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MofElementTypes.Enlace_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((NodoDosEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(NodoDosEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof NodoUnoEditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		if (targetEditPart instanceof NodoDosEditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		if (targetEditPart instanceof NodoDos2EditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((NodoDosEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(NodoDosEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MofElementTypes.Enlace_4001) {
			types.add(MofElementTypes.NodoUno_2001);
			types.add(MofElementTypes.NodoDos_2002);
			types.add(MofElementTypes.NodoDos_3001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((NodoDosEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(NodoDosEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MofElementTypes.Enlace_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((NodoDosEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(NodoDosEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MofElementTypes.Enlace_4001) {
			types.add(MofElementTypes.NodoUno_2001);
			types.add(MofElementTypes.NodoDos_2002);
			types.add(MofElementTypes.NodoDos_3001);
		}
		return types;
	}

}
