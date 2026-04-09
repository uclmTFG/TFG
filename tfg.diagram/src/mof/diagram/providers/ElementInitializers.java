/*
 * 
 */
package mof.diagram.providers;

import mof.diagram.part.MofDiagramEditorPlugin;

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
		ElementInitializers cached = MofDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			MofDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
