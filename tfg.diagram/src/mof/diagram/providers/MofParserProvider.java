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
import mof.diagram.edit.parts.EnlaceTextoEditPart;
import mof.diagram.edit.parts.NodoDosNombre2EditPart;
import mof.diagram.edit.parts.NodoDosNombreEditPart;
import mof.diagram.edit.parts.NodoUnoNombreEditPart;
import mof.diagram.parsers.MessageFormatParser;
import mof.diagram.part.MofVisualIDRegistry;

/**
 * @generated
 */
public class MofParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser nodoUnoNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getNodoUnoNombre_5002Parser() {
		if (nodoUnoNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodoUnoNombre_5002Parser = parser;
		}
		return nodoUnoNombre_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser nodoDosNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getNodoDosNombre_5003Parser() {
		if (nodoDosNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodoDosNombre_5003Parser = parser;
		}
		return nodoDosNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser nodoDosNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getNodoDosNombre_5001Parser() {
		if (nodoDosNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { MofPackage.eINSTANCE.getNodo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodoDosNombre_5001Parser = parser;
		}
		return nodoDosNombre_5001Parser;
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
		case NodoUnoNombreEditPart.VISUAL_ID:
			return getNodoUnoNombre_5002Parser();
		case NodoDosNombreEditPart.VISUAL_ID:
			return getNodoDosNombre_5003Parser();
		case NodoDosNombre2EditPart.VISUAL_ID:
			return getNodoDosNombre_5001Parser();
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
