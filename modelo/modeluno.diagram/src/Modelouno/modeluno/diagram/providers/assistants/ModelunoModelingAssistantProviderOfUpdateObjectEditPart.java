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
public class ModelunoModelingAssistantProviderOfUpdateObjectEditPart extends
		Modelouno.modeluno.diagram.providers.ModelunoModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002);
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
				(Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.ViewIndexEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.PageEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.ViewAdminEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.ViewAttributeEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002);
		}
		if (targetEditPart instanceof Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002);
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
				(Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewIndex_2002);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateObject_2003);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Page_2007);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewAdmin_2009);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateAttribute_2010);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewAttribute_2011);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.ViewInput_2016);
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
		return doGetRelTypesOnTarget((Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004);
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
				(Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Modelouno.modeluno.diagram.edit.parts.UpdateObjectEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_Service_4004) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Class_2005);
		}
		return types;
	}

}
