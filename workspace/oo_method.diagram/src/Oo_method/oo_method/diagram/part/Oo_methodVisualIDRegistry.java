package Oo_method.oo_method.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Oo_methodVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "oo_method.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.MODEL_ID
					.equals(view.getType())) {
				return Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				Oo_method.oo_method.diagram.part.Oo_methodDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Oo_method.oo_method.Oo_methodPackage.eINSTANCE.getStructuralModel()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Oo_method.oo_method.StructuralModel) domainElement)) {
			return Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getModelID(containerView);
		if (!Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
				.getModelID(containerView);
		if (!Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Oo_method.oo_method.StructuralModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case Oo_method.oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID:
			return false;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return Oo_method.oo_method.diagram.part.Oo_methodVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
