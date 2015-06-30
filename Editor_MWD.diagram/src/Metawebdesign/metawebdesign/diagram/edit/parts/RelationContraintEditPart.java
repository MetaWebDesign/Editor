package Metawebdesign.metawebdesign.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RelationContraintEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public RelationContraintEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Metawebdesign.metawebdesign.diagram.edit.policies.RelationContraintItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintNameEditPart) {
			((Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRelationContraintNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintNameEditPart) {
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
		return new RelationContraintFigure();
	}

	/**
	 * @generated
	 */
	public RelationContraintFigure getPrimaryShape() {
		return (RelationContraintFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RelationContraintFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRelationContraintNameFigure;

		/**
		 * @generated
		 */
		public RelationContraintFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRelationContraintNameFigure = new WrappingLabel();

			fFigureRelationContraintNameFigure.setText("<...>");

			this.add(fFigureRelationContraintNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRelationContraintNameFigure() {
			return fFigureRelationContraintNameFigure;
		}

	}

}
