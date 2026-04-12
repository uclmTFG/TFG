/*
 * 
 */
package mof.diagram.providers;

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

import mof.MofPackage;
import mof.diagram.edit.parts.AtributosMetodosNombre2EditPart;
import mof.diagram.edit.parts.AtributosMetodosNombreEditPart;
import mof.diagram.edit.parts.EnlaceTextoEditPart;
import mof.diagram.edit.parts.NodoDosNombre2EditPart;
import mof.diagram.edit.parts.NodoDosNombreEditPart;
import mof.diagram.edit.parts.NodoUnoNombre2EditPart;
import mof.diagram.edit.parts.NodoUnoNombreEditPart;
import mof.diagram.edit.parts.PackageNombre2EditPart;
import mof.diagram.edit.parts.PackageNombreEditPart;
import mof.diagram.parsers.MessageFormatParser;
import mof.diagram.part.MofVisualIDRegistry;

/**
 * @generated
 */
public class MofParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser packageNombre_5005Parser;

	/**
	* @generated
	*/
	private IParser getPackageNombre_5005Parser() {
		if (packageNombre_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageNombre_5005Parser = parser;
		}
		return packageNombre_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser nodoUnoNombre_5006Parser;

	/**
	* @generated
	*/
	private IParser getNodoUnoNombre_5006Parser() {
		if (nodoUnoNombre_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodoUnoNombre_5006Parser = parser;
		}
		return nodoUnoNombre_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser nodoDosNombre_5007Parser;

	/**
	* @generated
	*/
	private IParser getNodoDosNombre_5007Parser() {
		if (nodoDosNombre_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodoDosNombre_5007Parser = parser;
		}
		return nodoDosNombre_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser atributosMetodosNombre_5008Parser;

	/**
	* @generated
	*/
	private IParser getAtributosMetodosNombre_5008Parser() {
		if (atributosMetodosNombre_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atributosMetodosNombre_5008Parser = parser;
		}
		return atributosMetodosNombre_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser packageNombre_5004Parser;

	/**
	* @generated
	*/
	private IParser getPackageNombre_5004Parser() {
		if (packageNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageNombre_5004Parser = parser;
		}
		return packageNombre_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser nodoUnoNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getNodoUnoNombre_5001Parser() {
		if (nodoUnoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodoUnoNombre_5001Parser = parser;
		}
		return nodoUnoNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser nodoDosNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getNodoDosNombre_5002Parser() {
		if (nodoDosNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodoDosNombre_5002Parser = parser;
		}
		return nodoDosNombre_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser atributosMetodosNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getAtributosMetodosNombre_5003Parser() {
		if (atributosMetodosNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atributosMetodosNombre_5003Parser = parser;
		}
		return atributosMetodosNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser enlaceTexto_6001Parser;

	/**
	* @generated
	*/
	private IParser getEnlaceTexto_6001Parser() {
		if (enlaceTexto_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getEnlace_Texto() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enlaceTexto_6001Parser = parser;
		}
		return enlaceTexto_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PackageNombreEditPart.VISUAL_ID:
			return getPackageNombre_5005Parser();
		case NodoUnoNombreEditPart.VISUAL_ID:
			return getNodoUnoNombre_5006Parser();
		case NodoDosNombreEditPart.VISUAL_ID:
			return getNodoDosNombre_5007Parser();
		case AtributosMetodosNombreEditPart.VISUAL_ID:
			return getAtributosMetodosNombre_5008Parser();
		case PackageNombre2EditPart.VISUAL_ID:
			return getPackageNombre_5004Parser();
		case NodoUnoNombre2EditPart.VISUAL_ID:
			return getNodoUnoNombre_5001Parser();
		case NodoDosNombre2EditPart.VISUAL_ID:
			return getNodoDosNombre_5002Parser();
		case AtributosMetodosNombre2EditPart.VISUAL_ID:
			return getAtributosMetodosNombre_5003Parser();
		case EnlaceTextoEditPart.VISUAL_ID:
			return getEnlaceTexto_6001Parser();
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
			return getParser(MofVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MofVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MofElementTypes.getElement(hint) == null) {
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
