package Metawebdesign.metawebdesign.diagram.part;

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
public class MetaWebDesignVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Editor_MWD.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.MODEL_ID
					.equals(view.getType())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
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
				Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
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
		if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
				.getRoot().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Metawebdesign.metawebdesign.Root) domainElement)) {
			return Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID;
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
		String containerModelID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getModelID(containerView);
		if (!Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getClass_().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getDerived().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLinkView().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getNavegationMenu().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getForm().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getCallAtribute().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getPage().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLinkViewCRUD().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getNotDerived().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getMenu().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.MenuEditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.GroupEditPart.VISUAL_ID;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassAttributoInClassCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getDerived().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getNotDerived().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLinkView().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLinkViewCRUD().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormCompViewInFormCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getCallAtribute().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.CallAtribute2EditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getNavegationMenu().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajon2EditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLinkView().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getLinkViewCRUD().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageCompViewInPageCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getCallAtribute().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.CallAtribute2EditPart.VISUAL_ID;
			}
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getNavegationMenu().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Metawebdesign.metawebdesign.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getModelID(containerView);
		if (!Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.MenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.ClassAttributoInClassCajonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.DerivedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.FormTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.FormCompViewInFormCajonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.PageCompViewInPageCajonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.MenuNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.DerivedName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtribute2EditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajon2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassAttributoInClassCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormCompViewInFormCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.CallAtribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajon2EditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageCompViewInPageCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.CallAtribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			if (Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
				.getRelationClass().isSuperTypeOf(domainElement.eClass())) {
			return Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID;
		}
		if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
				.getRelationContraint().isSuperTypeOf(domainElement.eClass())) {
			return Metawebdesign.metawebdesign.diagram.edit.parts.RelationContraintEditPart.VISUAL_ID;
		}
		if (Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
				.getRelationView().isSuperTypeOf(domainElement.eClass())) {
			return Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Metawebdesign.metawebdesign.Root element) {
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
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassAttributoInClassCajonEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajonEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormCompViewInFormCajonEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuLinksInNavMenuCajon2EditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageCompViewInPageCajonEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.MenuGrupoInMenuCajonEditPart.VISUAL_ID:
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
		case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return false;
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtributeEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.GroupEditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.CallAtribute2EditPart.VISUAL_ID:
		case Metawebdesign.metawebdesign.diagram.edit.parts.Group2EditPart.VISUAL_ID:
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
			return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
