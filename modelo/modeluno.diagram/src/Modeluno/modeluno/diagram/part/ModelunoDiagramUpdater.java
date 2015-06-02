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
		for (Iterator<?> it = modelElement.getRootHasViews().iterator(); it
				.hasNext();) {
			Modeluno.modeluno.Views childElement = (Modeluno.modeluno.Views) it
					.next();
			int visualID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRoothasService().iterator(); it
				.hasNext();) {
			Modeluno.modeluno.Service childElement = (Modeluno.modeluno.Service) it
					.next();
			int visualID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID) {
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
		for (Iterator<?> it = modelElement.getRoot_hasAtributte().iterator(); it
				.hasNext();) {
			Modeluno.modeluno.Attribute childElement = (Modeluno.modeluno.Attribute) it
					.next();
			int visualID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID) {
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
		case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return getViewAdmin_2009ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return getAdmin_2005ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return getViewIndex_2014ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return getViewInput_2007ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID:
			return getListView_2012ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2010ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return getDelete_2016ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2002ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2004ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2011ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return getViewUpdateAttribute_2001ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2015ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return getUpdateAttribute_2018ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return getViewUpdateObject_2008ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2003ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2006ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return getUpdateObject_2017ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4005ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID:
			return getRelationService_4001ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getRelationView_4007ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID:
			return getRelationAttribute_4003ContainedLinks(view);
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
		case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return getViewAdmin_2009IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return getAdmin_2005IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return getViewIndex_2014IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return getViewInput_2007IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID:
			return getListView_2012IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2010IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return getDelete_2016IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2002IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2004IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2011IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return getViewUpdateAttribute_2001IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2015IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return getUpdateAttribute_2018IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return getViewUpdateObject_2008IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2003IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2006IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return getUpdateObject_2017IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4005IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID:
			return getRelationService_4001IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getRelationView_4007IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID:
			return getRelationAttribute_4003IncomingLinks(view);
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
		case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return getViewAdmin_2009OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return getAdmin_2005OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return getViewIndex_2014OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return getViewInput_2007OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID:
			return getListView_2012OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2010OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return getDelete_2016OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2002OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2004OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2011OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return getViewUpdateAttribute_2001OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2015OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return getUpdateAttribute_2018OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return getViewUpdateObject_2008OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2003OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2006OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return getUpdateObject_2017OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
			return getRelationClass_4005OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID:
			return getRelationService_4001OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
			return getRelationView_4007OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID:
			return getRelationAttribute_4003OutgoingLinks(view);
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
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAdmin_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAdmin_2005ContainedLinks(
			View view) {
		Modeluno.modeluno.Admin modelElement = (Modeluno.modeluno.Admin) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewIndex_2014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewInput_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getListView_2012ContainedLinks(
			View view) {
		Modeluno.modeluno.ListView modelElement = (Modeluno.modeluno.ListView) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2010ContainedLinks(
			View view) {
		Modeluno.modeluno.Class modelElement = (Modeluno.modeluno.Class) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationClass_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RelationService_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RelationAttribute_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getDelete_2016ContainedLinks(
			View view) {
		Modeluno.modeluno.Delete modelElement = (Modeluno.modeluno.Delete) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Not_Derived_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getPage_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAttribute_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateAttribute_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Derived_2015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateAttribute_2018ContainedLinks(
			View view) {
		Modeluno.modeluno.UpdateAttribute modelElement = (Modeluno.modeluno.UpdateAttribute) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateObject_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getView_2003ContainedLinks(
			View view) {
		Modeluno.modeluno.View modelElement = (Modeluno.modeluno.View) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getCreate_2006ContainedLinks(
			View view) {
		Modeluno.modeluno.Create modelElement = (Modeluno.modeluno.Create) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateObject_2017ContainedLinks(
			View view) {
		Modeluno.modeluno.UpdateObject modelElement = (Modeluno.modeluno.UpdateObject) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationClass_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationService_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationView_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationAttribute_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAdmin_2009IncomingLinks(
			View view) {
		Modeluno.modeluno.ViewAdmin modelElement = (Modeluno.modeluno.ViewAdmin) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationView_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAdmin_2005IncomingLinks(
			View view) {
		Modeluno.modeluno.Admin modelElement = (Modeluno.modeluno.Admin) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationService_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewIndex_2014IncomingLinks(
			View view) {
		Modeluno.modeluno.ViewIndex modelElement = (Modeluno.modeluno.ViewIndex) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationView_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewInput_2007IncomingLinks(
			View view) {
		Modeluno.modeluno.ViewInput modelElement = (Modeluno.modeluno.ViewInput) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationView_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getListView_2012IncomingLinks(
			View view) {
		Modeluno.modeluno.ListView modelElement = (Modeluno.modeluno.ListView) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationService_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2010IncomingLinks(
			View view) {
		Modeluno.modeluno.Class modelElement = (Modeluno.modeluno.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationClass_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getDelete_2016IncomingLinks(
			View view) {
		Modeluno.modeluno.Delete modelElement = (Modeluno.modeluno.Delete) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationService_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Not_Derived_2002IncomingLinks(
			View view) {
		Modeluno.modeluno.Attribute_Not_Derived modelElement = (Modeluno.modeluno.Attribute_Not_Derived) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationAttribute_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getPage_2004IncomingLinks(
			View view) {
		Modeluno.modeluno.Page modelElement = (Modeluno.modeluno.Page) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationView_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAttribute_2011IncomingLinks(
			View view) {
		Modeluno.modeluno.ViewAttribute modelElement = (Modeluno.modeluno.ViewAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationView_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateAttribute_2001IncomingLinks(
			View view) {
		Modeluno.modeluno.ViewUpdateAttribute modelElement = (Modeluno.modeluno.ViewUpdateAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationView_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Derived_2015IncomingLinks(
			View view) {
		Modeluno.modeluno.Attribute_Derived modelElement = (Modeluno.modeluno.Attribute_Derived) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationAttribute_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateAttribute_2018IncomingLinks(
			View view) {
		Modeluno.modeluno.UpdateAttribute modelElement = (Modeluno.modeluno.UpdateAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationService_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateObject_2008IncomingLinks(
			View view) {
		Modeluno.modeluno.ViewUpdateObject modelElement = (Modeluno.modeluno.ViewUpdateObject) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationView_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getView_2003IncomingLinks(
			View view) {
		Modeluno.modeluno.View modelElement = (Modeluno.modeluno.View) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationService_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getCreate_2006IncomingLinks(
			View view) {
		Modeluno.modeluno.Create modelElement = (Modeluno.modeluno.Create) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationService_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateObject_2017IncomingLinks(
			View view) {
		Modeluno.modeluno.UpdateObject modelElement = (Modeluno.modeluno.UpdateObject) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RelationService_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationClass_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationService_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationView_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationAttribute_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAdmin_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAdmin_2005OutgoingLinks(
			View view) {
		Modeluno.modeluno.Admin modelElement = (Modeluno.modeluno.Admin) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewIndex_2014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewInput_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getListView_2012OutgoingLinks(
			View view) {
		Modeluno.modeluno.ListView modelElement = (Modeluno.modeluno.ListView) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2010OutgoingLinks(
			View view) {
		Modeluno.modeluno.Class modelElement = (Modeluno.modeluno.Class) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationClass_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RelationService_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RelationAttribute_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getDelete_2016OutgoingLinks(
			View view) {
		Modeluno.modeluno.Delete modelElement = (Modeluno.modeluno.Delete) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Not_Derived_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getPage_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAttribute_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateAttribute_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Derived_2015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateAttribute_2018OutgoingLinks(
			View view) {
		Modeluno.modeluno.UpdateAttribute modelElement = (Modeluno.modeluno.UpdateAttribute) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateObject_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getView_2003OutgoingLinks(
			View view) {
		Modeluno.modeluno.View modelElement = (Modeluno.modeluno.View) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getCreate_2006OutgoingLinks(
			View view) {
		Modeluno.modeluno.Create modelElement = (Modeluno.modeluno.Create) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateObject_2017OutgoingLinks(
			View view) {
		Modeluno.modeluno.UpdateObject modelElement = (Modeluno.modeluno.UpdateObject) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RelationView_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationClass_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationService_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationView_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelationAttribute_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_RelationClass_4005(
			Modeluno.modeluno.Class container) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeluno.modeluno.RelationClass) {
				continue;
			}
			Modeluno.modeluno.RelationClass link = (Modeluno.modeluno.RelationClass) linkObject;
			if (Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
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
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationClass_4005,
					Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_RelationService_4001(
			Modeluno.modeluno.Class container) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasServiceRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeluno.modeluno.RelationService) {
				continue;
			}
			Modeluno.modeluno.RelationService link = (Modeluno.modeluno.RelationService) linkObject;
			if (Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Modeluno.modeluno.Service dst = link.getGoService();
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					dst,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationService_4001,
					Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_RelationView_4007(
			Modeluno.modeluno.Service container) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Modeluno.modeluno.RelationView link = container.getHasRelationView();
		if (Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		Modeluno.modeluno.Views dst = link.getGoToView();
		result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
				container,
				dst,
				link,
				Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007,
				Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_RelationAttribute_4003(
			Modeluno.modeluno.Class container) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasAtributeRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeluno.modeluno.RelationAttribute) {
				continue;
			}
			Modeluno.modeluno.RelationAttribute link = (Modeluno.modeluno.RelationAttribute) linkObject;
			if (Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Modeluno.modeluno.Attribute dst = link.getGoAttribute();
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					dst,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationAttribute_4003,
					Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_RelationClass_4005(
			Modeluno.modeluno.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getRelationClass_GoClass()
					|| false == setting.getEObject() instanceof Modeluno.modeluno.RelationClass) {
				continue;
			}
			Modeluno.modeluno.RelationClass link = (Modeluno.modeluno.RelationClass) setting
					.getEObject();
			if (Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
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
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationClass_4005,
					Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_RelationService_4001(
			Modeluno.modeluno.Service target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getRelationService_GoService()
					|| false == setting.getEObject() instanceof Modeluno.modeluno.RelationService) {
				continue;
			}
			Modeluno.modeluno.RelationService link = (Modeluno.modeluno.RelationService) setting
					.getEObject();
			if (Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
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
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationService_4001,
					Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_RelationView_4007(
			Modeluno.modeluno.Views target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getRelationView_GoToView()
					|| false == setting.getEObject() instanceof Modeluno.modeluno.RelationView) {
				continue;
			}
			Modeluno.modeluno.RelationView link = (Modeluno.modeluno.RelationView) setting
					.getEObject();
			if (Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modeluno.modeluno.Service) {
				continue;
			}
			Modeluno.modeluno.Service container = (Modeluno.modeluno.Service) link
					.eContainer();
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007,
					Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_RelationAttribute_4003(
			Modeluno.modeluno.Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getRelationAttribute_GoAttribute()
					|| false == setting.getEObject() instanceof Modeluno.modeluno.RelationAttribute) {
				continue;
			}
			Modeluno.modeluno.RelationAttribute link = (Modeluno.modeluno.RelationAttribute) setting
					.getEObject();
			if (Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
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
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationAttribute_4003,
					Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID));

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
