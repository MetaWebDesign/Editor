package Modeldos.modeldos.diagram.part;

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
public class ModeldosDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getVisualID(view)) {
		case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getRoot_1000SemanticChildren(view);
		case Modeldos.modeldos.diagram.edit.parts.MenuGrupoInMenuFCajaEditPart.VISUAL_ID:
			return getMenuGrupoInMenuFCaja_7001SemanticChildren(view);
		case Modeldos.modeldos.diagram.edit.parts.ClassAttributeInClassCajaEditPart.VISUAL_ID:
			return getClassAttributeInClassCaja_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> getRoot_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Modeldos.modeldos.Root modelElement = (Modeldos.modeldos.Root) view
				.getElement();
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMenu().iterator(); it.hasNext();) {
			Modeldos.modeldos.Menu childElement = (Modeldos.modeldos.Menu) it
					.next();
			int visualID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGroup().iterator(); it.hasNext();) {
			Modeldos.modeldos.Group childElement = (Modeldos.modeldos.Group) it
					.next();
			int visualID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
				.hasNext();) {
			Modeldos.modeldos.Attributes childElement = (Modeldos.modeldos.Attributes) it
					.next();
			int visualID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getViews().iterator(); it.hasNext();) {
			Modeldos.modeldos.Views childElement = (Modeldos.modeldos.Views) it
					.next();
			int visualID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getClass_().iterator(); it.hasNext();) {
			Modeldos.modeldos.Class childElement = (Modeldos.modeldos.Class) it
					.next();
			int visualID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> getMenuGrupoInMenuFCaja_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Modeldos.modeldos.Menu modelElement = (Modeldos.modeldos.Menu) containerView
				.getElement();
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasGroup().iterator(); it
				.hasNext();) {
			Modeldos.modeldos.Group childElement = (Modeldos.modeldos.Group) it
					.next();
			int visualID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> getClassAttributeInClassCaja_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Modeldos.modeldos.Class modelElement = (Modeldos.modeldos.Class) containerView
				.getElement();
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Modeldos.modeldos.Attributes childElement = (Modeldos.modeldos.Attributes) it
					.next();
			int visualID = Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID) {
				result.add(new Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getContainedLinks(
			View view) {
		switch (Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getVisualID(view)) {
		case Modeldos.modeldos.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getRoot_1000ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getMenu_2001ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2002ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2003ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2004ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2005ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2006ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2007ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3001ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3002ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3003ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getVisualID(view)) {
		case Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getMenu_2001IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2002IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2003IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2004IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2005IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2006IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2007IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3001IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3002IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3003IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getVisualID(view)) {
		case Modeldos.modeldos.diagram.edit.parts.MenuEditPart.VISUAL_ID:
			return getMenu_2001OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_2002OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.NotDerivedEditPart.VISUAL_ID:
			return getNotDerived_2003OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.FormEditPart.VISUAL_ID:
			return getForm_2004OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2005OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2006OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.DerivedEditPart.VISUAL_ID:
			return getDerived_2007OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3001OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.NotDerived2EditPart.VISUAL_ID:
			return getNotDerived_3002OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.Derived2EditPart.VISUAL_ID:
			return getDerived_3003OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getRoot_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getMenu_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getGroup_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getNotDerived_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getForm_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getPage_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getClass_2006ContainedLinks(
			View view) {
		Modeldos.modeldos.Class modelElement = (Modeldos.modeldos.Class) view
				.getElement();
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationClass_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getDerived_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getGroup_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getNotDerived_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getDerived_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getRelationClass_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getMenu_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getGroup_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getNotDerived_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getForm_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getPage_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getClass_2006IncomingLinks(
			View view) {
		Modeldos.modeldos.Class modelElement = (Modeldos.modeldos.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationClass_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getDerived_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getGroup_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getNotDerived_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getDerived_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getRelationClass_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getMenu_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getGroup_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getNotDerived_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getForm_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getPage_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getClass_2006OutgoingLinks(
			View view) {
		Modeldos.modeldos.Class modelElement = (Modeldos.modeldos.Class) view
				.getElement();
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationClass_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getDerived_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getGroup_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getNotDerived_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getDerived_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getRelationClass_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getContainedTypeModelFacetLinks_RelationClass_4001(
			Modeldos.modeldos.Class container) {
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationClass().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeldos.modeldos.RelationClass) {
				continue;
			}
			Modeldos.modeldos.RelationClass link = (Modeldos.modeldos.RelationClass) linkObject;
			if (Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID != Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getFromClass();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Modeldos.modeldos.Class) {
				continue;
			}
			Modeldos.modeldos.Class dst = (Modeldos.modeldos.Class) theTarget;
			result.add(new Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor(
					container,
					dst,
					link,
					Modeldos.modeldos.diagram.providers.ModeldosElementTypes.RelationClass_4001,
					Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getIncomingTypeModelFacetLinks_RelationClass_4001(
			Modeldos.modeldos.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getRelationClass_FromClass()
					|| false == setting.getEObject() instanceof Modeldos.modeldos.RelationClass) {
				continue;
			}
			Modeldos.modeldos.RelationClass link = (Modeldos.modeldos.RelationClass) setting
					.getEObject();
			if (Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID != Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modeldos.modeldos.Class) {
				continue;
			}
			Modeldos.modeldos.Class container = (Modeldos.modeldos.Class) link
					.eContainer();
			result.add(new Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor(
					container,
					target,
					link,
					Modeldos.modeldos.diagram.providers.ModeldosElementTypes.RelationClass_4001,
					Modeldos.modeldos.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));

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
		public List<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> getSemanticChildren(
				View view) {
			return ModeldosDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getContainedLinks(
				View view) {
			return ModeldosDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getIncomingLinks(
				View view) {
			return ModeldosDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getOutgoingLinks(
				View view) {
			return ModeldosDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
