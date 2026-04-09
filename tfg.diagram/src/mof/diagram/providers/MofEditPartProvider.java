/*
 * 
 */
package mof.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import mof.diagram.edit.parts.MofEditPartFactory;
import mof.diagram.edit.parts.UMLDiagramEditPart;
import mof.diagram.part.MofVisualIDRegistry;

/**
 * @generated
 */
public class MofEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public MofEditPartProvider() {
		super(new MofEditPartFactory(), MofVisualIDRegistry.TYPED_INSTANCE, UMLDiagramEditPart.MODEL_ID);
	}

}
