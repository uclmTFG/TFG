
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
		paletteContainer.add(createClas1CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createGeneratization1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createClas1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Clas1CreationTool_title,
				Messages.Clas1CreationTool_desc, Collections.singletonList(MofElementTypes.Clas_2001));
		entry.setId("createClas1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.Clas_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGeneratization1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Generatization1CreationTool_title,
				Messages.Generatization1CreationTool_desc,
				Collections.singletonList(MofElementTypes.Generalization_4001));
		entry.setId("createGeneratization1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.Generalization_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
