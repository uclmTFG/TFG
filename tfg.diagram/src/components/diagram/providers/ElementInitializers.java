/*
 * 
 */
package components.diagram.providers;

import components.diagram.part.ComponentsDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ComponentsDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ComponentsDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
