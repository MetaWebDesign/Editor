package Metawebdesign.metawebdesign.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassAttributoInClassCajonItemSemanticEditPolicy
		extends
		Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassAttributoInClassCajonItemSemanticEditPolicy() {
		super(
				Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3001 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.Derived2CreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3002 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.NotDerived2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
