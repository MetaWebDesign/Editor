package Metawebdesign.metawebdesign.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MetaWebDesignDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getVisualID(view)) {
		case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getRoot_1000SemanticChildren(view);
<<<<<<< HEAD
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenuEditPart.VISUAL_ID:
			return getNavegationMenuCompartmentCajoNavMenu_7004SemanticChildren(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassCompartmentCajonClassEditPart.VISUAL_ID:
			return getClassCompartmentCajonClass_7003SemanticChildren(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart.VISUAL_ID:
			return getPageCompartmentCajonPage_7001SemanticChildren(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenu2EditPart.VISUAL_ID:
			return getNavegationMenuCompartmentCajoNavMenu_7002SemanticChildren(view);
=======
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart.VISUAL_ID:
			return getPageCompartmentCajonPage_7001SemanticChildren(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenuEditPart.VISUAL_ID:
			return getNavegationMenuCompartmentCajoNavMenu_7002SemanticChildren(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassCompartmentCajonClassEditPart.VISUAL_ID:
			return getClassCompartmentCajonClass_7003SemanticChildren(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenu2EditPart.VISUAL_ID:
			return getNavegationMenuCompartmentCajoNavMenu_7004SemanticChildren(view);
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getRoot_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Metawebdesign.metawebdesign.Root modelElement = (Metawebdesign.metawebdesign.Root) view
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor>();
<<<<<<< HEAD
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
				.hasNext();) {
			Metawebdesign.metawebdesign.Attributes childElement = (Metawebdesign.metawebdesign.Attributes) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID) {
=======
		for (Iterator<?> it = modelElement.getViews().iterator(); it.hasNext();) {
			Metawebdesign.metawebdesign.Views childElement = (Metawebdesign.metawebdesign.Views) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
<<<<<<< HEAD
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID) {
=======
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getView_component().iterator(); it
				.hasNext();) {
			Metawebdesign.metawebdesign.ViewComponent childElement = (Metawebdesign.metawebdesign.ViewComponent) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
<<<<<<< HEAD
		for (Iterator<?> it = modelElement.getClass_().iterator(); it.hasNext();) {
			Metawebdesign.metawebdesign.Class childElement = (Metawebdesign.metawebdesign.Class) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
=======
		for (Iterator<?> it = modelElement.getLink().iterator(); it.hasNext();) {
			Metawebdesign.metawebdesign.Link childElement = (Metawebdesign.metawebdesign.Link) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getViews().iterator(); it.hasNext();) {
			Metawebdesign.metawebdesign.Views childElement = (Metawebdesign.metawebdesign.Views) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
<<<<<<< HEAD
		for (Iterator<?> it = modelElement.getLink().iterator(); it.hasNext();) {
			Metawebdesign.metawebdesign.Link childElement = (Metawebdesign.metawebdesign.Link) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
=======
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		for (Iterator<?> it = modelElement.getConstraint().iterator(); it
				.hasNext();) {
			Metawebdesign.metawebdesign.Constraint childElement = (Metawebdesign.metawebdesign.Constraint) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
<<<<<<< HEAD
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getNavegationMenuCompartmentCajoNavMenu_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Metawebdesign.metawebdesign.NavegationMenu modelElement = (Metawebdesign.metawebdesign.NavegationMenu) containerView
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasLink().iterator(); it
=======
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				.hasNext();) {
			Metawebdesign.metawebdesign.Link childElement = (Metawebdesign.metawebdesign.Link) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
<<<<<<< HEAD
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID) {
=======
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
<<<<<<< HEAD
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID) {
=======
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getClassCompartmentCajonClass_7003SemanticChildren(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getPageCompartmentCajonPage_7001SemanticChildren(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Metawebdesign.metawebdesign.Class modelElement = (Metawebdesign.metawebdesign.Class) containerView
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor>();
		{
			Metawebdesign.metawebdesign.Constraint childElement = modelElement
					.getHasConstraint();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
<<<<<<< HEAD
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID) {
=======
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
			}
		}
<<<<<<< HEAD
		for (Iterator<?> it = modelElement.getHasAttributes().iterator(); it
=======
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getNavegationMenuCompartmentCajoNavMenu_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Metawebdesign.metawebdesign.NavegationMenu modelElement = (Metawebdesign.metawebdesign.NavegationMenu) containerView
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasLink().iterator(); it
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				.hasNext();) {
			Metawebdesign.metawebdesign.Attributes childElement = (Metawebdesign.metawebdesign.Attributes) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getPageCompartmentCajonPage_7001SemanticChildren(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getClassCompartmentCajonClass_7003SemanticChildren(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
<<<<<<< HEAD
		Metawebdesign.metawebdesign.Page modelElement = (Metawebdesign.metawebdesign.Page) containerView
=======
		Metawebdesign.metawebdesign.Class modelElement = (Metawebdesign.metawebdesign.Class) containerView
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasAttributes().iterator(); it
				.hasNext();) {
			Metawebdesign.metawebdesign.Attributes childElement = (Metawebdesign.metawebdesign.Attributes) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
<<<<<<< HEAD
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID) {
=======
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
<<<<<<< HEAD
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID) {
=======
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			Metawebdesign.metawebdesign.Constraint childElement = modelElement
					.getHasConstraint();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getNavegationMenuCompartmentCajoNavMenu_7002SemanticChildren(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getNavegationMenuCompartmentCajoNavMenu_7004SemanticChildren(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Metawebdesign.metawebdesign.NavegationMenu modelElement = (Metawebdesign.metawebdesign.NavegationMenu) containerView
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasLink().iterator(); it
				.hasNext();) {
			Metawebdesign.metawebdesign.Link childElement = (Metawebdesign.metawebdesign.Link) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getContainedLinks(
			View view) {
		switch (Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getVisualID(view)) {
		case Metawebdesign.metawebdesign.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getRoot_1000ContainedLinks(view);
<<<<<<< HEAD
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2006ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2002ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2009ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			return getNavegationMenu_2007ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2004ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2001ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			return getLinkViewCRUD_2010ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_2005ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			return getLinkView_2003ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			return getLinkViewCRUD_3003ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			return getLinkView_3002ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3007ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3005ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3006ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			return getNavegationMenu_3001ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID:
			return getViewAttribute_3004ContainedLinks(view);
=======
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2001ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2002ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			return getLinkView_2003ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2004ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_2005ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2006ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			return getNavegationMenu_2007ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2008ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2009ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			return getLinkViewCRUD_2010ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			return getNavegationMenu_3001ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			return getLinkView_3002ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			return getLinkViewCRUD_3003ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID:
			return getViewAttribute_3004ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3005ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3006ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3007ContainedLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getRelationView_4001ContainedLinks(view);
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getVisualID(view)) {
<<<<<<< HEAD
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2006IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2002IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2009IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			return getNavegationMenu_2007IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2004IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2001IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			return getLinkViewCRUD_2010IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_2005IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			return getLinkView_2003IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			return getLinkViewCRUD_3003IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			return getLinkView_3002IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3007IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3005IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3006IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			return getNavegationMenu_3001IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID:
			return getViewAttribute_3004IncomingLinks(view);
=======
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2001IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2002IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			return getLinkView_2003IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2004IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_2005IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2006IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			return getNavegationMenu_2007IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2008IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2009IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			return getLinkViewCRUD_2010IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			return getNavegationMenu_3001IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			return getLinkView_3002IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			return getLinkViewCRUD_3003IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID:
			return getViewAttribute_3004IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3005IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3006IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3007IncomingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getRelationView_4001IncomingLinks(view);
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getVisualID(view)) {
<<<<<<< HEAD
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2006OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2002OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2009OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			return getNavegationMenu_2007OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2004OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2001OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			return getLinkViewCRUD_2010OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_2005OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			return getLinkView_2003OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			return getLinkViewCRUD_3003OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			return getLinkView_3002OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3007OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3005OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3006OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			return getNavegationMenu_3001OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID:
			return getViewAttribute_3004OutgoingLinks(view);
=======
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2001OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2002OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewEditPart.VISUAL_ID:
			return getLinkView_2003OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2004OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart.VISUAL_ID:
			return getConstraint_2005OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2006OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuEditPart.VISUAL_ID:
			return getNavegationMenu_2007OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2008OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2009OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUDEditPart.VISUAL_ID:
			return getLinkViewCRUD_2010OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID:
			return getNavegationMenu_3001OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkView2EditPart.VISUAL_ID:
			return getLinkView_3002OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.LinkViewCRUD2EditPart.VISUAL_ID:
			return getLinkViewCRUD_3003OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID:
			return getViewAttribute_3004OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3005OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3006OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID:
			return getConstraint_3007OutgoingLinks(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getRelationView_4001OutgoingLinks(view);
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		case Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRoot_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_2006ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getPage_2001ContainedLinks(
			View view) {
		Metawebdesign.metawebdesign.Page modelElement = (Metawebdesign.metawebdesign.Page) view
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_2003ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getClass_2004ContainedLinks(
			View view) {
		Metawebdesign.metawebdesign.Class modelElement = (Metawebdesign.metawebdesign.Class) view
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationClass_4002(modelElement));
		return result;
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_2009ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_2005ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_2007ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_2006ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getClass_2004ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getForm_2008ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		Metawebdesign.metawebdesign.Class modelElement = (Metawebdesign.metawebdesign.Class) view
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
<<<<<<< HEAD
		result.addAll(getContainedTypeModelFacetLinks_RelationClass_4002(modelElement));
=======
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4001(modelElement));
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
		return result;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getPage_2001ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_2010ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_2010ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_3001ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_2005ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_3002ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_2003ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_3003ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_3003ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_3004ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_3002ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_3005ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_3007ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_3006ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_3005ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_3007ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_3006ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationView_4001ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_3001ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationClass_4002ContainedLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_3004ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getPage_2001IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationClass_4002ContainedLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_2002IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getClass_2004IncomingLinks(
			View view) {
		Metawebdesign.metawebdesign.Class modelElement = (Metawebdesign.metawebdesign.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationView_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RelationClass_4002(
				modelElement, crossReferences));
		return result;
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_2009IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_2005IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_2007IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_2006IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getClass_2004IncomingLinks(
			View view) {
		Metawebdesign.metawebdesign.Class modelElement = (Metawebdesign.metawebdesign.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationClass_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getPage_2001IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_2007IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_2010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_2005IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_2009IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_2003IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_2010IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_3003IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_3001IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_3007IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_3003IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_3005IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_3004IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_3006IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_3005IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_3001IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_3006IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_3004IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_3007IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationClass_4002IncomingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationView_4001IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_2006OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationClass_4002IncomingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_2002OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getPage_2001OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		Metawebdesign.metawebdesign.Page modelElement = (Metawebdesign.metawebdesign.Page) view
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_2009OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_2002OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_2007OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_2003OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getClass_2004OutgoingLinks(
			View view) {
		Metawebdesign.metawebdesign.Class modelElement = (Metawebdesign.metawebdesign.Class) view
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationClass_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getPage_2001OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_2007OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_2010OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getForm_2008OutgoingLinks(
			View view) {
		Metawebdesign.metawebdesign.Form modelElement = (Metawebdesign.metawebdesign.Form) view
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_2009OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_2005OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_2010OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_2003OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_3001OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_3003OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_3002OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_3002OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_3003OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_3007OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_3004OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_3001OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_3007OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_3004OutgoingLinks(
=======
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationView_4001OutgoingLinks(
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationClass_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
=======
	private static Collection<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getContainedTypeModelFacetLinks_RelationView_4001(
			Metawebdesign.metawebdesign.Views container) {
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationView().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Metawebdesign.metawebdesign.RelationView) {
				continue;
			}
			Metawebdesign.metawebdesign.RelationView link = (Metawebdesign.metawebdesign.RelationView) linkObject;
			if (Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID != Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getFromClass();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Metawebdesign.metawebdesign.Class) {
				continue;
			}
			Metawebdesign.metawebdesign.Class dst = (Metawebdesign.metawebdesign.Class) theTarget;
			result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor(
					container,
					dst,
					link,
					Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001,
					Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
	private static Collection<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getContainedTypeModelFacetLinks_RelationClass_4002(
			Metawebdesign.metawebdesign.Class container) {
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationClass().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Metawebdesign.metawebdesign.RelationClass) {
				continue;
			}
			Metawebdesign.metawebdesign.RelationClass link = (Metawebdesign.metawebdesign.RelationClass) linkObject;
			if (Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID != Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getFromClass();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Metawebdesign.metawebdesign.Class) {
				continue;
			}
			Metawebdesign.metawebdesign.Class dst = (Metawebdesign.metawebdesign.Class) theTarget;
			result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor(
					container,
					dst,
					link,
					Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002,
					Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
<<<<<<< HEAD
=======
	private static Collection<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getIncomingTypeModelFacetLinks_RelationView_4001(
			Metawebdesign.metawebdesign.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getRelationView_FromClass()
					|| false == setting.getEObject() instanceof Metawebdesign.metawebdesign.RelationView) {
				continue;
			}
			Metawebdesign.metawebdesign.RelationView link = (Metawebdesign.metawebdesign.RelationView) setting
					.getEObject();
			if (Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID != Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Metawebdesign.metawebdesign.Views) {
				continue;
			}
			Metawebdesign.metawebdesign.Views container = (Metawebdesign.metawebdesign.Views) link
					.eContainer();
			result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor(
					container,
					target,
					link,
					Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001,
					Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
	private static Collection<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getIncomingTypeModelFacetLinks_RelationClass_4002(
			Metawebdesign.metawebdesign.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Metawebdesign.metawebdesign.MetawebdesignPackage.eINSTANCE
					.getRelationClass_FromClass()
					|| false == setting.getEObject() instanceof Metawebdesign.metawebdesign.RelationClass) {
				continue;
			}
			Metawebdesign.metawebdesign.RelationClass link = (Metawebdesign.metawebdesign.RelationClass) setting
					.getEObject();
			if (Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID != Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Metawebdesign.metawebdesign.Class) {
				continue;
			}
			Metawebdesign.metawebdesign.Class container = (Metawebdesign.metawebdesign.Class) link
					.eContainer();
			result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor(
					container,
					target,
					link,
					Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002,
					Metawebdesign.metawebdesign.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getSemanticChildren(
				View view) {
			return MetaWebDesignDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getContainedLinks(
				View view) {
			return MetaWebDesignDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getIncomingLinks(
				View view) {
			return MetaWebDesignDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getOutgoingLinks(
				View view) {
			return MetaWebDesignDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
