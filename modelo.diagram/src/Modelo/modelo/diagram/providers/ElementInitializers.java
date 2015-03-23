package Modelo.modelo.diagram.providers;

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
		ElementInitializers cached = Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			Modelo.modelo.diagram.part.ModeloDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
