package Modeluno.modeluno.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModelunoModelingAssistantProviderOfCreateEditPart extends
		Modeluno.modeluno.diagram.providers.ModelunoModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Modeluno.modeluno.diagram.edit.parts.CreateEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Modeluno.modeluno.diagram.edit.parts.CreateEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007);
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
				(Modeluno.modeluno.diagram.edit.parts.CreateEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Modeluno.modeluno.diagram.edit.parts.CreateEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007);
		}
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007);
		}
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007);
		}
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.PageEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007);
		}
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007);
		}
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007);
		}
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007);
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
				(Modeluno.modeluno.diagram.edit.parts.CreateEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Modeluno.modeluno.diagram.edit.parts.CreateEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAdmin_2009);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewIndex_2014);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewInput_2007);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Page_2004);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewAttribute_2011);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateAttribute_2001);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ViewUpdateObject_2008);
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
		return doGetRelTypesOnTarget((Modeluno.modeluno.diagram.edit.parts.CreateEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Modeluno.modeluno.diagram.edit.parts.CreateEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationService_4001);
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
				(Modeluno.modeluno.diagram.edit.parts.CreateEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Modeluno.modeluno.diagram.edit.parts.CreateEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationService_4001) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2010);
		}
		return types;
	}

}
