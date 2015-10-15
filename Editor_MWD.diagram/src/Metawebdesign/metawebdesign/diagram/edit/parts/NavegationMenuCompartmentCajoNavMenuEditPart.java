package Metawebdesign.metawebdesign.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class NavegationMenuCompartmentCajoNavMenuEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
<<<<<<< HEAD:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/parts/NavegationMenuCompartmentCajoNavMenuEditPart.java
	public static final int VISUAL_ID = 7004;
=======
	public static final int VISUAL_ID = 7002;
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/parts/NavegationMenuCompartmentCajoNavMenuEditPart.java

	/**
	 * @generated
	 */
	public NavegationMenuCompartmentCajoNavMenuEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Metawebdesign.metawebdesign.diagram.part.Messages.NavegationMenuCompartmentCajoNavMenuEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Metawebdesign.metawebdesign.diagram.edit.policies.NavegationMenuCompartmentCajoNavMenuItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new Metawebdesign.metawebdesign.diagram.edit.policies.NavegationMenuCompartmentCajoNavMenuCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
<<<<<<< HEAD:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/parts/NavegationMenuCompartmentCajoNavMenuEditPart.java
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3003) {
				return this;
			}
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3002) {
=======
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkView_3002) {
				return this;
			}
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.LinkViewCRUD_3003) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/parts/NavegationMenuCompartmentCajoNavMenuEditPart.java
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
