package Modelouno.modeluno.diagram.edit.commands;

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
public class Relation_ClassReorientCommand extends EditElementCommand {

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
	public Relation_ClassReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Modelouno.modeluno.Relation_Class) {
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
		if (!(oldEnd instanceof Modelouno.modeluno.Class && newEnd instanceof Modelouno.modeluno.Class)) {
			return false;
		}
		if (getLink().getGoClass().size() != 1) {
			return false;
		}
		Modelouno.modeluno.Class target = (Modelouno.modeluno.Class) getLink()
				.getGoClass().get(0);
		return Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelation_Class_4003(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Modelouno.modeluno.Class && newEnd instanceof Modelouno.modeluno.Class)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Modelouno.modeluno.Class)) {
			return false;
		}
		Modelouno.modeluno.Class source = (Modelouno.modeluno.Class) getLink()
				.eContainer();
		return Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelation_Class_4003(getLink(),
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
		getOldSource().getHasRelation().remove(getLink());
		getNewSource().getHasRelation().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getGoClass().remove(getOldTarget());
		getLink().getGoClass().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Relation_Class getLink() {
		return (Modelouno.modeluno.Relation_Class) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Class getOldSource() {
		return (Modelouno.modeluno.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Class getNewSource() {
		return (Modelouno.modeluno.Class) newEnd;
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Class getOldTarget() {
		return (Modelouno.modeluno.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Class getNewTarget() {
		return (Modelouno.modeluno.Class) newEnd;
	}
}
