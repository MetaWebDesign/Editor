package Modelouno.modeluno.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class MapItemSemanticEditPolicy
		extends
		Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MapItemSemanticEditPolicy() {
		super(
				Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Map_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Create_2001 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.CreateCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewIndex_2002 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.ViewIndexCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateObject_2003 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.ViewUpdateObjectCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2004 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.AdminCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Class_2005 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.ClassCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2006 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.UpdateObjectCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Page_2007 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.PageCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2008 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.DeleteCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewAdmin_2009 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.ViewAdminCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateAttribute_2010 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.ViewUpdateAttributeCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewAttribute_2011 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.ViewAttributeCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Index_2012 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.IndexCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.View_2013 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.ViewCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateAttribute_2014 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.UpdateAttributeCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2015 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.Attribute_Not_DerivedCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewInput_2016 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.ViewInputCreateCommand(
					req));
		}
		if (Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2017 == req
				.getElementType()) {
			return getGEFWrapper(new Modelouno.modeluno.diagram.edit.commands.Attribute_DerivedCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
