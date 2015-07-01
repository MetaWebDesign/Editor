package Metawebdesign.metawebdesign.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MetaWebDesignEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getVisualID(view)) {

			case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.FormTitleEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.FormTitleEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.ClassNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.GroupEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.GroupEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.GroupNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.GroupNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.DerivedNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.MenuEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.MenuEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.MenuNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.MenuNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtribute2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.CallAtribute2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeName2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeName2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuName2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuName2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewName2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewName2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDName2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDName2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.Group2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.Group2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.GroupName2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.GroupName2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.FormViewCompInFormCajonEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.FormViewCompInFormCajonEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajonEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajonEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.ClassAtributoInClassCajonEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.ClassAtributoInClassCajonEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajon2EditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajon2EditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.PageCompVIewInPageCajonEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.PageCompVIewInPageCajonEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.MenuGrupoInMenuCajonEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewNameEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart(
						view);

			case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassNameEditPart.VISUAL_ID:
				return new Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassNameEditPart(
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
