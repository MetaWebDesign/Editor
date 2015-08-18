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
		paletteContainer.add(createViews6CreationTool());
		paletteContainer.add(createForm7CreationTool());
		paletteContainer.add(createPage8CreationTool());
		paletteContainer.add(createRelationView9CreationTool());
		paletteContainer.add(createViewComponent10CreationTool());
		paletteContainer.add(createViewAttribute11CreationTool());
		paletteContainer.add(createNavegationMenu12CreationTool());
		paletteContainer.add(createLink13CreationTool());
		paletteContainer.add(createLinkViewCRUD14CreationTool());
		paletteContainer.add(createLinkView15CreationTool());
		paletteContainer.add(createConstraint16CreationTool());
		paletteContainer.add(createRelationContraint17CreationTool());
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2009));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2009));
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
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2002);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_desc,
				types);
		entry.setId("createDerived3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotDerived4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2006);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_desc,
				types);
		entry.setId("createNotDerived4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2006));
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
	private ToolEntry createViews6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Views6CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Views6CreationTool_desc,
				null, null) {
		};
		entry.setId("createViews6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForm7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Form7CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Form7CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2001));
		entry.setId("createForm7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPage8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Page8CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Page8CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2003));
		entry.setId("createPage8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationView9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationView9CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationView9CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4002));
		entry.setId("createRelationView9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewComponent10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent10CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent10CreationTool_desc,
				null, null) {
		};
		entry.setId("createViewComponent10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewAttribute11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_3001);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_2007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewAttribute11CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewAttribute11CreationTool_desc,
				types);
		entry.setId("createViewAttribute11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNavegationMenu12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3002);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu12CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu12CreationTool_desc,
				types);
		entry.setId("createNavegationMenu12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink13CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Link13CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Link13CreationTool_desc,
				null, null) {
		};
		entry.setId("createLink13CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkViewCRUD14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3004);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD14CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD14CreationTool_desc,
				types);
		entry.setId("createLinkViewCRUD14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkView15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3003);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView15CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView15CreationTool_desc,
				types);
		entry.setId("createLinkView15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint16CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint16CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2005));
		entry.setId("createConstraint16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationContraint17CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationContraint17CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.RelationContraint17CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4003));
		entry.setId("createRelationContraint17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
