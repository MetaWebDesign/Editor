package Modeluno.modeluno.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModelunoModelingAssistantProviderOfViewUpdateAttributeEditPart
		extends
		Modeluno.modeluno.diagram.providers.ModelunoModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007);
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
				(Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationView_4007) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2005);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.ListView_2012);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2016);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.UpdateAttribute_2018);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.View_2003);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Create_2006);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2017);
		}
		return types;
	}

}
