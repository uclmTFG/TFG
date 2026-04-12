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

import mof.diagram.edit.parts.AtributosMetodos2EditPart;
import mof.diagram.edit.parts.AtributosMetodosEditPart;
import mof.diagram.edit.parts.NodoDos2EditPart;
import mof.diagram.edit.parts.NodoDosEditPart;
import mof.diagram.edit.parts.NodoUno2EditPart;
import mof.diagram.edit.parts.NodoUnoEditPart;
import mof.diagram.edit.parts.Package2EditPart;
import mof.diagram.edit.parts.PackageEditPart;
import mof.diagram.providers.MofElementTypes;
import mof.diagram.providers.MofModelingAssistantProvider;

/**
 * @generated
 */
public class MofModelingAssistantProviderOfPackageEditPart extends MofModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PackageEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(PackageEditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((PackageEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(PackageEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PackageEditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		if (targetEditPart instanceof NodoUnoEditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		if (targetEditPart instanceof NodoDosEditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		if (targetEditPart instanceof AtributosMetodosEditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		if (targetEditPart instanceof NodoUno2EditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		if (targetEditPart instanceof NodoDos2EditPart) {
			types.add(MofElementTypes.Enlace_4001);
		}
		if (targetEditPart instanceof AtributosMetodos2EditPart) {
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
		return doGetTypesForTarget((PackageEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(PackageEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MofElementTypes.Enlace_4001) {
			types.add(MofElementTypes.Package_2001);
			types.add(MofElementTypes.NodoUno_2002);
			types.add(MofElementTypes.NodoDos_2003);
			types.add(MofElementTypes.AtributosMetodos_2004);
			types.add(MofElementTypes.Package_3001);
			types.add(MofElementTypes.NodoUno_3002);
			types.add(MofElementTypes.NodoDos_3003);
			types.add(MofElementTypes.AtributosMetodos_3004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PackageEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PackageEditPart target) {
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
		return doGetTypesForSource((PackageEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PackageEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MofElementTypes.Enlace_4001) {
			types.add(MofElementTypes.Package_2001);
			types.add(MofElementTypes.NodoUno_2002);
			types.add(MofElementTypes.NodoDos_2003);
			types.add(MofElementTypes.AtributosMetodos_2004);
			types.add(MofElementTypes.Package_3001);
			types.add(MofElementTypes.NodoUno_3002);
			types.add(MofElementTypes.NodoDos_3003);
			types.add(MofElementTypes.AtributosMetodos_3004);
		}
		return types;
	}

}
