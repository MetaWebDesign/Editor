package Modelo.modelo.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ModeloEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Modelo.modelo.diagram.part.ModeloVisualIDRegistry
					.getVisualID(view)) {

			case Modelo.modelo.diagram.edit.parts.ModelEditPart.VISUAL_ID:
				return new Modelo.modelo.diagram.edit.parts.ModelEditPart(view);

			case Modelo.modelo.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new Modelo.modelo.diagram.edit.parts.ClassEditPart(view);

			case Modelo.modelo.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
				return new Modelo.modelo.diagram.edit.parts.ClassNameEditPart(
						view);

			case Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID:
				return new Modelo.modelo.diagram.edit.parts.RelationEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
