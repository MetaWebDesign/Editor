package Modelouno.modeluno.diagram.edit.parts;

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
	public static final int VISUAL_ID = 2017;

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
				new Modelouno.modeluno.diagram.edit.policies.Attribute_DerivedItemSemanticEditPolicy());
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
		if (childEditPart instanceof Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart) {
			((Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAttribute_DerivedPrimaryKeyFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart) {
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
		return getChildBySemanticHint(Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getType(Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class Attribute_DerivedFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedPrimaryKeyFigure;
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
		private WrappingLabel fFigureAttribute_DerivedRolFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedInTheFormFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedValorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAttribute_DerivedDerivationCommentsFigure;
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

			fFigureAttribute_DerivedPrimaryKeyFigure = new WrappingLabel();

			fFigureAttribute_DerivedPrimaryKeyFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedPrimaryKeyFigure);

			fFigureAttribute_DerivedAnameFigure = new WrappingLabel();

			fFigureAttribute_DerivedAnameFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedAnameFigure);

			fFigureAttribute_DerivedDataTypeFigure = new WrappingLabel();

			fFigureAttribute_DerivedDataTypeFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedDataTypeFigure);

			fFigureAttribute_DerivedRolFigure = new WrappingLabel();

			fFigureAttribute_DerivedRolFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedRolFigure);

			fFigureAttribute_DerivedInTheFormFigure = new WrappingLabel();

			fFigureAttribute_DerivedInTheFormFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedInTheFormFigure);

			fFigureAttribute_DerivedValorFigure = new WrappingLabel();

			fFigureAttribute_DerivedValorFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedValorFigure);

			fFigureAttribute_DerivedDerivationCommentsFigure = new WrappingLabel();

			fFigureAttribute_DerivedDerivationCommentsFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedDerivationCommentsFigure);

			fFigureAttribute_DerivedFormulaFigure = new WrappingLabel();

			fFigureAttribute_DerivedFormulaFigure.setText("<...>");

			this.add(fFigureAttribute_DerivedFormulaFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedPrimaryKeyFigure() {
			return fFigureAttribute_DerivedPrimaryKeyFigure;
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
		public WrappingLabel getFigureAttribute_DerivedRolFigure() {
			return fFigureAttribute_DerivedRolFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedInTheFormFigure() {
			return fFigureAttribute_DerivedInTheFormFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttribute_DerivedValorFigure() {
			return fFigureAttribute_DerivedValorFigure;
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
		public WrappingLabel getFigureAttribute_DerivedFormulaFigure() {
			return fFigureAttribute_DerivedFormulaFigure;
		}

	}

}
