/*
 * 
 */
package components.diagram.providers;

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

import components.ComponentsPackage;
import components.diagram.edit.parts.AggregationEditPart;
import components.diagram.edit.parts.AssociationEditPart;
import components.diagram.edit.parts.Clas2EditPart;
import components.diagram.edit.parts.ClasEditPart;
import components.diagram.edit.parts.CompositionEditPart;
import components.diagram.edit.parts.DependencyEditPart;
import components.diagram.edit.parts.EnumLiteralEditPart;
import components.diagram.edit.parts.Enumeration2EditPart;
import components.diagram.edit.parts.EnumerationEditPart;
import components.diagram.edit.parts.GeneralizationEditPart;
import components.diagram.edit.parts.ImplementationEditPart;
import components.diagram.edit.parts.Interface2EditPart;
import components.diagram.edit.parts.InterfaceEditPart;
import components.diagram.edit.parts.Method2EditPart;
import components.diagram.edit.parts.MethodEditPart;
import components.diagram.edit.parts.NoteEditPart;
import components.diagram.edit.parts.NoteLinkEditPart;
import components.diagram.edit.parts.Package2EditPart;
import components.diagram.edit.parts.PackageEditPart;
import components.diagram.edit.parts.ParameterEditPart;
import components.diagram.edit.parts.PropertyEditPart;
import components.diagram.edit.parts.UMLDiagramEditPart;
import components.diagram.part.ComponentsDiagramEditorPlugin;

/**
 * @generated
 */
public class ComponentsElementTypes {

