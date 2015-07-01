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
public class MetaWebDesignModelingAssistantProviderOfClassEditPart
		extends
		Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4001);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002);
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
				(Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.ConstraintEditPart) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4001);
		}
		if (targetEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002);
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
				(Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationContraint_4001) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_2002);
		} else if (relationshipType == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2011);
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
		return doGetRelTypesOnTarget((Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4003);
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002);
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
				(Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			Metawebdesign.metawebdesign.diagram.edit.parts.ClassEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4003) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Form_2005);
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Page_2003);
		} else if (relationshipType == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationClass_4002) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2011);
		}
		return types;
	}

}
