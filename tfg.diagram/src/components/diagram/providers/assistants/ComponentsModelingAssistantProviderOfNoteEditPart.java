/*
 * 
 */
package components.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

<<<<<<< HEAD
import components.diagram.edit.parts.Clas2EditPart;
import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.Enumeration2EditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.Interface2EditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.edit.parts.NoteEditPart;
import components.diagram.edit.parts.Package2EditPart;
import components.diagram.edit.parts.PackageEditPart;
import components.diagram.providers.ComponentsElementTypes;
import components.diagram.providers.ComponentsModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentsModelingAssistantProviderOfNoteEditPart extends ComponentsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((NoteEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(NoteEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComponentsElementTypes.NoteLink_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((NoteEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(NoteEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PackageEditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		if (targetEditPart instanceof ClasEditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		if (targetEditPart instanceof EnumerationEditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		if (targetEditPart instanceof Clas2EditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((NoteEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(NoteEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.NoteLink_4007) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
=======
import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.edit.parts.NoteEditPart;
import components.diagram.providers.ComponentsElementTypes;
import components.diagram.providers.ComponentsModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentsModelingAssistantProviderOfNoteEditPart extends ComponentsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((NoteEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(NoteEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComponentsElementTypes.NoteLink_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((NoteEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(NoteEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClasEditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		if (targetEditPart instanceof EnumerationEditPart) {
			types.add(ComponentsElementTypes.NoteLink_4007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((NoteEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(NoteEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.NoteLink_4007) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
>>>>>>> branch 'master' of https://github.com/uclmTFG/TFG.git
		}
		return types;
	}

}
