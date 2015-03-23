package Modelo.modelo.diagram.part;

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
public class ModeloDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Modelo.modelo.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case Modelo.modelo.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Modelo.modelo.Model modelElement = (Modelo.modelo.Model) view
				.getElement();
		LinkedList<Modelo.modelo.diagram.part.ModeloNodeDescriptor> result = new LinkedList<Modelo.modelo.diagram.part.ModeloNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEReference0().iterator(); it
				.hasNext();) {
			Modelo.modelo.Class childElement = (Modelo.modelo.Class) it.next();
			int visualID = Modelo.modelo.diagram.part.ModeloVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modelo.modelo.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new Modelo.modelo.diagram.part.ModeloNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getContainedLinks(
			View view) {
		switch (Modelo.modelo.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case Modelo.modelo.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case Modelo.modelo.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001ContainedLinks(view);
		case Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Modelo.modelo.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case Modelo.modelo.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001IncomingLinks(view);
		case Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Modelo.modelo.diagram.part.ModeloVisualIDRegistry
				.getVisualID(view)) {
		case Modelo.modelo.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001OutgoingLinks(view);
		case Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getClass_2001ContainedLinks(
			View view) {
		Modelo.modelo.Class modelElement = (Modelo.modelo.Class) view
				.getElement();
		LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor> result = new LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getRelation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getClass_2001IncomingLinks(
			View view) {
		Modelo.modelo.Class modelElement = (Modelo.modelo.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor> result = new LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getRelation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getClass_2001OutgoingLinks(
			View view) {
		Modelo.modelo.Class modelElement = (Modelo.modelo.Class) view
				.getElement();
		LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor> result = new LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getRelation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getContainedTypeModelFacetLinks_Relation_4001(
			Modelo.modelo.Class container) {
		LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor> result = new LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelaction().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modelo.modelo.Relation) {
				continue;
			}
			Modelo.modelo.Relation link = (Modelo.modelo.Relation) linkObject;
			if (Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID != Modelo.modelo.diagram.part.ModeloVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTo();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Modelo.modelo.Class) {
				continue;
			}
			Modelo.modelo.Class dst = (Modelo.modelo.Class) theTarget;
			result.add(new Modelo.modelo.diagram.part.ModeloLinkDescriptor(
					container,
					dst,
					link,
					Modelo.modelo.diagram.providers.ModeloElementTypes.Relation_4001,
					Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_4001(
			Modelo.modelo.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor> result = new LinkedList<Modelo.modelo.diagram.part.ModeloLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modelo.modelo.ModeloPackage.eINSTANCE
					.getRelation_To()
					|| false == setting.getEObject() instanceof Modelo.modelo.Relation) {
				continue;
			}
			Modelo.modelo.Relation link = (Modelo.modelo.Relation) setting
					.getEObject();
			if (Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID != Modelo.modelo.diagram.part.ModeloVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modelo.modelo.Class) {
				continue;
			}
			Modelo.modelo.Class container = (Modelo.modelo.Class) link
					.eContainer();
			result.add(new Modelo.modelo.diagram.part.ModeloLinkDescriptor(
					container,
					target,
					link,
					Modelo.modelo.diagram.providers.ModeloElementTypes.Relation_4001,
					Modelo.modelo.diagram.edit.parts.RelationEditPart.VISUAL_ID));

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
		public List<Modelo.modelo.diagram.part.ModeloNodeDescriptor> getSemanticChildren(
				View view) {
			return ModeloDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getContainedLinks(
				View view) {
			return ModeloDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getIncomingLinks(
				View view) {
			return ModeloDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modelo.modelo.diagram.part.ModeloLinkDescriptor> getOutgoingLinks(
				View view) {
			return ModeloDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
