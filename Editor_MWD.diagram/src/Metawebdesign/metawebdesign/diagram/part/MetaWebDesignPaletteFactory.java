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
<<<<<<< HEAD
		paletteContainer.add(createPage7CreationTool());
		paletteContainer.add(createViewComponent8CreationTool());
		paletteContainer.add(createViewAttribute9CreationTool());
		paletteContainer.add(createNavegationMenu10CreationTool());
		paletteContainer.add(createLink11CreationTool());
		paletteContainer.add(createLinkViewCRUD12CreationTool());
		paletteContainer.add(createLinkView13CreationTool());
		paletteContainer.add(createConstraint14CreationTool());
=======
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
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
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
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2006);
<<<<<<< HEAD
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005);
=======
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Derived3CreationTool_desc,
				types);
		entry.setId("createDerived3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotDerived4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
<<<<<<< HEAD
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2009);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006);
=======
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2009);
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NotDerived4CreationTool_desc,
				types);
		entry.setId("createNotDerived4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
<<<<<<< HEAD
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2009));
=======
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
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
	private ToolEntry createViews6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Views6CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Views6CreationTool_desc,
				null, null) {
		};
		entry.setId("createViews6CreationTool"); //$NON-NLS-1$
<<<<<<< HEAD
=======
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2008));
		entry.setId("createForm7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2008));
		entry.setLargeIcon(entry.getSmallIcon());
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		return entry;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	private ToolEntry createPage7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Page7CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Page7CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2001));
		entry.setId("createPage7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2001));
=======
	private ToolEntry createPage8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Page8CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Page8CreationTool_desc,
				Collections
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2001));
		entry.setId("createPage8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2001));
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
						.singletonList(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001));
		entry.setId("createRelationView9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	private ToolEntry createViewComponent8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent8CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent8CreationTool_desc,
				null, null) {
		};
		entry.setId("createViewComponent8CreationTool"); //$NON-NLS-1$
=======
	private ToolEntry createViewComponent10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent10CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewComponent10CreationTool_desc,
				null, null) {
		};
		entry.setId("createViewComponent10CreationTool"); //$NON-NLS-1$
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		return entry;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	private ToolEntry createViewAttribute9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_2002);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewAttribute9CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewAttribute9CreationTool_desc,
				types);
		entry.setId("createViewAttribute9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_2002));
=======
	private ToolEntry createViewAttribute11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_3004);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_2002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewAttribute11CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.ViewAttribute11CreationTool_desc,
				types);
		entry.setId("createViewAttribute11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_3004));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	private ToolEntry createNavegationMenu10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2007);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu10CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu10CreationTool_desc,
				types);
		entry.setId("createNavegationMenu10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2007));
=======
	private ToolEntry createNavegationMenu12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3001);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2007);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu12CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenu12CreationTool_desc,
				types);
		entry.setId("createNavegationMenu12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3001));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	private ToolEntry createLink11CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Link11CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Link11CreationTool_desc,
				null, null) {
		};
		entry.setId("createLink11CreationTool"); //$NON-NLS-1$
=======
	private ToolEntry createLink13CreationTool() {
		ToolEntry entry = new ToolEntry(
				Metawebdesign.metawebdesign.diagram.part.Messages.Link13CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Link13CreationTool_desc,
				null, null) {
		};
		entry.setId("createLink13CreationTool"); //$NON-NLS-1$
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		return entry;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	private ToolEntry createLinkViewCRUD12CreationTool() {
=======
	private ToolEntry createLinkViewCRUD14CreationTool() {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3003);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
<<<<<<< HEAD
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD12CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD12CreationTool_desc,
				types);
		entry.setId("createLinkViewCRUD12CreationTool"); //$NON-NLS-1$
=======
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD14CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkViewCRUD14CreationTool_desc,
				types);
		entry.setId("createLinkViewCRUD14CreationTool"); //$NON-NLS-1$
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	private ToolEntry createLinkView13CreationTool() {
=======
	private ToolEntry createLinkView15CreationTool() {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3002);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
<<<<<<< HEAD
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView13CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView13CreationTool_desc,
				types);
		entry.setId("createLinkView13CreationTool"); //$NON-NLS-1$
=======
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView15CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.LinkView15CreationTool_desc,
				types);
		entry.setId("createLinkView15CreationTool"); //$NON-NLS-1$
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	private ToolEntry createConstraint14CreationTool() {
=======
	private ToolEntry createConstraint16CreationTool() {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_3007);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
<<<<<<< HEAD
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint14CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint14CreationTool_desc,
				types);
		entry.setId("createConstraint14CreationTool"); //$NON-NLS-1$
=======
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint16CreationTool_title,
				Metawebdesign.metawebdesign.diagram.part.Messages.Constraint16CreationTool_desc,
				types);
		entry.setId("createConstraint16CreationTool"); //$NON-NLS-1$
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		entry.setSmallIcon(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes
				.getImageDescriptor(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
