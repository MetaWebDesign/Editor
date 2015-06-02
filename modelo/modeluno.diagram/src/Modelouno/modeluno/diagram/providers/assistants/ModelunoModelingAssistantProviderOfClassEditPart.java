package Modelouno.modeluno.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModelunoModelingAssistantProviderOfClassEditPart extends
		Modelouno.modeluno.diagram.providers.ModelunoModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Modelouno.modeluno.diagram.edit.parts.ClassEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Modelouno.modeluno.diagram.edit.parts.ClassEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001);
		types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Class_4003);
		types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(Modelouno.modeluno.diagram.edit.parts.ClassEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Modelouno.modeluno.diagram.edit.parts.ClassEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.ClassEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Class_4003);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.CreateEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.AdminEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.DeleteEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.IndexEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.ViewEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.UpdateAttributeEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(Modelouno.modeluno.diagram.edit.parts.ClassEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Modelouno.modeluno.diagram.edit.parts.ClassEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Attribute_4001) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2015);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2017);
		} else if (relationshipType == Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Class_4003) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Class_2005);
		} else if (relationshipType == Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Create_2001);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2004);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2006);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2008);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Index_2012);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.View_2013);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateAttribute_2014);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Modelouno.modeluno.diagram.edit.parts.ClassEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Modelouno.modeluno.diagram.edit.parts.ClassEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Class_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(Modelouno.modeluno.diagram.edit.parts.ClassEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Modelouno.modeluno.diagram.edit.parts.ClassEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Class_4003) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Class_2005);
		}
		return types;
	}

}
