package Modeluno.modeluno.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class RelationViewReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public RelationViewReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Modeluno.modeluno.RelationView) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Modeluno.modeluno.Service && newEnd instanceof Modeluno.modeluno.Service)) {
			return false;
		}
		Modeluno.modeluno.Views target = getLink().getGoToView();
		return Modeluno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationView_4007(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Modeluno.modeluno.Views && newEnd instanceof Modeluno.modeluno.Views)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Modeluno.modeluno.Service)) {
			return false;
		}
		Modeluno.modeluno.Service source = (Modeluno.modeluno.Service) getLink()
				.eContainer();
		return Modeluno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationView_4007(getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setHasRelationView(null);
		getNewSource().setHasRelationView(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setGoToView(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.RelationView getLink() {
		return (Modeluno.modeluno.RelationView) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Service getOldSource() {
		return (Modeluno.modeluno.Service) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Service getNewSource() {
		return (Modeluno.modeluno.Service) newEnd;
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Views getOldTarget() {
		return (Modeluno.modeluno.Views) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Views getNewTarget() {
		return (Modeluno.modeluno.Views) newEnd;
	}
}
