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
		paletteContainer.add(createRelation2CreationTool());
		paletteContainer.add(createAtributte3CreationTool());
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
	private ToolEntry createRelation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Relation2CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Relation2CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Relation_4001));
		entry.setId("createRelation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Relation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributte3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Atributte3CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Atributte3CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Atributte_4002));
		entry.setId("createAtributte3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Atributte_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
