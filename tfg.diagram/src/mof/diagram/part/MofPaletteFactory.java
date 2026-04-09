
/*
 * 
 */
package mof.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createNodo1CreationTool());
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
	private ToolEntry createNodo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Nodo1CreationTool_title,
				Messages.Nodo1CreationTool_desc, Collections.singletonList(MofElementTypes.Nodo_2001));
		entry.setId("createNodo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.Nodo_2001));
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
