package Metawebdesign.metawebdesign.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class NavegationMenuCompartmentCajoNavMenuItemSemanticEditPolicy
		extends
		Metawebdesign.metawebdesign.diagram.edit.policies.MetaWebDesignBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NavegationMenuCompartmentCajoNavMenuItemSemanticEditPolicy() {
		super(
<<<<<<< HEAD:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/policies/NavegationMenuCompartmentCajoNavMenuItemSemanticEditPolicy.java
				Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_2007);
=======
				Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NavegationMenu_3001);
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/policies/NavegationMenuCompartmentCajoNavMenuItemSemanticEditPolicy.java
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
<<<<<<< HEAD:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/policies/NavegationMenuCompartmentCajoNavMenuItemSemanticEditPolicy.java
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3003 == req
=======
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3002 == req
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/policies/NavegationMenuCompartmentCajoNavMenuItemSemanticEditPolicy.java
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.LinkViewCRUD2CreateCommand(
					req));
		}
<<<<<<< HEAD:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/policies/NavegationMenuCompartmentCajoNavMenuItemSemanticEditPolicy.java
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3002 == req
=======
		if (Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3003 == req
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/policies/NavegationMenuCompartmentCajoNavMenuItemSemanticEditPolicy.java
				.getElementType()) {
			return getGEFWrapper(new Metawebdesign.metawebdesign.diagram.edit.commands.LinkView2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
