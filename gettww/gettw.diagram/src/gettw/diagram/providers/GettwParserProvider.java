/*
 * 
 */
package gettw.diagram.providers;

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

import gettw.GettwPackage;
import gettw.diagram.edit.parts.ActorId_EditPart;
import gettw.diagram.edit.parts.CustomLinkId_EditPart;
import gettw.diagram.edit.parts.CustomShapeId_EditPart;
import gettw.diagram.edit.parts.DiamondId_EditPart;
import gettw.diagram.edit.parts.EllipseId_EditPart;
import gettw.diagram.edit.parts.PackageId_EditPart;
import gettw.diagram.edit.parts.PictureId_EditPart;
import gettw.diagram.edit.parts.RectangleId_EditPart;
import gettw.diagram.edit.parts.RoundedRectangleId_EditPart;
import gettw.diagram.edit.parts.SubscriptId_EditPart;
import gettw.diagram.edit.parts.SuperscriptId_EditPart;
import gettw.diagram.edit.parts.TextId_EditPart;
import gettw.diagram.edit.parts.TextIndexId_EditPart;
import gettw.diagram.edit.parts.TriangleDownId_EditPart;
import gettw.diagram.edit.parts.TriangleId_EditPart;
import gettw.diagram.edit.parts.TriangleLeftId_EditPart;
import gettw.diagram.edit.parts.TriangleRightId_EditPart;
import gettw.diagram.parsers.MessageFormatParser;
import gettw.diagram.part.GettwVisualIDRegistry;

/**
 * @generated
 */
