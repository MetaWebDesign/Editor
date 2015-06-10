package Modeldos.modeldos.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeldosModelingAssistantProviderOfFormEditPart extends
		Modeldos.modeldos.diagram.providers.ModeldosModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Modeldos.modeldos.diagram.edit.parts.FormEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Modeldos.modeldos.diagram.edit.parts.FormEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.RelationClass_4001);
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
				(Modeldos.modeldos.diagram.edit.parts.FormEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Modeldos.modeldos.diagram.edit.parts.FormEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Modeldos.modeldos.diagram.edit.parts.ClassEditPart) {
			types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.RelationClass_4001);
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
				(Modeldos.modeldos.diagram.edit.parts.FormEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Modeldos.modeldos.diagram.edit.parts.FormEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modeldos.modeldos.diagram.providers.ModeldosElementTypes.RelationClass_4001) {
			types.add(Modeldos.modeldos.diagram.providers.ModeldosElementTypes.Class_2006);
		}
		return types;
	}

}
