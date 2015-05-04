package Modeluno.modeluno.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Attribute_DerivedEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2010;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Attribute_DerivedEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Modeluno.modeluno.diagram.edit.policies.Attribute_DerivedItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new Attribute_DerivedFigure();
	}

	/**
	 * @generated
	 */
	public Attribute_DerivedFigure getPrimaryShape() {
		return (Attribute_DerivedFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart) {
			((Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAttribute_DerivedAnameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart) {
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
		super.addChildVisual(childEditPart, -1);
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
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getType(Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class Attribute_DerivedFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedAnameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedDataTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedPermissionsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedDerivationCommentsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedConditionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedEffectFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedFormulaFigure;

		/**
		 * @generated
		 */
		public Attribute_DerivedFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAttribute_DerivedAnameFigure = new WrappingLabel();

			fFigureAttribute_DerivedAnameFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedAnameFigure);

			fFigureAttribute_DerivedDataTypeFigure = new WrappingLabel();

			fFigureAttribute_DerivedDataTypeFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedDataTypeFigure);

			fFigureAttribute_DerivedPermissionsFigure = new WrappingLabel();

			fFigureAttribute_DerivedPermissionsFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedPermissionsFigure);

			fFigureAttribute_DerivedDerivationCommentsFigure = new WrappingLabel();

			fFigureAttribute_DerivedDerivationCommentsFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedDerivationCommentsFigure);

			fFigureAttribute_DerivedConditionFigure = new WrappingLabel();

			fFigureAttribute_DerivedConditionFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedConditionFigure);

			fFigureAttribute_DerivedEffectFigure = new WrappingLabel();

			fFigureAttribute_DerivedEffectFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedEffectFigure);

			fFigureAttribute_DerivedFormulaFigure = new WrappingLabel();

			fFigureAttribute_DerivedFormulaFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedFormulaFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedAnameFigure() {
			return fFigureAttribute_DerivedAnameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedDataTypeFigure() {
			return fFigureAttribute_DerivedDataTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedPermissionsFigure() {
			return fFigureAttribute_DerivedPermissionsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedDerivationCommentsFigure() {
			return fFigureAttribute_DerivedDerivationCommentsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedConditionFigure() {
			return fFigureAttribute_DerivedConditionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedEffectFigure() {
			return fFigureAttribute_DerivedEffectFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedFormulaFigure() {
			return fFigureAttribute_DerivedFormulaFigure;
		}

	}

}
