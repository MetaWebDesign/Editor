package Modeldos.modeldos.diagram.part;

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
public class ModeldosVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "modeldos.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Modeldos.modeldos.diagram.edit.parts.RootEditPart.MODEL_ID
					.equals(view.getType())) {
				return Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
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
				Modeldos.modeldos.diagram.part.ModeldosDiagramEditorPlugin
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
		if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getRoot()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Modeldos.modeldos.Root) domainElement)) {
			return Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID;
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
		String containerModelID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getModelID(containerView);
		if (!Modeldos.modeldos.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (Modeldos.modeldos.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID:
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getClass_()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID;
			}
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getForm()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID;
			}
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getPage()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID;
			}
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID;
			}
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getMenu()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID;
			}
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getDerived()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID;
			}
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getNotDerived()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.ClassAttributeInClassCajonEditPart.VISUAL_ID:
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getNotDerived()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID;
			}
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getDerived()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID:
			if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getGroup()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getModelID(containerView);
		if (!Modeldos.modeldos.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (Modeldos.modeldos.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeldos.modeldos.diagram.edit.parts.ClassAttributeInClassCajonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.FormTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.PageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.MenuNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeldos.modeldos.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.DerivedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.NotDerivedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.NotDerivedName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.DerivedName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.ClassAttributeInClassCajonEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			if (Modeldos.modeldos.diagram.edit.parts.RelationClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
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
		if (Modeldos.modeldos.ModeldosPackage.eINSTANCE.getRelationClass()
				.isSuperTypeOf(domainElement.eClass())) {
			return Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Modeldos.modeldos.Root element) {
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
		switch (visualID) {
		case Modeldos.modeldos.diagram.edit.parts.ClassAttributeInClassCajonEditPart.VISUAL_ID:
		case Modeldos.modeldos.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return false;
		case Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID:
		case Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID:
		case Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID:
		case Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
		case Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
		case Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
		case Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return true;
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
			return Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}