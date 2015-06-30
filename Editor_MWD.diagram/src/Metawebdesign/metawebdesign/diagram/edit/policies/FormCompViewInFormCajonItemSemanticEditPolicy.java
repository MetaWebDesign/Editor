package Metawebdesign.metawebdesign.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class FormCompViewInFormCajonItemSemanticEditPolicy
		extends
		Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FormCompViewInFormCajonItemSemanticEditPolicy() {
		super(
				Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.CallAtribute_3005 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.CallAtribute2CreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3006 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.NavegationMenu2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
