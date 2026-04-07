/*
* 
*/
package components.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import components.Dependency;
import components.diagram.edit.parts.AggregationEditPart;
import components.diagram.edit.parts.AssociationEditPart;
import components.diagram.edit.parts.AssociationRoleEditPart;
import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.ClasNameEditPart;
import components.diagram.edit.parts.CompositionEditPart;
import components.diagram.edit.parts.DependencyEditPart;
import components.diagram.edit.parts.EnumLiteralEditPart;
import components.diagram.edit.parts.EnumLiteralNameEditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.EnumerationNameEditPart;
import components.diagram.edit.parts.GeneralizationEditPart;
import components.diagram.edit.parts.ImplementationEditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.edit.parts.InterfaceNameEditPart;
import components.diagram.edit.parts.Method2EditPart;
import components.diagram.edit.parts.MethodEditPart;
import components.diagram.edit.parts.MethodVisibilityNameReturnTyp2EditPart;
import components.diagram.edit.parts.MethodVisibilityNameReturnTypEditPart;
import components.diagram.edit.parts.NoteEditPart;
import components.diagram.edit.parts.NoteLinkEditPart;
import components.diagram.edit.parts.NoteTextEditPart;
import components.diagram.edit.parts.ParameterEditPart;
import components.diagram.edit.parts.ParameterNameTypeEditPart;
import components.diagram.edit.parts.PropertyEditPart;
import components.diagram.edit.parts.PropertyVisibilityNameTypeEditPart;
import components.diagram.edit.parts.UMLDiagramEditPart;
import components.diagram.part.ComponentsDiagramEditorPlugin;
import components.diagram.part.ComponentsVisualIDRegistry;
import components.diagram.providers.ComponentsElementTypes;
import components.diagram.providers.ComponentsParserProvider;

/**
 * @generated
 */
public class ComponentsNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ComponentsDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ComponentsDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ComponentsNavigatorItem && !isOwnView(((ComponentsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ComponentsNavigatorGroup) {
			ComponentsNavigatorGroup group = (ComponentsNavigatorGroup) element;
			return ComponentsDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ComponentsNavigatorItem) {
			ComponentsNavigatorItem navigatorItem = (ComponentsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?components?UMLDiagram", ComponentsElementTypes.UMLDiagram_1000); //$NON-NLS-1$
		case ClasEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?components?Clas", ComponentsElementTypes.Clas_2001); //$NON-NLS-1$
		case InterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?components?Interface", ComponentsElementTypes.Interface_2002); //$NON-NLS-1$
		case EnumerationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?components?Enumeration", ComponentsElementTypes.Enumeration_2003); //$NON-NLS-1$
		case NoteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?components?Note", ComponentsElementTypes.Note_2004); //$NON-NLS-1$
		case PropertyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?components?Property", ComponentsElementTypes.Property_3001); //$NON-NLS-1$
		case MethodEditPart.VISUAL_ID:
			return getImage("Navigator?Node?components?Method", ComponentsElementTypes.Method_3002); //$NON-NLS-1$
		case ParameterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?components?Parameter", ComponentsElementTypes.Parameter_3003); //$NON-NLS-1$
		case Method2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?components?Method", ComponentsElementTypes.Method_3004); //$NON-NLS-1$
		case EnumLiteralEditPart.VISUAL_ID:
			return getImage("Navigator?Node?components?EnumLiteral", ComponentsElementTypes.EnumLiteral_3005); //$NON-NLS-1$
		case GeneralizationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?components?Generalization", ComponentsElementTypes.Generalization_4001); //$NON-NLS-1$
		case ImplementationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?components?Implementation", ComponentsElementTypes.Implementation_4002); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?components?Association", ComponentsElementTypes.Association_4003); //$NON-NLS-1$
		case AggregationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?components?Aggregation", ComponentsElementTypes.Aggregation_4004); //$NON-NLS-1$
		case CompositionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?components?Composition", ComponentsElementTypes.Composition_4005); //$NON-NLS-1$
		case DependencyEditPart.VISUAL_ID:
			return getImage("Navigator?Link?components?Dependency", ComponentsElementTypes.Dependency_4006); //$NON-NLS-1$
		case NoteLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?components?NoteLink", ComponentsElementTypes.NoteLink_4007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ComponentsDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ComponentsElementTypes.isKnownElementType(elementType)) {
			image = ComponentsElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ComponentsNavigatorGroup) {
			ComponentsNavigatorGroup group = (ComponentsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ComponentsNavigatorItem) {
			ComponentsNavigatorItem navigatorItem = (ComponentsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getUMLDiagram_1000Text(view);
		case ClasEditPart.VISUAL_ID:
			return getClas_2001Text(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2002Text(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_2003Text(view);
		case NoteEditPart.VISUAL_ID:
			return getNote_2004Text(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3001Text(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3002Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3003Text(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_3004Text(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3005Text(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001Text(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003Text(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4004Text(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4005Text(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006Text(view);
		case NoteLinkEditPart.VISUAL_ID:
			return getNoteLink_4007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUMLDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getClas_2001Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.Clas_2001,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(ClasNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInterface_2002Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.Interface_2002,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(InterfaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnumeration_2003Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.Enumeration_2003,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(EnumerationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNote_2004Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.Note_2004,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(NoteTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProperty_3001Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.Property_3001,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(PropertyVisibilityNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMethod_3002Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.Method_3002,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(MethodVisibilityNameReturnTypEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getParameter_3003Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.Parameter_3003,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(ParameterNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMethod_3004Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.Method_3004,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(MethodVisibilityNameReturnTyp2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnumLiteral_3005Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.EnumLiteral_3005,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(EnumLiteralNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGeneralization_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getImplementation_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAssociation_4003Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(ComponentsElementTypes.Association_4003,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(AssociationRoleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAggregation_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getComposition_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDependency_4006Text(View view) {
		Dependency domainModelElement = (Dependency) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getStereotype();
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNoteLink_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return UMLDiagramEditPart.MODEL_ID.equals(ComponentsVisualIDRegistry.getModelID(view));
	}

}
