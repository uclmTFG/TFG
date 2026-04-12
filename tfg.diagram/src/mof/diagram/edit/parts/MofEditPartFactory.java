/*
 * 
 */
package mof.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import mof.diagram.part.MofVisualIDRegistry;

/**
 * @generated
 */
public class MofEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MofVisualIDRegistry.getVisualID(view)) {

			case UMLDiagramEditPart.VISUAL_ID:
				return new UMLDiagramEditPart(view);

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case PackageNombreEditPart.VISUAL_ID:
				return new PackageNombreEditPart(view);

			case NodoUnoEditPart.VISUAL_ID:
				return new NodoUnoEditPart(view);

			case NodoUnoNombreEditPart.VISUAL_ID:
				return new NodoUnoNombreEditPart(view);

			case NodoDosEditPart.VISUAL_ID:
				return new NodoDosEditPart(view);

			case NodoDosNombreEditPart.VISUAL_ID:
				return new NodoDosNombreEditPart(view);

			case AtributosMetodosEditPart.VISUAL_ID:
				return new AtributosMetodosEditPart(view);

			case AtributosMetodosNombreEditPart.VISUAL_ID:
				return new AtributosMetodosNombreEditPart(view);

			case Package2EditPart.VISUAL_ID:
				return new Package2EditPart(view);

			case PackageNombre2EditPart.VISUAL_ID:
				return new PackageNombre2EditPart(view);

			case NodoUno2EditPart.VISUAL_ID:
				return new NodoUno2EditPart(view);

			case NodoUnoNombre2EditPart.VISUAL_ID:
				return new NodoUnoNombre2EditPart(view);

			case NodoDos2EditPart.VISUAL_ID:
				return new NodoDos2EditPart(view);

			case NodoDosNombre2EditPart.VISUAL_ID:
				return new NodoDosNombre2EditPart(view);

			case AtributosMetodos2EditPart.VISUAL_ID:
				return new AtributosMetodos2EditPart(view);

			case AtributosMetodosNombre2EditPart.VISUAL_ID:
				return new AtributosMetodosNombre2EditPart(view);

			case PackagePackageNodosCompartmentEditPart.VISUAL_ID:
				return new PackagePackageNodosCompartmentEditPart(view);

			case PackagePackageNodosCompartment2EditPart.VISUAL_ID:
				return new PackagePackageNodosCompartment2EditPart(view);

			case EnlaceEditPart.VISUAL_ID:
				return new EnlaceEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
