package Modelouno.modeluno.diagram.providers;

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
		ElementInitializers cached = Modelouno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			Modelouno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
