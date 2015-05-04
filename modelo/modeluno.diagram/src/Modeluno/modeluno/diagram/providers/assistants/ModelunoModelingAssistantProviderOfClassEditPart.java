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
public class ModelunoModelingAssistantProviderOfClassEditPart extends
		Modeluno.modeluno.diagram.providers.ModelunoModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Modeluno.modeluno.diagram.edit.parts.ClassEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Modeluno.modeluno.diagram.edit.parts.ClassEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Constraints_Relation_4007);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4008);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Relation_4009);
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
				(Modeluno.modeluno.diagram.edit.parts.ClassEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Modeluno.modeluno.diagram.edit.parts.ClassEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.ConstraintsEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Constraints_Relation_4007);
		}
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.ClassEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4008);
		}
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Relation_4009);
		}
		if (targetEditPart instanceof Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Relation_4009);
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
				(Modeluno.modeluno.diagram.edit.parts.ClassEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Modeluno.modeluno.diagram.edit.parts.ClassEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Constraints_Relation_4007) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Constraints_2009);
		} else if (relationshipType == Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4008) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2007);
		} else if (relationshipType == Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Relation_4009) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2008);
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2010);
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
		return doGetRelTypesOnTarget((Modeluno.modeluno.diagram.edit.parts.ClassEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Modeluno.modeluno.diagram.edit.parts.ClassEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4008);
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
				(Modeluno.modeluno.diagram.edit.parts.ClassEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Modeluno.modeluno.diagram.edit.parts.ClassEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4008) {
			types.add(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2007);
		}
		return types;
	}

}
