package Modeldos.modeldos.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MenuGrupoInMenuCajonItemSemanticEditPolicy
		extends
		Modeldos.modeldos.diagram.edit.policies.ModeldosBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MenuGrupoInMenuCajonItemSemanticEditPolicy() {
		super(
				Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Menu_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Group_3003 == req
				.getElementType()) {
			return getGEFWrapper(new Modeldos.modeldos.diagram.edit.commands.Group2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
