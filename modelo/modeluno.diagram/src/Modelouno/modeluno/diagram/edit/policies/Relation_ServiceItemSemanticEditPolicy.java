package Modelouno.modeluno.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class Relation_ServiceItemSemanticEditPolicy
		extends
		Modelouno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Relation_ServiceItemSemanticEditPolicy() {
		super(
				Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
