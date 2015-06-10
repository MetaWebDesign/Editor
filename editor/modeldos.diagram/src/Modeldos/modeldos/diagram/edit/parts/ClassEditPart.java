package Modeldos.modeldos.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
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
public class ClassEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

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
	public ClassEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Modeldos.modeldos.diagram.edit.policies.ClassItemSemanticEditPolicy());
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
		return primaryShape = new ClassFigure();
	}

	/**
	 * @generated
	 */
	public ClassFigure getPrimaryShape() {
		return (ClassFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Modeldos.modeldos.diagram.edit.parts.ClassNameEditPart) {
			((Modeldos.modeldos.diagram.edit.parts.ClassNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureClassNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Modeldos.modeldos.diagram.edit.parts.ClassNameEditPart) {
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
		return getChildBySemanticHint(Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getType(Modeldos.modeldos.diagram.edit.parts.ClassNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ClassFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureClassNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClassIdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClassFunctionCreateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClassFunctionDeleteFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClassFunctionUpdateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClassFunctionIndexFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClassFunctionViewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClassFunctionAdminFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureCajonAttribute;

		/**
		 * @generated
		 */
		public ClassFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureClassNameFigure = new WrappingLabel();

			fFigureClassNameFigure.setText("<...>");

			this.add(fFigureClassNameFigure, BorderLayout.TOP);

			fFigureClassIdFigure = new WrappingLabel();

			fFigureClassIdFigure.setText("<...>");

			this.add(fFigureClassIdFigure);

			fFigureClassFunctionCreateFigure = new WrappingLabel();

			fFigureClassFunctionCreateFigure.setText("<...>");

			this.add(fFigureClassFunctionCreateFigure);

			fFigureClassFunctionDeleteFigure = new WrappingLabel();

			fFigureClassFunctionDeleteFigure.setText("<...>");

			this.add(fFigureClassFunctionDeleteFigure);

			fFigureClassFunctionUpdateFigure = new WrappingLabel();

			fFigureClassFunctionUpdateFigure.setText("<...>");

			this.add(fFigureClassFunctionUpdateFigure);

			fFigureClassFunctionIndexFigure = new WrappingLabel();

			fFigureClassFunctionIndexFigure.setText("<...>");

			this.add(fFigureClassFunctionIndexFigure);

			fFigureClassFunctionViewFigure = new WrappingLabel();

			fFigureClassFunctionViewFigure.setText("<...>");

			this.add(fFigureClassFunctionViewFigure);

			fFigureClassFunctionAdminFigure = new WrappingLabel();

			fFigureClassFunctionAdminFigure.setText("<...>");

			this.add(fFigureClassFunctionAdminFigure);

			fFigureCajonAttribute = new RectangleFigure();

			this.add(fFigureCajonAttribute, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClassNameFigure() {
			return fFigureClassNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClassIdFigure() {
			return fFigureClassIdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClassFunctionCreateFigure() {
			return fFigureClassFunctionCreateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClassFunctionDeleteFigure() {
			return fFigureClassFunctionDeleteFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClassFunctionUpdateFigure() {
			return fFigureClassFunctionUpdateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClassFunctionIndexFigure() {
			return fFigureClassFunctionIndexFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClassFunctionViewFigure() {
			return fFigureClassFunctionViewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClassFunctionAdminFigure() {
			return fFigureClassFunctionAdminFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCajonAttribute() {
			return fFigureCajonAttribute;
		}

	}

}
