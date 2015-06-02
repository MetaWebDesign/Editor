package Modelouno.modeluno.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
				Modelouno.modeluno.diagram.part.Messages.Modeluno1Group_title);
		paletteContainer.setId("createModeluno1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createClassGoServiceRelation2CreationTool());
		paletteContainer.add(createRelation_Class3CreationTool());
		paletteContainer.add(createAttribute4CreationTool());
		paletteContainer.add(createRelation_Attribute5CreationTool());
		paletteContainer.add(createAttribute_Not_Derived6CreationTool());
		paletteContainer.add(createAttribute_Derived7CreationTool());
		paletteContainer.add(createService8CreationTool());
		paletteContainer.add(createRelation_Service9CreationTool());
		paletteContainer.add(createCreate10CreationTool());
		paletteContainer.add(createDelete11CreationTool());
		paletteContainer.add(createUpdateObject12CreationTool());
		paletteContainer.add(createUpdateAttribute13CreationTool());
		paletteContainer.add(createIndex14CreationTool());
		paletteContainer.add(createView15CreationTool());
		paletteContainer.add(createAdmin16CreationTool());
		paletteContainer.add(createViews17CreationTool());
		paletteContainer.add(createViewInput18CreationTool());
		paletteContainer.add(createViewUpdateObject19CreationTool());
		paletteContainer.add(createViewUpdateAttribute20CreationTool());
		paletteContainer.add(createViewIndex21CreationTool());
		paletteContainer.add(createViewAttribute22CreationTool());
		paletteContainer.add(createViewAdmin23CreationTool());
		paletteContainer.add(createRelation_View24CreationTool());
		paletteContainer.add(createPage25CreationTool());
		paletteContainer.add(createPresetationUnit26CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Class1CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Class1CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Class_2005));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Class_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassGoServiceRelation2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modelouno.modeluno.diagram.part.Messages.ClassGoServiceRelation2CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.ClassGoServiceRelation2CreationTool_desc,
				null, null) {
		};
		entry.setId("createClassGoServiceRelation2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation_Class3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Relation_Class3CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Relation_Class3CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Class_4003));
		entry.setId("createRelation_Class3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Class_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Attribute4CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Attribute4CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttribute4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation_Attribute5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Relation_Attribute5CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Relation_Attribute5CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001));
		entry.setId("createRelation_Attribute5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute_Not_Derived6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Attribute_Not_Derived6CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Attribute_Not_Derived6CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2015));
		entry.setId("createAttribute_Not_Derived6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute_Derived7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Attribute_Derived7CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Attribute_Derived7CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2017));
		entry.setId("createAttribute_Derived7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createService8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Service8CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Service8CreationTool_desc,
				null, null) {
		};
		entry.setId("createService8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation_Service9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Relation_Service9CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Relation_Service9CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004));
		entry.setId("createRelation_Service9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreate10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Create10CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Create10CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Create_2001));
		entry.setId("createCreate10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Create_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelete11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Delete11CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Delete11CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2008));
		entry.setId("createDelete11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateObject12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.UpdateObject12CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.UpdateObject12CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2006));
		entry.setId("createUpdateObject12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpdateAttribute13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.UpdateAttribute13CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.UpdateAttribute13CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateAttribute_2014));
		entry.setId("createUpdateAttribute13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateAttribute_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIndex14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Index14CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Index14CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Index_2012));
		entry.setId("createIndex14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Index_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createView15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.View15CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.View15CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.View_2013));
		entry.setId("createView15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.View_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdmin16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Admin16CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Admin16CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2004));
		entry.setId("createAdmin16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViews17CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Views17CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Views17CreationTool_desc,
				null, null) {
		};
		entry.setId("createViews17CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewInput18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.ViewInput18CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.ViewInput18CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewInput_2016));
		entry.setId("createViewInput18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewInput_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewUpdateObject19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.ViewUpdateObject19CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.ViewUpdateObject19CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateObject_2003));
		entry.setId("createViewUpdateObject19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateObject_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewUpdateAttribute20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.ViewUpdateAttribute20CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.ViewUpdateAttribute20CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateAttribute_2010));
		entry.setId("createViewUpdateAttribute20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateAttribute_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewIndex21CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.ViewIndex21CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.ViewIndex21CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewIndex_2002));
		entry.setId("createViewIndex21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewIndex_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewAttribute22CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.ViewAttribute22CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.ViewAttribute22CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewAttribute_2011));
		entry.setId("createViewAttribute22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewAttribute_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViewAdmin23CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.ViewAdmin23CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.ViewAdmin23CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewAdmin_2009));
		entry.setId("createViewAdmin23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewAdmin_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation_View24CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Relation_View24CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Relation_View24CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002));
		entry.setId("createRelation_View24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPage25CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modelouno.modeluno.diagram.part.Messages.Page25CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.Page25CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Page_2007));
		entry.setId("createPage25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Page_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPresetationUnit26CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modelouno.modeluno.diagram.part.Messages.PresetationUnit26CreationTool_title,
				Modelouno.modeluno.diagram.part.Messages.PresetationUnit26CreationTool_desc,
				Collections
						.singletonList(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.PresetationUnit_4005));
		entry.setId("createPresetationUnit26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modelouno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.PresetationUnit_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
