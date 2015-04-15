package Modeluno.modeluno.diagram.edit.policies;

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
		Modeluno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MapItemSemanticEditPolicy() {
		super(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Map_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2004 == req
				.getElementType()) {
			return getGEFWrapper(new Modeluno.modeluno.diagram.edit.commands.ClassCreateCommand(
					req));
		}
		if (Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ADerived_2005 == req
				.getElementType()) {
			return getGEFWrapper(new Modeluno.modeluno.diagram.edit.commands.ADerivedCreateCommand(
					req));
		}
		if (Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ANotDerived_2006 == req
				.getElementType()) {
			return getGEFWrapper(new Modeluno.modeluno.diagram.edit.commands.ANotDerivedCreateCommand(
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
