package Metawebdesign.metawebdesign.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MetaWebDesignModelingAssistantProviderOfPageEditPart
		extends
		Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4002);
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
				(Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4002);
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
				(Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Metawebdesign.metawebdesign.diagram.edit.parts.PageEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4002) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2007);
		}
		return types;
	}

}
