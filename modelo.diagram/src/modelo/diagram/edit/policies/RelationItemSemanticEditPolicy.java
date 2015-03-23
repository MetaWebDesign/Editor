package modelo.diagram.edit.policies;

import modelo.diagram.providers.ModeloElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class RelationItemSemanticEditPolicy extends
		ModeloBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationItemSemanticEditPolicy() {
		super(ModeloElementTypes.Relation_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
