package Modeldos.modeldos.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ModeldosPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createModeldos1Group());
	}

	/**
	 * Creates "modeldos" palette tool group
	 * @generated
	 */
	private PaletteContainer createModeldos1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Modeldos.modeldos.diagram.part.Messages.Modeldos1Group_title);
		paletteContainer.setId("createModeldos1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createAttributes2CreationTool());
		paletteContainer.add(createDerived3CreationTool());
		paletteContainer.add(createNotDerived4CreationTool());
		paletteContainer.add(createRelationClass5CreationTool());
		paletteContainer.add(createMenu6CreationTool());
		paletteContainer.add(createGroup7CreationTool());
		paletteContainer.add(createViews8CreationTool());
		paletteContainer.add(createForm9CreationTool());
		paletteContainer.add(createPage10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Class1CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Class1CreationTool_desc,
				Collections
						.singletonList(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2006));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributes2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Attributes2CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Attributes2CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttributes2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDerived3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Derived_3003);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Derived_2007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Derived3CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Derived3CreationTool_desc,
				types);
		entry.setId("createDerived3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Derived_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotDerived4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.NotDerived_2003);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.NotDerived_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeldos.modeldos.diagram.part.Messages.NotDerived4CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.NotDerived4CreationTool_desc,
				types);
		entry.setId("createNotDerived4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.NotDerived_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationClass5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeldos.modeldos.diagram.part.Messages.RelationClass5CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.RelationClass5CreationTool_desc,
				Collections
						.singletonList(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.RelationClass_4001));
		entry.setId("createRelationClass5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.RelationClass_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenu6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Menu6CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Menu6CreationTool_desc,
				Collections
						.singletonList(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Menu_2001));
		entry.setId("createMenu6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Menu_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Group_3001);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Group_2002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Group7CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Group7CreationTool_desc,
				types);
		entry.setId("createGroup7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Group_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViews8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Views8CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Views8CreationTool_desc,
				null, null) {
		};
		entry.setId("createViews8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForm9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Form9CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Form9CreationTool_desc,
				Collections
						.singletonList(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Form_2004));
		entry.setId("createForm9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Form_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPage10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Page10CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Page10CreationTool_desc,
				Collections
						.singletonList(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Page_2005));
		entry.setId("createPage10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Page_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
