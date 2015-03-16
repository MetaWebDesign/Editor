package Oo_method.oo_method.diagram.part;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;

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
				Oo_method.oo_method.diagram.part.Messages.Oo_method1Group_title);
		paletteContainer.setId("createOo_method1Group"); //$NON-NLS-1$
		paletteContainer.add(createRelation1CreationTool());
		paletteContainer.add(createRelationComposed2CreationTool());
		paletteContainer.add(createRelationComponent3CreationTool());
		paletteContainer.add(createNotDerived4CreationTool());
		paletteContainer.add(createDerivationFormula5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Oo_method.oo_method.diagram.part.Messages.Relation1CreationTool_title,
				Oo_method.oo_method.diagram.part.Messages.Relation1CreationTool_desc,
				null, null) {
		};
		entry.setId("createRelation1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationComposed2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Oo_method.oo_method.diagram.part.Messages.RelationComposed2CreationTool_title,
				Oo_method.oo_method.diagram.part.Messages.RelationComposed2CreationTool_desc,
				null, null) {
		};
		entry.setId("createRelationComposed2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationComponent3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Oo_method.oo_method.diagram.part.Messages.RelationComponent3CreationTool_title,
				Oo_method.oo_method.diagram.part.Messages.RelationComponent3CreationTool_desc,
				null, null) {
		};
		entry.setId("createRelationComponent3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotDerived4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Oo_method.oo_method.diagram.part.Messages.NotDerived4CreationTool_title,
				Oo_method.oo_method.diagram.part.Messages.NotDerived4CreationTool_desc,
				null, null) {
		};
		entry.setId("createNotDerived4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDerivationFormula5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Oo_method.oo_method.diagram.part.Messages.DerivationFormula5CreationTool_title,
				Oo_method.oo_method.diagram.part.Messages.DerivationFormula5CreationTool_desc,
				null, null) {
		};
		entry.setId("createDerivationFormula5CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
