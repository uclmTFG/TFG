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

			case NodoUnoEditPart.VISUAL_ID:
				return new NodoUnoEditPart(view);

			case NodoUnoNombreEditPart.VISUAL_ID:
				return new NodoUnoNombreEditPart(view);

			case NodoDosEditPart.VISUAL_ID:
				return new NodoDosEditPart(view);

			case NodoDosNombreEditPart.VISUAL_ID:
				return new NodoDosNombreEditPart(view);

			case NodoDos2EditPart.VISUAL_ID:
				return new NodoDos2EditPart(view);

			case NodoDosNombre2EditPart.VISUAL_ID:
				return new NodoDosNombre2EditPart(view);

			case NodoUnoNodoUnoNodosDosCompartmentEditPart.VISUAL_ID:
				return new NodoUnoNodoUnoNodosDosCompartmentEditPart(view);

			case EnlaceEditPart.VISUAL_ID:
				return new EnlaceEditPart(view);

			case EnlaceTextoEditPart.VISUAL_ID:
				return new EnlaceTextoEditPart(view);

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
