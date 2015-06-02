package Modelouno.modeluno.diagram.part;

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
	public static List<Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modelouno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor> getMap_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Modelouno.modeluno.Map modelElement = (Modelouno.modeluno.Map) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRoothasService().iterator(); it
				.hasNext();) {
			Modelouno.modeluno.Service childElement = (Modelouno.modeluno.Service) it
					.next();
			int visualID = Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modelouno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.IndexEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRootHasViews().iterator(); it
				.hasNext();) {
			Modelouno.modeluno.Views childElement = (Modelouno.modeluno.Views) it
					.next();
			int visualID = Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modelouno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRoot_hasClass().iterator(); it
				.hasNext();) {
			Modelouno.modeluno.Class childElement = (Modelouno.modeluno.Class) it
					.next();
			int visualID = Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modelouno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRoot_hasAtributte().iterator(); it
				.hasNext();) {
			Modelouno.modeluno.Attribute childElement = (Modelouno.modeluno.Attribute) it
					.next();
			int visualID = Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modelouno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID) {
				result.add(new Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedLinks(
			View view) {
		switch (Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modelouno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2001ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return getViewIndex_2002ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return getViewUpdateObject_2003ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return getAdmin_2004ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2005ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return getUpdateObject_2006ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2007ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return getDelete_2008ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return getViewAdmin_2009ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return getViewUpdateAttribute_2010ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2011ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.IndexEditPart.VISUAL_ID:
			return getIndex_2012ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2013ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return getUpdateAttribute_2014ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2015ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return getViewInput_2016ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2017ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID:
			return getRelation_Attribute_4001ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_ViewEditPart.VISUAL_ID:
			return getRelation_View_4002ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_ClassEditPart.VISUAL_ID:
			return getRelation_Class_4003ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_ServiceEditPart.VISUAL_ID:
			return getRelation_Service_4004ContainedLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID:
			return getPresetationUnit_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modelouno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2001IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return getViewIndex_2002IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return getViewUpdateObject_2003IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return getAdmin_2004IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2005IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return getUpdateObject_2006IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2007IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return getDelete_2008IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return getViewAdmin_2009IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return getViewUpdateAttribute_2010IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2011IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.IndexEditPart.VISUAL_ID:
			return getIndex_2012IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2013IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return getUpdateAttribute_2014IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2015IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return getViewInput_2016IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2017IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID:
			return getRelation_Attribute_4001IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_ViewEditPart.VISUAL_ID:
			return getRelation_View_4002IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_ClassEditPart.VISUAL_ID:
			return getRelation_Class_4003IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_ServiceEditPart.VISUAL_ID:
			return getRelation_Service_4004IncomingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID:
			return getPresetationUnit_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modelouno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2001OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			return getViewIndex_2002OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			return getViewUpdateObject_2003OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			return getAdmin_2004OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2005OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			return getUpdateObject_2006OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			return getPage_2007OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			return getDelete_2008OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			return getViewAdmin_2009OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			return getViewUpdateAttribute_2010OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			return getViewAttribute_2011OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.IndexEditPart.VISUAL_ID:
			return getIndex_2012OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2013OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return getUpdateAttribute_2014OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			return getAttribute_Not_Derived_2015OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			return getViewInput_2016OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			return getAttribute_Derived_2017OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID:
			return getRelation_Attribute_4001OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_ViewEditPart.VISUAL_ID:
			return getRelation_View_4002OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_ClassEditPart.VISUAL_ID:
			return getRelation_Class_4003OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.Relation_ServiceEditPart.VISUAL_ID:
			return getRelation_Service_4004OutgoingLinks(view);
		case Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID:
			return getPresetationUnit_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getMap_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getCreate_2001ContainedLinks(
			View view) {
		Modelouno.modeluno.Create modelElement = (Modelouno.modeluno.Create) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewIndex_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateObject_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getAdmin_2004ContainedLinks(
			View view) {
		Modelouno.modeluno.Admin modelElement = (Modelouno.modeluno.Admin) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2005ContainedLinks(
			View view) {
		Modelouno.modeluno.Class modelElement = (Modelouno.modeluno.Class) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_Attribute_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relation_Class_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relation_Service_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateObject_2006ContainedLinks(
			View view) {
		Modelouno.modeluno.UpdateObject modelElement = (Modelouno.modeluno.UpdateObject) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getPage_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getDelete_2008ContainedLinks(
			View view) {
		Modelouno.modeluno.Delete modelElement = (Modelouno.modeluno.Delete) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAdmin_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateAttribute_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAttribute_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIndex_2012ContainedLinks(
			View view) {
		Modelouno.modeluno.Index modelElement = (Modelouno.modeluno.Index) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getView_2013ContainedLinks(
			View view) {
		Modelouno.modeluno.View modelElement = (Modelouno.modeluno.View) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateAttribute_2014ContainedLinks(
			View view) {
		Modelouno.modeluno.UpdateAttribute modelElement = (Modelouno.modeluno.UpdateAttribute) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Not_Derived_2015ContainedLinks(
			View view) {
		Modelouno.modeluno.Attribute_Not_Derived modelElement = (Modelouno.modeluno.Attribute_Not_Derived) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PresetationUnit_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewInput_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Derived_2017ContainedLinks(
			View view) {
		Modelouno.modeluno.Attribute_Derived modelElement = (Modelouno.modeluno.Attribute_Derived) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PresetationUnit_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_Attribute_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_View_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_Class_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_Service_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getPresetationUnit_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getCreate_2001IncomingLinks(
			View view) {
		Modelouno.modeluno.Create modelElement = (Modelouno.modeluno.Create) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Service_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewIndex_2002IncomingLinks(
			View view) {
		Modelouno.modeluno.ViewIndex modelElement = (Modelouno.modeluno.ViewIndex) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_View_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PresetationUnit_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateObject_2003IncomingLinks(
			View view) {
		Modelouno.modeluno.ViewUpdateObject modelElement = (Modelouno.modeluno.ViewUpdateObject) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_View_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PresetationUnit_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getAdmin_2004IncomingLinks(
			View view) {
		Modelouno.modeluno.Admin modelElement = (Modelouno.modeluno.Admin) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Service_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2005IncomingLinks(
			View view) {
		Modelouno.modeluno.Class modelElement = (Modelouno.modeluno.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Class_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateObject_2006IncomingLinks(
			View view) {
		Modelouno.modeluno.UpdateObject modelElement = (Modelouno.modeluno.UpdateObject) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Service_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getPage_2007IncomingLinks(
			View view) {
		Modelouno.modeluno.Page modelElement = (Modelouno.modeluno.Page) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_View_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PresetationUnit_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getDelete_2008IncomingLinks(
			View view) {
		Modelouno.modeluno.Delete modelElement = (Modelouno.modeluno.Delete) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Service_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAdmin_2009IncomingLinks(
			View view) {
		Modelouno.modeluno.ViewAdmin modelElement = (Modelouno.modeluno.ViewAdmin) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_View_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PresetationUnit_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateAttribute_2010IncomingLinks(
			View view) {
		Modelouno.modeluno.ViewUpdateAttribute modelElement = (Modelouno.modeluno.ViewUpdateAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_View_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PresetationUnit_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAttribute_2011IncomingLinks(
			View view) {
		Modelouno.modeluno.ViewAttribute modelElement = (Modelouno.modeluno.ViewAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_View_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PresetationUnit_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIndex_2012IncomingLinks(
			View view) {
		Modelouno.modeluno.Index modelElement = (Modelouno.modeluno.Index) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Service_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getView_2013IncomingLinks(
			View view) {
		Modelouno.modeluno.View modelElement = (Modelouno.modeluno.View) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Service_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateAttribute_2014IncomingLinks(
			View view) {
		Modelouno.modeluno.UpdateAttribute modelElement = (Modelouno.modeluno.UpdateAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Service_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Not_Derived_2015IncomingLinks(
			View view) {
		Modelouno.modeluno.Attribute_Not_Derived modelElement = (Modelouno.modeluno.Attribute_Not_Derived) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Attribute_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewInput_2016IncomingLinks(
			View view) {
		Modelouno.modeluno.ViewInput modelElement = (Modelouno.modeluno.ViewInput) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_View_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PresetationUnit_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Derived_2017IncomingLinks(
			View view) {
		Modelouno.modeluno.Attribute_Derived modelElement = (Modelouno.modeluno.Attribute_Derived) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_Attribute_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_Attribute_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_View_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_Class_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_Service_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getPresetationUnit_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getCreate_2001OutgoingLinks(
			View view) {
		Modelouno.modeluno.Create modelElement = (Modelouno.modeluno.Create) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewIndex_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateObject_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getAdmin_2004OutgoingLinks(
			View view) {
		Modelouno.modeluno.Admin modelElement = (Modelouno.modeluno.Admin) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2005OutgoingLinks(
			View view) {
		Modelouno.modeluno.Class modelElement = (Modelouno.modeluno.Class) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_Attribute_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relation_Class_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relation_Service_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateObject_2006OutgoingLinks(
			View view) {
		Modelouno.modeluno.UpdateObject modelElement = (Modelouno.modeluno.UpdateObject) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getPage_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getDelete_2008OutgoingLinks(
			View view) {
		Modelouno.modeluno.Delete modelElement = (Modelouno.modeluno.Delete) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAdmin_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewUpdateAttribute_2010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewAttribute_2011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIndex_2012OutgoingLinks(
			View view) {
		Modelouno.modeluno.Index modelElement = (Modelouno.modeluno.Index) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getView_2013OutgoingLinks(
			View view) {
		Modelouno.modeluno.View modelElement = (Modelouno.modeluno.View) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getUpdateAttribute_2014OutgoingLinks(
			View view) {
		Modelouno.modeluno.UpdateAttribute modelElement = (Modelouno.modeluno.UpdateAttribute) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_View_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Not_Derived_2015OutgoingLinks(
			View view) {
		Modelouno.modeluno.Attribute_Not_Derived modelElement = (Modelouno.modeluno.Attribute_Not_Derived) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PresetationUnit_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getViewInput_2016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getAttribute_Derived_2017OutgoingLinks(
			View view) {
		Modelouno.modeluno.Attribute_Derived modelElement = (Modelouno.modeluno.Attribute_Derived) view
				.getElement();
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PresetationUnit_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_Attribute_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_View_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_Class_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_Service_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getPresetationUnit_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_Relation_Attribute_4001(
			Modelouno.modeluno.Class container) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasAtributeRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modelouno.modeluno.Relation_Attribute) {
				continue;
			}
			Modelouno.modeluno.Relation_Attribute link = (Modelouno.modeluno.Relation_Attribute) linkObject;
			if (Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Modelouno.modeluno.Attribute dst = link.getGoAttribute();
			result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					dst,
					link,
					Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001,
					Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_Relation_View_4002(
			Modelouno.modeluno.Service container) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Modelouno.modeluno.Relation_View link = container.getHasRelationView();
		if (Modelouno.modeluno.diagram.edit.parts.Relation_ViewEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		Modelouno.modeluno.Views dst = link.getGoToView();
		result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
				container,
				dst,
				link,
				Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002,
				Modelouno.modeluno.diagram.edit.parts.Relation_ViewEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_Relation_Class_4003(
			Modelouno.modeluno.Class container) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modelouno.modeluno.Relation_Class) {
				continue;
			}
			Modelouno.modeluno.Relation_Class link = (Modelouno.modeluno.Relation_Class) linkObject;
			if (Modelouno.modeluno.diagram.edit.parts.Relation_ClassEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getGoClass();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Modelouno.modeluno.Class) {
				continue;
			}
			Modelouno.modeluno.Class dst = (Modelouno.modeluno.Class) theTarget;
			result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					dst,
					link,
					Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Class_4003,
					Modelouno.modeluno.diagram.edit.parts.Relation_ClassEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_Relation_Service_4004(
			Modelouno.modeluno.Class container) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasServiceRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modelouno.modeluno.Relation_Service) {
				continue;
			}
			Modelouno.modeluno.Relation_Service link = (Modelouno.modeluno.Relation_Service) linkObject;
			if (Modelouno.modeluno.diagram.edit.parts.Relation_ServiceEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Modelouno.modeluno.Service dst = link.getGoService();
			result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					dst,
					link,
					Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004,
					Modelouno.modeluno.diagram.edit.parts.Relation_ServiceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_PresetationUnit_4005(
			Modelouno.modeluno.Attribute container) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Modelouno.modeluno.PresetationUnit link = container
				.getHasPresentationUnit();
		if (Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		Modelouno.modeluno.Views dst = link.getPUgoToViews();
		result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
				container,
				dst,
				link,
				Modelouno.modeluno.diagram.providers.ModelunoElementTypes.PresetationUnit_4005,
				Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_Attribute_4001(
			Modelouno.modeluno.Attribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getRelation_Attribute_GoAttribute()
					|| false == setting.getEObject() instanceof Modelouno.modeluno.Relation_Attribute) {
				continue;
			}
			Modelouno.modeluno.Relation_Attribute link = (Modelouno.modeluno.Relation_Attribute) setting
					.getEObject();
			if (Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modelouno.modeluno.Class) {
				continue;
			}
			Modelouno.modeluno.Class container = (Modelouno.modeluno.Class) link
					.eContainer();
			result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001,
					Modelouno.modeluno.diagram.edit.parts.Relation_AttributeEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_View_4002(
			Modelouno.modeluno.Views target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getRelation_View_GoToView()
					|| false == setting.getEObject() instanceof Modelouno.modeluno.Relation_View) {
				continue;
			}
			Modelouno.modeluno.Relation_View link = (Modelouno.modeluno.Relation_View) setting
					.getEObject();
			if (Modelouno.modeluno.diagram.edit.parts.Relation_ViewEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modelouno.modeluno.Service) {
				continue;
			}
			Modelouno.modeluno.Service container = (Modelouno.modeluno.Service) link
					.eContainer();
			result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002,
					Modelouno.modeluno.diagram.edit.parts.Relation_ViewEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_Class_4003(
			Modelouno.modeluno.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getRelation_Class_GoClass()
					|| false == setting.getEObject() instanceof Modelouno.modeluno.Relation_Class) {
				continue;
			}
			Modelouno.modeluno.Relation_Class link = (Modelouno.modeluno.Relation_Class) setting
					.getEObject();
			if (Modelouno.modeluno.diagram.edit.parts.Relation_ClassEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modelouno.modeluno.Class) {
				continue;
			}
			Modelouno.modeluno.Class container = (Modelouno.modeluno.Class) link
					.eContainer();
			result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Class_4003,
					Modelouno.modeluno.diagram.edit.parts.Relation_ClassEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_Service_4004(
			Modelouno.modeluno.Service target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getRelation_Service_GoService()
					|| false == setting.getEObject() instanceof Modelouno.modeluno.Relation_Service) {
				continue;
			}
			Modelouno.modeluno.Relation_Service link = (Modelouno.modeluno.Relation_Service) setting
					.getEObject();
			if (Modelouno.modeluno.diagram.edit.parts.Relation_ServiceEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modelouno.modeluno.Class) {
				continue;
			}
			Modelouno.modeluno.Class container = (Modelouno.modeluno.Class) link
					.eContainer();
			result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004,
					Modelouno.modeluno.diagram.edit.parts.Relation_ServiceEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_PresetationUnit_4005(
			Modelouno.modeluno.Views target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modelouno.modeluno.ModelunoPackage.eINSTANCE
					.getPresetationUnit_PUgoToViews()
					|| false == setting.getEObject() instanceof Modelouno.modeluno.PresetationUnit) {
				continue;
			}
			Modelouno.modeluno.PresetationUnit link = (Modelouno.modeluno.PresetationUnit) setting
					.getEObject();
			if (Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID != Modelouno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modelouno.modeluno.Attribute) {
				continue;
			}
			Modelouno.modeluno.Attribute container = (Modelouno.modeluno.Attribute) link
					.eContainer();
			result.add(new Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modelouno.modeluno.diagram.providers.ModelunoElementTypes.PresetationUnit_4005,
					Modelouno.modeluno.diagram.edit.parts.PresetationUnitEditPart.VISUAL_ID));

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
		public List<Modelouno.modeluno.diagram.part.ModelunoNodeDescriptor> getSemanticChildren(
				View view) {
			return ModelunoDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedLinks(
				View view) {
			return ModelunoDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingLinks(
				View view) {
			return ModelunoDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modelouno.modeluno.diagram.part.ModelunoLinkDescriptor> getOutgoingLinks(
				View view) {
			return ModelunoDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
