package Modeldos.modeldos.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassAttributeInClassCajaItemSemanticEditPolicy
		extends
		Modeldos.modeldos.diagram.edit.policies.ModeldosBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassAttributeInClassCajaItemSemanticEditPolicy() {
		super(
				Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Modeldos.modeldos.diagram.providers.ModeldosElementTypes.NotDerived_3002 == req
				.getElementType()) {
			return getGEFWrapper(new Modeldos.modeldos.diagram.edit.commands.NotDerived2CreateCommand(
					req));
		}
		if (Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Derived_3003 == req
				.getElementType()) {
			return getGEFWrapper(new Modeldos.modeldos.diagram.edit.commands.Derived2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
