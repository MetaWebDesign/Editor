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
public class RelationClassReorientCommand extends EditElementCommand {

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
	public RelationClassReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Metawebdesign.metawebdesign.RelationClass) {
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
		if (getLink().getFromClass().size() != 1) {
			return false;
		}
		Metawebdesign.metawebdesign.Class target = (Metawebdesign.metawebdesign.Class) getLink()
				.getFromClass().get(0);
		return Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationClass_4001(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Metawebdesign.metawebdesign.Class && newEnd instanceof Metawebdesign.metawebdesign.Class)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Metawebdesign.metawebdesign.Class)) {
			return false;
		}
		Metawebdesign.metawebdesign.Class source = (Metawebdesign.metawebdesign.Class) getLink()
				.eContainer();
		return Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationClass_4001(getLink(),
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
		getOldSource().getHasRelationClass().remove(getLink());
		getNewSource().getHasRelationClass().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getFromClass().remove(getOldTarget());
		getLink().getFromClass().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.RelationClass getLink() {
		return (Metawebdesign.metawebdesign.RelationClass) getElementToEdit();
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
	protected Metawebdesign.metawebdesign.Class getOldTarget() {
		return (Metawebdesign.metawebdesign.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.Class getNewTarget() {
		return (Metawebdesign.metawebdesign.Class) newEnd;
	}
}