public class GettwParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser superscriptId__5001Parser;

	/**
	* @generated
	*/
	private IParser getSuperscriptId__5001Parser() {
		if (superscriptId__5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			superscriptId__5001Parser = parser;
		}
		return superscriptId__5001Parser;
	}

	/**
	* @generated
	*/
	private IParser subscriptId__5002Parser;

	/**
	* @generated
	*/
	private IParser getSubscriptId__5002Parser() {
		if (subscriptId__5002Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			subscriptId__5002Parser = parser;
		}
		return subscriptId__5002Parser;
	}

	/**
	* @generated
	*/
	private IParser textIndexId__5003Parser;

	/**
	* @generated
	*/
	private IParser getTextIndexId__5003Parser() {
		if (textIndexId__5003Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textIndexId__5003Parser = parser;
		}
		return textIndexId__5003Parser;
	}

	/**
	* @generated
	*/
	private IParser rectangleId__5004Parser;

	/**
	* @generated
	*/
	private IParser getRectangleId__5004Parser() {
		if (rectangleId__5004Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rectangleId__5004Parser = parser;
		}
		return rectangleId__5004Parser;
	}

	/**
	* @generated
	*/
	private IParser roundedRectangleId__5005Parser;

	/**
	* @generated
	*/
	private IParser getRoundedRectangleId__5005Parser() {
		if (roundedRectangleId__5005Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roundedRectangleId__5005Parser = parser;
		}
		return roundedRectangleId__5005Parser;
	}

	/**
	* @generated
	*/
	private IParser ellipseId__5006Parser;

	/**
	* @generated
	*/
	private IParser getEllipseId__5006Parser() {
		if (ellipseId__5006Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ellipseId__5006Parser = parser;
		}
		return ellipseId__5006Parser;
	}

	/**
	* @generated
	*/
	private IParser triangleId__5007Parser;

	/**
	* @generated
	*/
	private IParser getTriangleId__5007Parser() {
		if (triangleId__5007Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			triangleId__5007Parser = parser;
		}
		return triangleId__5007Parser;
	}

	/**
	* @generated
	*/
	private IParser diamondId__5008Parser;

	/**
	* @generated
	*/
	private IParser getDiamondId__5008Parser() {
		if (diamondId__5008Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			diamondId__5008Parser = parser;
		}
		return diamondId__5008Parser;
	}

	/**
	* @generated
	*/
	private IParser triangleDownId__5009Parser;

	/**
	* @generated
	*/
	private IParser getTriangleDownId__5009Parser() {
		if (triangleDownId__5009Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			triangleDownId__5009Parser = parser;
		}
		return triangleDownId__5009Parser;
	}

	/**
	* @generated
	*/
	private IParser triangleLeftId__5010Parser;

	/**
	* @generated
	*/
	private IParser getTriangleLeftId__5010Parser() {
		if (triangleLeftId__5010Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			triangleLeftId__5010Parser = parser;
		}
		return triangleLeftId__5010Parser;
	}

	/**
	* @generated
	*/
	private IParser triangleRightId__5011Parser;

	/**
	* @generated
	*/
	private IParser getTriangleRightId__5011Parser() {
		if (triangleRightId__5011Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			triangleRightId__5011Parser = parser;
		}
		return triangleRightId__5011Parser;
	}

	/**
	* @generated
	*/
	private IParser actorId__5012Parser;

	/**
	* @generated
	*/
	private IParser getActorId__5012Parser() {
		if (actorId__5012Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorId__5012Parser = parser;
		}
		return actorId__5012Parser;
	}

	/**
	* @generated
	*/
	private IParser packageId__5013Parser;

	/**
	* @generated
	*/
	private IParser getPackageId__5013Parser() {
		if (packageId__5013Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageId__5013Parser = parser;
		}
		return packageId__5013Parser;
	}

	/**
	* @generated
	*/
	private IParser customLinkId__5014Parser;

	/**
	* @generated
	*/
	private IParser getCustomLinkId__5014Parser() {
		if (customLinkId__5014Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customLinkId__5014Parser = parser;
		}
		return customLinkId__5014Parser;
	}

	/**
	* @generated
	*/
	private IParser textId__5015Parser;

	/**
	* @generated
	*/
	private IParser getTextId__5015Parser() {
		if (textId__5015Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textId__5015Parser = parser;
		}
		return textId__5015Parser;
	}

	/**
	* @generated
	*/
	private IParser pictureId__5016Parser;

	/**
	* @generated
	*/
	private IParser getPictureId__5016Parser() {
		if (pictureId__5016Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pictureId__5016Parser = parser;
		}
		return pictureId__5016Parser;
	}

	/**
	* @generated
	*/
	private IParser customShapeId__5017Parser;

	/**
	* @generated
	*/
	private IParser getCustomShapeId__5017Parser() {
		if (customShapeId__5017Parser == null) {
			EAttribute[] features = new EAttribute[] { GettwPackage.eINSTANCE.getGraphElement_Id_() };
			MessageFormatParser parser = new MessageFormatParser(features);
			customShapeId__5017Parser = parser;
		}
		return customShapeId__5017Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SuperscriptId_EditPart.VISUAL_ID:
			return getSuperscriptId__5001Parser();
		case SubscriptId_EditPart.VISUAL_ID:
			return getSubscriptId__5002Parser();
		case TextIndexId_EditPart.VISUAL_ID:
			return getTextIndexId__5003Parser();
		case RectangleId_EditPart.VISUAL_ID:
			return getRectangleId__5004Parser();
		case RoundedRectangleId_EditPart.VISUAL_ID:
			return getRoundedRectangleId__5005Parser();
		case EllipseId_EditPart.VISUAL_ID:
			return getEllipseId__5006Parser();
		case TriangleId_EditPart.VISUAL_ID:
			return getTriangleId__5007Parser();
		case DiamondId_EditPart.VISUAL_ID:
			return getDiamondId__5008Parser();
		case TriangleDownId_EditPart.VISUAL_ID:
			return getTriangleDownId__5009Parser();
		case TriangleLeftId_EditPart.VISUAL_ID:
			return getTriangleLeftId__5010Parser();
		case TriangleRightId_EditPart.VISUAL_ID:
			return getTriangleRightId__5011Parser();
		case ActorId_EditPart.VISUAL_ID:
			return getActorId__5012Parser();
		case PackageId_EditPart.VISUAL_ID:
			return getPackageId__5013Parser();
		case CustomLinkId_EditPart.VISUAL_ID:
			return getCustomLinkId__5014Parser();
		case TextId_EditPart.VISUAL_ID:
			return getTextId__5015Parser();
		case PictureId_EditPart.VISUAL_ID:
			return getPictureId__5016Parser();
		case CustomShapeId_EditPart.VISUAL_ID:
			return getCustomShapeId__5017Parser();
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
			return getParser(GettwVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GettwVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GettwElementTypes.getElement(hint) == null) {
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
