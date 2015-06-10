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

			case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.RootEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.NotDerivedNameEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.NotDerivedNameEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.ClassEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.ClassNameEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.MenuEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.MenuNameEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.MenuNameEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.PageEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.PageTitleEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.PageTitleEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.FormEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.FormTitleEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.FormTitleEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.GroupEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.GroupNameEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.GroupNameEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.DerivedEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.DerivedNameEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.DerivedNameEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart(
						view);

			case Modeldos.modeldos.diagram.edit.parts.RelationClassNameEditPart.VISUAL_ID:
				return new Modeldos.modeldos.diagram.edit.parts.RelationClassNameEditPart(
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
