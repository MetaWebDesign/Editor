package Metawebdesign.metawebdesign.diagram.providers.assistants;

/**
 * @generated
 */
public class MetaWebDesignModelingAssistantProviderOfPageEditPart
		extends
		Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignModelingAssistantProvider {

<<<<<<< HEAD
=======
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
		types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001);
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
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001);
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
		if (relationshipType == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.RelationView_4001) {
			types.add(Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Class_2004);
		}
		return types;
	}

>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98
}
