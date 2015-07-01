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
		paletteContainer.add(createViewComponent12CreationTool());
		paletteContainer.add(createCallAtribute13CreationTool());
		paletteContainer.add(createNavegationMenu14CreationTool());
		paletteContainer.add(createLink15CreationTool());
		paletteContainer.add(createLinkViewCRUD16CreationTool());
		paletteContainer.add(createLinkView17CreationTool());
		paletteContainer.add(createConstraint18CreationTool());
		paletteContainer.add(createRelationContraint19CreationTool());
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2004));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2004));
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
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3006);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_desc,
				types);
		entry.setId("createDerived3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotDerived4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3007);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_desc,
				types);
		entry.setId("createNotDerived4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3007));
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4001));
		entry.setId("createRelationClass5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4001));
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
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_2011);
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2008));
		entry.setId("createForm9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2008));
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2003));
		entry.setId("createPage10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2003));
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4002));
		entry.setId("createRelationView11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewComponent12CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent12CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent12CreationTool_desc,
				null, null) {
		};
		entry.setId("createViewComponent12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallAtribute13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.CallAtribute_3002);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.CallAtribute_2010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.CallAtribute13CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.CallAtribute13CreationTool_desc,
				types);
		entry.setId("createCallAtribute13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.CallAtribute_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNavegationMenu14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3003);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu14CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu14CreationTool_desc,
				types);
		entry.setId("createNavegationMenu14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink15CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Link15CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Link15CreationTool_desc,
				null, null) {
		};
		entry.setId("createLink15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkViewCRUD16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2001);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD16CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD16CreationTool_desc,
				types);
		entry.setId("createLinkViewCRUD16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkView17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3004);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2009);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView17CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView17CreationTool_desc,
				types);
		entry.setId("createLinkView17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint18CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint18CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2007));
		entry.setId("createConstraint18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationContraint19CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationContraint19CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationContraint19CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4003));
		entry.setId("createRelationContraint19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
