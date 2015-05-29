package Modeluno.modeluno.diagram.part;

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
public class ModelunoDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor> getMap_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Modeluno.modeluno.Map modelElement = (Modeluno.modeluno.Map) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRoot_hasAtributte().iterator(); it
				.hasNext();) {
			Modeluno.modeluno.Attribute childElement = (Modeluno.modeluno.Attribute) it
					.next();
			int visualID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRoot_hasClass().iterator(); it
				.hasNext();) {
			Modeluno.modeluno.Class childElement = (Modeluno.modeluno.Class) it
					.next();
			int visualID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedLinks(
			View view) {
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2001ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2002ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2003ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID:
			return getAttribute_Relation_4001ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID:
			return getClass_Relation_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2001IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2002IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2003IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID:
			return getAttribute_Relation_4001IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID:
			return getClass_Relation_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2001OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2002OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2003OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID:
			return getAttribute_Relation_4001OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID:
			return getClass_Relation_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getMap_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Derived_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2002ContainedLinks(
			View view) {
		Modeluno.modeluno.Class modelElement = (Modeluno.modeluno.Class) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Attribute_Relation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Class_Relation_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Not_Derived_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Relation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_Relation_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Derived_2001IncomingLinks(
			View view) {
		Modeluno.modeluno.Attribute_Derived modelElement = (Modeluno.modeluno.Attribute_Derived) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Attribute_Relation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2002IncomingLinks(
			View view) {
		Modeluno.modeluno.Class modelElement = (Modeluno.modeluno.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Class_Relation_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Not_Derived_2003IncomingLinks(
			View view) {
		Modeluno.modeluno.Attribute_Not_Derived modelElement = (Modeluno.modeluno.Attribute_Not_Derived) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Attribute_Relation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Relation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_Relation_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Derived_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2002OutgoingLinks(
			View view) {
		Modeluno.modeluno.Class modelElement = (Modeluno.modeluno.Class) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Attribute_Relation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Class_Relation_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Not_Derived_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Relation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_Relation_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_Attribute_Relation_4001(
			Modeluno.modeluno.Class container) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasAtributeRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeluno.modeluno.Attribute_Relation) {
				continue;
			}
			Modeluno.modeluno.Attribute_Relation link = (Modeluno.modeluno.Attribute_Relation) linkObject;
			if (Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Modeluno.modeluno.Attribute dst = link.getGoAttribute();
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					dst,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Relation_4001,
					Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_Class_Relation_4002(
			Modeluno.modeluno.Class container) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeluno.modeluno.Class_Relation) {
				continue;
			}
			Modeluno.modeluno.Class_Relation link = (Modeluno.modeluno.Class_Relation) linkObject;
			if (Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getGoClass();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Modeluno.modeluno.Class) {
				continue;
			}
			Modeluno.modeluno.Class dst = (Modeluno.modeluno.Class) theTarget;
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					dst,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4002,
					Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_Attribute_Relation_4001(
			Modeluno.modeluno.Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAttribute_Relation_GoAttribute()
					|| false == setting.getEObject() instanceof Modeluno.modeluno.Attribute_Relation) {
				continue;
			}
			Modeluno.modeluno.Attribute_Relation link = (Modeluno.modeluno.Attribute_Relation) setting
					.getEObject();
			if (Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modeluno.modeluno.Class) {
				continue;
			}
			Modeluno.modeluno.Class container = (Modeluno.modeluno.Class) link
					.eContainer();
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Relation_4001,
					Modeluno.modeluno.diagram.edit.parts.Attribute_RelationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_Class_Relation_4002(
			Modeluno.modeluno.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getClass_Relation_GoClass()
					|| false == setting.getEObject() instanceof Modeluno.modeluno.Class_Relation) {
				continue;
			}
			Modeluno.modeluno.Class_Relation link = (Modeluno.modeluno.Class_Relation) setting
					.getEObject();
			if (Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modeluno.modeluno.Class) {
				continue;
			}
			Modeluno.modeluno.Class container = (Modeluno.modeluno.Class) link
					.eContainer();
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4002,
					Modeluno.modeluno.diagram.edit.parts.Class_RelationEditPart.VISUAL_ID));

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
		public List<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor> getSemanticChildren(
				View view) {
			return ModelunoDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedLinks(
				View view) {
			return ModelunoDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingLinks(
				View view) {
			return ModelunoDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getOutgoingLinks(
				View view) {
			return ModelunoDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
