/*
* 
*/
package mof.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import mof.Enlace;
import mof.MofPackage;
import mof.Nodo;
import mof.UMLDiagram;
import mof.diagram.edit.parts.EnlaceEditPart;
import mof.diagram.edit.parts.NodoEditPart;
import mof.diagram.edit.parts.UMLDiagramEditPart;
import mof.diagram.providers.MofElementTypes;

/**
 * @generated
 */
public class MofDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<MofNodeDescriptor> getSemanticChildren(View view) {
		switch (MofVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getUMLDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MofNodeDescriptor> getUMLDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UMLDiagram modelElement = (UMLDiagram) view.getElement();
		LinkedList<MofNodeDescriptor> result = new LinkedList<MofNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodos().iterator(); it.hasNext();) {
			Nodo childElement = (Nodo) it.next();
			int visualID = MofVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == NodoEditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MofLinkDescriptor> getContainedLinks(View view) {
		switch (MofVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getUMLDiagram_1000ContainedLinks(view);
		case NodoEditPart.VISUAL_ID:
			return getNodo_2001ContainedLinks(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MofLinkDescriptor> getIncomingLinks(View view) {
		switch (MofVisualIDRegistry.getVisualID(view)) {
		case NodoEditPart.VISUAL_ID:
			return getNodo_2001IncomingLinks(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MofLinkDescriptor> getOutgoingLinks(View view) {
		switch (MofVisualIDRegistry.getVisualID(view)) {
		case NodoEditPart.VISUAL_ID:
			return getNodo_2001OutgoingLinks(view);
		case EnlaceEditPart.VISUAL_ID:
			return getEnlace_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getUMLDiagram_1000ContainedLinks(View view) {
		UMLDiagram modelElement = (UMLDiagram) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Enlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodo_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getEnlace_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodo_2001IncomingLinks(View view) {
		Nodo modelElement = (Nodo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Enlace_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getEnlace_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodo_2001OutgoingLinks(View view) {
		Nodo modelElement = (Nodo) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Enlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getEnlace_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<MofLinkDescriptor> getContainedTypeModelFacetLinks_Enlace_4001(UMLDiagram container) {
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		for (Iterator<?> links = container.getEnlaces().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enlace) {
				continue;
			}
			Enlace link = (Enlace) linkObject;
			if (EnlaceEditPart.VISUAL_ID != MofVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nodo dst = link.getDestino();
			Nodo src = link.getOrigen();
			result.add(new MofLinkDescriptor(src, dst, link, MofElementTypes.Enlace_4001, EnlaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MofLinkDescriptor> getIncomingTypeModelFacetLinks_Enlace_4001(Nodo target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MofPackage.eINSTANCE.getEnlace_Destino()
					|| false == setting.getEObject() instanceof Enlace) {
				continue;
			}
			Enlace link = (Enlace) setting.getEObject();
			if (EnlaceEditPart.VISUAL_ID != MofVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nodo src = link.getOrigen();
			result.add(new MofLinkDescriptor(src, target, link, MofElementTypes.Enlace_4001, EnlaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MofLinkDescriptor> getOutgoingTypeModelFacetLinks_Enlace_4001(Nodo source) {
		UMLDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof UMLDiagram) {
				container = (UMLDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		for (Iterator<?> links = container.getEnlaces().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Enlace) {
				continue;
			}
			Enlace link = (Enlace) linkObject;
			if (EnlaceEditPart.VISUAL_ID != MofVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nodo dst = link.getDestino();
			Nodo src = link.getOrigen();
			if (src != source) {
				continue;
			}
			result.add(new MofLinkDescriptor(src, dst, link, MofElementTypes.Enlace_4001, EnlaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<MofNodeDescriptor> getSemanticChildren(View view) {
			return MofDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MofLinkDescriptor> getContainedLinks(View view) {
			return MofDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MofLinkDescriptor> getIncomingLinks(View view) {
			return MofDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MofLinkDescriptor> getOutgoingLinks(View view) {
			return MofDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
