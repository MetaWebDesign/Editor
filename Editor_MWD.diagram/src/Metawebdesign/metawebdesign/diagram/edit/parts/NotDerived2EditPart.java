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
public class NotDerived2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3007;

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
	public NotDerived2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Metawebdesign.metawebdesign.diagram.edit.policies.NotDerived2ItemSemanticEditPolicy());
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
		return primaryShape = new NotDerivedFigure();
	}

	/**
	 * @generated
	 */
	public NotDerivedFigure getPrimaryShape() {
		return (NotDerivedFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart) {
			((Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureNotDerivedNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart) {
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
				.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class NotDerivedFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotDerivedNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotDerivedRolFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotDerivedValueFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotDerivedPrimaryKeyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotDerivedDataTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotDerivedInTheFormFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNotDerivedValueDefaultFigure;

		/**
		 * @generated
		 */
		public NotDerivedFigure() {
			this.setLineWidth(0);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(16)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureNotDerivedNameFigure = new WrappingLabel();

			fFigureNotDerivedNameFigure.setText("<...>");

			this.add(fFigureNotDerivedNameFigure);

			fFigureNotDerivedRolFigure = new WrappingLabel();

			fFigureNotDerivedRolFigure.setText("<...>");

			this.add(fFigureNotDerivedRolFigure);

			fFigureNotDerivedValueFigure = new WrappingLabel();

			fFigureNotDerivedValueFigure.setText("<...>");

			this.add(fFigureNotDerivedValueFigure);

			fFigureNotDerivedPrimaryKeyFigure = new WrappingLabel();

			fFigureNotDerivedPrimaryKeyFigure.setText("<...>");

			this.add(fFigureNotDerivedPrimaryKeyFigure);

			fFigureNotDerivedDataTypeFigure = new WrappingLabel();

			fFigureNotDerivedDataTypeFigure.setText("<...>");

			this.add(fFigureNotDerivedDataTypeFigure);

			fFigureNotDerivedInTheFormFigure = new WrappingLabel();

			fFigureNotDerivedInTheFormFigure.setText("<...>");

			this.add(fFigureNotDerivedInTheFormFigure);

			fFigureNotDerivedValueDefaultFigure = new WrappingLabel();

			fFigureNotDerivedValueDefaultFigure.setText("<...>");

			this.add(fFigureNotDerivedValueDefaultFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotDerivedNameFigure() {
			return fFigureNotDerivedNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotDerivedRolFigure() {
			return fFigureNotDerivedRolFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotDerivedValueFigure() {
			return fFigureNotDerivedValueFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotDerivedPrimaryKeyFigure() {
			return fFigureNotDerivedPrimaryKeyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotDerivedDataTypeFigure() {
			return fFigureNotDerivedDataTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotDerivedInTheFormFigure() {
			return fFigureNotDerivedInTheFormFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNotDerivedValueDefaultFigure() {
			return fFigureNotDerivedValueDefaultFigure;
		}

	}

}
