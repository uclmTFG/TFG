/*
* 
*/
package components.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import components.ComponentsPackage;
import components.UMLDiagram;
import components.diagram.edit.parts.AggregationEditPart;
import components.diagram.edit.parts.AssociationEditPart;
import components.diagram.edit.parts.AssociationRoleEditPart;
<<<<<<< HEAD
import components.diagram.edit.parts.Clas2EditPart;
import components.diagram.edit.parts.ClasClasAttributesCompartment2EditPart;
import components.diagram.edit.parts.ClasClasAttributesCompartmentEditPart;
import components.diagram.edit.parts.ClasClasOperationsCompartment2EditPart;
import components.diagram.edit.parts.ClasClasOperationsCompartmentEditPart;
import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.ClasName2EditPart;
import components.diagram.edit.parts.ClasNameEditPart;
import components.diagram.edit.parts.CompositionEditPart;
import components.diagram.edit.parts.DependencyEditPart;
import components.diagram.edit.parts.EnumLiteralEditPart;
import components.diagram.edit.parts.EnumLiteralNameEditPart;
import components.diagram.edit.parts.Enumeration2EditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.EnumerationEnumerationLiteralsCompartment2EditPart;
import components.diagram.edit.parts.EnumerationEnumerationLiteralsCompartmentEditPart;
import components.diagram.edit.parts.EnumerationName2EditPart;
import components.diagram.edit.parts.EnumerationNameEditPart;
import components.diagram.edit.parts.GeneralizationEditPart;
import components.diagram.edit.parts.ImplementationEditPart;
import components.diagram.edit.parts.Interface2EditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.edit.parts.InterfaceInterfaceOperationsCompartment2EditPart;
import components.diagram.edit.parts.InterfaceInterfaceOperationsCompartmentEditPart;
import components.diagram.edit.parts.InterfaceName2EditPart;
import components.diagram.edit.parts.InterfaceNameEditPart;
import components.diagram.edit.parts.Method2EditPart;
import components.diagram.edit.parts.MethodEditPart;
import components.diagram.edit.parts.MethodMethodParameterCompartment2EditPart;
import components.diagram.edit.parts.MethodMethodParameterCompartmentEditPart;
import components.diagram.edit.parts.MethodVisibilityNameReturnTyp2EditPart;
import components.diagram.edit.parts.MethodVisibilityNameReturnTypEditPart;
import components.diagram.edit.parts.NoteEditPart;
import components.diagram.edit.parts.NoteLinkEditPart;
import components.diagram.edit.parts.NoteTextEditPart;
import components.diagram.edit.parts.Package2EditPart;
import components.diagram.edit.parts.PackageEditPart;
import components.diagram.edit.parts.PackageName2EditPart;
import components.diagram.edit.parts.PackageNameEditPart;
import components.diagram.edit.parts.PackagePackageElementsCompartment2EditPart;
import components.diagram.edit.parts.PackagePackageElementsCompartmentEditPart;
import components.diagram.edit.parts.ParameterEditPart;
import components.diagram.edit.parts.ParameterNameTypeEditPart;
import components.diagram.edit.parts.PropertyEditPart;
import components.diagram.edit.parts.PropertyVisibilityNameTypeEditPart;
import components.diagram.edit.parts.UMLDiagramEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ComponentsVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "tfg.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UMLDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return UMLDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return components.diagram.part.ComponentsVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ComponentsDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getUMLDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((UMLDiagram) domainElement)) {
			return UMLDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = components.diagram.part.ComponentsVisualIDRegistry.getModelID(containerView);
		if (!UMLDiagramEditPart.MODEL_ID.equals(containerModelID) && !"components".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (UMLDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = components.diagram.part.ComponentsVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UMLDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UMLDiagramEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return PackageEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getClas().isSuperTypeOf(domainElement.eClass())) {
				return ClasEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
				return InterfaceEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
				return EnumerationEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getNote().isSuperTypeOf(domainElement.eClass())) {
				return NoteEditPart.VISUAL_ID;
			}
			break;
		case PackagePackageElementsCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getClas().isSuperTypeOf(domainElement.eClass())) {
				return Clas2EditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
				return Interface2EditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
				return Enumeration2EditPart.VISUAL_ID;
			}
			break;
		case PackagePackageElementsCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getClas().isSuperTypeOf(domainElement.eClass())) {
				return Clas2EditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
				return Interface2EditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
				return Enumeration2EditPart.VISUAL_ID;
			}
			break;
		case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getMethod().isSuperTypeOf(domainElement.eClass())) {
				return MethodEditPart.VISUAL_ID;
			}
			break;
		case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getMethod().isSuperTypeOf(domainElement.eClass())) {
				return Method2EditPart.VISUAL_ID;
			}
			break;
		case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getEnumLiteral().isSuperTypeOf(domainElement.eClass())) {
				return EnumLiteralEditPart.VISUAL_ID;
			}
			break;
		case ClasClasAttributesCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case ClasClasOperationsCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getMethod().isSuperTypeOf(domainElement.eClass())) {
				return MethodEditPart.VISUAL_ID;
			}
			break;
		case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getMethod().isSuperTypeOf(domainElement.eClass())) {
				return Method2EditPart.VISUAL_ID;
			}
			break;
		case EnumerationEnumerationLiteralsCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getEnumLiteral().isSuperTypeOf(domainElement.eClass())) {
				return EnumLiteralEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = components.diagram.part.ComponentsVisualIDRegistry.getModelID(containerView);
		if (!UMLDiagramEditPart.MODEL_ID.equals(containerModelID) && !"components".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (UMLDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = components.diagram.part.ComponentsVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UMLDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UMLDiagramEditPart.VISUAL_ID:
			if (PackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagePackageElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClasEditPart.VISUAL_ID:
			if (ClasNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClasClasAttributesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClasClasOperationsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceEditPart.VISUAL_ID:
			if (InterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationEditPart.VISUAL_ID:
			if (EnumerationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationEnumerationLiteralsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NoteEditPart.VISUAL_ID:
			if (NoteTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Package2EditPart.VISUAL_ID:
			if (PackageName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagePackageElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clas2EditPart.VISUAL_ID:
			if (ClasName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClasClasAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClasClasOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyEditPart.VISUAL_ID:
			if (PropertyVisibilityNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodEditPart.VISUAL_ID:
			if (MethodVisibilityNameReturnTypEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MethodMethodParameterCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterEditPart.VISUAL_ID:
			if (ParameterNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Interface2EditPart.VISUAL_ID:
			if (InterfaceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Method2EditPart.VISUAL_ID:
			if (MethodVisibilityNameReturnTyp2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MethodMethodParameterCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Enumeration2EditPart.VISUAL_ID:
			if (EnumerationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumLiteralEditPart.VISUAL_ID:
			if (EnumLiteralNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagePackageElementsCompartmentEditPart.VISUAL_ID:
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Clas2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Interface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Enumeration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagePackageElementsCompartment2EditPart.VISUAL_ID:
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Clas2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Interface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Enumeration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
			if (MethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			if (Method2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
			if (EnumLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClasClasAttributesCompartment2EditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClasClasOperationsCompartment2EditPart.VISUAL_ID:
			if (MethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
			if (Method2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationEnumerationLiteralsCompartment2EditPart.VISUAL_ID:
			if (EnumLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getImplementation().isSuperTypeOf(domainElement.eClass())) {
			return ImplementationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getAggregation().isSuperTypeOf(domainElement.eClass())) {
			return AggregationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getComposition().isSuperTypeOf(domainElement.eClass())) {
			return CompositionEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElement.eClass())) {
			return DependencyEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getNoteLink().isSuperTypeOf(domainElement.eClass())) {
			return NoteLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(UMLDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case PackagePackageElementsCompartmentEditPart.VISUAL_ID:
		case PackagePackageElementsCompartment2EditPart.VISUAL_ID:
		case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
		case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
		case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
		case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
		case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
		case ClasClasAttributesCompartment2EditPart.VISUAL_ID:
		case ClasClasOperationsCompartment2EditPart.VISUAL_ID:
		case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
		case EnumerationEnumerationLiteralsCompartment2EditPart.VISUAL_ID:
=======
import components.diagram.edit.parts.ClasClasAttributesCompartmentEditPart;
import components.diagram.edit.parts.ClasClasOperationsCompartmentEditPart;
import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.ClasNameEditPart;
import components.diagram.edit.parts.CompositionEditPart;
import components.diagram.edit.parts.DependencyEditPart;
import components.diagram.edit.parts.EnumLiteralEditPart;
import components.diagram.edit.parts.EnumLiteralNameEditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.EnumerationEnumerationLiteralsCompartmentEditPart;
import components.diagram.edit.parts.EnumerationNameEditPart;
import components.diagram.edit.parts.GeneralizationEditPart;
import components.diagram.edit.parts.ImplementationEditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.edit.parts.InterfaceInterfaceOperationsCompartmentEditPart;
import components.diagram.edit.parts.InterfaceNameEditPart;
import components.diagram.edit.parts.Method2EditPart;
import components.diagram.edit.parts.MethodEditPart;
import components.diagram.edit.parts.MethodMethodParameterCompartment2EditPart;
import components.diagram.edit.parts.MethodMethodParameterCompartmentEditPart;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ComponentsVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "tfg.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UMLDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return UMLDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return components.diagram.part.ComponentsVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ComponentsDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getUMLDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((UMLDiagram) domainElement)) {
			return UMLDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = components.diagram.part.ComponentsVisualIDRegistry.getModelID(containerView);
		if (!UMLDiagramEditPart.MODEL_ID.equals(containerModelID) && !"components".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (UMLDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = components.diagram.part.ComponentsVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UMLDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UMLDiagramEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getClas().isSuperTypeOf(domainElement.eClass())) {
				return ClasEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
				return InterfaceEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
				return EnumerationEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getNote().isSuperTypeOf(domainElement.eClass())) {
				return NoteEditPart.VISUAL_ID;
			}
			break;
		case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getMethod().isSuperTypeOf(domainElement.eClass())) {
				return MethodEditPart.VISUAL_ID;
			}
			break;
		case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getMethod().isSuperTypeOf(domainElement.eClass())) {
				return Method2EditPart.VISUAL_ID;
			}
			break;
		case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getEnumLiteral().isSuperTypeOf(domainElement.eClass())) {
				return EnumLiteralEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = components.diagram.part.ComponentsVisualIDRegistry.getModelID(containerView);
		if (!UMLDiagramEditPart.MODEL_ID.equals(containerModelID) && !"components".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (UMLDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = components.diagram.part.ComponentsVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UMLDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UMLDiagramEditPart.VISUAL_ID:
			if (ClasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClasEditPart.VISUAL_ID:
			if (ClasNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClasClasAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClasClasOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceEditPart.VISUAL_ID:
			if (InterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationEditPart.VISUAL_ID:
			if (EnumerationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NoteEditPart.VISUAL_ID:
			if (NoteTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyEditPart.VISUAL_ID:
			if (PropertyVisibilityNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodEditPart.VISUAL_ID:
			if (MethodVisibilityNameReturnTypEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MethodMethodParameterCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterEditPart.VISUAL_ID:
			if (ParameterNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Method2EditPart.VISUAL_ID:
			if (MethodVisibilityNameReturnTyp2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MethodMethodParameterCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumLiteralEditPart.VISUAL_ID:
			if (EnumLiteralNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
			if (MethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			if (Method2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
			if (EnumLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getImplementation().isSuperTypeOf(domainElement.eClass())) {
			return ImplementationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getAggregation().isSuperTypeOf(domainElement.eClass())) {
			return AggregationEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getComposition().isSuperTypeOf(domainElement.eClass())) {
			return CompositionEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElement.eClass())) {
			return DependencyEditPart.VISUAL_ID;
		}
		if (ComponentsPackage.eINSTANCE.getNoteLink().isSuperTypeOf(domainElement.eClass())) {
			return NoteLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(UMLDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
		case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
		case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
		case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
		case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
>>>>>>> branch 'master' of https://github.com/uclmTFG/TFG.git
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case UMLDiagramEditPart.VISUAL_ID:
			return false;
		case NoteEditPart.VISUAL_ID:
		case PropertyEditPart.VISUAL_ID:
		case ParameterEditPart.VISUAL_ID:
		case EnumLiteralEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return components.diagram.part.ComponentsVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return components.diagram.part.ComponentsVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return components.diagram.part.ComponentsVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return components.diagram.part.ComponentsVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return components.diagram.part.ComponentsVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return components.diagram.part.ComponentsVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
