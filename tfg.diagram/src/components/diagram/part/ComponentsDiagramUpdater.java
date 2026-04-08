/*
* 
*/
package components.diagram.part;

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

import components.Aggregation;
import components.Association;
import components.Clas;
import components.Classifier;
import components.ComponentsPackage;
import components.Composition;
import components.Dependency;
import components.EnumLiteral;
import components.Enumeration;
import components.Generalization;
import components.Implementation;
import components.Interface;
import components.Method;
import components.Note;
import components.NoteLink;
<<<<<<< HEAD
import components.Package;
import components.Parameter;
import components.Property;
import components.UMLDiagram;
import components.diagram.edit.parts.AggregationEditPart;
import components.diagram.edit.parts.AssociationEditPart;
import components.diagram.edit.parts.Clas2EditPart;
import components.diagram.edit.parts.ClasClasAttributesCompartment2EditPart;
import components.diagram.edit.parts.ClasClasAttributesCompartmentEditPart;
import components.diagram.edit.parts.ClasClasOperationsCompartment2EditPart;
import components.diagram.edit.parts.ClasClasOperationsCompartmentEditPart;
import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.CompositionEditPart;
import components.diagram.edit.parts.DependencyEditPart;
import components.diagram.edit.parts.EnumLiteralEditPart;
import components.diagram.edit.parts.Enumeration2EditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.EnumerationEnumerationLiteralsCompartment2EditPart;
import components.diagram.edit.parts.EnumerationEnumerationLiteralsCompartmentEditPart;
import components.diagram.edit.parts.GeneralizationEditPart;
import components.diagram.edit.parts.ImplementationEditPart;
import components.diagram.edit.parts.Interface2EditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.edit.parts.InterfaceInterfaceOperationsCompartment2EditPart;
import components.diagram.edit.parts.InterfaceInterfaceOperationsCompartmentEditPart;
import components.diagram.edit.parts.Method2EditPart;
import components.diagram.edit.parts.MethodEditPart;
import components.diagram.edit.parts.MethodMethodParameterCompartment2EditPart;
import components.diagram.edit.parts.MethodMethodParameterCompartmentEditPart;
import components.diagram.edit.parts.NoteEditPart;
import components.diagram.edit.parts.NoteLinkEditPart;
import components.diagram.edit.parts.Package2EditPart;
import components.diagram.edit.parts.PackageEditPart;
import components.diagram.edit.parts.PackagePackageElementsCompartment2EditPart;
import components.diagram.edit.parts.PackagePackageElementsCompartmentEditPart;
import components.diagram.edit.parts.ParameterEditPart;
import components.diagram.edit.parts.PropertyEditPart;
import components.diagram.edit.parts.UMLDiagramEditPart;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ComponentsDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getSemanticChildren(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getUMLDiagram_1000SemanticChildren(view);
		case PackagePackageElementsCompartmentEditPart.VISUAL_ID:
			return getPackagePackageElementsCompartment_7001SemanticChildren(view);
		case PackagePackageElementsCompartment2EditPart.VISUAL_ID:
			return getPackagePackageElementsCompartment_7002SemanticChildren(view);
		case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
			return getClasClasAttributesCompartment_7003SemanticChildren(view);
		case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
			return getClasClasOperationsCompartment_7004SemanticChildren(view);
		case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
			return getMethodMethodParameterCompartment_7005SemanticChildren(view);
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			return getInterfaceInterfaceOperationsCompartment_7006SemanticChildren(view);
		case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
			return getMethodMethodParameterCompartment_7007SemanticChildren(view);
		case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
			return getEnumerationEnumerationLiteralsCompartment_7008SemanticChildren(view);
		case ClasClasAttributesCompartment2EditPart.VISUAL_ID:
			return getClasClasAttributesCompartment_7009SemanticChildren(view);
		case ClasClasOperationsCompartment2EditPart.VISUAL_ID:
			return getClasClasOperationsCompartment_7010SemanticChildren(view);
		case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
			return getInterfaceInterfaceOperationsCompartment_7011SemanticChildren(view);
		case EnumerationEnumerationLiteralsCompartment2EditPart.VISUAL_ID:
			return getEnumerationEnumerationLiteralsCompartment_7012SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getUMLDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UMLDiagram modelElement = (UMLDiagram) view.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClasEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InterfaceEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnumerationEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNotes().iterator(); it.hasNext();) {
			Note childElement = (Note) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == NoteEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getPackagePackageElementsCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Clas2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Enumeration2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getPackagePackageElementsCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Clas2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Enumeration2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getClasClasAttributesCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clas modelElement = (Clas) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getClasClasOperationsCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clas modelElement = (Clas) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getMethodMethodParameterCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Method modelElement = (Method) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameter().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getInterfaceInterfaceOperationsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interface modelElement = (Interface) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getMethodMethodParameterCompartment_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Method modelElement = (Method) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameter().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getEnumerationEnumerationLiteralsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Enumeration modelElement = (Enumeration) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLiterals().iterator(); it.hasNext();) {
			EnumLiteral childElement = (EnumLiteral) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnumLiteralEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getClasClasAttributesCompartment_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clas modelElement = (Clas) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getClasClasOperationsCompartment_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clas modelElement = (Clas) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getInterfaceInterfaceOperationsCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interface modelElement = (Interface) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getEnumerationEnumerationLiteralsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Enumeration modelElement = (Enumeration) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLiterals().iterator(); it.hasNext();) {
			EnumLiteral childElement = (EnumLiteral) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnumLiteralEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsLinkDescriptor> getContainedLinks(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getUMLDiagram_1000ContainedLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001ContainedLinks(view);
		case ClasEditPart.VISUAL_ID:
			return getClas_2002ContainedLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2003ContainedLinks(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_2004ContainedLinks(view);
		case NoteEditPart.VISUAL_ID:
			return getNote_2005ContainedLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3001ContainedLinks(view);
		case Clas2EditPart.VISUAL_ID:
			return getClas_3002ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3003ContainedLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3004ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3005ContainedLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_3006ContainedLinks(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_3007ContainedLinks(view);
		case Enumeration2EditPart.VISUAL_ID:
			return getEnumeration_3008ContainedLinks(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3009ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001ContainedLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4004ContainedLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4005ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006ContainedLinks(view);
		case NoteLinkEditPart.VISUAL_ID:
			return getNoteLink_4007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ComponentsLinkDescriptor> getIncomingLinks(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001IncomingLinks(view);
		case ClasEditPart.VISUAL_ID:
			return getClas_2002IncomingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2003IncomingLinks(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_2004IncomingLinks(view);
		case NoteEditPart.VISUAL_ID:
			return getNote_2005IncomingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3001IncomingLinks(view);
		case Clas2EditPart.VISUAL_ID:
			return getClas_3002IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3003IncomingLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3004IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3005IncomingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_3006IncomingLinks(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_3007IncomingLinks(view);
		case Enumeration2EditPart.VISUAL_ID:
			return getEnumeration_3008IncomingLinks(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3009IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001IncomingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4004IncomingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4005IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006IncomingLinks(view);
		case NoteLinkEditPart.VISUAL_ID:
			return getNoteLink_4007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ComponentsLinkDescriptor> getOutgoingLinks(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001OutgoingLinks(view);
		case ClasEditPart.VISUAL_ID:
			return getClas_2002OutgoingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2003OutgoingLinks(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_2004OutgoingLinks(view);
		case NoteEditPart.VISUAL_ID:
			return getNote_2005OutgoingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_3001OutgoingLinks(view);
		case Clas2EditPart.VISUAL_ID:
			return getClas_3002OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3003OutgoingLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3004OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3005OutgoingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_3006OutgoingLinks(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_3007OutgoingLinks(view);
		case Enumeration2EditPart.VISUAL_ID:
			return getEnumeration_3008OutgoingLinks(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3009OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001OutgoingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4004OutgoingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4005OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006OutgoingLinks(view);
		case NoteLinkEditPart.VISUAL_ID:
			return getNoteLink_4007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getUMLDiagram_1000ContainedLinks(View view) {
		UMLDiagram modelElement = (UMLDiagram) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NoteLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getPackage_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getClas_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInterface_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumeration_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNote_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getPackage_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getClas_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getProperty_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getParameter_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInterface_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumeration_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumLiteral_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getGeneralization_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getImplementation_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAssociation_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAggregation_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComposition_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getDependency_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNoteLink_4007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getPackage_2001IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getClas_2002IncomingLinks(View view) {
		Clas modelElement = (Clas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInterface_2003IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumeration_2004IncomingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNote_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getPackage_3001IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getClas_3002IncomingLinks(View view) {
		Clas modelElement = (Clas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getProperty_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getParameter_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInterface_3006IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumeration_3008IncomingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumLiteral_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getGeneralization_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getImplementation_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAssociation_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAggregation_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComposition_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getDependency_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNoteLink_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getPackage_2001OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getClas_2002OutgoingLinks(View view) {
		Clas modelElement = (Clas) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInterface_2003OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumeration_2004OutgoingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNote_2005OutgoingLinks(View view) {
		Note modelElement = (Note) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NoteLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getPackage_3001OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getClas_3002OutgoingLinks(View view) {
		Clas modelElement = (Clas) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getProperty_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getParameter_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInterface_3006OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumeration_3008OutgoingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumLiteral_3009OutgoingLinks(View view) {
=======
import components.Parameter;
import components.Property;
import components.UMLDiagram;
import components.diagram.edit.parts.AggregationEditPart;
import components.diagram.edit.parts.AssociationEditPart;
import components.diagram.edit.parts.ClasClasAttributesCompartmentEditPart;
import components.diagram.edit.parts.ClasClasOperationsCompartmentEditPart;
import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.CompositionEditPart;
import components.diagram.edit.parts.DependencyEditPart;
import components.diagram.edit.parts.EnumLiteralEditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.EnumerationEnumerationLiteralsCompartmentEditPart;
import components.diagram.edit.parts.GeneralizationEditPart;
import components.diagram.edit.parts.ImplementationEditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.edit.parts.InterfaceInterfaceOperationsCompartmentEditPart;
import components.diagram.edit.parts.Method2EditPart;
import components.diagram.edit.parts.MethodEditPart;
import components.diagram.edit.parts.MethodMethodParameterCompartment2EditPart;
import components.diagram.edit.parts.MethodMethodParameterCompartmentEditPart;
import components.diagram.edit.parts.NoteEditPart;
import components.diagram.edit.parts.NoteLinkEditPart;
import components.diagram.edit.parts.ParameterEditPart;
import components.diagram.edit.parts.PropertyEditPart;
import components.diagram.edit.parts.UMLDiagramEditPart;
import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ComponentsDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getSemanticChildren(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getUMLDiagram_1000SemanticChildren(view);
		case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
			return getClasClasAttributesCompartment_7001SemanticChildren(view);
		case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
			return getClasClasOperationsCompartment_7002SemanticChildren(view);
		case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
			return getMethodMethodParameterCompartment_7003SemanticChildren(view);
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			return getInterfaceInterfaceOperationsCompartment_7004SemanticChildren(view);
		case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
			return getMethodMethodParameterCompartment_7005SemanticChildren(view);
		case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
			return getEnumerationEnumerationLiteralsCompartment_7006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getUMLDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UMLDiagram modelElement = (UMLDiagram) view.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClasEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InterfaceEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnumerationEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNotes().iterator(); it.hasNext();) {
			Note childElement = (Note) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == NoteEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getClasClasAttributesCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clas modelElement = (Clas) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getClasClasOperationsCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clas modelElement = (Clas) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getMethodMethodParameterCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Method modelElement = (Method) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameter().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getInterfaceInterfaceOperationsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interface modelElement = (Interface) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			Method childElement = (Method) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Method2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getMethodMethodParameterCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Method modelElement = (Method) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameter().iterator(); it.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsNodeDescriptor> getEnumerationEnumerationLiteralsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Enumeration modelElement = (Enumeration) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLiterals().iterator(); it.hasNext();) {
			EnumLiteral childElement = (EnumLiteral) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnumLiteralEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentsLinkDescriptor> getContainedLinks(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case UMLDiagramEditPart.VISUAL_ID:
			return getUMLDiagram_1000ContainedLinks(view);
		case ClasEditPart.VISUAL_ID:
			return getClas_2001ContainedLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2002ContainedLinks(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_2003ContainedLinks(view);
		case NoteEditPart.VISUAL_ID:
			return getNote_2004ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3001ContainedLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3002ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3003ContainedLinks(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_3004ContainedLinks(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3005ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001ContainedLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4004ContainedLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4005ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006ContainedLinks(view);
		case NoteLinkEditPart.VISUAL_ID:
			return getNoteLink_4007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ComponentsLinkDescriptor> getIncomingLinks(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case ClasEditPart.VISUAL_ID:
			return getClas_2001IncomingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2002IncomingLinks(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_2003IncomingLinks(view);
		case NoteEditPart.VISUAL_ID:
			return getNote_2004IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3001IncomingLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3002IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3003IncomingLinks(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_3004IncomingLinks(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3005IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001IncomingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4004IncomingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4005IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006IncomingLinks(view);
		case NoteLinkEditPart.VISUAL_ID:
			return getNoteLink_4007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ComponentsLinkDescriptor> getOutgoingLinks(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case ClasEditPart.VISUAL_ID:
			return getClas_2001OutgoingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2002OutgoingLinks(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_2003OutgoingLinks(view);
		case NoteEditPart.VISUAL_ID:
			return getNote_2004OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3001OutgoingLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3002OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3003OutgoingLinks(view);
		case Method2EditPart.VISUAL_ID:
			return getMethod_3004OutgoingLinks(view);
		case EnumLiteralEditPart.VISUAL_ID:
			return getEnumLiteral_3005OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001OutgoingLinks(view);
		case ImplementationEditPart.VISUAL_ID:
			return getImplementation_4002OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4004OutgoingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4005OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006OutgoingLinks(view);
		case NoteLinkEditPart.VISUAL_ID:
			return getNoteLink_4007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getUMLDiagram_1000ContainedLinks(View view) {
		UMLDiagram modelElement = (UMLDiagram) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NoteLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getClas_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInterface_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumeration_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNote_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getProperty_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getParameter_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumLiteral_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getGeneralization_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getImplementation_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAssociation_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAggregation_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComposition_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getDependency_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNoteLink_4007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getClas_2001IncomingLinks(View view) {
		Clas modelElement = (Clas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInterface_2002IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumeration_2003IncomingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Implementation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NoteLink_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNote_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getProperty_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getParameter_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumLiteral_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getGeneralization_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getImplementation_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAssociation_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAggregation_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComposition_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getDependency_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNoteLink_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getClas_2001OutgoingLinks(View view) {
		Clas modelElement = (Clas) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInterface_2002OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumeration_2003OutgoingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Implementation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNote_2004OutgoingLinks(View view) {
		Note modelElement = (Note) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NoteLink_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getProperty_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getParameter_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getEnumLiteral_3005OutgoingLinks(View view) {
>>>>>>> branch 'master' of https://github.com/uclmTFG/TFG.git
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getGeneralization_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getImplementation_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAssociation_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getAggregation_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComposition_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getDependency_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getNoteLink_4007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4001(
			UMLDiagram container) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Generalization_4001,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getContainedTypeModelFacetLinks_Implementation_4002(
			UMLDiagram container) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) linkObject;
			if (ImplementationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Implementation_4002,
					ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getContainedTypeModelFacetLinks_Association_4003(
			UMLDiagram container) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getContainedTypeModelFacetLinks_Aggregation_4004(
			UMLDiagram container) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Aggregation_4004,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getContainedTypeModelFacetLinks_Composition_4005(
			UMLDiagram container) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Composition_4005,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getContainedTypeModelFacetLinks_Dependency_4006(
			UMLDiagram container) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Dependency_4006,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getContainedTypeModelFacetLinks_NoteLink_4007(
			UMLDiagram container) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getNoteLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NoteLink) {
				continue;
			}
			NoteLink link = (NoteLink) linkObject;
			if (NoteLinkEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getElement();
			Note src = link.getNote();
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.NoteLink_4007,
					NoteLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4001(
			Classifier target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE.getRelationship_Target()
					|| false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, target, link, ComponentsElementTypes.Generalization_4001,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getIncomingTypeModelFacetLinks_Implementation_4002(
			Classifier target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE.getRelationship_Target()
					|| false == setting.getEObject() instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) setting.getEObject();
			if (ImplementationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, target, link, ComponentsElementTypes.Implementation_4002,
					ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4003(
			Classifier target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE.getRelationship_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, target, link, ComponentsElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getIncomingTypeModelFacetLinks_Aggregation_4004(
			Classifier target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE.getRelationship_Target()
					|| false == setting.getEObject() instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) setting.getEObject();
			if (AggregationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, target, link, ComponentsElementTypes.Aggregation_4004,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getIncomingTypeModelFacetLinks_Composition_4005(
			Classifier target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE.getRelationship_Target()
					|| false == setting.getEObject() instanceof Composition) {
				continue;
			}
			Composition link = (Composition) setting.getEObject();
			if (CompositionEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, target, link, ComponentsElementTypes.Composition_4005,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getIncomingTypeModelFacetLinks_Dependency_4006(
			Classifier target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE.getRelationship_Target()
					|| false == setting.getEObject() instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) setting.getEObject();
			if (DependencyEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier src = link.getSource();
			result.add(new ComponentsLinkDescriptor(src, target, link, ComponentsElementTypes.Dependency_4006,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getIncomingTypeModelFacetLinks_NoteLink_4007(Classifier target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE.getNoteLink_Element()
					|| false == setting.getEObject() instanceof NoteLink) {
				continue;
			}
			NoteLink link = (NoteLink) setting.getEObject();
			if (NoteLinkEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Note src = link.getNote();
			result.add(new ComponentsLinkDescriptor(src, target, link, ComponentsElementTypes.NoteLink_4007,
					NoteLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getOutgoingTypeModelFacetLinks_Generalization_4001(
			Classifier source) {
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
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Generalization_4001,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getOutgoingTypeModelFacetLinks_Implementation_4002(
			Classifier source) {
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
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implementation) {
				continue;
			}
			Implementation link = (Implementation) linkObject;
			if (ImplementationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Implementation_4002,
					ImplementationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4003(
			Classifier source) {
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
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getOutgoingTypeModelFacetLinks_Aggregation_4004(
			Classifier source) {
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
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Aggregation_4004,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getOutgoingTypeModelFacetLinks_Composition_4005(
			Classifier source) {
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
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Composition_4005,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getOutgoingTypeModelFacetLinks_Dependency_4006(
			Classifier source) {
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
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getTarget();
			Classifier src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.Dependency_4006,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentsLinkDescriptor> getOutgoingTypeModelFacetLinks_NoteLink_4007(Note source) {
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
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> links = container.getNoteLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NoteLink) {
				continue;
			}
			NoteLink link = (NoteLink) linkObject;
			if (NoteLinkEditPart.VISUAL_ID != ComponentsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getElement();
			Note src = link.getNote();
			if (src != source) {
				continue;
			}
			result.add(new ComponentsLinkDescriptor(src, dst, link, ComponentsElementTypes.NoteLink_4007,
					NoteLinkEditPart.VISUAL_ID));
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

		public List<ComponentsNodeDescriptor> getSemanticChildren(View view) {
			return ComponentsDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentsLinkDescriptor> getContainedLinks(View view) {
			return ComponentsDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentsLinkDescriptor> getIncomingLinks(View view) {
			return ComponentsDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentsLinkDescriptor> getOutgoingLinks(View view) {
			return ComponentsDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
