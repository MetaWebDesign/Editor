package oo_method.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Oo_methodPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createOo_method1Group());
	}

	/**
	 * Creates "oo_method" palette tool group
	 * @generated
	 */
	private PaletteContainer createOo_method1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				oo_method.diagram.part.Messages.Oo_method1Group_title);
		paletteContainer.setId("createOo_method1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createStructuralModel2CreationTool());
		paletteContainer.add(createStructuralModelClasses3CreationTool());
		paletteContainer.add(createAttribute4CreationTool());
		paletteContainer.add(createAttributeAttributes5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				oo_method.diagram.part.Messages.Class1CreationTool_title,
				oo_method.diagram.part.Messages.Class1CreationTool_desc,
				Collections
						.singletonList(oo_method.diagram.providers.Oo_methodElementTypes.Class_2001));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(oo_method.diagram.providers.Oo_methodElementTypes
				.getImageDescriptor(oo_method.diagram.providers.Oo_methodElementTypes.Class_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuralModel2CreationTool() {
		ToolEntry entry = new ToolEntry(
				oo_method.diagram.part.Messages.StructuralModel2CreationTool_title,
				oo_method.diagram.part.Messages.StructuralModel2CreationTool_desc,
				null, null) {
		};
		entry.setId("createStructuralModel2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuralModelClasses3CreationTool() {
		ToolEntry entry = new ToolEntry(
				oo_method.diagram.part.Messages.StructuralModelClasses3CreationTool_title,
				oo_method.diagram.part.Messages.StructuralModelClasses3CreationTool_desc,
				null, null) {
		};
		entry.setId("createStructuralModelClasses3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute4CreationTool() {
		ToolEntry entry = new ToolEntry(
				oo_method.diagram.part.Messages.Attribute4CreationTool_title,
				oo_method.diagram.part.Messages.Attribute4CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttribute4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeAttributes5CreationTool() {
		ToolEntry entry = new ToolEntry(
				oo_method.diagram.part.Messages.AttributeAttributes5CreationTool_title,
				oo_method.diagram.part.Messages.AttributeAttributes5CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttributeAttributes5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
