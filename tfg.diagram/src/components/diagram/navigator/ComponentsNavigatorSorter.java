/*
* 
*/
package components.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import components.diagram.part.ComponentsVisualIDRegistry;

/**
 * @generated
 */
public class ComponentsNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7008;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7007;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ComponentsNavigatorItem) {
			ComponentsNavigatorItem item = (ComponentsNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ComponentsVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
