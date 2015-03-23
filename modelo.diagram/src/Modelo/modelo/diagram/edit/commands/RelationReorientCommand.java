package Modelo.modelo.diagram.edit.commands;

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
		if (false == getElementToEdit() instanceof Modelo.modelo.Relation) {
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
		if (!(oldEnd instanceof Modelo.modelo.Class && newEnd instanceof Modelo.modelo.Class)) {
			return false;
		}
		if (getLink().getTo().size() != 1) {
			return false;
		}
		Modelo.modelo.Class target = (Modelo.modelo.Class) getLink().getTo()
				.get(0);
		return Modelo.modelo.diagram.edit.policies.ModeloBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelation_4001(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Modelo.modelo.Class && newEnd instanceof Modelo.modelo.Class)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Modelo.modelo.Class)) {
			return false;
		}
		Modelo.modelo.Class source = (Modelo.modelo.Class) getLink()
				.eContainer();
		return Modelo.modelo.diagram.edit.policies.ModeloBaseItemSemanticEditPolicy
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
		getOldSource().getHasRelaction().remove(getLink());
		getNewSource().getHasRelaction().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getTo().remove(getOldTarget());
		getLink().getTo().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Modelo.modelo.Relation getLink() {
		return (Modelo.modelo.Relation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Modelo.modelo.Class getOldSource() {
		return (Modelo.modelo.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modelo.modelo.Class getNewSource() {
		return (Modelo.modelo.Class) newEnd;
	}

	/**
	 * @generated
	 */
	protected Modelo.modelo.Class getOldTarget() {
		return (Modelo.modelo.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modelo.modelo.Class getNewTarget() {
		return (Modelo.modelo.Class) newEnd;
	}
}
