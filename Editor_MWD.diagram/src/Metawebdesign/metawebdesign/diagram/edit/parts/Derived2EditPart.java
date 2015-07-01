package Metawebdesign.metawebdesign.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Derived2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

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
	public Derived2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Metawebdesign.metawebdesign.diagram.edit.policies.Derived2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
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
		return primaryShape = new DerivedFigure();
	}

	/**
	 * @generated
	 */
	public DerivedFigure getPrimaryShape() {
		return (DerivedFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart) {
			((Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDerivedNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 16);
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
		return getChildBySemanticHint(Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getType(Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class DerivedFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedRolFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedValueFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedPrimaryKeyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedDataTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedInTheFormFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedCommentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedFormulaFigure;

		/**
		 * @generated
		 */
		public DerivedFigure() {
			this.setLineWidth(0);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(16)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDerivedNameFigure = new WrappingLabel();

			fFigureDerivedNameFigure.setText("<...>");

			this.add(fFigureDerivedNameFigure);

			fFigureDerivedRolFigure = new WrappingLabel();

			fFigureDerivedRolFigure.setText("<...>");

			this.add(fFigureDerivedRolFigure);

			fFigureDerivedValueFigure = new WrappingLabel();

			fFigureDerivedValueFigure.setText("<...>");

			this.add(fFigureDerivedValueFigure);

			fFigureDerivedPrimaryKeyFigure = new WrappingLabel();

			fFigureDerivedPrimaryKeyFigure.setText("<...>");

			this.add(fFigureDerivedPrimaryKeyFigure);

			fFigureDerivedDataTypeFigure = new WrappingLabel();

			fFigureDerivedDataTypeFigure.setText("<...>");

			this.add(fFigureDerivedDataTypeFigure);

			fFigureDerivedInTheFormFigure = new WrappingLabel();

			fFigureDerivedInTheFormFigure.setText("<...>");

			this.add(fFigureDerivedInTheFormFigure);

			fFigureDerivedCommentFigure = new WrappingLabel();

			fFigureDerivedCommentFigure.setText("<...>");

			this.add(fFigureDerivedCommentFigure);

			fFigureDerivedFormulaFigure = new WrappingLabel();

			fFigureDerivedFormulaFigure.setText("<...>");

			this.add(fFigureDerivedFormulaFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedNameFigure() {
			return fFigureDerivedNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedRolFigure() {
			return fFigureDerivedRolFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedValueFigure() {
			return fFigureDerivedValueFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedPrimaryKeyFigure() {
			return fFigureDerivedPrimaryKeyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedDataTypeFigure() {
			return fFigureDerivedDataTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedInTheFormFigure() {
			return fFigureDerivedInTheFormFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedCommentFigure() {
			return fFigureDerivedCommentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedFormulaFigure() {
			return fFigureDerivedFormulaFigure;
		}

	}

}
