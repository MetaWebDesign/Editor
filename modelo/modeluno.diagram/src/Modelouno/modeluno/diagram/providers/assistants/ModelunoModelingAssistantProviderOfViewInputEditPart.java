package Modelouno.modeluno.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModelunoModelingAssistantProviderOfViewInputEditPart extends
		Modelouno.modeluno.diagram.providers.ModelunoModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002);
		types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.PresetationUnit_4005);
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
				(Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Modelouno.modeluno.diagram.edit.parts.ViewInputEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Relation_View_4002) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Create_2001);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Admin_2004);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateObject_2006);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Delete_2008);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Index_2012);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.View_2013);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.UpdateAttribute_2014);
		} else if (relationshipType == Modelouno.modeluno.diagram.providers.ModelunoElementTypes.PresetationUnit_4005) {
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2015);
			types.add(Modelouno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2017);
		}
		return types;
	}

}
