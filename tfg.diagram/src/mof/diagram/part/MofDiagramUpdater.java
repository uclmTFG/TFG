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

import mof.Clas;
import mof.Generalization;
import mof.MofPackage;
import mof.Nodeone;
import mof.UMLDiagram;
import mof.diagram.edit.parts.ClasEditPart;
import mof.diagram.edit.parts.GeneralizationEditPart;
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
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			Nodeone childElement = (Nodeone) it.next();
			int visualID = MofVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClasEditPart.VISUAL_ID) {
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
		case ClasEditPart.VISUAL_ID:
			return getClas_2001ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MofLinkDescriptor> getIncomingLinks(View view) {
		switch (MofVisualIDRegistry.getVisualID(view)) {
		case ClasEditPart.VISUAL_ID:
			return getClas_2001IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MofLinkDescriptor> getOutgoingLinks(View view) {
		switch (MofVisualIDRegistry.getVisualID(view)) {
		case ClasEditPart.VISUAL_ID:
			return getClas_2001OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getUMLDiagram_1000ContainedLinks(View view) {
		UMLDiagram modelElement = (UMLDiagram) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getClas_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getGeneralization_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getClas_2001IncomingLinks(View view) {
		Clas modelElement = (Clas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getGeneralization_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getClas_2001OutgoingLinks(View view) {
		Clas modelElement = (Clas) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getGeneralization_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<MofLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4001(
			UMLDiagram container) {
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != MofVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nodeone dst = link.getTarget();
			Nodeone src = link.getSource();
			result.add(new MofLinkDescriptor(src, dst, link, MofElementTypes.Generalization_4001,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MofLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4001(Nodeone target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MofPackage.eINSTANCE.getRelationship_Target()
					|| false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != MofVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nodeone src = link.getSource();
			result.add(new MofLinkDescriptor(src, target, link, MofElementTypes.Generalization_4001,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MofLinkDescriptor> getOutgoingTypeModelFacetLinks_Generalization_4001(Nodeone source) {
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
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != MofVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nodeone dst = link.getTarget();
			Nodeone src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MofLinkDescriptor(src, dst, link, MofElementTypes.Generalization_4001,
					GeneralizationEditPart.VISUAL_ID));
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
