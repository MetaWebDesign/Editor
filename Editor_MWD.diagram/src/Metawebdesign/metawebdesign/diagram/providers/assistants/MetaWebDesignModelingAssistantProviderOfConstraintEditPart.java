package Metawebdesign.metawebdesign.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MetaWebDesignModelingAssistantProviderOfConstraintEditPart
		extends
		Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4002);
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
				(Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4002) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2002);
		}
		return types;
	}

}
