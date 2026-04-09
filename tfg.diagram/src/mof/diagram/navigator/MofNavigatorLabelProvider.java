/*
* 
*/
package mof.diagram.navigator;

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

import mof.diagram.edit.parts.EnlaceEditPart;
import mof.diagram.edit.parts.NodoEditPart;
import mof.diagram.edit.parts.NodoNombreEditPart;
import mof.diagram.edit.parts.UMLDiagramEditPart;
import mof.diagram.part.MofDiagramEditorPlugin;
import mof.diagram.part.MofVisualIDRegistry;
import mof.diagram.providers.MofElementTypes;
import mof.diagram.providers.MofParserProvider;

/**
 * @generated
 */
public class MofNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		MofDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		MofDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MofNavigatorItem && !isOwnView(((MofNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof MofNavigatorGroup) {
			MofNavigatorGroup group = (MofNavigatorGroup) element;
			return MofDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MofNavigatorItem) {
			MofNavigatorItem navigatorItem = (MofNavigatorItem) element;
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
		switch (MofVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?mof?UMLDiagram", MofElementTypes.UMLDiagram_1000); //$NON-NLS-1$
		case NodoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?mof?Nodo", MofElementTypes.Nodo_2001); //$NON-NLS-1$
		case EnlaceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?mof?Enlace", MofElementTypes.Enlace_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MofDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && MofElementTypes.isKnownElementType(elementType)) {
			image = MofElementTypes.getImage(elementType);
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
		if (element instanceof MofNavigatorGroup) {
			MofNavigatorGroup group = (MofNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MofNavigatorItem) {
			MofNavigatorItem navigatorItem = (MofNavigatorItem) element;
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
		switch (MofVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getUMLDiagram_1000Text(view);
		case NodoEditPart.VISUAL_ID:
			return getNodo_2001Text(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_4001Text(view);
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
	private String getNodo_2001Text(View view) {
		IParser parser = MofParserProvider.getParser(MofElementTypes.Nodo_2001,
				view.getElement() != null ? view.getElement() : view,
				MofVisualIDRegistry.getType(NodoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MofDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnlace_4001Text(View view) {
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
		return UMLDiagramEditPart.MODEL_ID.equals(MofVisualIDRegistry.getModelID(view));
	}

}
