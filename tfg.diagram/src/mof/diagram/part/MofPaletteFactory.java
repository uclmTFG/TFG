
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
		paletteContainer.add(createAtributosMetodos1CreationTool());
		paletteContainer.add(createNodoDos2CreationTool());
		paletteContainer.add(createNodoUno3CreationTool());
		paletteContainer.add(createPackage4CreationTool());
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
	private ToolEntry createAtributosMetodos1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MofElementTypes.AtributosMetodos_3004);
		types.add(MofElementTypes.AtributosMetodos_2004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AtributosMetodos1CreationTool_title,
				Messages.AtributosMetodos1CreationTool_desc, types);
		entry.setId("createAtributosMetodos1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.AtributosMetodos_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNodoDos2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MofElementTypes.NodoDos_3003);
		types.add(MofElementTypes.NodoDos_2003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NodoDos2CreationTool_title,
				Messages.NodoDos2CreationTool_desc, types);
		entry.setId("createNodoDos2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.NodoDos_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNodoUno3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MofElementTypes.NodoUno_3002);
		types.add(MofElementTypes.NodoUno_2002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NodoUno3CreationTool_title,
				Messages.NodoUno3CreationTool_desc, types);
		entry.setId("createNodoUno3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.NodoUno_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPackage4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MofElementTypes.Package_2001);
		types.add(MofElementTypes.Package_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Package4CreationTool_title,
				Messages.Package4CreationTool_desc, types);
		entry.setId("createPackage4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MofElementTypes.getImageDescriptor(MofElementTypes.Package_2001));
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
