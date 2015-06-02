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
public class Relation_ViewReorientCommand extends EditElementCommand {

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
	public Relation_ViewReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Modelouno.modeluno.Relation_View) {
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
		if (!(oldEnd instanceof Modelouno.modeluno.Service && newEnd instanceof Modelouno.modeluno.Service)) {
			return false;
		}
		Modelouno.modeluno.Views target = getLink().getGoToView();
		return Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelation_View_4002(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Modelouno.modeluno.Views && newEnd instanceof Modelouno.modeluno.Views)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Modelouno.modeluno.Service)) {
			return false;
		}
		Modelouno.modeluno.Service source = (Modelouno.modeluno.Service) getLink()
				.eContainer();
		return Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelation_View_4002(getLink(),
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
	protected Modelouno.modeluno.Relation_View getLink() {
		return (Modelouno.modeluno.Relation_View) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Service getOldSource() {
		return (Modelouno.modeluno.Service) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Service getNewSource() {
		return (Modelouno.modeluno.Service) newEnd;
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Views getOldTarget() {
		return (Modelouno.modeluno.Views) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Views getNewTarget() {
		return (Modelouno.modeluno.Views) newEnd;
	}
}
