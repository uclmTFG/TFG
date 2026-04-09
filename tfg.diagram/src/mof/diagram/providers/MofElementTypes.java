/*
 * 
 */
package mof.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import mof.MofPackage;
import mof.diagram.edit.parts.EnlaceEditPart;
import mof.diagram.edit.parts.NodoEditPart;
import mof.diagram.edit.parts.UMLDiagramEditPart;
import mof.diagram.part.MofDiagramEditorPlugin;

/**
 * @generated
 */
public class MofElementTypes {

	/**
	* @generated
	*/
	private MofElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MofDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType UMLDiagram_1000 = getElementType("tfg.diagram.UMLDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Nodo_2001 = getElementType("tfg.diagram.Nodo_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Enlace_4001 = getElementType("tfg.diagram.Enlace_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UMLDiagram_1000, MofPackage.eINSTANCE.getUMLDiagram());

			elements.put(Nodo_2001, MofPackage.eINSTANCE.getNodo());

			elements.put(Enlace_4001, MofPackage.eINSTANCE.getEnlace());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UMLDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Nodo_2001);
			KNOWN_ELEMENT_TYPES.add(Enlace_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UMLDiagramEditPart.VISUAL_ID:
			return UMLDiagram_1000;
		case NodoEditPart.VISUAL_ID:
			return Nodo_2001;
		case EnlaceEditPart.VISUAL_ID:
			return Enlace_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return mof.diagram.providers.MofElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return mof.diagram.providers.MofElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return mof.diagram.providers.MofElementTypes.getElement(elementTypeAdapter);
		}
	};

}
