package Modeldos.modeldos.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ModeldosEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getVisualID(view)) {

			case Modeldos.modeldos.diagram.edit.parts.MapEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.MapEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.ClassEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.ClassCnameEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.RelationEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.AtributteEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.AtributteAnameEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.AtributteAnameEditPart(
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
