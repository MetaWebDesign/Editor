package Modelouno.modeluno.diagram.edit.parts;

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
public class PresetationUnitEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public PresetationUnitEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Modelouno.modeluno.diagram.edit.policies.PresetationUnitItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Modelouno.modeluno.diagram.edit.parts.PresetationUnitName_fieldEditPart) {
			((Modelouno.modeluno.diagram.edit.parts.PresetationUnitName_fieldEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePresetationUnitName_fieldFigure());
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
		if (childEditPart instanceof Modelouno.modeluno.diagram.edit.parts.PresetationUnitName_fieldEditPart) {
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
		return new PresetationUnitFigure();
	}

	/**
	 * @generated
	 */
	public PresetationUnitFigure getPrimaryShape() {
		return (PresetationUnitFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class PresetationUnitFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePresetationUnitName_fieldFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePresetationUnitTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePresetationUnitHorizontalPositionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePresetationUnitVerticalPositionFigure;

		/**
		 * @generated
		 */
		public PresetationUnitFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePresetationUnitName_fieldFigure = new WrappingLabel();

			fFigurePresetationUnitName_fieldFigure.setText("<...>");

			this.add(fFigurePresetationUnitName_fieldFigure);

			fFigurePresetationUnitTypeFigure = new WrappingLabel();

			fFigurePresetationUnitTypeFigure.setText("<...>");

			this.add(fFigurePresetationUnitTypeFigure);

			fFigurePresetationUnitHorizontalPositionFigure = new WrappingLabel();

			fFigurePresetationUnitHorizontalPositionFigure.setText("<...>");

			this.add(fFigurePresetationUnitHorizontalPositionFigure);

			fFigurePresetationUnitVerticalPositionFigure = new WrappingLabel();

			fFigurePresetationUnitVerticalPositionFigure.setText("<...>");

			this.add(fFigurePresetationUnitVerticalPositionFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePresetationUnitName_fieldFigure() {
			return fFigurePresetationUnitName_fieldFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePresetationUnitTypeFigure() {
			return fFigurePresetationUnitTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePresetationUnitHorizontalPositionFigure() {
			return fFigurePresetationUnitHorizontalPositionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePresetationUnitVerticalPositionFigure() {
			return fFigurePresetationUnitVerticalPositionFigure;
		}

	}

}
