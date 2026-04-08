/*
 * 
 */
package components.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import components.diagram.edit.parts.ComponentsEditPartFactory;
import components.diagram.edit.parts.UMLDiagramEditPart;
import components.diagram.part.ComponentsVisualIDRegistry;

/**
 * @generated
 */
public class ComponentsEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ComponentsEditPartProvider() {
		super(new ComponentsEditPartFactory(), ComponentsVisualIDRegistry.TYPED_INSTANCE, UMLDiagramEditPart.MODEL_ID);
	}

}
