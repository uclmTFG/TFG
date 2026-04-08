
/*
 * 
 */
package components.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ComponentsPaletteFactory {

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
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createClas2CreationTool());
		paletteContainer.add(createEnumLiteral3CreationTool());
		paletteContainer.add(createEnumeration4CreationTool());
		paletteContainer.add(createInterface5CreationTool());
		paletteContainer.add(createNote6CreationTool());
		paletteContainer.add(createOperation7CreationTool());
		paletteContainer.add(createParameter8CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAggregation1CreationTool());
		paletteContainer.add(createAssociation2CreationTool());
		paletteContainer.add(createComposition3CreationTool());
		paletteContainer.add(createDependency4CreationTool());
		paletteContainer.add(createGeneratization5CreationTool());
		paletteContainer.add(createInterfaceRealization6CreationTool());
		paletteContainer.add(createNoteLink7CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttribute1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc, Collections.singletonList(ComponentsElementTypes.Property_3001));
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Property_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClas2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Clas2CreationTool_title,
				Messages.Clas2CreationTool_desc, Collections.singletonList(ComponentsElementTypes.Clas_2001));
		entry.setId("createClas2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Clas_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnumLiteral3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EnumLiteral3CreationTool_title,
				Messages.EnumLiteral3CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.EnumLiteral_3005));
		entry.setId("createEnumLiteral3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.EnumLiteral_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnumeration4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Enumeration4CreationTool_title,
				Messages.Enumeration4CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.Enumeration_2003));
		entry.setId("createEnumeration4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Enumeration_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInterface5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Interface5CreationTool_title,
				Messages.Interface5CreationTool_desc, Collections.singletonList(ComponentsElementTypes.Interface_2002));
		entry.setId("createInterface5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Interface_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNote6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Note6CreationTool_title,
				Messages.Note6CreationTool_desc, Collections.singletonList(ComponentsElementTypes.Note_2004));
		entry.setId("createNote6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Note_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOperation7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComponentsElementTypes.Method_3002);
		types.add(ComponentsElementTypes.Method_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Operation7CreationTool_title,
				Messages.Operation7CreationTool_desc, types);
		entry.setId("createOperation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Method_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParameter8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Parameter8CreationTool_title,
				Messages.Parameter8CreationTool_desc, Collections.singletonList(ComponentsElementTypes.Parameter_3003));
		entry.setId("createParameter8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Parameter_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregation1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Aggregation1CreationTool_title,
				Messages.Aggregation1CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.Aggregation_4004));
		entry.setId("createAggregation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Aggregation_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAssociation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Association2CreationTool_title,
				Messages.Association2CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.Association_4003));
		entry.setId("createAssociation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Association_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComposition3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Composition3CreationTool_title,
				Messages.Composition3CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.Composition_4005));
		entry.setId("createComposition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Composition_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDependency4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Dependency4CreationTool_title,
				Messages.Dependency4CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.Dependency_4006));
		entry.setId("createDependency4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Dependency_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGeneratization5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Generatization5CreationTool_title,
				Messages.Generatization5CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.Generalization_4001));
		entry.setId("createGeneratization5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Generalization_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInterfaceRealization6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InterfaceRealization6CreationTool_title,
				Messages.InterfaceRealization6CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.Implementation_4002));
		entry.setId("createInterfaceRealization6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.Implementation_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNoteLink7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.NoteLink7CreationTool_title,
				Messages.NoteLink7CreationTool_desc, Collections.singletonList(ComponentsElementTypes.NoteLink_4007));
		entry.setId("createNoteLink7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes.getImageDescriptor(ComponentsElementTypes.NoteLink_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
