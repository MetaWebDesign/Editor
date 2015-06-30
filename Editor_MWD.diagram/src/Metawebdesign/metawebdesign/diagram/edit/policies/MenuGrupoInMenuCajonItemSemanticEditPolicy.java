package Metawebdesign.metawebdesign.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MenuGrupoInMenuCajonItemSemanticEditPolicy
		extends
		Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MenuGrupoInMenuCajonItemSemanticEditPolicy() {
		super(
				Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Menu_2011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Group_3007 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.Group2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
