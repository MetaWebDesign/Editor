package Metawebdesign.metawebdesign.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassCompartmentCajonClassItemSemanticEditPolicy
		extends
		Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassCompartmentCajonClassItemSemanticEditPolicy() {
		super(
				Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
<<<<<<< HEAD:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/policies/ClassCompartmentCajonClassItemSemanticEditPolicy.java
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_3007 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.Constraint2CreateCommand(
					req));
		}
=======
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/policies/ClassCompartmentCajonClassItemSemanticEditPolicy.java
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.Derived2CreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.NotDerived2CreateCommand(
					req));
		}
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_3007 == req
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.Constraint2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