	/**
	* @generated
	*/
	private ComponentsElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ComponentsDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

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
	public static final IElementType Package_2001 = getElementType("tfg.diagram.Package_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clas_2002 = getElementType("tfg.diagram.Clas_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Interface_2003 = getElementType("tfg.diagram.Interface_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Enumeration_2004 = getElementType("tfg.diagram.Enumeration_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Note_2005 = getElementType("tfg.diagram.Note_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Package_3001 = getElementType("tfg.diagram.Package_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clas_3002 = getElementType("tfg.diagram.Clas_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Property_3003 = getElementType("tfg.diagram.Property_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Method_3004 = getElementType("tfg.diagram.Method_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parameter_3005 = getElementType("tfg.diagram.Parameter_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Interface_3006 = getElementType("tfg.diagram.Interface_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Method_3007 = getElementType("tfg.diagram.Method_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Enumeration_3008 = getElementType("tfg.diagram.Enumeration_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EnumLiteral_3009 = getElementType("tfg.diagram.EnumLiteral_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Generalization_4001 = getElementType("tfg.diagram.Generalization_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Implementation_4002 = getElementType("tfg.diagram.Implementation_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Association_4003 = getElementType("tfg.diagram.Association_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregation_4004 = getElementType("tfg.diagram.Aggregation_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Composition_4005 = getElementType("tfg.diagram.Composition_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Dependency_4006 = getElementType("tfg.diagram.Dependency_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NoteLink_4007 = getElementType("tfg.diagram.NoteLink_4007"); //$NON-NLS-1$

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

			elements.put(UMLDiagram_1000, ComponentsPackage.eINSTANCE.getUMLDiagram());

			elements.put(Package_2001, ComponentsPackage.eINSTANCE.getPackage());

			elements.put(Clas_2002, ComponentsPackage.eINSTANCE.getClas());

			elements.put(Interface_2003, ComponentsPackage.eINSTANCE.getInterface());

			elements.put(Enumeration_2004, ComponentsPackage.eINSTANCE.getEnumeration());

			elements.put(Note_2005, ComponentsPackage.eINSTANCE.getNote());

			elements.put(Package_3001, ComponentsPackage.eINSTANCE.getPackage());

			elements.put(Clas_3002, ComponentsPackage.eINSTANCE.getClas());

			elements.put(Property_3003, ComponentsPackage.eINSTANCE.getProperty());

			elements.put(Method_3004, ComponentsPackage.eINSTANCE.getMethod());

			elements.put(Parameter_3005, ComponentsPackage.eINSTANCE.getParameter());

			elements.put(Interface_3006, ComponentsPackage.eINSTANCE.getInterface());

			elements.put(Method_3007, ComponentsPackage.eINSTANCE.getMethod());

			elements.put(Enumeration_3008, ComponentsPackage.eINSTANCE.getEnumeration());

			elements.put(EnumLiteral_3009, ComponentsPackage.eINSTANCE.getEnumLiteral());

			elements.put(Generalization_4001, ComponentsPackage.eINSTANCE.getGeneralization());

			elements.put(Implementation_4002, ComponentsPackage.eINSTANCE.getImplementation());

			elements.put(Association_4003, ComponentsPackage.eINSTANCE.getAssociation());

			elements.put(Aggregation_4004, ComponentsPackage.eINSTANCE.getAggregation());

			elements.put(Composition_4005, ComponentsPackage.eINSTANCE.getComposition());

			elements.put(Dependency_4006, ComponentsPackage.eINSTANCE.getDependency());

			elements.put(NoteLink_4007, ComponentsPackage.eINSTANCE.getNoteLink());
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
			KNOWN_ELEMENT_TYPES.add(Package_2001);
			KNOWN_ELEMENT_TYPES.add(Clas_2002);
			KNOWN_ELEMENT_TYPES.add(Interface_2003);
			KNOWN_ELEMENT_TYPES.add(Enumeration_2004);
			KNOWN_ELEMENT_TYPES.add(Note_2005);
			KNOWN_ELEMENT_TYPES.add(Package_3001);
			KNOWN_ELEMENT_TYPES.add(Clas_3002);
			KNOWN_ELEMENT_TYPES.add(Property_3003);
			KNOWN_ELEMENT_TYPES.add(Method_3004);
			KNOWN_ELEMENT_TYPES.add(Parameter_3005);
			KNOWN_ELEMENT_TYPES.add(Interface_3006);
			KNOWN_ELEMENT_TYPES.add(Method_3007);
			KNOWN_ELEMENT_TYPES.add(Enumeration_3008);
			KNOWN_ELEMENT_TYPES.add(EnumLiteral_3009);
			KNOWN_ELEMENT_TYPES.add(Generalization_4001);
			KNOWN_ELEMENT_TYPES.add(Implementation_4002);
			KNOWN_ELEMENT_TYPES.add(Association_4003);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4004);
			KNOWN_ELEMENT_TYPES.add(Composition_4005);
			KNOWN_ELEMENT_TYPES.add(Dependency_4006);
			KNOWN_ELEMENT_TYPES.add(NoteLink_4007);
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
		case PackageEditPart.VISUAL_ID:
			return Package_2001;
		case ClasEditPart.VISUAL_ID:
			return Clas_2002;
		case InterfaceEditPart.VISUAL_ID:
			return Interface_2003;
		case EnumerationEditPart.VISUAL_ID:
			return Enumeration_2004;
		case NoteEditPart.VISUAL_ID:
			return Note_2005;
		case Package2EditPart.VISUAL_ID:
			return Package_3001;
		case Clas2EditPart.VISUAL_ID:
			return Clas_3002;
		case PropertyEditPart.VISUAL_ID:
			return Property_3003;
		case MethodEditPart.VISUAL_ID:
			return Method_3004;
		case ParameterEditPart.VISUAL_ID:
			return Parameter_3005;
		case Interface2EditPart.VISUAL_ID:
			return Interface_3006;
		case Method2EditPart.VISUAL_ID:
			return Method_3007;
		case Enumeration2EditPart.VISUAL_ID:
			return Enumeration_3008;
		case EnumLiteralEditPart.VISUAL_ID:
			return EnumLiteral_3009;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_4001;
		case ImplementationEditPart.VISUAL_ID:
			return Implementation_4002;
		case AssociationEditPart.VISUAL_ID:
			return Association_4003;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_4004;
		case CompositionEditPart.VISUAL_ID:
			return Composition_4005;
		case DependencyEditPart.VISUAL_ID:
			return Dependency_4006;
		case NoteLinkEditPart.VISUAL_ID:
			return NoteLink_4007;
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
			return components.diagram.providers.ComponentsElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return components.diagram.providers.ComponentsElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return components.diagram.providers.ComponentsElementTypes.getElement(elementTypeAdapter);
		}
	};

}
