package Metawebdesign.metawebdesign.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PageCompartmentCajonPageItemSemanticEditPolicy
		extends
		Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PageCompartmentCajonPageItemSemanticEditPolicy() {
		super(
				Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3001 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.NavegationMenu2CreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.ViewAttribute_3004 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.ViewAttribute2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
