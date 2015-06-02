package Modeluno.modeluno.diagram.part;

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
public class ModelunoPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createModeluno1Group());
	}

	/**
	 * Creates "modeluno" palette tool group
	 * @generated
	 */
	private PaletteContainer createModeluno1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Modeluno.modeluno.diagram.part.Messages.Modeluno1Group_title);
		paletteContainer.setId("createModeluno1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createRelationClass2CreationTool());
		paletteContainer.add(createAttribute3CreationTool());
		paletteContainer.add(createRelationAttribute4CreationTool());
		paletteContainer.add(createAttribute_Not_Derived5CreationTool());
		paletteContainer.add(createAttribute_Derived6CreationTool());
		paletteContainer.add(createService7CreationTool());
		paletteContainer.add(createRelationService8CreationTool());
		paletteContainer.add(createCreate9CreationTool());
		paletteContainer.add(createDelete10CreationTool());
		paletteContainer.add(createUpdateObject11CreationTool());
		paletteContainer.add(createUpdateAttribute12CreationTool());
		paletteContainer.add(createListView13CreationTool());
		paletteContainer.add(createView14CreationTool());
		paletteContainer.add(createAdmin15CreationTool());
		paletteContainer.add(createViews16CreationTool());
		paletteContainer.add(createViewInput17CreationTool());
		paletteContainer.add(createViewUpdateObject18CreationTool());
		paletteContainer.add(createViewUpdateAttribute19CreationTool());
		paletteContainer.add(createViewIndex20CreationTool());
		paletteContainer.add(createViewAttribute21CreationTool());
		paletteContainer.add(createViewAdmin22CreationTool());
		paletteContainer.add(createRelationView23CreationTool());
		paletteContainer.add(createPage24CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Class1CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Class1CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2010));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationClass2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.RelationClass2CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.RelationClass2CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationClass_4005));
		entry.setId("createRelationClass2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationClass_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Attribute3CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Attribute3CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttribute3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationAttribute4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.RelationAttribute4CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.RelationAttribute4CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationAttribute_4003));
		entry.setId("createRelationAttribute4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationAttribute_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute_Not_Derived5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Attribute_Not_Derived5CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Attribute_Not_Derived5CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2002));
		entry.setId("createAttribute_Not_Derived5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute_Derived6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Attribute_Derived6CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Attribute_Derived6CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2015));
		entry.setId("createAttribute_Derived6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createService7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Service7CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Service7CreationTool_desc,
				null, null) {
		};
		entry.setId("createService7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationService8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.RelationService8CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.RelationService8CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationService_4001));
		entry.setId("createRelationService8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationService_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreate9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Create9CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Create9CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Create_2006));
		entry.setId("createCreate9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Create_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelete10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Delete10CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Delete10CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2016));
		entry.setId("createDelete10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateObject11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.UpdateObject11CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.UpdateObject11CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2017));
		entry.setId("createUpdateObject11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateAttribute12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateAttribute_2001);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.UpdateAttribute_2018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.UpdateAttribute12CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.UpdateAttribute12CreationTool_desc,
				types);
		entry.setId("createUpdateAttribute12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateAttribute_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createListView13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ListView13CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ListView13CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ListView_2012));
		entry.setId("createListView13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ListView_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createView14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.View14CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.View14CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.View_2003));
		entry.setId("createView14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.View_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdmin15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Admin15CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Admin15CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2005));
		entry.setId("createAdmin15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViews16CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Views16CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Views16CreationTool_desc,
				null, null) {
		};
		entry.setId("createViews16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewInput17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ViewInput17CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ViewInput17CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewInput_2007));
		entry.setId("createViewInput17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewInput_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewUpdateObject18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ViewUpdateObject18CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ViewUpdateObject18CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateObject_2008));
		entry.setId("createViewUpdateObject18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateObject_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewUpdateAttribute19CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ViewUpdateAttribute19CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ViewUpdateAttribute19CreationTool_desc,
				null, null) {
		};
		entry.setId("createViewUpdateAttribute19CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewIndex20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ViewIndex20CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ViewIndex20CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewIndex_2014));
		entry.setId("createViewIndex20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewIndex_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewAttribute21CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ViewAttribute21CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ViewAttribute21CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAttribute_2011));
		entry.setId("createViewAttribute21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAttribute_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewAdmin22CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ViewAdmin22CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ViewAdmin22CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAdmin_2009));
		entry.setId("createViewAdmin22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAdmin_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationView23CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.RelationView23CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.RelationView23CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007));
		entry.setId("createRelationView23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPage24CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Page24CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Page24CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Page_2004));
		entry.setId("createPage24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Page_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
