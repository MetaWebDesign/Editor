package Modeldos.modeldos.diagram.part;

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
		paletteContainer.add(createRelation2CreationTool());
		paletteContainer.add(createAtributte3CreationTool());
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
						.singletonList(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2001));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Relation2CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Relation2CreationTool_desc,
				Collections
						.singletonList(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Relation_4001));
		entry.setId("createRelation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Relation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributte3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeldos.modeldos.diagram.part.Messages.Atributte3CreationTool_title,
				Modeldos.modeldos.diagram.part.Messages.Atributte3CreationTool_desc,
				Collections
						.singletonList(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Atributte_4002));
		entry.setId("createAtributte3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeldos.modeldos.diagram.providers.ModeldosElementTypes
				.getImageDescriptor(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Atributte_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
