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
public class PresetationUnitReorientCommand extends EditElementCommand {

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
	public PresetationUnitReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Modelouno.modeluno.PresetationUnit) {
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
		if (!(oldEnd instanceof Modelouno.modeluno.Attribute && newEnd instanceof Modelouno.modeluno.Attribute)) {
			return false;
		}
		Modelouno.modeluno.Views target = getLink().getPUgoToViews();
		return Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPresetationUnit_4005(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Modelouno.modeluno.Views && newEnd instanceof Modelouno.modeluno.Views)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Modelouno.modeluno.Attribute)) {
			return false;
		}
		Modelouno.modeluno.Attribute source = (Modelouno.modeluno.Attribute) getLink()
				.eContainer();
		return Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPresetationUnit_4005(getLink(),
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
		getOldSource().setHasPresentationUnit(null);
		getNewSource().setHasPresentationUnit(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setPUgoToViews(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.PresetationUnit getLink() {
		return (Modelouno.modeluno.PresetationUnit) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Attribute getOldSource() {
		return (Modelouno.modeluno.Attribute) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modelouno.modeluno.Attribute getNewSource() {
		return (Modelouno.modeluno.Attribute) newEnd;
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
