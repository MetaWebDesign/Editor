package Metawebdesign.metawebdesign.diagram.part;

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
public class MetaWebDesignPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMetawebdesign1Group());
	}

	/**
	 * Creates "metawebdesign" palette tool group
	 * @generated
	 */
	private PaletteContainer createMetawebdesign1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Metawebdesign.metawebdesign.diagram.part.Messages.Metawebdesign1Group_title);
		paletteContainer.setId("createMetawebdesign1Group"); //$NON-NLS-1$
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
		paletteContainer.add(createRelationView11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Class1CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Class1CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2006));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributes2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Attributes2CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Attributes2CreationTool_desc,
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
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2003);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_desc,
				types);
		entry.setId("createDerived3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotDerived4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2004);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_desc,
				types);
		entry.setId("createNotDerived4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationClass5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationClass5CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationClass5CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002));
		entry.setId("createRelationClass5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMenu6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Menu6CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Menu6CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Menu_2002));
		entry.setId("createMenu6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Menu_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_3001);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_2005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Group7CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Group7CreationTool_desc,
				types);
		entry.setId("createGroup7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViews8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Views8CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Views8CreationTool_desc,
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
				Metawebdesign.metawebdesign.diagram.part.Messages.Form9CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Form9CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2001));
		entry.setId("createForm9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPage10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Page10CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Page10CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2007));
		entry.setId("createPage10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationView11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationView11CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationView11CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001));
		entry.setId("createRelationView11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
