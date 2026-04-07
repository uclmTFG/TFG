/*
 * 
 */
package components.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import components.ComponentsPackage;
import components.diagram.edit.parts.AssociationRoleEditPart;
import components.diagram.edit.parts.ClasNameEditPart;
import components.diagram.edit.parts.EnumLiteralNameEditPart;
import components.diagram.edit.parts.EnumerationNameEditPart;
import components.diagram.edit.parts.InterfaceNameEditPart;
import components.diagram.edit.parts.MethodVisibilityNameReturnTyp2EditPart;
import components.diagram.edit.parts.MethodVisibilityNameReturnTypEditPart;
import components.diagram.edit.parts.NoteTextEditPart;
import components.diagram.edit.parts.ParameterNameTypeEditPart;
import components.diagram.edit.parts.PropertyVisibilityNameTypeEditPart;
import components.diagram.parsers.MessageFormatParser;
import components.diagram.part.ComponentsVisualIDRegistry;

/**
 * @generated
 */
public class ComponentsParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser clasName_5004Parser;

	/**
	* @generated
	*/
	private IParser getClasName_5004Parser() {
		if (clasName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clasName_5004Parser = parser;
		}
		return clasName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser interfaceName_5006Parser;

	/**
	* @generated
	*/
	private IParser getInterfaceName_5006Parser() {
		if (interfaceName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interfaceName_5006Parser = parser;
		}
		return interfaceName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser enumerationName_5008Parser;

	/**
	* @generated
	*/
	private IParser getEnumerationName_5008Parser() {
		if (enumerationName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumerationName_5008Parser = parser;
		}
		return enumerationName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser noteText_5009Parser;

	/**
	* @generated
	*/
	private IParser getNoteText_5009Parser() {
		if (noteText_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getNote_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			noteText_5009Parser = parser;
		}
		return noteText_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser propertyVisibilityNameType_5001Parser;

	/**
	* @generated
	*/
	private IParser getPropertyVisibilityNameType_5001Parser() {
		if (propertyVisibilityNameType_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getProperty_Visibility(),
					ComponentsPackage.eINSTANCE.getProperty_Name(), ComponentsPackage.eINSTANCE.getProperty_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyVisibilityNameType_5001Parser = parser;
		}
		return propertyVisibilityNameType_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser methodVisibilityNameReturnType_5003Parser;

	/**
	* @generated
	*/
	private IParser getMethodVisibilityNameReturnType_5003Parser() {
		if (methodVisibilityNameReturnType_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getMethod_Visibility(),
					ComponentsPackage.eINSTANCE.getMethod_Name(), ComponentsPackage.eINSTANCE.getMethod_ReturnType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			methodVisibilityNameReturnType_5003Parser = parser;
		}
		return methodVisibilityNameReturnType_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser parameterNameType_5002Parser;

	/**
	* @generated
	*/
	private IParser getParameterNameType_5002Parser() {
		if (parameterNameType_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getParameter_Name(),
					ComponentsPackage.eINSTANCE.getParameter_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parameterNameType_5002Parser = parser;
		}
		return parameterNameType_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser methodVisibilityNameReturnType_5005Parser;

	/**
	* @generated
	*/
	private IParser getMethodVisibilityNameReturnType_5005Parser() {
		if (methodVisibilityNameReturnType_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getMethod_Visibility(),
					ComponentsPackage.eINSTANCE.getMethod_Name(), ComponentsPackage.eINSTANCE.getMethod_ReturnType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			methodVisibilityNameReturnType_5005Parser = parser;
		}
		return methodVisibilityNameReturnType_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser enumLiteralName_5007Parser;

	/**
	* @generated
	*/
	private IParser getEnumLiteralName_5007Parser() {
		if (enumLiteralName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getEnumLiteral_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumLiteralName_5007Parser = parser;
		}
		return enumLiteralName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser associationRole_6001Parser;

	/**
	* @generated
	*/
	private IParser getAssociationRole_6001Parser() {
		if (associationRole_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getAssociation_Role() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationRole_6001Parser = parser;
		}
		return associationRole_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ClasNameEditPart.VISUAL_ID:
			return getClasName_5004Parser();
		case InterfaceNameEditPart.VISUAL_ID:
			return getInterfaceName_5006Parser();
		case EnumerationNameEditPart.VISUAL_ID:
			return getEnumerationName_5008Parser();
		case NoteTextEditPart.VISUAL_ID:
			return getNoteText_5009Parser();
		case PropertyVisibilityNameTypeEditPart.VISUAL_ID:
			return getPropertyVisibilityNameType_5001Parser();
		case MethodVisibilityNameReturnTypEditPart.VISUAL_ID:
			return getMethodVisibilityNameReturnType_5003Parser();
		case ParameterNameTypeEditPart.VISUAL_ID:
			return getParameterNameType_5002Parser();
		case MethodVisibilityNameReturnTyp2EditPart.VISUAL_ID:
			return getMethodVisibilityNameReturnType_5005Parser();
		case EnumLiteralNameEditPart.VISUAL_ID:
			return getEnumLiteralName_5007Parser();
		case AssociationRoleEditPart.VISUAL_ID:
			return getAssociationRole_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ComponentsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ComponentsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ComponentsElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
