package modelo.diagram.providers;

import modelo.diagram.part.ModeloDiagramEditorPlugin;

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
		ElementInitializers cached = ModeloDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ModeloDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
