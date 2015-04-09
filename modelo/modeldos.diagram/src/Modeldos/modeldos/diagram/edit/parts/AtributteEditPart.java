package Modeldos.modeldos.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AtributteEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public AtributteEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Modeldos.modeldos.diagram.edit.policies.AtributteItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	/*
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Modeldos.modeldos.diagram.edit.parts.AtributteAnameEditPart) {
			((Modeldos.modeldos.diagram.edit.parts.AtributteAnameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAtributteAnameFigure());
			return true;
		}
		return false;
	}
    */
	/**
	 * @generated
	 */
	/*
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}*/

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Modeldos.modeldos.diagram.edit.parts.AtributteAnameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ClassHasAtributeFigure();
	}

	/**
	 * @generated
	 */
	public ClassHasAtributeFigure getPrimaryShape() {
		return (ClassHasAtributeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ClassHasAtributeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ClassHasAtributeFigure() {

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
