/*
* 
*/
package gettw.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import gettw.GETTWDiagram;
import gettw.GraphElement;
import gettw.diagram.edit.parts.ActorEditPart;
import gettw.diagram.edit.parts.CustomLinkEditPart;
import gettw.diagram.edit.parts.CustomShapeEditPart;
import gettw.diagram.edit.parts.DiamondEditPart;
import gettw.diagram.edit.parts.EllipseEditPart;
import gettw.diagram.edit.parts.GETTWDiagramEditPart;
import gettw.diagram.edit.parts.PackageEditPart;
import gettw.diagram.edit.parts.PictureEditPart;
import gettw.diagram.edit.parts.RectangleEditPart;
import gettw.diagram.edit.parts.RoundedRectangleEditPart;
import gettw.diagram.edit.parts.SubscriptEditPart;
import gettw.diagram.edit.parts.SuperscriptEditPart;
import gettw.diagram.edit.parts.TextEditPart;
import gettw.diagram.edit.parts.TextIndexEditPart;
import gettw.diagram.edit.parts.TriangleDownEditPart;
import gettw.diagram.edit.parts.TriangleEditPart;
import gettw.diagram.edit.parts.TriangleLeftEditPart;
import gettw.diagram.edit.parts.TriangleRightEditPart;

/**
 * @generated
 */
