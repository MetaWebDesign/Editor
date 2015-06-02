package Modelouno.modeluno.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class PresetationUnitItemSemanticEditPolicy
		extends
		Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PresetationUnitItemSemanticEditPolicy() {
		super(
				Modelouno.modeluno.diagram.providers.ModelunoElementTypes.PresetationUnit_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
