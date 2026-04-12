/*
* 
*/
package mof.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import mof.MofPackage;
import mof.UMLDiagram;
import mof.diagram.edit.parts.AtributosMetodos2EditPart;
import mof.diagram.edit.parts.AtributosMetodosEditPart;
import mof.diagram.edit.parts.AtributosMetodosNombre2EditPart;
import mof.diagram.edit.parts.AtributosMetodosNombreEditPart;
import mof.diagram.edit.parts.EnlaceEditPart;
import mof.diagram.edit.parts.EnlaceTextoEditPart;
import mof.diagram.edit.parts.NodoDos2EditPart;
import mof.diagram.edit.parts.NodoDosEditPart;
import mof.diagram.edit.parts.NodoDosNombre2EditPart;
import mof.diagram.edit.parts.NodoDosNombreEditPart;
import mof.diagram.edit.parts.NodoUno2EditPart;
import mof.diagram.edit.parts.NodoUnoEditPart;
import mof.diagram.edit.parts.NodoUnoNombre2EditPart;
import mof.diagram.edit.parts.NodoUnoNombreEditPart;
import mof.diagram.edit.parts.Package2EditPart;
import mof.diagram.edit.parts.PackageEditPart;
import mof.diagram.edit.parts.PackageNombre2EditPart;
import mof.diagram.edit.parts.PackageNombreEditPart;
import mof.diagram.edit.parts.PackagePackageNodosCompartment2EditPart;
import mof.diagram.edit.parts.PackagePackageNodosCompartmentEditPart;
import mof.diagram.edit.parts.UMLDiagramEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MofVisualIDRegistry {

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
		return mof.diagram.part.MofVisualIDRegistry.getVisualID(view.getType());
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
				MofDiagramEditorPlugin.getInstance()
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
		if (MofPackage.eINSTANCE.getUMLDiagram().isSuperTypeOf(domainElement.eClass())
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
		String containerModelID = mof.diagram.part.MofVisualIDRegistry.getModelID(containerView);
		if (!UMLDiagramEditPart.MODEL_ID.equals(containerModelID) && !"mof".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (UMLDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mof.diagram.part.MofVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UMLDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UMLDiagramEditPart.VISUAL_ID:
			if (MofPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return PackageEditPart.VISUAL_ID;
			}
			if (MofPackage.eINSTANCE.getNodoUno().isSuperTypeOf(domainElement.eClass())) {
				return NodoUnoEditPart.VISUAL_ID;
			}
			if (MofPackage.eINSTANCE.getNodoDos().isSuperTypeOf(domainElement.eClass())) {
				return NodoDosEditPart.VISUAL_ID;
			}
			if (MofPackage.eINSTANCE.getAtributosMetodos().isSuperTypeOf(domainElement.eClass())) {
				return AtributosMetodosEditPart.VISUAL_ID;
			}
			break;
		case PackagePackageNodosCompartmentEditPart.VISUAL_ID:
			if (MofPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (MofPackage.eINSTANCE.getNodoUno().isSuperTypeOf(domainElement.eClass())) {
				return NodoUno2EditPart.VISUAL_ID;
			}
			if (MofPackage.eINSTANCE.getNodoDos().isSuperTypeOf(domainElement.eClass())) {
				return NodoDos2EditPart.VISUAL_ID;
			}
			if (MofPackage.eINSTANCE.getAtributosMetodos().isSuperTypeOf(domainElement.eClass())) {
				return AtributosMetodos2EditPart.VISUAL_ID;
			}
			break;
		case PackagePackageNodosCompartment2EditPart.VISUAL_ID:
			if (MofPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (MofPackage.eINSTANCE.getNodoUno().isSuperTypeOf(domainElement.eClass())) {
				return NodoUno2EditPart.VISUAL_ID;
			}
			if (MofPackage.eINSTANCE.getNodoDos().isSuperTypeOf(domainElement.eClass())) {
				return NodoDos2EditPart.VISUAL_ID;
			}
			if (MofPackage.eINSTANCE.getAtributosMetodos().isSuperTypeOf(domainElement.eClass())) {
				return AtributosMetodos2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mof.diagram.part.MofVisualIDRegistry.getModelID(containerView);
		if (!UMLDiagramEditPart.MODEL_ID.equals(containerModelID) && !"mof".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (UMLDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mof.diagram.part.MofVisualIDRegistry.getVisualID(containerView);
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
			if (NodoUnoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodoDosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributosMetodosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (PackageNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagePackageNodosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodoUnoEditPart.VISUAL_ID:
			if (NodoUnoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodoDosEditPart.VISUAL_ID:
			if (NodoDosNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributosMetodosEditPart.VISUAL_ID:
			if (AtributosMetodosNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Package2EditPart.VISUAL_ID:
			if (PackageNombre2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagePackageNodosCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodoUno2EditPart.VISUAL_ID:
			if (NodoUnoNombre2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodoDos2EditPart.VISUAL_ID:
			if (NodoDosNombre2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributosMetodos2EditPart.VISUAL_ID:
			if (AtributosMetodosNombre2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagePackageNodosCompartmentEditPart.VISUAL_ID:
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodoUno2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodoDos2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributosMetodos2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagePackageNodosCompartment2EditPart.VISUAL_ID:
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodoUno2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodoDos2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributosMetodos2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnlaceEditPart.VISUAL_ID:
			if (EnlaceTextoEditPart.VISUAL_ID == nodeVisualID) {
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
		if (MofPackage.eINSTANCE.getEnlace().isSuperTypeOf(domainElement.eClass())) {
			return EnlaceEditPart.VISUAL_ID;
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
		case PackagePackageNodosCompartmentEditPart.VISUAL_ID:
		case PackagePackageNodosCompartment2EditPart.VISUAL_ID:
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
		case NodoUnoEditPart.VISUAL_ID:
		case NodoDosEditPart.VISUAL_ID:
		case AtributosMetodosEditPart.VISUAL_ID:
		case NodoUno2EditPart.VISUAL_ID:
		case NodoDos2EditPart.VISUAL_ID:
		case AtributosMetodos2EditPart.VISUAL_ID:
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
			return mof.diagram.part.MofVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return mof.diagram.part.MofVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return mof.diagram.part.MofVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return mof.diagram.part.MofVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return mof.diagram.part.MofVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return mof.diagram.part.MofVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