public class GettwDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<GettwNodeDescriptor> getSemanticChildren(View view) {
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case GETTWDiagramEditPart.VISUAL_ID:
			return getGETTWDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwNodeDescriptor> getGETTWDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GETTWDiagram modelElement = (GETTWDiagram) view.getElement();
		LinkedList<GettwNodeDescriptor> result = new LinkedList<GettwNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			GraphElement childElement = (GraphElement) it.next();
			int visualID = GettwVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SuperscriptEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SubscriptEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextIndexEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RectangleEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RoundedRectangleEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EllipseEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriangleEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DiamondEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriangleDownEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriangleLeftEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriangleRightEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomLinkEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PictureEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CustomShapeEditPart.VISUAL_ID) {
				result.add(new GettwNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getContainedLinks(View view) {
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case GETTWDiagramEditPart.VISUAL_ID:
			return getGETTWDiagram_1000ContainedLinks(view);
		case SuperscriptEditPart.VISUAL_ID:
			return getSuperscript_2001ContainedLinks(view);
		case SubscriptEditPart.VISUAL_ID:
			return getSubscript_2002ContainedLinks(view);
		case TextIndexEditPart.VISUAL_ID:
			return getTextIndex_2003ContainedLinks(view);
		case RectangleEditPart.VISUAL_ID:
			return getRectangle_2004ContainedLinks(view);
		case RoundedRectangleEditPart.VISUAL_ID:
			return getRoundedRectangle_2005ContainedLinks(view);
		case EllipseEditPart.VISUAL_ID:
			return getEllipse_2006ContainedLinks(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2007ContainedLinks(view);
		case DiamondEditPart.VISUAL_ID:
			return getDiamond_2008ContainedLinks(view);
		case TriangleDownEditPart.VISUAL_ID:
			return getTriangleDown_2009ContainedLinks(view);
		case TriangleLeftEditPart.VISUAL_ID:
			return getTriangleLeft_2010ContainedLinks(view);
		case TriangleRightEditPart.VISUAL_ID:
			return getTriangleRight_2011ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2012ContainedLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2013ContainedLinks(view);
		case CustomLinkEditPart.VISUAL_ID:
			return getCustomLink_2014ContainedLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_2015ContainedLinks(view);
		case PictureEditPart.VISUAL_ID:
			return getPicture_2016ContainedLinks(view);
		case CustomShapeEditPart.VISUAL_ID:
			return getCustomShape_2017ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getIncomingLinks(View view) {
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case SuperscriptEditPart.VISUAL_ID:
			return getSuperscript_2001IncomingLinks(view);
		case SubscriptEditPart.VISUAL_ID:
			return getSubscript_2002IncomingLinks(view);
		case TextIndexEditPart.VISUAL_ID:
			return getTextIndex_2003IncomingLinks(view);
		case RectangleEditPart.VISUAL_ID:
			return getRectangle_2004IncomingLinks(view);
		case RoundedRectangleEditPart.VISUAL_ID:
			return getRoundedRectangle_2005IncomingLinks(view);
		case EllipseEditPart.VISUAL_ID:
			return getEllipse_2006IncomingLinks(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2007IncomingLinks(view);
		case DiamondEditPart.VISUAL_ID:
			return getDiamond_2008IncomingLinks(view);
		case TriangleDownEditPart.VISUAL_ID:
			return getTriangleDown_2009IncomingLinks(view);
		case TriangleLeftEditPart.VISUAL_ID:
			return getTriangleLeft_2010IncomingLinks(view);
		case TriangleRightEditPart.VISUAL_ID:
			return getTriangleRight_2011IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2012IncomingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2013IncomingLinks(view);
		case CustomLinkEditPart.VISUAL_ID:
			return getCustomLink_2014IncomingLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_2015IncomingLinks(view);
		case PictureEditPart.VISUAL_ID:
			return getPicture_2016IncomingLinks(view);
		case CustomShapeEditPart.VISUAL_ID:
			return getCustomShape_2017IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GettwLinkDescriptor> getOutgoingLinks(View view) {
		switch (GettwVisualIDRegistry.getVisualID(view)) {
		case SuperscriptEditPart.VISUAL_ID:
			return getSuperscript_2001OutgoingLinks(view);
		case SubscriptEditPart.VISUAL_ID:
			return getSubscript_2002OutgoingLinks(view);
		case TextIndexEditPart.VISUAL_ID:
			return getTextIndex_2003OutgoingLinks(view);
		case RectangleEditPart.VISUAL_ID:
			return getRectangle_2004OutgoingLinks(view);
		case RoundedRectangleEditPart.VISUAL_ID:
			return getRoundedRectangle_2005OutgoingLinks(view);
		case EllipseEditPart.VISUAL_ID:
			return getEllipse_2006OutgoingLinks(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2007OutgoingLinks(view);
		case DiamondEditPart.VISUAL_ID:
			return getDiamond_2008OutgoingLinks(view);
		case TriangleDownEditPart.VISUAL_ID:
			return getTriangleDown_2009OutgoingLinks(view);
		case TriangleLeftEditPart.VISUAL_ID:
			return getTriangleLeft_2010OutgoingLinks(view);
		case TriangleRightEditPart.VISUAL_ID:
			return getTriangleRight_2011OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2012OutgoingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2013OutgoingLinks(view);
		case CustomLinkEditPart.VISUAL_ID:
			return getCustomLink_2014OutgoingLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_2015OutgoingLinks(view);
		case PictureEditPart.VISUAL_ID:
			return getPicture_2016OutgoingLinks(view);
		case CustomShapeEditPart.VISUAL_ID:
			return getCustomShape_2017OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getGETTWDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getSuperscript_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getSubscript_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTextIndex_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRectangle_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRoundedRectangle_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getEllipse_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangle_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getDiamond_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleDown_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleLeft_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleRight_2011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getActor_2012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getPackage_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomLink_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getText_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getPicture_2016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomShape_2017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getSuperscript_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getSubscript_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTextIndex_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRectangle_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRoundedRectangle_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getEllipse_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangle_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getDiamond_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleDown_2009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleLeft_2010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleRight_2011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getActor_2012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getPackage_2013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomLink_2014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getText_2015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getPicture_2016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomShape_2017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getSuperscript_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getSubscript_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTextIndex_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRectangle_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getRoundedRectangle_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getEllipse_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangle_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getDiamond_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleDown_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleLeft_2010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getTriangleRight_2011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getActor_2012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getPackage_2013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomLink_2014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getText_2015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getPicture_2016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GettwLinkDescriptor> getCustomShape_2017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<GettwNodeDescriptor> getSemanticChildren(View view) {
			return GettwDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GettwLinkDescriptor> getContainedLinks(View view) {
			return GettwDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GettwLinkDescriptor> getIncomingLinks(View view) {
			return GettwDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GettwLinkDescriptor> getOutgoingLinks(View view) {
			return GettwDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
