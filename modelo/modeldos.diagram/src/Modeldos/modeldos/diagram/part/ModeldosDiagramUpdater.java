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
		case Modeldos.modeldos.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> getMap_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Modeldos.modeldos.Map modelElement = (Modeldos.modeldos.Map) view
				.getElement();
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasClass().iterator(); it
				.hasNext();) {
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
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getContainedLinks(
			View view) {
		switch (Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
				.getVisualID(view)) {
		case Modeldos.modeldos.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001ContainedLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return getAtributte_4002ContainedLinks(view);
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
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001IncomingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return getAtributte_4002IncomingLinks(view);
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
		case Modeldos.modeldos.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001OutgoingLinks(view);
		case Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return getAtributte_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getMap_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getClass_2001ContainedLinks(
			View view) {
		Modeldos.modeldos.Class modelElement = (Modeldos.modeldos.Class) view
				.getElement();
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Atributte_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getRelation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getAtributte_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getClass_2001IncomingLinks(
			View view) {
		Modeldos.modeldos.Class modelElement = (Modeldos.modeldos.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Atributte_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getRelation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getAtributte_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getClass_2001OutgoingLinks(
			View view) {
		Modeldos.modeldos.Class modelElement = (Modeldos.modeldos.Class) view
				.getElement();
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Atributte_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getRelation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getAtributte_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getContainedTypeModelFacetLinks_Relation_4001(
			Modeldos.modeldos.Class container) {
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeldos.modeldos.Relation) {
				continue;
			}
			Modeldos.modeldos.Relation link = (Modeldos.modeldos.Relation) linkObject;
			if (Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID != Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getR2();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Modeldos.modeldos.Class) {
				continue;
			}
			Modeldos.modeldos.Class dst = (Modeldos.modeldos.Class) theTarget;
			result.add(new Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor(
					container,
					dst,
					link,
					Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Relation_4001,
					Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getContainedTypeModelFacetLinks_Atributte_4002(
			Modeldos.modeldos.Class container) {
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		for (Iterator<?> links = container.getHasAtribute().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeldos.modeldos.Atributte) {
				continue;
			}
			Modeldos.modeldos.Atributte link = (Modeldos.modeldos.Atributte) linkObject;
			if (Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID != Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Modeldos.modeldos.Class dst = link.getEsDe();
			result.add(new Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor(
					container,
					dst,
					link,
					Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Atributte_4002,
					Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_4001(
			Modeldos.modeldos.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getRelation_R2()
					|| false == setting.getEObject() instanceof Modeldos.modeldos.Relation) {
				continue;
			}
			Modeldos.modeldos.Relation link = (Modeldos.modeldos.Relation) setting
					.getEObject();
			if (Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID != Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
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
					Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Relation_4001,
					Modeldos.modeldos.diagram.edit.parts.RelationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> getIncomingTypeModelFacetLinks_Atributte_4002(
			Modeldos.modeldos.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor> result = new LinkedList<Modeldos.modeldos.diagram.part.ModeldosLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeldos.modeldos.ModeldosPackage.eINSTANCE
					.getAtributte_EsDe()
					|| false == setting.getEObject() instanceof Modeldos.modeldos.Atributte) {
				continue;
			}
			Modeldos.modeldos.Atributte link = (Modeldos.modeldos.Atributte) setting
					.getEObject();
			if (Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID != Modeldos.modeldos.diagram.part.ModeldosVisualIDRegistry
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
					Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Atributte_4002,
					Modeldos.modeldos.diagram.edit.parts.AtributteEditPart.VISUAL_ID));

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
