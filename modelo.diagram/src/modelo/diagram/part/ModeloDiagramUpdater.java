package modelo.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import modelo.Class;
import modelo.Model;
import modelo.ModeloPackage;
import modelo.Relation;
import modelo.diagram.edit.parts.ClassEditPart;
import modelo.diagram.edit.parts.ModelEditPart;
import modelo.diagram.edit.parts.RelationEditPart;
import modelo.diagram.providers.ModeloElementTypes;

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
	public static List<ModeloNodeDescriptor> getSemanticChildren(View view) {
		switch (ModeloVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Model modelElement = (Model) view.getElement();
		LinkedList<ModeloNodeDescriptor> result = new LinkedList<ModeloNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEReference0().iterator(); it
				.hasNext();) {
			Class childElement = (Class) it.next();
			int visualID = ModeloVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new ModeloNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getContainedLinks(View view) {
		switch (ModeloVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2001ContainedLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getIncomingLinks(View view) {
		switch (ModeloVisualIDRegistry.getVisualID(view)) {
		case ClassEditPart.VISUAL_ID:
			return getClass_2001IncomingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getOutgoingLinks(View view) {
		switch (ModeloVisualIDRegistry.getVisualID(view)) {
		case ClassEditPart.VISUAL_ID:
			return getClass_2001OutgoingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getClass_2001ContainedLinks(
			View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<ModeloLinkDescriptor> result = new LinkedList<ModeloLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getRelation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getClass_2001IncomingLinks(
			View view) {
		Class modelElement = (Class) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModeloLinkDescriptor> result = new LinkedList<ModeloLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getRelation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getClass_2001OutgoingLinks(
			View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<ModeloLinkDescriptor> result = new LinkedList<ModeloLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModeloLinkDescriptor> getRelation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ModeloLinkDescriptor> getContainedTypeModelFacetLinks_Relation_4001(
			Class container) {
		LinkedList<ModeloLinkDescriptor> result = new LinkedList<ModeloLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelaction().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relation) {
				continue;
			}
			Relation link = (Relation) linkObject;
			if (RelationEditPart.VISUAL_ID != ModeloVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTo();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Class) {
				continue;
			}
			Class dst = (Class) theTarget;
			result.add(new ModeloLinkDescriptor(container, dst, link,
					ModeloElementTypes.Relation_4001,
					RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModeloLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_4001(
			Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModeloLinkDescriptor> result = new LinkedList<ModeloLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModeloPackage.eINSTANCE
					.getRelation_To()
					|| false == setting.getEObject() instanceof Relation) {
				continue;
			}
			Relation link = (Relation) setting.getEObject();
			if (RelationEditPart.VISUAL_ID != ModeloVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Class) {
				continue;
			}
			Class container = (Class) link.eContainer();
			result.add(new ModeloLinkDescriptor(container, target, link,
					ModeloElementTypes.Relation_4001,
					RelationEditPart.VISUAL_ID));

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
		public List<ModeloNodeDescriptor> getSemanticChildren(View view) {
			return ModeloDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ModeloLinkDescriptor> getContainedLinks(View view) {
			return ModeloDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ModeloLinkDescriptor> getIncomingLinks(View view) {
			return ModeloDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ModeloLinkDescriptor> getOutgoingLinks(View view) {
			return ModeloDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
