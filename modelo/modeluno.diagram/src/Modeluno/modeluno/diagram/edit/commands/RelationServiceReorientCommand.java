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
public class RelationServiceReorientCommand extends EditElementCommand {

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
	public RelationServiceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Modeluno.modeluno.RelationService) {
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
		if (!(oldEnd instanceof Modeluno.modeluno.Class && newEnd instanceof Modeluno.modeluno.Class)) {
			return false;
		}
		Modeluno.modeluno.Service target = getLink().getGoService();
		return Modeluno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationService_4001(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Modeluno.modeluno.Service && newEnd instanceof Modeluno.modeluno.Service)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Modeluno.modeluno.Class)) {
			return false;
		}
		Modeluno.modeluno.Class source = (Modeluno.modeluno.Class) getLink()
				.eContainer();
		return Modeluno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationService_4001(getLink(),
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
		getOldSource().getHasServiceRelation().remove(getLink());
		getNewSource().getHasServiceRelation().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setGoService(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.RelationService getLink() {
		return (Modeluno.modeluno.RelationService) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Class getOldSource() {
		return (Modeluno.modeluno.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Class getNewSource() {
		return (Modeluno.modeluno.Class) newEnd;
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Service getOldTarget() {
		return (Modeluno.modeluno.Service) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Service getNewTarget() {
		return (Modeluno.modeluno.Service) newEnd;
	}
}
