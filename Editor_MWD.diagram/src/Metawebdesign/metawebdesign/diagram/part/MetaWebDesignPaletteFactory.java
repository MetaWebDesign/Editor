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
		paletteContainer.add(createViewsFromRelation10CreationTool());
		paletteContainer.add(createPage11CreationTool());
		paletteContainer.add(createRelationView12CreationTool());
		paletteContainer.add(createViewComponent13CreationTool());
		paletteContainer.add(createCallAtribute14CreationTool());
		paletteContainer.add(createNavegationMenu15CreationTool());
		paletteContainer.add(createLink16CreationTool());
		paletteContainer.add(createLinkViewCRUD17CreationTool());
		paletteContainer.add(createLinkView18CreationTool());
		paletteContainer.add(createConstraint19CreationTool());
		paletteContainer.add(createRelationContraint20CreationTool());
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2002));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2002));
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
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3001);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_desc,
				types);
		entry.setId("createDerived3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotDerived4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3002);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_desc,
				types);
		entry.setId("createNotDerived4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3002));
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Menu_2011));
		entry.setId("createMenu6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Menu_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_3007);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_2012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Group7CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Group7CreationTool_desc,
				types);
		entry.setId("createGroup7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_3007));
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2006));
		entry.setId("createForm9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewsFromRelation10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewsFromRelation10CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewsFromRelation10CreationTool_desc,
				null, null) {
		};
		entry.setId("createViewsFromRelation10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPage11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Page11CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Page11CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2008));
		entry.setId("createPage11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationView12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationView12CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationView12CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4003));
		entry.setId("createRelationView12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewComponent13CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent13CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent13CreationTool_desc,
				null, null) {
		};
		entry.setId("createViewComponent13CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallAtribute14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.CallAtribute_3005);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.CallAtribute_2007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.CallAtribute14CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.CallAtribute14CreationTool_desc,
				types);
		entry.setId("createCallAtribute14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.CallAtribute_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNavegationMenu15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2005);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu15CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu15CreationTool_desc,
				types);
		entry.setId("createNavegationMenu15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink16CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Link16CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Link16CreationTool_desc,
				null, null) {
		};
		entry.setId("createLink16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkViewCRUD17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3004);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2009);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD17CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD17CreationTool_desc,
				types);
		entry.setId("createLinkViewCRUD17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkView18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2004);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView18CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView18CreationTool_desc,
				types);
		entry.setId("createLinkView18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint19CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint19CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2001));
		entry.setId("createConstraint19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationContraint20CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationContraint20CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationContraint20CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4002));
		entry.setId("createRelationContraint20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
