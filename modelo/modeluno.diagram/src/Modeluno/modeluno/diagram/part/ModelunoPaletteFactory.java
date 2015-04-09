package Modeluno.modeluno.diagram.part;

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
				Modeluno.modeluno.diagram.part.Messages.Modeluno1Group_title);
		paletteContainer.setId("createModeluno1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createClassHasRelation2CreationTool());
		paletteContainer.add(createClassR13CreationTool());
		paletteContainer.add(createClassHasAtribute4CreationTool());
		paletteContainer.add(createRelation5CreationTool());
		paletteContainer.add(createAtributte6CreationTool());
		paletteContainer.add(createAtributteEsDe7CreationTool());
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
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2001));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassHasRelation2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ClassHasRelation2CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ClassHasRelation2CreationTool_desc,
				null, null) {
		};
		entry.setId("createClassHasRelation2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassR13CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ClassR13CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ClassR13CreationTool_desc,
				null, null) {
		};
		entry.setId("createClassR13CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassHasAtribute4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeluno.modeluno.diagram.part.Messages.ClassHasAtribute4CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.ClassHasAtribute4CreationTool_desc,
				null, null) {
		};
		entry.setId("createClassHasAtribute4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Relation5CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Relation5CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Relation_4001));
		entry.setId("createRelation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Relation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributte6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Atributte6CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Atributte6CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Atributte_4002));
		entry.setId("createAtributte6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Atributte_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributteEsDe7CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeluno.modeluno.diagram.part.Messages.AtributteEsDe7CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.AtributteEsDe7CreationTool_desc,
				null, null) {
		};
		entry.setId("createAtributteEsDe7CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
