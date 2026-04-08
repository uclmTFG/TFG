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

import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.providers.ComponentsElementTypes;
import components.diagram.providers.ComponentsModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentsModelingAssistantProviderOfClasEditPart extends ComponentsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComponentsElementTypes.Property_3001);
		types.add(ComponentsElementTypes.Method_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ClasEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ClasEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ComponentsElementTypes.Generalization_4001);
		types.add(ComponentsElementTypes.Implementation_4002);
		types.add(ComponentsElementTypes.Association_4003);
		types.add(ComponentsElementTypes.Aggregation_4004);
		types.add(ComponentsElementTypes.Composition_4005);
		types.add(ComponentsElementTypes.Dependency_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ClasEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ClasEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClasEditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof EnumerationEditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof ClasEditPart) {
			types.add(ComponentsElementTypes.Implementation_4002);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ComponentsElementTypes.Implementation_4002);
		}
		if (targetEditPart instanceof EnumerationEditPart) {
			types.add(ComponentsElementTypes.Implementation_4002);
		}
		if (targetEditPart instanceof ClasEditPart) {
			types.add(ComponentsElementTypes.Association_4003);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ComponentsElementTypes.Association_4003);
		}
		if (targetEditPart instanceof EnumerationEditPart) {
			types.add(ComponentsElementTypes.Association_4003);
		}
		if (targetEditPart instanceof ClasEditPart) {
			types.add(ComponentsElementTypes.Aggregation_4004);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ComponentsElementTypes.Aggregation_4004);
		}
		if (targetEditPart instanceof EnumerationEditPart) {
			types.add(ComponentsElementTypes.Aggregation_4004);
		}
		if (targetEditPart instanceof ClasEditPart) {
			types.add(ComponentsElementTypes.Composition_4005);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ComponentsElementTypes.Composition_4005);
		}
		if (targetEditPart instanceof EnumerationEditPart) {
			types.add(ComponentsElementTypes.Composition_4005);
		}
		if (targetEditPart instanceof ClasEditPart) {
			types.add(ComponentsElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ComponentsElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof EnumerationEditPart) {
			types.add(ComponentsElementTypes.Dependency_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ClasEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ClasEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.Generalization_4001) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Implementation_4002) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Association_4003) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Aggregation_4004) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Composition_4005) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Dependency_4006) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ClasEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ClasEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(ComponentsElementTypes.Generalization_4001);
		types.add(ComponentsElementTypes.Implementation_4002);
		types.add(ComponentsElementTypes.Association_4003);
		types.add(ComponentsElementTypes.Aggregation_4004);
		types.add(ComponentsElementTypes.Composition_4005);
		types.add(ComponentsElementTypes.Dependency_4006);
		types.add(ComponentsElementTypes.NoteLink_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ClasEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ClasEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.Generalization_4001) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Implementation_4002) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Association_4003) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Aggregation_4004) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Composition_4005) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.Dependency_4006) {
			types.add(ComponentsElementTypes.Clas_2001);
			types.add(ComponentsElementTypes.Interface_2002);
			types.add(ComponentsElementTypes.Enumeration_2003);
		} else if (relationshipType == ComponentsElementTypes.NoteLink_4007) {
			types.add(ComponentsElementTypes.Note_2004);
		}
		return types;
	}

}
