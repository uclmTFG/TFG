
/*
 * 
 */
package mof.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import mof.diagram.providers.MofElementTypes;

/**
 * @generated
 */
public class MofPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createNodoDos1CreationTool());
		paletteContainer.add(createNodoUno2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createEnlace1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createNodoDos1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MofElementTypes.NodoDos_3001);
		types.add(MofElementTypes.NodoDos_2002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NodoDos1CreationTool_title,
				Messages.NodoDos1CreationTool_desc, types);
		entry.setId("createNodoDos1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.NodoDos_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNodoUno2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NodoUno2CreationTool_title,
				Messages.NodoUno2CreationTool_desc, Collections.singletonList(MofElementTypes.NodoUno_2001));
		entry.setId("createNodoUno2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.NodoUno_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnlace1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Enlace1CreationTool_title,
				Messages.Enlace1CreationTool_desc, Collections.singletonList(MofElementTypes.Enlace_4001));
		entry.setId("createEnlace1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.Enlace_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
