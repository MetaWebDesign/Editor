package Metawebdesign.metawebdesign.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			Metawebdesign.metawebdesign.diagram.part.MetaWebDesignDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
