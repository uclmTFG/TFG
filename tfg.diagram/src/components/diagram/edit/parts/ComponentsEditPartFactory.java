/*
 * 
 */
package components.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import components.diagram.part.ComponentsVisualIDRegistry;

/**
 * @generated
 */
public class ComponentsEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ComponentsVisualIDRegistry.getVisualID(view)) {

			case UMLDiagramEditPart.VISUAL_ID:
				return new UMLDiagramEditPart(view);

<<<<<<< HEAD
			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case PackageNameEditPart.VISUAL_ID:
				return new PackageNameEditPart(view);

			case ClasEditPart.VISUAL_ID:
				return new ClasEditPart(view);

			case ClasNameEditPart.VISUAL_ID:
				return new ClasNameEditPart(view);

			case InterfaceEditPart.VISUAL_ID:
				return new InterfaceEditPart(view);

			case InterfaceNameEditPart.VISUAL_ID:
				return new InterfaceNameEditPart(view);

			case EnumerationEditPart.VISUAL_ID:
				return new EnumerationEditPart(view);

			case EnumerationNameEditPart.VISUAL_ID:
				return new EnumerationNameEditPart(view);

			case NoteEditPart.VISUAL_ID:
				return new NoteEditPart(view);

			case NoteTextEditPart.VISUAL_ID:
				return new NoteTextEditPart(view);

			case Package2EditPart.VISUAL_ID:
				return new Package2EditPart(view);

			case PackageName2EditPart.VISUAL_ID:
				return new PackageName2EditPart(view);

			case Clas2EditPart.VISUAL_ID:
				return new Clas2EditPart(view);

			case ClasName2EditPart.VISUAL_ID:
				return new ClasName2EditPart(view);

			case PropertyEditPart.VISUAL_ID:
				return new PropertyEditPart(view);

			case PropertyVisibilityNameTypeEditPart.VISUAL_ID:
				return new PropertyVisibilityNameTypeEditPart(view);

			case MethodEditPart.VISUAL_ID:
				return new MethodEditPart(view);

			case MethodVisibilityNameReturnTypEditPart.VISUAL_ID:
				return new MethodVisibilityNameReturnTypEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ParameterNameTypeEditPart.VISUAL_ID:
				return new ParameterNameTypeEditPart(view);

			case Interface2EditPart.VISUAL_ID:
				return new Interface2EditPart(view);

			case InterfaceName2EditPart.VISUAL_ID:
				return new InterfaceName2EditPart(view);

			case Method2EditPart.VISUAL_ID:
				return new Method2EditPart(view);

			case MethodVisibilityNameReturnTyp2EditPart.VISUAL_ID:
				return new MethodVisibilityNameReturnTyp2EditPart(view);

			case Enumeration2EditPart.VISUAL_ID:
				return new Enumeration2EditPart(view);

			case EnumerationName2EditPart.VISUAL_ID:
				return new EnumerationName2EditPart(view);

			case EnumLiteralEditPart.VISUAL_ID:
				return new EnumLiteralEditPart(view);

			case EnumLiteralNameEditPart.VISUAL_ID:
				return new EnumLiteralNameEditPart(view);

			case PackagePackageElementsCompartmentEditPart.VISUAL_ID:
				return new PackagePackageElementsCompartmentEditPart(view);

			case PackagePackageElementsCompartment2EditPart.VISUAL_ID:
				return new PackagePackageElementsCompartment2EditPart(view);

			case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
				return new ClasClasAttributesCompartmentEditPart(view);

			case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
				return new ClasClasOperationsCompartmentEditPart(view);

			case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
				return new MethodMethodParameterCompartmentEditPart(view);

			case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
				return new InterfaceInterfaceOperationsCompartmentEditPart(view);

			case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
				return new MethodMethodParameterCompartment2EditPart(view);

			case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
				return new EnumerationEnumerationLiteralsCompartmentEditPart(view);

			case ClasClasAttributesCompartment2EditPart.VISUAL_ID:
				return new ClasClasAttributesCompartment2EditPart(view);

			case ClasClasOperationsCompartment2EditPart.VISUAL_ID:
				return new ClasClasOperationsCompartment2EditPart(view);

			case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
				return new InterfaceInterfaceOperationsCompartment2EditPart(view);

			case EnumerationEnumerationLiteralsCompartment2EditPart.VISUAL_ID:
				return new EnumerationEnumerationLiteralsCompartment2EditPart(view);
=======
			case ClasEditPart.VISUAL_ID:
				return new ClasEditPart(view);

			case ClasNameEditPart.VISUAL_ID:
				return new ClasNameEditPart(view);

			case InterfaceEditPart.VISUAL_ID:
				return new InterfaceEditPart(view);

			case InterfaceNameEditPart.VISUAL_ID:
				return new InterfaceNameEditPart(view);

			case EnumerationEditPart.VISUAL_ID:
				return new EnumerationEditPart(view);

			case EnumerationNameEditPart.VISUAL_ID:
				return new EnumerationNameEditPart(view);

			case NoteEditPart.VISUAL_ID:
				return new NoteEditPart(view);

			case NoteTextEditPart.VISUAL_ID:
				return new NoteTextEditPart(view);

			case PropertyEditPart.VISUAL_ID:
				return new PropertyEditPart(view);

			case PropertyVisibilityNameTypeEditPart.VISUAL_ID:
				return new PropertyVisibilityNameTypeEditPart(view);

			case MethodEditPart.VISUAL_ID:
				return new MethodEditPart(view);

			case MethodVisibilityNameReturnTypEditPart.VISUAL_ID:
				return new MethodVisibilityNameReturnTypEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ParameterNameTypeEditPart.VISUAL_ID:
				return new ParameterNameTypeEditPart(view);

			case Method2EditPart.VISUAL_ID:
				return new Method2EditPart(view);

			case MethodVisibilityNameReturnTyp2EditPart.VISUAL_ID:
				return new MethodVisibilityNameReturnTyp2EditPart(view);

			case EnumLiteralEditPart.VISUAL_ID:
				return new EnumLiteralEditPart(view);

			case EnumLiteralNameEditPart.VISUAL_ID:
				return new EnumLiteralNameEditPart(view);

			case ClasClasAttributesCompartmentEditPart.VISUAL_ID:
				return new ClasClasAttributesCompartmentEditPart(view);

			case ClasClasOperationsCompartmentEditPart.VISUAL_ID:
				return new ClasClasOperationsCompartmentEditPart(view);

			case MethodMethodParameterCompartmentEditPart.VISUAL_ID:
				return new MethodMethodParameterCompartmentEditPart(view);

			case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
				return new InterfaceInterfaceOperationsCompartmentEditPart(view);

			case MethodMethodParameterCompartment2EditPart.VISUAL_ID:
				return new MethodMethodParameterCompartment2EditPart(view);

			case EnumerationEnumerationLiteralsCompartmentEditPart.VISUAL_ID:
				return new EnumerationEnumerationLiteralsCompartmentEditPart(view);
>>>>>>> branch 'master' of https://github.com/uclmTFG/TFG.git

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case ImplementationEditPart.VISUAL_ID:
				return new ImplementationEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case AssociationRoleEditPart.VISUAL_ID:
				return new AssociationRoleEditPart(view);

			case AggregationEditPart.VISUAL_ID:
				return new AggregationEditPart(view);

			case CompositionEditPart.VISUAL_ID:
				return new CompositionEditPart(view);

			case DependencyEditPart.VISUAL_ID:
				return new DependencyEditPart(view);

			case NoteLinkEditPart.VISUAL_ID:
				return new NoteLinkEditPart(view);

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
