package Metawebdesign.metawebdesign.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class RootItemSemanticEditPolicy
		extends
		Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RootItemSemanticEditPolicy() {
		super(
				Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Root_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_2001 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.LinkViewCRUDCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.CallAtribute_2010 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.CallAtributeCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_2006 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.DerivedCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2004 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.ClassCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_2009 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.LinkViewCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_2011 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.GroupCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Menu_2002 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.MenuCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_2005 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.NotDerivedCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2007 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.ConstraintCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2003 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.PageCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2008 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.FormCreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2012 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.NavegationMenuCreateCommand(
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
