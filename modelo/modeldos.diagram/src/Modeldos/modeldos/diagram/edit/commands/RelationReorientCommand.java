package Modeldos.modeldos.diagram.edit.commands;

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
public class RelationReorientCommand extends EditElementCommand {

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
	public RelationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Modeldos.modeldos.Relation) {
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
		if (!(oldEnd instanceof Modeldos.modeldos.Class && newEnd instanceof Modeldos.modeldos.Class)) {
			return false;
		}
		if (getLink().getR2().size() != 1) {
			return false;
		}
		Modeldos.modeldos.Class target = (Modeldos.modeldos.Class) getLink()
				.getR2().get(0);
		return Modeldos.modeldos.diagram.edit.policies.ModeldosBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelation_4001(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Modeldos.modeldos.Class && newEnd instanceof Modeldos.modeldos.Class)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Modeldos.modeldos.Class)) {
			return false;
		}
		Modeldos.modeldos.Class source = (Modeldos.modeldos.Class) getLink()
				.eContainer();
		return Modeldos.modeldos.diagram.edit.policies.ModeldosBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelation_4001(getLink(), source,
						getNewTarget());
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
		getOldSource().getHasRelation().remove(getLink());
		getNewSource().getHasRelation().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getR2().remove(getOldTarget());
		getLink().getR2().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.Relation getLink() {
		return (Modeldos.modeldos.Relation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.Class getOldSource() {
		return (Modeldos.modeldos.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.Class getNewSource() {
		return (Modeldos.modeldos.Class) newEnd;
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.Class getOldTarget() {
		return (Modeldos.modeldos.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.Class getNewTarget() {
		return (Modeldos.modeldos.Class) newEnd;
	}
}
