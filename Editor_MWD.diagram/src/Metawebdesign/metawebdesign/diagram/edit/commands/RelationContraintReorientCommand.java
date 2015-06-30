package Metawebdesign.metawebdesign.diagram.edit.commands;

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
public class RelationContraintReorientCommand extends EditElementCommand {

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
	public RelationContraintReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Metawebdesign.metawebdesign.RelationContraint) {
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
		if (!(oldEnd instanceof Metawebdesign.metawebdesign.Class && newEnd instanceof Metawebdesign.metawebdesign.Class)) {
			return false;
		}
		if (getLink().getGoRConstraint2().size() != 1) {
			return false;
		}
		Metawebdesign.metawebdesign.Constraint target = (Metawebdesign.metawebdesign.Constraint) getLink()
				.getGoRConstraint2().get(0);
		return Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationContraint_4001(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Metawebdesign.metawebdesign.Constraint && newEnd instanceof Metawebdesign.metawebdesign.Constraint)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Metawebdesign.metawebdesign.Class)) {
			return false;
		}
		Metawebdesign.metawebdesign.Class source = (Metawebdesign.metawebdesign.Class) getLink()
				.eContainer();
		return Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationContraint_4001(getLink(),
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
		getOldSource().getHasRelationConstraint().remove(getLink());
		getNewSource().getHasRelationConstraint().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getGoRConstraint2().remove(getOldTarget());
		getLink().getGoRConstraint2().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.RelationContraint getLink() {
		return (Metawebdesign.metawebdesign.RelationContraint) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.Class getOldSource() {
		return (Metawebdesign.metawebdesign.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.Class getNewSource() {
		return (Metawebdesign.metawebdesign.Class) newEnd;
	}

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.Constraint getOldTarget() {
		return (Metawebdesign.metawebdesign.Constraint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.Constraint getNewTarget() {
		return (Metawebdesign.metawebdesign.Constraint) newEnd;
	}
}
