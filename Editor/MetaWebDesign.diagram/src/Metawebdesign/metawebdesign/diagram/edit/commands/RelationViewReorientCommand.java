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
		if (false == getElementToEdit() instanceof Metawebdesign.metawebdesign.RelationView) {
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
		if (!(oldEnd instanceof Metawebdesign.metawebdesign.Views && newEnd instanceof Metawebdesign.metawebdesign.Views)) {
			return false;
		}
		if (getLink().getFromClass().size() != 1) {
			return false;
		}
		Metawebdesign.metawebdesign.Class target = (Metawebdesign.metawebdesign.Class) getLink()
				.getFromClass().get(0);
		return Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationView_4002(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Metawebdesign.metawebdesign.Class && newEnd instanceof Metawebdesign.metawebdesign.Class)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Metawebdesign.metawebdesign.Views)) {
			return false;
		}
		Metawebdesign.metawebdesign.Views source = (Metawebdesign.metawebdesign.Views) getLink()
				.eContainer();
		return Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationView_4002(getLink(),
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
		getOldSource().getHasRelationView().remove(getLink());
		getNewSource().getHasRelationView().add(getLink());
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
	protected Metawebdesign.metawebdesign.RelationView getLink() {
		return (Metawebdesign.metawebdesign.RelationView) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.Views getOldSource() {
		return (Metawebdesign.metawebdesign.Views) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Metawebdesign.metawebdesign.Views getNewSource() {
		return (Metawebdesign.metawebdesign.Views) newEnd;
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
