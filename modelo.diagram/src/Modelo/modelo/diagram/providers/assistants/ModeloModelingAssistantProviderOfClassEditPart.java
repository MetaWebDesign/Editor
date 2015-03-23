package Modelo.modelo.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeloModelingAssistantProviderOfClassEditPart extends
		Modelo.modelo.diagram.providers.ModeloModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Modelo.modelo.diagram.edit.parts.ClassEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Modelo.modelo.diagram.edit.parts.ClassEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modelo.modelo.diagram.providers.ModeloElementTypes.Relation_4001);
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
				(Modelo.modelo.diagram.edit.parts.ClassEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Modelo.modelo.diagram.edit.parts.ClassEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Modelo.modelo.diagram.edit.parts.ClassEditPart) {
			types.add(Modelo.modelo.diagram.providers.ModeloElementTypes.Relation_4001);
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
				(Modelo.modelo.diagram.edit.parts.ClassEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Modelo.modelo.diagram.edit.parts.ClassEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modelo.modelo.diagram.providers.ModeloElementTypes.Relation_4001) {
			types.add(Modelo.modelo.diagram.providers.ModeloElementTypes.Class_2001);
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
		return doGetRelTypesOnTarget((Modelo.modelo.diagram.edit.parts.ClassEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Modelo.modelo.diagram.edit.parts.ClassEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modelo.modelo.diagram.providers.ModeloElementTypes.Relation_4001);
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
				(Modelo.modelo.diagram.edit.parts.ClassEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Modelo.modelo.diagram.edit.parts.ClassEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modelo.modelo.diagram.providers.ModeloElementTypes.Relation_4001) {
			types.add(Modelo.modelo.diagram.providers.ModeloElementTypes.Class_2001);
		}
		return types;
	}

}
