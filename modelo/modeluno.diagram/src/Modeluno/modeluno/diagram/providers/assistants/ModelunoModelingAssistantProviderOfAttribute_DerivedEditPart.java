package Modeluno.modeluno.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModelunoModelingAssistantProviderOfAttribute_DerivedEditPart
		extends
		Modeluno.modeluno.diagram.providers.ModelunoModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationAttribute_4003);
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
				(Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modeluno.modeluno.diagram.providers.ModelunoElementTypes.RelationAttribute_4003) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2010);
		}
		return types;
	}

}
