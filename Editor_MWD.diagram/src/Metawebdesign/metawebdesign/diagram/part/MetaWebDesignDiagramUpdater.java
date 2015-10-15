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
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenuEditPart.VISUAL_ID:
			return getNavegationMenuCompartmentCajoNavMenu_7004SemanticChildren(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.ClassCompartmentCajonClassEditPart.VISUAL_ID:
			return getClassCompartmentCajonClass_7003SemanticChildren(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart.VISUAL_ID:
			return getPageCompartmentCajonPage_7001SemanticChildren(view);
		case Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenuCompartmentCajoNavMenu2EditPart.VISUAL_ID:
			return getNavegationMenuCompartmentCajoNavMenu_7002SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
				.hasNext();) {
			Metawebdesign.metawebdesign.Attributes childElement = (Metawebdesign.metawebdesign.Attributes) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.DerivedEditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID) {
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
		for (Iterator<?> it = modelElement.getClass_().iterator(); it.hasNext();) {
			Metawebdesign.metawebdesign.Class childElement = (Metawebdesign.metawebdesign.Class) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getClassCompartmentCajonClass_7003SemanticChildren(
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
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.Constraint2EditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getHasAttributes().iterator(); it
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> getPageCompartmentCajonPage_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Metawebdesign.metawebdesign.Page modelElement = (Metawebdesign.metawebdesign.Page) containerView
				.getElement();
		LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor> result = new LinkedList<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasViewComponent().iterator(); it
				.hasNext();) {
			Metawebdesign.metawebdesign.ViewComponent childElement = (Metawebdesign.metawebdesign.ViewComponent) it
					.next();
			int visualID = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.NavegationMenu2EditPart.VISUAL_ID) {
				result.add(new Metawebdesign.metawebdesign.diagram.part.MetaWebDesignNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Metawebdesign.metawebdesign.diagram.edit.parts.ViewAttribute2EditPart.VISUAL_ID) {
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getClass_2004ContainedLinks(
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getPage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationClass_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_2005IncomingLinks(
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_3003IncomingLinks(
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getDerived_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getRelationClass_4002IncomingLinks(
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNotDerived_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_2007OutgoingLinks(
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getPage_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_2010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkViewCRUD_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getLinkView_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getConstraint_3007OutgoingLinks(
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
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getNavegationMenu_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Metawebdesign.metawebdesign.diagram.part.MetaWebDesignLinkDescriptor> getViewAttribute_3004OutgoingLinks(
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
