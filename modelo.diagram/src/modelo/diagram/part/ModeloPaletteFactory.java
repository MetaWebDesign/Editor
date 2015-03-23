package modelo.diagram.part;

import java.util.Collections;

import modelo.diagram.providers.ModeloElementTypes;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ModeloPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createModelo1Group());
	}

	/**
	 * Creates "modelo" palette tool group
	 * @generated
	 */
	private PaletteContainer createModelo1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Modelo1Group_title);
		paletteContainer.setId("createModelo1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createRelation2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Class1CreationTool_title,
				Messages.Class1CreationTool_desc,
				Collections.singletonList(ModeloElementTypes.Class_2001));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModeloElementTypes
				.getImageDescriptor(ModeloElementTypes.Class_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Relation2CreationTool_title,
				Messages.Relation2CreationTool_desc,
				Collections.singletonList(ModeloElementTypes.Relation_4001));
		entry.setId("createRelation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModeloElementTypes
				.getImageDescriptor(ModeloElementTypes.Relation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
