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

import components.diagram.edit.parts.Clas2EditPart;
import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.Enumeration2EditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.Interface2EditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.edit.parts.Package2EditPart;
import components.diagram.edit.parts.PackageEditPart;
import components.diagram.providers.ComponentsElementTypes;
import components.diagram.providers.ComponentsModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentsModelingAssistantProviderOfClas2EditPart extends ComponentsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComponentsElementTypes.Property_3003);
		types.add(ComponentsElementTypes.Method_3004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Clas2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Clas2EditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((Clas2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Clas2EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PackageEditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof ClasEditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof EnumerationEditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof Clas2EditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(ComponentsElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof PackageEditPart) {
			types.add(ComponentsElementTypes.Implementation_4002);
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
		if (targetEditPart instanceof Package2EditPart) {
			types.add(ComponentsElementTypes.Implementation_4002);
		}
		if (targetEditPart instanceof Clas2EditPart) {
			types.add(ComponentsElementTypes.Implementation_4002);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(ComponentsElementTypes.Implementation_4002);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(ComponentsElementTypes.Implementation_4002);
		}
		if (targetEditPart instanceof PackageEditPart) {
			types.add(ComponentsElementTypes.Association_4003);
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
		if (targetEditPart instanceof Package2EditPart) {
			types.add(ComponentsElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Clas2EditPart) {
			types.add(ComponentsElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(ComponentsElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(ComponentsElementTypes.Association_4003);
		}
		if (targetEditPart instanceof PackageEditPart) {
			types.add(ComponentsElementTypes.Aggregation_4004);
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
		if (targetEditPart instanceof Package2EditPart) {
			types.add(ComponentsElementTypes.Aggregation_4004);
		}
		if (targetEditPart instanceof Clas2EditPart) {
			types.add(ComponentsElementTypes.Aggregation_4004);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(ComponentsElementTypes.Aggregation_4004);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(ComponentsElementTypes.Aggregation_4004);
		}
		if (targetEditPart instanceof PackageEditPart) {
			types.add(ComponentsElementTypes.Composition_4005);
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
		if (targetEditPart instanceof Package2EditPart) {
			types.add(ComponentsElementTypes.Composition_4005);
		}
		if (targetEditPart instanceof Clas2EditPart) {
			types.add(ComponentsElementTypes.Composition_4005);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(ComponentsElementTypes.Composition_4005);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(ComponentsElementTypes.Composition_4005);
		}
		if (targetEditPart instanceof PackageEditPart) {
			types.add(ComponentsElementTypes.Dependency_4006);
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
		if (targetEditPart instanceof Package2EditPart) {
			types.add(ComponentsElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof Clas2EditPart) {
			types.add(ComponentsElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(ComponentsElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
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
		return doGetTypesForTarget((Clas2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Clas2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.Generalization_4001) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Implementation_4002) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Association_4003) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Aggregation_4004) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Composition_4005) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Dependency_4006) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Clas2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Clas2EditPart target) {
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
		return doGetTypesForSource((Clas2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Clas2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.Generalization_4001) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Implementation_4002) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Association_4003) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Aggregation_4004) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Composition_4005) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.Dependency_4006) {
			types.add(ComponentsElementTypes.Package_2001);
			types.add(ComponentsElementTypes.Clas_2002);
			types.add(ComponentsElementTypes.Interface_2003);
			types.add(ComponentsElementTypes.Enumeration_2004);
			types.add(ComponentsElementTypes.Package_3001);
			types.add(ComponentsElementTypes.Clas_3002);
			types.add(ComponentsElementTypes.Interface_3006);
			types.add(ComponentsElementTypes.Enumeration_3008);
		} else if (relationshipType == ComponentsElementTypes.NoteLink_4007) {
			types.add(ComponentsElementTypes.Note_2005);
		}
		return types;
	}

}
