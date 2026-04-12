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

import mof.AtributosMetodos;
import mof.Enlace;
import mof.MofPackage;
import mof.Nodo;
import mof.NodoDos;
import mof.NodoUno;
import mof.Package;
import mof.UMLDiagram;
import mof.diagram.edit.parts.AtributosMetodos2EditPart;
import mof.diagram.edit.parts.AtributosMetodosEditPart;
import mof.diagram.edit.parts.EnlaceEditPart;
import mof.diagram.edit.parts.NodoDos2EditPart;
import mof.diagram.edit.parts.NodoDosEditPart;
import mof.diagram.edit.parts.NodoUno2EditPart;
import mof.diagram.edit.parts.NodoUnoEditPart;
import mof.diagram.edit.parts.Package2EditPart;
import mof.diagram.edit.parts.PackageEditPart;
import mof.diagram.edit.parts.PackagePackageNodosCompartment2EditPart;
import mof.diagram.edit.parts.PackagePackageNodosCompartmentEditPart;
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
		case PackagePackageNodosCompartmentEditPart.VISUAL_ID:
			return getPackagePackageNodosCompartment_7001SemanticChildren(view);
		case PackagePackageNodosCompartment2EditPart.VISUAL_ID:
			return getPackagePackageNodosCompartment_7002SemanticChildren(view);
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
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NodoUnoEditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NodoDosEditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributosMetodosEditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MofNodeDescriptor> getPackagePackageNodosCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<MofNodeDescriptor> result = new LinkedList<MofNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodos().iterator(); it.hasNext();) {
			Nodo childElement = (Nodo) it.next();
			int visualID = MofVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NodoUno2EditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NodoDos2EditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributosMetodos2EditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MofNodeDescriptor> getPackagePackageNodosCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<MofNodeDescriptor> result = new LinkedList<MofNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodos().iterator(); it.hasNext();) {
			Nodo childElement = (Nodo) it.next();
			int visualID = MofVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NodoUno2EditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NodoDos2EditPart.VISUAL_ID) {
				result.add(new MofNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributosMetodos2EditPart.VISUAL_ID) {
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
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001ContainedLinks(view);
		case NodoUnoEditPart.VISUAL_ID:
			return getNodoUno_2002ContainedLinks(view);
		case NodoDosEditPart.VISUAL_ID:
			return getNodoDos_2003ContainedLinks(view);
		case AtributosMetodosEditPart.VISUAL_ID:
			return getAtributosMetodos_2004ContainedLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3001ContainedLinks(view);
		case NodoUno2EditPart.VISUAL_ID:
			return getNodoUno_3002ContainedLinks(view);
		case NodoDos2EditPart.VISUAL_ID:
			return getNodoDos_3003ContainedLinks(view);
		case AtributosMetodos2EditPart.VISUAL_ID:
			return getAtributosMetodos_3004ContainedLinks(view);
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
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001IncomingLinks(view);
		case NodoUnoEditPart.VISUAL_ID:
			return getNodoUno_2002IncomingLinks(view);
		case NodoDosEditPart.VISUAL_ID:
			return getNodoDos_2003IncomingLinks(view);
		case AtributosMetodosEditPart.VISUAL_ID:
			return getAtributosMetodos_2004IncomingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3001IncomingLinks(view);
		case NodoUno2EditPart.VISUAL_ID:
			return getNodoUno_3002IncomingLinks(view);
		case NodoDos2EditPart.VISUAL_ID:
			return getNodoDos_3003IncomingLinks(view);
		case AtributosMetodos2EditPart.VISUAL_ID:
			return getAtributosMetodos_3004IncomingLinks(view);
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
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001OutgoingLinks(view);
		case NodoUnoEditPart.VISUAL_ID:
			return getNodoUno_2002OutgoingLinks(view);
		case NodoDosEditPart.VISUAL_ID:
			return getNodoDos_2003OutgoingLinks(view);
		case AtributosMetodosEditPart.VISUAL_ID:
			return getAtributosMetodos_2004OutgoingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3001OutgoingLinks(view);
		case NodoUno2EditPart.VISUAL_ID:
			return getNodoUno_3002OutgoingLinks(view);
		case NodoDos2EditPart.VISUAL_ID:
			return getNodoDos_3003OutgoingLinks(view);
		case AtributosMetodos2EditPart.VISUAL_ID:
			return getAtributosMetodos_3004OutgoingLinks(view);
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
	public static List<MofLinkDescriptor> getPackage_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoUno_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoDos_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getAtributosMetodos_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getPackage_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoUno_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoDos_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getAtributosMetodos_3004ContainedLinks(View view) {
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
	public static List<MofLinkDescriptor> getPackage_2001IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Enlace_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoUno_2002IncomingLinks(View view) {
		NodoUno modelElement = (NodoUno) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Enlace_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoDos_2003IncomingLinks(View view) {
		NodoDos modelElement = (NodoDos) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Enlace_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getAtributosMetodos_2004IncomingLinks(View view) {
		AtributosMetodos modelElement = (AtributosMetodos) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Enlace_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getPackage_3001IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Enlace_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoUno_3002IncomingLinks(View view) {
		NodoUno modelElement = (NodoUno) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Enlace_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoDos_3003IncomingLinks(View view) {
		NodoDos modelElement = (NodoDos) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Enlace_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getAtributosMetodos_3004IncomingLinks(View view) {
		AtributosMetodos modelElement = (AtributosMetodos) view.getElement();
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
	public static List<MofLinkDescriptor> getPackage_2001OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Enlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoUno_2002OutgoingLinks(View view) {
		NodoUno modelElement = (NodoUno) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Enlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoDos_2003OutgoingLinks(View view) {
		NodoDos modelElement = (NodoDos) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Enlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getAtributosMetodos_2004OutgoingLinks(View view) {
		AtributosMetodos modelElement = (AtributosMetodos) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Enlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getPackage_3001OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Enlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoUno_3002OutgoingLinks(View view) {
		NodoUno modelElement = (NodoUno) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Enlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getNodoDos_3003OutgoingLinks(View view) {
		NodoDos modelElement = (NodoDos) view.getElement();
		LinkedList<MofLinkDescriptor> result = new LinkedList<MofLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Enlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MofLinkDescriptor> getAtributosMetodos_3004OutgoingLinks(View view) {
		AtributosMetodos modelElement = (AtributosMetodos) view.getElement();
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
