package Modeluno.modeluno.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ModelunoEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(view)) {

			case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.MapEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ClassEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedAnameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedAnameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart(
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
